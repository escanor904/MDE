/**
 */
package dslrelational.impl;

import dslrelational.Column;
import dslrelational.DslrelationalPackage;
import dslrelational.ForeignKey;
import dslrelational.PrimaryKey;
import dslrelational.Schema;
import dslrelational.Table;
import dslrelational.Trigger;

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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.TableImpl#getOwnedBySchema <em>Owned By Schema</em>}</li>
 *   <li>{@link dslrelational.impl.TableImpl#getLstTrigger <em>Lst Trigger</em>}</li>
 *   <li>{@link dslrelational.impl.TableImpl#getLstColumn <em>Lst Column</em>}</li>
 *   <li>{@link dslrelational.impl.TableImpl#getLstPrimaryKey <em>Lst Primary Key</em>}</li>
 *   <li>{@link dslrelational.impl.TableImpl#getLstForeignKey <em>Lst Foreign Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
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
	 * The cached value of the '{@link #getOwnedBySchema() <em>Owned By Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBySchema()
	 * @generated
	 * @ordered
	 */
	protected Schema ownedBySchema;

	/**
	 * The cached value of the '{@link #getLstTrigger() <em>Lst Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> lstTrigger;

	/**
	 * The cached value of the '{@link #getLstColumn() <em>Lst Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> lstColumn;

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
	 * The cached value of the '{@link #getLstForeignKey() <em>Lst Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> lstForeignKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getOwnedBySchema() {
		return ownedBySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBySchema(Schema newOwnedBySchema, NotificationChain msgs) {
		Schema oldOwnedBySchema = ownedBySchema;
		ownedBySchema = newOwnedBySchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TABLE__OWNED_BY_SCHEMA, oldOwnedBySchema, newOwnedBySchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBySchema(Schema newOwnedBySchema) {
		if (newOwnedBySchema != ownedBySchema) {
			NotificationChain msgs = null;
			if (ownedBySchema != null)
				msgs = ((InternalEObject)ownedBySchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TABLE__OWNED_BY_SCHEMA, null, msgs);
			if (newOwnedBySchema != null)
				msgs = ((InternalEObject)newOwnedBySchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TABLE__OWNED_BY_SCHEMA, null, msgs);
			msgs = basicSetOwnedBySchema(newOwnedBySchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TABLE__OWNED_BY_SCHEMA, newOwnedBySchema, newOwnedBySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getLstTrigger() {
		if (lstTrigger == null) {
			lstTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, DslrelationalPackage.TABLE__LST_TRIGGER);
		}
		return lstTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getLstColumn() {
		if (lstColumn == null) {
			lstColumn = new EObjectContainmentEList<Column>(Column.class, this, DslrelationalPackage.TABLE__LST_COLUMN);
		}
		return lstColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getLstPrimaryKey() {
		if (lstPrimaryKey == null) {
			lstPrimaryKey = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, DslrelationalPackage.TABLE__LST_PRIMARY_KEY);
		}
		return lstPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getLstForeignKey() {
		if (lstForeignKey == null) {
			lstForeignKey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, DslrelationalPackage.TABLE__LST_FOREIGN_KEY);
		}
		return lstForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.TABLE__OWNED_BY_SCHEMA:
				return basicSetOwnedBySchema(null, msgs);
			case DslrelationalPackage.TABLE__LST_TRIGGER:
				return ((InternalEList<?>)getLstTrigger()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.TABLE__LST_COLUMN:
				return ((InternalEList<?>)getLstColumn()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.TABLE__LST_PRIMARY_KEY:
				return ((InternalEList<?>)getLstPrimaryKey()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.TABLE__LST_FOREIGN_KEY:
				return ((InternalEList<?>)getLstForeignKey()).basicRemove(otherEnd, msgs);
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
			case DslrelationalPackage.TABLE__NAME:
				return getName();
			case DslrelationalPackage.TABLE__OWNED_BY_SCHEMA:
				return getOwnedBySchema();
			case DslrelationalPackage.TABLE__LST_TRIGGER:
				return getLstTrigger();
			case DslrelationalPackage.TABLE__LST_COLUMN:
				return getLstColumn();
			case DslrelationalPackage.TABLE__LST_PRIMARY_KEY:
				return getLstPrimaryKey();
			case DslrelationalPackage.TABLE__LST_FOREIGN_KEY:
				return getLstForeignKey();
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
			case DslrelationalPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.TABLE__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)newValue);
				return;
			case DslrelationalPackage.TABLE__LST_TRIGGER:
				getLstTrigger().clear();
				getLstTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case DslrelationalPackage.TABLE__LST_COLUMN:
				getLstColumn().clear();
				getLstColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DslrelationalPackage.TABLE__LST_PRIMARY_KEY:
				getLstPrimaryKey().clear();
				getLstPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case DslrelationalPackage.TABLE__LST_FOREIGN_KEY:
				getLstForeignKey().clear();
				getLstForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
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
			case DslrelationalPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.TABLE__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)null);
				return;
			case DslrelationalPackage.TABLE__LST_TRIGGER:
				getLstTrigger().clear();
				return;
			case DslrelationalPackage.TABLE__LST_COLUMN:
				getLstColumn().clear();
				return;
			case DslrelationalPackage.TABLE__LST_PRIMARY_KEY:
				getLstPrimaryKey().clear();
				return;
			case DslrelationalPackage.TABLE__LST_FOREIGN_KEY:
				getLstForeignKey().clear();
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
			case DslrelationalPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.TABLE__OWNED_BY_SCHEMA:
				return ownedBySchema != null;
			case DslrelationalPackage.TABLE__LST_TRIGGER:
				return lstTrigger != null && !lstTrigger.isEmpty();
			case DslrelationalPackage.TABLE__LST_COLUMN:
				return lstColumn != null && !lstColumn.isEmpty();
			case DslrelationalPackage.TABLE__LST_PRIMARY_KEY:
				return lstPrimaryKey != null && !lstPrimaryKey.isEmpty();
			case DslrelationalPackage.TABLE__LST_FOREIGN_KEY:
				return lstForeignKey != null && !lstForeignKey.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TableImpl
