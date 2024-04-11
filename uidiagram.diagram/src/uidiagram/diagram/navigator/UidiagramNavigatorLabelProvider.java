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
		case AdjDatepickerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDatepicker", UidiagramElementTypes.AdjDatepicker_3005); //$NON-NLS-1$
		case AdjTextBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3006); //$NON-NLS-1$
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3007); //$NON-NLS-1$
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3008); //$NON-NLS-1$
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3009); //$NON-NLS-1$
		case AdjTreeViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTreeView", UidiagramElementTypes.AdjTreeView_3010); //$NON-NLS-1$
		case AdjPropertyGridEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPropertyGrid", UidiagramElementTypes.AdjPropertyGrid_3011); //$NON-NLS-1$
		case AdjProgressBarEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjProgressBar", UidiagramElementTypes.AdjProgressBar_3012); //$NON-NLS-1$
		case AdjDataGridViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridView", UidiagramElementTypes.AdjDataGridView_3013); //$NON-NLS-1$
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridViewTextBoxColumn", //$NON-NLS-1$
					UidiagramElementTypes.AdjDataGridViewTextBoxColumn_3014);
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDatepicker", UidiagramElementTypes.AdjDatepicker_3020); //$NON-NLS-1$
		case AdjTextBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3021); //$NON-NLS-1$
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3022); //$NON-NLS-1$
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3023); //$NON-NLS-1$
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3024); //$NON-NLS-1$
		case AdjTreeView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTreeView", UidiagramElementTypes.AdjTreeView_3025); //$NON-NLS-1$
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPropertyGrid", UidiagramElementTypes.AdjPropertyGrid_3026); //$NON-NLS-1$
		case AdjProgressBar2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjProgressBar", UidiagramElementTypes.AdjProgressBar_3027); //$NON-NLS-1$
		case AdjDataGridView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridView", UidiagramElementTypes.AdjDataGridView_3028); //$NON-NLS-1$
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDatepicker", UidiagramElementTypes.AdjDatepicker_3035); //$NON-NLS-1$
		case AdjTextBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3036); //$NON-NLS-1$
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3037); //$NON-NLS-1$
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3038); //$NON-NLS-1$
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3039); //$NON-NLS-1$
		case AdjTreeView3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTreeView", UidiagramElementTypes.AdjTreeView_3040); //$NON-NLS-1$
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPropertyGrid", UidiagramElementTypes.AdjPropertyGrid_3041); //$NON-NLS-1$
		case AdjProgressBar3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjProgressBar", UidiagramElementTypes.AdjProgressBar_3042); //$NON-NLS-1$
		case AdjDataGridView3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridView", UidiagramElementTypes.AdjDataGridView_3043); //$NON-NLS-1$
		case AdjPanel3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3044); //$NON-NLS-1$
		case AdjMenuStripEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjMenuStrip", UidiagramElementTypes.AdjMenuStrip_3045); //$NON-NLS-1$
		case AdjLabel4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLabel", UidiagramElementTypes.AdjLabel_3046); //$NON-NLS-1$
		case AdjCheckBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckBox", UidiagramElementTypes.AdjCheckBox_3047); //$NON-NLS-1$
		case AdjButton4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjButton", UidiagramElementTypes.AdjButton_3048); //$NON-NLS-1$
		case AdjListBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListBox", UidiagramElementTypes.AdjListBox_3049); //$NON-NLS-1$
		case AdjDatepicker4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDatepicker", UidiagramElementTypes.AdjDatepicker_3050); //$NON-NLS-1$
		case AdjTextBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3051); //$NON-NLS-1$
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3052); //$NON-NLS-1$
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3053); //$NON-NLS-1$
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3054); //$NON-NLS-1$
		case AdjTreeView4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTreeView", UidiagramElementTypes.AdjTreeView_3055); //$NON-NLS-1$
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPropertyGrid", UidiagramElementTypes.AdjPropertyGrid_3056); //$NON-NLS-1$
		case AdjProgressBar4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjProgressBar", UidiagramElementTypes.AdjProgressBar_3057); //$NON-NLS-1$
		case AdjDataGridView4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridView", UidiagramElementTypes.AdjDataGridView_3058); //$NON-NLS-1$
		case AdjPanel4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3059); //$NON-NLS-1$
		case AdjToolStripEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjToolStrip", UidiagramElementTypes.AdjToolStrip_3060); //$NON-NLS-1$
		case AdjLabel5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLabel", UidiagramElementTypes.AdjLabel_3061); //$NON-NLS-1$
		case AdjCheckBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckBox", UidiagramElementTypes.AdjCheckBox_3062); //$NON-NLS-1$
		case AdjButton5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjButton", UidiagramElementTypes.AdjButton_3063); //$NON-NLS-1$
		case AdjListBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjListBox", UidiagramElementTypes.AdjListBox_3064); //$NON-NLS-1$
		case AdjDatepicker5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDatepicker", UidiagramElementTypes.AdjDatepicker_3065); //$NON-NLS-1$
		case AdjTextBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTextBox", UidiagramElementTypes.AdjTextBox_3066); //$NON-NLS-1$
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjCheckedListBox", UidiagramElementTypes.AdjCheckedListBox_3067); //$NON-NLS-1$
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjLinkLabel", UidiagramElementTypes.AdjLinkLabel_3068); //$NON-NLS-1$
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjRichTextBox", UidiagramElementTypes.AdjRichTextBox_3069); //$NON-NLS-1$
		case AdjTreeView5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjTreeView", UidiagramElementTypes.AdjTreeView_3070); //$NON-NLS-1$
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPropertyGrid", UidiagramElementTypes.AdjPropertyGrid_3071); //$NON-NLS-1$
		case AdjProgressBar5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjProgressBar", UidiagramElementTypes.AdjProgressBar_3072); //$NON-NLS-1$
		case AdjDataGridView5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjDataGridView", UidiagramElementTypes.AdjDataGridView_3073); //$NON-NLS-1$
		case AdjPanel5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjPanel", UidiagramElementTypes.AdjPanel_3074); //$NON-NLS-1$
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3075); //$NON-NLS-1$
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3076); //$NON-NLS-1$
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjMenuStrip", UidiagramElementTypes.AdjMenuStrip_3077); //$NON-NLS-1$
		case AdjGroupBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3078); //$NON-NLS-1$
		case AdjToolStrip2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjToolStrip", UidiagramElementTypes.AdjToolStrip_3079); //$NON-NLS-1$
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjMenuStrip", UidiagramElementTypes.AdjMenuStrip_3080); //$NON-NLS-1$
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjMenuStrip", UidiagramElementTypes.AdjMenuStrip_3081); //$NON-NLS-1$
		case AdjToolStrip3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjToolStrip", UidiagramElementTypes.AdjToolStrip_3082); //$NON-NLS-1$
		case AdjToolStrip4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjToolStrip", UidiagramElementTypes.AdjToolStrip_3083); //$NON-NLS-1$
		case AdjGroupBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjGroupBox", UidiagramElementTypes.AdjGroupBox_3084); //$NON-NLS-1$
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjMenuStrip", UidiagramElementTypes.AdjMenuStrip_3085); //$NON-NLS-1$
		case AdjToolStrip5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?AdjToolStrip", UidiagramElementTypes.AdjToolStrip_3086); //$NON-NLS-1$
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
		case AdjDatepickerEditPart.VISUAL_ID:
			return getAdjDatepicker_3005Text(view);
		case AdjTextBoxEditPart.VISUAL_ID:
			return getAdjTextBox_3006Text(view);
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return getAdjCheckedListBox_3007Text(view);
		case AdjLinkLabelEditPart.VISUAL_ID:
			return getAdjLinkLabel_3008Text(view);
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return getAdjRichTextBox_3009Text(view);
		case AdjTreeViewEditPart.VISUAL_ID:
			return getAdjTreeView_3010Text(view);
		case AdjPropertyGridEditPart.VISUAL_ID:
			return getAdjPropertyGrid_3011Text(view);
		case AdjProgressBarEditPart.VISUAL_ID:
			return getAdjProgressBar_3012Text(view);
		case AdjDataGridViewEditPart.VISUAL_ID:
			return getAdjDataGridView_3013Text(view);
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return getAdjDataGridViewTextBoxColumn_3014Text(view);
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
		case AdjDatepicker2EditPart.VISUAL_ID:
			return getAdjDatepicker_3020Text(view);
		case AdjTextBox2EditPart.VISUAL_ID:
			return getAdjTextBox_3021Text(view);
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3022Text(view);
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return getAdjLinkLabel_3023Text(view);
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return getAdjRichTextBox_3024Text(view);
		case AdjTreeView2EditPart.VISUAL_ID:
			return getAdjTreeView_3025Text(view);
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3026Text(view);
		case AdjProgressBar2EditPart.VISUAL_ID:
			return getAdjProgressBar_3027Text(view);
		case AdjDataGridView2EditPart.VISUAL_ID:
			return getAdjDataGridView_3028Text(view);
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
		case AdjDatepicker3EditPart.VISUAL_ID:
			return getAdjDatepicker_3035Text(view);
		case AdjTextBox3EditPart.VISUAL_ID:
			return getAdjTextBox_3036Text(view);
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3037Text(view);
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return getAdjLinkLabel_3038Text(view);
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return getAdjRichTextBox_3039Text(view);
		case AdjTreeView3EditPart.VISUAL_ID:
			return getAdjTreeView_3040Text(view);
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3041Text(view);
		case AdjProgressBar3EditPart.VISUAL_ID:
			return getAdjProgressBar_3042Text(view);
		case AdjDataGridView3EditPart.VISUAL_ID:
			return getAdjDataGridView_3043Text(view);
		case AdjPanel3EditPart.VISUAL_ID:
			return getAdjPanel_3044Text(view);
		case AdjMenuStripEditPart.VISUAL_ID:
			return getAdjMenuStrip_3045Text(view);
		case AdjLabel4EditPart.VISUAL_ID:
			return getAdjLabel_3046Text(view);
		case AdjCheckBox4EditPart.VISUAL_ID:
			return getAdjCheckBox_3047Text(view);
		case AdjButton4EditPart.VISUAL_ID:
			return getAdjButton_3048Text(view);
		case AdjListBox4EditPart.VISUAL_ID:
			return getAdjListBox_3049Text(view);
		case AdjDatepicker4EditPart.VISUAL_ID:
			return getAdjDatepicker_3050Text(view);
		case AdjTextBox4EditPart.VISUAL_ID:
			return getAdjTextBox_3051Text(view);
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3052Text(view);
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return getAdjLinkLabel_3053Text(view);
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return getAdjRichTextBox_3054Text(view);
		case AdjTreeView4EditPart.VISUAL_ID:
			return getAdjTreeView_3055Text(view);
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3056Text(view);
		case AdjProgressBar4EditPart.VISUAL_ID:
			return getAdjProgressBar_3057Text(view);
		case AdjDataGridView4EditPart.VISUAL_ID:
			return getAdjDataGridView_3058Text(view);
		case AdjPanel4EditPart.VISUAL_ID:
			return getAdjPanel_3059Text(view);
		case AdjToolStripEditPart.VISUAL_ID:
			return getAdjToolStrip_3060Text(view);
		case AdjLabel5EditPart.VISUAL_ID:
			return getAdjLabel_3061Text(view);
		case AdjCheckBox5EditPart.VISUAL_ID:
			return getAdjCheckBox_3062Text(view);
		case AdjButton5EditPart.VISUAL_ID:
			return getAdjButton_3063Text(view);
		case AdjListBox5EditPart.VISUAL_ID:
			return getAdjListBox_3064Text(view);
		case AdjDatepicker5EditPart.VISUAL_ID:
			return getAdjDatepicker_3065Text(view);
		case AdjTextBox5EditPart.VISUAL_ID:
			return getAdjTextBox_3066Text(view);
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return getAdjCheckedListBox_3067Text(view);
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return getAdjLinkLabel_3068Text(view);
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return getAdjRichTextBox_3069Text(view);
		case AdjTreeView5EditPart.VISUAL_ID:
			return getAdjTreeView_3070Text(view);
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return getAdjPropertyGrid_3071Text(view);
		case AdjProgressBar5EditPart.VISUAL_ID:
			return getAdjProgressBar_3072Text(view);
		case AdjDataGridView5EditPart.VISUAL_ID:
			return getAdjDataGridView_3073Text(view);
		case AdjPanel5EditPart.VISUAL_ID:
			return getAdjPanel_3074Text(view);
		case AdjGroupBox2EditPart.VISUAL_ID:
			return getAdjGroupBox_3075Text(view);
		case AdjGroupBox3EditPart.VISUAL_ID:
			return getAdjGroupBox_3076Text(view);
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return getAdjMenuStrip_3077Text(view);
		case AdjGroupBox4EditPart.VISUAL_ID:
			return getAdjGroupBox_3078Text(view);
		case AdjToolStrip2EditPart.VISUAL_ID:
			return getAdjToolStrip_3079Text(view);
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return getAdjMenuStrip_3080Text(view);
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return getAdjMenuStrip_3081Text(view);
		case AdjToolStrip3EditPart.VISUAL_ID:
			return getAdjToolStrip_3082Text(view);
		case AdjToolStrip4EditPart.VISUAL_ID:
			return getAdjToolStrip_3083Text(view);
		case AdjGroupBox5EditPart.VISUAL_ID:
			return getAdjGroupBox_3084Text(view);
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return getAdjMenuStrip_3085Text(view);
		case AdjToolStrip5EditPart.VISUAL_ID:
			return getAdjToolStrip_3086Text(view);
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
				UidiagramVisualIDRegistry.getType(AdjLabelNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckBoxNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjButtonNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjListBoxNameEditPart.VISUAL_ID));
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
	private String getAdjDatepicker_3005Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDatepicker_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDatepickerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjLinkLabelNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxNameEditPart.VISUAL_ID));
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
	private String getAdjTreeView_3010Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTreeView_3010,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTreeViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPropertyGrid_3011Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPropertyGrid_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPropertyGridNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjProgressBar_3012Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjProgressBar_3012,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjProgressBarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridView_3013Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridView_3013,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridViewTextBoxColumn_3014Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridViewTextBoxColumn_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjLabelName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckBoxName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjButtonName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjListBoxName2EditPart.VISUAL_ID));
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
	private String getAdjDatepicker_3020Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDatepicker_3020,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDatepickerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3021Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3021,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjLinkLabelName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxName2EditPart.VISUAL_ID));
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
	private String getAdjTreeView_3025Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTreeView_3025,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTreeViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPropertyGrid_3026Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPropertyGrid_3026,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPropertyGridName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjProgressBar_3027Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjProgressBar_3027,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjProgressBarName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridView_3028Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridView_3028,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3029Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3029,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelName2EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjGroupBoxNameEditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjLabelName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckBoxName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjButtonName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjListBoxName3EditPart.VISUAL_ID));
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
	private String getAdjDatepicker_3035Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDatepicker_3035,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDatepickerName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3036Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3036,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjLinkLabelName3EditPart.VISUAL_ID));
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
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxName3EditPart.VISUAL_ID));
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
	private String getAdjTreeView_3040Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTreeView_3040,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTreeViewName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPropertyGrid_3041Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPropertyGrid_3041,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPropertyGridName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjProgressBar_3042Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjProgressBar_3042,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjProgressBarName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridView_3043Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridView_3043,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3044Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3044,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelName3EditPart.VISUAL_ID));
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
	private String getAdjMenuStrip_3045Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjMenuStrip_3045,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjMenuStripNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLabel_3046Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLabel_3046,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLabelName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckBox_3047Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckBox_3047,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjButton_3048Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjButton_3048,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjButtonName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListBox_3049Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListBox_3049,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDatepicker_3050Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDatepicker_3050,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDatepickerName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3051Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3051,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckedListBox_3052Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckedListBox_3052,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLinkLabel_3053Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLinkLabel_3053,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLinkLabelName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRichTextBox_3054Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRichTextBox_3054,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTreeView_3055Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTreeView_3055,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTreeViewName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPropertyGrid_3056Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPropertyGrid_3056,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPropertyGridName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjProgressBar_3057Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjProgressBar_3057,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjProgressBarName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridView_3058Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridView_3058,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3059Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3059,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjToolStrip_3060Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjToolStrip_3060,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjToolStripNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLabel_3061Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLabel_3061,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLabelName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckBox_3062Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckBox_3062,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjButton_3063Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjButton_3063,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjButtonName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjListBox_3064Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjListBox_3064,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjListBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDatepicker_3065Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDatepicker_3065,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDatepickerName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTextBox_3066Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTextBox_3066,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTextBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjCheckedListBox_3067Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjCheckedListBox_3067,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjCheckedListBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjLinkLabel_3068Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjLinkLabel_3068,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjLinkLabelName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjRichTextBox_3069Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjRichTextBox_3069,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjRichTextBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjTreeView_3070Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjTreeView_3070,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjTreeViewName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPropertyGrid_3071Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPropertyGrid_3071,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPropertyGridName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjProgressBar_3072Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjProgressBar_3072,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjProgressBarName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjDataGridView_3073Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjDataGridView_3073,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjDataGridViewName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjPanel_3074Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjPanel_3074,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjPanelName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3075Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3075,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3076Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3076,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxName3EditPart.VISUAL_ID));
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
	private String getAdjMenuStrip_3077Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjMenuStrip_3077,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjMenuStripName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3078Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3078,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjToolStrip_3079Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjToolStrip_3079,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjToolStripName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjMenuStrip_3080Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjMenuStrip_3080,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjMenuStripName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjMenuStrip_3081Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjMenuStrip_3081,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjMenuStripName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjToolStrip_3082Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjToolStrip_3082,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjToolStripName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjToolStrip_3083Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjToolStrip_3083,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjToolStripName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjGroupBox_3084Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjGroupBox_3084,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjGroupBoxName5EditPart.VISUAL_ID));
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
	private String getAdjMenuStrip_3085Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjMenuStrip_3085,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjMenuStripName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdjToolStrip_3086Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.AdjToolStrip_3086,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AdjToolStripName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
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
