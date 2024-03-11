/**
 */
package abstractmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type Factory Adj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.ClassTypeFactoryAdj#getLstClassTypeAdj <em>Lst Class Type Adj</em>}</li>
 * </ul>
 *
 * @see abstractmodel.AbstractmodelPackage#getClassTypeFactoryAdj()
 * @model
 * @generated
 */
public interface ClassTypeFactoryAdj extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Class Type Adj</b></em>' containment reference list.
	 * The list contents are of type {@link abstractmodel.ClassTypeAdj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Type Adj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Type Adj</em>' containment reference list.
	 * @see abstractmodel.AbstractmodelPackage#getClassTypeFactoryAdj_LstClassTypeAdj()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassTypeAdj> getLstClassTypeAdj();

} // ClassTypeFactoryAdj
