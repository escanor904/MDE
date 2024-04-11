/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AdjButton5CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjCheckedListBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjDataGridView5CreateCommand;
import uidiagram.diagram.edit.commands.AdjDatepicker5CreateCommand;
import uidiagram.diagram.edit.commands.AdjGroupBox2CreateCommand;
import uidiagram.diagram.edit.commands.AdjLabel5CreateCommand;
import uidiagram.diagram.edit.commands.AdjLinkLabel5CreateCommand;
import uidiagram.diagram.edit.commands.AdjListBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjMenuStrip3CreateCommand;
import uidiagram.diagram.edit.commands.AdjPanel5CreateCommand;
import uidiagram.diagram.edit.commands.AdjProgressBar5CreateCommand;
import uidiagram.diagram.edit.commands.AdjPropertyGrid5CreateCommand;
import uidiagram.diagram.edit.commands.AdjRichTextBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjTextBox5CreateCommand;
import uidiagram.diagram.edit.commands.AdjToolStrip4CreateCommand;
import uidiagram.diagram.edit.commands.AdjTreeView5CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjToolStripAdjToolStripLstAdjWidgetCompartment4ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdjToolStripAdjToolStripLstAdjWidgetCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.AdjToolStrip_3083);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.AdjLabel_3061 == req.getElementType()) {
			return getGEFWrapper(new AdjLabel5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckBox_3062 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjButton_3063 == req.getElementType()) {
			return getGEFWrapper(new AdjButton5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjListBox_3064 == req.getElementType()) {
			return getGEFWrapper(new AdjListBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDatepicker_3065 == req.getElementType()) {
			return getGEFWrapper(new AdjDatepicker5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTextBox_3066 == req.getElementType()) {
			return getGEFWrapper(new AdjTextBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjCheckedListBox_3067 == req.getElementType()) {
			return getGEFWrapper(new AdjCheckedListBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjLinkLabel_3068 == req.getElementType()) {
			return getGEFWrapper(new AdjLinkLabel5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjRichTextBox_3069 == req.getElementType()) {
			return getGEFWrapper(new AdjRichTextBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjTreeView_3070 == req.getElementType()) {
			return getGEFWrapper(new AdjTreeView5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPropertyGrid_3071 == req.getElementType()) {
			return getGEFWrapper(new AdjPropertyGrid5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjProgressBar_3072 == req.getElementType()) {
			return getGEFWrapper(new AdjProgressBar5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjDataGridView_3073 == req.getElementType()) {
			return getGEFWrapper(new AdjDataGridView5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjPanel_3074 == req.getElementType()) {
			return getGEFWrapper(new AdjPanel5CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjGroupBox_3075 == req.getElementType()) {
			return getGEFWrapper(new AdjGroupBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjMenuStrip_3080 == req.getElementType()) {
			return getGEFWrapper(new AdjMenuStrip3CreateCommand(req));
		}
		if (UidiagramElementTypes.AdjToolStrip_3083 == req.getElementType()) {
			return getGEFWrapper(new AdjToolStrip4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
