/**
 */
package dslrelational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.Parameter#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link dslrelational.Parameter#getOwnedByFunction <em>Owned By Function</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
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
	 * @see dslrelational.DslrelationalPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelational.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Type</em>' attribute.
	 * @see #setColumnType(String)
	 * @see dslrelational.DslrelationalPackage#getParameter_ColumnType()
	 * @model
	 * @generated
	 */
	String getColumnType();

	/**
	 * Sets the value of the '{@link dslrelational.Parameter#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' attribute.
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Function</em>' reference.
	 * @see #setOwnedByFunction(Function)
	 * @see dslrelational.DslrelationalPackage#getParameter_OwnedByFunction()
	 * @model
	 * @generated
	 */
	Function getOwnedByFunction();

	/**
	 * Sets the value of the '{@link dslrelational.Parameter#getOwnedByFunction <em>Owned By Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Function</em>' reference.
	 * @see #getOwnedByFunction()
	 * @generated
	 */
	void setOwnedByFunction(Function value);

} // Parameter
