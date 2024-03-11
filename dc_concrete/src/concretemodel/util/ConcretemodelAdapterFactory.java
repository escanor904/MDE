/**
 */
package concretemodel.util;

import concretemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see concretemodel.ConcretemodelPackage
 * @generated
 */
public class ConcretemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConcretemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcretemodelSwitch<Adapter> modelSwitch =
		new ConcretemodelSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryConcrete(ModelFactoryConcrete object) {
				return createModelFactoryConcreteAdapter();
			}
			@Override
			public Adapter caseProjectAdj(ProjectAdj object) {
				return createProjectAdjAdapter();
			}
			@Override
			public Adapter caseClassDiagramAdj(ClassDiagramAdj object) {
				return createClassDiagramAdjAdapter();
			}
			@Override
			public Adapter casePackageConcreteAdj(PackageConcreteAdj object) {
				return createPackageConcreteAdjAdapter();
			}
			@Override
			public Adapter caseRelationshipAdj(RelationshipAdj object) {
				return createRelationshipAdjAdapter();
			}
			@Override
			public Adapter caseContainmentSdj(ContainmentSdj object) {
				return createContainmentSdjAdapter();
			}
			@Override
			public Adapter caseSharingAdj(SharingAdj object) {
				return createSharingAdjAdapter();
			}
			@Override
			public Adapter caseAssociationAdj(AssociationAdj object) {
				return createAssociationAdjAdapter();
			}
			@Override
			public Adapter caseGeneralizationAdj(GeneralizationAdj object) {
				return createGeneralizationAdjAdapter();
			}
			@Override
			public Adapter caseClassConcreteAdj(ClassConcreteAdj object) {
				return createClassConcreteAdjAdapter();
			}
			@Override
			public Adapter caseMethodConcreteAdj(MethodConcreteAdj object) {
				return createMethodConcreteAdjAdapter();
			}
			@Override
			public Adapter caseParameterConcreteAdj(ParameterConcreteAdj object) {
				return createParameterConcreteAdjAdapter();
			}
			@Override
			public Adapter caseAttributeTypeConcreteAdj(AttributeTypeConcreteAdj object) {
				return createAttributeTypeConcreteAdjAdapter();
			}
			@Override
			public Adapter caseAttributeConcreteAdj(AttributeConcreteAdj object) {
				return createAttributeConcreteAdjAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ModelFactoryConcrete <em>Model Factory Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ModelFactoryConcrete
	 * @generated
	 */
	public Adapter createModelFactoryConcreteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ProjectAdj <em>Project Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ProjectAdj
	 * @generated
	 */
	public Adapter createProjectAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ClassDiagramAdj <em>Class Diagram Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ClassDiagramAdj
	 * @generated
	 */
	public Adapter createClassDiagramAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.PackageConcreteAdj <em>Package Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.PackageConcreteAdj
	 * @generated
	 */
	public Adapter createPackageConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.RelationshipAdj <em>Relationship Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.RelationshipAdj
	 * @generated
	 */
	public Adapter createRelationshipAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ContainmentSdj <em>Containment Sdj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ContainmentSdj
	 * @generated
	 */
	public Adapter createContainmentSdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.SharingAdj <em>Sharing Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.SharingAdj
	 * @generated
	 */
	public Adapter createSharingAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.AssociationAdj <em>Association Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.AssociationAdj
	 * @generated
	 */
	public Adapter createAssociationAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.GeneralizationAdj <em>Generalization Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.GeneralizationAdj
	 * @generated
	 */
	public Adapter createGeneralizationAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ClassConcreteAdj <em>Class Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ClassConcreteAdj
	 * @generated
	 */
	public Adapter createClassConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.MethodConcreteAdj <em>Method Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.MethodConcreteAdj
	 * @generated
	 */
	public Adapter createMethodConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.ParameterConcreteAdj <em>Parameter Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.ParameterConcreteAdj
	 * @generated
	 */
	public Adapter createParameterConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.AttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.AttributeTypeConcreteAdj
	 * @generated
	 */
	public Adapter createAttributeTypeConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concretemodel.AttributeConcreteAdj <em>Attribute Concrete Adj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concretemodel.AttributeConcreteAdj
	 * @generated
	 */
	public Adapter createAttributeConcreteAdjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConcretemodelAdapterFactory
