/**
 */
package concretemodel.impl;

import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.ParameterConcreteAdj;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.ParameterConcreteAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.ParameterConcreteAdjImpl#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterConcreteAdjImpl extends EObjectImpl implements ParameterConcreteAdj {
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
	 * The cached value of the '{@link #getAttributeTypeConcreteAdj() <em>Attribute Type Concrete Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypeConcreteAdj attributeTypeConcreteAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConcreteAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.PARAMETER_CONCRETE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeConcreteAdj getAttributeTypeConcreteAdj() {
		if (attributeTypeConcreteAdj != null && attributeTypeConcreteAdj.eIsProxy()) {
			InternalEObject oldAttributeTypeConcreteAdj = (InternalEObject)attributeTypeConcreteAdj;
			attributeTypeConcreteAdj = (AttributeTypeConcreteAdj)eResolveProxy(oldAttributeTypeConcreteAdj);
			if (attributeTypeConcreteAdj != oldAttributeTypeConcreteAdj) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ, oldAttributeTypeConcreteAdj, attributeTypeConcreteAdj));
			}
		}
		return attributeTypeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeConcreteAdj basicGetAttributeTypeConcreteAdj() {
		return attributeTypeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeTypeConcreteAdj(AttributeTypeConcreteAdj newAttributeTypeConcreteAdj) {
		AttributeTypeConcreteAdj oldAttributeTypeConcreteAdj = attributeTypeConcreteAdj;
		attributeTypeConcreteAdj = newAttributeTypeConcreteAdj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ, oldAttributeTypeConcreteAdj, attributeTypeConcreteAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
				if (resolve) return getAttributeTypeConcreteAdj();
				return basicGetAttributeTypeConcreteAdj();
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
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
				setAttributeTypeConcreteAdj((AttributeTypeConcreteAdj)newValue);
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
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
				setAttributeTypeConcreteAdj((AttributeTypeConcreteAdj)null);
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
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.PARAMETER_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
				return attributeTypeConcreteAdj != null;
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

} //ParameterConcreteAdjImpl
