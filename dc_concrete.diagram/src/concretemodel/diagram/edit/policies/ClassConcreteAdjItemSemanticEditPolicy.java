/*
* 
*/
package concretemodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import concretemodel.diagram.edit.commands.AssociationAdjCreateCommand;
import concretemodel.diagram.edit.commands.AssociationAdjReorientCommand;
import concretemodel.diagram.edit.commands.ContainmentSdjCreateCommand;
import concretemodel.diagram.edit.commands.ContainmentSdjReorientCommand;
import concretemodel.diagram.edit.commands.GeneralizationAdjCreateCommand;
import concretemodel.diagram.edit.commands.GeneralizationAdjReorientCommand;
import concretemodel.diagram.edit.commands.SharingAdjCreateCommand;
import concretemodel.diagram.edit.commands.SharingAdjReorientCommand;
import concretemodel.diagram.edit.parts.AssociationAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.SharingAdjEditPart;
import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;
import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ClassConcreteAdjItemSemanticEditPolicy extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassConcreteAdjItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.ClassConcreteAdj_2002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ConcretemodelVisualIDRegistry.getVisualID(incomingLink) == ContainmentSdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(incomingLink) == SharingAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(incomingLink) == AssociationAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(incomingLink) == GeneralizationAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ConcretemodelVisualIDRegistry.getVisualID(outgoingLink) == ContainmentSdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(outgoingLink) == SharingAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(outgoingLink) == AssociationAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretemodelVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationAdjEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ConcretemodelVisualIDRegistry.getVisualID(node)) {
			case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcretemodelVisualIDRegistry.getVisualID(cnode)) {
					case AttributeConcreteAdjEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcretemodelVisualIDRegistry.getVisualID(cnode)) {
					case MethodConcreteAdjEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcretemodelElementTypes.ContainmentSdj_4001 == req.getElementType()) {
			return getGEFWrapper(new ContainmentSdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.SharingAdj_4002 == req.getElementType()) {
			return getGEFWrapper(new SharingAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.AssociationAdj_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.GeneralizationAdj_4004 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcretemodelElementTypes.ContainmentSdj_4001 == req.getElementType()) {
			return getGEFWrapper(new ContainmentSdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.SharingAdj_4002 == req.getElementType()) {
			return getGEFWrapper(new SharingAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.AssociationAdj_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretemodelElementTypes.GeneralizationAdj_4004 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationAdjCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ContainmentSdjEditPart.VISUAL_ID:
			return getGEFWrapper(new ContainmentSdjReorientCommand(req));
		case SharingAdjEditPart.VISUAL_ID:
			return getGEFWrapper(new SharingAdjReorientCommand(req));
		case AssociationAdjEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationAdjReorientCommand(req));
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationAdjReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
