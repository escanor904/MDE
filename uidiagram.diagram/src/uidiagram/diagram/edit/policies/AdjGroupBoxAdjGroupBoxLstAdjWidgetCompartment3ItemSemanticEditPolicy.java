/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton3CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjComboBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjDateTimePicker3CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjListView3CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel3CreateCommand;
import uidiagram.diagram.edit.commands.AdjPictureBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjRadioButton3CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox3CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox3CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjGroupBox_3084);
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
		if (UidiagramElementTypes.AdjDateTimePicker_3104 == req.getElementType()) {
			return getGEFWrapper(new AdjDateTimePicker3CreateCommand(req));
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
		if (UidiagramElementTypes.AdjComboBox_3089 == req.getElementType()) {
			return getGEFWrapper(new AdjComboBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRadioButton_3105 == req.getElementType()) {
			return getGEFWrapper(new AdjRadioButton3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPictureBox_3108 == req.getElementType()) {
			return getGEFWrapper(new AdjPictureBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListView_3095 == req.getElementType()) {
			return getGEFWrapper(new AdjListView3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3044 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3076 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
