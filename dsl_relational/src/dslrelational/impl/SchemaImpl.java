/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Function;
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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.SchemaImpl#getLstTable <em>Lst Table</em>}</li>
 *   <li>{@link dslrelational.impl.SchemaImpl#getLstFunction <em>Lst Function</em>}</li>
 *   <li>{@link dslrelational.impl.SchemaImpl#getLstTrigger <em>Lst Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
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
	 * The cached value of the '{@link #getLstTable() <em>Lst Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> lstTable;

	/**
	 * The cached value of the '{@link #getLstFunction() <em>Lst Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> lstFunction;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getLstTable() {
		if (lstTable == null) {
			lstTable = new EObjectContainmentEList<Table>(Table.class, this, DslrelationalPackage.SCHEMA__LST_TABLE);
		}
		return lstTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getLstFunction() {
		if (lstFunction == null) {
			lstFunction = new EObjectContainmentEList<Function>(Function.class, this, DslrelationalPackage.SCHEMA__LST_FUNCTION);
		}
		return lstFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getLstTrigger() {
		if (lstTrigger == null) {
			lstTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, DslrelationalPackage.SCHEMA__LST_TRIGGER);
		}
		return lstTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.SCHEMA__LST_TABLE:
				return ((InternalEList<?>)getLstTable()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.SCHEMA__LST_FUNCTION:
				return ((InternalEList<?>)getLstFunction()).basicRemove(otherEnd, msgs);
			case DslrelationalPackage.SCHEMA__LST_TRIGGER:
				return ((InternalEList<?>)getLstTrigger()).basicRemove(otherEnd, msgs);
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
			case DslrelationalPackage.SCHEMA__NAME:
				return getName();
			case DslrelationalPackage.SCHEMA__LST_TABLE:
				return getLstTable();
			case DslrelationalPackage.SCHEMA__LST_FUNCTION:
				return getLstFunction();
			case DslrelationalPackage.SCHEMA__LST_TRIGGER:
				return getLstTrigger();
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
			case DslrelationalPackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.SCHEMA__LST_TABLE:
				getLstTable().clear();
				getLstTable().addAll((Collection<? extends Table>)newValue);
				return;
			case DslrelationalPackage.SCHEMA__LST_FUNCTION:
				getLstFunction().clear();
				getLstFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case DslrelationalPackage.SCHEMA__LST_TRIGGER:
				getLstTrigger().clear();
				getLstTrigger().addAll((Collection<? extends Trigger>)newValue);
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
			case DslrelationalPackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.SCHEMA__LST_TABLE:
				getLstTable().clear();
				return;
			case DslrelationalPackage.SCHEMA__LST_FUNCTION:
				getLstFunction().clear();
				return;
			case DslrelationalPackage.SCHEMA__LST_TRIGGER:
				getLstTrigger().clear();
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
			case DslrelationalPackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.SCHEMA__LST_TABLE:
				return lstTable != null && !lstTable.isEmpty();
			case DslrelationalPackage.SCHEMA__LST_FUNCTION:
				return lstFunction != null && !lstFunction.isEmpty();
			case DslrelationalPackage.SCHEMA__LST_TRIGGER:
				return lstTrigger != null && !lstTrigger.isEmpty();
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

} //SchemaImpl
