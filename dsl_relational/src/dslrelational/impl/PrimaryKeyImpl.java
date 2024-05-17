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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getOwnedByTable() <em>Owned By Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByTable()
	 * @generated
	 * @ordered
	 */
	protected Table ownedByTable;

	/**
	 * The cached value of the '{@link #getLstForeignKey() <em>Lst Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> lstForeignKey;

	/**
	 * The cached value of the '{@link #getTheColumn() <em>The Column</em>}' reference.
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
		if (ownedByTable != null && ownedByTable.eIsProxy()) {
			InternalEObject oldOwnedByTable = (InternalEObject)ownedByTable;
			ownedByTable = (Table)eResolveProxy(oldOwnedByTable);
			if (ownedByTable != oldOwnedByTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, oldOwnedByTable, ownedByTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__OWNED_BY_TABLE, oldOwnedByTable, ownedByTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getLstForeignKey() {
		if (lstForeignKey == null) {
			lstForeignKey = new EObjectResolvingEList<ForeignKey>(ForeignKey.class, this, DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY);
		}
		return lstForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getTheColumn() {
		if (theColumn != null && theColumn.eIsProxy()) {
			InternalEObject oldTheColumn = (InternalEObject)theColumn;
			theColumn = (Column)eResolveProxy(oldTheColumn);
			if (theColumn != oldTheColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, oldTheColumn, theColumn));
			}
		}
		return theColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetTheColumn() {
		return theColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheColumn(Column newTheColumn) {
		Column oldTheColumn = theColumn;
		theColumn = newTheColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PRIMARY_KEY__THE_COLUMN, oldTheColumn, theColumn));
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
				if (resolve) return getOwnedByTable();
				return basicGetOwnedByTable();
			case DslrelationalPackage.PRIMARY_KEY__LST_FOREIGN_KEY:
				return getLstForeignKey();
			case DslrelationalPackage.PRIMARY_KEY__THE_COLUMN:
				if (resolve) return getTheColumn();
				return basicGetTheColumn();
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
