/**
 */
package concretemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.ClassDiagramAdj#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.ClassDiagramAdj#getLstPackageConcreteAdj <em>Lst Package Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.ClassDiagramAdj#getLstRelationship <em>Lst Relationship</em>}</li>
 *   <li>{@link concretemodel.ClassDiagramAdj#getLstClassConcreteAdj <em>Lst Class Concrete Adj</em>}</li>
 * </ul>
 *
 * @see concretemodel.ConcretemodelPackage#getClassDiagramAdj()
 * @model
 * @generated
 */
public interface ClassDiagramAdj extends EObject {
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
	 * @see concretemodel.ConcretemodelPackage#getClassDiagramAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concretemodel.ClassDiagramAdj#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Package Concrete Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.PackageConcreteAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Package Concrete Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Package Concrete Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getClassDiagramAdj_LstPackageConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageConcreteAdj> getLstPackageConcreteAdj();

	/**
	 * Returns the value of the '<em><b>Lst Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.RelationshipAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relationship</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getClassDiagramAdj_LstRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationshipAdj> getLstRelationship();

	/**
	 * Returns the value of the '<em><b>Lst Class Concrete Adj</b></em>' containment reference list.
	 * The list contents are of type {@link concretemodel.ClassConcreteAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Concrete Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Concrete Adj</em>' containment reference list.
	 * @see concretemodel.ConcretemodelPackage#getClassDiagramAdj_LstClassConcreteAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassConcreteAdj> getLstClassConcreteAdj();

} // ClassDiagramAdj
