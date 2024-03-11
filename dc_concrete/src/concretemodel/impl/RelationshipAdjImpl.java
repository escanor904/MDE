/**
 */
package concretemodel.impl;

import concretemodel.ClassConcreteAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.RelationshipAdj;

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
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getRoleTarget <em>Role Target</em>}</li>
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getRoleSource <em>Role Source</em>}</li>
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getMultiplicityTargetClass <em>Multiplicity Target Class</em>}</li>
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getMultiplicitySourceClass <em>Multiplicity Source Class</em>}</li>
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getClassSource <em>Class Source</em>}</li>
 *   <li>{@link concretemodel.impl.RelationshipAdjImpl#getClassTarget <em>Class Target</em>}</li>
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
	 * The cached value of the '{@link #getClassSource() <em>Class Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassSource()
	 * @generated
	 * @ordered
	 */
	protected ClassConcreteAdj classSource;

	/**
	 * The cached value of the '{@link #getClassTarget() <em>Class Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassConcreteAdj classTarget;

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
		return ConcretemodelPackage.Literals.RELATIONSHIP_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET, oldRoleTarget, roleTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE, oldRoleSource, roleSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS, oldMultiplicityTargetClass, multiplicityTargetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS, oldMultiplicitySourceClass, multiplicitySourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConcreteAdj getClassSource() {
		if (classSource != null && classSource.eIsProxy()) {
			InternalEObject oldClassSource = (InternalEObject)classSource;
			classSource = (ClassConcreteAdj)eResolveProxy(oldClassSource);
			if (classSource != oldClassSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE, oldClassSource, classSource));
			}
		}
		return classSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConcreteAdj basicGetClassSource() {
		return classSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassSource(ClassConcreteAdj newClassSource) {
		ClassConcreteAdj oldClassSource = classSource;
		classSource = newClassSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE, oldClassSource, classSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConcreteAdj getClassTarget() {
		if (classTarget != null && classTarget.eIsProxy()) {
			InternalEObject oldClassTarget = (InternalEObject)classTarget;
			classTarget = (ClassConcreteAdj)eResolveProxy(oldClassTarget);
			if (classTarget != oldClassTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET, oldClassTarget, classTarget));
			}
		}
		return classTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConcreteAdj basicGetClassTarget() {
		return classTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassTarget(ClassConcreteAdj newClassTarget) {
		ClassConcreteAdj oldClassTarget = classTarget;
		classTarget = newClassTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET, oldClassTarget, classTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				return getRoleTarget();
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				return getRoleSource();
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				return getMultiplicityTargetClass();
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				return getMultiplicitySourceClass();
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE:
				if (resolve) return getClassSource();
				return basicGetClassSource();
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET:
				if (resolve) return getClassTarget();
				return basicGetClassTarget();
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
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				setRoleTarget((String)newValue);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				setRoleSource((String)newValue);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				setMultiplicityTargetClass((String)newValue);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				setMultiplicitySourceClass((String)newValue);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE:
				setClassSource((ClassConcreteAdj)newValue);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET:
				setClassTarget((ClassConcreteAdj)newValue);
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
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				setRoleTarget(ROLE_TARGET_EDEFAULT);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				setRoleSource(ROLE_SOURCE_EDEFAULT);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				setMultiplicityTargetClass(MULTIPLICITY_TARGET_CLASS_EDEFAULT);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				setMultiplicitySourceClass(MULTIPLICITY_SOURCE_CLASS_EDEFAULT);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE:
				setClassSource((ClassConcreteAdj)null);
				return;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET:
				setClassTarget((ClassConcreteAdj)null);
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
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_TARGET:
				return ROLE_TARGET_EDEFAULT == null ? roleTarget != null : !ROLE_TARGET_EDEFAULT.equals(roleTarget);
			case ConcretemodelPackage.RELATIONSHIP_ADJ__ROLE_SOURCE:
				return ROLE_SOURCE_EDEFAULT == null ? roleSource != null : !ROLE_SOURCE_EDEFAULT.equals(roleSource);
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_TARGET_CLASS:
				return MULTIPLICITY_TARGET_CLASS_EDEFAULT == null ? multiplicityTargetClass != null : !MULTIPLICITY_TARGET_CLASS_EDEFAULT.equals(multiplicityTargetClass);
			case ConcretemodelPackage.RELATIONSHIP_ADJ__MULTIPLICITY_SOURCE_CLASS:
				return MULTIPLICITY_SOURCE_CLASS_EDEFAULT == null ? multiplicitySourceClass != null : !MULTIPLICITY_SOURCE_CLASS_EDEFAULT.equals(multiplicitySourceClass);
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_SOURCE:
				return classSource != null;
			case ConcretemodelPackage.RELATIONSHIP_ADJ__CLASS_TARGET:
				return classTarget != null;
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
