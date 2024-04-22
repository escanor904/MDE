/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButtonCreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjDateTimePickerCreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabelCreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabelCreateCommand;
import uidiagram.diagram.edit.commands.AdjListBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjListViewCreateCommand;
import uidiagram.diagram.edit.commands.AdjPanelCreateCommand;
import uidiagram.diagram.edit.commands.AdjPictureBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjRadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBoxCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class FormUIFormUILstAdjWidgetCompartmentItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FormUIFormUILstAdjWidgetCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.FormUI_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjLabel_3001 == req.getElementType()) {
			return getGEFWrapper(new AdjLabelCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckBox_3002 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjButton_3003 == req.getElementType()) {
			return getGEFWrapper(new AdjButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListBox_3004 == req.getElementType()) {
			return getGEFWrapper(new AdjListBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDateTimePicker_3098 == req.getElementType()) {
			return getGEFWrapper(new AdjDateTimePickerCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTextBox_3006 == req.getElementType()) {
			return getGEFWrapper(new AdjTextBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckedListBox_3007 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckedListBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjLinkLabel_3008 == req.getElementType()) {
			return getGEFWrapper(new AdjLinkLabelCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRichTextBox_3009 == req.getElementType()) {
			return getGEFWrapper(new AdjRichTextBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjComboBox_3087 == req.getElementType()) {
			return getGEFWrapper(new AdjComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRadioButton_3099 == req.getElementType()) {
			return getGEFWrapper(new AdjRadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPictureBox_3106 == req.getElementType()) {
			return getGEFWrapper(new AdjPictureBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListView_3092 == req.getElementType()) {
			return getGEFWrapper(new AdjListViewCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3015 == req.getElementType()) {
			return getGEFWrapper(new AdjPanelCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3084 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
