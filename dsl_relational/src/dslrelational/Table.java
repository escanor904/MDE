/**
 */
package dslrelational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.Table#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.Table#getOwnedBySchema <em>Owned By Schema</em>}</li>
 *   <li>{@link dslrelational.Table#getLstTrigger <em>Lst Trigger</em>}</li>
 *   <li>{@link dslrelational.Table#getLstColumn <em>Lst Column</em>}</li>
 *   <li>{@link dslrelational.Table#getLstPrimaryKey <em>Lst Primary Key</em>}</li>
 *   <li>{@link dslrelational.Table#getLstForeignKey <em>Lst Foreign Key</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see dslrelational.DslrelationalPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelational.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Schema</em>' containment reference.
	 * @see #setOwnedBySchema(Schema)
	 * @see dslrelational.DslrelationalPackage#getTable_OwnedBySchema()
	 * @model containment="true"
	 * @generated
	 */
	Schema getOwnedBySchema();

	/**
	 * Sets the value of the '{@link dslrelational.Table#getOwnedBySchema <em>Owned By Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Schema</em>' containment reference.
	 * @see #getOwnedBySchema()
	 * @generated
	 */
	void setOwnedBySchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Lst Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Trigger</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getTable_LstTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getLstTrigger();

	/**
	 * Returns the value of the '<em><b>Lst Column</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Column</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getTable_LstColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumn();

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
	 * @see dslrelational.DslrelationalPackage#getTable_LstPrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getLstPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Lst Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Foreign Key</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getTable_LstForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getLstForeignKey();

} // Table
