/**
 */
package concretemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.ProjectAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.ProjectAdj#getPath <em>Path</em>}</li>
 *   <li>{@link concretemodel.ProjectAdj#getLstClassDiagramAdj <em>Lst Class Diagram Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getProjectAdj()
 * @model
 * @generated
 */
public interface ProjectAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getProjectAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.ProjectAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see concretemodel.ConcretemodelPackage#getProjectAdj_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concretemodel.ProjectAdj#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Class Diagram Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.ClassDiagramAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Diagram Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Diagram Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getProjectAdj_LstClassDiagramAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDiagramAdj> getLstClassDiagramAdj();

} // ProjectAdj
