/**
 */
package concretemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.ClassConcreteAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.ClassConcreteAdj#getPath <em>Path</em>}</li>
 *   <li>{@link concretemodel.ClassConcreteAdj#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.ClassConcreteAdj#getLstMethodConcreteAdj <em>Lst Method Concrete Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getClassConcreteAdj()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ClassConcreteAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getClassConcreteAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.ClassConcreteAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see concretemodel.ConcretemodelPackage#getClassConcreteAdj_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concretemodel.ClassConcreteAdj#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Attribute Concrete Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.AttributeConcreteAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Attribute Concrete Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attribute Concrete Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getClassConcreteAdj_LstAttributeConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConcreteAdj> getLstAttributeConcreteAdj();

	/**
	 * Returns the value of the '<em><b>Lst Method Concrete Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.MethodConcreteAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Method Concrete Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Method Concrete Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getClassConcreteAdj_LstMethodConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodConcreteAdj> getLstMethodConcreteAdj();

} // ClassConcreteAdj
