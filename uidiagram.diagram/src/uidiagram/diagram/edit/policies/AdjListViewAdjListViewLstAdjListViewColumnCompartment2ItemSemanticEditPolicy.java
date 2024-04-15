/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjListViewColumnCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjListViewAdjListViewLstAdjListViewColumnCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjListViewAdjListViewLstAdjListViewColumnCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjListView_3094);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjListViewColumn_3093 == req.getElementType()) {
			return getGEFWrapper(new AdjListViewColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
