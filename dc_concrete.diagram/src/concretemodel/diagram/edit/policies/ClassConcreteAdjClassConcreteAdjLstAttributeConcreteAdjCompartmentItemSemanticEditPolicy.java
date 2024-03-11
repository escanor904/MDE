/*
* 
*/
package concretemodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concretemodel.diagram.edit.commands.AttributeConcreteAdjCreateCommand;
import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentItemSemanticEditPolicy
		extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.ClassConcreteAdj_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretemodelElementTypes.AttributeConcreteAdj_3001 == req.getElementType()) {
			return getGEFWrapper(new AttributeConcreteAdjCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
