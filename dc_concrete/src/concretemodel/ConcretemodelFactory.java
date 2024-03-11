/**
 */
package concretemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see concretemodel.ConcretemodelPackage
 * @generated
 */
public interface ConcretemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretemodelFactory eINSTANCE = concretemodel.impl.ConcretemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Concrete</em>'.
	 * @generated
	 */
	ModelFactoryConcrete createModelFactoryConcrete();

	/**
	 * Returns a new object of class '<em>Project Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Adj</em>'.
	 * @generated
	 */
	ProjectAdj createProjectAdj();

	/**
	 * Returns a new object of class '<em>Class Diagram Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Diagram Adj</em>'.
	 * @generated
	 */
	ClassDiagramAdj createClassDiagramAdj();

	/**
	 * Returns a new object of class '<em>Package Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Concrete Adj</em>'.
	 * @generated
	 */
	PackageConcreteAdj createPackageConcreteAdj();

	/**
	 * Returns a new object of class '<em>Containment Sdj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Sdj</em>'.
	 * @generated
	 */
	ContainmentSdj createContainmentSdj();

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
	 * Returns a new object of class '<em>Class Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Concrete Adj</em>'.
	 * @generated
	 */
	ClassConcreteAdj createClassConcreteAdj();

	/**
	 * Returns a new object of class '<em>Method Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Concrete Adj</em>'.
	 * @generated
	 */
	MethodConcreteAdj createMethodConcreteAdj();

	/**
	 * Returns a new object of class '<em>Parameter Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Concrete Adj</em>'.
	 * @generated
	 */
	ParameterConcreteAdj createParameterConcreteAdj();

	/**
	 * Returns a new object of class '<em>Attribute Type Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type Concrete Adj</em>'.
	 * @generated
	 */
	AttributeTypeConcreteAdj createAttributeTypeConcreteAdj();

	/**
	 * Returns a new object of class '<em>Attribute Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Concrete Adj</em>'.
	 * @generated
	 */
	AttributeConcreteAdj createAttributeConcreteAdj();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConcretemodelPackage getConcretemodelPackage();

} //ConcretemodelFactory
