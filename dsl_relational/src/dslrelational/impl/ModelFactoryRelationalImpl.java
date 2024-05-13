/**
 */
package dslrelational.impl;

import dslrelational.DataProject;
import dslrelational.DslrelationalPackage;
import dslrelational.ModelFactoryRelational;

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
 * An implementation of the model object '<em><b>Model Factory Relational</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.ModelFactoryRelationalImpl#getLstDataProject <em>Lst Data Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryRelationalImpl extends EObjectImpl implements ModelFactoryRelational {
	/**
	 * The cached value of the '{@link #getLstDataProject() <em>Lst Data Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDataProject()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProject> lstDataProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelationalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.MODEL_FACTORY_RELATIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProject> getLstDataProject() {
		if (lstDataProject == null) {
			lstDataProject = new EObjectContainmentEList<DataProject>(DataProject.class, this, DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT);
		}
		return lstDataProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT:
				return ((InternalEList<?>)getLstDataProject()).basicRemove(otherEnd, msgs);
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
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT:
				return getLstDataProject();
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
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT:
				getLstDataProject().clear();
				getLstDataProject().addAll((Collection<? extends DataProject>)newValue);
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
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT:
				getLstDataProject().clear();
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
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT:
				return lstDataProject != null && !lstDataProject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryRelationalImpl
