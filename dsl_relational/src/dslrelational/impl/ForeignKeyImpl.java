/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.ForeignKey;
import dslrelational.PrimaryKey;
import dslrelational.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getOwnedByTable() <em>Owned By Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByTable()
	 * @generated
	 * @ordered
	 */
	protected Table ownedByTable;

	/**
	 * The cached value of the '{@link #getThePrimaryKey() <em>The Primary Key</em>}' containment reference.
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
		return ownedByTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(Table newOwnedByTable, NotificationChain msgs) {
		Table oldOwnedByTable = ownedByTable;
		ownedByTable = newOwnedByTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, oldOwnedByTable, newOwnedByTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByTable(Table newOwnedByTable) {
		if (newOwnedByTable != ownedByTable) {
			NotificationChain msgs = null;
			if (ownedByTable != null)
				msgs = ((InternalEObject)ownedByTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, null, msgs);
			if (newOwnedByTable != null)
				msgs = ((InternalEObject)newOwnedByTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, null, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getThePrimaryKey() {
		return thePrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThePrimaryKey(PrimaryKey newThePrimaryKey, NotificationChain msgs) {
		PrimaryKey oldThePrimaryKey = thePrimaryKey;
		thePrimaryKey = newThePrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, oldThePrimaryKey, newThePrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePrimaryKey(PrimaryKey newThePrimaryKey) {
		if (newThePrimaryKey != thePrimaryKey) {
			NotificationChain msgs = null;
			if (thePrimaryKey != null)
				msgs = ((InternalEObject)thePrimaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, null, msgs);
			if (newThePrimaryKey != null)
				msgs = ((InternalEObject)newThePrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, null, msgs);
			msgs = basicSetThePrimaryKey(newThePrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY, newThePrimaryKey, newThePrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				return basicSetThePrimaryKey(null, msgs);
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
			case DslrelationalPackage.FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case DslrelationalPackage.FOREIGN_KEY__THE_PRIMARY_KEY:
				return getThePrimaryKey();
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
