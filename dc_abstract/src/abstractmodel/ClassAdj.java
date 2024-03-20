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
 *   <li>{@link abstractmodel.ClassAdj#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getClassType <em>Class Type</em>}</li>
 *   <li>{@link abstractmodel.ClassAdj#getAccesModifierClass <em>Acces Modifier Class</em>}</li>
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
	 * Returns the value of the '<em><b>Path Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Package</em>' attribute.
	 * @see #setPathPackage(String)
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_PathPackage()
	 * @model
	 * @generated
	 */
	String getPathPackage();

	/**
	 * Sets the value of the '{@link abstractmodel.ClassAdj#getPathPackage <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Package</em>' attribute.
	 * @see #getPathPackage()
	 * @generated
	 */
	void setPathPackage(String value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(String)
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_ClassType()
	 * @model
	 * @generated
	 */
	String getClassType();

	/**
	 * Sets the value of the '{@link abstractmodel.ClassAdj#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(String value);

	/**
	 * Returns the value of the '<em><b>Acces Modifier Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acces Modifier Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces Modifier Class</em>' attribute.
	 * @see #setAccesModifierClass(String)
	 * @see abstractmodel.AbstractmodelPackage#getClassAdj_AccesModifierClass()
	 * @model
	 * @generated
	 */
	String getAccesModifierClass();

	/**
	 * Sets the value of the '{@link abstractmodel.ClassAdj#getAccesModifierClass <em>Acces Modifier Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces Modifier Class</em>' attribute.
	 * @see #getAccesModifierClass()
	 * @generated
	 */
	void setAccesModifierClass(String value);

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
	 * If the meaning of the '<em>Lst Input Relationship Adj</em>' reference list isn't clear,
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
