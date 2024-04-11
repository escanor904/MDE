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

import uidiagram.AdjDataGridView;
import uidiagram.AdjDataGridViewTextBoxColumn;
import uidiagram.AdjGroupBox;
import uidiagram.AdjMenuStrip;
import uidiagram.AdjPanel;
import uidiagram.AdjToolStrip;
import uidiagram.AdjWidget;
import uidiagram.FormUI;
import uidiagram.UIDiagram;
import uidiagram.diagram.edit.parts.*;

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
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID:
			return getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7002SemanticChildren(
					view);
		case AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7003SemanticChildren(view);
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID:
			return getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7004SemanticChildren(
					view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7005SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7006SemanticChildren(view);
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID:
			return getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7007SemanticChildren(
					view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7008SemanticChildren(view);
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7009SemanticChildren(view);
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID:
			return getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7010SemanticChildren(
					view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7011SemanticChildren(view);
		case AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID:
			return getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7012SemanticChildren(view);
		case AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID:
			return getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7013SemanticChildren(
					view);
		case AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			return getAdjPanelAdjPanelLstAdjWidgetCompartment_7014SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7015SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7016SemanticChildren(view);
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7017SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7018SemanticChildren(view);
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID:
			return getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7019SemanticChildren(view);
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7020SemanticChildren(view);
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			return getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7021SemanticChildren(view);
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID:
			return getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7022SemanticChildren(view);
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID:
			return getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7023SemanticChildren(view);
		case AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			return getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7024SemanticChildren(view);
		case AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			return getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7025SemanticChildren(view);
		case AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID:
			return getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7026SemanticChildren(view);
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
			if (visualID == AdjDatepickerEditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGridEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjDataGridView modelElement = (AdjDataGridView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjDataGridViewTextBoxColumn().iterator(); it.hasNext();) {
			AdjDataGridViewTextBoxColumn childElement = (AdjDataGridViewTextBoxColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker2EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView2EditPart.VISUAL_ID) {
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
			if (visualID == AdjMenuStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjDataGridView modelElement = (AdjDataGridView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjDataGridViewTextBoxColumn().iterator(); it.hasNext();) {
			AdjDataGridViewTextBoxColumn childElement = (AdjDataGridViewTextBoxColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker2EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView2EditPart.VISUAL_ID) {
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
			if (visualID == AdjMenuStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStripEditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker3EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjDataGridView modelElement = (AdjDataGridView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjDataGridViewTextBoxColumn().iterator(); it.hasNext();) {
			AdjDataGridViewTextBoxColumn childElement = (AdjDataGridViewTextBoxColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker2EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView2EditPart.VISUAL_ID) {
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
			if (visualID == AdjMenuStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjMenuStrip modelElement = (AdjMenuStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjDataGridView modelElement = (AdjDataGridView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjDataGridViewTextBoxColumn().iterator(); it.hasNext();) {
			AdjDataGridViewTextBoxColumn childElement = (AdjDataGridViewTextBoxColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjPanelAdjPanelLstAdjWidgetCompartment_7011SemanticChildren(
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
			if (visualID == AdjDatepicker2EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView2EditPart.VISUAL_ID) {
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
			if (visualID == AdjMenuStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjToolStrip modelElement = (AdjToolStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjDataGridView modelElement = (AdjDataGridView) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjDataGridViewTextBoxColumn().iterator(); it.hasNext();) {
			AdjDataGridViewTextBoxColumn childElement = (AdjDataGridViewTextBoxColumn) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjPanelAdjPanelLstAdjWidgetCompartment_7014SemanticChildren(
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
			if (visualID == AdjDatepicker2EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView2EditPart.VISUAL_ID) {
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
			if (visualID == AdjMenuStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStripEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7015SemanticChildren(
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
			if (visualID == AdjDatepicker3EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip2EditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker3EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjMenuStrip modelElement = (AdjMenuStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment_7018SemanticChildren(
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
			if (visualID == AdjDatepicker3EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjToolStrip modelElement = (AdjToolStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjMenuStrip modelElement = (AdjMenuStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjMenuStrip modelElement = (AdjMenuStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjToolStrip modelElement = (AdjToolStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjToolStrip modelElement = (AdjToolStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip4EditPart.VISUAL_ID) {
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
			if (visualID == AdjDatepicker3EditPart.VISUAL_ID) {
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
			if (visualID == AdjTreeView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjMenuStripAdjMenuStripLstAdjWidgetCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjMenuStrip modelElement = (AdjMenuStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAdjToolStripAdjToolStripLstAdjWidgetCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdjToolStrip modelElement = (AdjToolStrip) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAdjWidget().iterator(); it.hasNext();) {
			AdjWidget childElement = (AdjWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AdjLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjButton5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDatepicker5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjCheckedListBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjLinkLabel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjRichTextBox5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjTreeView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPropertyGrid5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjProgressBar5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjDataGridView5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjPanel5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjGroupBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjMenuStrip3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdjToolStrip4EditPart.VISUAL_ID) {
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
		case AdjDatepickerEditPart.VISUAL_ID:
			return getAdjDatepicker_3005ContainedLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006ContainedLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007ContainedLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008ContainedLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009ContainedLinks(view);
		case AdjTreeViewEditPart.VISUAL_ID:
			return getAdjTreeView_3010ContainedLinks(view);
		case AdjPropertyGridEditPart.VISUAL_ID:
			return getAdjPropertyGrid_3011ContainedLinks(view);
		case AdjProgressBarEditPart.VISUAL_ID:
			return getAdjProgressBar_3012ContainedLinks(view);
		case AdjDataGridViewEditPart.VISUAL_ID:
			return getAdjDataGridView_3013ContainedLinks(view);
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return getAdjDataGridViewTextBoxColumn_3014ContainedLinks(view);
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			return getAdjDatepicker_3020ContainedLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021ContainedLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022ContainedLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023ContainedLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024ContainedLinks(view);
		case AdjTreeView2EditPart.VISUAL_ID:
			return getAdjTreeView_3025ContainedLinks(view);
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3026ContainedLinks(view);
		case AdjProgressBar2EditPart.VISUAL_ID:
			return getAdjProgressBar_3027ContainedLinks(view);
		case AdjDataGridView2EditPart.VISUAL_ID:
			return getAdjDataGridView_3028ContainedLinks(view);
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			return getAdjDatepicker_3035ContainedLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036ContainedLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037ContainedLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038ContainedLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039ContainedLinks(view);
		case AdjTreeView3EditPart.VISUAL_ID:
			return getAdjTreeView_3040ContainedLinks(view);
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3041ContainedLinks(view);
		case AdjProgressBar3EditPart.VISUAL_ID:
			return getAdjProgressBar_3042ContainedLinks(view);
		case AdjDataGridView3EditPart.VISUAL_ID:
			return getAdjDataGridView_3043ContainedLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044ContainedLinks(view);
		case AdjMenuStripEditPart.VISUAL_ID:
			return getAdjMenuStrip_3045ContainedLinks(view);
		case AdjLabel4EditPart.VISUAL_ID:
			return getAdjLabel_3046ContainedLinks(view);
		case AdjCheckBox4EditPart.VISUAL_ID:
			return getAdjCheckBox_3047ContainedLinks(view);
		case AdjButton4EditPart.VISUAL_ID:
			return getAdjButton_3048ContainedLinks(view);
		case AdjListBox4EditPart.VISUAL_ID:
			return getAdjListBox_3049ContainedLinks(view);
		case AdjDatepicker4EditPart.VISUAL_ID:
			return getAdjDatepicker_3050ContainedLinks(view);
		case AdjTextBox4EditPart.VISUAL_ID:
			return getAdjTextBox_3051ContainedLinks(view);
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3052ContainedLinks(view);
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return getAdjLinkLabel_3053ContainedLinks(view);
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return getAdjRichTextBox_3054ContainedLinks(view);
		case AdjTreeView4EditPart.VISUAL_ID:
			return getAdjTreeView_3055ContainedLinks(view);
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3056ContainedLinks(view);
		case AdjProgressBar4EditPart.VISUAL_ID:
			return getAdjProgressBar_3057ContainedLinks(view);
		case AdjDataGridView4EditPart.VISUAL_ID:
			return getAdjDataGridView_3058ContainedLinks(view);
		case AdjPanel4EditPart.VISUAL_ID:
			return getAdjPanel_3059ContainedLinks(view);
		case AdjToolStripEditPart.VISUAL_ID:
			return getAdjToolStrip_3060ContainedLinks(view);
		case AdjLabel5EditPart.VISUAL_ID:
			return getAdjLabel_3061ContainedLinks(view);
		case AdjCheckBox5EditPart.VISUAL_ID:
			return getAdjCheckBox_3062ContainedLinks(view);
		case AdjButton5EditPart.VISUAL_ID:
			return getAdjButton_3063ContainedLinks(view);
		case AdjListBox5EditPart.VISUAL_ID:
			return getAdjListBox_3064ContainedLinks(view);
		case AdjDatepicker5EditPart.VISUAL_ID:
			return getAdjDatepicker_3065ContainedLinks(view);
		case AdjTextBox5EditPart.VISUAL_ID:
			return getAdjTextBox_3066ContainedLinks(view);
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3067ContainedLinks(view);
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return getAdjLinkLabel_3068ContainedLinks(view);
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return getAdjRichTextBox_3069ContainedLinks(view);
		case AdjTreeView5EditPart.VISUAL_ID:
			return getAdjTreeView_3070ContainedLinks(view);
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3071ContainedLinks(view);
		case AdjProgressBar5EditPart.VISUAL_ID:
			return getAdjProgressBar_3072ContainedLinks(view);
		case AdjDataGridView5EditPart.VISUAL_ID:
			return getAdjDataGridView_3073ContainedLinks(view);
		case AdjPanel5EditPart.VISUAL_ID:
			return getAdjPanel_3074ContainedLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3075ContainedLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3076ContainedLinks(view);
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return getAdjMenuStrip_3077ContainedLinks(view);
		case AdjGroupBox4EditPart.VISUAL_ID:
			return getAdjGroupBox_3078ContainedLinks(view);
		case AdjToolStrip2EditPart.VISUAL_ID:
			return getAdjToolStrip_3079ContainedLinks(view);
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return getAdjMenuStrip_3080ContainedLinks(view);
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return getAdjMenuStrip_3081ContainedLinks(view);
		case AdjToolStrip3EditPart.VISUAL_ID:
			return getAdjToolStrip_3082ContainedLinks(view);
		case AdjToolStrip4EditPart.VISUAL_ID:
			return getAdjToolStrip_3083ContainedLinks(view);
		case AdjGroupBox5EditPart.VISUAL_ID:
			return getAdjGroupBox_3084ContainedLinks(view);
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return getAdjMenuStrip_3085ContainedLinks(view);
		case AdjToolStrip5EditPart.VISUAL_ID:
			return getAdjToolStrip_3086ContainedLinks(view);
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
		case AdjDatepickerEditPart.VISUAL_ID:
			return getAdjDatepicker_3005IncomingLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006IncomingLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007IncomingLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008IncomingLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009IncomingLinks(view);
		case AdjTreeViewEditPart.VISUAL_ID:
			return getAdjTreeView_3010IncomingLinks(view);
		case AdjPropertyGridEditPart.VISUAL_ID:
			return getAdjPropertyGrid_3011IncomingLinks(view);
		case AdjProgressBarEditPart.VISUAL_ID:
			return getAdjProgressBar_3012IncomingLinks(view);
		case AdjDataGridViewEditPart.VISUAL_ID:
			return getAdjDataGridView_3013IncomingLinks(view);
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return getAdjDataGridViewTextBoxColumn_3014IncomingLinks(view);
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			return getAdjDatepicker_3020IncomingLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021IncomingLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022IncomingLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023IncomingLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024IncomingLinks(view);
		case AdjTreeView2EditPart.VISUAL_ID:
			return getAdjTreeView_3025IncomingLinks(view);
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3026IncomingLinks(view);
		case AdjProgressBar2EditPart.VISUAL_ID:
			return getAdjProgressBar_3027IncomingLinks(view);
		case AdjDataGridView2EditPart.VISUAL_ID:
			return getAdjDataGridView_3028IncomingLinks(view);
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			return getAdjDatepicker_3035IncomingLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036IncomingLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037IncomingLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038IncomingLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039IncomingLinks(view);
		case AdjTreeView3EditPart.VISUAL_ID:
			return getAdjTreeView_3040IncomingLinks(view);
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3041IncomingLinks(view);
		case AdjProgressBar3EditPart.VISUAL_ID:
			return getAdjProgressBar_3042IncomingLinks(view);
		case AdjDataGridView3EditPart.VISUAL_ID:
			return getAdjDataGridView_3043IncomingLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044IncomingLinks(view);
		case AdjMenuStripEditPart.VISUAL_ID:
			return getAdjMenuStrip_3045IncomingLinks(view);
		case AdjLabel4EditPart.VISUAL_ID:
			return getAdjLabel_3046IncomingLinks(view);
		case AdjCheckBox4EditPart.VISUAL_ID:
			return getAdjCheckBox_3047IncomingLinks(view);
		case AdjButton4EditPart.VISUAL_ID:
			return getAdjButton_3048IncomingLinks(view);
		case AdjListBox4EditPart.VISUAL_ID:
			return getAdjListBox_3049IncomingLinks(view);
		case AdjDatepicker4EditPart.VISUAL_ID:
			return getAdjDatepicker_3050IncomingLinks(view);
		case AdjTextBox4EditPart.VISUAL_ID:
			return getAdjTextBox_3051IncomingLinks(view);
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3052IncomingLinks(view);
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return getAdjLinkLabel_3053IncomingLinks(view);
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return getAdjRichTextBox_3054IncomingLinks(view);
		case AdjTreeView4EditPart.VISUAL_ID:
			return getAdjTreeView_3055IncomingLinks(view);
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3056IncomingLinks(view);
		case AdjProgressBar4EditPart.VISUAL_ID:
			return getAdjProgressBar_3057IncomingLinks(view);
		case AdjDataGridView4EditPart.VISUAL_ID:
			return getAdjDataGridView_3058IncomingLinks(view);
		case AdjPanel4EditPart.VISUAL_ID:
			return getAdjPanel_3059IncomingLinks(view);
		case AdjToolStripEditPart.VISUAL_ID:
			return getAdjToolStrip_3060IncomingLinks(view);
		case AdjLabel5EditPart.VISUAL_ID:
			return getAdjLabel_3061IncomingLinks(view);
		case AdjCheckBox5EditPart.VISUAL_ID:
			return getAdjCheckBox_3062IncomingLinks(view);
		case AdjButton5EditPart.VISUAL_ID:
			return getAdjButton_3063IncomingLinks(view);
		case AdjListBox5EditPart.VISUAL_ID:
			return getAdjListBox_3064IncomingLinks(view);
		case AdjDatepicker5EditPart.VISUAL_ID:
			return getAdjDatepicker_3065IncomingLinks(view);
		case AdjTextBox5EditPart.VISUAL_ID:
			return getAdjTextBox_3066IncomingLinks(view);
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3067IncomingLinks(view);
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return getAdjLinkLabel_3068IncomingLinks(view);
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return getAdjRichTextBox_3069IncomingLinks(view);
		case AdjTreeView5EditPart.VISUAL_ID:
			return getAdjTreeView_3070IncomingLinks(view);
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3071IncomingLinks(view);
		case AdjProgressBar5EditPart.VISUAL_ID:
			return getAdjProgressBar_3072IncomingLinks(view);
		case AdjDataGridView5EditPart.VISUAL_ID:
			return getAdjDataGridView_3073IncomingLinks(view);
		case AdjPanel5EditPart.VISUAL_ID:
			return getAdjPanel_3074IncomingLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3075IncomingLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3076IncomingLinks(view);
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return getAdjMenuStrip_3077IncomingLinks(view);
		case AdjGroupBox4EditPart.VISUAL_ID:
			return getAdjGroupBox_3078IncomingLinks(view);
		case AdjToolStrip2EditPart.VISUAL_ID:
			return getAdjToolStrip_3079IncomingLinks(view);
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return getAdjMenuStrip_3080IncomingLinks(view);
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return getAdjMenuStrip_3081IncomingLinks(view);
		case AdjToolStrip3EditPart.VISUAL_ID:
			return getAdjToolStrip_3082IncomingLinks(view);
		case AdjToolStrip4EditPart.VISUAL_ID:
			return getAdjToolStrip_3083IncomingLinks(view);
		case AdjGroupBox5EditPart.VISUAL_ID:
			return getAdjGroupBox_3084IncomingLinks(view);
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return getAdjMenuStrip_3085IncomingLinks(view);
		case AdjToolStrip5EditPart.VISUAL_ID:
			return getAdjToolStrip_3086IncomingLinks(view);
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
		case AdjDatepickerEditPart.VISUAL_ID:
			return getAdjDatepicker_3005OutgoingLinks(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006OutgoingLinks(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007OutgoingLinks(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008OutgoingLinks(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009OutgoingLinks(view);
		case AdjTreeViewEditPart.VISUAL_ID:
			return getAdjTreeView_3010OutgoingLinks(view);
		case AdjPropertyGridEditPart.VISUAL_ID:
			return getAdjPropertyGrid_3011OutgoingLinks(view);
		case AdjProgressBarEditPart.VISUAL_ID:
			return getAdjProgressBar_3012OutgoingLinks(view);
		case AdjDataGridViewEditPart.VISUAL_ID:
			return getAdjDataGridView_3013OutgoingLinks(view);
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return getAdjDataGridViewTextBoxColumn_3014OutgoingLinks(view);
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			return getAdjDatepicker_3020OutgoingLinks(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021OutgoingLinks(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022OutgoingLinks(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023OutgoingLinks(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024OutgoingLinks(view);
		case AdjTreeView2EditPart.VISUAL_ID:
			return getAdjTreeView_3025OutgoingLinks(view);
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3026OutgoingLinks(view);
		case AdjProgressBar2EditPart.VISUAL_ID:
			return getAdjProgressBar_3027OutgoingLinks(view);
		case AdjDataGridView2EditPart.VISUAL_ID:
			return getAdjDataGridView_3028OutgoingLinks(view);
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			return getAdjDatepicker_3035OutgoingLinks(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036OutgoingLinks(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037OutgoingLinks(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038OutgoingLinks(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039OutgoingLinks(view);
		case AdjTreeView3EditPart.VISUAL_ID:
			return getAdjTreeView_3040OutgoingLinks(view);
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3041OutgoingLinks(view);
		case AdjProgressBar3EditPart.VISUAL_ID:
			return getAdjProgressBar_3042OutgoingLinks(view);
		case AdjDataGridView3EditPart.VISUAL_ID:
			return getAdjDataGridView_3043OutgoingLinks(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044OutgoingLinks(view);
		case AdjMenuStripEditPart.VISUAL_ID:
			return getAdjMenuStrip_3045OutgoingLinks(view);
		case AdjLabel4EditPart.VISUAL_ID:
			return getAdjLabel_3046OutgoingLinks(view);
		case AdjCheckBox4EditPart.VISUAL_ID:
			return getAdjCheckBox_3047OutgoingLinks(view);
		case AdjButton4EditPart.VISUAL_ID:
			return getAdjButton_3048OutgoingLinks(view);
		case AdjListBox4EditPart.VISUAL_ID:
			return getAdjListBox_3049OutgoingLinks(view);
		case AdjDatepicker4EditPart.VISUAL_ID:
			return getAdjDatepicker_3050OutgoingLinks(view);
		case AdjTextBox4EditPart.VISUAL_ID:
			return getAdjTextBox_3051OutgoingLinks(view);
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3052OutgoingLinks(view);
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return getAdjLinkLabel_3053OutgoingLinks(view);
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return getAdjRichTextBox_3054OutgoingLinks(view);
		case AdjTreeView4EditPart.VISUAL_ID:
			return getAdjTreeView_3055OutgoingLinks(view);
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3056OutgoingLinks(view);
		case AdjProgressBar4EditPart.VISUAL_ID:
			return getAdjProgressBar_3057OutgoingLinks(view);
		case AdjDataGridView4EditPart.VISUAL_ID:
			return getAdjDataGridView_3058OutgoingLinks(view);
		case AdjPanel4EditPart.VISUAL_ID:
			return getAdjPanel_3059OutgoingLinks(view);
		case AdjToolStripEditPart.VISUAL_ID:
			return getAdjToolStrip_3060OutgoingLinks(view);
		case AdjLabel5EditPart.VISUAL_ID:
			return getAdjLabel_3061OutgoingLinks(view);
		case AdjCheckBox5EditPart.VISUAL_ID:
			return getAdjCheckBox_3062OutgoingLinks(view);
		case AdjButton5EditPart.VISUAL_ID:
			return getAdjButton_3063OutgoingLinks(view);
		case AdjListBox5EditPart.VISUAL_ID:
			return getAdjListBox_3064OutgoingLinks(view);
		case AdjDatepicker5EditPart.VISUAL_ID:
			return getAdjDatepicker_3065OutgoingLinks(view);
		case AdjTextBox5EditPart.VISUAL_ID:
			return getAdjTextBox_3066OutgoingLinks(view);
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3067OutgoingLinks(view);
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return getAdjLinkLabel_3068OutgoingLinks(view);
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return getAdjRichTextBox_3069OutgoingLinks(view);
		case AdjTreeView5EditPart.VISUAL_ID:
			return getAdjTreeView_3070OutgoingLinks(view);
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3071OutgoingLinks(view);
		case AdjProgressBar5EditPart.VISUAL_ID:
			return getAdjProgressBar_3072OutgoingLinks(view);
		case AdjDataGridView5EditPart.VISUAL_ID:
			return getAdjDataGridView_3073OutgoingLinks(view);
		case AdjPanel5EditPart.VISUAL_ID:
			return getAdjPanel_3074OutgoingLinks(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3075OutgoingLinks(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3076OutgoingLinks(view);
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return getAdjMenuStrip_3077OutgoingLinks(view);
		case AdjGroupBox4EditPart.VISUAL_ID:
			return getAdjGroupBox_3078OutgoingLinks(view);
		case AdjToolStrip2EditPart.VISUAL_ID:
			return getAdjToolStrip_3079OutgoingLinks(view);
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return getAdjMenuStrip_3080OutgoingLinks(view);
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return getAdjMenuStrip_3081OutgoingLinks(view);
		case AdjToolStrip3EditPart.VISUAL_ID:
			return getAdjToolStrip_3082OutgoingLinks(view);
		case AdjToolStrip4EditPart.VISUAL_ID:
			return getAdjToolStrip_3083OutgoingLinks(view);
		case AdjGroupBox5EditPart.VISUAL_ID:
			return getAdjGroupBox_3084OutgoingLinks(view);
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return getAdjMenuStrip_3085OutgoingLinks(view);
		case AdjToolStrip5EditPart.VISUAL_ID:
			return getAdjToolStrip_3086OutgoingLinks(view);
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3005ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridViewTextBoxColumn_3014ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3020ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3028ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3035ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3043ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3069ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3070ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3071ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3072ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3073ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3074ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3075ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3077ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3078ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3079ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3080ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3081ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3082ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3083ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3085ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3086ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3005IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridViewTextBoxColumn_3014IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3020IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3028IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3035IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3043IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3061IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3062IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3063IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3064IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3065IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3066IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3067IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3068IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3069IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3070IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3071IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3072IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3073IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3074IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3075IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3077IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3078IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3079IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3080IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3081IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3082IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3083IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3085IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3086IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3005OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridViewTextBoxColumn_3014OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3020OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3028OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3035OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3043OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLabel_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckBox_3062OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjButton_3063OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjListBox_3064OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDatepicker_3065OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTextBox_3066OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjCheckedListBox_3067OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjLinkLabel_3068OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjRichTextBox_3069OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjTreeView_3070OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPropertyGrid_3071OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjProgressBar_3072OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjDataGridView_3073OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjPanel_3074OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3075OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3077OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjGroupBox_3078OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3079OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3080OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3081OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3082OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3083OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getAdjMenuStrip_3085OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getAdjToolStrip_3086OutgoingLinks(View view) {
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
