/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.AbstractmodelPackage;
import abstractmodel.AccessModifier;
import abstractmodel.AssociationAdj;
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;
import abstractmodel.AttributeTypeFactoryAdj;
import abstractmodel.ClassAdj;
import abstractmodel.ContainmentAdj;
import abstractmodel.GeneralizationAdj;
import abstractmodel.MethodAdj;
import abstractmodel.ModelFactoryAbstract;
import abstractmodel.PackageAdj;
import abstractmodel.ParameterAdj;
import abstractmodel.ProjectAdj;
import abstractmodel.RelationshipAdj;
import abstractmodel.SharingAdj;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractmodelPackageImpl extends EPackageImpl implements AbstractmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeFactoryAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharingAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifierEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see abstractmodel.AbstractmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractmodelPackageImpl() {
		super(eNS_URI, AbstractmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AbstractmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractmodelPackage init() {
		if (isInited) return (AbstractmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractmodelPackage.eNS_URI);

		// Obtain or create and register package
		AbstractmodelPackageImpl theAbstractmodelPackage = (AbstractmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAbstractmodelPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractmodelPackage.eNS_URI, theAbstractmodelPackage);
		return theAbstractmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryAbstract() {
		return modelFactoryAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstract_ListProjects() {
		return (EReference)modelFactoryAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectAdj() {
		return projectAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectAdj_Name() {
		return (EAttribute)projectAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectAdj_Path() {
		return (EAttribute)projectAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectAdj_AttributeTypeFactoryAdj() {
		return (EReference)projectAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectAdj_LstPackageAdj() {
		return (EReference)projectAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypeFactoryAdj() {
		return attributeTypeFactoryAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeFactoryAdj_LstAttributeTypeAdj() {
		return (EReference)attributeTypeFactoryAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypeAdj() {
		return attributeTypeAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTypeAdj_Name() {
		return (EAttribute)attributeTypeAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeAdj_LstParameterAdj() {
		return (EReference)attributeTypeAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeAdj_LstAttributeAdj() {
		return (EReference)attributeTypeAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageAdj() {
		return packageAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageAdj_Name() {
		return (EAttribute)packageAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageAdj_Path() {
		return (EAttribute)packageAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAdj_LstChildPackageAdj() {
		return (EReference)packageAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAdj_LstClassAdj() {
		return (EReference)packageAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAdj() {
		return classAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAdj_Name() {
		return (EAttribute)classAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAdj_PathPackage() {
		return (EAttribute)classAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAdj_ClassType() {
		return (EAttribute)classAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAdj_AccesModifierClass() {
		return (EAttribute)classAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAdj_LstAttributeAdj() {
		return (EReference)classAdjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAdj_LstMethodAdj() {
		return (EReference)classAdjEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAdj_LstRelationShipAdj() {
		return (EReference)classAdjEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAdj_LstInputRelationshipAdj() {
		return (EReference)classAdjEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipAdj() {
		return relationshipAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipAdj_RoleTarget() {
		return (EAttribute)relationshipAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipAdj_RoleSource() {
		return (EAttribute)relationshipAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipAdj_MultiplicityTargetClass() {
		return (EAttribute)relationshipAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipAdj_MultiplicitySourceClass() {
		return (EAttribute)relationshipAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipAdj_TargetClass() {
		return (EReference)relationshipAdjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentAdj() {
		return containmentAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharingAdj() {
		return sharingAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationAdj() {
		return associationAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationAdj() {
		return generalizationAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAdj() {
		return attributeAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAdj_Name() {
		return (EAttribute)attributeAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAdj_Valor() {
		return (EAttribute)attributeAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAdj_AccesModifier() {
		return (EAttribute)attributeAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAdj_AttributeTypeAdj() {
		return (EReference)attributeAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodAdj() {
		return methodAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAdj_MethodName() {
		return (EAttribute)methodAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAdj_AccessModify() {
		return (EAttribute)methodAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAdj_ReturnTypeAdj() {
		return (EAttribute)methodAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAdj_Body() {
		return (EAttribute)methodAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodAdj_LstParameterAdj() {
		return (EReference)methodAdjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterAdj() {
		return parameterAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterAdj_Name() {
		return (EAttribute)parameterAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterAdj_AttributeTypeAdj() {
		return (EReference)parameterAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifier() {
		return accessModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractmodelFactory getAbstractmodelFactory() {
		return (AbstractmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryAbstractEClass = createEClass(MODEL_FACTORY_ABSTRACT);
		createEReference(modelFactoryAbstractEClass, MODEL_FACTORY_ABSTRACT__LIST_PROJECTS);

		projectAdjEClass = createEClass(PROJECT_ADJ);
		createEAttribute(projectAdjEClass, PROJECT_ADJ__NAME);
		createEAttribute(projectAdjEClass, PROJECT_ADJ__PATH);
		createEReference(projectAdjEClass, PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ);
		createEReference(projectAdjEClass, PROJECT_ADJ__LST_PACKAGE_ADJ);

		attributeTypeFactoryAdjEClass = createEClass(ATTRIBUTE_TYPE_FACTORY_ADJ);
		createEReference(attributeTypeFactoryAdjEClass, ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ);

		attributeTypeAdjEClass = createEClass(ATTRIBUTE_TYPE_ADJ);
		createEAttribute(attributeTypeAdjEClass, ATTRIBUTE_TYPE_ADJ__NAME);
		createEReference(attributeTypeAdjEClass, ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ);
		createEReference(attributeTypeAdjEClass, ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ);

		packageAdjEClass = createEClass(PACKAGE_ADJ);
		createEAttribute(packageAdjEClass, PACKAGE_ADJ__NAME);
		createEAttribute(packageAdjEClass, PACKAGE_ADJ__PATH);
		createEReference(packageAdjEClass, PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ);
		createEReference(packageAdjEClass, PACKAGE_ADJ__LST_CLASS_ADJ);

		classAdjEClass = createEClass(CLASS_ADJ);
		createEAttribute(classAdjEClass, CLASS_ADJ__NAME);
		createEAttribute(classAdjEClass, CLASS_ADJ__PATH_PACKAGE);
		createEAttribute(classAdjEClass, CLASS_ADJ__CLASS_TYPE);
		createEAttribute(classAdjEClass, CLASS_ADJ__ACCES_MODIFIER_CLASS);
		createEReference(classAdjEClass, CLASS_ADJ__LST_ATTRIBUTE_ADJ);
		createEReference(classAdjEClass, CLASS_ADJ__LST_METHOD_ADJ);
		createEReference(classAdjEClass, CLASS_ADJ__LST_RELATION_SHIP_ADJ);
		createEReference(classAdjEClass, CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ);

		relationshipAdjEClass = createEClass(RELATIONSHIP_ADJ);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__ROLE_TARGET);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__ROLE_SOURCE);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS);
		createEReference(relationshipAdjEClass, RELATIONSHIP_ADJ__TARGET_CLASS);

		containmentAdjEClass = createEClass(CONTAINMENT_ADJ);

		sharingAdjEClass = createEClass(SHARING_ADJ);

		associationAdjEClass = createEClass(ASSOCIATION_ADJ);

		generalizationAdjEClass = createEClass(GENERALIZATION_ADJ);

		attributeAdjEClass = createEClass(ATTRIBUTE_ADJ);
		createEAttribute(attributeAdjEClass, ATTRIBUTE_ADJ__NAME);
		createEAttribute(attributeAdjEClass, ATTRIBUTE_ADJ__VALOR);
		createEAttribute(attributeAdjEClass, ATTRIBUTE_ADJ__ACCES_MODIFIER);
		createEReference(attributeAdjEClass, ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ);

		methodAdjEClass = createEClass(METHOD_ADJ);
		createEAttribute(methodAdjEClass, METHOD_ADJ__METHOD_NAME);
		createEAttribute(methodAdjEClass, METHOD_ADJ__ACCESS_MODIFY);
		createEAttribute(methodAdjEClass, METHOD_ADJ__RETURN_TYPE_ADJ);
		createEAttribute(methodAdjEClass, METHOD_ADJ__BODY);
		createEReference(methodAdjEClass, METHOD_ADJ__LST_PARAMETER_ADJ);

		parameterAdjEClass = createEClass(PARAMETER_ADJ);
		createEAttribute(parameterAdjEClass, PARAMETER_ADJ__NAME);
		createEReference(parameterAdjEClass, PARAMETER_ADJ__ATTRIBUTE_TYPE_ADJ);

		// Create enums
		accessModifierEEnum = createEEnum(ACCESS_MODIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containmentAdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		sharingAdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		associationAdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		generalizationAdjEClass.getESuperTypes().add(this.getRelationshipAdj());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryAbstractEClass, ModelFactoryAbstract.class, "ModelFactoryAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryAbstract_ListProjects(), this.getProjectAdj(), null, "listProjects", null, 0, -1, ModelFactoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectAdjEClass, ProjectAdj.class, "ProjectAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectAdj_Path(), ecorePackage.getEString(), "path", null, 0, 1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectAdj_AttributeTypeFactoryAdj(), this.getAttributeTypeFactoryAdj(), null, "attributeTypeFactoryAdj", null, 0, 1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectAdj_LstPackageAdj(), this.getPackageAdj(), null, "lstPackageAdj", null, 0, -1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeFactoryAdjEClass, AttributeTypeFactoryAdj.class, "AttributeTypeFactoryAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeTypeFactoryAdj_LstAttributeTypeAdj(), this.getAttributeTypeAdj(), null, "lstAttributeTypeAdj", null, 0, -1, AttributeTypeFactoryAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeAdjEClass, AttributeTypeAdj.class, "AttributeTypeAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeTypeAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeTypeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeTypeAdj_LstParameterAdj(), this.getParameterAdj(), null, "lstParameterAdj", null, 0, -1, AttributeTypeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeTypeAdj_LstAttributeAdj(), this.getAttributeAdj(), null, "lstAttributeAdj", null, 0, -1, AttributeTypeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageAdjEClass, PackageAdj.class, "PackageAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageAdj_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageAdj_LstChildPackageAdj(), this.getPackageAdj(), null, "lstChildPackageAdj", null, 0, -1, PackageAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageAdj_LstClassAdj(), this.getClassAdj(), null, "lstClassAdj", null, 0, -1, PackageAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAdjEClass, ClassAdj.class, "ClassAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAdj_PathPackage(), ecorePackage.getEString(), "pathPackage", null, 0, 1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAdj_ClassType(), ecorePackage.getEString(), "classType", null, 0, 1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAdj_AccesModifierClass(), ecorePackage.getEString(), "accesModifierClass", null, 0, 1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAdj_LstAttributeAdj(), this.getAttributeAdj(), null, "lstAttributeAdj", null, 0, -1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAdj_LstMethodAdj(), this.getMethodAdj(), null, "lstMethodAdj", null, 0, -1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAdj_LstRelationShipAdj(), this.getRelationshipAdj(), null, "lstRelationShipAdj", null, 0, -1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAdj_LstInputRelationshipAdj(), this.getRelationshipAdj(), null, "lstInputRelationshipAdj", null, 0, -1, ClassAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipAdjEClass, RelationshipAdj.class, "RelationshipAdj", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipAdj_RoleTarget(), ecorePackage.getEString(), "roleTarget", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_RoleSource(), ecorePackage.getEString(), "roleSource", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_MultiplicityTargetClass(), ecorePackage.getEString(), "multiplicityTargetClass", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_MultiplicitySourceClass(), ecorePackage.getEString(), "multiplicitySourceClass", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipAdj_TargetClass(), this.getClassAdj(), null, "targetClass", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentAdjEClass, ContainmentAdj.class, "ContainmentAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharingAdjEClass, SharingAdj.class, "SharingAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationAdjEClass, AssociationAdj.class, "AssociationAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationAdjEClass, GeneralizationAdj.class, "GeneralizationAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeAdjEClass, AttributeAdj.class, "AttributeAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeAdj_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, AttributeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeAdj_AccesModifier(), ecorePackage.getEString(), "accesModifier", null, 0, 1, AttributeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAdj_AttributeTypeAdj(), this.getAttributeTypeAdj(), null, "attributeTypeAdj", null, 0, 1, AttributeAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodAdjEClass, MethodAdj.class, "MethodAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodAdj_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, MethodAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodAdj_AccessModify(), this.getAccessModifier(), "accessModify", null, 0, 1, MethodAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodAdj_ReturnTypeAdj(), ecorePackage.getEString(), "returnTypeAdj", null, 0, 1, MethodAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodAdj_Body(), ecorePackage.getEString(), "body", null, 0, 1, MethodAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodAdj_LstParameterAdj(), this.getParameterAdj(), null, "lstParameterAdj", null, 0, -1, MethodAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterAdjEClass, ParameterAdj.class, "ParameterAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterAdj_AttributeTypeAdj(), this.getAttributeTypeAdj(), null, "attributeTypeAdj", null, 0, 1, ParameterAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PROTECTED);

		// Create resource
		createResource(eNS_URI);
	}

} //AbstractmodelPackageImpl
