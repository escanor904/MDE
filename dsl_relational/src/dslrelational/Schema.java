/**
 */
package dslrelational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.Schema#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.Schema#getLstTable <em>Lst Table</em>}</li>
 *   <li>{@link dslrelational.Schema#getLstFunction <em>Lst Function</em>}</li>
 *   <li>{@link dslrelational.Schema#getLstTrigger <em>Lst Trigger</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
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
	 * @see dslrelational.DslrelationalPackage#getSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelational.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Table</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Table</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getSchema_LstTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getLstTable();

	/**
	 * Returns the value of the '<em><b>Lst Function</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Function</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getSchema_LstFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getLstFunction();

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
	 * @see dslrelational.DslrelationalPackage#getSchema_LstTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getLstTrigger();

} // Schema
