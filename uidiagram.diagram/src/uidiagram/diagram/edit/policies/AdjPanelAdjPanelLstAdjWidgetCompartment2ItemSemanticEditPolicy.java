/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton2CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjDateTimePicker2CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjListView2CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjPictureBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjRadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjPanelAdjPanelLstAdjWidgetCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjPanelAdjPanelLstAdjWidgetCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjPanel_3029);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjLabel_3016 == req.getElementType()) {
			return getGEFWrapper(new AdjLabel2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckBox_3017 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjButton_3018 == req.getElementType()) {
			return getGEFWrapper(new AdjButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListBox_3019 == req.getElementType()) {
			return getGEFWrapper(new AdjListBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDateTimePicker_3101 == req.getElementType()) {
			return getGEFWrapper(new AdjDateTimePicker2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTextBox_3021 == req.getElementType()) {
			return getGEFWrapper(new AdjTextBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckedListBox_3022 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckedListBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjLinkLabel_3023 == req.getElementType()) {
			return getGEFWrapper(new AdjLinkLabel2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRichTextBox_3024 == req.getElementType()) {
			return getGEFWrapper(new AdjRichTextBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjComboBox_3088 == req.getElementType()) {
			return getGEFWrapper(new AdjComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRadioButton_3102 == req.getElementType()) {
			return getGEFWrapper(new AdjRadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPictureBox_3107 == req.getElementType()) {
			return getGEFWrapper(new AdjPictureBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListView_3094 == req.getElementType()) {
			return getGEFWrapper(new AdjListView2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3029 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3030 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBoxCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
