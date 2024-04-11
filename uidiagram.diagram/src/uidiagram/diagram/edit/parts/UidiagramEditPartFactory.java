/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case UIDiagramEditPart.VISUAL_ID:
				return new UIDiagramEditPart(view);

			case FormUIEditPart.VISUAL_ID:
				return new FormUIEditPart(view);

			case FormUINameEditPart.VISUAL_ID:
				return new FormUINameEditPart(view);

			case AdjLabelEditPart.VISUAL_ID:
				return new AdjLabelEditPart(view);

			case AdjLabelNameEditPart.VISUAL_ID:
				return new AdjLabelNameEditPart(view);

			case AdjCheckBoxEditPart.VISUAL_ID:
				return new AdjCheckBoxEditPart(view);

			case AdjCheckBoxNameEditPart.VISUAL_ID:
				return new AdjCheckBoxNameEditPart(view);

			case AdjButtonEditPart.VISUAL_ID:
				return new AdjButtonEditPart(view);

			case AdjButtonNameEditPart.VISUAL_ID:
				return new AdjButtonNameEditPart(view);

			case AdjListBoxEditPart.VISUAL_ID:
				return new AdjListBoxEditPart(view);

			case AdjListBoxNameEditPart.VISUAL_ID:
				return new AdjListBoxNameEditPart(view);

			case AdjDatepickerEditPart.VISUAL_ID:
				return new AdjDatepickerEditPart(view);

			case AdjDatepickerNameEditPart.VISUAL_ID:
				return new AdjDatepickerNameEditPart(view);

			case AdjTextBoxEditPart.VISUAL_ID:
				return new AdjTextBoxEditPart(view);

			case AdjTextBoxNameEditPart.VISUAL_ID:
				return new AdjTextBoxNameEditPart(view);

			case AdjCheckedListBoxEditPart.VISUAL_ID:
				return new AdjCheckedListBoxEditPart(view);

			case AdjCheckedListBoxNameEditPart.VISUAL_ID:
				return new AdjCheckedListBoxNameEditPart(view);

			case AdjLinkLabelEditPart.VISUAL_ID:
				return new AdjLinkLabelEditPart(view);

			case AdjLinkLabelNameEditPart.VISUAL_ID:
				return new AdjLinkLabelNameEditPart(view);

			case AdjRichTextBoxEditPart.VISUAL_ID:
				return new AdjRichTextBoxEditPart(view);

			case AdjRichTextBoxNameEditPart.VISUAL_ID:
				return new AdjRichTextBoxNameEditPart(view);

			case AdjTreeViewEditPart.VISUAL_ID:
				return new AdjTreeViewEditPart(view);

			case AdjTreeViewNameEditPart.VISUAL_ID:
				return new AdjTreeViewNameEditPart(view);

			case AdjPropertyGridEditPart.VISUAL_ID:
				return new AdjPropertyGridEditPart(view);

			case AdjPropertyGridNameEditPart.VISUAL_ID:
				return new AdjPropertyGridNameEditPart(view);

			case AdjProgressBarEditPart.VISUAL_ID:
				return new AdjProgressBarEditPart(view);

			case AdjProgressBarNameEditPart.VISUAL_ID:
				return new AdjProgressBarNameEditPart(view);

			case AdjDataGridViewEditPart.VISUAL_ID:
				return new AdjDataGridViewEditPart(view);

			case AdjDataGridViewNameEditPart.VISUAL_ID:
				return new AdjDataGridViewNameEditPart(view);

			case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
				return new AdjDataGridViewTextBoxColumnEditPart(view);

			case AdjDataGridViewTextBoxColumnNameEditPart.VISUAL_ID:
				return new AdjDataGridViewTextBoxColumnNameEditPart(view);

			case AdjPanelEditPart.VISUAL_ID:
				return new AdjPanelEditPart(view);

			case AdjPanelNameEditPart.VISUAL_ID:
				return new AdjPanelNameEditPart(view);

			case AdjLabel2EditPart.VISUAL_ID:
				return new AdjLabel2EditPart(view);

			case AdjLabelName2EditPart.VISUAL_ID:
				return new AdjLabelName2EditPart(view);

			case AdjCheckBox2EditPart.VISUAL_ID:
				return new AdjCheckBox2EditPart(view);

			case AdjCheckBoxName2EditPart.VISUAL_ID:
				return new AdjCheckBoxName2EditPart(view);

			case AdjButton2EditPart.VISUAL_ID:
				return new AdjButton2EditPart(view);

			case AdjButtonName2EditPart.VISUAL_ID:
				return new AdjButtonName2EditPart(view);

			case AdjListBox2EditPart.VISUAL_ID:
				return new AdjListBox2EditPart(view);

			case AdjListBoxName2EditPart.VISUAL_ID:
				return new AdjListBoxName2EditPart(view);

			case AdjDatepicker2EditPart.VISUAL_ID:
				return new AdjDatepicker2EditPart(view);

			case AdjDatepickerName2EditPart.VISUAL_ID:
				return new AdjDatepickerName2EditPart(view);

			case AdjTextBox2EditPart.VISUAL_ID:
				return new AdjTextBox2EditPart(view);

			case AdjTextBoxName2EditPart.VISUAL_ID:
				return new AdjTextBoxName2EditPart(view);

			case AdjCheckedListBox2EditPart.VISUAL_ID:
				return new AdjCheckedListBox2EditPart(view);

			case AdjCheckedListBoxName2EditPart.VISUAL_ID:
				return new AdjCheckedListBoxName2EditPart(view);

			case AdjLinkLabel2EditPart.VISUAL_ID:
				return new AdjLinkLabel2EditPart(view);

			case AdjLinkLabelName2EditPart.VISUAL_ID:
				return new AdjLinkLabelName2EditPart(view);

			case AdjRichTextBox2EditPart.VISUAL_ID:
				return new AdjRichTextBox2EditPart(view);

			case AdjRichTextBoxName2EditPart.VISUAL_ID:
				return new AdjRichTextBoxName2EditPart(view);

			case AdjTreeView2EditPart.VISUAL_ID:
				return new AdjTreeView2EditPart(view);

			case AdjTreeViewName2EditPart.VISUAL_ID:
				return new AdjTreeViewName2EditPart(view);

			case AdjPropertyGrid2EditPart.VISUAL_ID:
				return new AdjPropertyGrid2EditPart(view);

			case AdjPropertyGridName2EditPart.VISUAL_ID:
				return new AdjPropertyGridName2EditPart(view);

			case AdjProgressBar2EditPart.VISUAL_ID:
				return new AdjProgressBar2EditPart(view);

			case AdjProgressBarName2EditPart.VISUAL_ID:
				return new AdjProgressBarName2EditPart(view);

			case AdjDataGridView2EditPart.VISUAL_ID:
				return new AdjDataGridView2EditPart(view);

			case AdjDataGridViewName2EditPart.VISUAL_ID:
				return new AdjDataGridViewName2EditPart(view);

			case AdjPanel2EditPart.VISUAL_ID:
				return new AdjPanel2EditPart(view);

			case AdjPanelName2EditPart.VISUAL_ID:
				return new AdjPanelName2EditPart(view);

			case AdjGroupBoxEditPart.VISUAL_ID:
				return new AdjGroupBoxEditPart(view);

			case AdjGroupBoxNameEditPart.VISUAL_ID:
				return new AdjGroupBoxNameEditPart(view);

			case AdjLabel3EditPart.VISUAL_ID:
				return new AdjLabel3EditPart(view);

			case AdjLabelName3EditPart.VISUAL_ID:
				return new AdjLabelName3EditPart(view);

			case AdjCheckBox3EditPart.VISUAL_ID:
				return new AdjCheckBox3EditPart(view);

			case AdjCheckBoxName3EditPart.VISUAL_ID:
				return new AdjCheckBoxName3EditPart(view);

			case AdjButton3EditPart.VISUAL_ID:
				return new AdjButton3EditPart(view);

			case AdjButtonName3EditPart.VISUAL_ID:
				return new AdjButtonName3EditPart(view);

			case AdjListBox3EditPart.VISUAL_ID:
				return new AdjListBox3EditPart(view);

			case AdjListBoxName3EditPart.VISUAL_ID:
				return new AdjListBoxName3EditPart(view);

			case AdjDatepicker3EditPart.VISUAL_ID:
				return new AdjDatepicker3EditPart(view);

			case AdjDatepickerName3EditPart.VISUAL_ID:
				return new AdjDatepickerName3EditPart(view);

			case AdjTextBox3EditPart.VISUAL_ID:
				return new AdjTextBox3EditPart(view);

			case AdjTextBoxName3EditPart.VISUAL_ID:
				return new AdjTextBoxName3EditPart(view);

			case AdjCheckedListBox3EditPart.VISUAL_ID:
				return new AdjCheckedListBox3EditPart(view);

			case AdjCheckedListBoxName3EditPart.VISUAL_ID:
				return new AdjCheckedListBoxName3EditPart(view);

			case AdjLinkLabel3EditPart.VISUAL_ID:
				return new AdjLinkLabel3EditPart(view);

			case AdjLinkLabelName3EditPart.VISUAL_ID:
				return new AdjLinkLabelName3EditPart(view);

			case AdjRichTextBox3EditPart.VISUAL_ID:
				return new AdjRichTextBox3EditPart(view);

			case AdjRichTextBoxName3EditPart.VISUAL_ID:
				return new AdjRichTextBoxName3EditPart(view);

			case AdjTreeView3EditPart.VISUAL_ID:
				return new AdjTreeView3EditPart(view);

			case AdjTreeViewName3EditPart.VISUAL_ID:
				return new AdjTreeViewName3EditPart(view);

			case AdjPropertyGrid3EditPart.VISUAL_ID:
				return new AdjPropertyGrid3EditPart(view);

			case AdjPropertyGridName3EditPart.VISUAL_ID:
				return new AdjPropertyGridName3EditPart(view);

			case AdjProgressBar3EditPart.VISUAL_ID:
				return new AdjProgressBar3EditPart(view);

			case AdjProgressBarName3EditPart.VISUAL_ID:
				return new AdjProgressBarName3EditPart(view);

			case AdjDataGridView3EditPart.VISUAL_ID:
				return new AdjDataGridView3EditPart(view);

			case AdjDataGridViewName3EditPart.VISUAL_ID:
				return new AdjDataGridViewName3EditPart(view);

			case AdjPanel3EditPart.VISUAL_ID:
				return new AdjPanel3EditPart(view);

			case AdjPanelName3EditPart.VISUAL_ID:
				return new AdjPanelName3EditPart(view);

			case AdjMenuStripEditPart.VISUAL_ID:
				return new AdjMenuStripEditPart(view);

			case AdjMenuStripNameEditPart.VISUAL_ID:
				return new AdjMenuStripNameEditPart(view);

			case AdjLabel4EditPart.VISUAL_ID:
				return new AdjLabel4EditPart(view);

			case AdjLabelName4EditPart.VISUAL_ID:
				return new AdjLabelName4EditPart(view);

			case AdjCheckBox4EditPart.VISUAL_ID:
				return new AdjCheckBox4EditPart(view);

			case AdjCheckBoxName4EditPart.VISUAL_ID:
				return new AdjCheckBoxName4EditPart(view);

			case AdjButton4EditPart.VISUAL_ID:
				return new AdjButton4EditPart(view);

			case AdjButtonName4EditPart.VISUAL_ID:
				return new AdjButtonName4EditPart(view);

			case AdjListBox4EditPart.VISUAL_ID:
				return new AdjListBox4EditPart(view);

			case AdjListBoxName4EditPart.VISUAL_ID:
				return new AdjListBoxName4EditPart(view);

			case AdjDatepicker4EditPart.VISUAL_ID:
				return new AdjDatepicker4EditPart(view);

			case AdjDatepickerName4EditPart.VISUAL_ID:
				return new AdjDatepickerName4EditPart(view);

			case AdjTextBox4EditPart.VISUAL_ID:
				return new AdjTextBox4EditPart(view);

			case AdjTextBoxName4EditPart.VISUAL_ID:
				return new AdjTextBoxName4EditPart(view);

			case AdjCheckedListBox4EditPart.VISUAL_ID:
				return new AdjCheckedListBox4EditPart(view);

			case AdjCheckedListBoxName4EditPart.VISUAL_ID:
				return new AdjCheckedListBoxName4EditPart(view);

			case AdjLinkLabel4EditPart.VISUAL_ID:
				return new AdjLinkLabel4EditPart(view);

			case AdjLinkLabelName4EditPart.VISUAL_ID:
				return new AdjLinkLabelName4EditPart(view);

			case AdjRichTextBox4EditPart.VISUAL_ID:
				return new AdjRichTextBox4EditPart(view);

			case AdjRichTextBoxName4EditPart.VISUAL_ID:
				return new AdjRichTextBoxName4EditPart(view);

			case AdjTreeView4EditPart.VISUAL_ID:
				return new AdjTreeView4EditPart(view);

			case AdjTreeViewName4EditPart.VISUAL_ID:
				return new AdjTreeViewName4EditPart(view);

			case AdjPropertyGrid4EditPart.VISUAL_ID:
				return new AdjPropertyGrid4EditPart(view);

			case AdjPropertyGridName4EditPart.VISUAL_ID:
				return new AdjPropertyGridName4EditPart(view);

			case AdjProgressBar4EditPart.VISUAL_ID:
				return new AdjProgressBar4EditPart(view);

			case AdjProgressBarName4EditPart.VISUAL_ID:
				return new AdjProgressBarName4EditPart(view);

			case AdjDataGridView4EditPart.VISUAL_ID:
				return new AdjDataGridView4EditPart(view);

			case AdjDataGridViewName4EditPart.VISUAL_ID:
				return new AdjDataGridViewName4EditPart(view);

			case AdjPanel4EditPart.VISUAL_ID:
				return new AdjPanel4EditPart(view);

			case AdjPanelName4EditPart.VISUAL_ID:
				return new AdjPanelName4EditPart(view);

			case AdjToolStripEditPart.VISUAL_ID:
				return new AdjToolStripEditPart(view);

			case AdjToolStripNameEditPart.VISUAL_ID:
				return new AdjToolStripNameEditPart(view);

			case AdjLabel5EditPart.VISUAL_ID:
				return new AdjLabel5EditPart(view);

			case AdjLabelName5EditPart.VISUAL_ID:
				return new AdjLabelName5EditPart(view);

			case AdjCheckBox5EditPart.VISUAL_ID:
				return new AdjCheckBox5EditPart(view);

			case AdjCheckBoxName5EditPart.VISUAL_ID:
				return new AdjCheckBoxName5EditPart(view);

			case AdjButton5EditPart.VISUAL_ID:
				return new AdjButton5EditPart(view);

			case AdjButtonName5EditPart.VISUAL_ID:
				return new AdjButtonName5EditPart(view);

			case AdjListBox5EditPart.VISUAL_ID:
				return new AdjListBox5EditPart(view);

			case AdjListBoxName5EditPart.VISUAL_ID:
				return new AdjListBoxName5EditPart(view);

			case AdjDatepicker5EditPart.VISUAL_ID:
				return new AdjDatepicker5EditPart(view);

			case AdjDatepickerName5EditPart.VISUAL_ID:
				return new AdjDatepickerName5EditPart(view);

			case AdjTextBox5EditPart.VISUAL_ID:
				return new AdjTextBox5EditPart(view);

			case AdjTextBoxName5EditPart.VISUAL_ID:
				return new AdjTextBoxName5EditPart(view);

			case AdjCheckedListBox5EditPart.VISUAL_ID:
				return new AdjCheckedListBox5EditPart(view);

			case AdjCheckedListBoxName5EditPart.VISUAL_ID:
				return new AdjCheckedListBoxName5EditPart(view);

			case AdjLinkLabel5EditPart.VISUAL_ID:
				return new AdjLinkLabel5EditPart(view);

			case AdjLinkLabelName5EditPart.VISUAL_ID:
				return new AdjLinkLabelName5EditPart(view);

			case AdjRichTextBox5EditPart.VISUAL_ID:
				return new AdjRichTextBox5EditPart(view);

			case AdjRichTextBoxName5EditPart.VISUAL_ID:
				return new AdjRichTextBoxName5EditPart(view);

			case AdjTreeView5EditPart.VISUAL_ID:
				return new AdjTreeView5EditPart(view);

			case AdjTreeViewName5EditPart.VISUAL_ID:
				return new AdjTreeViewName5EditPart(view);

			case AdjPropertyGrid5EditPart.VISUAL_ID:
				return new AdjPropertyGrid5EditPart(view);

			case AdjPropertyGridName5EditPart.VISUAL_ID:
				return new AdjPropertyGridName5EditPart(view);

			case AdjProgressBar5EditPart.VISUAL_ID:
				return new AdjProgressBar5EditPart(view);

			case AdjProgressBarName5EditPart.VISUAL_ID:
				return new AdjProgressBarName5EditPart(view);

			case AdjDataGridView5EditPart.VISUAL_ID:
				return new AdjDataGridView5EditPart(view);

			case AdjDataGridViewName5EditPart.VISUAL_ID:
				return new AdjDataGridViewName5EditPart(view);

			case AdjPanel5EditPart.VISUAL_ID:
				return new AdjPanel5EditPart(view);

			case AdjPanelName5EditPart.VISUAL_ID:
				return new AdjPanelName5EditPart(view);

			case AdjGroupBox2EditPart.VISUAL_ID:
				return new AdjGroupBox2EditPart(view);

			case AdjGroupBoxName2EditPart.VISUAL_ID:
				return new AdjGroupBoxName2EditPart(view);

			case AdjGroupBox3EditPart.VISUAL_ID:
				return new AdjGroupBox3EditPart(view);

			case AdjGroupBoxName3EditPart.VISUAL_ID:
				return new AdjGroupBoxName3EditPart(view);

			case AdjMenuStrip2EditPart.VISUAL_ID:
				return new AdjMenuStrip2EditPart(view);

			case AdjMenuStripName2EditPart.VISUAL_ID:
				return new AdjMenuStripName2EditPart(view);

			case AdjGroupBox4EditPart.VISUAL_ID:
				return new AdjGroupBox4EditPart(view);

			case AdjGroupBoxName4EditPart.VISUAL_ID:
				return new AdjGroupBoxName4EditPart(view);

			case AdjToolStrip2EditPart.VISUAL_ID:
				return new AdjToolStrip2EditPart(view);

			case AdjToolStripName2EditPart.VISUAL_ID:
				return new AdjToolStripName2EditPart(view);

			case AdjMenuStrip3EditPart.VISUAL_ID:
				return new AdjMenuStrip3EditPart(view);

			case AdjMenuStripName3EditPart.VISUAL_ID:
				return new AdjMenuStripName3EditPart(view);

			case AdjMenuStrip4EditPart.VISUAL_ID:
				return new AdjMenuStrip4EditPart(view);

			case AdjMenuStripName4EditPart.VISUAL_ID:
				return new AdjMenuStripName4EditPart(view);

			case AdjToolStrip3EditPart.VISUAL_ID:
				return new AdjToolStrip3EditPart(view);

			case AdjToolStripName3EditPart.VISUAL_ID:
				return new AdjToolStripName3EditPart(view);

			case AdjToolStrip4EditPart.VISUAL_ID:
				return new AdjToolStrip4EditPart(view);

			case AdjToolStripName4EditPart.VISUAL_ID:
				return new AdjToolStripName4EditPart(view);

			case AdjGroupBox5EditPart.VISUAL_ID:
				return new AdjGroupBox5EditPart(view);

			case AdjGroupBoxName5EditPart.VISUAL_ID:
				return new AdjGroupBoxName5EditPart(view);

			case AdjMenuStrip5EditPart.VISUAL_ID:
				return new AdjMenuStrip5EditPart(view);

			case AdjMenuStripName5EditPart.VISUAL_ID:
				return new AdjMenuStripName5EditPart(view);

			case AdjToolStrip5EditPart.VISUAL_ID:
				return new AdjToolStrip5EditPart(view);

			case AdjToolStripName5EditPart.VISUAL_ID:
				return new AdjToolStripName5EditPart(view);

			case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new FormUIFormUILstAdjWidgetCompartmentEditPart(view);

			case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID:
				return new AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart(view);

			case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID:
				return new AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart(view);

			case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID:
				return new AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart(view);

			case AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart(view);

			case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID:
				return new AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart(view);

			case AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart(view);

			case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID:
				return new AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart(view);

			case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart(view);

			case AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart(view);

			case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart(view);

			case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
				return new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart(view);

			case AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart(view);

			case AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
				return new AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart(view);

			case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
				return new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart(view);

			case AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
				return new AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
