/**
 */
package dslrelational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.PrimaryKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.PrimaryKey#getLstForeignKey <em>Lst Foreign Key</em>}</li>
 *   <li>{@link dslrelational.PrimaryKey#getTheColumn <em>The Column</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' reference.
	 * @see #setOwnedByTable(Table)
	 * @see dslrelational.DslrelationalPackage#getPrimaryKey_OwnedByTable()
	 * @model
	 * @generated
	 */
	Table getOwnedByTable();

	/**
	 * Sets the value of the '{@link dslrelational.PrimaryKey#getOwnedByTable <em>Owned By Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Table</em>' reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	void setOwnedByTable(Table value);

	/**
	 * Returns the value of the '<em><b>Lst Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link dslrelational.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Foreign Key</em>' reference list.
	 * @see dslrelational.DslrelationalPackage#getPrimaryKey_LstForeignKey()
	 * @model
	 * @generated
	 */
	EList<ForeignKey> getLstForeignKey();

	/**
	 * Returns the value of the '<em><b>The Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Column</em>' reference.
	 * @see #setTheColumn(Column)
	 * @see dslrelational.DslrelationalPackage#getPrimaryKey_TheColumn()
	 * @model
	 * @generated
	 */
	Column getTheColumn();

	/**
	 * Sets the value of the '{@link dslrelational.PrimaryKey#getTheColumn <em>The Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Column</em>' reference.
	 * @see #getTheColumn()
	 * @generated
	 */
	void setTheColumn(Column value);

} // PrimaryKey
