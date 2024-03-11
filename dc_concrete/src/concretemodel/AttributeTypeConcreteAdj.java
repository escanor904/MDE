/**
 */
package concretemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.AttributeTypeConcreteAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.AttributeTypeConcreteAdj#getParameterConcreteAdj <em>Parameter Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.AttributeTypeConcreteAdj#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getAttributeTypeConcreteAdj()
 * @model
 * @generated
 */
public interface AttributeTypeConcreteAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getAttributeTypeConcreteAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.AttributeTypeConcreteAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Concrete Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.ParameterConcreteAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Concrete Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Concrete Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getAttributeTypeConcreteAdj_ParameterConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterConcreteAdj> getParameterConcreteAdj();

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
	 * @see concretemodel.ConcretemodelPackage#getAttributeTypeConcreteAdj_LstAttributeConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConcreteAdj> getLstAttributeConcreteAdj();

} // AttributeTypeConcreteAdj
