/**
 */
package abstractmodel.impl;

import abstractmodel.*;

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
public class AbstractmodelFactoryImpl extends EFactoryImpl implements AbstractmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractmodelFactory init() {
		try {
			AbstractmodelFactory theAbstractmodelFactory = (AbstractmodelFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractmodelPackage.eNS_URI);
			if (theAbstractmodelFactory != null) {
				return theAbstractmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractmodelFactoryImpl() {
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
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT: return createModelFactoryAbstract();
			case AbstractmodelPackage.PROJECT_ADJ: return createProjectAdj();
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ: return createClassTypeFactoryAdj();
			case AbstractmodelPackage.CLASS_TYPE_ADJ: return createClassTypeAdj();
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ: return createAttributeTypeFactoryAdj();
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ: return createAttributeTypeAdj();
			case AbstractmodelPackage.PACKAGE_ADJ: return createPackageAdj();
			case AbstractmodelPackage.CLASS_ADJ: return createClassAdj();
			case AbstractmodelPackage.CONTAINMENT_ADJ: return createContainmentAdj();
			case AbstractmodelPackage.SHARING_ADJ: return createSharingAdj();
			case AbstractmodelPackage.ASSOCIATION_ADJ: return createAssociationAdj();
			case AbstractmodelPackage.GENERALIZATION_ADJ: return createGeneralizationAdj();
			case AbstractmodelPackage.ATTRIBUTE_ADJ: return createAttributeAdj();
			case AbstractmodelPackage.METHOD_ADJ: return createMethodAdj();
			case AbstractmodelPackage.PARAMETER_ADJ: return createParameterAdj();
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
			case AbstractmodelPackage.ACCESS_MODIFIER:
				return createAccessModifierFromString(eDataType, initialValue);
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
			case AbstractmodelPackage.ACCESS_MODIFIER:
				return convertAccessModifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryAbstract createModelFactoryAbstract() {
		ModelFactoryAbstractImpl modelFactoryAbstract = new ModelFactoryAbstractImpl();
		return modelFactoryAbstract;
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
	public ClassTypeFactoryAdj createClassTypeFactoryAdj() {
		ClassTypeFactoryAdjImpl classTypeFactoryAdj = new ClassTypeFactoryAdjImpl();
		return classTypeFactoryAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTypeAdj createClassTypeAdj() {
		ClassTypeAdjImpl classTypeAdj = new ClassTypeAdjImpl();
		return classTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeFactoryAdj createAttributeTypeFactoryAdj() {
		AttributeTypeFactoryAdjImpl attributeTypeFactoryAdj = new AttributeTypeFactoryAdjImpl();
		return attributeTypeFactoryAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeAdj createAttributeTypeAdj() {
		AttributeTypeAdjImpl attributeTypeAdj = new AttributeTypeAdjImpl();
		return attributeTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAdj createPackageAdj() {
		PackageAdjImpl packageAdj = new PackageAdjImpl();
		return packageAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAdj createClassAdj() {
		ClassAdjImpl classAdj = new ClassAdjImpl();
		return classAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentAdj createContainmentAdj() {
		ContainmentAdjImpl containmentAdj = new ContainmentAdjImpl();
		return containmentAdj;
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
	public AttributeAdj createAttributeAdj() {
		AttributeAdjImpl attributeAdj = new AttributeAdjImpl();
		return attributeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodAdj createMethodAdj() {
		MethodAdjImpl methodAdj = new MethodAdjImpl();
		return methodAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAdj createParameterAdj() {
		ParameterAdjImpl parameterAdj = new ParameterAdjImpl();
		return parameterAdj;
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
	public AbstractmodelPackage getAbstractmodelPackage() {
		return (AbstractmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractmodelPackage getPackage() {
		return AbstractmodelPackage.eINSTANCE;
	}

} //AbstractmodelFactoryImpl
