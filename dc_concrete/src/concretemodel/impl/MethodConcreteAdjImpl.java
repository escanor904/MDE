/**
 */
package concretemodel.impl;

import concretemodel.AccessModifier;
import concretemodel.ConcretemodelPackage;
import concretemodel.MethodConcreteAdj;
import concretemodel.ParameterConcreteAdj;

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
 * An implementation of the model object '<em><b>Method Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.MethodConcreteAdjImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link concretemodel.impl.MethodConcreteAdjImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link concretemodel.impl.MethodConcreteAdjImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link concretemodel.impl.MethodConcreteAdjImpl#getLstParameterConcreteAdj <em>Lst Parameter Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodConcreteAdjImpl extends EObjectImpl implements MethodConcreteAdj {
	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_MODIFIER_EDEFAULT = AccessModifier.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier accessModifier = ACCESS_MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstParameterConcreteAdj() <em>Lst Parameter Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstParameterConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConcreteAdj> lstParameterConcreteAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodConcreteAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.METHOD_CONCRETE_ADJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.METHOD_CONCRETE_ADJ__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.METHOD_CONCRETE_ADJ__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccessModifier() {
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModifier(AccessModifier newAccessModifier) {
		AccessModifier oldAccessModifier = accessModifier;
		accessModifier = newAccessModifier == null ? ACCESS_MODIFIER_EDEFAULT : newAccessModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.METHOD_CONCRETE_ADJ__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterConcreteAdj> getLstParameterConcreteAdj() {
		if (lstParameterConcreteAdj == null) {
			lstParameterConcreteAdj = new EObjectContainmentEList<ParameterConcreteAdj>(ParameterConcreteAdj.class, this, ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ);
		}
		return lstParameterConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstParameterConcreteAdj()).basicRemove(otherEnd, msgs);
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
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__METHOD_NAME:
				return getMethodName();
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__RETURN_TYPE:
				return getReturnType();
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__ACCESS_MODIFIER:
				return getAccessModifier();
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ:
				return getLstParameterConcreteAdj();
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
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__ACCESS_MODIFIER:
				setAccessModifier((AccessModifier)newValue);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ:
				getLstParameterConcreteAdj().clear();
				getLstParameterConcreteAdj().addAll((Collection<? extends ParameterConcreteAdj>)newValue);
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
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ:
				getLstParameterConcreteAdj().clear();
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
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__ACCESS_MODIFIER:
				return accessModifier != ACCESS_MODIFIER_EDEFAULT;
			case ConcretemodelPackage.METHOD_CONCRETE_ADJ__LST_PARAMETER_CONCRETE_ADJ:
				return lstParameterConcreteAdj != null && !lstParameterConcreteAdj.isEmpty();
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(')');
		return result.toString();
	}

} //MethodConcreteAdjImpl
