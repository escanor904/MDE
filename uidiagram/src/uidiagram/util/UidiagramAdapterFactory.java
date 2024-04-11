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
			public Adapter caseAdjDatepicker(AdjDatepicker object) {
				return createAdjDatepickerAdapter();
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
			public Adapter caseAdjTreeView(AdjTreeView object) {
				return createAdjTreeViewAdapter();
			}
			@Override
			public Adapter caseAdjPropertyGrid(AdjPropertyGrid object) {
				return createAdjPropertyGridAdapter();
			}
			@Override
			public Adapter caseAdjProgressBar(AdjProgressBar object) {
				return createAdjProgressBarAdapter();
			}
			@Override
			public Adapter caseAdjDataGridView(AdjDataGridView object) {
				return createAdjDataGridViewAdapter();
			}
			@Override
			public Adapter caseAdjDataGridViewTextBoxColumn(AdjDataGridViewTextBoxColumn object) {
				return createAdjDataGridViewTextBoxColumnAdapter();
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
			public Adapter caseAdjMenuStrip(AdjMenuStrip object) {
				return createAdjMenuStripAdapter();
			}
			@Override
			public Adapter caseAdjToolStrip(AdjToolStrip object) {
				return createAdjToolStripAdapter();
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
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjDatepicker <em>Adj Datepicker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjDatepicker
	 * @generated
	 */
	public Adapter createAdjDatepickerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjTreeView <em>Adj Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjTreeView
	 * @generated
	 */
	public Adapter createAdjTreeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjPropertyGrid <em>Adj Property Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjPropertyGrid
	 * @generated
	 */
	public Adapter createAdjPropertyGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjProgressBar <em>Adj Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjProgressBar
	 * @generated
	 */
	public Adapter createAdjProgressBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjDataGridView <em>Adj Data Grid View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjDataGridView
	 * @generated
	 */
	public Adapter createAdjDataGridViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjDataGridViewTextBoxColumn <em>Adj Data Grid View Text Box Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjDataGridViewTextBoxColumn
	 * @generated
	 */
	public Adapter createAdjDataGridViewTextBoxColumnAdapter() {
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
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjMenuStrip <em>Adj Menu Strip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjMenuStrip
	 * @generated
	 */
	public Adapter createAdjMenuStripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.AdjToolStrip <em>Adj Tool Strip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.AdjToolStrip
	 * @generated
	 */
	public Adapter createAdjToolStripAdapter() {
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
