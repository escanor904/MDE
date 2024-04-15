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

import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adj List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.AdjListViewImpl#getLstAdjListViewColumn <em>Lst Adj List View Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdjListViewImpl extends AdjWidgetImpl implements AdjListView {
	/**
	 * The cached value of the '{@link #getLstAdjListViewColumn() <em>Lst Adj List View Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAdjListViewColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<AdjListViewColumn> lstAdjListViewColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.ADJ_LIST_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjListViewColumn> getLstAdjListViewColumn() {
		if (lstAdjListViewColumn == null) {
			lstAdjListViewColumn = new EObjectContainmentEList<AdjListViewColumn>(AdjListViewColumn.class, this, UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN);
		}
		return lstAdjListViewColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN:
				return ((InternalEList<?>)getLstAdjListViewColumn()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN:
				return getLstAdjListViewColumn();
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
			case UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN:
				getLstAdjListViewColumn().clear();
				getLstAdjListViewColumn().addAll((Collection<? extends AdjListViewColumn>)newValue);
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
			case UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN:
				getLstAdjListViewColumn().clear();
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
			case UidiagramPackage.ADJ_LIST_VIEW__LST_ADJ_LIST_VIEW_COLUMN:
				return lstAdjListViewColumn != null && !lstAdjListViewColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdjListViewImpl
