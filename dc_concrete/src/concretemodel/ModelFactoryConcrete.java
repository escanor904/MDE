/**
 */
package concretemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.ModelFactoryConcrete#getListProjects <em>List Projects</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getModelFactoryConcrete()
 * @model
 * @generated
 */
public interface ModelFactoryConcrete extends EObject {
	/**
	 * Returns the value of the '<em><b>List Projects</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.ProjectAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Projects</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getModelFactoryConcrete_ListProjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectAdj> getListProjects();

} // ModelFactoryConcrete
