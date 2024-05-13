/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Function;
import dslrelational.Parameter;
import dslrelational.Schema;

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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link dslrelational.impl.FunctionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link dslrelational.impl.FunctionImpl#getOwnedBySchema <em>Owned By Schema</em>}</li>
 *   <li>{@link dslrelational.impl.FunctionImpl#getLstParameter <em>Lst Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends EObjectImpl implements Function {
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
	 * The cached value of the '{@link #getOwnedBySchema() <em>Owned By Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBySchema()
	 * @generated
	 * @ordered
	 */
	protected Schema ownedBySchema;

	/**
	 * The cached value of the '{@link #getLstParameter() <em>Lst Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> lstParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FUNCTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FUNCTION__RETURN_TYPE, oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FUNCTION__BODY, oldBody, body));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA, oldOwnedBySchema, newOwnedBySchema);
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
				msgs = ((InternalEObject)ownedBySchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA, null, msgs);
			if (newOwnedBySchema != null)
				msgs = ((InternalEObject)newOwnedBySchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA, null, msgs);
			msgs = basicSetOwnedBySchema(newOwnedBySchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA, newOwnedBySchema, newOwnedBySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getLstParameter() {
		if (lstParameter == null) {
			lstParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, DslrelationalPackage.FUNCTION__LST_PARAMETER);
		}
		return lstParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA:
				return basicSetOwnedBySchema(null, msgs);
			case DslrelationalPackage.FUNCTION__LST_PARAMETER:
				return ((InternalEList<?>)getLstParameter()).basicRemove(otherEnd, msgs);
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
			case DslrelationalPackage.FUNCTION__NAME:
				return getName();
			case DslrelationalPackage.FUNCTION__RETURN_TYPE:
				return getReturnType();
			case DslrelationalPackage.FUNCTION__BODY:
				return getBody();
			case DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA:
				return getOwnedBySchema();
			case DslrelationalPackage.FUNCTION__LST_PARAMETER:
				return getLstParameter();
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
			case DslrelationalPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.FUNCTION__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case DslrelationalPackage.FUNCTION__BODY:
				setBody((String)newValue);
				return;
			case DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)newValue);
				return;
			case DslrelationalPackage.FUNCTION__LST_PARAMETER:
				getLstParameter().clear();
				getLstParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case DslrelationalPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.FUNCTION__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case DslrelationalPackage.FUNCTION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)null);
				return;
			case DslrelationalPackage.FUNCTION__LST_PARAMETER:
				getLstParameter().clear();
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
			case DslrelationalPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.FUNCTION__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case DslrelationalPackage.FUNCTION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case DslrelationalPackage.FUNCTION__OWNED_BY_SCHEMA:
				return ownedBySchema != null;
			case DslrelationalPackage.FUNCTION__LST_PARAMETER:
				return lstParameter != null && !lstParameter.isEmpty();
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
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
