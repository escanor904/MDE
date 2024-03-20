/**
 */
package abstractmodel.util;

import abstractmodel.*;

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
 * @see abstractmodel.AbstractmodelPackage
 * @generated
 */
public class AbstractmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractmodelPackage.eINSTANCE;
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
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT: {
				ModelFactoryAbstract modelFactoryAbstract = (ModelFactoryAbstract)theEObject;
				T result = caseModelFactoryAbstract(modelFactoryAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.PROJECT_ADJ: {
				ProjectAdj projectAdj = (ProjectAdj)theEObject;
				T result = caseProjectAdj(projectAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ: {
				AttributeTypeFactoryAdj attributeTypeFactoryAdj = (AttributeTypeFactoryAdj)theEObject;
				T result = caseAttributeTypeFactoryAdj(attributeTypeFactoryAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ: {
				AttributeTypeAdj attributeTypeAdj = (AttributeTypeAdj)theEObject;
				T result = caseAttributeTypeAdj(attributeTypeAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.PACKAGE_ADJ: {
				PackageAdj packageAdj = (PackageAdj)theEObject;
				T result = casePackageAdj(packageAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.CLASS_ADJ: {
				ClassAdj classAdj = (ClassAdj)theEObject;
				T result = caseClassAdj(classAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.RELATIONSHIP_ADJ: {
				RelationshipAdj relationshipAdj = (RelationshipAdj)theEObject;
				T result = caseRelationshipAdj(relationshipAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.CONTAINMENT_ADJ: {
				ContainmentAdj containmentAdj = (ContainmentAdj)theEObject;
				T result = caseContainmentAdj(containmentAdj);
				if (result == null) result = caseRelationshipAdj(containmentAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.SHARING_ADJ: {
				SharingAdj sharingAdj = (SharingAdj)theEObject;
				T result = caseSharingAdj(sharingAdj);
				if (result == null) result = caseRelationshipAdj(sharingAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.ASSOCIATION_ADJ: {
				AssociationAdj associationAdj = (AssociationAdj)theEObject;
				T result = caseAssociationAdj(associationAdj);
				if (result == null) result = caseRelationshipAdj(associationAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.GENERALIZATION_ADJ: {
				GeneralizationAdj generalizationAdj = (GeneralizationAdj)theEObject;
				T result = caseGeneralizationAdj(generalizationAdj);
				if (result == null) result = caseRelationshipAdj(generalizationAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.ATTRIBUTE_ADJ: {
				AttributeAdj attributeAdj = (AttributeAdj)theEObject;
				T result = caseAttributeAdj(attributeAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.METHOD_ADJ: {
				MethodAdj methodAdj = (MethodAdj)theEObject;
				T result = caseMethodAdj(methodAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractmodelPackage.PARAMETER_ADJ: {
				ParameterAdj parameterAdj = (ParameterAdj)theEObject;
				T result = caseParameterAdj(parameterAdj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryAbstract(ModelFactoryAbstract object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type Factory Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type Factory Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTypeFactoryAdj(AttributeTypeFactoryAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTypeAdj(AttributeTypeAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAdj(PackageAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAdj(ClassAdj object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Containment Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentAdj(ContainmentAdj object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAdj(AttributeAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodAdj(MethodAdj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Adj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Adj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterAdj(ParameterAdj object) {
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

} //AbstractmodelSwitch
