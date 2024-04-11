/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton4CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjDataGridView4CreateCommand;
import uidiagram.diagram.edit.commands.AdjDatepicker4CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel4CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel4CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjMenuStrip4CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel4CreateCommand;
import uidiagram.diagram.edit.commands.AdjProgressBar4CreateCommand;
import uidiagram.diagram.edit.commands.AdjPropertyGrid4CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox4CreateCommand;
import uidiagram.diagram.edit.commands.AdjToolStrip3CreateCommand;
import uidiagram.diagram.edit.commands.AdjTreeView4CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjMenuStrip_3080);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjLabel_3046 == req.getElementType()) {
			return getGEFWrapper(new AdjLabel4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckBox_3047 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjButton_3048 == req.getElementType()) {
			return getGEFWrapper(new AdjButton4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListBox_3049 == req.getElementType()) {
			return getGEFWrapper(new AdjListBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDatepicker_3050 == req.getElementType()) {
			return getGEFWrapper(new AdjDatepicker4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTextBox_3051 == req.getElementType()) {
			return getGEFWrapper(new AdjTextBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckedListBox_3052 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckedListBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjLinkLabel_3053 == req.getElementType()) {
			return getGEFWrapper(new AdjLinkLabel4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRichTextBox_3054 == req.getElementType()) {
			return getGEFWrapper(new AdjRichTextBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTreeView_3055 == req.getElementType()) {
			return getGEFWrapper(new AdjTreeView4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPropertyGrid_3056 == req.getElementType()) {
			return getGEFWrapper(new AdjPropertyGrid4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjProgressBar_3057 == req.getElementType()) {
			return getGEFWrapper(new AdjProgressBar4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDataGridView_3058 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridView4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3059 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3078 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjMenuStrip_3081 == req.getElementType()) {
			return getGEFWrapper(new AdjMenuStrip4CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjToolStrip_3082 == req.getElementType()) {
			return getGEFWrapper(new AdjToolStrip3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
