/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.ModelFactoryUI;
import uidiagram.ProjectUI;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.ModelFactoryUIImpl#getLstProjectUI <em>Lst Project UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryUIImpl extends EObjectImpl implements ModelFactoryUI {
	/**
	 * The cached value of the '{@link #getLstProjectUI() <em>Lst Project UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstProjectUI()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectUI> lstProjectUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.MODEL_FACTORY_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectUI> getLstProjectUI() {
		if (lstProjectUI == null) {
			lstProjectUI = new EObjectContainmentEList<ProjectUI>(ProjectUI.class, this, UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI);
		}
		return lstProjectUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI:
				return ((InternalEList<?>)getLstProjectUI()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI:
				return getLstProjectUI();
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
			case UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI:
				getLstProjectUI().clear();
				getLstProjectUI().addAll((Collection<? extends ProjectUI>)newValue);
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
			case UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI:
				getLstProjectUI().clear();
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
			case UidiagramPackage.MODEL_FACTORY_UI__LST_PROJECT_UI:
				return lstProjectUI != null && !lstProjectUI.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryUIImpl
