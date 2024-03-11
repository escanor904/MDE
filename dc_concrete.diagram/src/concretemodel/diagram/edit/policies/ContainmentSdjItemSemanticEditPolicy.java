/*
* 
*/
package concretemodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ContainmentSdjItemSemanticEditPolicy extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContainmentSdjItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.ContainmentSdj_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
