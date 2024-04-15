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
import uidiagram.diagram.edit.parts.AdjListViewColumnEditPart;
import uidiagram.diagram.edit.parts.AdjListViewEditPart;
import uidiagram.diagram.edit.parts.AdjPanel2EditPart;
import uidiagram.diagram.edit.parts.AdjPanel3EditPart;
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
	public static final IElementType AdjDateTimePicker_3098 = getElementType(
			"uidiagram.diagram.AdjDateTimePicker_3098"); //$NON-NLS-1$
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
	public static final IElementType AdjComboBox_3087 = getElementType("uidiagram.diagram.AdjComboBox_3087"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRadioButton_3099 = getElementType("uidiagram.diagram.AdjRadioButton_3099"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPictureBox_3100 = getElementType("uidiagram.diagram.AdjPictureBox_3100"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListView_3092 = getElementType("uidiagram.diagram.AdjListView_3092"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListViewColumn_3093 = getElementType(
			"uidiagram.diagram.AdjListViewColumn_3093"); //$NON-NLS-1$
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
	public static final IElementType AdjDateTimePicker_3101 = getElementType(
			"uidiagram.diagram.AdjDateTimePicker_3101"); //$NON-NLS-1$
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
	public static final IElementType AdjComboBox_3088 = getElementType("uidiagram.diagram.AdjComboBox_3088"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRadioButton_3102 = getElementType("uidiagram.diagram.AdjRadioButton_3102"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPictureBox_3103 = getElementType("uidiagram.diagram.AdjPictureBox_3103"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListView_3094 = getElementType("uidiagram.diagram.AdjListView_3094"); //$NON-NLS-1$
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
	public static final IElementType AdjDateTimePicker_3104 = getElementType(
			"uidiagram.diagram.AdjDateTimePicker_3104"); //$NON-NLS-1$
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
	public static final IElementType AdjComboBox_3089 = getElementType("uidiagram.diagram.AdjComboBox_3089"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjRadioButton_3105 = getElementType("uidiagram.diagram.AdjRadioButton_3105"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPictureBox_3106 = getElementType("uidiagram.diagram.AdjPictureBox_3106"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjListView_3095 = getElementType("uidiagram.diagram.AdjListView_3095"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjPanel_3044 = getElementType("uidiagram.diagram.AdjPanel_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3076 = getElementType("uidiagram.diagram.AdjGroupBox_3076"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdjGroupBox_3084 = getElementType("uidiagram.diagram.AdjGroupBox_3084"); //$NON-NLS-1$

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

			elements.put(AdjDateTimePicker_3098, UidiagramPackage.eINSTANCE.getAdjDateTimePicker());

			elements.put(AdjTextBox_3006, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3007, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3008, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3009, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjComboBox_3087, UidiagramPackage.eINSTANCE.getAdjComboBox());

			elements.put(AdjRadioButton_3099, UidiagramPackage.eINSTANCE.getAdjRadioButton());

			elements.put(AdjPictureBox_3100, UidiagramPackage.eINSTANCE.getAdjPictureBox());

			elements.put(AdjListView_3092, UidiagramPackage.eINSTANCE.getAdjListView());

			elements.put(AdjListViewColumn_3093, UidiagramPackage.eINSTANCE.getAdjListViewColumn());

			elements.put(AdjPanel_3015, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjLabel_3016, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3017, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3018, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3019, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDateTimePicker_3101, UidiagramPackage.eINSTANCE.getAdjDateTimePicker());

			elements.put(AdjTextBox_3021, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3022, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3023, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3024, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjComboBox_3088, UidiagramPackage.eINSTANCE.getAdjComboBox());

			elements.put(AdjRadioButton_3102, UidiagramPackage.eINSTANCE.getAdjRadioButton());

			elements.put(AdjPictureBox_3103, UidiagramPackage.eINSTANCE.getAdjPictureBox());

			elements.put(AdjListView_3094, UidiagramPackage.eINSTANCE.getAdjListView());

			elements.put(AdjPanel_3029, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjGroupBox_3030, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjLabel_3031, UidiagramPackage.eINSTANCE.getAdjLabel());

			elements.put(AdjCheckBox_3032, UidiagramPackage.eINSTANCE.getAdjCheckBox());

			elements.put(AdjButton_3033, UidiagramPackage.eINSTANCE.getAdjButton());

			elements.put(AdjListBox_3034, UidiagramPackage.eINSTANCE.getAdjListBox());

			elements.put(AdjDateTimePicker_3104, UidiagramPackage.eINSTANCE.getAdjDateTimePicker());

			elements.put(AdjTextBox_3036, UidiagramPackage.eINSTANCE.getAdjTextBox());

			elements.put(AdjCheckedListBox_3037, UidiagramPackage.eINSTANCE.getAdjCheckedListBox());

			elements.put(AdjLinkLabel_3038, UidiagramPackage.eINSTANCE.getAdjLinkLabel());

			elements.put(AdjRichTextBox_3039, UidiagramPackage.eINSTANCE.getAdjRichTextBox());

			elements.put(AdjComboBox_3089, UidiagramPackage.eINSTANCE.getAdjComboBox());

			elements.put(AdjRadioButton_3105, UidiagramPackage.eINSTANCE.getAdjRadioButton());

			elements.put(AdjPictureBox_3106, UidiagramPackage.eINSTANCE.getAdjPictureBox());

			elements.put(AdjListView_3095, UidiagramPackage.eINSTANCE.getAdjListView());

			elements.put(AdjPanel_3044, UidiagramPackage.eINSTANCE.getAdjPanel());

			elements.put(AdjGroupBox_3076, UidiagramPackage.eINSTANCE.getAdjGroupBox());

			elements.put(AdjGroupBox_3084, UidiagramPackage.eINSTANCE.getAdjGroupBox());
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
			KNOWN_ELEMENT_TYPES.add(AdjDateTimePicker_3098);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3006);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3007);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3008);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3009);
			KNOWN_ELEMENT_TYPES.add(AdjComboBox_3087);
			KNOWN_ELEMENT_TYPES.add(AdjRadioButton_3099);
			KNOWN_ELEMENT_TYPES.add(AdjPictureBox_3100);
			KNOWN_ELEMENT_TYPES.add(AdjListView_3092);
			KNOWN_ELEMENT_TYPES.add(AdjListViewColumn_3093);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3015);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3016);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3017);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3018);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3019);
			KNOWN_ELEMENT_TYPES.add(AdjDateTimePicker_3101);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3021);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3022);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3023);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3024);
			KNOWN_ELEMENT_TYPES.add(AdjComboBox_3088);
			KNOWN_ELEMENT_TYPES.add(AdjRadioButton_3102);
			KNOWN_ELEMENT_TYPES.add(AdjPictureBox_3103);
			KNOWN_ELEMENT_TYPES.add(AdjListView_3094);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3029);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3030);
			KNOWN_ELEMENT_TYPES.add(AdjLabel_3031);
			KNOWN_ELEMENT_TYPES.add(AdjCheckBox_3032);
			KNOWN_ELEMENT_TYPES.add(AdjButton_3033);
			KNOWN_ELEMENT_TYPES.add(AdjListBox_3034);
			KNOWN_ELEMENT_TYPES.add(AdjDateTimePicker_3104);
			KNOWN_ELEMENT_TYPES.add(AdjTextBox_3036);
			KNOWN_ELEMENT_TYPES.add(AdjCheckedListBox_3037);
			KNOWN_ELEMENT_TYPES.add(AdjLinkLabel_3038);
			KNOWN_ELEMENT_TYPES.add(AdjRichTextBox_3039);
			KNOWN_ELEMENT_TYPES.add(AdjComboBox_3089);
			KNOWN_ELEMENT_TYPES.add(AdjRadioButton_3105);
			KNOWN_ELEMENT_TYPES.add(AdjPictureBox_3106);
			KNOWN_ELEMENT_TYPES.add(AdjListView_3095);
			KNOWN_ELEMENT_TYPES.add(AdjPanel_3044);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3076);
			KNOWN_ELEMENT_TYPES.add(AdjGroupBox_3084);
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
		case AdjDateTimePickerEditPart.VISUAL_ID:
			return AdjDateTimePicker_3098;
		case AdjTextBoxEditPart.VISUAL_ID:
			return AdjTextBox_3006;
		case AdjCheckedListBoxEditPart.VISUAL_ID:
			return AdjCheckedListBox_3007;
		case AdjLinkLabelEditPart.VISUAL_ID:
			return AdjLinkLabel_3008;
		case AdjRichTextBoxEditPart.VISUAL_ID:
			return AdjRichTextBox_3009;
		case AdjComboBoxEditPart.VISUAL_ID:
			return AdjComboBox_3087;
		case AdjRadioButtonEditPart.VISUAL_ID:
			return AdjRadioButton_3099;
		case AdjPictureBoxEditPart.VISUAL_ID:
			return AdjPictureBox_3100;
		case AdjListViewEditPart.VISUAL_ID:
			return AdjListView_3092;
		case AdjListViewColumnEditPart.VISUAL_ID:
			return AdjListViewColumn_3093;
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
		case AdjDateTimePicker2EditPart.VISUAL_ID:
			return AdjDateTimePicker_3101;
		case AdjTextBox2EditPart.VISUAL_ID:
			return AdjTextBox_3021;
		case AdjCheckedListBox2EditPart.VISUAL_ID:
			return AdjCheckedListBox_3022;
		case AdjLinkLabel2EditPart.VISUAL_ID:
			return AdjLinkLabel_3023;
		case AdjRichTextBox2EditPart.VISUAL_ID:
			return AdjRichTextBox_3024;
		case AdjComboBox2EditPart.VISUAL_ID:
			return AdjComboBox_3088;
		case AdjRadioButton2EditPart.VISUAL_ID:
			return AdjRadioButton_3102;
		case AdjPictureBox2EditPart.VISUAL_ID:
			return AdjPictureBox_3103;
		case AdjListView2EditPart.VISUAL_ID:
			return AdjListView_3094;
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
		case AdjDateTimePicker3EditPart.VISUAL_ID:
			return AdjDateTimePicker_3104;
		case AdjTextBox3EditPart.VISUAL_ID:
			return AdjTextBox_3036;
		case AdjCheckedListBox3EditPart.VISUAL_ID:
			return AdjCheckedListBox_3037;
		case AdjLinkLabel3EditPart.VISUAL_ID:
			return AdjLinkLabel_3038;
		case AdjRichTextBox3EditPart.VISUAL_ID:
			return AdjRichTextBox_3039;
		case AdjComboBox3EditPart.VISUAL_ID:
			return AdjComboBox_3089;
		case AdjRadioButton3EditPart.VISUAL_ID:
			return AdjRadioButton_3105;
		case AdjPictureBox3EditPart.VISUAL_ID:
			return AdjPictureBox_3106;
		case AdjListView3EditPart.VISUAL_ID:
			return AdjListView_3095;
		case AdjPanel3EditPart.VISUAL_ID:
			return AdjPanel_3044;
		case AdjGroupBox2EditPart.VISUAL_ID:
			return AdjGroupBox_3076;
		case AdjGroupBox3EditPart.VISUAL_ID:
			return AdjGroupBox_3084;
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
