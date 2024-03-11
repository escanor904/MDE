/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type Factory Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.AttributeTypeFactoryAdj#getLstAttributeTypeAdj <em>Lst Attribute Type Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeFactoryAdj()
 * @model
 * @generated
 */
public interface AttributeTypeFactoryAdj extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Attribute Type Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.AttributeTypeAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Attribute Type Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attribute Type Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getAttributeTypeFactoryAdj_LstAttributeTypeAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeTypeAdj> getLstAttributeTypeAdj();

} // AttributeTypeFactoryAdj
