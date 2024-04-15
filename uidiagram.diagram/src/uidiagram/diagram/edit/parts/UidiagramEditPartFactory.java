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

			case AdjDateTimePickerEditPart.VISUAL_ID:
				return new AdjDateTimePickerEditPart(view);

			case AdjDateTimePickerNameEditPart.VISUAL_ID:
				return new AdjDateTimePickerNameEditPart(view);

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

			case AdjComboBoxEditPart.VISUAL_ID:
				return new AdjComboBoxEditPart(view);

			case AdjComboBoxNameEditPart.VISUAL_ID:
				return new AdjComboBoxNameEditPart(view);

			case AdjRadioButtonEditPart.VISUAL_ID:
				return new AdjRadioButtonEditPart(view);

			case AdjRadioButtonNameEditPart.VISUAL_ID:
				return new AdjRadioButtonNameEditPart(view);

			case AdjPictureBoxEditPart.VISUAL_ID:
				return new AdjPictureBoxEditPart(view);

			case AdjPictureBoxNameEditPart.VISUAL_ID:
				return new AdjPictureBoxNameEditPart(view);

			case AdjListViewEditPart.VISUAL_ID:
				return new AdjListViewEditPart(view);

			case AdjListViewNameEditPart.VISUAL_ID:
				return new AdjListViewNameEditPart(view);

			case AdjListViewColumnEditPart.VISUAL_ID:
				return new AdjListViewColumnEditPart(view);

			case AdjListViewColumnNameEditPart.VISUAL_ID:
				return new AdjListViewColumnNameEditPart(view);

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

			case AdjDateTimePicker2EditPart.VISUAL_ID:
				return new AdjDateTimePicker2EditPart(view);

			case AdjDateTimePickerName2EditPart.VISUAL_ID:
				return new AdjDateTimePickerName2EditPart(view);

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

			case AdjComboBox2EditPart.VISUAL_ID:
				return new AdjComboBox2EditPart(view);

			case AdjComboBoxName2EditPart.VISUAL_ID:
				return new AdjComboBoxName2EditPart(view);

			case AdjRadioButton2EditPart.VISUAL_ID:
				return new AdjRadioButton2EditPart(view);

			case AdjRadioButtonName2EditPart.VISUAL_ID:
				return new AdjRadioButtonName2EditPart(view);

			case AdjPictureBox2EditPart.VISUAL_ID:
				return new AdjPictureBox2EditPart(view);

			case AdjPictureBoxName2EditPart.VISUAL_ID:
				return new AdjPictureBoxName2EditPart(view);

			case AdjListView2EditPart.VISUAL_ID:
				return new AdjListView2EditPart(view);

			case AdjListViewName2EditPart.VISUAL_ID:
				return new AdjListViewName2EditPart(view);

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

			case AdjDateTimePicker3EditPart.VISUAL_ID:
				return new AdjDateTimePicker3EditPart(view);

			case AdjDateTimePickerName3EditPart.VISUAL_ID:
				return new AdjDateTimePickerName3EditPart(view);

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

			case AdjComboBox3EditPart.VISUAL_ID:
				return new AdjComboBox3EditPart(view);

			case AdjComboBoxName3EditPart.VISUAL_ID:
				return new AdjComboBoxName3EditPart(view);

			case AdjRadioButton3EditPart.VISUAL_ID:
				return new AdjRadioButton3EditPart(view);

			case AdjRadioButtonName3EditPart.VISUAL_ID:
				return new AdjRadioButtonName3EditPart(view);

			case AdjPictureBox3EditPart.VISUAL_ID:
				return new AdjPictureBox3EditPart(view);

			case AdjPictureBoxName3EditPart.VISUAL_ID:
				return new AdjPictureBoxName3EditPart(view);

			case AdjListView3EditPart.VISUAL_ID:
				return new AdjListView3EditPart(view);

			case AdjListViewName3EditPart.VISUAL_ID:
				return new AdjListViewName3EditPart(view);

			case AdjPanel3EditPart.VISUAL_ID:
				return new AdjPanel3EditPart(view);

			case AdjPanelName3EditPart.VISUAL_ID:
				return new AdjPanelName3EditPart(view);

			case AdjGroupBox2EditPart.VISUAL_ID:
				return new AdjGroupBox2EditPart(view);

			case AdjGroupBoxName2EditPart.VISUAL_ID:
				return new AdjGroupBoxName2EditPart(view);

			case AdjGroupBox3EditPart.VISUAL_ID:
				return new AdjGroupBox3EditPart(view);

			case AdjGroupBoxName3EditPart.VISUAL_ID:
				return new AdjGroupBoxName3EditPart(view);

			case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new FormUIFormUILstAdjWidgetCompartmentEditPart(view);

			case AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID:
				return new AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart(view);

			case AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID:
				return new AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart(view);

			case AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID:
				return new AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart(view);

			case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart(view);

			case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
				return new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart(view);
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
