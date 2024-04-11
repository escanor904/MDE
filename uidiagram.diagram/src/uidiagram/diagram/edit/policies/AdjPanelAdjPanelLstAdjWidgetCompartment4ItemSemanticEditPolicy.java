/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton2CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjDataGridView2CreateCommand;
import uidiagram.diagram.edit.commands.AdjDatepicker2CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBoxCreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjMenuStripCreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel2CreateCommand;
import uidiagram.diagram.edit.commands.AdjProgressBar2CreateCommand;
import uidiagram.diagram.edit.commands.AdjPropertyGrid2CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjToolStripCreateCommand;
import uidiagram.diagram.edit.commands.AdjTreeView2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjPanelAdjPanelLstAdjWidgetCompartment4ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjPanelAdjPanelLstAdjWidgetCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjPanel_3059);
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
		if (UidiagramElementTypes.AdjDatepicker_3020 == req.getElementType()) {
			return getGEFWrapper(new AdjDatepicker2CreateCommand(req));
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
		if (UidiagramElementTypes.AdjTreeView_3025 == req.getElementType()) {
			return getGEFWrapper(new AdjTreeView2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPropertyGrid_3026 == req.getElementType()) {
			return getGEFWrapper(new AdjPropertyGrid2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjProgressBar_3027 == req.getElementType()) {
			return getGEFWrapper(new AdjProgressBar2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDataGridView_3028 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridView2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3029 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3030 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjMenuStrip_3045 == req.getElementType()) {
			return getGEFWrapper(new AdjMenuStripCreateCommand(req));
		}
		if (UidiagramElementTypes.AdjToolStrip_3060 == req.getElementType()) {
			return getGEFWrapper(new AdjToolStripCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
