/**
 */
package concretemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see concretemodel.ConcretemodelFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concretemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://concretemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concretemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretemodelPackage eINSTANCE = concretemodel.impl.ConcretemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link concretemodel.impl.ModelFactoryConcreteImpl <em>Model Factory Concrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ModelFactoryConcreteImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getModelFactoryConcrete()
	 * @generated
	 */
	int MODEL_FACTORY_CONCRETE = 0;

	/**
	 * The feature id for the '<em><b>List Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETE__LIST_PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link concretemodel.impl.ProjectAdjImpl <em>Project Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ProjectAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getProjectAdj()
	 * @generated
	 */
	int PROJECT_ADJ = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst Class Diagram Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ = 2;

	/**
	 * The number of structural features of the '<em>Project Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concretemodel.impl.ClassDiagramAdjImpl <em>Class Diagram Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ClassDiagramAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getClassDiagramAdj()
	 * @generated
	 */
	int CLASS_DIAGRAM_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Package Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ = 1;

	/**
	 * The feature id for the '<em><b>Lst Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Lst Class Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ = 3;

	/**
	 * The number of structural features of the '<em>Class Diagram Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ADJ_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link concretemodel.impl.PackageConcreteAdjImpl <em>Package Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.PackageConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getPackageConcreteAdj()
	 * @generated
	 */
	int PACKAGE_CONCRETE_ADJ = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONCRETE_ADJ__PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONCRETE_ADJ__NAME = 1;

	/**
	 * The number of structural features of the '<em>Package Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONCRETE_ADJ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concretemodel.impl.RelationshipAdjImpl <em>Relationship Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.RelationshipAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getRelationshipAdj()
	 * @generated
	 */
	int RELATIONSHIP_ADJ = 4;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__ROLE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__ROLE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__CLASS_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__CLASS_TARGET = 5;

	/**
	 * The number of structural features of the '<em>Relationship Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link concretemodel.impl.ContainmentSdjImpl <em>Containment Sdj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ContainmentSdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getContainmentSdj()
	 * @generated
	 */
	int CONTAINMENT_SDJ = 5;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__ROLE_TARGET = RELATIONSHIP_ADJ__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__ROLE_SOURCE = RELATIONSHIP_ADJ__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__MULTIPLICITY_TARGET_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__MULTIPLICITY_SOURCE_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__CLASS_SOURCE = RELATIONSHIP_ADJ__CLASS_SOURCE;

	/**
	 * The feature id for the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ__CLASS_TARGET = RELATIONSHIP_ADJ__CLASS_TARGET;

	/**
	 * The number of structural features of the '<em>Containment Sdj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_SDJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concretemodel.impl.SharingAdjImpl <em>Sharing Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.SharingAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getSharingAdj()
	 * @generated
	 */
	int SHARING_ADJ = 6;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__ROLE_TARGET = RELATIONSHIP_ADJ__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__ROLE_SOURCE = RELATIONSHIP_ADJ__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__MULTIPLICITY_TARGET_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__MULTIPLICITY_SOURCE_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__CLASS_SOURCE = RELATIONSHIP_ADJ__CLASS_SOURCE;

	/**
	 * The feature id for the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__CLASS_TARGET = RELATIONSHIP_ADJ__CLASS_TARGET;

	/**
	 * The number of structural features of the '<em>Sharing Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concretemodel.impl.AssociationAdjImpl <em>Association Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.AssociationAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getAssociationAdj()
	 * @generated
	 */
	int ASSOCIATION_ADJ = 7;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__ROLE_TARGET = RELATIONSHIP_ADJ__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__ROLE_SOURCE = RELATIONSHIP_ADJ__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__MULTIPLICITY_TARGET_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__MULTIPLICITY_SOURCE_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__CLASS_SOURCE = RELATIONSHIP_ADJ__CLASS_SOURCE;

	/**
	 * The feature id for the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__CLASS_TARGET = RELATIONSHIP_ADJ__CLASS_TARGET;

	/**
	 * The number of structural features of the '<em>Association Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concretemodel.impl.GeneralizationAdjImpl <em>Generalization Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.GeneralizationAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getGeneralizationAdj()
	 * @generated
	 */
	int GENERALIZATION_ADJ = 8;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__ROLE_TARGET = RELATIONSHIP_ADJ__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__ROLE_SOURCE = RELATIONSHIP_ADJ__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__MULTIPLICITY_TARGET_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__MULTIPLICITY_SOURCE_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Class Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__CLASS_SOURCE = RELATIONSHIP_ADJ__CLASS_SOURCE;

	/**
	 * The feature id for the '<em><b>Class Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__CLASS_TARGET = RELATIONSHIP_ADJ__CLASS_TARGET;

	/**
	 * The number of structural features of the '<em>Generalization Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concretemodel.impl.ClassConcreteAdjImpl <em>Class Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ClassConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getClassConcreteAdj()
	 * @generated
	 */
	int CLASS_CONCRETE_ADJ = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONCRETE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONCRETE_ADJ__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst Attribute Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Lst Method Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ = 3;

	/**
	 * The number of structural features of the '<em>Class Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONCRETE_ADJ_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link concretemodel.impl.MethodConcreteAdjImpl <em>Method Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.MethodConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getMethodConcreteAdj()
	 * @generated
	 */
	int METHOD_CONCRETE_ADJ = 10;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ__BODY = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ__ACCESS_MODIFIER = 3;

	/**
	 * The feature id for the '<em><b>Lst Parameter Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ = 4;

	/**
	 * The number of structural features of the '<em>Method Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONCRETE_ADJ_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concretemodel.impl.ParameterConcreteAdjImpl <em>Parameter Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.ParameterConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getParameterConcreteAdj()
	 * @generated
	 */
	int PARAMETER_CONCRETE_ADJ = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONCRETE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Type Concrete Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ = 1;

	/**
	 * The number of structural features of the '<em>Parameter Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONCRETE_ADJ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concretemodel.impl.AttributeTypeConcreteAdjImpl <em>Attribute Type Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.AttributeTypeConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getAttributeTypeConcreteAdj()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_CONCRETE_ADJ = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ = 1;

	/**
	 * The feature id for the '<em><b>Lst Attribute Concrete Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ = 2;

	/**
	 * The number of structural features of the '<em>Attribute Type Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CONCRETE_ADJ_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concretemodel.impl.AttributeConcreteAdjImpl <em>Attribute Concrete Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.impl.AttributeConcreteAdjImpl
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getAttributeConcreteAdj()
	 * @generated
	 */
	int ATTRIBUTE_CONCRETE_ADJ = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONCRETE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONCRETE_ADJ__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Attribute Type Concrete Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ = 2;

	/**
	 * The number of structural features of the '<em>Attribute Concrete Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONCRETE_ADJ_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concretemodel.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concretemodel.AccessModifier
	 * @see concretemodel.impl.ConcretemodelPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 14;


	/**
	 * Returns the meta object for class '{@link concretemodel.ModelFactoryConcrete <em>Model Factory Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Concrete</em>'.
	 * @see concretemodel.ModelFactoryConcrete
	 * @generated
	 */
	EClass getModelFactoryConcrete();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ModelFactoryConcrete#getListProjects <em>List Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Projects</em>'.
	 * @see concretemodel.ModelFactoryConcrete#getListProjects()
	 * @see #getModelFactoryConcrete()
	 * @generated
	 */
	EReference getModelFactoryConcrete_ListProjects();

	/**
	 * Returns the meta object for class '{@link concretemodel.ProjectAdj <em>Project Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Adj</em>'.
	 * @see concretemodel.ProjectAdj
	 * @generated
	 */
	EClass getProjectAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ProjectAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.ProjectAdj#getName()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EAttribute getProjectAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ProjectAdj#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concretemodel.ProjectAdj#getPath()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EAttribute getProjectAdj_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ProjectAdj#getLstClassDiagramAdj <em>Lst Class Diagram Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class Diagram Adj</em>'.
	 * @see concretemodel.ProjectAdj#getLstClassDiagramAdj()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EReference getProjectAdj_LstClassDiagramAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.ClassDiagramAdj <em>Class Diagram Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram Adj</em>'.
	 * @see concretemodel.ClassDiagramAdj
	 * @generated
	 */
	EClass getClassDiagramAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ClassDiagramAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.ClassDiagramAdj#getName()
	 * @see #getClassDiagramAdj()
	 * @generated
	 */
	EAttribute getClassDiagramAdj_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ClassDiagramAdj#getLstPackageConcreteAdj <em>Lst Package Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Package Concrete Adj</em>'.
	 * @see concretemodel.ClassDiagramAdj#getLstPackageConcreteAdj()
	 * @see #getClassDiagramAdj()
	 * @generated
	 */
	EReference getClassDiagramAdj_LstPackageConcreteAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ClassDiagramAdj#getLstRelationship <em>Lst Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Relationship</em>'.
	 * @see concretemodel.ClassDiagramAdj#getLstRelationship()
	 * @see #getClassDiagramAdj()
	 * @generated
	 */
	EReference getClassDiagramAdj_LstRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ClassDiagramAdj#getLstClassConcreteAdj <em>Lst Class Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class Concrete Adj</em>'.
	 * @see concretemodel.ClassDiagramAdj#getLstClassConcreteAdj()
	 * @see #getClassDiagramAdj()
	 * @generated
	 */
	EReference getClassDiagramAdj_LstClassConcreteAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.PackageConcreteAdj <em>Package Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Concrete Adj</em>'.
	 * @see concretemodel.PackageConcreteAdj
	 * @generated
	 */
	EClass getPackageConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.PackageConcreteAdj#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concretemodel.PackageConcreteAdj#getPath()
	 * @see #getPackageConcreteAdj()
	 * @generated
	 */
	EAttribute getPackageConcreteAdj_Path();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.PackageConcreteAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.PackageConcreteAdj#getName()
	 * @see #getPackageConcreteAdj()
	 * @generated
	 */
	EAttribute getPackageConcreteAdj_Name();

	/**
	 * Returns the meta object for class '{@link concretemodel.RelationshipAdj <em>Relationship Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Adj</em>'.
	 * @see concretemodel.RelationshipAdj
	 * @generated
	 */
	EClass getRelationshipAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.RelationshipAdj#getRoleTarget <em>Role Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Target</em>'.
	 * @see concretemodel.RelationshipAdj#getRoleTarget()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_RoleTarget();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.RelationshipAdj#getRoleSource <em>Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Source</em>'.
	 * @see concretemodel.RelationshipAdj#getRoleSource()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_RoleSource();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.RelationshipAdj#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target Class</em>'.
	 * @see concretemodel.RelationshipAdj#getMultiplicityTargetClass()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_MultiplicityTargetClass();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.RelationshipAdj#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source Class</em>'.
	 * @see concretemodel.RelationshipAdj#getMultiplicitySourceClass()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_MultiplicitySourceClass();

	/**
	 * Returns the meta object for the reference '{@link concretemodel.RelationshipAdj#getClassSource <em>Class Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Source</em>'.
	 * @see concretemodel.RelationshipAdj#getClassSource()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EReference getRelationshipAdj_ClassSource();

	/**
	 * Returns the meta object for the reference '{@link concretemodel.RelationshipAdj#getClassTarget <em>Class Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Target</em>'.
	 * @see concretemodel.RelationshipAdj#getClassTarget()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EReference getRelationshipAdj_ClassTarget();

	/**
	 * Returns the meta object for class '{@link concretemodel.ContainmentSdj <em>Containment Sdj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Sdj</em>'.
	 * @see concretemodel.ContainmentSdj
	 * @generated
	 */
	EClass getContainmentSdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.SharingAdj <em>Sharing Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharing Adj</em>'.
	 * @see concretemodel.SharingAdj
	 * @generated
	 */
	EClass getSharingAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.AssociationAdj <em>Association Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Adj</em>'.
	 * @see concretemodel.AssociationAdj
	 * @generated
	 */
	EClass getAssociationAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.GeneralizationAdj <em>Generalization Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Adj</em>'.
	 * @see concretemodel.GeneralizationAdj
	 * @generated
	 */
	EClass getGeneralizationAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.ClassConcreteAdj <em>Class Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Concrete Adj</em>'.
	 * @see concretemodel.ClassConcreteAdj
	 * @generated
	 */
	EClass getClassConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ClassConcreteAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.ClassConcreteAdj#getName()
	 * @see #getClassConcreteAdj()
	 * @generated
	 */
	EAttribute getClassConcreteAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ClassConcreteAdj#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concretemodel.ClassConcreteAdj#getPath()
	 * @see #getClassConcreteAdj()
	 * @generated
	 */
	EAttribute getClassConcreteAdj_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ClassConcreteAdj#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attribute Concrete Adj</em>'.
	 * @see concretemodel.ClassConcreteAdj#getLstAttributeConcreteAdj()
	 * @see #getClassConcreteAdj()
	 * @generated
	 */
	EReference getClassConcreteAdj_LstAttributeConcreteAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.ClassConcreteAdj#getLstMethodConcreteAdj <em>Lst Method Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Method Concrete Adj</em>'.
	 * @see concretemodel.ClassConcreteAdj#getLstMethodConcreteAdj()
	 * @see #getClassConcreteAdj()
	 * @generated
	 */
	EReference getClassConcreteAdj_LstMethodConcreteAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.MethodConcreteAdj <em>Method Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Concrete Adj</em>'.
	 * @see concretemodel.MethodConcreteAdj
	 * @generated
	 */
	EClass getMethodConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.MethodConcreteAdj#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see concretemodel.MethodConcreteAdj#getMethodName()
	 * @see #getMethodConcreteAdj()
	 * @generated
	 */
	EAttribute getMethodConcreteAdj_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.MethodConcreteAdj#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see concretemodel.MethodConcreteAdj#getBody()
	 * @see #getMethodConcreteAdj()
	 * @generated
	 */
	EAttribute getMethodConcreteAdj_Body();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.MethodConcreteAdj#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see concretemodel.MethodConcreteAdj#getReturnType()
	 * @see #getMethodConcreteAdj()
	 * @generated
	 */
	EAttribute getMethodConcreteAdj_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.MethodConcreteAdj#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concretemodel.MethodConcreteAdj#getAccessModifier()
	 * @see #getMethodConcreteAdj()
	 * @generated
	 */
	EAttribute getMethodConcreteAdj_AccessModifier();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.MethodConcreteAdj#getLstParameterConcreteAdj <em>Lst Parameter Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parameter Concrete Adj</em>'.
	 * @see concretemodel.MethodConcreteAdj#getLstParameterConcreteAdj()
	 * @see #getMethodConcreteAdj()
	 * @generated
	 */
	EReference getMethodConcreteAdj_LstParameterConcreteAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.ParameterConcreteAdj <em>Parameter Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Concrete Adj</em>'.
	 * @see concretemodel.ParameterConcreteAdj
	 * @generated
	 */
	EClass getParameterConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.ParameterConcreteAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.ParameterConcreteAdj#getName()
	 * @see #getParameterConcreteAdj()
	 * @generated
	 */
	EAttribute getParameterConcreteAdj_Name();

	/**
	 * Returns the meta object for the reference '{@link concretemodel.ParameterConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type Concrete Adj</em>'.
	 * @see concretemodel.ParameterConcreteAdj#getAttributeTypeConcreteAdj()
	 * @see #getParameterConcreteAdj()
	 * @generated
	 */
	EReference getParameterConcreteAdj_AttributeTypeConcreteAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.AttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type Concrete Adj</em>'.
	 * @see concretemodel.AttributeTypeConcreteAdj
	 * @generated
	 */
	EClass getAttributeTypeConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.AttributeTypeConcreteAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.AttributeTypeConcreteAdj#getName()
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 */
	EAttribute getAttributeTypeConcreteAdj_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.AttributeTypeConcreteAdj#getParameterConcreteAdj <em>Parameter Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Concrete Adj</em>'.
	 * @see concretemodel.AttributeTypeConcreteAdj#getParameterConcreteAdj()
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 */
	EReference getAttributeTypeConcreteAdj_ParameterConcreteAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link concretemodel.AttributeTypeConcreteAdj#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attribute Concrete Adj</em>'.
	 * @see concretemodel.AttributeTypeConcreteAdj#getLstAttributeConcreteAdj()
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 */
	EReference getAttributeTypeConcreteAdj_LstAttributeConcreteAdj();

	/**
	 * Returns the meta object for class '{@link concretemodel.AttributeConcreteAdj <em>Attribute Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Concrete Adj</em>'.
	 * @see concretemodel.AttributeConcreteAdj
	 * @generated
	 */
	EClass getAttributeConcreteAdj();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.AttributeConcreteAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concretemodel.AttributeConcreteAdj#getName()
	 * @see #getAttributeConcreteAdj()
	 * @generated
	 */
	EAttribute getAttributeConcreteAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link concretemodel.AttributeConcreteAdj#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see concretemodel.AttributeConcreteAdj#getValue()
	 * @see #getAttributeConcreteAdj()
	 * @generated
	 */
	EAttribute getAttributeConcreteAdj_Value();

	/**
	 * Returns the meta object for the reference '{@link concretemodel.AttributeConcreteAdj#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type Concrete Adj</em>'.
	 * @see concretemodel.AttributeConcreteAdj#getAttributeTypeConcreteAdj()
	 * @see #getAttributeConcreteAdj()
	 * @generated
	 */
	EReference getAttributeConcreteAdj_AttributeTypeConcreteAdj();

	/**
	 * Returns the meta object for enum '{@link concretemodel.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifier</em>'.
	 * @see concretemodel.AccessModifier
	 * @generated
	 */
	EEnum getAccessModifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConcretemodelFactory getConcretemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link concretemodel.impl.ModelFactoryConcreteImpl <em>Model Factory Concrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ModelFactoryConcreteImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getModelFactoryConcrete()
		 * @generated
		 */
		EClass MODEL_FACTORY_CONCRETE = eINSTANCE.getModelFactoryConcrete();

		/**
		 * The meta object literal for the '<em><b>List Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_CONCRETE__LIST_PROJECTS = eINSTANCE.getModelFactoryConcrete_ListProjects();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.ProjectAdjImpl <em>Project Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ProjectAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getProjectAdj()
		 * @generated
		 */
		EClass PROJECT_ADJ = eINSTANCE.getProjectAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ADJ__NAME = eINSTANCE.getProjectAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ADJ__PATH = eINSTANCE.getProjectAdj_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Class Diagram Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ = eINSTANCE.getProjectAdj_LstClassDiagramAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.ClassDiagramAdjImpl <em>Class Diagram Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ClassDiagramAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getClassDiagramAdj()
		 * @generated
		 */
		EClass CLASS_DIAGRAM_ADJ = eINSTANCE.getClassDiagramAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_ADJ__NAME = eINSTANCE.getClassDiagramAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Package Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ = eINSTANCE.getClassDiagramAdj_LstPackageConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP = eINSTANCE.getClassDiagramAdj_LstRelationship();

		/**
		 * The meta object literal for the '<em><b>Lst Class Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ = eINSTANCE.getClassDiagramAdj_LstClassConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.PackageConcreteAdjImpl <em>Package Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.PackageConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getPackageConcreteAdj()
		 * @generated
		 */
		EClass PACKAGE_CONCRETE_ADJ = eINSTANCE.getPackageConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_CONCRETE_ADJ__PATH = eINSTANCE.getPackageConcreteAdj_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_CONCRETE_ADJ__NAME = eINSTANCE.getPackageConcreteAdj_Name();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.RelationshipAdjImpl <em>Relationship Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.RelationshipAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getRelationshipAdj()
		 * @generated
		 */
		EClass RELATIONSHIP_ADJ = eINSTANCE.getRelationshipAdj();

		/**
		 * The meta object literal for the '<em><b>Role Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ADJ__ROLE_TARGET = eINSTANCE.getRelationshipAdj_RoleTarget();

		/**
		 * The meta object literal for the '<em><b>Role Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ADJ__ROLE_SOURCE = eINSTANCE.getRelationshipAdj_RoleSource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS = eINSTANCE.getRelationshipAdj_MultiplicityTargetClass();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Source Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS = eINSTANCE.getRelationshipAdj_MultiplicitySourceClass();

		/**
		 * The meta object literal for the '<em><b>Class Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ADJ__CLASS_SOURCE = eINSTANCE.getRelationshipAdj_ClassSource();

		/**
		 * The meta object literal for the '<em><b>Class Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ADJ__CLASS_TARGET = eINSTANCE.getRelationshipAdj_ClassTarget();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.ContainmentSdjImpl <em>Containment Sdj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ContainmentSdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getContainmentSdj()
		 * @generated
		 */
		EClass CONTAINMENT_SDJ = eINSTANCE.getContainmentSdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.SharingAdjImpl <em>Sharing Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.SharingAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getSharingAdj()
		 * @generated
		 */
		EClass SHARING_ADJ = eINSTANCE.getSharingAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.AssociationAdjImpl <em>Association Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.AssociationAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getAssociationAdj()
		 * @generated
		 */
		EClass ASSOCIATION_ADJ = eINSTANCE.getAssociationAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.GeneralizationAdjImpl <em>Generalization Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.GeneralizationAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getGeneralizationAdj()
		 * @generated
		 */
		EClass GENERALIZATION_ADJ = eINSTANCE.getGeneralizationAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.ClassConcreteAdjImpl <em>Class Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ClassConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getClassConcreteAdj()
		 * @generated
		 */
		EClass CLASS_CONCRETE_ADJ = eINSTANCE.getClassConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_CONCRETE_ADJ__NAME = eINSTANCE.getClassConcreteAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_CONCRETE_ADJ__PATH = eINSTANCE.getClassConcreteAdj_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Attribute Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ = eINSTANCE.getClassConcreteAdj_LstAttributeConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Method Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ = eINSTANCE.getClassConcreteAdj_LstMethodConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.MethodConcreteAdjImpl <em>Method Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.MethodConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getMethodConcreteAdj()
		 * @generated
		 */
		EClass METHOD_CONCRETE_ADJ = eINSTANCE.getMethodConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONCRETE_ADJ__METHOD_NAME = eINSTANCE.getMethodConcreteAdj_MethodName();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONCRETE_ADJ__BODY = eINSTANCE.getMethodConcreteAdj_Body();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONCRETE_ADJ__RETURN_TYPE = eINSTANCE.getMethodConcreteAdj_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONCRETE_ADJ__ACCESS_MODIFIER = eINSTANCE.getMethodConcreteAdj_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Lst Parameter Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ = eINSTANCE.getMethodConcreteAdj_LstParameterConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.ParameterConcreteAdjImpl <em>Parameter Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.ParameterConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getParameterConcreteAdj()
		 * @generated
		 */
		EClass PARAMETER_CONCRETE_ADJ = eINSTANCE.getParameterConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_CONCRETE_ADJ__NAME = eINSTANCE.getParameterConcreteAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Concrete Adj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ = eINSTANCE.getParameterConcreteAdj_AttributeTypeConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.AttributeTypeConcreteAdjImpl <em>Attribute Type Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.AttributeTypeConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getAttributeTypeConcreteAdj()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE_CONCRETE_ADJ = eINSTANCE.getAttributeTypeConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME = eINSTANCE.getAttributeTypeConcreteAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ = eINSTANCE.getAttributeTypeConcreteAdj_ParameterConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Attribute Concrete Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ = eINSTANCE.getAttributeTypeConcreteAdj_LstAttributeConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.impl.AttributeConcreteAdjImpl <em>Attribute Concrete Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.impl.AttributeConcreteAdjImpl
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getAttributeConcreteAdj()
		 * @generated
		 */
		EClass ATTRIBUTE_CONCRETE_ADJ = eINSTANCE.getAttributeConcreteAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONCRETE_ADJ__NAME = eINSTANCE.getAttributeConcreteAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONCRETE_ADJ__VALUE = eINSTANCE.getAttributeConcreteAdj_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Concrete Adj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ = eINSTANCE.getAttributeConcreteAdj_AttributeTypeConcreteAdj();

		/**
		 * The meta object literal for the '{@link concretemodel.AccessModifier <em>Access Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concretemodel.AccessModifier
		 * @see concretemodel.impl.ConcretemodelPackageImpl#getAccessModifier()
		 * @generated
		 */
		EEnum ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

	}

} //ConcretemodelPackage
