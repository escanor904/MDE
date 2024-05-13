/**
 */
package dslrelational.impl;

import dslrelational.Column;
import dslrelational.DslrelationalPackage;
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
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.ColumnImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link dslrelational.impl.ColumnImpl#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link dslrelational.impl.ColumnImpl#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link dslrelational.impl.ColumnImpl#getLstPrimaryKey <em>Lst Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected String columnType = COLUMN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNullable = IS_NULLABLE_EDEFAULT;

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
	 * The cached value of the '{@link #getLstPrimaryKey() <em>Lst Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> lstPrimaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnType() {
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnType(String newColumnType) {
		String oldColumnType = columnType;
		columnType = newColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.COLUMN__COLUMN_TYPE, oldColumnType, columnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullable(Boolean newIsNullable) {
		Boolean oldIsNullable = isNullable;
		isNullable = newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.COLUMN__IS_NULLABLE, oldIsNullable, isNullable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.COLUMN__OWNED_BY_TABLE, oldOwnedByTable, newOwnedByTable);
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
				msgs = ((InternalEObject)ownedByTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.COLUMN__OWNED_BY_TABLE, null, msgs);
			if (newOwnedByTable != null)
				msgs = ((InternalEObject)newOwnedByTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.COLUMN__OWNED_BY_TABLE, null, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.COLUMN__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getLstPrimaryKey() {
		if (lstPrimaryKey == null) {
			lstPrimaryKey = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, DslrelationalPackage.COLUMN__LST_PRIMARY_KEY);
		}
		return lstPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.COLUMN__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case DslrelationalPackage.COLUMN__LST_PRIMARY_KEY:
				return ((InternalEList<?>)getLstPrimaryKey()).basicRemove(otherEnd, msgs);
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
			case DslrelationalPackage.COLUMN__NAME:
				return getName();
			case DslrelationalPackage.COLUMN__COLUMN_TYPE:
				return getColumnType();
			case DslrelationalPackage.COLUMN__IS_NULLABLE:
				return getIsNullable();
			case DslrelationalPackage.COLUMN__OWNED_BY_TABLE:
				return getOwnedByTable();
			case DslrelationalPackage.COLUMN__LST_PRIMARY_KEY:
				return getLstPrimaryKey();
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
			case DslrelationalPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.COLUMN__COLUMN_TYPE:
				setColumnType((String)newValue);
				return;
			case DslrelationalPackage.COLUMN__IS_NULLABLE:
				setIsNullable((Boolean)newValue);
				return;
			case DslrelationalPackage.COLUMN__OWNED_BY_TABLE:
				setOwnedByTable((Table)newValue);
				return;
			case DslrelationalPackage.COLUMN__LST_PRIMARY_KEY:
				getLstPrimaryKey().clear();
				getLstPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
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
			case DslrelationalPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.COLUMN__COLUMN_TYPE:
				setColumnType(COLUMN_TYPE_EDEFAULT);
				return;
			case DslrelationalPackage.COLUMN__IS_NULLABLE:
				setIsNullable(IS_NULLABLE_EDEFAULT);
				return;
			case DslrelationalPackage.COLUMN__OWNED_BY_TABLE:
				setOwnedByTable((Table)null);
				return;
			case DslrelationalPackage.COLUMN__LST_PRIMARY_KEY:
				getLstPrimaryKey().clear();
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
			case DslrelationalPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.COLUMN__COLUMN_TYPE:
				return COLUMN_TYPE_EDEFAULT == null ? columnType != null : !COLUMN_TYPE_EDEFAULT.equals(columnType);
			case DslrelationalPackage.COLUMN__IS_NULLABLE:
				return IS_NULLABLE_EDEFAULT == null ? isNullable != null : !IS_NULLABLE_EDEFAULT.equals(isNullable);
			case DslrelationalPackage.COLUMN__OWNED_BY_TABLE:
				return ownedByTable != null;
			case DslrelationalPackage.COLUMN__LST_PRIMARY_KEY:
				return lstPrimaryKey != null && !lstPrimaryKey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", columnType: ");
		result.append(columnType);
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
