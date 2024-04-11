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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__POSITION_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET__BACKGROUND = 7;

	/**
	 * The number of structural features of the '<em>Adj Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_WIDGET_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LABEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECK_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_BUTTON_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LIST_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjDatepickerImpl <em>Adj Datepicker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjDatepickerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDatepicker()
	 * @generated
	 */
	int ADJ_DATEPICKER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Datepicker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATEPICKER_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TEXT_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Checked List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_CHECKED_LIST_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Link Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_LINK_LABEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Rich Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_RICH_TEXT_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjTreeViewImpl <em>Adj Tree View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjTreeViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjTreeView()
	 * @generated
	 */
	int ADJ_TREE_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Tree View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TREE_VIEW_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjPropertyGridImpl <em>Adj Property Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjPropertyGridImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPropertyGrid()
	 * @generated
	 */
	int ADJ_PROPERTY_GRID = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Property Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROPERTY_GRID_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjProgressBarImpl <em>Adj Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjProgressBarImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjProgressBar()
	 * @generated
	 */
	int ADJ_PROGRESS_BAR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PROGRESS_BAR_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjDataGridViewImpl <em>Adj Data Grid View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjDataGridViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDataGridView()
	 * @generated
	 */
	int ADJ_DATA_GRID_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Lst Adj Data Grid View Text Box Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adj Data Grid View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjDataGridViewTextBoxColumnImpl <em>Adj Data Grid View Text Box Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjDataGridViewTextBoxColumnImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDataGridViewTextBoxColumn()
	 * @generated
	 */
	int ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Adj Data Grid View Text Box Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adj Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_PANEL_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__VARIABLE = ADJ_WIDGET__VARIABLE;

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
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adj Group Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_GROUP_BOX_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjMenuStripImpl <em>Adj Menu Strip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjMenuStripImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjMenuStrip()
	 * @generated
	 */
	int ADJ_MENU_STRIP = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adj Menu Strip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_MENU_STRIP_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AdjToolStripImpl <em>Adj Tool Strip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AdjToolStripImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAdjToolStrip()
	 * @generated
	 */
	int ADJ_TOOL_STRIP = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__NAME = ADJ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__VARIABLE = ADJ_WIDGET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__TEXT = ADJ_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__POSITION_X = ADJ_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__POSITION_Y = ADJ_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__WIDTH = ADJ_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__HEIGHT = ADJ_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__BACKGROUND = ADJ_WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__FONT = ADJ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP__LST_ADJ_WIDGET = ADJ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adj Tool Strip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJ_TOOL_STRIP_FEATURE_COUNT = ADJ_WIDGET_FEATURE_COUNT + 2;


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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjWidget#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see uidiagram.AdjWidget#getVariable()
	 * @see #getAdjWidget()
	 * @generated
	 */
	EAttribute getAdjWidget_Variable();

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
	 * Returns the meta object for class '{@link uidiagram.AdjLabel <em>Adj Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Label</em>'.
	 * @see uidiagram.AdjLabel
	 * @generated
	 */
	EClass getAdjLabel();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjLabel#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjLabel#getFont()
	 * @see #getAdjLabel()
	 * @generated
	 */
	EAttribute getAdjLabel_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjCheckBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjCheckBox#getFont()
	 * @see #getAdjCheckBox()
	 * @generated
	 */
	EAttribute getAdjCheckBox_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjButton#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjButton#getFont()
	 * @see #getAdjButton()
	 * @generated
	 */
	EAttribute getAdjButton_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjListBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjListBox#getFont()
	 * @see #getAdjListBox()
	 * @generated
	 */
	EAttribute getAdjListBox_Font();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjDatepicker <em>Adj Datepicker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Datepicker</em>'.
	 * @see uidiagram.AdjDatepicker
	 * @generated
	 */
	EClass getAdjDatepicker();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjDatepicker#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjDatepicker#getFont()
	 * @see #getAdjDatepicker()
	 * @generated
	 */
	EAttribute getAdjDatepicker_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjTextBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjTextBox#getFont()
	 * @see #getAdjTextBox()
	 * @generated
	 */
	EAttribute getAdjTextBox_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjCheckedListBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjCheckedListBox#getFont()
	 * @see #getAdjCheckedListBox()
	 * @generated
	 */
	EAttribute getAdjCheckedListBox_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjLinkLabel#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjLinkLabel#getFont()
	 * @see #getAdjLinkLabel()
	 * @generated
	 */
	EAttribute getAdjLinkLabel_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjRichTextBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjRichTextBox#getFont()
	 * @see #getAdjRichTextBox()
	 * @generated
	 */
	EAttribute getAdjRichTextBox_Font();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjTreeView <em>Adj Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Tree View</em>'.
	 * @see uidiagram.AdjTreeView
	 * @generated
	 */
	EClass getAdjTreeView();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjTreeView#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjTreeView#getFont()
	 * @see #getAdjTreeView()
	 * @generated
	 */
	EAttribute getAdjTreeView_Font();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjPropertyGrid <em>Adj Property Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Property Grid</em>'.
	 * @see uidiagram.AdjPropertyGrid
	 * @generated
	 */
	EClass getAdjPropertyGrid();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjPropertyGrid#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjPropertyGrid#getFont()
	 * @see #getAdjPropertyGrid()
	 * @generated
	 */
	EAttribute getAdjPropertyGrid_Font();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjProgressBar <em>Adj Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Progress Bar</em>'.
	 * @see uidiagram.AdjProgressBar
	 * @generated
	 */
	EClass getAdjProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjProgressBar#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjProgressBar#getFont()
	 * @see #getAdjProgressBar()
	 * @generated
	 */
	EAttribute getAdjProgressBar_Font();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjDataGridView <em>Adj Data Grid View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Data Grid View</em>'.
	 * @see uidiagram.AdjDataGridView
	 * @generated
	 */
	EClass getAdjDataGridView();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjDataGridView#getLstAdjDataGridViewTextBoxColumn <em>Lst Adj Data Grid View Text Box Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Data Grid View Text Box Column</em>'.
	 * @see uidiagram.AdjDataGridView#getLstAdjDataGridViewTextBoxColumn()
	 * @see #getAdjDataGridView()
	 * @generated
	 */
	EReference getAdjDataGridView_LstAdjDataGridViewTextBoxColumn();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjDataGridViewTextBoxColumn <em>Adj Data Grid View Text Box Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Data Grid View Text Box Column</em>'.
	 * @see uidiagram.AdjDataGridViewTextBoxColumn
	 * @generated
	 */
	EClass getAdjDataGridViewTextBoxColumn();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjDataGridViewTextBoxColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.AdjDataGridViewTextBoxColumn#getName()
	 * @see #getAdjDataGridViewTextBoxColumn()
	 * @generated
	 */
	EAttribute getAdjDataGridViewTextBoxColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjDataGridViewTextBoxColumn#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see uidiagram.AdjDataGridViewTextBoxColumn#getVariable()
	 * @see #getAdjDataGridViewTextBoxColumn()
	 * @generated
	 */
	EAttribute getAdjDataGridViewTextBoxColumn_Variable();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjDataGridViewTextBoxColumn#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uidiagram.AdjDataGridViewTextBoxColumn#getValue()
	 * @see #getAdjDataGridViewTextBoxColumn()
	 * @generated
	 */
	EAttribute getAdjDataGridViewTextBoxColumn_Value();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjPanel#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjPanel#getFont()
	 * @see #getAdjPanel()
	 * @generated
	 */
	EAttribute getAdjPanel_Font();

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
	 * Returns the meta object for the attribute '{@link uidiagram.AdjGroupBox#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjGroupBox#getFont()
	 * @see #getAdjGroupBox()
	 * @generated
	 */
	EAttribute getAdjGroupBox_Font();

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
	 * Returns the meta object for class '{@link uidiagram.AdjMenuStrip <em>Adj Menu Strip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Menu Strip</em>'.
	 * @see uidiagram.AdjMenuStrip
	 * @generated
	 */
	EClass getAdjMenuStrip();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjMenuStrip#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjMenuStrip#getFont()
	 * @see #getAdjMenuStrip()
	 * @generated
	 */
	EAttribute getAdjMenuStrip_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjMenuStrip#getLstAdjWidget <em>Lst Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Widget</em>'.
	 * @see uidiagram.AdjMenuStrip#getLstAdjWidget()
	 * @see #getAdjMenuStrip()
	 * @generated
	 */
	EReference getAdjMenuStrip_LstAdjWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.AdjToolStrip <em>Adj Tool Strip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adj Tool Strip</em>'.
	 * @see uidiagram.AdjToolStrip
	 * @generated
	 */
	EClass getAdjToolStrip();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.AdjToolStrip#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uidiagram.AdjToolStrip#getFont()
	 * @see #getAdjToolStrip()
	 * @generated
	 */
	EAttribute getAdjToolStrip_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.AdjToolStrip#getLstAdjWidget <em>Lst Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Adj Widget</em>'.
	 * @see uidiagram.AdjToolStrip#getLstAdjWidget()
	 * @see #getAdjToolStrip()
	 * @generated
	 */
	EReference getAdjToolStrip_LstAdjWidget();

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
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_WIDGET__VARIABLE = eINSTANCE.getAdjWidget_Variable();

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
		 * The meta object literal for the '{@link uidiagram.impl.AdjLabelImpl <em>Adj Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjLabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjLabel()
		 * @generated
		 */
		EClass ADJ_LABEL = eINSTANCE.getAdjLabel();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LABEL__FONT = eINSTANCE.getAdjLabel_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_CHECK_BOX__FONT = eINSTANCE.getAdjCheckBox_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_BUTTON__FONT = eINSTANCE.getAdjButton_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LIST_BOX__FONT = eINSTANCE.getAdjListBox_Font();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjDatepickerImpl <em>Adj Datepicker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjDatepickerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDatepicker()
		 * @generated
		 */
		EClass ADJ_DATEPICKER = eINSTANCE.getAdjDatepicker();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_DATEPICKER__FONT = eINSTANCE.getAdjDatepicker_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_TEXT_BOX__FONT = eINSTANCE.getAdjTextBox_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_CHECKED_LIST_BOX__FONT = eINSTANCE.getAdjCheckedListBox_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_LINK_LABEL__FONT = eINSTANCE.getAdjLinkLabel_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_RICH_TEXT_BOX__FONT = eINSTANCE.getAdjRichTextBox_Font();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjTreeViewImpl <em>Adj Tree View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjTreeViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjTreeView()
		 * @generated
		 */
		EClass ADJ_TREE_VIEW = eINSTANCE.getAdjTreeView();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_TREE_VIEW__FONT = eINSTANCE.getAdjTreeView_Font();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjPropertyGridImpl <em>Adj Property Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjPropertyGridImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjPropertyGrid()
		 * @generated
		 */
		EClass ADJ_PROPERTY_GRID = eINSTANCE.getAdjPropertyGrid();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_PROPERTY_GRID__FONT = eINSTANCE.getAdjPropertyGrid_Font();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjProgressBarImpl <em>Adj Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjProgressBarImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjProgressBar()
		 * @generated
		 */
		EClass ADJ_PROGRESS_BAR = eINSTANCE.getAdjProgressBar();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_PROGRESS_BAR__FONT = eINSTANCE.getAdjProgressBar_Font();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjDataGridViewImpl <em>Adj Data Grid View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjDataGridViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDataGridView()
		 * @generated
		 */
		EClass ADJ_DATA_GRID_VIEW = eINSTANCE.getAdjDataGridView();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Data Grid View Text Box Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN = eINSTANCE.getAdjDataGridView_LstAdjDataGridViewTextBoxColumn();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjDataGridViewTextBoxColumnImpl <em>Adj Data Grid View Text Box Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjDataGridViewTextBoxColumnImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjDataGridViewTextBoxColumn()
		 * @generated
		 */
		EClass ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN = eINSTANCE.getAdjDataGridViewTextBoxColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__NAME = eINSTANCE.getAdjDataGridViewTextBoxColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VARIABLE = eINSTANCE.getAdjDataGridViewTextBoxColumn_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VALUE = eINSTANCE.getAdjDataGridViewTextBoxColumn_Value();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_PANEL__FONT = eINSTANCE.getAdjPanel_Font();

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
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_GROUP_BOX__FONT = eINSTANCE.getAdjGroupBox_Font();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_GROUP_BOX__LST_ADJ_WIDGET = eINSTANCE.getAdjGroupBox_LstAdjWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjMenuStripImpl <em>Adj Menu Strip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjMenuStripImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjMenuStrip()
		 * @generated
		 */
		EClass ADJ_MENU_STRIP = eINSTANCE.getAdjMenuStrip();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_MENU_STRIP__FONT = eINSTANCE.getAdjMenuStrip_Font();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_MENU_STRIP__LST_ADJ_WIDGET = eINSTANCE.getAdjMenuStrip_LstAdjWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AdjToolStripImpl <em>Adj Tool Strip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AdjToolStripImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAdjToolStrip()
		 * @generated
		 */
		EClass ADJ_TOOL_STRIP = eINSTANCE.getAdjToolStrip();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADJ_TOOL_STRIP__FONT = eINSTANCE.getAdjToolStrip_Font();

		/**
		 * The meta object literal for the '<em><b>Lst Adj Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJ_TOOL_STRIP__LST_ADJ_WIDGET = eINSTANCE.getAdjToolStrip_LstAdjWidget();

	}

} //UidiagramPackage
