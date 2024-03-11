/**
 */
package abstractmodel;

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
 *   <li>{@link abstractmodel.ProjectAdj#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.ProjectAdj#getPath <em>Path</em>}</li>
 *   <li>{@link abstractmodel.ProjectAdj#getClassTypeFactoryAdj <em>Class Type Factory Adj</em>}</li>
 *   <li>{@link abstractmodel.ProjectAdj#getAttributeTypeFactoryAdj <em>Attribute Type Factory Adj</em>}</li>
 *   <li>{@link abstractmodel.ProjectAdj#getLstPackageAdj <em>Lst Package Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getProjectAdj()
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
	 * @see abstractmodel.AbstractmodelPackage#getProjectAdj_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractmodel.ProjectAdj#getName <em>Name</em>}' attribute.
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
	 * @see abstractmodel.AbstractmodelPackage#getProjectAdj_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstractmodel.ProjectAdj#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Class Type Factory Adj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type Factory Adj</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type Factory Adj</em>' containment reference.
	 * @see #setClassTypeFactoryAdj(ClassTypeFactoryAdj)
	 * @see abstractmodel.AbstractmodelPackage#getProjectAdj_ClassTypeFactoryAdj()
	 * @model containment="true"
	 * @generated
	 */
	ClassTypeFactoryAdj getClassTypeFactoryAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.ProjectAdj#getClassTypeFactoryAdj <em>Class Type Factory Adj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type Factory Adj</em>' containment reference.
	 * @see #getClassTypeFactoryAdj()
	 * @generated
	 */
	void setClassTypeFactoryAdj(ClassTypeFactoryAdj value);

	/**
	 * Returns the value of the '<em><b>Attribute Type Factory Adj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type Factory Adj</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type Factory Adj</em>' containment reference.
	 * @see #setAttributeTypeFactoryAdj(AttributeTypeFactoryAdj)
	 * @see abstractmodel.AbstractmodelPackage#getProjectAdj_AttributeTypeFactoryAdj()
	 * @model containment="true"
	 * @generated
	 */
	AttributeTypeFactoryAdj getAttributeTypeFactoryAdj();

	/**
	 * Sets the value of the '{@link abstractmodel.ProjectAdj#getAttributeTypeFactoryAdj <em>Attribute Type Factory Adj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type Factory Adj</em>' containment reference.
	 * @see #getAttributeTypeFactoryAdj()
	 * @generated
	 */
	void setAttributeTypeFactoryAdj(AttributeTypeFactoryAdj value);

	/**
	 * Returns the value of the '<em><b>Lst Package Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.PackageAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Package Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Package Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getProjectAdj_LstPackageAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageAdj> getLstPackageAdj();

} // ProjectAdj
