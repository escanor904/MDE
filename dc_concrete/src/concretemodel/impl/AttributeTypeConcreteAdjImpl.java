/**
 */
package concretemodel.impl;

import concretemodel.AttributeConcreteAdj;
import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ConcretemodelPackage;
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
 * An implementation of the model object '<em><b>Attribute Type Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.AttributeTypeConcreteAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.AttributeTypeConcreteAdjImpl#getParameterConcreteAdj <em>Parameter Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.impl.AttributeTypeConcreteAdjImpl#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeConcreteAdjImpl extends EObjectImpl implements AttributeTypeConcreteAdj {
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
	 * The cached value of the '{@link #getParameterConcreteAdj() <em>Parameter Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConcreteAdj> parameterConcreteAdj;

	/**
	 * The cached value of the '{@link #getLstAttributeConcreteAdj() <em>Lst Attribute Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributeConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConcreteAdj> lstAttributeConcreteAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeConcreteAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.ATTRIBUTE_TYPE_CONCRETE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterConcreteAdj> getParameterConcreteAdj() {
		if (parameterConcreteAdj == null) {
			parameterConcreteAdj = new EObjectContainmentEList<ParameterConcreteAdj>(ParameterConcreteAdj.class, this, ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ);
		}
		return parameterConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConcreteAdj> getLstAttributeConcreteAdj() {
		if (lstAttributeConcreteAdj == null) {
			lstAttributeConcreteAdj = new EObjectContainmentEList<AttributeConcreteAdj>(AttributeConcreteAdj.class, this, ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ);
		}
		return lstAttributeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ:
				return ((InternalEList<?>)getParameterConcreteAdj()).basicRemove(otherEnd, msgs);
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstAttributeConcreteAdj()).basicRemove(otherEnd, msgs);
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
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ:
				return getParameterConcreteAdj();
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return getLstAttributeConcreteAdj();
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
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ:
				getParameterConcreteAdj().clear();
				getParameterConcreteAdj().addAll((Collection<? extends ParameterConcreteAdj>)newValue);
				return;
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				getLstAttributeConcreteAdj().clear();
				getLstAttributeConcreteAdj().addAll((Collection<? extends AttributeConcreteAdj>)newValue);
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
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ:
				getParameterConcreteAdj().clear();
				return;
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				getLstAttributeConcreteAdj().clear();
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
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__PARAMETER_CONCRETE_ADJ:
				return parameterConcreteAdj != null && !parameterConcreteAdj.isEmpty();
			case ConcretemodelPackage.ATTRIBUTE_TYPE_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return lstAttributeConcreteAdj != null && !lstAttributeConcreteAdj.isEmpty();
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

} //AttributeTypeConcreteAdjImpl
