/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramPackage
 * @generated
 */
public interface UidiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramFactory eINSTANCE = uidiagram.impl.UidiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory UI</em>'.
	 * @generated
	 */
	ModelFactoryUI createModelFactoryUI();

	/**
	 * Returns a new object of class '<em>Project UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project UI</em>'.
	 * @generated
	 */
	ProjectUI createProjectUI();

	/**
	 * Returns a new object of class '<em>UI Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Diagram</em>'.
	 * @generated
	 */
	UIDiagram createUIDiagram();

	/**
	 * Returns a new object of class '<em>Form UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form UI</em>'.
	 * @generated
	 */
	FormUI createFormUI();

	/**
	 * Returns a new object of class '<em>Adj Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Label</em>'.
	 * @generated
	 */
	AdjLabel createAdjLabel();

	/**
	 * Returns a new object of class '<em>Adj Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Check Box</em>'.
	 * @generated
	 */
	AdjCheckBox createAdjCheckBox();

	/**
	 * Returns a new object of class '<em>Adj Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Button</em>'.
	 * @generated
	 */
	AdjButton createAdjButton();

	/**
	 * Returns a new object of class '<em>Adj List Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj List Box</em>'.
	 * @generated
	 */
	AdjListBox createAdjListBox();

	/**
	 * Returns a new object of class '<em>Adj Date Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Date Time Picker</em>'.
	 * @generated
	 */
	AdjDateTimePicker createAdjDateTimePicker();

	/**
	 * Returns a new object of class '<em>Adj Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Text Box</em>'.
	 * @generated
	 */
	AdjTextBox createAdjTextBox();

	/**
	 * Returns a new object of class '<em>Adj Checked List Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Checked List Box</em>'.
	 * @generated
	 */
	AdjCheckedListBox createAdjCheckedListBox();

	/**
	 * Returns a new object of class '<em>Adj Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Link Label</em>'.
	 * @generated
	 */
	AdjLinkLabel createAdjLinkLabel();

	/**
	 * Returns a new object of class '<em>Adj Rich Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Rich Text Box</em>'.
	 * @generated
	 */
	AdjRichTextBox createAdjRichTextBox();

	/**
	 * Returns a new object of class '<em>Adj Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Combo Box</em>'.
	 * @generated
	 */
	AdjComboBox createAdjComboBox();

	/**
	 * Returns a new object of class '<em>Adj Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Radio Button</em>'.
	 * @generated
	 */
	AdjRadioButton createAdjRadioButton();

	/**
	 * Returns a new object of class '<em>Adj Picture Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Picture Box</em>'.
	 * @generated
	 */
	AdjPictureBox createAdjPictureBox();

	/**
	 * Returns a new object of class '<em>Adj List View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj List View</em>'.
	 * @generated
	 */
	AdjListView createAdjListView();

	/**
	 * Returns a new object of class '<em>Adj List View Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj List View Column</em>'.
	 * @generated
	 */
	AdjListViewColumn createAdjListViewColumn();

	/**
	 * Returns a new object of class '<em>Adj Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Panel</em>'.
	 * @generated
	 */
	AdjPanel createAdjPanel();

	/**
	 * Returns a new object of class '<em>Adj Group Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adj Group Box</em>'.
	 * @generated
	 */
	AdjGroupBox createAdjGroupBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UidiagramPackage getUidiagramPackage();

} //UidiagramFactory
