/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.ModelFactoryUI#getLstProjectUI <em>Lst Project UI</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getModelFactoryUI()
 * @model
 * @generated
 */
public interface ModelFactoryUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Project UI</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.ProjectUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Project UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Project UI</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getModelFactoryUI_LstProjectUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectUI> getLstProjectUI();

} // ModelFactoryUI
