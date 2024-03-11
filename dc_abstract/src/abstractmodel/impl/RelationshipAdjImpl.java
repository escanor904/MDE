/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.ClassAdj;
import abstractmodel.RelationshipAdj;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.RelationshipAdjImpl#getRoleTarget <em>Role Target</em>}</li>
 *   <li>{@link abstractmodel.impl.RelationshipAdjImpl#getRoleSource <em>Role Source</em>}</li>
 *   <li>{@link abstractmodel.impl.RelationshipAdjImpl#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}</li>
 *   <li>{@link abstractmodel.impl.RelationshipAdjImpl#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}</li>
 *   <li>{@link abstractmodel.impl.RelationshipAdjImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipAdjImpl extends EObjectImpl implements RelationshipAdj {
	/**
	 * The default value of the '{@link #getRoleTarget() <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTarget() <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTarget()
	 * @generated
	 * @ordered
	 */
	protected String roleTarget = ROLE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleSource() <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSource()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleSource() <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSource()
	 * @generated
	 * @ordered
	 */
	protected String roleSource = ROLE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityTargetClass() <em>Multiplicity Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTargetClass()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_TARGET_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityTargetClass() <em>Multiplicity Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTargetClass()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityTargetClass = MULTIPLICITY_TARGET_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicitySourceClass() <em>Multiplicity Source Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySourceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_SOURCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicitySourceClass() <em>Multiplicity Source Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySourceClass()
	 * @generated
	 * @ordered
	 */
	protected String multiplicitySourceClass = MULTIPLICITY_SOURCE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected ClassAdj targetClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.RELATIONSHIP_ADJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleTarget() {
		return roleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleTarget(String newRoleTarget) {
		String oldRoleTarget = roleTarget;
		roleTarget = newRoleTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET, oldRoleTarget, roleTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleSource() {
		return roleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSource(String newRoleSource) {
		String oldRoleSource = roleSource;
		roleSource = newRoleSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE, oldRoleSource, roleSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicityTargetClass() {
		return multiplicityTargetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityTargetClass(String newMultiplicityTargetClass) {
		String oldMultiplicityTargetClass = multiplicityTargetClass;
		multiplicityTargetClass = newMultiplicityTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS, oldMultiplicityTargetClass, multiplicityTargetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicitySourceClass() {
		return multiplicitySourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicitySourceClass(String newMultiplicitySourceClass) {
		String oldMultiplicitySourceClass = multiplicitySourceClass;
		multiplicitySourceClass = newMultiplicitySourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS, oldMultiplicitySourceClass, multiplicitySourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAdj getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (ClassAdj)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAdj basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(ClassAdj newTargetClass) {
		ClassAdj oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				return getRoleTarget();
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				return getRoleSource();
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				return getMultiplicityTargetClass();
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				return getMultiplicitySourceClass();
			case AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
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
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				setRoleTarget((String)newValue);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				setRoleSource((String)newValue);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				setMultiplicityTargetClass((String)newValue);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				setMultiplicitySourceClass((String)newValue);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS:
				setTargetClass((ClassAdj)newValue);
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
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				setRoleTarget(ROLE_TARGET_EDEFAULT);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				setRoleSource(ROLE_SOURCE_EDEFAULT);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				setMultiplicityTargetClass(MULTIPLICITY_TARGET_CLASS_EDEFAULT);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				setMultiplicitySourceClass(MULTIPLICITY_SOURCE_CLASS_EDEFAULT);
				return;
			case AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS:
				setTargetClass((ClassAdj)null);
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
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				return ROLE_TARGET_EDEFAULT == null ? roleTarget != null : !ROLE_TARGET_EDEFAULT.equals(roleTarget);
			case AbstractmodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				return ROLE_SOURCE_EDEFAULT == null ? roleSource != null : !ROLE_SOURCE_EDEFAULT.equals(roleSource);
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				return MULTIPLICITY_TARGET_CLASS_EDEFAULT == null ? multiplicityTargetClass != null : !MULTIPLICITY_TARGET_CLASS_EDEFAULT.equals(multiplicityTargetClass);
			case AbstractmodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				return MULTIPLICITY_SOURCE_CLASS_EDEFAULT == null ? multiplicitySourceClass != null : !MULTIPLICITY_SOURCE_CLASS_EDEFAULT.equals(multiplicitySourceClass);
			case AbstractmodelPackage.RELATIONSHIP_ADJ__TARGET_CLASS:
				return targetClass != null;
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
		result.append(" (roleTarget: ");
		result.append(roleTarget);
		result.append(", roleSource: ");
		result.append(roleSource);
		result.append(", multiplicityTargetClass: ");
		result.append(multiplicityTargetClass);
		result.append(", multiplicitySourceClass: ");
		result.append(multiplicitySourceClass);
		result.append(')');
		return result.toString();
	}

} //RelationshipAdjImpl
