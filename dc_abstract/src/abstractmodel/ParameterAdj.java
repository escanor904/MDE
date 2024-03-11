/**
 */
package abstractmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.ParameterAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.ParameterAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getParameterAdj()
 * @model
 * @generated
 */
public interface ParameterAdj extends EObject {
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
	 * @see abstractmodel.AbstractmodelPackage#getParameterAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.ParameterAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Type Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type Adj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type Adj</em>' reference.
	 * @see #setAttributeTypeAdj(AttributeTypeAdj)
	 * @see abstractmodel.AbstractmodelPackage#getParameterAdj_AttributeTypeAdj()
	 * @model
	 * @generated
	 */
	AttributeTypeAdj getAttributeTypeAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.ParameterAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type Adj</em>' reference.
	 * @see #getAttributeTypeAdj()
	 * @generated
	 */
	void setAttributeTypeAdj(AttributeTypeAdj value);

} // ParameterAdj
