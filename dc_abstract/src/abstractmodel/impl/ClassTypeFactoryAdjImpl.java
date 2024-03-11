/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.ClassTypeAdj;
import abstractmodel.ClassTypeFactoryAdj;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type Factory Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.ClassTypeFactoryAdjImpl#getLstClassTypeAdj <em>Lst Class Type Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTypeFactoryAdjImpl extends EObjectImpl implements ClassTypeFactoryAdj {
	/**
	 * The cached value of the '{@link #getLstClassTypeAdj() <em>Lst Class Type Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClassTypeAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassTypeAdj> lstClassTypeAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeFactoryAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.CLASS_TYPE_FACTORY_ADJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassTypeAdj> getLstClassTypeAdj() {
		if (lstClassTypeAdj == null) {
			lstClassTypeAdj = new EObjectContainmentEList<ClassTypeAdj>(ClassTypeAdj.class, this, AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ);
		}
		return lstClassTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ:
				return ((InternalEList<?>)getLstClassTypeAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ:
				return getLstClassTypeAdj();
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
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ:
				getLstClassTypeAdj().clear();
				getLstClassTypeAdj().addAll((Collection<? extends ClassTypeAdj>)newValue);
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
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ:
				getLstClassTypeAdj().clear();
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
			case AbstractmodelPackage.CLASS_TYPE_FACTORY_ADJ__LST_CLASS_TYPE_ADJ:
				return lstClassTypeAdj != null && !lstClassTypeAdj.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassTypeFactoryAdjImpl
