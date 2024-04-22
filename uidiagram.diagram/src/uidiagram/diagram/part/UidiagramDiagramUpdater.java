/*
* 
*/
package uidiagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uidiagram.AdjGroupBox;
import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;
import uidiagram.AdjPanel;
import uidiagram.AdjWidget;
import uidiagram.FormUI;
import uidiagram.UIDiagram;
import uidiagram.diagram.edit.parts.AdjButton2EditPart;
import uidiagram.diagram.edit.parts.AdjButton3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjComboBox2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBox3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxEditPart;
import uidiagram.diagram.edit.parts.AdjLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelEditPart;
import uidiagram.diagram.edit.parts.AdjListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjListView2EditPart;
import uidiagram.diagram.edit.parts.AdjListView3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnEditPart;
import uidiagram.diagram.edit.parts.AdjListViewEditPart;
import uidiagram.diagram.edit.parts.AdjPanel2EditPart;
import uidiagram.diagram.edit.parts.AdjPanel3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjPanelEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxEditPart;
import uidiagram.diagram.edit.parts.FormUIEditPart;
import uidiagram.diagram.edit.parts.FormUIFormUILstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;

/**
 * @generated
 */
public class UidiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000SemanticChildren(view);
		case FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getFormUIFormUILstAdjWidgetCompartment_7001SemanticChildren(view);
		case AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID:
			return getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7027SemanticChildren(view);
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7003SemanticChildren(view);
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID:
			return getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7028SemanticChildren(view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7005SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7006SemanticChildren(view);
		case AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID:
			return getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7029SemanticChildren(view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7008SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7016SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7024SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUIDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UIDiagram modelElement = (UIDiagram) view.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		{
			FormUI childElement = modelElement.getForm();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FormUIEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getFormUIFormUILstAdjWidgetCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FormUI modelElement = (FormUI) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePickerEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjListView modelElement = (AdjListView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjListViewColumn().iterator(); it.hasNext();) {
			AdjListViewColumn childElement = (AdjListViewColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjListViewColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjPanelAdjPanelLstAdjWidgetCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjPanel modelElement = (AdjPanel) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjListView modelElement = (AdjListView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjListViewColumn().iterator(); it.hasNext();) {
			AdjListViewColumn childElement = (AdjListViewColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjListViewColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjPanelAdjPanelLstAdjWidgetCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjPanel modelElement = (AdjPanel) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjGroupBox modelElement = (AdjGroupBox) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjListViewAdjListViewLstAdjListViewColumnCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjListView modelElement = (AdjListView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjListViewColumn().iterator(); it.hasNext();) {
			AdjListViewColumn childElement = (AdjListViewColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjListViewColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjPanelAdjPanelLstAdjWidgetCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjPanel modelElement = (AdjPanel) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjGroupBox modelElement = (AdjGroupBox) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjGroupBox modelElement = (AdjGroupBox) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDateTimePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPictureBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getContainedLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000ContainedLinks(view);
		case FormUIEditPart.VISUAL_ID:
			return getFormUI_2001ContainedLinks(view);
		case AdjLabelEditPart.VISUAL_ID:
			return getAdjLabel_3001ContainedLinks(view);
		case AdjCheckBoxEditPart.VISUAL_ID:
			return getAdjCheckBox_3002ContainedLinks(view);
		case AdjButtonEditPart.VISUAL_ID:
			return getAdjButton_3003ContainedLinks(view);
		case AdjListBoxEditPart.VISUAL_ID:
			return getAdjListBox_3004ContainedLinks(view);
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return getAdjDateTimePicker_3098ContainedLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006ContainedLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007ContainedLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008ContainedLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009ContainedLinks(view);
		case AdjComboBoxEditPart.VISUAL_ID:
			return getAdjComboBox_3087ContainedLinks(view);
		case AdjRadioButtonEditPart.VISUAL_ID:
			return getAdjRadioButton_3099ContainedLinks(view);
		case AdjPictureBoxEditPart.VISUAL_ID:
			return getAdjPictureBox_3106ContainedLinks(view);
		case AdjListViewEditPart.VISUAL_ID:
			return getAdjListView_3092ContainedLinks(view);
		case AdjListViewColumnEditPart.VISUAL_ID:
			return getAdjListViewColumn_3093ContainedLinks(view);
		case AdjPanelEditPart.VISUAL_ID:
			return getAdjPanel_3015ContainedLinks(view);
		case AdjLabel2EditPart.VISUAL_ID:
			return getAdjLabel_3016ContainedLinks(view);
		case AdjCheckBox2EditPart.VISUAL_ID:
			return getAdjCheckBox_3017ContainedLinks(view);
		case AdjButton2EditPart.VISUAL_ID:
			return getAdjButton_3018ContainedLinks(view);
		case AdjListBox2EditPart.VISUAL_ID:
			return getAdjListBox_3019ContainedLinks(view);
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3101ContainedLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021ContainedLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022ContainedLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023ContainedLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024ContainedLinks(view);
		case AdjComboBox2EditPart.VISUAL_ID:
			return getAdjComboBox_3088ContainedLinks(view);
		case AdjRadioButton2EditPart.VISUAL_ID:
			return getAdjRadioButton_3102ContainedLinks(view);
		case AdjPictureBox2EditPart.VISUAL_ID:
			return getAdjPictureBox_3107ContainedLinks(view);
		case AdjListView2EditPart.VISUAL_ID:
			return getAdjListView_3094ContainedLinks(view);
		case AdjPanel2EditPart.VISUAL_ID:
			return getAdjPanel_3029ContainedLinks(view);
		case AdjGroupBoxEditPart.VISUAL_ID:
			return getAdjGroupBox_3030ContainedLinks(view);
		case AdjLabel3EditPart.VISUAL_ID:
			return getAdjLabel_3031ContainedLinks(view);
		case AdjCheckBox3EditPart.VISUAL_ID:
			return getAdjCheckBox_3032ContainedLinks(view);
		case AdjButton3EditPart.VISUAL_ID:
			return getAdjButton_3033ContainedLinks(view);
		case AdjListBox3EditPart.VISUAL_ID:
			return getAdjListBox_3034ContainedLinks(view);
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3104ContainedLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036ContainedLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037ContainedLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038ContainedLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039ContainedLinks(view);
		case AdjComboBox3EditPart.VISUAL_ID:
			return getAdjComboBox_3089ContainedLinks(view);
		case AdjRadioButton3EditPart.VISUAL_ID:
			return getAdjRadioButton_3105ContainedLinks(view);
		case AdjPictureBox3EditPart.VISUAL_ID:
			return getAdjPictureBox_3108ContainedLinks(view);
		case AdjListView3EditPart.VISUAL_ID:
			return getAdjListView_3095ContainedLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044ContainedLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3076ContainedLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3084ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case FormUIEditPart.VISUAL_ID:
			return getFormUI_2001IncomingLinks(view);
		case AdjLabelEditPart.VISUAL_ID:
			return getAdjLabel_3001IncomingLinks(view);
		case AdjCheckBoxEditPart.VISUAL_ID:
			return getAdjCheckBox_3002IncomingLinks(view);
		case AdjButtonEditPart.VISUAL_ID:
			return getAdjButton_3003IncomingLinks(view);
		case AdjListBoxEditPart.VISUAL_ID:
			return getAdjListBox_3004IncomingLinks(view);
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return getAdjDateTimePicker_3098IncomingLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006IncomingLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007IncomingLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008IncomingLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009IncomingLinks(view);
		case AdjComboBoxEditPart.VISUAL_ID:
			return getAdjComboBox_3087IncomingLinks(view);
		case AdjRadioButtonEditPart.VISUAL_ID:
			return getAdjRadioButton_3099IncomingLinks(view);
		case AdjPictureBoxEditPart.VISUAL_ID:
			return getAdjPictureBox_3106IncomingLinks(view);
		case AdjListViewEditPart.VISUAL_ID:
			return getAdjListView_3092IncomingLinks(view);
		case AdjListViewColumnEditPart.VISUAL_ID:
			return getAdjListViewColumn_3093IncomingLinks(view);
		case AdjPanelEditPart.VISUAL_ID:
			return getAdjPanel_3015IncomingLinks(view);
		case AdjLabel2EditPart.VISUAL_ID:
			return getAdjLabel_3016IncomingLinks(view);
		case AdjCheckBox2EditPart.VISUAL_ID:
			return getAdjCheckBox_3017IncomingLinks(view);
		case AdjButton2EditPart.VISUAL_ID:
			return getAdjButton_3018IncomingLinks(view);
		case AdjListBox2EditPart.VISUAL_ID:
			return getAdjListBox_3019IncomingLinks(view);
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3101IncomingLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021IncomingLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022IncomingLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023IncomingLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024IncomingLinks(view);
		case AdjComboBox2EditPart.VISUAL_ID:
			return getAdjComboBox_3088IncomingLinks(view);
		case AdjRadioButton2EditPart.VISUAL_ID:
			return getAdjRadioButton_3102IncomingLinks(view);
		case AdjPictureBox2EditPart.VISUAL_ID:
			return getAdjPictureBox_3107IncomingLinks(view);
		case AdjListView2EditPart.VISUAL_ID:
			return getAdjListView_3094IncomingLinks(view);
		case AdjPanel2EditPart.VISUAL_ID:
			return getAdjPanel_3029IncomingLinks(view);
		case AdjGroupBoxEditPart.VISUAL_ID:
			return getAdjGroupBox_3030IncomingLinks(view);
		case AdjLabel3EditPart.VISUAL_ID:
			return getAdjLabel_3031IncomingLinks(view);
		case AdjCheckBox3EditPart.VISUAL_ID:
			return getAdjCheckBox_3032IncomingLinks(view);
		case AdjButton3EditPart.VISUAL_ID:
			return getAdjButton_3033IncomingLinks(view);
		case AdjListBox3EditPart.VISUAL_ID:
			return getAdjListBox_3034IncomingLinks(view);
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3104IncomingLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036IncomingLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037IncomingLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038IncomingLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039IncomingLinks(view);
		case AdjComboBox3EditPart.VISUAL_ID:
			return getAdjComboBox_3089IncomingLinks(view);
		case AdjRadioButton3EditPart.VISUAL_ID:
			return getAdjRadioButton_3105IncomingLinks(view);
		case AdjPictureBox3EditPart.VISUAL_ID:
			return getAdjPictureBox_3108IncomingLinks(view);
		case AdjListView3EditPart.VISUAL_ID:
			return getAdjListView_3095IncomingLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044IncomingLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3076IncomingLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3084IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case FormUIEditPart.VISUAL_ID:
			return getFormUI_2001OutgoingLinks(view);
		case AdjLabelEditPart.VISUAL_ID:
			return getAdjLabel_3001OutgoingLinks(view);
		case AdjCheckBoxEditPart.VISUAL_ID:
			return getAdjCheckBox_3002OutgoingLinks(view);
		case AdjButtonEditPart.VISUAL_ID:
			return getAdjButton_3003OutgoingLinks(view);
		case AdjListBoxEditPart.VISUAL_ID:
			return getAdjListBox_3004OutgoingLinks(view);
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return getAdjDateTimePicker_3098OutgoingLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006OutgoingLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007OutgoingLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008OutgoingLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009OutgoingLinks(view);
		case AdjComboBoxEditPart.VISUAL_ID:
			return getAdjComboBox_3087OutgoingLinks(view);
		case AdjRadioButtonEditPart.VISUAL_ID:
			return getAdjRadioButton_3099OutgoingLinks(view);
		case AdjPictureBoxEditPart.VISUAL_ID:
			return getAdjPictureBox_3106OutgoingLinks(view);
		case AdjListViewEditPart.VISUAL_ID:
			return getAdjListView_3092OutgoingLinks(view);
		case AdjListViewColumnEditPart.VISUAL_ID:
			return getAdjListViewColumn_3093OutgoingLinks(view);
		case AdjPanelEditPart.VISUAL_ID:
			return getAdjPanel_3015OutgoingLinks(view);
		case AdjLabel2EditPart.VISUAL_ID:
			return getAdjLabel_3016OutgoingLinks(view);
		case AdjCheckBox2EditPart.VISUAL_ID:
			return getAdjCheckBox_3017OutgoingLinks(view);
		case AdjButton2EditPart.VISUAL_ID:
			return getAdjButton_3018OutgoingLinks(view);
		case AdjListBox2EditPart.VISUAL_ID:
			return getAdjListBox_3019OutgoingLinks(view);
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3101OutgoingLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021OutgoingLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022OutgoingLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023OutgoingLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024OutgoingLinks(view);
		case AdjComboBox2EditPart.VISUAL_ID:
			return getAdjComboBox_3088OutgoingLinks(view);
		case AdjRadioButton2EditPart.VISUAL_ID:
			return getAdjRadioButton_3102OutgoingLinks(view);
		case AdjPictureBox2EditPart.VISUAL_ID:
			return getAdjPictureBox_3107OutgoingLinks(view);
		case AdjListView2EditPart.VISUAL_ID:
			return getAdjListView_3094OutgoingLinks(view);
		case AdjPanel2EditPart.VISUAL_ID:
			return getAdjPanel_3029OutgoingLinks(view);
		case AdjGroupBoxEditPart.VISUAL_ID:
			return getAdjGroupBox_3030OutgoingLinks(view);
		case AdjLabel3EditPart.VISUAL_ID:
			return getAdjLabel_3031OutgoingLinks(view);
		case AdjCheckBox3EditPart.VISUAL_ID:
			return getAdjCheckBox_3032OutgoingLinks(view);
		case AdjButton3EditPart.VISUAL_ID:
			return getAdjButton_3033OutgoingLinks(view);
		case AdjListBox3EditPart.VISUAL_ID:
			return getAdjListBox_3034OutgoingLinks(view);
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3104OutgoingLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036OutgoingLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037OutgoingLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038OutgoingLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039OutgoingLinks(view);
		case AdjComboBox3EditPart.VISUAL_ID:
			return getAdjComboBox_3089OutgoingLinks(view);
		case AdjRadioButton3EditPart.VISUAL_ID:
			return getAdjRadioButton_3105OutgoingLinks(view);
		case AdjPictureBox3EditPart.VISUAL_ID:
			return getAdjPictureBox_3108OutgoingLinks(view);
		case AdjListView3EditPart.VISUAL_ID:
			return getAdjListView_3095OutgoingLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044OutgoingLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3076OutgoingLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3084OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUIDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFormUI_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3098ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3087ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3099ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3106ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3092ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListViewColumn_3093ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3101ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3088ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3102ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3107ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3094ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3104ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3089ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3105ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3108ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3095ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3076ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3084ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFormUI_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3098IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3087IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3099IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3106IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3092IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListViewColumn_3093IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3101IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3088IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3102IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3107IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3094IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3104IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3038IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3039IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3089IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3105IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3108IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3095IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3076IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3084IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFormUI_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3098OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3087OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3099OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3106OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3092OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListViewColumn_3093OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3101OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3088OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3102OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3107OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3094OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDateTimePicker_3104OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3038OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjComboBox_3089OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRadioButton_3105OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPictureBox_3108OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListView_3095OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3076OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3084OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
			return UidiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getContainedLinks(View view) {
			return UidiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
			return UidiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
			return UidiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
