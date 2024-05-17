/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Function;
import dslrelational.Parameter;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getOwnedByFunction() <em>Owned By Function</em>}' reference.
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
		if (ownedByFunction != null && ownedByFunction.eIsProxy()) {
			InternalEObject oldOwnedByFunction = (InternalEObject)ownedByFunction;
			ownedByFunction = (Function)eResolveProxy(oldOwnedByFunction);
			if (ownedByFunction != oldOwnedByFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, oldOwnedByFunction, ownedByFunction));
			}
		}
		return ownedByFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetOwnedByFunction() {
		return ownedByFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFunction(Function newOwnedByFunction) {
		Function oldOwnedByFunction = ownedByFunction;
		ownedByFunction = newOwnedByFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.PARAMETER__OWNED_BY_FUNCTION, oldOwnedByFunction, ownedByFunction));
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
				if (resolve) return getOwnedByFunction();
				return basicGetOwnedByFunction();
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
