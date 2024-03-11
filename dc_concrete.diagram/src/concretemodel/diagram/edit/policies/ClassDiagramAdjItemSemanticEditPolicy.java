/*
* 
*/
package concretemodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import concretemodel.diagram.edit.commands.ClassConcreteAdjCreateCommand;
import concretemodel.diagram.edit.commands.PackageConcreteAdjCreateCommand;
import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ClassDiagramAdjItemSemanticEditPolicy extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassDiagramAdjItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.ClassDiagramAdj_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretemodelElementTypes.PackageConcreteAdj_2001 == req.getElementType()) {
			return getGEFWrapper(new PackageConcreteAdjCreateCommand(req));
		}
		if (ConcretemodelElementTypes.ClassConcreteAdj_2002 == req.getElementType()) {
			return getGEFWrapper(new ClassConcreteAdjCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
