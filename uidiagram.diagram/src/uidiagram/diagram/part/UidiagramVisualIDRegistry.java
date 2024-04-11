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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepickerEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGridEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip5EditPart.VISUAL_ID;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStripEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStripEditPart.VISUAL_ID;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStripEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStripEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker3EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip2EditPart.VISUAL_ID;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStripEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStripEditPart.VISUAL_ID;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip3EditPart.VISUAL_ID;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID:
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStripEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStripEditPart.VISUAL_ID;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip4EditPart.VISUAL_ID;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID:
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStripEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStripEditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker3EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip2EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker3EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip2EditPart.VISUAL_ID;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip3EditPart.VISUAL_ID;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID:
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker3EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip2EditPart.VISUAL_ID;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip4EditPart.VISUAL_ID;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip3EditPart.VISUAL_ID;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip3EditPart.VISUAL_ID;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip4EditPart.VISUAL_ID;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip4EditPart.VISUAL_ID;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID:
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
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker3EditPart.VISUAL_ID;
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
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip2EditPart.VISUAL_ID;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip3EditPart.VISUAL_ID;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getAdjLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjButton().isSuperTypeOf(domainElement.eClass())) {
				return AdjButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDatepicker().isSuperTypeOf(domainElement.eClass())) {
				return AdjDatepicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjCheckedListBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjCheckedListBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjLinkLabel().isSuperTypeOf(domainElement.eClass())) {
				return AdjLinkLabel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjRichTextBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjRichTextBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjTreeView().isSuperTypeOf(domainElement.eClass())) {
				return AdjTreeView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPropertyGrid().isSuperTypeOf(domainElement.eClass())) {
				return AdjPropertyGrid5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjProgressBar().isSuperTypeOf(domainElement.eClass())) {
				return AdjProgressBar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjDataGridView().isSuperTypeOf(domainElement.eClass())) {
				return AdjDataGridView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjPanel().isSuperTypeOf(domainElement.eClass())) {
				return AdjPanel5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjGroupBox().isSuperTypeOf(domainElement.eClass())) {
				return AdjGroupBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjMenuStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjMenuStrip3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAdjToolStrip().isSuperTypeOf(domainElement.eClass())) {
				return AdjToolStrip4EditPart.VISUAL_ID;
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
		case AdjDatepickerEditPart.VISUAL_ID:
			if (AdjDatepickerNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjTreeViewEditPart.VISUAL_ID:
			if (AdjTreeViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPropertyGridEditPart.VISUAL_ID:
			if (AdjPropertyGridNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjProgressBarEditPart.VISUAL_ID:
			if (AdjProgressBarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewEditPart.VISUAL_ID:
			if (AdjDataGridViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			if (AdjDatepickerName2EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjTreeView2EditPart.VISUAL_ID:
			if (AdjTreeViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			if (AdjPropertyGridName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjProgressBar2EditPart.VISUAL_ID:
			if (AdjProgressBarName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridView2EditPart.VISUAL_ID:
			if (AdjDataGridViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			if (AdjDatepickerName3EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjTreeView3EditPart.VISUAL_ID:
			if (AdjTreeViewName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			if (AdjPropertyGridName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjProgressBar3EditPart.VISUAL_ID:
			if (AdjProgressBarName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridView3EditPart.VISUAL_ID:
			if (AdjDataGridViewName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjMenuStripEditPart.VISUAL_ID:
			if (AdjMenuStripNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLabel4EditPart.VISUAL_ID:
			if (AdjLabelName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckBox4EditPart.VISUAL_ID:
			if (AdjCheckBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjButton4EditPart.VISUAL_ID:
			if (AdjButtonName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListBox4EditPart.VISUAL_ID:
			if (AdjListBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDatepicker4EditPart.VISUAL_ID:
			if (AdjDatepickerName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTextBox4EditPart.VISUAL_ID:
			if (AdjTextBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			if (AdjCheckedListBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLinkLabel4EditPart.VISUAL_ID:
			if (AdjLinkLabelName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRichTextBox4EditPart.VISUAL_ID:
			if (AdjRichTextBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTreeView4EditPart.VISUAL_ID:
			if (AdjTreeViewName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			if (AdjPropertyGridName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjProgressBar4EditPart.VISUAL_ID:
			if (AdjProgressBarName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridView4EditPart.VISUAL_ID:
			if (AdjDataGridViewName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanel4EditPart.VISUAL_ID:
			if (AdjPanelName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripEditPart.VISUAL_ID:
			if (AdjToolStripNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLabel5EditPart.VISUAL_ID:
			if (AdjLabelName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckBox5EditPart.VISUAL_ID:
			if (AdjCheckBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjButton5EditPart.VISUAL_ID:
			if (AdjButtonName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjListBox5EditPart.VISUAL_ID:
			if (AdjListBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDatepicker5EditPart.VISUAL_ID:
			if (AdjDatepickerName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTextBox5EditPart.VISUAL_ID:
			if (AdjTextBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			if (AdjCheckedListBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjLinkLabel5EditPart.VISUAL_ID:
			if (AdjLinkLabelName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjRichTextBox5EditPart.VISUAL_ID:
			if (AdjRichTextBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjTreeView5EditPart.VISUAL_ID:
			if (AdjTreeViewName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			if (AdjPropertyGridName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjProgressBar5EditPart.VISUAL_ID:
			if (AdjProgressBarName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridView5EditPart.VISUAL_ID:
			if (AdjDataGridViewName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanel5EditPart.VISUAL_ID:
			if (AdjPanelName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjMenuStrip2EditPart.VISUAL_ID:
			if (AdjMenuStripName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBox4EditPart.VISUAL_ID:
			if (AdjGroupBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStrip2EditPart.VISUAL_ID:
			if (AdjToolStripName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStrip3EditPart.VISUAL_ID:
			if (AdjMenuStripName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStrip4EditPart.VISUAL_ID:
			if (AdjMenuStripName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStrip3EditPart.VISUAL_ID:
			if (AdjToolStripName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStrip4EditPart.VISUAL_ID:
			if (AdjToolStripName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBox5EditPart.VISUAL_ID:
			if (AdjGroupBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStrip5EditPart.VISUAL_ID:
			if (AdjMenuStripName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStrip5EditPart.VISUAL_ID:
			if (AdjToolStripName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepickerEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGridEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (AdjLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID:
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
			if (AdjDatepicker2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			if (AdjLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID:
			if (AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID:
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
			if (AdjDatepicker2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStripEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStripEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjDatepicker3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (AdjLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID:
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
			if (AdjDatepicker3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			if (AdjLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (AdjLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			if (AdjLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			if (AdjLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			if (AdjLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID:
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
			if (AdjDatepicker3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (AdjTreeView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			if (AdjLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			if (AdjLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDatepicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjCheckedListBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjLinkLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjRichTextBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjTreeView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPropertyGrid5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjProgressBar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjDataGridView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjPanel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjGroupBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjMenuStrip3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdjToolStrip4EditPart.VISUAL_ID == nodeVisualID) {
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
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID:
		case AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID:
		case AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID:
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID:
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
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
		case AdjDatepickerEditPart.VISUAL_ID:
		case AdjTextBoxEditPart.VISUAL_ID:
		case AdjCheckedListBoxEditPart.VISUAL_ID:
		case AdjLinkLabelEditPart.VISUAL_ID:
		case AdjRichTextBoxEditPart.VISUAL_ID:
		case AdjTreeViewEditPart.VISUAL_ID:
		case AdjPropertyGridEditPart.VISUAL_ID:
		case AdjProgressBarEditPart.VISUAL_ID:
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
		case AdjLabel2EditPart.VISUAL_ID:
		case AdjCheckBox2EditPart.VISUAL_ID:
		case AdjButton2EditPart.VISUAL_ID:
		case AdjListBox2EditPart.VISUAL_ID:
		case AdjDatepicker2EditPart.VISUAL_ID:
		case AdjTextBox2EditPart.VISUAL_ID:
		case AdjCheckedListBox2EditPart.VISUAL_ID:
		case AdjLinkLabel2EditPart.VISUAL_ID:
		case AdjRichTextBox2EditPart.VISUAL_ID:
		case AdjTreeView2EditPart.VISUAL_ID:
		case AdjPropertyGrid2EditPart.VISUAL_ID:
		case AdjProgressBar2EditPart.VISUAL_ID:
		case AdjLabel3EditPart.VISUAL_ID:
		case AdjCheckBox3EditPart.VISUAL_ID:
		case AdjButton3EditPart.VISUAL_ID:
		case AdjListBox3EditPart.VISUAL_ID:
		case AdjDatepicker3EditPart.VISUAL_ID:
		case AdjTextBox3EditPart.VISUAL_ID:
		case AdjCheckedListBox3EditPart.VISUAL_ID:
		case AdjLinkLabel3EditPart.VISUAL_ID:
		case AdjRichTextBox3EditPart.VISUAL_ID:
		case AdjTreeView3EditPart.VISUAL_ID:
		case AdjPropertyGrid3EditPart.VISUAL_ID:
		case AdjProgressBar3EditPart.VISUAL_ID:
		case AdjLabel4EditPart.VISUAL_ID:
		case AdjCheckBox4EditPart.VISUAL_ID:
		case AdjButton4EditPart.VISUAL_ID:
		case AdjListBox4EditPart.VISUAL_ID:
		case AdjDatepicker4EditPart.VISUAL_ID:
		case AdjTextBox4EditPart.VISUAL_ID:
		case AdjCheckedListBox4EditPart.VISUAL_ID:
		case AdjLinkLabel4EditPart.VISUAL_ID:
		case AdjRichTextBox4EditPart.VISUAL_ID:
		case AdjTreeView4EditPart.VISUAL_ID:
		case AdjPropertyGrid4EditPart.VISUAL_ID:
		case AdjProgressBar4EditPart.VISUAL_ID:
		case AdjLabel5EditPart.VISUAL_ID:
		case AdjCheckBox5EditPart.VISUAL_ID:
		case AdjButton5EditPart.VISUAL_ID:
		case AdjListBox5EditPart.VISUAL_ID:
		case AdjDatepicker5EditPart.VISUAL_ID:
		case AdjTextBox5EditPart.VISUAL_ID:
		case AdjCheckedListBox5EditPart.VISUAL_ID:
		case AdjLinkLabel5EditPart.VISUAL_ID:
		case AdjRichTextBox5EditPart.VISUAL_ID:
		case AdjTreeView5EditPart.VISUAL_ID:
		case AdjPropertyGrid5EditPart.VISUAL_ID:
		case AdjProgressBar5EditPart.VISUAL_ID:
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
