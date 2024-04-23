/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uidiagram.diagram.edit.parts.*;
import uidiagram.diagram.edit.parts.AdjButton2EditPart;
import uidiagram.diagram.edit.parts.AdjButton3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonEditPart;
import uidiagram.diagram.edit.parts.AdjButtonName2EditPart;
import uidiagram.diagram.edit.parts.AdjButtonName3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjComboBox2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBox3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxEditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerNameEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelEditPart;
import uidiagram.diagram.edit.parts.AdjLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjListView2EditPart;
import uidiagram.diagram.edit.parts.AdjListView3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnNameEditPart;
import uidiagram.diagram.edit.parts.AdjListViewEditPart;
import uidiagram.diagram.edit.parts.AdjListViewName2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewName3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewNameEditPart;
import uidiagram.diagram.edit.parts.AdjPanel2EditPart;
import uidiagram.diagram.edit.parts.AdjPanel3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelEditPart;
import uidiagram.diagram.edit.parts.AdjPanelName2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelNameEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.FormUIEditPart;
import uidiagram.diagram.edit.parts.FormUINameEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramParserProvider;

/**
 * @generated
 */
public class UidiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagramNavigatorItem && !isOwnView(((UidiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return UidiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?uidiagram?UIDiagram", UidiagramElementTypes.UIDiagram_1000); //$NON-NLS-1$
		case FormUIEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?uidiagram?FormUI", UidiagramElementTypes.FormUI_2001); //$NON-NLS-1$
		case AdjLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLabel", UidiagramElementTypes.AdjLabel_3001); //$NON-NLS-1$
		case AdjCheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckBox", UidiagramElementTypes.AdjCheckBox_3002); //$NON-NLS-1$
		case AdjButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjButton", UidiagramElementTypes.AdjButton_3003); //$NON-NLS-1$
		case AdjListBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListBox", UidiagramElementTypes.AdjListBox_3004); //$NON-NLS-1$
		case AdjTextBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3006); //$NON-NLS-1$
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3007); //$NON-NLS-1$
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3008); //$NON-NLS-1$
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3009); //$NON-NLS-1$
		case AdjPanelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3015); //$NON-NLS-1$
		case AdjLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLabel", UidiagramElementTypes.AdjLabel_3016); //$NON-NLS-1$
		case AdjCheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckBox", UidiagramElementTypes.AdjCheckBox_3017); //$NON-NLS-1$
		case AdjButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjButton", UidiagramElementTypes.AdjButton_3018); //$NON-NLS-1$
		case AdjListBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListBox", UidiagramElementTypes.AdjListBox_3019); //$NON-NLS-1$
		case AdjTextBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3021); //$NON-NLS-1$
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3022); //$NON-NLS-1$
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3023); //$NON-NLS-1$
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3024); //$NON-NLS-1$
		case AdjPanel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3029); //$NON-NLS-1$
		case AdjGroupBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3030); //$NON-NLS-1$
		case AdjLabel3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLabel", UidiagramElementTypes.AdjLabel_3031); //$NON-NLS-1$
		case AdjCheckBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckBox", UidiagramElementTypes.AdjCheckBox_3032); //$NON-NLS-1$
		case AdjButton3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjButton", UidiagramElementTypes.AdjButton_3033); //$NON-NLS-1$
		case AdjListBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListBox", UidiagramElementTypes.AdjListBox_3034); //$NON-NLS-1$
		case AdjTextBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3036); //$NON-NLS-1$
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3037); //$NON-NLS-1$
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3038); //$NON-NLS-1$
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3039); //$NON-NLS-1$
		case AdjPanel3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3044); //$NON-NLS-1$
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3076); //$NON-NLS-1$
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3084); //$NON-NLS-1$
		case AdjComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjComboBox", UidiagramElementTypes.AdjComboBox_3087); //$NON-NLS-1$
		case AdjComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjComboBox", UidiagramElementTypes.AdjComboBox_3088); //$NON-NLS-1$
		case AdjComboBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjComboBox", UidiagramElementTypes.AdjComboBox_3089); //$NON-NLS-1$
		case AdjListViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListView", UidiagramElementTypes.AdjListView_3092); //$NON-NLS-1$
		case AdjListViewColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListViewColumn", UidiagramElementTypes.AdjListViewColumn_3093); //$NON-NLS-1$
		case AdjListView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListView", UidiagramElementTypes.AdjListView_3094); //$NON-NLS-1$
		case AdjListView3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListView", UidiagramElementTypes.AdjListView_3095); //$NON-NLS-1$
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDateTimePicker", UidiagramElementTypes.AdjDateTimePicker_3098); //$NON-NLS-1$
		case AdjRadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRadioButton", UidiagramElementTypes.AdjRadioButton_3099); //$NON-NLS-1$
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDateTimePicker", UidiagramElementTypes.AdjDateTimePicker_3101); //$NON-NLS-1$
		case AdjRadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRadioButton", UidiagramElementTypes.AdjRadioButton_3102); //$NON-NLS-1$
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDateTimePicker", UidiagramElementTypes.AdjDateTimePicker_3104); //$NON-NLS-1$
		case AdjRadioButton3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRadioButton", UidiagramElementTypes.AdjRadioButton_3105); //$NON-NLS-1$
		case AdjPictureBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPictureBox", UidiagramElementTypes.AdjPictureBox_3106); //$NON-NLS-1$
		case AdjPictureBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPictureBox", UidiagramElementTypes.AdjPictureBox_3107); //$NON-NLS-1$
		case AdjPictureBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPictureBox", UidiagramElementTypes.AdjPictureBox_3108); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagramElementTypes.isKnownElementType(elementType)) {
			image = UidiagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000Text(view);
		case FormUIEditPart.VISUAL_ID:
			return getFormUI_2001Text(view);
		case AdjLabelEditPart.VISUAL_ID:
			return getAdjLabel_3001Text(view);
		case AdjCheckBoxEditPart.VISUAL_ID:
			return getAdjCheckBox_3002Text(view);
		case AdjButtonEditPart.VISUAL_ID:
			return getAdjButton_3003Text(view);
		case AdjListBoxEditPart.VISUAL_ID:
			return getAdjListBox_3004Text(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006Text(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007Text(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008Text(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009Text(view);
		case AdjPanelEditPart.VISUAL_ID:
			return getAdjPanel_3015Text(view);
		case AdjLabel2EditPart.VISUAL_ID:
			return getAdjLabel_3016Text(view);
		case AdjCheckBox2EditPart.VISUAL_ID:
			return getAdjCheckBox_3017Text(view);
		case AdjButton2EditPart.VISUAL_ID:
			return getAdjButton_3018Text(view);
		case AdjListBox2EditPart.VISUAL_ID:
			return getAdjListBox_3019Text(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021Text(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022Text(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023Text(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024Text(view);
		case AdjPanel2EditPart.VISUAL_ID:
			return getAdjPanel_3029Text(view);
		case AdjGroupBoxEditPart.VISUAL_ID:
			return getAdjGroupBox_3030Text(view);
		case AdjLabel3EditPart.VISUAL_ID:
			return getAdjLabel_3031Text(view);
		case AdjCheckBox3EditPart.VISUAL_ID:
			return getAdjCheckBox_3032Text(view);
		case AdjButton3EditPart.VISUAL_ID:
			return getAdjButton_3033Text(view);
		case AdjListBox3EditPart.VISUAL_ID:
			return getAdjListBox_3034Text(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036Text(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037Text(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038Text(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039Text(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044Text(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3076Text(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3084Text(view);
		case AdjComboBoxEditPart.VISUAL_ID:
			return getAdjComboBox_3087Text(view);
		case AdjComboBox2EditPart.VISUAL_ID:
			return getAdjComboBox_3088Text(view);
		case AdjComboBox3EditPart.VISUAL_ID:
			return getAdjComboBox_3089Text(view);
		case AdjListViewEditPart.VISUAL_ID:
			return getAdjListView_3092Text(view);
		case AdjListViewColumnEditPart.VISUAL_ID:
			return getAdjListViewColumn_3093Text(view);
		case AdjListView2EditPart.VISUAL_ID:
			return getAdjListView_3094Text(view);
		case AdjListView3EditPart.VISUAL_ID:
			return getAdjListView_3095Text(view);
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return getAdjDateTimePicker_3098Text(view);
		case AdjRadioButtonEditPart.VISUAL_ID:
			return getAdjRadioButton_3099Text(view);
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3101Text(view);
		case AdjRadioButton2EditPart.VISUAL_ID:
			return getAdjRadioButton_3102Text(view);
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return getAdjDateTimePicker_3104Text(view);
		case AdjRadioButton3EditPart.VISUAL_ID:
			return getAdjRadioButton_3105Text(view);
		case AdjPictureBoxEditPart.VISUAL_ID:
			return getAdjPictureBox_3106Text(view);
		case AdjPictureBox2EditPart.VISUAL_ID:
			return getAdjPictureBox_3107Text(view);
		case AdjPictureBox3EditPart.VISUAL_ID:
			return getAdjPictureBox_3108Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUIDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFormUI_2001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.FormUI_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(FormUINameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLabel_3001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLabel_3001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLabelTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckBox_3002Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckBox_3002,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjButton_3003Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjButton_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjButtonTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListBox_3004Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListBox_3004,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckedListBox_3007Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckedListBox_3007,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLinkLabel_3008Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLinkLabel_3008,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLinkLabelTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRichTextBox_3009Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRichTextBox_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLabel_3016Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLabel_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLabelText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckBox_3017Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckBox_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjButton_3018Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjButton_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjButtonText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListBox_3019Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListBox_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3021Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3021,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckedListBox_3022Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckedListBox_3022,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLinkLabel_3023Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLinkLabel_3023,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLinkLabelText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRichTextBox_3024Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRichTextBox_3024,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3029Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3029,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3030Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3030,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLabel_3031Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLabel_3031,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLabelText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckBox_3032Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckBox_3032,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjButton_3033Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjButton_3033,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjButtonText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListBox_3034Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListBox_3034,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3036Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3036,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckedListBox_3037Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckedListBox_3037,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLinkLabel_3038Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLinkLabel_3038,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLinkLabelText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRichTextBox_3039Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRichTextBox_3039,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3044Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3044,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3076Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3076,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3084Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3084,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjComboBox_3087Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjComboBox_3087,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjComboBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjComboBox_3088Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjComboBox_3088,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjComboBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjComboBox_3089Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjComboBox_3089,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjComboBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListView_3092Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListView_3092,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListViewTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListViewColumn_3093Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListViewColumn_3093,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListViewColumnTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListView_3094Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListView_3094,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListViewText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListView_3095Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListView_3095,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListViewText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDateTimePicker_3098Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDateTimePicker_3098,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDateTimePickerTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRadioButton_3099Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRadioButton_3099,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRadioButtonTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDateTimePicker_3101Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDateTimePicker_3101,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDateTimePickerText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRadioButton_3102Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRadioButton_3102,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRadioButtonText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDateTimePicker_3104Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDateTimePicker_3104,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDateTimePickerText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRadioButton_3105Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRadioButton_3105,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRadioButtonText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPictureBox_3106Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPictureBox_3106,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPictureBoxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPictureBox_3107Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPictureBox_3107,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPictureBoxText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPictureBox_3108Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPictureBox_3108,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPictureBoxText3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return UIDiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

}
