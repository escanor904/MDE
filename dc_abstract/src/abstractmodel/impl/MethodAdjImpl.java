/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AccessModifier;
import abstractmodel.MethodAdj;
import abstractmodel.ParameterAdj;

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
 * An implementation of the model object '<em><b>Method Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.MethodAdjImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link abstractmodel.impl.MethodAdjImpl#getAccessModify <em>Access Modify</em>}</li>
 *   <li>{@link abstractmodel.impl.MethodAdjImpl#getReturnTypeAdj <em>Return Type Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.MethodAdjImpl#getBody <em>Body</em>}</li>
 *   <li>{@link abstractmodel.impl.MethodAdjImpl#getLstParameterAdj <em>Lst Parameter Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodAdjImpl extends EObjectImpl implements MethodAdj {
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
	 * The default value of the '{@link #getAccessModify() <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModify()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_MODIFY_EDEFAULT = AccessModifier.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessModify() <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModify()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier accessModify = ACCESS_MODIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnTypeAdj() <em>Return Type Adj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeAdj()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_ADJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTypeAdj() <em>Return Type Adj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeAdj()
	 * @generated
	 * @ordered
	 */
	protected String returnTypeAdj = RETURN_TYPE_ADJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstParameterAdj() <em>Lst Parameter Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstParameterAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterAdj> lstParameterAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.METHOD_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.METHOD_ADJ__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccessModify() {
		return accessModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModify(AccessModifier newAccessModify) {
		AccessModifier oldAccessModify = accessModify;
		accessModify = newAccessModify == null ? ACCESS_MODIFY_EDEFAULT : newAccessModify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.METHOD_ADJ__ACCESS_MODIFY, oldAccessModify, accessModify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnTypeAdj() {
		return returnTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnTypeAdj(String newReturnTypeAdj) {
		String oldReturnTypeAdj = returnTypeAdj;
		returnTypeAdj = newReturnTypeAdj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.METHOD_ADJ__RETURN_TYPE_ADJ, oldReturnTypeAdj, returnTypeAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.METHOD_ADJ__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterAdj> getLstParameterAdj() {
		if (lstParameterAdj == null) {
			lstParameterAdj = new EObjectContainmentEList<ParameterAdj>(ParameterAdj.class, this, AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ);
		}
		return lstParameterAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ:
				return ((InternalEList<?>)getLstParameterAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.METHOD_ADJ__METHOD_NAME:
				return getMethodName();
			case AbstractmodelPackage.METHOD_ADJ__ACCESS_MODIFY:
				return getAccessModify();
			case AbstractmodelPackage.METHOD_ADJ__RETURN_TYPE_ADJ:
				return getReturnTypeAdj();
			case AbstractmodelPackage.METHOD_ADJ__BODY:
				return getBody();
			case AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ:
				return getLstParameterAdj();
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
			case AbstractmodelPackage.METHOD_ADJ__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case AbstractmodelPackage.METHOD_ADJ__ACCESS_MODIFY:
				setAccessModify((AccessModifier)newValue);
				return;
			case AbstractmodelPackage.METHOD_ADJ__RETURN_TYPE_ADJ:
				setReturnTypeAdj((String)newValue);
				return;
			case AbstractmodelPackage.METHOD_ADJ__BODY:
				setBody((String)newValue);
				return;
			case AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ:
				getLstParameterAdj().clear();
				getLstParameterAdj().addAll((Collection<? extends ParameterAdj>)newValue);
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
			case AbstractmodelPackage.METHOD_ADJ__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.METHOD_ADJ__ACCESS_MODIFY:
				setAccessModify(ACCESS_MODIFY_EDEFAULT);
				return;
			case AbstractmodelPackage.METHOD_ADJ__RETURN_TYPE_ADJ:
				setReturnTypeAdj(RETURN_TYPE_ADJ_EDEFAULT);
				return;
			case AbstractmodelPackage.METHOD_ADJ__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ:
				getLstParameterAdj().clear();
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
			case AbstractmodelPackage.METHOD_ADJ__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case AbstractmodelPackage.METHOD_ADJ__ACCESS_MODIFY:
				return accessModify != ACCESS_MODIFY_EDEFAULT;
			case AbstractmodelPackage.METHOD_ADJ__RETURN_TYPE_ADJ:
				return RETURN_TYPE_ADJ_EDEFAULT == null ? returnTypeAdj != null : !RETURN_TYPE_ADJ_EDEFAULT.equals(returnTypeAdj);
			case AbstractmodelPackage.METHOD_ADJ__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case AbstractmodelPackage.METHOD_ADJ__LST_PARAMETER_ADJ:
				return lstParameterAdj != null && !lstParameterAdj.isEmpty();
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
		result.append(", accessModify: ");
		result.append(accessModify);
		result.append(", returnTypeAdj: ");
		result.append(returnTypeAdj);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //MethodAdjImpl
