/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjDataGridViewTextBoxColumnCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjDataGridView_3058);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjDataGridViewTextBoxColumn_3014 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridViewTextBoxColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
