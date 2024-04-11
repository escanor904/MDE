/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.ProjectUI#getLstDiagramUI <em>Lst Diagram UI</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getProjectUI()
 * @model
 * @generated
 */
public interface ProjectUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Diagram UI</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.UIDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Diagram UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Diagram UI</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getProjectUI_LstDiagramUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIDiagram> getLstDiagramUI();

} // ProjectUI
