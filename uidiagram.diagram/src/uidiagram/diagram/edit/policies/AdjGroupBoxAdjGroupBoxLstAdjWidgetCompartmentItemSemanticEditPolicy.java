/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton3CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjDataGridView3CreateCommand;
import uidiagram.diagram.edit.commands.AdjDatepicker3CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjMenuStrip2CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjProgressBar3CreateCommand;
import uidiagram.diagram.edit.commands.AdjPropertyGrid3CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjToolStrip2CreateCommand;
import uidiagram.diagram.edit.commands.AdjTreeView3CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjGroupBox_3030);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjLabel_3031 == req.getElementType()) {
			return getGEFWrapper(new AdjLabel3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckBox_3032 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjButton_3033 == req.getElementType()) {
			return getGEFWrapper(new AdjButton3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListBox_3034 == req.getElementType()) {
			return getGEFWrapper(new AdjListBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDatepicker_3035 == req.getElementType()) {
			return getGEFWrapper(new AdjDatepicker3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTextBox_3036 == req.getElementType()) {
			return getGEFWrapper(new AdjTextBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckedListBox_3037 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckedListBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjLinkLabel_3038 == req.getElementType()) {
			return getGEFWrapper(new AdjLinkLabel3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRichTextBox_3039 == req.getElementType()) {
			return getGEFWrapper(new AdjRichTextBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTreeView_3040 == req.getElementType()) {
			return getGEFWrapper(new AdjTreeView3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPropertyGrid_3041 == req.getElementType()) {
			return getGEFWrapper(new AdjPropertyGrid3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjProgressBar_3042 == req.getElementType()) {
			return getGEFWrapper(new AdjProgressBar3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDataGridView_3043 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridView3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3044 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3076 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjMenuStrip_3077 == req.getElementType()) {
			return getGEFWrapper(new AdjMenuStrip2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjToolStrip_3079 == req.getElementType()) {
			return getGEFWrapper(new AdjToolStrip2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
