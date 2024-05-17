/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.ForeignKey;
import dslrelational.PrimaryKey;
import dslrelational.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.ForeignKeyImpl#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.impl.ForeignKeyImpl#getThePrimaryKey <em>The Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends EObjectImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getOwnedByTable() <em>Owned By Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByTable()
	 * @generated
	 * @ordered
	 */
	protected Table ownedByTable;

	/**
	 * The cached value of the '{@link #getThePrimaryKey() <em>The Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey thePrimaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwnedByTable() {
		if (ownedByTable != null && ownedByTable.eIsProxy()) {
			InternalEObject oldOwnedByTable = (InternalEObject)ownedByTable;
			ownedByTable = (Table)eResolveProxy(oldOwnedByTable);
			if (ownedByTable != oldOwnedByTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, oldOwnedByTable, ownedByTable));
			}
		}
		return ownedByTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetOwnedByTable() {
		return ownedByTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByTable(Table newOwnedByTable) {
		Table oldOwnedByTable = ownedByTable;
		ownedByTable = newOwnedByTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, oldOwnedByTable, ownedByTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getThePrimaryKey() {
		if (thePrimaryKey != null && thePrimaryKey.eIsProxy()) {
			InternalEObject oldThePrimaryKey = (InternalEObject)thePrimaryKey;
			thePrimaryKey = (PrimaryKey)eResolveProxy(oldThePrimaryKey);
			if (thePrimaryKey != oldThePrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, oldThePrimaryKey, thePrimaryKey));
			}
		}
		return thePrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetThePrimaryKey() {
		return thePrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePrimaryKey(PrimaryKey newThePrimaryKey) {
		PrimaryKey oldThePrimaryKey = thePrimaryKey;
		thePrimaryKey = newThePrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, oldThePrimaryKey, thePrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				if (resolve) return getOwnedByTable();
				return basicGetOwnedByTable();
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				if (resolve) return getThePrimaryKey();
				return basicGetThePrimaryKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((Table)newValue);
				return;
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				setThePrimaryKey((PrimaryKey)newValue);
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
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((Table)null);
				return;
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				setThePrimaryKey((PrimaryKey)null);
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
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				return ownedByTable != null;
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				return thePrimaryKey != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
