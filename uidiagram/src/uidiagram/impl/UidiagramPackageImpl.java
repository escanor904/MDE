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
import uidiagram.AdjDataGridView;
import uidiagram.AdjDataGridViewTextBoxColumn;
import uidiagram.AdjDatepicker;
import uidiagram.AdjGroupBox;
import uidiagram.AdjLabel;
import uidiagram.AdjLinkLabel;
import uidiagram.AdjListBox;
import uidiagram.AdjMenuStrip;
import uidiagram.AdjPanel;
import uidiagram.AdjProgressBar;
import uidiagram.AdjPropertyGrid;
import uidiagram.AdjRichTextBox;
import uidiagram.AdjTextBox;
import uidiagram.AdjToolStrip;
import uidiagram.AdjTreeView;
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
	private EClass adjDatepickerEClass = null;

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
	private EClass adjTreeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjPropertyGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjProgressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjDataGridViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjDataGridViewTextBoxColumnEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjMenuStripEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjToolStripEClass = null;

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
	public EAttribute getAdjWidget_Variable() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Text() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_PositionX() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_PositionY() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Width() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Height() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjWidget_Background() {
		return (EAttribute)adjWidgetEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getAdjLabel_Font() {
		return (EAttribute)adjLabelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjCheckBox_Font() {
		return (EAttribute)adjCheckBoxEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjButton_Font() {
		return (EAttribute)adjButtonEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjListBox_Font() {
		return (EAttribute)adjListBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjDatepicker() {
		return adjDatepickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjDatepicker_Font() {
		return (EAttribute)adjDatepickerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjTextBox_Font() {
		return (EAttribute)adjTextBoxEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjCheckedListBox_Font() {
		return (EAttribute)adjCheckedListBoxEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjLinkLabel_Font() {
		return (EAttribute)adjLinkLabelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdjRichTextBox_Font() {
		return (EAttribute)adjRichTextBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjTreeView() {
		return adjTreeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjTreeView_Font() {
		return (EAttribute)adjTreeViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjPropertyGrid() {
		return adjPropertyGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjPropertyGrid_Font() {
		return (EAttribute)adjPropertyGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjProgressBar() {
		return adjProgressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjProgressBar_Font() {
		return (EAttribute)adjProgressBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjDataGridView() {
		return adjDataGridViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjDataGridView_LstAdjDataGridViewTextBoxColumn() {
		return (EReference)adjDataGridViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjDataGridViewTextBoxColumn() {
		return adjDataGridViewTextBoxColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjDataGridViewTextBoxColumn_Name() {
		return (EAttribute)adjDataGridViewTextBoxColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjDataGridViewTextBoxColumn_Variable() {
		return (EAttribute)adjDataGridViewTextBoxColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjDataGridViewTextBoxColumn_Value() {
		return (EAttribute)adjDataGridViewTextBoxColumnEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getAdjPanel_Font() {
		return (EAttribute)adjPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjPanel_LstAdjWidget() {
		return (EReference)adjPanelEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAdjGroupBox_Font() {
		return (EAttribute)adjGroupBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjGroupBox_LstAdjWidget() {
		return (EReference)adjGroupBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjMenuStrip() {
		return adjMenuStripEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjMenuStrip_Font() {
		return (EAttribute)adjMenuStripEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjMenuStrip_LstAdjWidget() {
		return (EReference)adjMenuStripEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjToolStrip() {
		return adjToolStripEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjToolStrip_Font() {
		return (EAttribute)adjToolStripEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjToolStrip_LstAdjWidget() {
		return (EReference)adjToolStripEClass.getEStructuralFeatures().get(1);
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
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__VARIABLE);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__TEXT);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__POSITION_X);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__POSITION_Y);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__WIDTH);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__HEIGHT);
		createEAttribute(adjWidgetEClass, ADJ_WIDGET__BACKGROUND);

		adjLabelEClass = createEClass(ADJ_LABEL);
		createEAttribute(adjLabelEClass, ADJ_LABEL__FONT);

		adjCheckBoxEClass = createEClass(ADJ_CHECK_BOX);
		createEAttribute(adjCheckBoxEClass, ADJ_CHECK_BOX__FONT);

		adjButtonEClass = createEClass(ADJ_BUTTON);
		createEAttribute(adjButtonEClass, ADJ_BUTTON__FONT);

		adjListBoxEClass = createEClass(ADJ_LIST_BOX);
		createEAttribute(adjListBoxEClass, ADJ_LIST_BOX__FONT);

		adjDatepickerEClass = createEClass(ADJ_DATEPICKER);
		createEAttribute(adjDatepickerEClass, ADJ_DATEPICKER__FONT);

		adjTextBoxEClass = createEClass(ADJ_TEXT_BOX);
		createEAttribute(adjTextBoxEClass, ADJ_TEXT_BOX__FONT);

		adjCheckedListBoxEClass = createEClass(ADJ_CHECKED_LIST_BOX);
		createEAttribute(adjCheckedListBoxEClass, ADJ_CHECKED_LIST_BOX__FONT);

		adjLinkLabelEClass = createEClass(ADJ_LINK_LABEL);
		createEAttribute(adjLinkLabelEClass, ADJ_LINK_LABEL__FONT);

		adjRichTextBoxEClass = createEClass(ADJ_RICH_TEXT_BOX);
		createEAttribute(adjRichTextBoxEClass, ADJ_RICH_TEXT_BOX__FONT);

		adjTreeViewEClass = createEClass(ADJ_TREE_VIEW);
		createEAttribute(adjTreeViewEClass, ADJ_TREE_VIEW__FONT);

		adjPropertyGridEClass = createEClass(ADJ_PROPERTY_GRID);
		createEAttribute(adjPropertyGridEClass, ADJ_PROPERTY_GRID__FONT);

		adjProgressBarEClass = createEClass(ADJ_PROGRESS_BAR);
		createEAttribute(adjProgressBarEClass, ADJ_PROGRESS_BAR__FONT);

		adjDataGridViewEClass = createEClass(ADJ_DATA_GRID_VIEW);
		createEReference(adjDataGridViewEClass, ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN);

		adjDataGridViewTextBoxColumnEClass = createEClass(ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN);
		createEAttribute(adjDataGridViewTextBoxColumnEClass, ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__NAME);
		createEAttribute(adjDataGridViewTextBoxColumnEClass, ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VARIABLE);
		createEAttribute(adjDataGridViewTextBoxColumnEClass, ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN__VALUE);

		adjPanelEClass = createEClass(ADJ_PANEL);
		createEAttribute(adjPanelEClass, ADJ_PANEL__FONT);
		createEReference(adjPanelEClass, ADJ_PANEL__LST_ADJ_WIDGET);

		adjGroupBoxEClass = createEClass(ADJ_GROUP_BOX);
		createEAttribute(adjGroupBoxEClass, ADJ_GROUP_BOX__FONT);
		createEReference(adjGroupBoxEClass, ADJ_GROUP_BOX__LST_ADJ_WIDGET);

		adjMenuStripEClass = createEClass(ADJ_MENU_STRIP);
		createEAttribute(adjMenuStripEClass, ADJ_MENU_STRIP__FONT);
		createEReference(adjMenuStripEClass, ADJ_MENU_STRIP__LST_ADJ_WIDGET);

		adjToolStripEClass = createEClass(ADJ_TOOL_STRIP);
		createEAttribute(adjToolStripEClass, ADJ_TOOL_STRIP__FONT);
		createEReference(adjToolStripEClass, ADJ_TOOL_STRIP__LST_ADJ_WIDGET);
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
		adjDatepickerEClass.getESuperTypes().add(this.getAdjWidget());
		adjTextBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjCheckedListBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjLinkLabelEClass.getESuperTypes().add(this.getAdjWidget());
		adjRichTextBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjTreeViewEClass.getESuperTypes().add(this.getAdjWidget());
		adjPropertyGridEClass.getESuperTypes().add(this.getAdjWidget());
		adjProgressBarEClass.getESuperTypes().add(this.getAdjWidget());
		adjDataGridViewEClass.getESuperTypes().add(this.getAdjWidget());
		adjPanelEClass.getESuperTypes().add(this.getAdjWidget());
		adjGroupBoxEClass.getESuperTypes().add(this.getAdjWidget());
		adjMenuStripEClass.getESuperTypes().add(this.getAdjWidget());
		adjToolStripEClass.getESuperTypes().add(this.getAdjWidget());

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
		initEAttribute(getAdjWidget_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Text(), ecorePackage.getEString(), "text", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_PositionX(), ecorePackage.getEString(), "positionX", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_PositionY(), ecorePackage.getEString(), "positionY", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Width(), ecorePackage.getEString(), "width", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Height(), ecorePackage.getEString(), "height", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjWidget_Background(), ecorePackage.getEString(), "background", null, 0, 1, AdjWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjLabelEClass, AdjLabel.class, "AdjLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjLabel_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjCheckBoxEClass, AdjCheckBox.class, "AdjCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjCheckBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjButtonEClass, AdjButton.class, "AdjButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjButton_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjListBoxEClass, AdjListBox.class, "AdjListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjListBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjListBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjDatepickerEClass, AdjDatepicker.class, "AdjDatepicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjDatepicker_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjDatepicker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjTextBoxEClass, AdjTextBox.class, "AdjTextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjTextBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjTextBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjCheckedListBoxEClass, AdjCheckedListBox.class, "AdjCheckedListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjCheckedListBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjCheckedListBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjLinkLabelEClass, AdjLinkLabel.class, "AdjLinkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjLinkLabel_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjRichTextBoxEClass, AdjRichTextBox.class, "AdjRichTextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjRichTextBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjRichTextBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjTreeViewEClass, AdjTreeView.class, "AdjTreeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjTreeView_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjTreeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjPropertyGridEClass, AdjPropertyGrid.class, "AdjPropertyGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjPropertyGrid_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjPropertyGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjProgressBarEClass, AdjProgressBar.class, "AdjProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjProgressBar_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjDataGridViewEClass, AdjDataGridView.class, "AdjDataGridView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdjDataGridView_LstAdjDataGridViewTextBoxColumn(), this.getAdjDataGridViewTextBoxColumn(), null, "lstAdjDataGridViewTextBoxColumn", null, 0, -1, AdjDataGridView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjDataGridViewTextBoxColumnEClass, AdjDataGridViewTextBoxColumn.class, "AdjDataGridViewTextBoxColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjDataGridViewTextBoxColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjDataGridViewTextBoxColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjDataGridViewTextBoxColumn_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, AdjDataGridViewTextBoxColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdjDataGridViewTextBoxColumn_Value(), ecorePackage.getEString(), "value", null, 0, 1, AdjDataGridViewTextBoxColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjPanelEClass, AdjPanel.class, "AdjPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjPanel_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdjPanel_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjGroupBoxEClass, AdjGroupBox.class, "AdjGroupBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjGroupBox_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjGroupBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdjGroupBox_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjGroupBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjMenuStripEClass, AdjMenuStrip.class, "AdjMenuStrip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjMenuStrip_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjMenuStrip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdjMenuStrip_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjMenuStrip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjToolStripEClass, AdjToolStrip.class, "AdjToolStrip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdjToolStrip_Font(), ecorePackage.getEString(), "font", null, 0, 1, AdjToolStrip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdjToolStrip_LstAdjWidget(), this.getAdjWidget(), null, "lstAdjWidget", null, 0, -1, AdjToolStrip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "label", "name"
		   });	
		addAnnotation
		  (adjCheckBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjButtonEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjListBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjDatepickerEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjTextBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjCheckedListBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjLinkLabelEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjRichTextBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjTreeViewEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjPropertyGridEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjProgressBarEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjDataGridViewEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjDataGridViewTextBoxColumnEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjPanelEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjGroupBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjMenuStripEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (adjToolStripEClass, 
		   source, 
		   new String[] {
			 "label", "name"
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
		  (getAdjDataGridView_LstAdjDataGridViewTextBoxColumn(), 
		   source, 
		   new String[] {
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
		addAnnotation
		  (getAdjMenuStrip_LstAdjWidget(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAdjToolStrip_LstAdjWidget(), 
		   source, 
		   new String[] {
		   });
	}

} //UidiagramPackageImpl
