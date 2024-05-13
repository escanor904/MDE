/**
 */
package dslrelational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Relational</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.ModelFactoryRelational#getLstDataProject <em>Lst Data Project</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getModelFactoryRelational()
 * @model
 * @generated
 */
public interface ModelFactoryRelational extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Data Project</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelational.DataProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Data Project</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Data Project</em>' containment reference list.
	 * @see dslrelational.DslrelationalPackage#getModelFactoryRelational_LstDataProject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProject> getLstDataProject();

} // ModelFactoryRelational
