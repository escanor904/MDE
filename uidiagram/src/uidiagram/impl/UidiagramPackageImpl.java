/**
 */
package uidiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uidiagram.AdjButton;
import uidiagram.AdjCheckBox;
import uidiagram.AdjCheckedListBox;
import uidiagram.AdjComboBox;
import uidiagram.AdjDateTimePicker;
import uidiagram.AdjGroupBox;
import uidiagram.AdjLabel;
import uidiagram.AdjLinkLabel;
import uidiagram.AdjListBox;
import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;
import uidiagram.AdjPanel;
import uidiagram.AdjPictureBox;
import uidiagram.AdjRadioButton;
import uidiagram.AdjRichTextBox;
import uidiagram.AdjTextBox;
import uidiagram.AdjWidget;
import uidiagram.FormUI;
import uidiagram.ModelFactoryUI;
import uidiagram.ProjectUI;
import uidiagram.UIDiagram;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagramPackageImpl extends EPackageImpl implements UidiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjListBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjDateTimePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjTextBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjCheckedListBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjLinkLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjRichTextBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjRadioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjPictureBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjListViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjListViewColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjGroupBoxEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uidiagram.UidiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UidiagramPackageImpl() {
		super(eNS_URI, UidiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UidiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UidiagramPackage init() {
		if (isInited) return (UidiagramPackage)EPackage.Registry.INSTANCE.getEPackage(UidiagramPackage.eNS_URI);

		// Obtain or create and register package
		UidiagramPackageImpl theUidiagramPackage = (UidiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UidiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UidiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUidiagramPackage.createPackageContents();

		// Initialize created meta-data
		theUidiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUidiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UidiagramPackage.eNS_URI, theUidiagramPackage);
		return theUidiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryUI() {
		return modelFactoryUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryUI_LstProjectUI() {
		return (EReference)modelFactoryUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectUI() {
		return projectUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectUI_LstDiagramUI() {
		return (EReference)projectUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIDiagram() {
		return uiDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIDiagram_Form() {
		return (EReference)uiDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormUI() {
		return formUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormUI_Name() {
		return (EAttribute)formUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormUI_LstAdjWidget() {
		return (EReference)formUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjWidget() {
		return adjWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Name() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Text() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_PositionX() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_PositionY() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Width() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Height() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Background() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_FontName() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_FontSize() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Bold() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Italic() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjLabel() {
		return adjLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjCheckBox() {
		return adjCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjButton() {
		return adjButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjListBox() {
		return adjListBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjDateTimePicker() {
		return adjDateTimePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjTextBox() {
		return adjTextBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjCheckedListBox() {
		return adjCheckedListBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjLinkLabel() {
		return adjLinkLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjRichTextBox() {
		return adjRichTextBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjComboBox() {
		return adjComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjRadioButton() {
		return adjRadioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjPictureBox() {
		return adjPictureBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjListView() {
		return adjListViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjListView_LstAdjListViewColumn() {
		return (EReference)adjListViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjListViewColumn() {
		return adjListViewColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjListViewColumn_Name() {
		return (EAttribute)adjListViewColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjListViewColumn_Variable() {
		return (EAttribute)adjListViewColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjListViewColumn_Text() {
		return (EAttribute)adjListViewColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjPanel() {
		return adjPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjPanel_LstAdjWidget() {
		return (EReference)adjPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjGroupBox() {
		return adjGroupBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjGroupBox_LstAdjWidget() {
		return (EReference)adjGroupBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramFactory getUidiagramFactory() {
		return (UidiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryUIEClass = createEClass(MODEL_FACTORY_UI);
		createEReference(modelFactoryUIEClass, MODEL_FACTORY_UI__LST_PROJECT_UI);

		projectUIEClass = createEClass(PROJECT_UI);
		createEReference(projectUIEClass, PROJECT_UI__LST_DIAGRAM_UI);

		uiDiagramEClass = createEClass(UI_DIAGRAM);
		createEReference(uiDiagramEClass, UI_DIAGRAM__FORM);

		formUIEClass = createEClass(FORM_UI);
		createEAttribute(formUIEClass, FORM_UI__NAME);
		createEReference(formUIEClass, FORM_UI__LST_ADJ_WIDGET);

		adjWidgetEClass = createEClass(ADJ_WIDGET);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__NAME);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__TEXT);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__POSITION_X);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__POSITION_Y);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__WIDTH);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__HEIGHT);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__BACKGROUND);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__FONT_NAME);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__FONT_SIZE);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__BOLD);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__ITALIC);

		adjLabelEClass = createEClass(ADJ_LABEL);

		adjCheckBoxEClass = createEClass(ADJ_CHECK_BOX);

		adjButtonEClass = createEClass(ADJ_BUTTON);

		adjListBoxEClass = createEClass(ADJ_LIST_BOX);

		adjDateTimePickerEClass = createEClass(ADJ_DATE_TIME_PICKER);

		adjTextBoxEClass = createEClass(ADJ_TEXT_BOX);

		adjCheckedListBoxEClass = createEClass(ADJ_CHECKED_LIST_BOX);

		adjLinkLabelEClass = createEClass(ADJ_LINK_LABEL);

		adjRichTextBoxEClass = createEClass(ADJ_RICH_TEXT_BOX);

		adjComboBoxEClass = createEClass(ADJ_COMBO_BOX);

		adjRadioButtonEClass = createEClass(ADJ_RADIO_BUTTON);

		adjPictureBoxEClass = createEClass(ADJ_PICTURE_BOX);

		adjListViewEClass = createEClass(ADJ_LIST_VIEW);
		createEReference(adjListViewEClass, ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN);

		adjListViewColumnEClass = createEClass(ADJ_LIST_VIEW_COLUMN);
		createEAttribute(adjListViewColumnEClass, ADJ_LIST_VIEW_COLUMN__NAME);
		createEAttribute(adjListViewColumnEClass, ADJ_LIST_VIEW_COLUMN__VARIABLE);
		createEAttribute(adjListViewColumnEClass, ADJ_LIST_VIEW_COLUMN__TEXT);

		adjPanelEClass = createEClass(ADJ_PANEL);
		createEReference(adjPanelEClass, ADJ_PANEL__LST_ADJ_WIDGET);

		adjGroupBoxEClass = createEClass(ADJ_GROUP_BOX);
		createEReference(adjGroupBoxEClass, ADJ_GROUP_BOX__LST_ADJ_WIDGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adjLabelEClass.getESuperTypes().add(this.getAdjWidget());
		adjCheckBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjButtonEClass.getESuperTypes().add(this.getAdjWidget());
		adjListBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjDateTimePickerEClass.getESuperTypes().add(this.getAdjWidget());
		adjTextBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjCheckedListBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjLinkLabelEClass.getESuperTypes().add(this.getAdjWidget());
		adjRichTextBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjComboBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjRadioButtonEClass.getESuperTypes().add(this.getAdjWidget());
		adjPictureBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjListViewEClass.getESuperTypes().add(this.getAdjWidget());
		adjPanelEClass.getESuperTypes().add(this.getAdjWidget());
		adjGroupBoxEClass.getESuperTypes().add(this.getAdjWidget());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryUIEClass, ModelFactoryUI.class, "ModelFactoryUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryUI_LstProjectUI(), this.getProjectUI(), null, "lstProjectUI", null, 0, -1, ModelFactoryUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectUIEClass, ProjectUI.class, "ProjectUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectUI_LstDiagramUI(), this.getUIDiagram(), null, "lstDiagramUI", null, 0, -1, ProjectUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDiagramEClass, UIDiagram.class, "UIDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIDiagram_Form(), this.getFormUI(), null, "form", null, 0, 1, UIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formUIEClass, FormUI.class, "FormUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormUI_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormUI_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, FormUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjWidgetEClass, AdjWidget.class, "AdjWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Text(), ecorePackage.getEString(), "text", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_PositionX(), ecorePackage.getEIntegerObject(), "positionX", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_PositionY(), ecorePackage.getEIntegerObject(), "positionY", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Width(), ecorePackage.getEIntegerObject(), "width", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Height(), ecorePackage.getEIntegerObject(), "height", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Background(), ecorePackage.getEString(), "background", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_FontName(), ecorePackage.getEString(), "fontName", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_FontSize(), ecorePackage.getEIntegerObject(), "fontSize", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Bold(), ecorePackage.getEBooleanObject(), "bold", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Italic(), ecorePackage.getEBooleanObject(), "italic", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjLabelEClass, AdjLabel.class, "AdjLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjCheckBoxEClass, AdjCheckBox.class, "AdjCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjButtonEClass, AdjButton.class, "AdjButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjListBoxEClass, AdjListBox.class, "AdjListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjDateTimePickerEClass, AdjDateTimePicker.class, "AdjDateTimePicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjTextBoxEClass, AdjTextBox.class, "AdjTextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjCheckedListBoxEClass, AdjCheckedListBox.class, "AdjCheckedListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjLinkLabelEClass, AdjLinkLabel.class, "AdjLinkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjRichTextBoxEClass, AdjRichTextBox.class, "AdjRichTextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjComboBoxEClass, AdjComboBox.class, "AdjComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjRadioButtonEClass, AdjRadioButton.class, "AdjRadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjPictureBoxEClass, AdjPictureBox.class, "AdjPictureBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjListViewEClass, AdjListView.class, "AdjListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdjListView_LstAdjListViewColumn(), this.getAdjListViewColumn(), null, "lstAdjListViewColumn", null, 0, -1, AdjListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjListViewColumnEClass, AdjListViewColumn.class, "AdjListViewColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjListViewColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjListViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjListViewColumn_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, AdjListViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjListViewColumn_Text(), ecorePackage.getEString(), "text", null, 0, 1, AdjListViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjPanelEClass, AdjPanel.class, "AdjPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdjPanel_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjGroupBoxEClass, AdjGroupBox.class, "AdjGroupBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdjGroupBox_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjGroupBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (uiDiagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (formUIEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjLabelEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjCheckBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjButtonEClass, 
		   source, 
		   new String[] {
			 "label", "text",
			 "figure", "rounded",
			 "color", "234,236,238"
		   });	
		addAnnotation
		  (adjListBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjDateTimePickerEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjTextBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjCheckedListBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjLinkLabelEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjRichTextBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjComboBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjRadioButtonEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjPictureBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjListViewEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjListViewColumnEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjPanelEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });	
		addAnnotation
		  (adjGroupBoxEClass, 
		   source, 
		   new String[] {
			 "label", "text"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getFormUI_LstAdjWidget(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAdjListView_LstAdjListViewColumn(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getAdjPanel_LstAdjWidget(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAdjGroupBox_LstAdjWidget(), 
		   source, 
		   new String[] {
		   });
	}

} //UidiagramPackageImpl
