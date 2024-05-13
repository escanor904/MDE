/**
 */
package dslrelational.impl;

import dslrelational.Column;
import dslrelational.DslrelationalPackage;
import dslrelational.ForeignKey;
import dslrelational.PrimaryKey;
import dslrelational.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.PrimaryKeyImpl#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.impl.PrimaryKeyImpl#getLstForeignKey <em>Lst Foreign Key</em>}</li>
 *   <li>{@link dslrelational.impl.PrimaryKeyImpl#getTheColumn <em>The Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends EObjectImpl implements PrimaryKey {
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
	 * The cached value of the '{@link #getLstForeignKey() <em>Lst Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> lstForeignKey;

	/**
	 * The cached value of the '{@link #getTheColumn() <em>The Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheColumn()
	 * @generated
	 * @ordered
	 */
	protected Column theColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.PRIMARY_KEY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, oldOwnedByTable, newOwnedByTable);
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
				msgs = ((InternalEObject)ownedByTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, null, msgs);
			if (newOwnedByTable != null)
				msgs = ((InternalEObject)newOwnedByTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, null, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getLstForeignKey() {
		if (lstForeignKey == null) {
			lstForeignKey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY);
		}
		return lstForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getTheColumn() {
		return theColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheColumn(Column newTheColumn, NotificationChain msgs) {
		Column oldTheColumn = theColumn;
		theColumn = newTheColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, oldTheColumn, newTheColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheColumn(Column newTheColumn) {
		if (newTheColumn != theColumn) {
			NotificationChain msgs = null;
			if (theColumn != null)
				msgs = ((InternalEObject)theColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, null, msgs);
			if (newTheColumn != null)
				msgs = ((InternalEObject)newTheColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, null, msgs);
			msgs = basicSetTheColumn(newTheColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, newTheColumn, newTheColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				return ((InternalEList<?>)getLstForeignKey()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				return basicSetTheColumn(null, msgs);
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
			case DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				return getLstForeignKey();
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				return getTheColumn();
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
			case DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE:
				setOwnedByTable((Table)newValue);
				return;
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				getLstForeignKey().clear();
				getLstForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				setTheColumn((Column)newValue);
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
			case DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE:
				setOwnedByTable((Table)null);
				return;
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				getLstForeignKey().clear();
				return;
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				setTheColumn((Column)null);
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
			case DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE:
				return ownedByTable != null;
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				return lstForeignKey != null && !lstForeignKey.isEmpty();
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				return theColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
