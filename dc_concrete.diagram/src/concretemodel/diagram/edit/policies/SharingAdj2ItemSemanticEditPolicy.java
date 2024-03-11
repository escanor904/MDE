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
public class SharingAdj2ItemSemanticEditPolicy extends ConcretemodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SharingAdj2ItemSemanticEditPolicy() {
		super(ConcretemodelElementTypes.SharingAdj_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
