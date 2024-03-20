/**
 */
package concretemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.AttributeConcreteAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.AttributeConcreteAdj#getValue <em>Value</em>}</li>
 *   <li>{@link concretemodel.AttributeConcreteAdj#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link concretemodel.AttributeConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getAttributeConcreteAdj()
 * @model annotation="gmf.node label='name' color='255,255,128'"
 * @generated
 */
public interface AttributeConcreteAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getAttributeConcreteAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.AttributeConcreteAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see concretemodel.ConcretemodelPackage#getAttributeConcreteAdj_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link concretemodel.AttributeConcreteAdj#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link concretemodel.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see concretemodel.AccessModifier
	 * @see #setAccessModifier(AccessModifier)
	 * @see concretemodel.ConcretemodelPackage#getAttributeConcreteAdj_AccessModifier()
	 * @model
	 * @generated
	 */
	AccessModifier getAccessModifier();

	/**
	 * Sets the value of the '{@link concretemodel.AttributeConcreteAdj#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see concretemodel.AccessModifier
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(AccessModifier value);

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
	 * @see concretemodel.ConcretemodelPackage#getAttributeConcreteAdj_AttributeTypeConcreteAdj()
	 * @model
	 * @generated
	 */
	AttributeTypeConcreteAdj getAttributeTypeConcreteAdj();

	/**
	 * Sets the value of the '{@link concretemodel.AttributeConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type Concrete Adj</em>' reference.
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 */
	void setAttributeTypeConcreteAdj(AttributeTypeConcreteAdj value);

} // AttributeConcreteAdj
