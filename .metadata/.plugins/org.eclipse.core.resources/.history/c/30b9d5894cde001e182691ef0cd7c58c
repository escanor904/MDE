/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.ClassAdj;
import abstractmodel.ClassTypeAdj;

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
 * An implementation of the model object '<em><b>Class Type Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.ClassTypeAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassTypeAdjImpl#getLstClassAdj <em>Lst Class Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTypeAdjImpl extends EObjectImpl implements ClassTypeAdj {
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
	 * The cached value of the '{@link #getLstClassAdj() <em>Lst Class Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClassAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAdj> lstClassAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.CLASS_TYPE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.CLASS_TYPE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAdj> getLstClassAdj() {
		if (lstClassAdj == null) {
			lstClassAdj = new EObjectContainmentEList<ClassAdj>(ClassAdj.class, this, AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ);
		}
		return lstClassAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ:
				return ((InternalEList<?>)getLstClassAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.CLASS_TYPE_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ:
				return getLstClassAdj();
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
			case AbstractmodelPackage.CLASS_TYPE_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ:
				getLstClassAdj().clear();
				getLstClassAdj().addAll((Collection<? extends ClassAdj>)newValue);
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
			case AbstractmodelPackage.CLASS_TYPE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ:
				getLstClassAdj().clear();
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
			case AbstractmodelPackage.CLASS_TYPE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.CLASS_TYPE_ADJ__LST_CLASS_ADJ:
				return lstClassAdj != null && !lstClassAdj.isEmpty();
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

} //ClassTypeAdjImpl
