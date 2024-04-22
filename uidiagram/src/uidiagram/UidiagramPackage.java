/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramFactory
 * @model kind="package"
 * @generated
 */
public interface UidiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uidiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uidiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uidiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramPackage eINSTANCE = uidiagram.impl.UidiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelFactoryUIImpl <em>Model Factory UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelFactoryUIImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactoryUI()
	 * @generated
	 */
	int MODEL_FACTORY_UI = 0;

	/**
	 * The feature id for the '<em><b>Lst Project UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UI__LST_PROJECT_UI = 0;

	/**
	 * The number of structural features of the '<em>Model Factory UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UI_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ProjectUIImpl <em>Project UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ProjectUIImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getProjectUI()
	 * @generated
	 */
	int PROJECT_UI = 1;

	/**
	 * The feature id for the '<em><b>Lst Diagram UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_UI__LST_DIAGRAM_UI = 0;

	/**
	 * The number of structural features of the '<em>Project UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_UI_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UIDiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UIDiagramImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUIDiagram()
	 * @generated
	 */
	int UI_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__FORM = 0;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.FormUIImpl <em>Form UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.FormUIImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getFormUI()
	 * @generated
	 */
	int FORM_UI = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UI__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UI__LST_ADJ_WIDGET = 1;

	/**
	 * The number of structural features of the '<em>Form UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UI_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjWidgetImpl <em>Adj Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjWidgetImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjWidget()
	 * @generated
	 */
	int ADJ_WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__POSITION_X = 2;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__POSITION_Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__BACKGROUND = 6;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__FONT_NAME = 7;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__FONT_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__BOLD = 9;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__ITALIC = 10;

	/**
	 * The number of structural features of the '<em>Adj Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjLabelImpl <em>Adj Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjLabelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjLabel()
	 * @generated
	 */
	int ADJ_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjCheckBoxImpl <em>Adj Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjCheckBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjCheckBox()
	 * @generated
	 */
	int ADJ_CHECK_BOX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjButtonImpl <em>Adj Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjButton()
	 * @generated
	 */
	int ADJ_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjListBoxImpl <em>Adj List Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjListBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListBox()
	 * @generated
	 */
	int ADJ_LIST_BOX = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjDateTimePickerImpl <em>Adj Date Time Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjDateTimePickerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDateTimePicker()
	 * @generated
	 */
	int ADJ_DATE_TIME_PICKER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATE_TIME_PICKER_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjTextBoxImpl <em>Adj Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjTextBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjTextBox()
	 * @generated
	 */
	int ADJ_TEXT_BOX = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjCheckedListBoxImpl <em>Adj Checked List Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjCheckedListBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjCheckedListBox()
	 * @generated
	 */
	int ADJ_CHECKED_LIST_BOX = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Checked List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjLinkLabelImpl <em>Adj Link Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjLinkLabelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjLinkLabel()
	 * @generated
	 */
	int ADJ_LINK_LABEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Link Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjRichTextBoxImpl <em>Adj Rich Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjRichTextBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjRichTextBox()
	 * @generated
	 */
	int ADJ_RICH_TEXT_BOX = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Rich Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjComboBoxImpl <em>Adj Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjComboBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjComboBox()
	 * @generated
	 */
	int ADJ_COMBO_BOX = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_COMBO_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjRadioButtonImpl <em>Adj Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjRadioButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjRadioButton()
	 * @generated
	 */
	int ADJ_RADIO_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RADIO_BUTTON_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjPictureBoxImpl <em>Adj Picture Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjPictureBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPictureBox()
	 * @generated
	 */
	int ADJ_PICTURE_BOX = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The number of structural features of the '<em>Adj Picture Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PICTURE_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjListViewImpl <em>Adj List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjListViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListView()
	 * @generated
	 */
	int ADJ_LIST_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The feature id for the '<em><b>Lst Adj List View Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjListViewColumnImpl <em>Adj List View Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjListViewColumnImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListViewColumn()
	 * @generated
	 */
	int ADJ_LIST_VIEW_COLUMN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW_COLUMN__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW_COLUMN__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Adj List View Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_VIEW_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjPanelImpl <em>Adj Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjPanelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPanel()
	 * @generated
	 */
	int ADJ_PANEL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjGroupBoxImpl <em>Adj Group Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjGroupBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjGroupBox()
	 * @generated
	 */
	int ADJ_GROUP_BOX = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__FONT_NAME = ADJ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__FONT_SIZE = ADJ_WIDGET__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__BOLD = ADJ_WIDGET__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__ITALIC = ADJ_WIDGET__ITALIC;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Group Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link uidiagram.ModelFactoryUI <em>Model Factory UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory UI</em>'.
	 * @see uidiagram.ModelFactoryUI
	 * @generated
	 */
	EClass getModelFactoryUI();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.ModelFactoryUI#getLstProjectUI <em>Lst Project UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Project UI</em>'.
	 * @see uidiagram.ModelFactoryUI#getLstProjectUI()
	 * @see #getModelFactoryUI()
	 * @generated
	 */
	EReference getModelFactoryUI_LstProjectUI();

	/**
	 * Returns the meta object for class '{@link uidiagram.ProjectUI <em>Project UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project UI</em>'.
	 * @see uidiagram.ProjectUI
	 * @generated
	 */
	EClass getProjectUI();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.ProjectUI#getLstDiagramUI <em>Lst Diagram UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Diagram UI</em>'.
	 * @see uidiagram.ProjectUI#getLstDiagramUI()
	 * @see #getProjectUI()
	 * @generated
	 */
	EReference getProjectUI_LstDiagramUI();

	/**
	 * Returns the meta object for class '{@link uidiagram.UIDiagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see uidiagram.UIDiagram
	 * @generated
	 */
	EClass getUIDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link uidiagram.UIDiagram#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see uidiagram.UIDiagram#getForm()
	 * @see #getUIDiagram()
	 * @generated
	 */
	EReference getUIDiagram_Form();

	/**
	 * Returns the meta object for class '{@link uidiagram.FormUI <em>Form UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form UI</em>'.
	 * @see uidiagram.FormUI
	 * @generated
	 */
	EClass getFormUI();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.FormUI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.FormUI#getName()
	 * @see #getFormUI()
	 * @generated
	 */
	EAttribute getFormUI_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.FormUI#getLstAdjWidget <em>Lst Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Widget</em>'.
	 * @see uidiagram.FormUI#getLstAdjWidget()
	 * @see #getFormUI()
	 * @generated
	 */
	EReference getFormUI_LstAdjWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjWidget <em>Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Widget</em>'.
	 * @see uidiagram.AdjWidget
	 * @generated
	 */
	EClass getAdjWidget();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.AdjWidget#getName()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uidiagram.AdjWidget#getText()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Text();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.AdjWidget#getPositionX()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.AdjWidget#getPositionY()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.AdjWidget#getWidth()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uidiagram.AdjWidget#getHeight()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Height();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see uidiagram.AdjWidget#getBackground()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Background();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see uidiagram.AdjWidget#getFontName()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_FontName();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see uidiagram.AdjWidget#getFontSize()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see uidiagram.AdjWidget#getBold()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Bold();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see uidiagram.AdjWidget#getItalic()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Italic();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjLabel <em>Adj Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Label</em>'.
	 * @see uidiagram.AdjLabel
	 * @generated
	 */
	EClass getAdjLabel();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjCheckBox <em>Adj Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Check Box</em>'.
	 * @see uidiagram.AdjCheckBox
	 * @generated
	 */
	EClass getAdjCheckBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjButton <em>Adj Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Button</em>'.
	 * @see uidiagram.AdjButton
	 * @generated
	 */
	EClass getAdjButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjListBox <em>Adj List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj List Box</em>'.
	 * @see uidiagram.AdjListBox
	 * @generated
	 */
	EClass getAdjListBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjDateTimePicker <em>Adj Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Date Time Picker</em>'.
	 * @see uidiagram.AdjDateTimePicker
	 * @generated
	 */
	EClass getAdjDateTimePicker();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjTextBox <em>Adj Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Text Box</em>'.
	 * @see uidiagram.AdjTextBox
	 * @generated
	 */
	EClass getAdjTextBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjCheckedListBox <em>Adj Checked List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Checked List Box</em>'.
	 * @see uidiagram.AdjCheckedListBox
	 * @generated
	 */
	EClass getAdjCheckedListBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjLinkLabel <em>Adj Link Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Link Label</em>'.
	 * @see uidiagram.AdjLinkLabel
	 * @generated
	 */
	EClass getAdjLinkLabel();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjRichTextBox <em>Adj Rich Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Rich Text Box</em>'.
	 * @see uidiagram.AdjRichTextBox
	 * @generated
	 */
	EClass getAdjRichTextBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjComboBox <em>Adj Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Combo Box</em>'.
	 * @see uidiagram.AdjComboBox
	 * @generated
	 */
	EClass getAdjComboBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjRadioButton <em>Adj Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Radio Button</em>'.
	 * @see uidiagram.AdjRadioButton
	 * @generated
	 */
	EClass getAdjRadioButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjPictureBox <em>Adj Picture Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Picture Box</em>'.
	 * @see uidiagram.AdjPictureBox
	 * @generated
	 */
	EClass getAdjPictureBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjListView <em>Adj List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj List View</em>'.
	 * @see uidiagram.AdjListView
	 * @generated
	 */
	EClass getAdjListView();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjListView#getLstAdjListViewColumn <em>Lst Adj List View Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj List View Column</em>'.
	 * @see uidiagram.AdjListView#getLstAdjListViewColumn()
	 * @see #getAdjListView()
	 * @generated
	 */
	EReference getAdjListView_LstAdjListViewColumn();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjListViewColumn <em>Adj List View Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj List View Column</em>'.
	 * @see uidiagram.AdjListViewColumn
	 * @generated
	 */
	EClass getAdjListViewColumn();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjListViewColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.AdjListViewColumn#getName()
	 * @see #getAdjListViewColumn()
	 * @generated
	 */
	EAttribute getAdjListViewColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjListViewColumn#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see uidiagram.AdjListViewColumn#getVariable()
	 * @see #getAdjListViewColumn()
	 * @generated
	 */
	EAttribute getAdjListViewColumn_Variable();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjListViewColumn#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uidiagram.AdjListViewColumn#getText()
	 * @see #getAdjListViewColumn()
	 * @generated
	 */
	EAttribute getAdjListViewColumn_Text();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjPanel <em>Adj Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Panel</em>'.
	 * @see uidiagram.AdjPanel
	 * @generated
	 */
	EClass getAdjPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjPanel#getLstAdjWidget <em>Lst Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Widget</em>'.
	 * @see uidiagram.AdjPanel#getLstAdjWidget()
	 * @see #getAdjPanel()
	 * @generated
	 */
	EReference getAdjPanel_LstAdjWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjGroupBox <em>Adj Group Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Group Box</em>'.
	 * @see uidiagram.AdjGroupBox
	 * @generated
	 */
	EClass getAdjGroupBox();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjGroupBox#getLstAdjWidget <em>Lst Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Widget</em>'.
	 * @see uidiagram.AdjGroupBox#getLstAdjWidget()
	 * @see #getAdjGroupBox()
	 * @generated
	 */
	EReference getAdjGroupBox_LstAdjWidget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidiagramFactory getUidiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelFactoryUIImpl <em>Model Factory UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelFactoryUIImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactoryUI()
		 * @generated
		 */
		EClass MODEL_FACTORY_UI = eINSTANCE.getModelFactoryUI();

		/**
		 * The meta object literal for the '<em><b>Lst Project UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_UI__LST_PROJECT_UI = eINSTANCE.getModelFactoryUI_LstProjectUI();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ProjectUIImpl <em>Project UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ProjectUIImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getProjectUI()
		 * @generated
		 */
		EClass PROJECT_UI = eINSTANCE.getProjectUI();

		/**
		 * The meta object literal for the '<em><b>Lst Diagram UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_UI__LST_DIAGRAM_UI = eINSTANCE.getProjectUI_LstDiagramUI();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UIDiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UIDiagramImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUIDiagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUIDiagram();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__FORM = eINSTANCE.getUIDiagram_Form();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.FormUIImpl <em>Form UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.FormUIImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getFormUI()
		 * @generated
		 */
		EClass FORM_UI = eINSTANCE.getFormUI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_UI__NAME = eINSTANCE.getFormUI_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_UI__LST_ADJ_WIDGET = eINSTANCE.getFormUI_LstAdjWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjWidgetImpl <em>Adj Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjWidgetImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjWidget()
		 * @generated
		 */
		EClass ADJ_WIDGET = eINSTANCE.getAdjWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__NAME = eINSTANCE.getAdjWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__TEXT = eINSTANCE.getAdjWidget_Text();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__POSITION_X = eINSTANCE.getAdjWidget_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__POSITION_Y = eINSTANCE.getAdjWidget_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__WIDTH = eINSTANCE.getAdjWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__HEIGHT = eINSTANCE.getAdjWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__BACKGROUND = eINSTANCE.getAdjWidget_Background();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__FONT_NAME = eINSTANCE.getAdjWidget_FontName();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__FONT_SIZE = eINSTANCE.getAdjWidget_FontSize();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__BOLD = eINSTANCE.getAdjWidget_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__ITALIC = eINSTANCE.getAdjWidget_Italic();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjLabelImpl <em>Adj Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjLabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjLabel()
		 * @generated
		 */
		EClass ADJ_LABEL = eINSTANCE.getAdjLabel();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjCheckBoxImpl <em>Adj Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjCheckBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjCheckBox()
		 * @generated
		 */
		EClass ADJ_CHECK_BOX = eINSTANCE.getAdjCheckBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjButtonImpl <em>Adj Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjButton()
		 * @generated
		 */
		EClass ADJ_BUTTON = eINSTANCE.getAdjButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjListBoxImpl <em>Adj List Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjListBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListBox()
		 * @generated
		 */
		EClass ADJ_LIST_BOX = eINSTANCE.getAdjListBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjDateTimePickerImpl <em>Adj Date Time Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjDateTimePickerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDateTimePicker()
		 * @generated
		 */
		EClass ADJ_DATE_TIME_PICKER = eINSTANCE.getAdjDateTimePicker();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjTextBoxImpl <em>Adj Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjTextBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjTextBox()
		 * @generated
		 */
		EClass ADJ_TEXT_BOX = eINSTANCE.getAdjTextBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjCheckedListBoxImpl <em>Adj Checked List Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjCheckedListBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjCheckedListBox()
		 * @generated
		 */
		EClass ADJ_CHECKED_LIST_BOX = eINSTANCE.getAdjCheckedListBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjLinkLabelImpl <em>Adj Link Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjLinkLabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjLinkLabel()
		 * @generated
		 */
		EClass ADJ_LINK_LABEL = eINSTANCE.getAdjLinkLabel();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjRichTextBoxImpl <em>Adj Rich Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjRichTextBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjRichTextBox()
		 * @generated
		 */
		EClass ADJ_RICH_TEXT_BOX = eINSTANCE.getAdjRichTextBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjComboBoxImpl <em>Adj Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjComboBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjComboBox()
		 * @generated
		 */
		EClass ADJ_COMBO_BOX = eINSTANCE.getAdjComboBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjRadioButtonImpl <em>Adj Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjRadioButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjRadioButton()
		 * @generated
		 */
		EClass ADJ_RADIO_BUTTON = eINSTANCE.getAdjRadioButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjPictureBoxImpl <em>Adj Picture Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjPictureBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPictureBox()
		 * @generated
		 */
		EClass ADJ_PICTURE_BOX = eINSTANCE.getAdjPictureBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjListViewImpl <em>Adj List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjListViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListView()
		 * @generated
		 */
		EClass ADJ_LIST_VIEW = eINSTANCE.getAdjListView();

		/**
		 * The meta object literal for the '<em><b>Lst Adj List View Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN = eINSTANCE.getAdjListView_LstAdjListViewColumn();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjListViewColumnImpl <em>Adj List View Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjListViewColumnImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjListViewColumn()
		 * @generated
		 */
		EClass ADJ_LIST_VIEW_COLUMN = eINSTANCE.getAdjListViewColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LIST_VIEW_COLUMN__NAME = eINSTANCE.getAdjListViewColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LIST_VIEW_COLUMN__VARIABLE = eINSTANCE.getAdjListViewColumn_Variable();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LIST_VIEW_COLUMN__TEXT = eINSTANCE.getAdjListViewColumn_Text();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjPanelImpl <em>Adj Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjPanelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPanel()
		 * @generated
		 */
		EClass ADJ_PANEL = eINSTANCE.getAdjPanel();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_PANEL__LST_ADJ_WIDGET = eINSTANCE.getAdjPanel_LstAdjWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjGroupBoxImpl <em>Adj Group Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjGroupBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjGroupBox()
		 * @generated
		 */
		EClass ADJ_GROUP_BOX = eINSTANCE.getAdjGroupBox();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_GROUP_BOX__LST_ADJ_WIDGET = eINSTANCE.getAdjGroupBox_LstAdjWidget();

	}

} //UidiagramPackage
