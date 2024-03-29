/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.AttributeTypeAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.AttributeTypeAdj#getLstParameterAdj <em>Lst Parameter Adj</em>}</li>
 *   <li>{@link abstractmodel.AttributeTypeAdj#getLstAttributeAdj <em>Lst Attribute Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeAdj()
 * @model
 * @generated
 */
public interface AttributeTypeAdj extends EObject {
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
	 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.AttributeTypeAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Parameter Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.ParameterAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Parameter Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Parameter Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeAdj_LstParameterAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterAdj> getLstParameterAdj();

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
	 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeAdj_LstAttributeAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeAdj> getLstAttributeAdj();

} // AttributeTypeAdj
