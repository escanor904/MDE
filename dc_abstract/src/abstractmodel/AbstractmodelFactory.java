/**
 */
package abstractmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstractmodel.AbstractmodelPackage
 * @generated
 */
public interface AbstractmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractmodelFactory eINSTANCE = abstractmodel.impl.AbstractmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Abstract</em>'.
	 * @generated
	 */
	ModelFactoryAbstract createModelFactoryAbstract();

	/**
	 * Returns a new object of class '<em>Project Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Adj</em>'.
	 * @generated
	 */
	ProjectAdj createProjectAdj();

	/**
	 * Returns a new object of class '<em>Class Type Factory Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type Factory Adj</em>'.
	 * @generated
	 */
	ClassTypeFactoryAdj createClassTypeFactoryAdj();

	/**
	 * Returns a new object of class '<em>Class Type Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type Adj</em>'.
	 * @generated
	 */
	ClassTypeAdj createClassTypeAdj();

	/**
	 * Returns a new object of class '<em>Attribute Type Factory Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type Factory Adj</em>'.
	 * @generated
	 */
	AttributeTypeFactoryAdj createAttributeTypeFactoryAdj();

	/**
	 * Returns a new object of class '<em>Attribute Type Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type Adj</em>'.
	 * @generated
	 */
	AttributeTypeAdj createAttributeTypeAdj();

	/**
	 * Returns a new object of class '<em>Package Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Adj</em>'.
	 * @generated
	 */
	PackageAdj createPackageAdj();

	/**
	 * Returns a new object of class '<em>Class Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Adj</em>'.
	 * @generated
	 */
	ClassAdj createClassAdj();

	/**
	 * Returns a new object of class '<em>Containment Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Adj</em>'.
	 * @generated
	 */
	ContainmentAdj createContainmentAdj();

	/**
	 * Returns a new object of class '<em>Sharing Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sharing Adj</em>'.
	 * @generated
	 */
	SharingAdj createSharingAdj();

	/**
	 * Returns a new object of class '<em>Association Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Adj</em>'.
	 * @generated
	 */
	AssociationAdj createAssociationAdj();

	/**
	 * Returns a new object of class '<em>Generalization Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Adj</em>'.
	 * @generated
	 */
	GeneralizationAdj createGeneralizationAdj();

	/**
	 * Returns a new object of class '<em>Attribute Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Adj</em>'.
	 * @generated
	 */
	AttributeAdj createAttributeAdj();

	/**
	 * Returns a new object of class '<em>Method Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Adj</em>'.
	 * @generated
	 */
	MethodAdj createMethodAdj();

	/**
	 * Returns a new object of class '<em>Parameter Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Adj</em>'.
	 * @generated
	 */
	ParameterAdj createParameterAdj();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractmodelPackage getAbstractmodelPackage();

} //AbstractmodelFactory
