/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.PackageAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.PackageAdj#getPath <em>Path</em>}</li>
 *   <li>{@link abstractmodel.PackageAdj#getLstChildPackageAdj <em>Lst Child Package Adj</em>}</li>
 *   <li>{@link abstractmodel.PackageAdj#getLstClassAdj <em>Lst Class Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getPackageAdj()
 * @model
 * @generated
 */
public interface PackageAdj extends EObject {
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
	 * @see abstractmodel.AbstractmodelPackage#getPackageAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.PackageAdj#getName <em>Name</em>}' attribute.
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
	 * @see abstractmodel.AbstractmodelPackage#getPackageAdj_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstractmodel.PackageAdj#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Child Package Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.PackageAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Child Package Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Child Package Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getPackageAdj_LstChildPackageAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageAdj> getLstChildPackageAdj();

	/**
	 * Returns the value of the '<em><b>Lst Class Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.ClassAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getPackageAdj_LstClassAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassAdj> getLstClassAdj();

} // PackageAdj
