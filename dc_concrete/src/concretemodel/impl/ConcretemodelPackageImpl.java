/**
 */
package concretemodel.impl;

import concretemodel.AccessModifier;
import concretemodel.AssociationAdj;
import concretemodel.AttributeConcreteAdj;
import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ClassConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelFactory;
import concretemodel.ConcretemodelPackage;
import concretemodel.ContainmentSdj;
import concretemodel.GeneralizationAdj;
import concretemodel.MethodConcreteAdj;
import concretemodel.ModelFactoryConcrete;
import concretemodel.PackageConcreteAdj;
import concretemodel.ParameterConcreteAdj;
import concretemodel.ProjectAdj;
import concretemodel.RelationshipAdj;
import concretemodel.SharingAdj;

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
public class ConcretemodelPackageImpl extends EPackageImpl implements ConcretemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryConcreteEClass = null;

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
	private EClass classDiagramAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageConcreteAdjEClass = null;

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
	private EClass containmentSdjEClass = null;

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
	private EClass classConcreteAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodConcreteAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConcreteAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeConcreteAdjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConcreteAdjEClass = null;

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
	 * @see concretemodel.ConcretemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretemodelPackageImpl() {
		super(eNS_URI, ConcretemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcretemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretemodelPackage init() {
		if (isInited) return (ConcretemodelPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretemodelPackage.eNS_URI);

		// Obtain or create and register package
		ConcretemodelPackageImpl theConcretemodelPackage = (ConcretemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConcretemodelPackage.createPackageContents();

		// Initialize created meta-data
		theConcretemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretemodelPackage.eNS_URI, theConcretemodelPackage);
		return theConcretemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryConcrete() {
		return modelFactoryConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryConcrete_ListProjects() {
		return (EReference)modelFactoryConcreteEClass.getEStructuralFeatures().get(0);
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
	public EReference getProjectAdj_LstClassDiagramAdj() {
		return (EReference)projectAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDiagramAdj() {
		return classDiagramAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramAdj_Name() {
		return (EAttribute)classDiagramAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramAdj_LstPackageConcreteAdj() {
		return (EReference)classDiagramAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramAdj_LstRelationship() {
		return (EReference)classDiagramAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramAdj_LstClassConcreteAdj() {
		return (EReference)classDiagramAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageConcreteAdj() {
		return packageConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageConcreteAdj_Path() {
		return (EAttribute)packageConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageConcreteAdj_Name() {
		return (EAttribute)packageConcreteAdjEClass.getEStructuralFeatures().get(1);
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
	public EReference getRelationshipAdj_ClassSource() {
		return (EReference)relationshipAdjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipAdj_ClassTarget() {
		return (EReference)relationshipAdjEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentSdj() {
		return containmentSdjEClass;
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
	public EClass getClassConcreteAdj() {
		return classConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassConcreteAdj_Name() {
		return (EAttribute)classConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassConcreteAdj_Path() {
		return (EAttribute)classConcreteAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassConcreteAdj_LstAttributeConcreteAdj() {
		return (EReference)classConcreteAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassConcreteAdj_LstMethodConcreteAdj() {
		return (EReference)classConcreteAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodConcreteAdj() {
		return methodConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodConcreteAdj_MethodName() {
		return (EAttribute)methodConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodConcreteAdj_Body() {
		return (EAttribute)methodConcreteAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodConcreteAdj_ReturnType() {
		return (EAttribute)methodConcreteAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodConcreteAdj_AccessModifier() {
		return (EAttribute)methodConcreteAdjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConcreteAdj_LstParameterConcreteAdj() {
		return (EReference)methodConcreteAdjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConcreteAdj() {
		return parameterConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterConcreteAdj_Name() {
		return (EAttribute)parameterConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConcreteAdj_AttributeTypeConcreteAdj() {
		return (EReference)parameterConcreteAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypeConcreteAdj() {
		return attributeTypeConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTypeConcreteAdj_Name() {
		return (EAttribute)attributeTypeConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeConcreteAdj_ParameterConcreteAdj() {
		return (EReference)attributeTypeConcreteAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeConcreteAdj_LstAttributeConcreteAdj() {
		return (EReference)attributeTypeConcreteAdjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConcreteAdj() {
		return attributeConcreteAdjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConcreteAdj_Name() {
		return (EAttribute)attributeConcreteAdjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConcreteAdj_Value() {
		return (EAttribute)attributeConcreteAdjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConcreteAdj_AttributeTypeConcreteAdj() {
		return (EReference)attributeConcreteAdjEClass.getEStructuralFeatures().get(2);
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
	public ConcretemodelFactory getConcretemodelFactory() {
		return (ConcretemodelFactory)getEFactoryInstance();
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
		modelFactoryConcreteEClass = createEClass(MODEL_FACTORY_CONCRETE);
		createEReference(modelFactoryConcreteEClass, MODEL_FACTORY_CONCRETE__LIST_PROJECTS);

		projectAdjEClass = createEClass(PROJECT_ADJ);
		createEAttribute(projectAdjEClass, PROJECT_ADJ__NAME);
		createEAttribute(projectAdjEClass, PROJECT_ADJ__PATH);
		createEReference(projectAdjEClass, PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ);

		classDiagramAdjEClass = createEClass(CLASS_DIAGRAM_ADJ);
		createEAttribute(classDiagramAdjEClass, CLASS_DIAGRAM_ADJ__NAME);
		createEReference(classDiagramAdjEClass, CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ);
		createEReference(classDiagramAdjEClass, CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP);
		createEReference(classDiagramAdjEClass, CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ);

		packageConcreteAdjEClass = createEClass(PACKAGE_CONCRETE_ADJ);
		createEAttribute(packageConcreteAdjEClass, PACKAGE_CONCRETE_ADJ__PATH);
		createEAttribute(packageConcreteAdjEClass, PACKAGE_CONCRETE_ADJ__NAME);

		relationshipAdjEClass = createEClass(RELATIONSHIP_ADJ);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__ROLE_TARGET);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__ROLE_SOURCE);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS);
		createEAttribute(relationshipAdjEClass, RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS);
		createEReference(relationshipAdjEClass, RELATIONSHIP_ADJ__CLASS_SOURCE);
		createEReference(relationshipAdjEClass, RELATIONSHIP_ADJ__CLASS_TARGET);

		containmentSdjEClass = createEClass(CONTAINMENT_SDJ);

		sharingAdjEClass = createEClass(SHARING_ADJ);

		associationAdjEClass = createEClass(ASSOCIATION_ADJ);

		generalizationAdjEClass = createEClass(GENERALIZATION_ADJ);

		classConcreteAdjEClass = createEClass(CLASS_CONCRETE_ADJ);
		createEAttribute(classConcreteAdjEClass, CLASS_CONCRETE_ADJ__NAME);
		createEAttribute(classConcreteAdjEClass, CLASS_CONCRETE_ADJ__PATH);
		createEReference(classConcreteAdjEClass, CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ);
		createEReference(classConcreteAdjEClass, CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ);

		methodConcreteAdjEClass = createEClass(METHOD_CONCRETE_ADJ);
		createEAttribute(methodConcreteAdjEClass, METHOD_CONCRETE_ADJ__METHOD_NAME);
		createEAttribute(methodConcreteAdjEClass, METHOD_CONCRETE_ADJ__BODY);
		createEAttribute(methodConcreteAdjEClass, METHOD_CONCRETE_ADJ__RETURN_TYPE);
		createEAttribute(methodConcreteAdjEClass, METHOD_CONCRETE_ADJ__ACCESS_MODIFIER);
		createEReference(methodConcreteAdjEClass, METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ);

		parameterConcreteAdjEClass = createEClass(PARAMETER_CONCRETE_ADJ);
		createEAttribute(parameterConcreteAdjEClass, PARAMETER_CONCRETE_ADJ__NAME);
		createEReference(parameterConcreteAdjEClass, PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ);

		attributeTypeConcreteAdjEClass = createEClass(ATTRIBUTE_TYPE_CONCRETE_ADJ);
		createEAttribute(attributeTypeConcreteAdjEClass, ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME);
		createEReference(attributeTypeConcreteAdjEClass, ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ);
		createEReference(attributeTypeConcreteAdjEClass, ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ);

		attributeConcreteAdjEClass = createEClass(ATTRIBUTE_CONCRETE_ADJ);
		createEAttribute(attributeConcreteAdjEClass, ATTRIBUTE_CONCRETE_ADJ__NAME);
		createEAttribute(attributeConcreteAdjEClass, ATTRIBUTE_CONCRETE_ADJ__VALUE);
		createEReference(attributeConcreteAdjEClass, ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ);

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
		containmentSdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		sharingAdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		associationAdjEClass.getESuperTypes().add(this.getRelationshipAdj());
		generalizationAdjEClass.getESuperTypes().add(this.getRelationshipAdj());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryConcreteEClass, ModelFactoryConcrete.class, "ModelFactoryConcrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryConcrete_ListProjects(), this.getProjectAdj(), null, "listProjects", null, 0, -1, ModelFactoryConcrete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectAdjEClass, ProjectAdj.class, "ProjectAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectAdj_Path(), ecorePackage.getEString(), "path", null, 0, 1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectAdj_LstClassDiagramAdj(), this.getClassDiagramAdj(), null, "lstClassDiagramAdj", null, 0, -1, ProjectAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDiagramAdjEClass, ClassDiagramAdj.class, "ClassDiagramAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDiagramAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassDiagramAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramAdj_LstPackageConcreteAdj(), this.getPackageConcreteAdj(), null, "lstPackageConcreteAdj", null, 0, -1, ClassDiagramAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramAdj_LstRelationship(), this.getRelationshipAdj(), null, "lstRelationship", null, 0, -1, ClassDiagramAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramAdj_LstClassConcreteAdj(), this.getClassConcreteAdj(), null, "lstClassConcreteAdj", null, 0, -1, ClassDiagramAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageConcreteAdjEClass, PackageConcreteAdj.class, "PackageConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageConcreteAdj_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageConcreteAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipAdjEClass, RelationshipAdj.class, "RelationshipAdj", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipAdj_RoleTarget(), ecorePackage.getEString(), "roleTarget", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_RoleSource(), ecorePackage.getEString(), "roleSource", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_MultiplicityTargetClass(), ecorePackage.getEString(), "multiplicityTargetClass", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipAdj_MultiplicitySourceClass(), ecorePackage.getEString(), "multiplicitySourceClass", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipAdj_ClassSource(), this.getClassConcreteAdj(), null, "classSource", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipAdj_ClassTarget(), this.getClassConcreteAdj(), null, "classTarget", null, 0, 1, RelationshipAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentSdjEClass, ContainmentSdj.class, "ContainmentSdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharingAdjEClass, SharingAdj.class, "SharingAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationAdjEClass, AssociationAdj.class, "AssociationAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationAdjEClass, GeneralizationAdj.class, "GeneralizationAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classConcreteAdjEClass, ClassConcreteAdj.class, "ClassConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassConcreteAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassConcreteAdj_Path(), ecorePackage.getEString(), "path", null, 0, 1, ClassConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassConcreteAdj_LstAttributeConcreteAdj(), this.getAttributeConcreteAdj(), null, "lstAttributeConcreteAdj", null, 0, -1, ClassConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassConcreteAdj_LstMethodConcreteAdj(), this.getMethodConcreteAdj(), null, "lstMethodConcreteAdj", null, 0, -1, ClassConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodConcreteAdjEClass, MethodConcreteAdj.class, "MethodConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodConcreteAdj_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, MethodConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodConcreteAdj_Body(), ecorePackage.getEString(), "body", null, 0, 1, MethodConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodConcreteAdj_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, MethodConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodConcreteAdj_AccessModifier(), this.getAccessModifier(), "accessModifier", null, 0, 1, MethodConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConcreteAdj_LstParameterConcreteAdj(), this.getParameterConcreteAdj(), null, "lstParameterConcreteAdj", null, 0, -1, MethodConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConcreteAdjEClass, ParameterConcreteAdj.class, "ParameterConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterConcreteAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterConcreteAdj_AttributeTypeConcreteAdj(), this.getAttributeTypeConcreteAdj(), null, "AttributeTypeConcreteAdj", null, 0, 1, ParameterConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeConcreteAdjEClass, AttributeTypeConcreteAdj.class, "AttributeTypeConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeTypeConcreteAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeTypeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeTypeConcreteAdj_ParameterConcreteAdj(), this.getParameterConcreteAdj(), null, "ParameterConcreteAdj", null, 0, -1, AttributeTypeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeTypeConcreteAdj_LstAttributeConcreteAdj(), this.getAttributeConcreteAdj(), null, "lstAttributeConcreteAdj", null, 0, -1, AttributeTypeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeConcreteAdjEClass, AttributeConcreteAdj.class, "AttributeConcreteAdj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeConcreteAdj_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConcreteAdj_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConcreteAdj_AttributeTypeConcreteAdj(), this.getAttributeTypeConcreteAdj(), null, "attributeTypeConcreteAdj", null, 0, 1, AttributeConcreteAdj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PROTECTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (classDiagramAdjEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (packageConcreteAdjEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (classConcreteAdjEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "color", "255,255,128"
		   });	
		addAnnotation
		  (methodConcreteAdjEClass, 
		   source, 
		   new String[] {
			 "label", "methodName",
			 "color", "255,255,128"
		   });	
		addAnnotation
		  (attributeConcreteAdjEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "color", "255,255,128"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (containmentSdjEClass, 
		   source, 
		   new String[] {
			 "source", "classSource",
			 "target", "classTarget",
			 "source.decoration", "none",
			 "target.decoration", "filledrhomb",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,0",
			 "target.decorationSize", "16"
		   });	
		addAnnotation
		  (sharingAdjEClass, 
		   source, 
		   new String[] {
			 "source", "classSource",
			 "target", "classTarget",
			 "source.decoration", "none",
			 "target.decoration", "rhomb",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,0",
			 "target.decorationSize", "16"
		   });	
		addAnnotation
		  (associationAdjEClass, 
		   source, 
		   new String[] {
			 "source", "classSource",
			 "target", "classTarget",
			 "source.decoration", "none",
			 "target.decoration", "none",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (generalizationAdjEClass, 
		   source, 
		   new String[] {
			 "source", "classSource",
			 "target", "classTarget",
			 "source.decoration", "none",
			 "target.decoration", "arrow",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,0",
			 "target.decorationSize", "16"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getClassConcreteAdj_LstAttributeConcreteAdj(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getClassConcreteAdj_LstMethodConcreteAdj(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });
	}

} //ConcretemodelPackageImpl
