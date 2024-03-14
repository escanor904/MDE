/*
 * 
 */
package concretemodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;

/**
 * @generated
 */
public class ConcretemodelEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {

			case ClassDiagramAdjEditPart.VISUAL_ID:
				return new ClassDiagramAdjEditPart(view);

			case PackageConcreteAdjEditPart.VISUAL_ID:
				return new PackageConcreteAdjEditPart(view);

			case PackageConcreteAdjNameEditPart.VISUAL_ID:
				return new PackageConcreteAdjNameEditPart(view);

			case ClassConcreteAdjEditPart.VISUAL_ID:
				return new ClassConcreteAdjEditPart(view);

			case ClassConcreteAdjNameEditPart.VISUAL_ID:
				return new ClassConcreteAdjNameEditPart(view);

			case AttributeConcreteAdjEditPart.VISUAL_ID:
				return new AttributeConcreteAdjEditPart(view);

			case AttributeConcreteAdjNameEditPart.VISUAL_ID:
				return new AttributeConcreteAdjNameEditPart(view);

			case MethodConcreteAdjEditPart.VISUAL_ID:
				return new MethodConcreteAdjEditPart(view);

			case MethodConcreteAdjMethodNameEditPart.VISUAL_ID:
				return new MethodConcreteAdjMethodNameEditPart(view);

			case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
				return new ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart(view);

			case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
				return new ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart(view);

			case ContainmentSdjEditPart.VISUAL_ID:
				return new ContainmentSdjEditPart(view);

			case ContainmentSdjRoleSourceEditPart.VISUAL_ID:
				return new ContainmentSdjRoleSourceEditPart(view);

			case ContainmentSdjMultiplicitySourceClassEditPart.VISUAL_ID:
				return new ContainmentSdjMultiplicitySourceClassEditPart(view);

			case ContainmentSdjRoleTargetEditPart.VISUAL_ID:
				return new ContainmentSdjRoleTargetEditPart(view);

			case SharingAdjEditPart.VISUAL_ID:
				return new SharingAdjEditPart(view);

			case SharingAdjRoleSourceEditPart.VISUAL_ID:
				return new SharingAdjRoleSourceEditPart(view);

			case SharingAdjMultiplicitySourceClassEditPart.VISUAL_ID:
				return new SharingAdjMultiplicitySourceClassEditPart(view);

			case SharingAdjRoleTargetEditPart.VISUAL_ID:
				return new SharingAdjRoleTargetEditPart(view);

			case SharingAdjMultiplicityTargetClassEditPart.VISUAL_ID:
				return new SharingAdjMultiplicityTargetClassEditPart(view);

			case AssociationAdjEditPart.VISUAL_ID:
				return new AssociationAdjEditPart(view);

			case AssociationAdjRoleSourceEditPart.VISUAL_ID:
				return new AssociationAdjRoleSourceEditPart(view);

			case AssociationAdjMultiplicitySourceClassEditPart.VISUAL_ID:
				return new AssociationAdjMultiplicitySourceClassEditPart(view);

			case AssociationAdjRoleTargetEditPart.VISUAL_ID:
				return new AssociationAdjRoleTargetEditPart(view);

			case AssociationAdjMultiplicityTargetClassEditPart.VISUAL_ID:
				return new AssociationAdjMultiplicityTargetClassEditPart(view);

			case GeneralizationAdjEditPart.VISUAL_ID:
				return new GeneralizationAdjEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
