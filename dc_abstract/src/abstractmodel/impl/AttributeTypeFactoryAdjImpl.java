/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeTypeAdj;
import abstractmodel.AttributeTypeFactoryAdj;

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
 * An implementation of the model object '<em><b>Attribute Type Factory Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.AttributeTypeFactoryAdjImpl#getLstAttributeTypeAdj <em>Lst Attribute Type Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeFactoryAdjImpl extends EObjectImpl implements AttributeTypeFactoryAdj {
	/**
	 * The cached value of the '{@link #getLstAttributeTypeAdj() <em>Lst Attribute Type Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributeTypeAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeTypeAdj> lstAttributeTypeAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeFactoryAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.ATTRIBUTE_TYPE_FACTORY_ADJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeTypeAdj> getLstAttributeTypeAdj() {
		if (lstAttributeTypeAdj == null) {
			lstAttributeTypeAdj = new EObjectContainmentEList<AttributeTypeAdj>(AttributeTypeAdj.class, this, AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ);
		}
		return lstAttributeTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ:
				return ((InternalEList<?>)getLstAttributeTypeAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ:
				return getLstAttributeTypeAdj();
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ:
				getLstAttributeTypeAdj().clear();
				getLstAttributeTypeAdj().addAll((Collection<? extends AttributeTypeAdj>)newValue);
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ:
				getLstAttributeTypeAdj().clear();
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_FACTORY_ADJ__LST_ATTRIBUTE_TYPE_ADJ:
				return lstAttributeTypeAdj != null && !lstAttributeTypeAdj.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeTypeFactoryAdjImpl
