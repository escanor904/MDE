/**
 */
package concretemodel.impl;

import concretemodel.AttributeConcreteAdj;
import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ConcretemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.AttributeConcreteAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.AttributeConcreteAdjImpl#getValue <em>Value</em>}</li>
 *   <li>{@link concretemodel.impl.AttributeConcreteAdjImpl#getAttributeTypeConcreteAdj <em>Attribute Type Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConcreteAdjImpl extends EObjectImpl implements AttributeConcreteAdj {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected AttributeConcreteAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.ATTRIBUTE_CONCRETE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ, oldAttributeTypeConcreteAdj, attributeTypeConcreteAdj));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ, oldAttributeTypeConcreteAdj, attributeTypeConcreteAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__VALUE:
				return getValue();
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
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
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__VALUE:
				setValue((String)newValue);
				return;
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
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
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
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
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ConcretemodelPackage.ATTRIBUTE_CONCRETE_ADJ__ATTRIBUTE_TYPE_CONCRETE_ADJ:
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeConcreteAdjImpl
