/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.UIDiagram#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUIDiagram()
 * @model
 * @generated
 */
public interface UIDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(FormUI)
	 * @see uidiagram.UidiagramPackage#getUIDiagram_Form()
	 * @model containment="true"
	 * @generated
	 */
	FormUI getForm();

	/**
	 * Sets the value of the '{@link uidiagram.UIDiagram#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(FormUI value);

} // UIDiagram
