/**
 */
package concretemodel.util;

import concretemodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see concretemodel.ConcretemodelPackage
 * @generated
 */
public class ConcretemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcretemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConcretemodelPackage.MODEL_FACTORY_CONCRETE: {
				ModelFactoryConcrete modelFactoryConcrete = (ModelFactoryConcrete)theEObject;
				T result = caseModelFactoryConcrete(modelFactoryConcrete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.PROJECT_ADJ: {
				ProjectAdj projectAdj = (ProjectAdj)theEObject;
				T result = caseProjectAdj(projectAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ: {
				ClassDiagramAdj classDiagramAdj = (ClassDiagramAdj)theEObject;
				T result = caseClassDiagramAdj(classDiagramAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.PACKAGE_CONCRETE_ADJ: {
				PackageConcreteAdj packageConcreteAdj = (PackageConcreteAdj)theEObject;
				T result = casePackageConcreteAdj(packageConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.RELATIONSHIP_ADJ: {
				RelationshipAdj relationshipAdj = (RelationshipAdj)theEObject;
				T result = caseRelationshipAdj(relationshipAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.CONTAINMENT_SDJ: {
				ContainmentSdj containmentSdj = (ContainmentSdj)theEObject;
				T result = caseContainmentSdj(containmentSdj);
				if (result == null) result = caseRelationshipAdj(containmentSdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.SHARING_ADJ: {
				SharingAdj sharingAdj = (SharingAdj)theEObject;
				T result = caseSharingAdj(sharingAdj);
				if (result == null) result = caseRelationshipAdj(sharingAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.ASSOCIATION_ADJ: {
				AssociationAdj associationAdj = (AssociationAdj)theEObject;
				T result = caseAssociationAdj(associationAdj);
				if (result == null) result = caseRelationshipAdj(associationAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.GENERALIZATION_ADJ: {
				GeneralizationAdj generalizationAdj = (GeneralizationAdj)theEObject;
				T result = caseGeneralizationAdj(generalizationAdj);
				if (result == null) result = caseRelationshipAdj(generalizationAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ: {
				ClassConcreteAdj classConcreteAdj = (ClassConcreteAdj)theEObject;
				T result = caseClassConcreteAdj(classConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ: {
				MethodConcreteAdj methodConcreteAdj = (MethodConcreteAdj)theEObject;
				T result = caseMethodConcreteAdj(methodConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ: {
				ParameterConcreteAdj parameterConcreteAdj = (ParameterConcreteAdj)theEObject;
				T result = caseParameterConcreteAdj(parameterConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ: {
				AttributeTypeConcreteAdj attributeTypeConcreteAdj = (AttributeTypeConcreteAdj)theEObject;
				T result = caseAttributeTypeConcreteAdj(attributeTypeConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ: {
				AttributeConcreteAdj attributeConcreteAdj = (AttributeConcreteAdj)theEObject;
				T result = caseAttributeConcreteAdj(attributeConcreteAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Concrete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryConcrete(ModelFactoryConcrete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectAdj(ProjectAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagramAdj(ClassDiagramAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageConcreteAdj(PackageConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipAdj(RelationshipAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Sdj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Sdj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentSdj(ContainmentSdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sharing Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sharing Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharingAdj(SharingAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationAdj(AssociationAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationAdj(GeneralizationAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassConcreteAdj(ClassConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodConcreteAdj(MethodConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConcreteAdj(ParameterConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTypeConcreteAdj(AttributeTypeConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Concrete Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Concrete Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConcreteAdj(AttributeConcreteAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConcretemodelSwitch
