/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.FormUI#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.FormUI#getLstAdjWidget <em>Lst Adj Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getFormUI()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface FormUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uidiagram.UidiagramPackage#getFormUI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uidiagram.FormUI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.AdjWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Adj Widget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Adj Widget</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getFormUI_LstAdjWidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdjWidget> getLstAdjWidget();

} // FormUI
