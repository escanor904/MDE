/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.UIDiagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uidiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UIDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UIDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUIDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UIDiagram) domainElement)) {
			return UIDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UIDiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UIDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UIDiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getFormUI().isSuperTypeOf(domainElement.eClass())) {
				return FormUIEditPart.VISUAL_ID;
			}
			break;
		case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjListViewColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjListViewColumnEditPart.VISUAL_ID;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjListViewColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjListViewColumnEditPart.VISUAL_ID;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjListViewColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjListViewColumnEditPart.VISUAL_ID;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDateTimePicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDateTimePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjComboBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjRadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPictureBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjPictureBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListView().isSuperTypeOf(domainElement.eClass())) {
				return AdjListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UIDiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UIDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UIDiagramEditPart.VISUAL_ID:
			if (FormUIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormUIEditPart.VISUAL_ID:
			if (FormUINameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLabelEditPart.VISUAL_ID:
			if (AdjLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckBoxEditPart.VISUAL_ID:
			if (AdjCheckBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjButtonEditPart.VISUAL_ID:
			if (AdjButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListBoxEditPart.VISUAL_ID:
			if (AdjListBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDateTimePickerEditPart.VISUAL_ID:
			if (AdjDateTimePickerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTextBoxEditPart.VISUAL_ID:
			if (AdjTextBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			if (AdjCheckedListBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLinkLabelEditPart.VISUAL_ID:
			if (AdjLinkLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRichTextBoxEditPart.VISUAL_ID:
			if (AdjRichTextBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjComboBoxEditPart.VISUAL_ID:
			if (AdjComboBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRadioButtonEditPart.VISUAL_ID:
			if (AdjRadioButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPictureBoxEditPart.VISUAL_ID:
			if (AdjPictureBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListViewEditPart.VISUAL_ID:
			if (AdjListViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListViewColumnEditPart.VISUAL_ID:
			if (AdjListViewColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelEditPart.VISUAL_ID:
			if (AdjPanelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLabel2EditPart.VISUAL_ID:
			if (AdjLabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckBox2EditPart.VISUAL_ID:
			if (AdjCheckBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjButton2EditPart.VISUAL_ID:
			if (AdjButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListBox2EditPart.VISUAL_ID:
			if (AdjListBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			if (AdjDateTimePickerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTextBox2EditPart.VISUAL_ID:
			if (AdjTextBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			if (AdjCheckedListBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLinkLabel2EditPart.VISUAL_ID:
			if (AdjLinkLabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRichTextBox2EditPart.VISUAL_ID:
			if (AdjRichTextBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjComboBox2EditPart.VISUAL_ID:
			if (AdjComboBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRadioButton2EditPart.VISUAL_ID:
			if (AdjRadioButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPictureBox2EditPart.VISUAL_ID:
			if (AdjPictureBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListView2EditPart.VISUAL_ID:
			if (AdjListViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanel2EditPart.VISUAL_ID:
			if (AdjPanelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxEditPart.VISUAL_ID:
			if (AdjGroupBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLabel3EditPart.VISUAL_ID:
			if (AdjLabelName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckBox3EditPart.VISUAL_ID:
			if (AdjCheckBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjButton3EditPart.VISUAL_ID:
			if (AdjButtonName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListBox3EditPart.VISUAL_ID:
			if (AdjListBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			if (AdjDateTimePickerName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTextBox3EditPart.VISUAL_ID:
			if (AdjTextBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			if (AdjCheckedListBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLinkLabel3EditPart.VISUAL_ID:
			if (AdjLinkLabelName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRichTextBox3EditPart.VISUAL_ID:
			if (AdjRichTextBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjComboBox3EditPart.VISUAL_ID:
			if (AdjComboBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRadioButton3EditPart.VISUAL_ID:
			if (AdjRadioButtonName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPictureBox3EditPart.VISUAL_ID:
			if (AdjPictureBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListView3EditPart.VISUAL_ID:
			if (AdjListViewName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanel3EditPart.VISUAL_ID:
			if (AdjPanelName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBox2EditPart.VISUAL_ID:
			if (AdjGroupBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBox3EditPart.VISUAL_ID:
			if (AdjGroupBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (AdjLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID:
			if (AdjListViewColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (AdjLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID:
			if (AdjListViewColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (AdjLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (AdjLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID:
			if (AdjListViewColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (AdjLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (AdjLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (AdjLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDateTimePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPictureBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UIDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UIDiagramEditPart.VISUAL_ID:
			return false;
		case AdjLabelEditPart.VISUAL_ID:
		case AdjCheckBoxEditPart.VISUAL_ID:
		case AdjButtonEditPart.VISUAL_ID:
		case AdjListBoxEditPart.VISUAL_ID:
		case AdjTextBoxEditPart.VISUAL_ID:
		case AdjCheckedListBoxEditPart.VISUAL_ID:
		case AdjLinkLabelEditPart.VISUAL_ID:
		case AdjRichTextBoxEditPart.VISUAL_ID:
		case AdjLabel2EditPart.VISUAL_ID:
		case AdjCheckBox2EditPart.VISUAL_ID:
		case AdjButton2EditPart.VISUAL_ID:
		case AdjListBox2EditPart.VISUAL_ID:
		case AdjTextBox2EditPart.VISUAL_ID:
		case AdjCheckedListBox2EditPart.VISUAL_ID:
		case AdjLinkLabel2EditPart.VISUAL_ID:
		case AdjRichTextBox2EditPart.VISUAL_ID:
		case AdjLabel3EditPart.VISUAL_ID:
		case AdjCheckBox3EditPart.VISUAL_ID:
		case AdjButton3EditPart.VISUAL_ID:
		case AdjListBox3EditPart.VISUAL_ID:
		case AdjTextBox3EditPart.VISUAL_ID:
		case AdjCheckedListBox3EditPart.VISUAL_ID:
		case AdjLinkLabel3EditPart.VISUAL_ID:
		case AdjRichTextBox3EditPart.VISUAL_ID:
		case AdjComboBoxEditPart.VISUAL_ID:
		case AdjComboBox2EditPart.VISUAL_ID:
		case AdjComboBox3EditPart.VISUAL_ID:
		case AdjListViewColumnEditPart.VISUAL_ID:
		case AdjDateTimePickerEditPart.VISUAL_ID:
		case AdjRadioButtonEditPart.VISUAL_ID:
		case AdjDateTimePicker2EditPart.VISUAL_ID:
		case AdjRadioButton2EditPart.VISUAL_ID:
		case AdjDateTimePicker3EditPart.VISUAL_ID:
		case AdjRadioButton3EditPart.VISUAL_ID:
		case AdjPictureBoxEditPart.VISUAL_ID:
		case AdjPictureBox2EditPart.VISUAL_ID:
		case AdjPictureBox3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
