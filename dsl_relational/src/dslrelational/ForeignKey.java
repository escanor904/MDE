/**
 */
package dslrelational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.ForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.ForeignKey#getThePrimaryKey <em>The Primary Key</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
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
	 * @see dslrelational.DslrelationalPackage#getForeignKey_OwnedByTable()
	 * @model
	 * @generated
	 */
	Table getOwnedByTable();

	/**
	 * Sets the value of the '{@link dslrelational.ForeignKey#getOwnedByTable <em>Owned By Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Table</em>' reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	void setOwnedByTable(Table value);

	/**
	 * Returns the value of the '<em><b>The Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Primary Key</em>' reference.
	 * @see #setThePrimaryKey(PrimaryKey)
	 * @see dslrelational.DslrelationalPackage#getForeignKey_ThePrimaryKey()
	 * @model
	 * @generated
	 */
	PrimaryKey getThePrimaryKey();

	/**
	 * Sets the value of the '{@link dslrelational.ForeignKey#getThePrimaryKey <em>The Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Primary Key</em>' reference.
	 * @see #getThePrimaryKey()
	 * @generated
	 */
	void setThePrimaryKey(PrimaryKey value);

} // ForeignKey
