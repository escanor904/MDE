/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.AdjPanel;
import uidiagram.AdjWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adj Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.AdjPanelImpl#getLstAdjWidget <em>Lst Adj Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdjPanelImpl extends AdjWidgetImpl implements AdjPanel {
	/**
	 * The cached value of the '{@link #getLstAdjWidget() <em>Lst Adj Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAdjWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<AdjWidget> lstAdjWidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.ADJ_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjWidget> getLstAdjWidget() {
		if (lstAdjWidget == null) {
			lstAdjWidget = new EObjectContainmentEList<AdjWidget>(AdjWidget.class, this, UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET);
		}
		return lstAdjWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
				return ((InternalEList<?>)getLstAdjWidget()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
				return getLstAdjWidget();
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
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
				getLstAdjWidget().clear();
				getLstAdjWidget().addAll((Collection<? extends AdjWidget>)newValue);
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
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
				getLstAdjWidget().clear();
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
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
				return lstAdjWidget != null && !lstAdjWidget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdjPanelImpl
