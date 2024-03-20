/**
 */
package concretemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.ParameterConcreteAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.ParameterConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getParameterConcreteAdj()
 * @model annotation="gmf.node label='name' color='255,255,128'"
 * @generated
 */
public interface ParameterConcreteAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getParameterConcreteAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.ParameterConcreteAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Type Concrete Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type Concrete Adj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type Concrete Adj</em>' reference.
	 * @see #setAttributeTypeConcreteAdj(AttributeTypeConcreteAdj)
	 * @see concretemodel.ConcretemodelPackage#getParameterConcreteAdj_AttributeTypeConcreteAdj()
	 * @model
	 * @generated
	 */
	AttributeTypeConcreteAdj getAttributeTypeConcreteAdj();

	/**
	 * Sets the value of the '{@link concretemodel.ParameterConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type Concrete Adj</em>' reference.
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 */
	void setAttributeTypeConcreteAdj(AttributeTypeConcreteAdj value);

} // ParameterConcreteAdj
