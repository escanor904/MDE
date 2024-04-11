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

import uidiagram.AdjDataGridView;
import uidiagram.AdjDataGridViewTextBoxColumn;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adj Data Grid View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.AdjDataGridViewImpl#getLstAdjDataGridViewTextBoxColumn <em>Lst Adj Data Grid View Text Box Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdjDataGridViewImpl extends AdjWidgetImpl implements AdjDataGridView {
	/**
	 * The cached value of the '{@link #getLstAdjDataGridViewTextBoxColumn() <em>Lst Adj Data Grid View Text Box Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAdjDataGridViewTextBoxColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<AdjDataGridViewTextBoxColumn> lstAdjDataGridViewTextBoxColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjDataGridViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.ADJ_DATA_GRID_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjDataGridViewTextBoxColumn> getLstAdjDataGridViewTextBoxColumn() {
		if (lstAdjDataGridViewTextBoxColumn == null) {
			lstAdjDataGridViewTextBoxColumn = new EObjectContainmentEList<AdjDataGridViewTextBoxColumn>(AdjDataGridViewTextBoxColumn.class, this, UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN);
		}
		return lstAdjDataGridViewTextBoxColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN:
				return ((InternalEList<?>)getLstAdjDataGridViewTextBoxColumn()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN:
				return getLstAdjDataGridViewTextBoxColumn();
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
			case UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN:
				getLstAdjDataGridViewTextBoxColumn().clear();
				getLstAdjDataGridViewTextBoxColumn().addAll((Collection<? extends AdjDataGridViewTextBoxColumn>)newValue);
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
			case UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN:
				getLstAdjDataGridViewTextBoxColumn().clear();
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
			case UidiagramPackage.ADJ_DATA_GRID_VIEW__LST_ADJ_DATA_GRID_VIEW_TEXT_BOX_COLUMN:
				return lstAdjDataGridViewTextBoxColumn != null && !lstAdjDataGridViewTextBoxColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdjDataGridViewImpl
