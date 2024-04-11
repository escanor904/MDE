/**
 */
package uidiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramPackage
 * @generated
 */
public class UidiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UidiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = UidiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UidiagramPackage.MODEL_FACTORY_UI: {
				ModelFactoryUI modelFactoryUI = (ModelFactoryUI)theEObject;
				T result = caseModelFactoryUI(modelFactoryUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.PROJECT_UI: {
				ProjectUI projectUI = (ProjectUI)theEObject;
				T result = caseProjectUI(projectUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.UI_DIAGRAM: {
				UIDiagram uiDiagram = (UIDiagram)theEObject;
				T result = caseUIDiagram(uiDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.FORM_UI: {
				FormUI formUI = (FormUI)theEObject;
				T result = caseFormUI(formUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_WIDGET: {
				AdjWidget adjWidget = (AdjWidget)theEObject;
				T result = caseAdjWidget(adjWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_LABEL: {
				AdjLabel adjLabel = (AdjLabel)theEObject;
				T result = caseAdjLabel(adjLabel);
				if (result == null) result = caseAdjWidget(adjLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_CHECK_BOX: {
				AdjCheckBox adjCheckBox = (AdjCheckBox)theEObject;
				T result = caseAdjCheckBox(adjCheckBox);
				if (result == null) result = caseAdjWidget(adjCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_BUTTON: {
				AdjButton adjButton = (AdjButton)theEObject;
				T result = caseAdjButton(adjButton);
				if (result == null) result = caseAdjWidget(adjButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_LIST_BOX: {
				AdjListBox adjListBox = (AdjListBox)theEObject;
				T result = caseAdjListBox(adjListBox);
				if (result == null) result = caseAdjWidget(adjListBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_DATEPICKER: {
				AdjDatepicker adjDatepicker = (AdjDatepicker)theEObject;
				T result = caseAdjDatepicker(adjDatepicker);
				if (result == null) result = caseAdjWidget(adjDatepicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_TEXT_BOX: {
				AdjTextBox adjTextBox = (AdjTextBox)theEObject;
				T result = caseAdjTextBox(adjTextBox);
				if (result == null) result = caseAdjWidget(adjTextBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_CHECKED_LIST_BOX: {
				AdjCheckedListBox adjCheckedListBox = (AdjCheckedListBox)theEObject;
				T result = caseAdjCheckedListBox(adjCheckedListBox);
				if (result == null) result = caseAdjWidget(adjCheckedListBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_LINK_LABEL: {
				AdjLinkLabel adjLinkLabel = (AdjLinkLabel)theEObject;
				T result = caseAdjLinkLabel(adjLinkLabel);
				if (result == null) result = caseAdjWidget(adjLinkLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_RICH_TEXT_BOX: {
				AdjRichTextBox adjRichTextBox = (AdjRichTextBox)theEObject;
				T result = caseAdjRichTextBox(adjRichTextBox);
				if (result == null) result = caseAdjWidget(adjRichTextBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_TREE_VIEW: {
				AdjTreeView adjTreeView = (AdjTreeView)theEObject;
				T result = caseAdjTreeView(adjTreeView);
				if (result == null) result = caseAdjWidget(adjTreeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_PROPERTY_GRID: {
				AdjPropertyGrid adjPropertyGrid = (AdjPropertyGrid)theEObject;
				T result = caseAdjPropertyGrid(adjPropertyGrid);
				if (result == null) result = caseAdjWidget(adjPropertyGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_PROGRESS_BAR: {
				AdjProgressBar adjProgressBar = (AdjProgressBar)theEObject;
				T result = caseAdjProgressBar(adjProgressBar);
				if (result == null) result = caseAdjWidget(adjProgressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_DATA_GRID_VIEW: {
				AdjDataGridView adjDataGridView = (AdjDataGridView)theEObject;
				T result = caseAdjDataGridView(adjDataGridView);
				if (result == null) result = caseAdjWidget(adjDataGridView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN: {
				AdjDataGridViewTextBoxColumn adjDataGridViewTextBoxColumn = (AdjDataGridViewTextBoxColumn)theEObject;
				T result = caseAdjDataGridViewTextBoxColumn(adjDataGridViewTextBoxColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_PANEL: {
				AdjPanel adjPanel = (AdjPanel)theEObject;
				T result = caseAdjPanel(adjPanel);
				if (result == null) result = caseAdjWidget(adjPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_GROUP_BOX: {
				AdjGroupBox adjGroupBox = (AdjGroupBox)theEObject;
				T result = caseAdjGroupBox(adjGroupBox);
				if (result == null) result = caseAdjWidget(adjGroupBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_MENU_STRIP: {
				AdjMenuStrip adjMenuStrip = (AdjMenuStrip)theEObject;
				T result = caseAdjMenuStrip(adjMenuStrip);
				if (result == null) result = caseAdjWidget(adjMenuStrip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UidiagramPackage.ADJ_TOOL_STRIP: {
				AdjToolStrip adjToolStrip = (AdjToolStrip)theEObject;
				T result = caseAdjToolStrip(adjToolStrip);
				if (result == null) result = caseAdjWidget(adjToolStrip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryUI(ModelFactoryUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectUI(ProjectUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDiagram(UIDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormUI(FormUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjWidget(AdjWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjLabel(AdjLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjCheckBox(AdjCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjButton(AdjButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj List Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj List Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjListBox(AdjListBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Datepicker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Datepicker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjDatepicker(AdjDatepicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Text Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjTextBox(AdjTextBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Checked List Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Checked List Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjCheckedListBox(AdjCheckedListBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Link Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjLinkLabel(AdjLinkLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Rich Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Rich Text Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjRichTextBox(AdjRichTextBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Tree View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjTreeView(AdjTreeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Property Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Property Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjPropertyGrid(AdjPropertyGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjProgressBar(AdjProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Data Grid View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Data Grid View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjDataGridView(AdjDataGridView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Data Grid View Text Box Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Data Grid View Text Box Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjDataGridViewTextBoxColumn(AdjDataGridViewTextBoxColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjPanel(AdjPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Group Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Group Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjGroupBox(AdjGroupBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Menu Strip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Menu Strip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjMenuStrip(AdjMenuStrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adj Tool Strip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adj Tool Strip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjToolStrip(AdjToolStrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UidiagramSwitch
