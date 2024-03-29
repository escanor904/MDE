/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.MethodAdj#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link abstractmodel.MethodAdj#getAccessModify <em>Access Modify</em>}</li>
 *   <li>{@link abstractmodel.MethodAdj#getReturnTypeAdj <em>Return Type Adj</em>}</li>
 *   <li>{@link abstractmodel.MethodAdj#getBody <em>Body</em>}</li>
 *   <li>{@link abstractmodel.MethodAdj#getLstParameterAdj <em>Lst Parameter Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getMethodAdj()
 * @model
 * @generated
 */
public interface MethodAdj extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see abstractmodel.AbstractmodelPackage#getMethodAdj_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link abstractmodel.MethodAdj#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Access Modify</b></em>' attribute.
	 * The literals are from the enumeration {@link abstractmodel.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modify</em>' attribute.
	 * @see abstractmodel.AccessModifier
	 * @see #setAccessModify(AccessModifier)
	 * @see abstractmodel.AbstractmodelPackage#getMethodAdj_AccessModify()
	 * @model
	 * @generated
	 */
	AccessModifier getAccessModify();

	/**
	 * Sets the value of the '{@link abstractmodel.MethodAdj#getAccessModify <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modify</em>' attribute.
	 * @see abstractmodel.AccessModifier
	 * @see #getAccessModify()
	 * @generated
	 */
	void setAccessModify(AccessModifier value);

	/**
	 * Returns the value of the '<em><b>Return Type Adj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Adj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Adj</em>' attribute.
	 * @see #setReturnTypeAdj(String)
	 * @see abstractmodel.AbstractmodelPackage#getMethodAdj_ReturnTypeAdj()
	 * @model
	 * @generated
	 */
	String getReturnTypeAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.MethodAdj#getReturnTypeAdj <em>Return Type Adj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Adj</em>' attribute.
	 * @see #getReturnTypeAdj()
	 * @generated
	 */
	void setReturnTypeAdj(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see abstractmodel.AbstractmodelPackage#getMethodAdj_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link abstractmodel.MethodAdj#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

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
	 * @see abstractmodel.AbstractmodelPackage#getMethodAdj_LstParameterAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterAdj> getLstParameterAdj();

} // MethodAdj
