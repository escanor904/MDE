/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.ClassAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getClassTypeAdj <em>Class Type Adj</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getLstAttributeAdj <em>Lst Attribute Adj</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getLstMethodAdj <em>Lst Method Adj</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getLstRelationShipAdj <em>Lst Relation Ship Adj</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getLstInputRelationshipAdj <em>Lst Input Relationship Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getClassAdj()
 * @model
 * @generated
 */
public interface ClassAdj extends EObject {
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
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.ClassAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Type Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type Adj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type Adj</em>' reference.
	 * @see #setClassTypeAdj(ClassTypeAdj)
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_ClassTypeAdj()
	 * @model
	 * @generated
	 */
	ClassTypeAdj getClassTypeAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.ClassAdj#getClassTypeAdj <em>Class Type Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type Adj</em>' reference.
	 * @see #getClassTypeAdj()
	 * @generated
	 */
	void setClassTypeAdj(ClassTypeAdj value);

	/**
	 * Returns the value of the '<em><b>Lst Attribute Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.AttributeAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Attribute Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attribute Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_LstAttributeAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeAdj> getLstAttributeAdj();

	/**
	 * Returns the value of the '<em><b>Lst Method Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.MethodAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Method Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Method Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_LstMethodAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodAdj> getLstMethodAdj();

	/**
	 * Returns the value of the '<em><b>Lst Relation Ship Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.RelationshipAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relation Ship Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relation Ship Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_LstRelationShipAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationshipAdj> getLstRelationShipAdj();

	/**
	 * Returns the value of the '<em><b>Lst Input Relationship Adj</b></em>' reference list.
	 * The list contents are of type {@link abstractmodel.RelationshipAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Input Relationship Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Input Relationship Adj</em>' reference list.
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_LstInputRelationshipAdj()
	 * @model
	 * @generated
	 */
	EList<RelationshipAdj> getLstInputRelationshipAdj();

} // ClassAdj
