/*
* 
*/
package concretemodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concretemodel.diagram.edit.commands.MethodConcreteAdjCreateCommand;
import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentItemSemanticEditPolicy
		extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.ClassConcreteAdj_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretemodelElementTypes.MethodConcreteAdj_3002 == req.getElementType()) {
			return getGEFWrapper(new MethodConcreteAdjCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
