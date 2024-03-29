/**
 */
package abstractmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.AttributeAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.AttributeAdj#getValor <em>Valor</em>}</li>
 *   <li>{@link abstractmodel.AttributeAdj#getAccesModifier <em>Acces Modifier</em>}</li>
 *   <li>{@link abstractmodel.AttributeAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getAttributeAdj()
 * @model
 * @generated
 */
public interface AttributeAdj extends EObject {
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
	 * @see abstractmodel.AbstractmodelPackage#getAttributeAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.AttributeAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see abstractmodel.AbstractmodelPackage#getAttributeAdj_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link abstractmodel.AttributeAdj#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * Returns the value of the '<em><b>Acces Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acces Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces Modifier</em>' attribute.
	 * @see #setAccesModifier(String)
	 * @see abstractmodel.AbstractmodelPackage#getAttributeAdj_AccesModifier()
	 * @model
	 * @generated
	 */
	String getAccesModifier();

	/**
	 * Sets the value of the '{@link abstractmodel.AttributeAdj#getAccesModifier <em>Acces Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces Modifier</em>' attribute.
	 * @see #getAccesModifier()
	 * @generated
	 */
	void setAccesModifier(String value);

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
	 * @see abstractmodel.AbstractmodelPackage#getAttributeAdj_AttributeTypeAdj()
	 * @model
	 * @generated
	 */
	AttributeTypeAdj getAttributeTypeAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.AttributeAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type Adj</em>' reference.
	 * @see #getAttributeTypeAdj()
	 * @generated
	 */
	void setAttributeTypeAdj(AttributeTypeAdj value);

} // AttributeAdj
