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

			case AdjLabelTextEditPart.VISUAL_ID:
				return new AdjLabelTextEditPart(view);

			case AdjCheckBoxEditPart.VISUAL_ID:
				return new AdjCheckBoxEditPart(view);

			case AdjCheckBoxTextEditPart.VISUAL_ID:
				return new AdjCheckBoxTextEditPart(view);

			case AdjButtonEditPart.VISUAL_ID:
				return new AdjButtonEditPart(view);

			case AdjButtonTextEditPart.VISUAL_ID:
				return new AdjButtonTextEditPart(view);

			case AdjListBoxEditPart.VISUAL_ID:
				return new AdjListBoxEditPart(view);

			case AdjListBoxTextEditPart.VISUAL_ID:
				return new AdjListBoxTextEditPart(view);

			case AdjDateTimePickerEditPart.VISUAL_ID:
				return new AdjDateTimePickerEditPart(view);

			case AdjDateTimePickerTextEditPart.VISUAL_ID:
				return new AdjDateTimePickerTextEditPart(view);

			case AdjTextBoxEditPart.VISUAL_ID:
				return new AdjTextBoxEditPart(view);

			case AdjTextBoxTextEditPart.VISUAL_ID:
				return new AdjTextBoxTextEditPart(view);

			case AdjCheckedListBoxEditPart.VISUAL_ID:
				return new AdjCheckedListBoxEditPart(view);

			case AdjCheckedListBoxTextEditPart.VISUAL_ID:
				return new AdjCheckedListBoxTextEditPart(view);

			case AdjLinkLabelEditPart.VISUAL_ID:
				return new AdjLinkLabelEditPart(view);

			case AdjLinkLabelTextEditPart.VISUAL_ID:
				return new AdjLinkLabelTextEditPart(view);

			case AdjRichTextBoxEditPart.VISUAL_ID:
				return new AdjRichTextBoxEditPart(view);

			case AdjRichTextBoxTextEditPart.VISUAL_ID:
				return new AdjRichTextBoxTextEditPart(view);

			case AdjComboBoxEditPart.VISUAL_ID:
				return new AdjComboBoxEditPart(view);

			case AdjComboBoxTextEditPart.VISUAL_ID:
				return new AdjComboBoxTextEditPart(view);

			case AdjRadioButtonEditPart.VISUAL_ID:
				return new AdjRadioButtonEditPart(view);

			case AdjRadioButtonTextEditPart.VISUAL_ID:
				return new AdjRadioButtonTextEditPart(view);

			case AdjPictureBoxEditPart.VISUAL_ID:
				return new AdjPictureBoxEditPart(view);

			case AdjPictureBoxTextEditPart.VISUAL_ID:
				return new AdjPictureBoxTextEditPart(view);

			case AdjListViewEditPart.VISUAL_ID:
				return new AdjListViewEditPart(view);

			case AdjListViewTextEditPart.VISUAL_ID:
				return new AdjListViewTextEditPart(view);

			case AdjListViewColumnEditPart.VISUAL_ID:
				return new AdjListViewColumnEditPart(view);

			case AdjListViewColumnTextEditPart.VISUAL_ID:
				return new AdjListViewColumnTextEditPart(view);

			case AdjPanelEditPart.VISUAL_ID:
				return new AdjPanelEditPart(view);

			case AdjPanelTextEditPart.VISUAL_ID:
				return new AdjPanelTextEditPart(view);

			case AdjLabel2EditPart.VISUAL_ID:
				return new AdjLabel2EditPart(view);

			case AdjLabelText2EditPart.VISUAL_ID:
				return new AdjLabelText2EditPart(view);

			case AdjCheckBox2EditPart.VISUAL_ID:
				return new AdjCheckBox2EditPart(view);

			case AdjCheckBoxText2EditPart.VISUAL_ID:
				return new AdjCheckBoxText2EditPart(view);

			case AdjButton2EditPart.VISUAL_ID:
				return new AdjButton2EditPart(view);

			case AdjButtonText2EditPart.VISUAL_ID:
				return new AdjButtonText2EditPart(view);

			case AdjListBox2EditPart.VISUAL_ID:
				return new AdjListBox2EditPart(view);

			case AdjListBoxText2EditPart.VISUAL_ID:
				return new AdjListBoxText2EditPart(view);

			case AdjDateTimePicker2EditPart.VISUAL_ID:
				return new AdjDateTimePicker2EditPart(view);

			case AdjDateTimePickerText2EditPart.VISUAL_ID:
				return new AdjDateTimePickerText2EditPart(view);

			case AdjTextBox2EditPart.VISUAL_ID:
				return new AdjTextBox2EditPart(view);

			case AdjTextBoxText2EditPart.VISUAL_ID:
				return new AdjTextBoxText2EditPart(view);

			case AdjCheckedListBox2EditPart.VISUAL_ID:
				return new AdjCheckedListBox2EditPart(view);

			case AdjCheckedListBoxText2EditPart.VISUAL_ID:
				return new AdjCheckedListBoxText2EditPart(view);

			case AdjLinkLabel2EditPart.VISUAL_ID:
				return new AdjLinkLabel2EditPart(view);

			case AdjLinkLabelText2EditPart.VISUAL_ID:
				return new AdjLinkLabelText2EditPart(view);

			case AdjRichTextBox2EditPart.VISUAL_ID:
				return new AdjRichTextBox2EditPart(view);

			case AdjRichTextBoxText2EditPart.VISUAL_ID:
				return new AdjRichTextBoxText2EditPart(view);

			case AdjComboBox2EditPart.VISUAL_ID:
				return new AdjComboBox2EditPart(view);

			case AdjComboBoxText2EditPart.VISUAL_ID:
				return new AdjComboBoxText2EditPart(view);

			case AdjRadioButton2EditPart.VISUAL_ID:
				return new AdjRadioButton2EditPart(view);

			case AdjRadioButtonText2EditPart.VISUAL_ID:
				return new AdjRadioButtonText2EditPart(view);

			case AdjPictureBox2EditPart.VISUAL_ID:
				return new AdjPictureBox2EditPart(view);

			case AdjPictureBoxText2EditPart.VISUAL_ID:
				return new AdjPictureBoxText2EditPart(view);

			case AdjListView2EditPart.VISUAL_ID:
				return new AdjListView2EditPart(view);

			case AdjListViewText2EditPart.VISUAL_ID:
				return new AdjListViewText2EditPart(view);

			case AdjPanel2EditPart.VISUAL_ID:
				return new AdjPanel2EditPart(view);

			case AdjPanelText2EditPart.VISUAL_ID:
				return new AdjPanelText2EditPart(view);

			case AdjGroupBoxEditPart.VISUAL_ID:
				return new AdjGroupBoxEditPart(view);

			case AdjGroupBoxTextEditPart.VISUAL_ID:
				return new AdjGroupBoxTextEditPart(view);

			case AdjLabel3EditPart.VISUAL_ID:
				return new AdjLabel3EditPart(view);

			case AdjLabelText3EditPart.VISUAL_ID:
				return new AdjLabelText3EditPart(view);

			case AdjCheckBox3EditPart.VISUAL_ID:
				return new AdjCheckBox3EditPart(view);

			case AdjCheckBoxText3EditPart.VISUAL_ID:
				return new AdjCheckBoxText3EditPart(view);

			case AdjButton3EditPart.VISUAL_ID:
				return new AdjButton3EditPart(view);

			case AdjButtonText3EditPart.VISUAL_ID:
				return new AdjButtonText3EditPart(view);

			case AdjListBox3EditPart.VISUAL_ID:
				return new AdjListBox3EditPart(view);

			case AdjListBoxText3EditPart.VISUAL_ID:
				return new AdjListBoxText3EditPart(view);

			case AdjDateTimePicker3EditPart.VISUAL_ID:
				return new AdjDateTimePicker3EditPart(view);

			case AdjDateTimePickerText3EditPart.VISUAL_ID:
				return new AdjDateTimePickerText3EditPart(view);

			case AdjTextBox3EditPart.VISUAL_ID:
				return new AdjTextBox3EditPart(view);

			case AdjTextBoxText3EditPart.VISUAL_ID:
				return new AdjTextBoxText3EditPart(view);

			case AdjCheckedListBox3EditPart.VISUAL_ID:
				return new AdjCheckedListBox3EditPart(view);

			case AdjCheckedListBoxText3EditPart.VISUAL_ID:
				return new AdjCheckedListBoxText3EditPart(view);

			case AdjLinkLabel3EditPart.VISUAL_ID:
				return new AdjLinkLabel3EditPart(view);

			case AdjLinkLabelText3EditPart.VISUAL_ID:
				return new AdjLinkLabelText3EditPart(view);

			case AdjRichTextBox3EditPart.VISUAL_ID:
				return new AdjRichTextBox3EditPart(view);

			case AdjRichTextBoxText3EditPart.VISUAL_ID:
				return new AdjRichTextBoxText3EditPart(view);

			case AdjComboBox3EditPart.VISUAL_ID:
				return new AdjComboBox3EditPart(view);

			case AdjComboBoxText3EditPart.VISUAL_ID:
				return new AdjComboBoxText3EditPart(view);

			case AdjRadioButton3EditPart.VISUAL_ID:
				return new AdjRadioButton3EditPart(view);

			case AdjRadioButtonText3EditPart.VISUAL_ID:
				return new AdjRadioButtonText3EditPart(view);

			case AdjPictureBox3EditPart.VISUAL_ID:
				return new AdjPictureBox3EditPart(view);

			case AdjPictureBoxText3EditPart.VISUAL_ID:
				return new AdjPictureBoxText3EditPart(view);

			case AdjListView3EditPart.VISUAL_ID:
				return new AdjListView3EditPart(view);

			case AdjListViewText3EditPart.VISUAL_ID:
				return new AdjListViewText3EditPart(view);

			case AdjPanel3EditPart.VISUAL_ID:
				return new AdjPanel3EditPart(view);

			case AdjPanelText3EditPart.VISUAL_ID:
				return new AdjPanelText3EditPart(view);

			case AdjGroupBox2EditPart.VISUAL_ID:
				return new AdjGroupBox2EditPart(view);

			case AdjGroupBoxText2EditPart.VISUAL_ID:
				return new AdjGroupBoxText2EditPart(view);

			case AdjGroupBox3EditPart.VISUAL_ID:
				return new AdjGroupBox3EditPart(view);

			case AdjGroupBoxText3EditPart.VISUAL_ID:
				return new AdjGroupBoxText3EditPart(view);

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
