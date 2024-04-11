/*
 * 
 */
package uidiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AdjButton2EditPart;
import uidiagram.diagram.edit.parts.AdjButton3EditPart;
import uidiagram.diagram.edit.parts.AdjButton4EditPart;
import uidiagram.diagram.edit.parts.AdjButton5EditPart;
import uidiagram.diagram.edit.parts.AdjButtonEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox4EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox5EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox4EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox5EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjDataGridView2EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridView3EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridView4EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridView5EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewEditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewTextBoxColumnEditPart;
import uidiagram.diagram.edit.parts.AdjDatepicker2EditPart;
import uidiagram.diagram.edit.parts.AdjDatepicker3EditPart;
import uidiagram.diagram.edit.parts.AdjDatepicker4EditPart;
import uidiagram.diagram.edit.parts.AdjDatepicker5EditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox4EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox5EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxEditPart;
import uidiagram.diagram.edit.parts.AdjLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLabel4EditPart;
import uidiagram.diagram.edit.parts.AdjLabel5EditPart;
import uidiagram.diagram.edit.parts.AdjLabelEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel4EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel5EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelEditPart;
import uidiagram.diagram.edit.parts.AdjListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjListBox4EditPart;
import uidiagram.diagram.edit.parts.AdjListBox5EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjMenuStrip2EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStrip3EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStrip4EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStrip5EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripEditPart;
import uidiagram.diagram.edit.parts.AdjPanel2EditPart;
import uidiagram.diagram.edit.parts.AdjPanel3EditPart;
import uidiagram.diagram.edit.parts.AdjPanel4EditPart;
import uidiagram.diagram.edit.parts.AdjPanel5EditPart;
import uidiagram.diagram.edit.parts.AdjPanelEditPart;
import uidiagram.diagram.edit.parts.AdjProgressBar2EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBar3EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBar4EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBar5EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarEditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGrid2EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGrid3EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGrid4EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGrid5EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox4EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox5EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox4EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox5EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjToolStrip2EditPart;
import uidiagram.diagram.edit.parts.AdjToolStrip3EditPart;
import uidiagram.diagram.edit.parts.AdjToolStrip4EditPart;
import uidiagram.diagram.edit.parts.AdjToolStrip5EditPart;
import uidiagram.diagram.edit.parts.AdjToolStripEditPart;
import uidiagram.diagram.edit.parts.AdjTreeView2EditPart;
import uidiagram.diagram.edit.parts.AdjTreeView3EditPart;
import uidiagram.diagram.edit.parts.AdjTreeView4EditPart;
import uidiagram.diagram.edit.parts.AdjTreeView5EditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewEditPart;
import uidiagram.diagram.edit.parts.FormUIEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UIDiagram_1000 = getElementType("uidiagram.diagram.UIDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FormUI_2001 = getElementType("uidiagram.diagram.FormUI_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLabel_3001 = getElementType("uidiagram.diagram.AdjLabel_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckBox_3002 = getElementType("uidiagram.diagram.AdjCheckBox_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjButton_3003 = getElementType("uidiagram.diagram.AdjButton_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListBox_3004 = getElementType("uidiagram.diagram.AdjListBox_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDatepicker_3005 = getElementType("uidiagram.diagram.AdjDatepicker_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTextBox_3006 = getElementType("uidiagram.diagram.AdjTextBox_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckedListBox_3007 = getElementType(
			"uidiagram.diagram.AdjCheckedListBox_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLinkLabel_3008 = getElementType("uidiagram.diagram.AdjLinkLabel_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRichTextBox_3009 = getElementType("uidiagram.diagram.AdjRichTextBox_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTreeView_3010 = getElementType("uidiagram.diagram.AdjTreeView_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPropertyGrid_3011 = getElementType("uidiagram.diagram.AdjPropertyGrid_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjProgressBar_3012 = getElementType("uidiagram.diagram.AdjProgressBar_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridView_3013 = getElementType("uidiagram.diagram.AdjDataGridView_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridViewTextBoxColumn_3014 = getElementType(
			"uidiagram.diagram.AdjDataGridViewTextBoxColumn_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3015 = getElementType("uidiagram.diagram.AdjPanel_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLabel_3016 = getElementType("uidiagram.diagram.AdjLabel_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckBox_3017 = getElementType("uidiagram.diagram.AdjCheckBox_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjButton_3018 = getElementType("uidiagram.diagram.AdjButton_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListBox_3019 = getElementType("uidiagram.diagram.AdjListBox_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDatepicker_3020 = getElementType("uidiagram.diagram.AdjDatepicker_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTextBox_3021 = getElementType("uidiagram.diagram.AdjTextBox_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckedListBox_3022 = getElementType(
			"uidiagram.diagram.AdjCheckedListBox_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLinkLabel_3023 = getElementType("uidiagram.diagram.AdjLinkLabel_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRichTextBox_3024 = getElementType("uidiagram.diagram.AdjRichTextBox_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTreeView_3025 = getElementType("uidiagram.diagram.AdjTreeView_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPropertyGrid_3026 = getElementType("uidiagram.diagram.AdjPropertyGrid_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjProgressBar_3027 = getElementType("uidiagram.diagram.AdjProgressBar_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridView_3028 = getElementType("uidiagram.diagram.AdjDataGridView_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3029 = getElementType("uidiagram.diagram.AdjPanel_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3030 = getElementType("uidiagram.diagram.AdjGroupBox_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLabel_3031 = getElementType("uidiagram.diagram.AdjLabel_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckBox_3032 = getElementType("uidiagram.diagram.AdjCheckBox_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjButton_3033 = getElementType("uidiagram.diagram.AdjButton_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListBox_3034 = getElementType("uidiagram.diagram.AdjListBox_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDatepicker_3035 = getElementType("uidiagram.diagram.AdjDatepicker_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTextBox_3036 = getElementType("uidiagram.diagram.AdjTextBox_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckedListBox_3037 = getElementType(
			"uidiagram.diagram.AdjCheckedListBox_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLinkLabel_3038 = getElementType("uidiagram.diagram.AdjLinkLabel_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRichTextBox_3039 = getElementType("uidiagram.diagram.AdjRichTextBox_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTreeView_3040 = getElementType("uidiagram.diagram.AdjTreeView_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPropertyGrid_3041 = getElementType("uidiagram.diagram.AdjPropertyGrid_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjProgressBar_3042 = getElementType("uidiagram.diagram.AdjProgressBar_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridView_3043 = getElementType("uidiagram.diagram.AdjDataGridView_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3044 = getElementType("uidiagram.diagram.AdjPanel_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjMenuStrip_3045 = getElementType("uidiagram.diagram.AdjMenuStrip_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLabel_3046 = getElementType("uidiagram.diagram.AdjLabel_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckBox_3047 = getElementType("uidiagram.diagram.AdjCheckBox_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjButton_3048 = getElementType("uidiagram.diagram.AdjButton_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListBox_3049 = getElementType("uidiagram.diagram.AdjListBox_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDatepicker_3050 = getElementType("uidiagram.diagram.AdjDatepicker_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTextBox_3051 = getElementType("uidiagram.diagram.AdjTextBox_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckedListBox_3052 = getElementType(
			"uidiagram.diagram.AdjCheckedListBox_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLinkLabel_3053 = getElementType("uidiagram.diagram.AdjLinkLabel_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRichTextBox_3054 = getElementType("uidiagram.diagram.AdjRichTextBox_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTreeView_3055 = getElementType("uidiagram.diagram.AdjTreeView_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPropertyGrid_3056 = getElementType("uidiagram.diagram.AdjPropertyGrid_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjProgressBar_3057 = getElementType("uidiagram.diagram.AdjProgressBar_3057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridView_3058 = getElementType("uidiagram.diagram.AdjDataGridView_3058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3059 = getElementType("uidiagram.diagram.AdjPanel_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjToolStrip_3060 = getElementType("uidiagram.diagram.AdjToolStrip_3060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLabel_3061 = getElementType("uidiagram.diagram.AdjLabel_3061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckBox_3062 = getElementType("uidiagram.diagram.AdjCheckBox_3062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjButton_3063 = getElementType("uidiagram.diagram.AdjButton_3063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListBox_3064 = getElementType("uidiagram.diagram.AdjListBox_3064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDatepicker_3065 = getElementType("uidiagram.diagram.AdjDatepicker_3065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTextBox_3066 = getElementType("uidiagram.diagram.AdjTextBox_3066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjCheckedListBox_3067 = getElementType(
			"uidiagram.diagram.AdjCheckedListBox_3067"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjLinkLabel_3068 = getElementType("uidiagram.diagram.AdjLinkLabel_3068"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRichTextBox_3069 = getElementType("uidiagram.diagram.AdjRichTextBox_3069"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjTreeView_3070 = getElementType("uidiagram.diagram.AdjTreeView_3070"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPropertyGrid_3071 = getElementType("uidiagram.diagram.AdjPropertyGrid_3071"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjProgressBar_3072 = getElementType("uidiagram.diagram.AdjProgressBar_3072"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjDataGridView_3073 = getElementType("uidiagram.diagram.AdjDataGridView_3073"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3074 = getElementType("uidiagram.diagram.AdjPanel_3074"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3075 = getElementType("uidiagram.diagram.AdjGroupBox_3075"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3076 = getElementType("uidiagram.diagram.AdjGroupBox_3076"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjMenuStrip_3077 = getElementType("uidiagram.diagram.AdjMenuStrip_3077"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3078 = getElementType("uidiagram.diagram.AdjGroupBox_3078"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjToolStrip_3079 = getElementType("uidiagram.diagram.AdjToolStrip_3079"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjMenuStrip_3080 = getElementType("uidiagram.diagram.AdjMenuStrip_3080"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjMenuStrip_3081 = getElementType("uidiagram.diagram.AdjMenuStrip_3081"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjToolStrip_3082 = getElementType("uidiagram.diagram.AdjToolStrip_3082"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjToolStrip_3083 = getElementType("uidiagram.diagram.AdjToolStrip_3083"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3084 = getElementType("uidiagram.diagram.AdjGroupBox_3084"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjMenuStrip_3085 = getElementType("uidiagram.diagram.AdjMenuStrip_3085"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjToolStrip_3086 = getElementType("uidiagram.diagram.AdjToolStrip_3086"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UIDiagram_1000, UidiagramPackage.eINSTANCE.getUIDiagram());

			elements.put(FormUI_2001, UidiagramPackage.eINSTANCE.getFormUI());

			elements.put(AdjLabel_3001, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3002, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3003, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3004, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDatepicker_3005, UidiagramPackage.eINSTANCE.getAdjDatepicker());

			elements.put(AdjTextBox_3006, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3007, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3008, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3009, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjTreeView_3010, UidiagramPackage.eINSTANCE.getAdjTreeView());

			elements.put(AdjPropertyGrid_3011, UidiagramPackage.eINSTANCE.getAdjPropertyGrid());

			elements.put(AdjProgressBar_3012, UidiagramPackage.eINSTANCE.getAdjProgressBar());

			elements.put(AdjDataGridView_3013, UidiagramPackage.eINSTANCE.getAdjDataGridView());

			elements.put(AdjDataGridViewTextBoxColumn_3014,
					UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn());

			elements.put(AdjPanel_3015, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjLabel_3016, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3017, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3018, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3019, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDatepicker_3020, UidiagramPackage.eINSTANCE.getAdjDatepicker());

			elements.put(AdjTextBox_3021, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3022, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3023, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3024, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjTreeView_3025, UidiagramPackage.eINSTANCE.getAdjTreeView());

			elements.put(AdjPropertyGrid_3026, UidiagramPackage.eINSTANCE.getAdjPropertyGrid());

			elements.put(AdjProgressBar_3027, UidiagramPackage.eINSTANCE.getAdjProgressBar());

			elements.put(AdjDataGridView_3028, UidiagramPackage.eINSTANCE.getAdjDataGridView());

			elements.put(AdjPanel_3029, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjGroupBox_3030, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjLabel_3031, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3032, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3033, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3034, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDatepicker_3035, UidiagramPackage.eINSTANCE.getAdjDatepicker());

			elements.put(AdjTextBox_3036, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3037, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3038, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3039, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjTreeView_3040, UidiagramPackage.eINSTANCE.getAdjTreeView());

			elements.put(AdjPropertyGrid_3041, UidiagramPackage.eINSTANCE.getAdjPropertyGrid());

			elements.put(AdjProgressBar_3042, UidiagramPackage.eINSTANCE.getAdjProgressBar());

			elements.put(AdjDataGridView_3043, UidiagramPackage.eINSTANCE.getAdjDataGridView());

			elements.put(AdjPanel_3044, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjMenuStrip_3045, UidiagramPackage.eINSTANCE.getAdjMenuStrip());

			elements.put(AdjLabel_3046, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3047, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3048, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3049, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDatepicker_3050, UidiagramPackage.eINSTANCE.getAdjDatepicker());

			elements.put(AdjTextBox_3051, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3052, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3053, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3054, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjTreeView_3055, UidiagramPackage.eINSTANCE.getAdjTreeView());

			elements.put(AdjPropertyGrid_3056, UidiagramPackage.eINSTANCE.getAdjPropertyGrid());

			elements.put(AdjProgressBar_3057, UidiagramPackage.eINSTANCE.getAdjProgressBar());

			elements.put(AdjDataGridView_3058, UidiagramPackage.eINSTANCE.getAdjDataGridView());

			elements.put(AdjPanel_3059, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjToolStrip_3060, UidiagramPackage.eINSTANCE.getAdjToolStrip());

			elements.put(AdjLabel_3061, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3062, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3063, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3064, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDatepicker_3065, UidiagramPackage.eINSTANCE.getAdjDatepicker());

			elements.put(AdjTextBox_3066, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3067, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3068, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3069, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjTreeView_3070, UidiagramPackage.eINSTANCE.getAdjTreeView());

			elements.put(AdjPropertyGrid_3071, UidiagramPackage.eINSTANCE.getAdjPropertyGrid());

			elements.put(AdjProgressBar_3072, UidiagramPackage.eINSTANCE.getAdjProgressBar());

			elements.put(AdjDataGridView_3073, UidiagramPackage.eINSTANCE.getAdjDataGridView());

			elements.put(AdjPanel_3074, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjGroupBox_3075, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjGroupBox_3076, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjMenuStrip_3077, UidiagramPackage.eINSTANCE.getAdjMenuStrip());

			elements.put(AdjGroupBox_3078, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjToolStrip_3079, UidiagramPackage.eINSTANCE.getAdjToolStrip());

			elements.put(AdjMenuStrip_3080, UidiagramPackage.eINSTANCE.getAdjMenuStrip());

			elements.put(AdjMenuStrip_3081, UidiagramPackage.eINSTANCE.getAdjMenuStrip());

			elements.put(AdjToolStrip_3082, UidiagramPackage.eINSTANCE.getAdjToolStrip());

			elements.put(AdjToolStrip_3083, UidiagramPackage.eINSTANCE.getAdjToolStrip());

			elements.put(AdjGroupBox_3084, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjMenuStrip_3085, UidiagramPackage.eINSTANCE.getAdjMenuStrip());

			elements.put(AdjToolStrip_3086, UidiagramPackage.eINSTANCE.getAdjToolStrip());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UIDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(FormUI_2001);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3001);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3002);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3003);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3004);
			KNOWN_ELEMENT_TYPES.add(AdjDatepicker_3005);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3006);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3007);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3008);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3009);
			KNOWN_ELEMENT_TYPES.add(AdjTreeView_3010);
			KNOWN_ELEMENT_TYPES.add(AdjPropertyGrid_3011);
			KNOWN_ELEMENT_TYPES.add(AdjProgressBar_3012);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridView_3013);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridViewTextBoxColumn_3014);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3015);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3016);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3017);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3018);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3019);
			KNOWN_ELEMENT_TYPES.add(AdjDatepicker_3020);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3021);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3022);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3023);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3024);
			KNOWN_ELEMENT_TYPES.add(AdjTreeView_3025);
			KNOWN_ELEMENT_TYPES.add(AdjPropertyGrid_3026);
			KNOWN_ELEMENT_TYPES.add(AdjProgressBar_3027);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridView_3028);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3029);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3030);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3031);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3032);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3033);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3034);
			KNOWN_ELEMENT_TYPES.add(AdjDatepicker_3035);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3036);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3037);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3038);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3039);
			KNOWN_ELEMENT_TYPES.add(AdjTreeView_3040);
			KNOWN_ELEMENT_TYPES.add(AdjPropertyGrid_3041);
			KNOWN_ELEMENT_TYPES.add(AdjProgressBar_3042);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridView_3043);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3044);
			KNOWN_ELEMENT_TYPES.add(AdjMenuStrip_3045);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3046);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3047);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3048);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3049);
			KNOWN_ELEMENT_TYPES.add(AdjDatepicker_3050);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3051);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3052);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3053);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3054);
			KNOWN_ELEMENT_TYPES.add(AdjTreeView_3055);
			KNOWN_ELEMENT_TYPES.add(AdjPropertyGrid_3056);
			KNOWN_ELEMENT_TYPES.add(AdjProgressBar_3057);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridView_3058);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3059);
			KNOWN_ELEMENT_TYPES.add(AdjToolStrip_3060);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3061);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3062);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3063);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3064);
			KNOWN_ELEMENT_TYPES.add(AdjDatepicker_3065);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3066);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3067);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3068);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3069);
			KNOWN_ELEMENT_TYPES.add(AdjTreeView_3070);
			KNOWN_ELEMENT_TYPES.add(AdjPropertyGrid_3071);
			KNOWN_ELEMENT_TYPES.add(AdjProgressBar_3072);
			KNOWN_ELEMENT_TYPES.add(AdjDataGridView_3073);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3074);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3075);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3076);
			KNOWN_ELEMENT_TYPES.add(AdjMenuStrip_3077);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3078);
			KNOWN_ELEMENT_TYPES.add(AdjToolStrip_3079);
			KNOWN_ELEMENT_TYPES.add(AdjMenuStrip_3080);
			KNOWN_ELEMENT_TYPES.add(AdjMenuStrip_3081);
			KNOWN_ELEMENT_TYPES.add(AdjToolStrip_3082);
			KNOWN_ELEMENT_TYPES.add(AdjToolStrip_3083);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3084);
			KNOWN_ELEMENT_TYPES.add(AdjMenuStrip_3085);
			KNOWN_ELEMENT_TYPES.add(AdjToolStrip_3086);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UIDiagramEditPart.VISUAL_ID:
			return UIDiagram_1000;
		case FormUIEditPart.VISUAL_ID:
			return FormUI_2001;
		case AdjLabelEditPart.VISUAL_ID:
			return AdjLabel_3001;
		case AdjCheckBoxEditPart.VISUAL_ID:
			return AdjCheckBox_3002;
		case AdjButtonEditPart.VISUAL_ID:
			return AdjButton_3003;
		case AdjListBoxEditPart.VISUAL_ID:
			return AdjListBox_3004;
		case AdjDatepickerEditPart.VISUAL_ID:
			return AdjDatepicker_3005;
		case AdjTextBoxEditPart.VISUAL_ID:
			return AdjTextBox_3006;
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return AdjCheckedListBox_3007;
		case AdjLinkLabelEditPart.VISUAL_ID:
			return AdjLinkLabel_3008;
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return AdjRichTextBox_3009;
		case AdjTreeViewEditPart.VISUAL_ID:
			return AdjTreeView_3010;
		case AdjPropertyGridEditPart.VISUAL_ID:
			return AdjPropertyGrid_3011;
		case AdjProgressBarEditPart.VISUAL_ID:
			return AdjProgressBar_3012;
		case AdjDataGridViewEditPart.VISUAL_ID:
			return AdjDataGridView_3013;
		case AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID:
			return AdjDataGridViewTextBoxColumn_3014;
		case AdjPanelEditPart.VISUAL_ID:
			return AdjPanel_3015;
		case AdjLabel2EditPart.VISUAL_ID:
			return AdjLabel_3016;
		case AdjCheckBox2EditPart.VISUAL_ID:
			return AdjCheckBox_3017;
		case AdjButton2EditPart.VISUAL_ID:
			return AdjButton_3018;
		case AdjListBox2EditPart.VISUAL_ID:
			return AdjListBox_3019;
		case AdjDatepicker2EditPart.VISUAL_ID:
			return AdjDatepicker_3020;
		case AdjTextBox2EditPart.VISUAL_ID:
			return AdjTextBox_3021;
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return AdjCheckedListBox_3022;
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return AdjLinkLabel_3023;
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return AdjRichTextBox_3024;
		case AdjTreeView2EditPart.VISUAL_ID:
			return AdjTreeView_3025;
		case AdjPropertyGrid2EditPart.VISUAL_ID:
			return AdjPropertyGrid_3026;
		case AdjProgressBar2EditPart.VISUAL_ID:
			return AdjProgressBar_3027;
		case AdjDataGridView2EditPart.VISUAL_ID:
			return AdjDataGridView_3028;
		case AdjPanel2EditPart.VISUAL_ID:
			return AdjPanel_3029;
		case AdjGroupBoxEditPart.VISUAL_ID:
			return AdjGroupBox_3030;
		case AdjLabel3EditPart.VISUAL_ID:
			return AdjLabel_3031;
		case AdjCheckBox3EditPart.VISUAL_ID:
			return AdjCheckBox_3032;
		case AdjButton3EditPart.VISUAL_ID:
			return AdjButton_3033;
		case AdjListBox3EditPart.VISUAL_ID:
			return AdjListBox_3034;
		case AdjDatepicker3EditPart.VISUAL_ID:
			return AdjDatepicker_3035;
		case AdjTextBox3EditPart.VISUAL_ID:
			return AdjTextBox_3036;
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return AdjCheckedListBox_3037;
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return AdjLinkLabel_3038;
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return AdjRichTextBox_3039;
		case AdjTreeView3EditPart.VISUAL_ID:
			return AdjTreeView_3040;
		case AdjPropertyGrid3EditPart.VISUAL_ID:
			return AdjPropertyGrid_3041;
		case AdjProgressBar3EditPart.VISUAL_ID:
			return AdjProgressBar_3042;
		case AdjDataGridView3EditPart.VISUAL_ID:
			return AdjDataGridView_3043;
		case AdjPanel3EditPart.VISUAL_ID:
			return AdjPanel_3044;
		case AdjMenuStripEditPart.VISUAL_ID:
			return AdjMenuStrip_3045;
		case AdjLabel4EditPart.VISUAL_ID:
			return AdjLabel_3046;
		case AdjCheckBox4EditPart.VISUAL_ID:
			return AdjCheckBox_3047;
		case AdjButton4EditPart.VISUAL_ID:
			return AdjButton_3048;
		case AdjListBox4EditPart.VISUAL_ID:
			return AdjListBox_3049;
		case AdjDatepicker4EditPart.VISUAL_ID:
			return AdjDatepicker_3050;
		case AdjTextBox4EditPart.VISUAL_ID:
			return AdjTextBox_3051;
		case AdjCheckedListBox4EditPart.VISUAL_ID:
			return AdjCheckedListBox_3052;
		case AdjLinkLabel4EditPart.VISUAL_ID:
			return AdjLinkLabel_3053;
		case AdjRichTextBox4EditPart.VISUAL_ID:
			return AdjRichTextBox_3054;
		case AdjTreeView4EditPart.VISUAL_ID:
			return AdjTreeView_3055;
		case AdjPropertyGrid4EditPart.VISUAL_ID:
			return AdjPropertyGrid_3056;
		case AdjProgressBar4EditPart.VISUAL_ID:
			return AdjProgressBar_3057;
		case AdjDataGridView4EditPart.VISUAL_ID:
			return AdjDataGridView_3058;
		case AdjPanel4EditPart.VISUAL_ID:
			return AdjPanel_3059;
		case AdjToolStripEditPart.VISUAL_ID:
			return AdjToolStrip_3060;
		case AdjLabel5EditPart.VISUAL_ID:
			return AdjLabel_3061;
		case AdjCheckBox5EditPart.VISUAL_ID:
			return AdjCheckBox_3062;
		case AdjButton5EditPart.VISUAL_ID:
			return AdjButton_3063;
		case AdjListBox5EditPart.VISUAL_ID:
			return AdjListBox_3064;
		case AdjDatepicker5EditPart.VISUAL_ID:
			return AdjDatepicker_3065;
		case AdjTextBox5EditPart.VISUAL_ID:
			return AdjTextBox_3066;
		case AdjCheckedListBox5EditPart.VISUAL_ID:
			return AdjCheckedListBox_3067;
		case AdjLinkLabel5EditPart.VISUAL_ID:
			return AdjLinkLabel_3068;
		case AdjRichTextBox5EditPart.VISUAL_ID:
			return AdjRichTextBox_3069;
		case AdjTreeView5EditPart.VISUAL_ID:
			return AdjTreeView_3070;
		case AdjPropertyGrid5EditPart.VISUAL_ID:
			return AdjPropertyGrid_3071;
		case AdjProgressBar5EditPart.VISUAL_ID:
			return AdjProgressBar_3072;
		case AdjDataGridView5EditPart.VISUAL_ID:
			return AdjDataGridView_3073;
		case AdjPanel5EditPart.VISUAL_ID:
			return AdjPanel_3074;
		case AdjGroupBox2EditPart.VISUAL_ID:
			return AdjGroupBox_3075;
		case AdjGroupBox3EditPart.VISUAL_ID:
			return AdjGroupBox_3076;
		case AdjMenuStrip2EditPart.VISUAL_ID:
			return AdjMenuStrip_3077;
		case AdjGroupBox4EditPart.VISUAL_ID:
			return AdjGroupBox_3078;
		case AdjToolStrip2EditPart.VISUAL_ID:
			return AdjToolStrip_3079;
		case AdjMenuStrip3EditPart.VISUAL_ID:
			return AdjMenuStrip_3080;
		case AdjMenuStrip4EditPart.VISUAL_ID:
			return AdjMenuStrip_3081;
		case AdjToolStrip3EditPart.VISUAL_ID:
			return AdjToolStrip_3082;
		case AdjToolStrip4EditPart.VISUAL_ID:
			return AdjToolStrip_3083;
		case AdjGroupBox5EditPart.VISUAL_ID:
			return AdjGroupBox_3084;
		case AdjMenuStrip5EditPart.VISUAL_ID:
			return AdjMenuStrip_3085;
		case AdjToolStrip5EditPart.VISUAL_ID:
			return AdjToolStrip_3086;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
