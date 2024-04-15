/**
 */
package uidiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramPackage
 * @generated
 */
public class UidiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UidiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UidiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UidiagramSwitch<Adapter> modelSwitch =
		new UidiagramSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryUI(ModelFactoryUI object) {
				return createModelFactoryUIAdapter();
			}
			@Override
			public Adapter caseProjectUI(ProjectUI object) {
				return createProjectUIAdapter();
			}
			@Override
			public Adapter caseUIDiagram(UIDiagram object) {
				return createUIDiagramAdapter();
			}
			@Override
			public Adapter caseFormUI(FormUI object) {
				return createFormUIAdapter();
			}
			@Override
			public Adapter caseAdjWidget(AdjWidget object) {
				return createAdjWidgetAdapter();
			}
			@Override
			public Adapter caseAdjLabel(AdjLabel object) {
				return createAdjLabelAdapter();
			}
			@Override
			public Adapter caseAdjCheckBox(AdjCheckBox object) {
				return createAdjCheckBoxAdapter();
			}
			@Override
			public Adapter caseAdjButton(AdjButton object) {
				return createAdjButtonAdapter();
			}
			@Override
			public Adapter caseAdjListBox(AdjListBox object) {
				return createAdjListBoxAdapter();
			}
			@Override
			public Adapter caseAdjDateTimePicker(AdjDateTimePicker object) {
				return createAdjDateTimePickerAdapter();
			}
			@Override
			public Adapter caseAdjTextBox(AdjTextBox object) {
				return createAdjTextBoxAdapter();
			}
			@Override
			public Adapter caseAdjCheckedListBox(AdjCheckedListBox object) {
				return createAdjCheckedListBoxAdapter();
			}
			@Override
			public Adapter caseAdjLinkLabel(AdjLinkLabel object) {
				return createAdjLinkLabelAdapter();
			}
			@Override
			public Adapter caseAdjRichTextBox(AdjRichTextBox object) {
				return createAdjRichTextBoxAdapter();
			}
			@Override
			public Adapter caseAdjComboBox(AdjComboBox object) {
				return createAdjComboBoxAdapter();
			}
			@Override
			public Adapter caseAdjRadioButton(AdjRadioButton object) {
				return createAdjRadioButtonAdapter();
			}
			@Override
			public Adapter caseAdjPictureBox(AdjPictureBox object) {
				return createAdjPictureBoxAdapter();
			}
			@Override
			public Adapter caseAdjListView(AdjListView object) {
				return createAdjListViewAdapter();
			}
			@Override
			public Adapter caseAdjListViewColumn(AdjListViewColumn object) {
				return createAdjListViewColumnAdapter();
			}
			@Override
			public Adapter caseAdjPanel(AdjPanel object) {
				return createAdjPanelAdapter();
			}
			@Override
			public Adapter caseAdjGroupBox(AdjGroupBox object) {
				return createAdjGroupBoxAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.ModelFactoryUI <em>Model Factory UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.ModelFactoryUI
	 * @generated
	 */
	public Adapter createModelFactoryUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.ProjectUI <em>Project UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.ProjectUI
	 * @generated
	 */
	public Adapter createProjectUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.UIDiagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.UIDiagram
	 * @generated
	 */
	public Adapter createUIDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.FormUI <em>Form UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.FormUI
	 * @generated
	 */
	public Adapter createFormUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjWidget <em>Adj Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjWidget
	 * @generated
	 */
	public Adapter createAdjWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjLabel <em>Adj Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjLabel
	 * @generated
	 */
	public Adapter createAdjLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjCheckBox <em>Adj Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjCheckBox
	 * @generated
	 */
	public Adapter createAdjCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjButton <em>Adj Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjButton
	 * @generated
	 */
	public Adapter createAdjButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjListBox <em>Adj List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjListBox
	 * @generated
	 */
	public Adapter createAdjListBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjDateTimePicker <em>Adj Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjDateTimePicker
	 * @generated
	 */
	public Adapter createAdjDateTimePickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjTextBox <em>Adj Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjTextBox
	 * @generated
	 */
	public Adapter createAdjTextBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjCheckedListBox <em>Adj Checked List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjCheckedListBox
	 * @generated
	 */
	public Adapter createAdjCheckedListBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjLinkLabel <em>Adj Link Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjLinkLabel
	 * @generated
	 */
	public Adapter createAdjLinkLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjRichTextBox <em>Adj Rich Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjRichTextBox
	 * @generated
	 */
	public Adapter createAdjRichTextBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjComboBox <em>Adj Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjComboBox
	 * @generated
	 */
	public Adapter createAdjComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjRadioButton <em>Adj Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjRadioButton
	 * @generated
	 */
	public Adapter createAdjRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjPictureBox <em>Adj Picture Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjPictureBox
	 * @generated
	 */
	public Adapter createAdjPictureBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjListView <em>Adj List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjListView
	 * @generated
	 */
	public Adapter createAdjListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjListViewColumn <em>Adj List View Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjListViewColumn
	 * @generated
	 */
	public Adapter createAdjListViewColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjPanel <em>Adj Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjPanel
	 * @generated
	 */
	public Adapter createAdjPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjGroupBox <em>Adj Group Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjGroupBox
	 * @generated
	 */
	public Adapter createAdjGroupBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UidiagramAdapterFactory
