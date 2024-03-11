/**
 */
package concretemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.RelationshipAdj#getRoleTarget <em>Role Target</em>}</li>
 *   <li>{@link concretemodel.RelationshipAdj#getRoleSource <em>Role Source</em>}</li>
 *   <li>{@link concretemodel.RelationshipAdj#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}</li>
 *   <li>{@link concretemodel.RelationshipAdj#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}</li>
 *   <li>{@link concretemodel.RelationshipAdj#getClassSource <em>Class Source</em>}</li>
 *   <li>{@link concretemodel.RelationshipAdj#getClassTarget <em>Class Target</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj()
 * @model abstract="true"
 * @generated
 */
public interface RelationshipAdj extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Target</em>' attribute.
	 * @see #setRoleTarget(String)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_RoleTarget()
	 * @model
	 * @generated
	 */
	String getRoleTarget();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getRoleTarget <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Target</em>' attribute.
	 * @see #getRoleTarget()
	 * @generated
	 */
	void setRoleTarget(String value);

	/**
	 * Returns the value of the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Source</em>' attribute.
	 * @see #setRoleSource(String)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_RoleSource()
	 * @model
	 * @generated
	 */
	String getRoleSource();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getRoleSource <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Source</em>' attribute.
	 * @see #getRoleSource()
	 * @generated
	 */
	void setRoleSource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Target Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target Class</em>' attribute.
	 * @see #setMultiplicityTargetClass(String)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_MultiplicityTargetClass()
	 * @model
	 * @generated
	 */
	String getMultiplicityTargetClass();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target Class</em>' attribute.
	 * @see #getMultiplicityTargetClass()
	 * @generated
	 */
	void setMultiplicityTargetClass(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Source Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source Class</em>' attribute.
	 * @see #setMultiplicitySourceClass(String)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_MultiplicitySourceClass()
	 * @model
	 * @generated
	 */
	String getMultiplicitySourceClass();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source Class</em>' attribute.
	 * @see #getMultiplicitySourceClass()
	 * @generated
	 */
	void setMultiplicitySourceClass(String value);

	/**
	 * Returns the value of the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Source</em>' reference.
	 * @see #setClassSource(ClassConcreteAdj)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_ClassSource()
	 * @model
	 * @generated
	 */
	ClassConcreteAdj getClassSource();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getClassSource <em>Class Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Source</em>' reference.
	 * @see #getClassSource()
	 * @generated
	 */
	void setClassSource(ClassConcreteAdj value);

	/**
	 * Returns the value of the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Target</em>' reference.
	 * @see #setClassTarget(ClassConcreteAdj)
	 * @see concretemodel.ConcretemodelPackage#getRelationshipAdj_ClassTarget()
	 * @model
	 * @generated
	 */
	ClassConcreteAdj getClassTarget();

	/**
	 * Sets the value of the '{@link concretemodel.RelationshipAdj#getClassTarget <em>Class Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Target</em>' reference.
	 * @see #getClassTarget()
	 * @generated
	 */
	void setClassTarget(ClassConcreteAdj value);

} // RelationshipAdj
