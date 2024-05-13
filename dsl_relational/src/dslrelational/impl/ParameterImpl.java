/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Function;
import dslrelational.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.ParameterImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link dslrelational.impl.ParameterImpl#getOwnedByFunction <em>Owned By Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
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
	 * The cached value of the '{@link #getOwnedByFunction() <em>Owned By Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByFunction()
	 * @generated
	 * @ordered
	 */
	protected Function ownedByFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PARAMETER__COLUMN_TYPE, oldColumnType, columnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getOwnedByFunction() {
		return ownedByFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByFunction(Function newOwnedByFunction, NotificationChain msgs) {
		Function oldOwnedByFunction = ownedByFunction;
		ownedByFunction = newOwnedByFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, oldOwnedByFunction, newOwnedByFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFunction(Function newOwnedByFunction) {
		if (newOwnedByFunction != ownedByFunction) {
			NotificationChain msgs = null;
			if (ownedByFunction != null)
				msgs = ((InternalEObject)ownedByFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, null, msgs);
			if (newOwnedByFunction != null)
				msgs = ((InternalEObject)newOwnedByFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, null, msgs);
			msgs = basicSetOwnedByFunction(newOwnedByFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, newOwnedByFunction, newOwnedByFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION:
				return basicSetOwnedByFunction(null, msgs);
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
			case DslrelationalPackage.PARAMETER__NAME:
				return getName();
			case DslrelationalPackage.PARAMETER__COLUMN_TYPE:
				return getColumnType();
			case DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION:
				return getOwnedByFunction();
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
			case DslrelationalPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.PARAMETER__COLUMN_TYPE:
				setColumnType((String)newValue);
				return;
			case DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION:
				setOwnedByFunction((Function)newValue);
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
			case DslrelationalPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.PARAMETER__COLUMN_TYPE:
				setColumnType(COLUMN_TYPE_EDEFAULT);
				return;
			case DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION:
				setOwnedByFunction((Function)null);
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
			case DslrelationalPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.PARAMETER__COLUMN_TYPE:
				return COLUMN_TYPE_EDEFAULT == null ? columnType != null : !COLUMN_TYPE_EDEFAULT.equals(columnType);
			case DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION:
				return ownedByFunction != null;
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
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
