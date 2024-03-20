/**
 */
package abstractmodel;

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
 * @see abstractmodel.AbstractmodelFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://abstractmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "p";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractmodelPackage eINSTANCE = abstractmodel.impl.AbstractmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstractmodel.impl.ModelFactoryAbstractImpl <em>Model Factory Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.ModelFactoryAbstractImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getModelFactoryAbstract()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>List Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__LIST_PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.ProjectAdjImpl <em>Project Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.ProjectAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getProjectAdj()
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
	 * The feature id for the '<em><b>Attribute Type Factory Adj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Lst Package Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ__LST_PACKAGE_ADJ = 3;

	/**
	 * The number of structural features of the '<em>Project Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ADJ_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.AttributeTypeFactoryAdjImpl <em>Attribute Type Factory Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.AttributeTypeFactoryAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeTypeFactoryAdj()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_FACTORY_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Lst Attribute Type Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ = 0;

	/**
	 * The number of structural features of the '<em>Attribute Type Factory Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FACTORY_ADJ_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.AttributeTypeAdjImpl <em>Attribute Type Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.AttributeTypeAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeTypeAdj()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_ADJ = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Parameter Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ = 1;

	/**
	 * The feature id for the '<em><b>Lst Attribute Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ = 2;

	/**
	 * The number of structural features of the '<em>Attribute Type Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_ADJ_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.PackageAdjImpl <em>Package Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.PackageAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getPackageAdj()
	 * @generated
	 */
	int PACKAGE_ADJ = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ADJ__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst Child Package Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Lst Class Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ADJ__LST_CLASS_ADJ = 3;

	/**
	 * The number of structural features of the '<em>Package Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ADJ_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.ClassAdjImpl <em>Class Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.ClassAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getClassAdj()
	 * @generated
	 */
	int CLASS_ADJ = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__PATH_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__CLASS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Acces Modifier Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__ACCES_MODIFIER_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Lst Attribute Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__LST_ATTRIBUTE_ADJ = 4;

	/**
	 * The feature id for the '<em><b>Lst Method Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__LST_METHOD_ADJ = 5;

	/**
	 * The feature id for the '<em><b>Lst Relation Ship Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__LST_RELATION_SHIP_ADJ = 6;

	/**
	 * The feature id for the '<em><b>Lst Input Relationship Adj</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ = 7;

	/**
	 * The number of structural features of the '<em>Class Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ADJ_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.RelationshipAdjImpl <em>Relationship Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.RelationshipAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getRelationshipAdj()
	 * @generated
	 */
	int RELATIONSHIP_ADJ = 6;

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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ__TARGET_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Relationship Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ADJ_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.ContainmentAdjImpl <em>Containment Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.ContainmentAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getContainmentAdj()
	 * @generated
	 */
	int CONTAINMENT_ADJ = 7;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ__ROLE_TARGET = RELATIONSHIP_ADJ__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ__ROLE_SOURCE = RELATIONSHIP_ADJ__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ__MULTIPLICITY_TARGET_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Multiplicity Source Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ__MULTIPLICITY_SOURCE_CLASS = RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ__TARGET_CLASS = RELATIONSHIP_ADJ__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Containment Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.SharingAdjImpl <em>Sharing Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.SharingAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getSharingAdj()
	 * @generated
	 */
	int SHARING_ADJ = 8;

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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ__TARGET_CLASS = RELATIONSHIP_ADJ__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Sharing Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.AssociationAdjImpl <em>Association Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.AssociationAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAssociationAdj()
	 * @generated
	 */
	int ASSOCIATION_ADJ = 9;

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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ__TARGET_CLASS = RELATIONSHIP_ADJ__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Association Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.GeneralizationAdjImpl <em>Generalization Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.GeneralizationAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getGeneralizationAdj()
	 * @generated
	 */
	int GENERALIZATION_ADJ = 10;

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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ__TARGET_CLASS = RELATIONSHIP_ADJ__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Generalization Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_ADJ_FEATURE_COUNT = RELATIONSHIP_ADJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.AttributeAdjImpl <em>Attribute Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.AttributeAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeAdj()
	 * @generated
	 */
	int ATTRIBUTE_ADJ = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADJ__VALOR = 1;

	/**
	 * The feature id for the '<em><b>Acces Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADJ__ACCES_MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Attribute Type Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ = 3;

	/**
	 * The number of structural features of the '<em>Attribute Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADJ_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.MethodAdjImpl <em>Method Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.MethodAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getMethodAdj()
	 * @generated
	 */
	int METHOD_ADJ = 12;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ__ACCESS_MODIFY = 1;

	/**
	 * The feature id for the '<em><b>Return Type Adj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ__RETURN_TYPE_ADJ = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ__BODY = 3;

	/**
	 * The feature id for the '<em><b>Lst Parameter Adj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ__LST_PARAMETER_ADJ = 4;

	/**
	 * The number of structural features of the '<em>Method Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ADJ_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstractmodel.impl.ParameterAdjImpl <em>Parameter Adj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.impl.ParameterAdjImpl
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getParameterAdj()
	 * @generated
	 */
	int PARAMETER_ADJ = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ADJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Type Adj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ADJ__ATTRIBUTE_TYPE_ADJ = 1;

	/**
	 * The number of structural features of the '<em>Parameter Adj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ADJ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstractmodel.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractmodel.AccessModifier
	 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 14;


	/**
	 * Returns the meta object for class '{@link abstractmodel.ModelFactoryAbstract <em>Model Factory Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstract</em>'.
	 * @see abstractmodel.ModelFactoryAbstract
	 * @generated
	 */
	EClass getModelFactoryAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.ModelFactoryAbstract#getListProjects <em>List Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Projects</em>'.
	 * @see abstractmodel.ModelFactoryAbstract#getListProjects()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EReference getModelFactoryAbstract_ListProjects();

	/**
	 * Returns the meta object for class '{@link abstractmodel.ProjectAdj <em>Project Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Adj</em>'.
	 * @see abstractmodel.ProjectAdj
	 * @generated
	 */
	EClass getProjectAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ProjectAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.ProjectAdj#getName()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EAttribute getProjectAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ProjectAdj#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractmodel.ProjectAdj#getPath()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EAttribute getProjectAdj_Path();

	/**
	 * Returns the meta object for the containment reference '{@link abstractmodel.ProjectAdj#getAttributeTypeFactoryAdj <em>Attribute Type Factory Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Type Factory Adj</em>'.
	 * @see abstractmodel.ProjectAdj#getAttributeTypeFactoryAdj()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EReference getProjectAdj_AttributeTypeFactoryAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.ProjectAdj#getLstPackageAdj <em>Lst Package Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Package Adj</em>'.
	 * @see abstractmodel.ProjectAdj#getLstPackageAdj()
	 * @see #getProjectAdj()
	 * @generated
	 */
	EReference getProjectAdj_LstPackageAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.AttributeTypeFactoryAdj <em>Attribute Type Factory Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type Factory Adj</em>'.
	 * @see abstractmodel.AttributeTypeFactoryAdj
	 * @generated
	 */
	EClass getAttributeTypeFactoryAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.AttributeTypeFactoryAdj#getLstAttributeTypeAdj <em>Lst Attribute Type Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attribute Type Adj</em>'.
	 * @see abstractmodel.AttributeTypeFactoryAdj#getLstAttributeTypeAdj()
	 * @see #getAttributeTypeFactoryAdj()
	 * @generated
	 */
	EReference getAttributeTypeFactoryAdj_LstAttributeTypeAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.AttributeTypeAdj <em>Attribute Type Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type Adj</em>'.
	 * @see abstractmodel.AttributeTypeAdj
	 * @generated
	 */
	EClass getAttributeTypeAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.AttributeTypeAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.AttributeTypeAdj#getName()
	 * @see #getAttributeTypeAdj()
	 * @generated
	 */
	EAttribute getAttributeTypeAdj_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.AttributeTypeAdj#getLstParameterAdj <em>Lst Parameter Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parameter Adj</em>'.
	 * @see abstractmodel.AttributeTypeAdj#getLstParameterAdj()
	 * @see #getAttributeTypeAdj()
	 * @generated
	 */
	EReference getAttributeTypeAdj_LstParameterAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.AttributeTypeAdj#getLstAttributeAdj <em>Lst Attribute Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attribute Adj</em>'.
	 * @see abstractmodel.AttributeTypeAdj#getLstAttributeAdj()
	 * @see #getAttributeTypeAdj()
	 * @generated
	 */
	EReference getAttributeTypeAdj_LstAttributeAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.PackageAdj <em>Package Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Adj</em>'.
	 * @see abstractmodel.PackageAdj
	 * @generated
	 */
	EClass getPackageAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.PackageAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.PackageAdj#getName()
	 * @see #getPackageAdj()
	 * @generated
	 */
	EAttribute getPackageAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.PackageAdj#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractmodel.PackageAdj#getPath()
	 * @see #getPackageAdj()
	 * @generated
	 */
	EAttribute getPackageAdj_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.PackageAdj#getLstChildPackageAdj <em>Lst Child Package Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Package Adj</em>'.
	 * @see abstractmodel.PackageAdj#getLstChildPackageAdj()
	 * @see #getPackageAdj()
	 * @generated
	 */
	EReference getPackageAdj_LstChildPackageAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.PackageAdj#getLstClassAdj <em>Lst Class Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class Adj</em>'.
	 * @see abstractmodel.PackageAdj#getLstClassAdj()
	 * @see #getPackageAdj()
	 * @generated
	 */
	EReference getPackageAdj_LstClassAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.ClassAdj <em>Class Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Adj</em>'.
	 * @see abstractmodel.ClassAdj
	 * @generated
	 */
	EClass getClassAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ClassAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.ClassAdj#getName()
	 * @see #getClassAdj()
	 * @generated
	 */
	EAttribute getClassAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ClassAdj#getPathPackage <em>Path Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Package</em>'.
	 * @see abstractmodel.ClassAdj#getPathPackage()
	 * @see #getClassAdj()
	 * @generated
	 */
	EAttribute getClassAdj_PathPackage();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ClassAdj#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see abstractmodel.ClassAdj#getClassType()
	 * @see #getClassAdj()
	 * @generated
	 */
	EAttribute getClassAdj_ClassType();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ClassAdj#getAccesModifierClass <em>Acces Modifier Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acces Modifier Class</em>'.
	 * @see abstractmodel.ClassAdj#getAccesModifierClass()
	 * @see #getClassAdj()
	 * @generated
	 */
	EAttribute getClassAdj_AccesModifierClass();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.ClassAdj#getLstAttributeAdj <em>Lst Attribute Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attribute Adj</em>'.
	 * @see abstractmodel.ClassAdj#getLstAttributeAdj()
	 * @see #getClassAdj()
	 * @generated
	 */
	EReference getClassAdj_LstAttributeAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.ClassAdj#getLstMethodAdj <em>Lst Method Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Method Adj</em>'.
	 * @see abstractmodel.ClassAdj#getLstMethodAdj()
	 * @see #getClassAdj()
	 * @generated
	 */
	EReference getClassAdj_LstMethodAdj();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.ClassAdj#getLstRelationShipAdj <em>Lst Relation Ship Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Relation Ship Adj</em>'.
	 * @see abstractmodel.ClassAdj#getLstRelationShipAdj()
	 * @see #getClassAdj()
	 * @generated
	 */
	EReference getClassAdj_LstRelationShipAdj();

	/**
	 * Returns the meta object for the reference list '{@link abstractmodel.ClassAdj#getLstInputRelationshipAdj <em>Lst Input Relationship Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Input Relationship Adj</em>'.
	 * @see abstractmodel.ClassAdj#getLstInputRelationshipAdj()
	 * @see #getClassAdj()
	 * @generated
	 */
	EReference getClassAdj_LstInputRelationshipAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.RelationshipAdj <em>Relationship Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Adj</em>'.
	 * @see abstractmodel.RelationshipAdj
	 * @generated
	 */
	EClass getRelationshipAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.RelationshipAdj#getRoleTarget <em>Role Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Target</em>'.
	 * @see abstractmodel.RelationshipAdj#getRoleTarget()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_RoleTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.RelationshipAdj#getRoleSource <em>Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Source</em>'.
	 * @see abstractmodel.RelationshipAdj#getRoleSource()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_RoleSource();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.RelationshipAdj#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target Class</em>'.
	 * @see abstractmodel.RelationshipAdj#getMultiplicityTargetClass()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_MultiplicityTargetClass();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.RelationshipAdj#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source Class</em>'.
	 * @see abstractmodel.RelationshipAdj#getMultiplicitySourceClass()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EAttribute getRelationshipAdj_MultiplicitySourceClass();

	/**
	 * Returns the meta object for the reference '{@link abstractmodel.RelationshipAdj#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see abstractmodel.RelationshipAdj#getTargetClass()
	 * @see #getRelationshipAdj()
	 * @generated
	 */
	EReference getRelationshipAdj_TargetClass();

	/**
	 * Returns the meta object for class '{@link abstractmodel.ContainmentAdj <em>Containment Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Adj</em>'.
	 * @see abstractmodel.ContainmentAdj
	 * @generated
	 */
	EClass getContainmentAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.SharingAdj <em>Sharing Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharing Adj</em>'.
	 * @see abstractmodel.SharingAdj
	 * @generated
	 */
	EClass getSharingAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.AssociationAdj <em>Association Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Adj</em>'.
	 * @see abstractmodel.AssociationAdj
	 * @generated
	 */
	EClass getAssociationAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.GeneralizationAdj <em>Generalization Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Adj</em>'.
	 * @see abstractmodel.GeneralizationAdj
	 * @generated
	 */
	EClass getGeneralizationAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.AttributeAdj <em>Attribute Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Adj</em>'.
	 * @see abstractmodel.AttributeAdj
	 * @generated
	 */
	EClass getAttributeAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.AttributeAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.AttributeAdj#getName()
	 * @see #getAttributeAdj()
	 * @generated
	 */
	EAttribute getAttributeAdj_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.AttributeAdj#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see abstractmodel.AttributeAdj#getValor()
	 * @see #getAttributeAdj()
	 * @generated
	 */
	EAttribute getAttributeAdj_Valor();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.AttributeAdj#getAccesModifier <em>Acces Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acces Modifier</em>'.
	 * @see abstractmodel.AttributeAdj#getAccesModifier()
	 * @see #getAttributeAdj()
	 * @generated
	 */
	EAttribute getAttributeAdj_AccesModifier();

	/**
	 * Returns the meta object for the reference '{@link abstractmodel.AttributeAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type Adj</em>'.
	 * @see abstractmodel.AttributeAdj#getAttributeTypeAdj()
	 * @see #getAttributeAdj()
	 * @generated
	 */
	EReference getAttributeAdj_AttributeTypeAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.MethodAdj <em>Method Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Adj</em>'.
	 * @see abstractmodel.MethodAdj
	 * @generated
	 */
	EClass getMethodAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.MethodAdj#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see abstractmodel.MethodAdj#getMethodName()
	 * @see #getMethodAdj()
	 * @generated
	 */
	EAttribute getMethodAdj_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.MethodAdj#getAccessModify <em>Access Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modify</em>'.
	 * @see abstractmodel.MethodAdj#getAccessModify()
	 * @see #getMethodAdj()
	 * @generated
	 */
	EAttribute getMethodAdj_AccessModify();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.MethodAdj#getReturnTypeAdj <em>Return Type Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type Adj</em>'.
	 * @see abstractmodel.MethodAdj#getReturnTypeAdj()
	 * @see #getMethodAdj()
	 * @generated
	 */
	EAttribute getMethodAdj_ReturnTypeAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.MethodAdj#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see abstractmodel.MethodAdj#getBody()
	 * @see #getMethodAdj()
	 * @generated
	 */
	EAttribute getMethodAdj_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractmodel.MethodAdj#getLstParameterAdj <em>Lst Parameter Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parameter Adj</em>'.
	 * @see abstractmodel.MethodAdj#getLstParameterAdj()
	 * @see #getMethodAdj()
	 * @generated
	 */
	EReference getMethodAdj_LstParameterAdj();

	/**
	 * Returns the meta object for class '{@link abstractmodel.ParameterAdj <em>Parameter Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Adj</em>'.
	 * @see abstractmodel.ParameterAdj
	 * @generated
	 */
	EClass getParameterAdj();

	/**
	 * Returns the meta object for the attribute '{@link abstractmodel.ParameterAdj#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractmodel.ParameterAdj#getName()
	 * @see #getParameterAdj()
	 * @generated
	 */
	EAttribute getParameterAdj_Name();

	/**
	 * Returns the meta object for the reference '{@link abstractmodel.ParameterAdj#getAttributeTypeAdj <em>Attribute Type Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type Adj</em>'.
	 * @see abstractmodel.ParameterAdj#getAttributeTypeAdj()
	 * @see #getParameterAdj()
	 * @generated
	 */
	EReference getParameterAdj_AttributeTypeAdj();

	/**
	 * Returns the meta object for enum '{@link abstractmodel.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifier</em>'.
	 * @see abstractmodel.AccessModifier
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
	AbstractmodelFactory getAbstractmodelFactory();

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
		 * The meta object literal for the '{@link abstractmodel.impl.ModelFactoryAbstractImpl <em>Model Factory Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.ModelFactoryAbstractImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getModelFactoryAbstract()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACT = eINSTANCE.getModelFactoryAbstract();

		/**
		 * The meta object literal for the '<em><b>List Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACT__LIST_PROJECTS = eINSTANCE.getModelFactoryAbstract_ListProjects();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.ProjectAdjImpl <em>Project Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.ProjectAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getProjectAdj()
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
		 * The meta object literal for the '<em><b>Attribute Type Factory Adj</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ = eINSTANCE.getProjectAdj_AttributeTypeFactoryAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Package Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_ADJ__LST_PACKAGE_ADJ = eINSTANCE.getProjectAdj_LstPackageAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.AttributeTypeFactoryAdjImpl <em>Attribute Type Factory Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.AttributeTypeFactoryAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeTypeFactoryAdj()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE_FACTORY_ADJ = eINSTANCE.getAttributeTypeFactoryAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Attribute Type Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ = eINSTANCE.getAttributeTypeFactoryAdj_LstAttributeTypeAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.AttributeTypeAdjImpl <em>Attribute Type Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.AttributeTypeAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeTypeAdj()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE_ADJ = eINSTANCE.getAttributeTypeAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE_ADJ__NAME = eINSTANCE.getAttributeTypeAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Parameter Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ = eINSTANCE.getAttributeTypeAdj_LstParameterAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Attribute Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ = eINSTANCE.getAttributeTypeAdj_LstAttributeAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.PackageAdjImpl <em>Package Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.PackageAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getPackageAdj()
		 * @generated
		 */
		EClass PACKAGE_ADJ = eINSTANCE.getPackageAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_ADJ__NAME = eINSTANCE.getPackageAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_ADJ__PATH = eINSTANCE.getPackageAdj_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Child Package Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ = eINSTANCE.getPackageAdj_LstChildPackageAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Class Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ADJ__LST_CLASS_ADJ = eINSTANCE.getPackageAdj_LstClassAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.ClassAdjImpl <em>Class Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.ClassAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getClassAdj()
		 * @generated
		 */
		EClass CLASS_ADJ = eINSTANCE.getClassAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ADJ__NAME = eINSTANCE.getClassAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Path Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ADJ__PATH_PACKAGE = eINSTANCE.getClassAdj_PathPackage();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ADJ__CLASS_TYPE = eINSTANCE.getClassAdj_ClassType();

		/**
		 * The meta object literal for the '<em><b>Acces Modifier Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ADJ__ACCES_MODIFIER_CLASS = eINSTANCE.getClassAdj_AccesModifierClass();

		/**
		 * The meta object literal for the '<em><b>Lst Attribute Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ADJ__LST_ATTRIBUTE_ADJ = eINSTANCE.getClassAdj_LstAttributeAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Method Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ADJ__LST_METHOD_ADJ = eINSTANCE.getClassAdj_LstMethodAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Relation Ship Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ADJ__LST_RELATION_SHIP_ADJ = eINSTANCE.getClassAdj_LstRelationShipAdj();

		/**
		 * The meta object literal for the '<em><b>Lst Input Relationship Adj</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ = eINSTANCE.getClassAdj_LstInputRelationshipAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.RelationshipAdjImpl <em>Relationship Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.RelationshipAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getRelationshipAdj()
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
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ADJ__TARGET_CLASS = eINSTANCE.getRelationshipAdj_TargetClass();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.ContainmentAdjImpl <em>Containment Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.ContainmentAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getContainmentAdj()
		 * @generated
		 */
		EClass CONTAINMENT_ADJ = eINSTANCE.getContainmentAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.SharingAdjImpl <em>Sharing Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.SharingAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getSharingAdj()
		 * @generated
		 */
		EClass SHARING_ADJ = eINSTANCE.getSharingAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.AssociationAdjImpl <em>Association Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.AssociationAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAssociationAdj()
		 * @generated
		 */
		EClass ASSOCIATION_ADJ = eINSTANCE.getAssociationAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.GeneralizationAdjImpl <em>Generalization Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.GeneralizationAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getGeneralizationAdj()
		 * @generated
		 */
		EClass GENERALIZATION_ADJ = eINSTANCE.getGeneralizationAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.AttributeAdjImpl <em>Attribute Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.AttributeAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAttributeAdj()
		 * @generated
		 */
		EClass ATTRIBUTE_ADJ = eINSTANCE.getAttributeAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ADJ__NAME = eINSTANCE.getAttributeAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ADJ__VALOR = eINSTANCE.getAttributeAdj_Valor();

		/**
		 * The meta object literal for the '<em><b>Acces Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ADJ__ACCES_MODIFIER = eINSTANCE.getAttributeAdj_AccesModifier();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Adj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ = eINSTANCE.getAttributeAdj_AttributeTypeAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.MethodAdjImpl <em>Method Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.MethodAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getMethodAdj()
		 * @generated
		 */
		EClass METHOD_ADJ = eINSTANCE.getMethodAdj();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_ADJ__METHOD_NAME = eINSTANCE.getMethodAdj_MethodName();

		/**
		 * The meta object literal for the '<em><b>Access Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_ADJ__ACCESS_MODIFY = eINSTANCE.getMethodAdj_AccessModify();

		/**
		 * The meta object literal for the '<em><b>Return Type Adj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_ADJ__RETURN_TYPE_ADJ = eINSTANCE.getMethodAdj_ReturnTypeAdj();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_ADJ__BODY = eINSTANCE.getMethodAdj_Body();

		/**
		 * The meta object literal for the '<em><b>Lst Parameter Adj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_ADJ__LST_PARAMETER_ADJ = eINSTANCE.getMethodAdj_LstParameterAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.impl.ParameterAdjImpl <em>Parameter Adj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.impl.ParameterAdjImpl
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getParameterAdj()
		 * @generated
		 */
		EClass PARAMETER_ADJ = eINSTANCE.getParameterAdj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_ADJ__NAME = eINSTANCE.getParameterAdj_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Adj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ADJ__ATTRIBUTE_TYPE_ADJ = eINSTANCE.getParameterAdj_AttributeTypeAdj();

		/**
		 * The meta object literal for the '{@link abstractmodel.AccessModifier <em>Access Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractmodel.AccessModifier
		 * @see abstractmodel.impl.AbstractmodelPackageImpl#getAccessModifier()
		 * @generated
		 */
		EEnum ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

	}

} //AbstractmodelPackage
