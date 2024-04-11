/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButtonCreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjDataGridViewCreateCommand;
import uidiagram.diagram.edit.commands.AdjDatepickerCreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabelCreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabelCreateCommand;
import uidiagram.diagram.edit.commands.AdjListBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjMenuStrip5CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanelCreateCommand;
import uidiagram.diagram.edit.commands.AdjProgressBarCreateCommand;
import uidiagram.diagram.edit.commands.AdjPropertyGridCreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjToolStrip5CreateCommand;
import uidiagram.diagram.edit.commands.AdjTreeViewCreateCommand;
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
		if (UidiagramElementTypes.AdjDatepicker_3005 == req.getElementType()) {
			return getGEFWrapper(new AdjDatepickerCreateCommand(req));
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
		if (UidiagramElementTypes.AdjTreeView_3010 == req.getElementType()) {
			return getGEFWrapper(new AdjTreeViewCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPropertyGrid_3011 == req.getElementType()) {
			return getGEFWrapper(new AdjPropertyGridCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjProgressBar_3012 == req.getElementType()) {
			return getGEFWrapper(new AdjProgressBarCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDataGridView_3013 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridViewCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3015 == req.getElementType()) {
			return getGEFWrapper(new AdjPanelCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3084 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjMenuStrip_3085 == req.getElementType()) {
			return getGEFWrapper(new AdjMenuStrip5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjToolStrip_3086 == req.getElementType()) {
			return getGEFWrapper(new AdjToolStrip5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
