/**
 */
package concretemodel.impl;

import concretemodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretemodelFactoryImpl extends EFactoryImpl implements ConcretemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretemodelFactory init() {
		try {
			ConcretemodelFactory theConcretemodelFactory = (ConcretemodelFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretemodelPackage.eNS_URI);
			if (theConcretemodelFactory != null) {
				return theConcretemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcretemodelPackage.MODEL_FACTORY_CONCRETE: return createModelFactoryConcrete();
			case ConcretemodelPackage.PROJECT_ADJ: return createProjectAdj();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ: return createClassDiagramAdj();
			case ConcretemodelPackage.PACKAGE_CONCRETE_ADJ: return createPackageConcreteAdj();
			case ConcretemodelPackage.CONTAINMENT_SDJ: return createContainmentSdj();
			case ConcretemodelPackage.SHARING_ADJ: return createSharingAdj();
			case ConcretemodelPackage.ASSOCIATION_ADJ: return createAssociationAdj();
			case ConcretemodelPackage.GENERALIZATION_ADJ: return createGeneralizationAdj();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ: return createClassConcreteAdj();
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ: return createMethodConcreteAdj();
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ: return createParameterConcreteAdj();
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ: return createAttributeTypeConcreteAdj();
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ: return createAttributeConcreteAdj();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConcretemodelPackage.ACCESS_MODIFIER:
				return createAccessModifierFromString(eDataType, initialValue);
			case ConcretemodelPackage.ACCESS_MODIFIER_CLASS:
				return createAccessModifierClassFromString(eDataType, initialValue);
			case ConcretemodelPackage.TYPE_CLASS:
				return createTypeClassFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConcretemodelPackage.ACCESS_MODIFIER:
				return convertAccessModifierToString(eDataType, instanceValue);
			case ConcretemodelPackage.ACCESS_MODIFIER_CLASS:
				return convertAccessModifierClassToString(eDataType, instanceValue);
			case ConcretemodelPackage.TYPE_CLASS:
				return convertTypeClassToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryConcrete createModelFactoryConcrete() {
		ModelFactoryConcreteImpl modelFactoryConcrete = new ModelFactoryConcreteImpl();
		return modelFactoryConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectAdj createProjectAdj() {
		ProjectAdjImpl projectAdj = new ProjectAdjImpl();
		return projectAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramAdj createClassDiagramAdj() {
		ClassDiagramAdjImpl classDiagramAdj = new ClassDiagramAdjImpl();
		return classDiagramAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageConcreteAdj createPackageConcreteAdj() {
		PackageConcreteAdjImpl packageConcreteAdj = new PackageConcreteAdjImpl();
		return packageConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentSdj createContainmentSdj() {
		ContainmentSdjImpl containmentSdj = new ContainmentSdjImpl();
		return containmentSdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingAdj createSharingAdj() {
		SharingAdjImpl sharingAdj = new SharingAdjImpl();
		return sharingAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationAdj createAssociationAdj() {
		AssociationAdjImpl associationAdj = new AssociationAdjImpl();
		return associationAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationAdj createGeneralizationAdj() {
		GeneralizationAdjImpl generalizationAdj = new GeneralizationAdjImpl();
		return generalizationAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConcreteAdj createClassConcreteAdj() {
		ClassConcreteAdjImpl classConcreteAdj = new ClassConcreteAdjImpl();
		return classConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConcreteAdj createMethodConcreteAdj() {
		MethodConcreteAdjImpl methodConcreteAdj = new MethodConcreteAdjImpl();
		return methodConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConcreteAdj createParameterConcreteAdj() {
		ParameterConcreteAdjImpl parameterConcreteAdj = new ParameterConcreteAdjImpl();
		return parameterConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeConcreteAdj createAttributeTypeConcreteAdj() {
		AttributeTypeConcreteAdjImpl attributeTypeConcreteAdj = new AttributeTypeConcreteAdjImpl();
		return attributeTypeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConcreteAdj createAttributeConcreteAdj() {
		AttributeConcreteAdjImpl attributeConcreteAdj = new AttributeConcreteAdjImpl();
		return attributeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifierFromString(EDataType eDataType, String initialValue) {
		AccessModifier result = AccessModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifierClass createAccessModifierClassFromString(EDataType eDataType, String initialValue) {
		AccessModifierClass result = AccessModifierClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeClass createTypeClassFromString(EDataType eDataType, String initialValue) {
		TypeClass result = TypeClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretemodelPackage getConcretemodelPackage() {
		return (ConcretemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretemodelPackage getPackage() {
		return ConcretemodelPackage.eINSTANCE;
	}

} //ConcretemodelFactoryImpl
