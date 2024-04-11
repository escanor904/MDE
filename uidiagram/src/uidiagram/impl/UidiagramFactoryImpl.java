/**
 */
package uidiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagramFactoryImpl extends EFactoryImpl implements UidiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UidiagramFactory init() {
		try {
			UidiagramFactory theUidiagramFactory = (UidiagramFactory)EPackage.Registry.INSTANCE.getEFactory(UidiagramPackage.eNS_URI);
			if (theUidiagramFactory != null) {
				return theUidiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UidiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UidiagramPackage.MODEL_FACTORY_UI: return createModelFactoryUI();
			case UidiagramPackage.PROJECT_UI: return createProjectUI();
			case UidiagramPackage.UI_DIAGRAM: return createUIDiagram();
			case UidiagramPackage.FORM_UI: return createFormUI();
			case UidiagramPackage.ADJ_LABEL: return createAdjLabel();
			case UidiagramPackage.ADJ_CHECK_BOX: return createAdjCheckBox();
			case UidiagramPackage.ADJ_BUTTON: return createAdjButton();
			case UidiagramPackage.ADJ_LIST_BOX: return createAdjListBox();
			case UidiagramPackage.ADJ_DATEPICKER: return createAdjDatepicker();
			case UidiagramPackage.ADJ_TEXT_BOX: return createAdjTextBox();
			case UidiagramPackage.ADJ_CHECKED_LIST_BOX: return createAdjCheckedListBox();
			case UidiagramPackage.ADJ_LINK_LABEL: return createAdjLinkLabel();
			case UidiagramPackage.ADJ_RICH_TEXT_BOX: return createAdjRichTextBox();
			case UidiagramPackage.ADJ_TREE_VIEW: return createAdjTreeView();
			case UidiagramPackage.ADJ_PROPERTY_GRID: return createAdjPropertyGrid();
			case UidiagramPackage.ADJ_PROGRESS_BAR: return createAdjProgressBar();
			case UidiagramPackage.ADJ_DATA_GRID_VIEW: return createAdjDataGridView();
			case UidiagramPackage.ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN: return createAdjDataGridViewTextBoxColumn();
			case UidiagramPackage.ADJ_PANEL: return createAdjPanel();
			case UidiagramPackage.ADJ_GROUP_BOX: return createAdjGroupBox();
			case UidiagramPackage.ADJ_MENU_STRIP: return createAdjMenuStrip();
			case UidiagramPackage.ADJ_TOOL_STRIP: return createAdjToolStrip();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryUI createModelFactoryUI() {
		ModelFactoryUIImpl modelFactoryUI = new ModelFactoryUIImpl();
		return modelFactoryUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectUI createProjectUI() {
		ProjectUIImpl projectUI = new ProjectUIImpl();
		return projectUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDiagram createUIDiagram() {
		UIDiagramImpl uiDiagram = new UIDiagramImpl();
		return uiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormUI createFormUI() {
		FormUIImpl formUI = new FormUIImpl();
		return formUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjLabel createAdjLabel() {
		AdjLabelImpl adjLabel = new AdjLabelImpl();
		return adjLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjCheckBox createAdjCheckBox() {
		AdjCheckBoxImpl adjCheckBox = new AdjCheckBoxImpl();
		return adjCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjButton createAdjButton() {
		AdjButtonImpl adjButton = new AdjButtonImpl();
		return adjButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjListBox createAdjListBox() {
		AdjListBoxImpl adjListBox = new AdjListBoxImpl();
		return adjListBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjDatepicker createAdjDatepicker() {
		AdjDatepickerImpl adjDatepicker = new AdjDatepickerImpl();
		return adjDatepicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjTextBox createAdjTextBox() {
		AdjTextBoxImpl adjTextBox = new AdjTextBoxImpl();
		return adjTextBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjCheckedListBox createAdjCheckedListBox() {
		AdjCheckedListBoxImpl adjCheckedListBox = new AdjCheckedListBoxImpl();
		return adjCheckedListBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjLinkLabel createAdjLinkLabel() {
		AdjLinkLabelImpl adjLinkLabel = new AdjLinkLabelImpl();
		return adjLinkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjRichTextBox createAdjRichTextBox() {
		AdjRichTextBoxImpl adjRichTextBox = new AdjRichTextBoxImpl();
		return adjRichTextBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjTreeView createAdjTreeView() {
		AdjTreeViewImpl adjTreeView = new AdjTreeViewImpl();
		return adjTreeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjPropertyGrid createAdjPropertyGrid() {
		AdjPropertyGridImpl adjPropertyGrid = new AdjPropertyGridImpl();
		return adjPropertyGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjProgressBar createAdjProgressBar() {
		AdjProgressBarImpl adjProgressBar = new AdjProgressBarImpl();
		return adjProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjDataGridView createAdjDataGridView() {
		AdjDataGridViewImpl adjDataGridView = new AdjDataGridViewImpl();
		return adjDataGridView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjDataGridViewTextBoxColumn createAdjDataGridViewTextBoxColumn() {
		AdjDataGridViewTextBoxColumnImpl adjDataGridViewTextBoxColumn = new AdjDataGridViewTextBoxColumnImpl();
		return adjDataGridViewTextBoxColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjPanel createAdjPanel() {
		AdjPanelImpl adjPanel = new AdjPanelImpl();
		return adjPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjGroupBox createAdjGroupBox() {
		AdjGroupBoxImpl adjGroupBox = new AdjGroupBoxImpl();
		return adjGroupBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjMenuStrip createAdjMenuStrip() {
		AdjMenuStripImpl adjMenuStrip = new AdjMenuStripImpl();
		return adjMenuStrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjToolStrip createAdjToolStrip() {
		AdjToolStripImpl adjToolStrip = new AdjToolStripImpl();
		return adjToolStrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramPackage getUidiagramPackage() {
		return (UidiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UidiagramPackage getPackage() {
		return UidiagramPackage.eINSTANCE;
	}

} //UidiagramFactoryImpl
