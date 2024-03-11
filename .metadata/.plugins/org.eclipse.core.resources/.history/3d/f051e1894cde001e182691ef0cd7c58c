/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.ModelFactoryAbstract;
import abstractmodel.ProjectAdj;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.ModelFactoryAbstractImpl#getListProjects <em>List Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryAbstractImpl extends EObjectImpl implements ModelFactoryAbstract {
	/**
	 * The cached value of the '{@link #getListProjects() <em>List Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectAdj> listProjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.MODEL_FACTORY_ABSTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectAdj> getListProjects() {
		if (listProjects == null) {
			listProjects = new EObjectContainmentEList<ProjectAdj>(ProjectAdj.class, this, AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS);
		}
		return listProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS:
				return ((InternalEList<?>)getListProjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS:
				return getListProjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS:
				getListProjects().clear();
				getListProjects().addAll((Collection<? extends ProjectAdj>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS:
				getListProjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractmodelPackage.MODEL_FACTORY_ABSTRACT__LIST_PROJECTS:
				return listProjects != null && !listProjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryAbstractImpl
