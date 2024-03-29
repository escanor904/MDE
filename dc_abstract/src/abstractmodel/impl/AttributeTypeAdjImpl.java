/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;
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
 * An implementation of the model object '<em><b>Attribute Type Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.AttributeTypeAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.AttributeTypeAdjImpl#getLstParameterAdj <em>Lst Parameter Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.AttributeTypeAdjImpl#getLstAttributeAdj <em>Lst Attribute Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeAdjImpl extends EObjectImpl implements AttributeTypeAdj {
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
	 * The cached value of the '{@link #getLstParameterAdj() <em>Lst Parameter Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstParameterAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterAdj> lstParameterAdj;

	/**
	 * The cached value of the '{@link #getLstAttributeAdj() <em>Lst Attribute Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributeAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAdj> lstAttributeAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.ATTRIBUTE_TYPE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterAdj> getLstParameterAdj() {
		if (lstParameterAdj == null) {
			lstParameterAdj = new EObjectContainmentEList<ParameterAdj>(ParameterAdj.class, this, AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ);
		}
		return lstParameterAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAdj> getLstAttributeAdj() {
		if (lstAttributeAdj == null) {
			lstAttributeAdj = new EObjectContainmentEList<AttributeAdj>(AttributeAdj.class, this, AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ);
		}
		return lstAttributeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ:
				return ((InternalEList<?>)getLstParameterAdj()).basicRemove(otherEnd, msgs);
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ:
				return ((InternalEList<?>)getLstAttributeAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ:
				return getLstParameterAdj();
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ:
				return getLstAttributeAdj();
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ:
				getLstParameterAdj().clear();
				getLstParameterAdj().addAll((Collection<? extends ParameterAdj>)newValue);
				return;
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ:
				getLstAttributeAdj().clear();
				getLstAttributeAdj().addAll((Collection<? extends AttributeAdj>)newValue);
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ:
				getLstParameterAdj().clear();
				return;
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ:
				getLstAttributeAdj().clear();
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
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_PARAMETER_ADJ:
				return lstParameterAdj != null && !lstParameterAdj.isEmpty();
			case AbstractmodelPackage.ATTRIBUTE_TYPE_ADJ__LST_ATTRIBUTE_ADJ:
				return lstAttributeAdj != null && !lstAttributeAdj.isEmpty();
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

} //AttributeTypeAdjImpl
