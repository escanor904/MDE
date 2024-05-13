/**
 */
package dslrelational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.Column#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.Column#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link dslrelational.Column#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link dslrelational.Column#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.Column#getLstPrimaryKey <em>Lst Primary Key</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
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
	 * @see dslrelational.DslrelationalPackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelational.Column#getName <em>Name</em>}' attribute.
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
	 * @see dslrelational.DslrelationalPackage#getColumn_ColumnType()
	 * @model
	 * @generated
	 */
	String getColumnType();

	/**
	 * Sets the value of the '{@link dslrelational.Column#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' attribute.
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(String value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(Boolean)
	 * @see dslrelational.DslrelationalPackage#getColumn_IsNullable()
	 * @model
	 * @generated
	 */
	Boolean getIsNullable();

	/**
	 * Sets the value of the '{@link dslrelational.Column#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' containment reference.
	 * @see #setOwnedByTable(Table)
	 * @see dslrelational.DslrelationalPackage#getColumn_OwnedByTable()
	 * @model containment="true"
	 * @generated
	 */
	Table getOwnedByTable();

	/**
	 * Sets the value of the '{@link dslrelational.Column#getOwnedByTable <em>Owned By Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Table</em>' containment reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	void setOwnedByTable(Table value);

	/**
	 * Returns the value of the '<em><b>Lst Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Primary Key</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getColumn_LstPrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getLstPrimaryKey();

} // Column
