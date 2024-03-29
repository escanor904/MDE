/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.AttributeAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.AttributeAdjImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link abstractmodel.impl.AttributeAdjImpl#getAccesModifier <em>Acces Modifier</em>}</li>
 *   <li>{@link abstractmodel.impl.AttributeAdjImpl#getAttributeTypeAdj <em>Attribute Type Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeAdjImpl extends EObjectImpl implements AttributeAdj {
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
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesModifier() <em>Acces Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCES_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccesModifier() <em>Acces Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifier()
	 * @generated
	 * @ordered
	 */
	protected String accesModifier = ACCES_MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeTypeAdj() <em>Attribute Type Adj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeAdj()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypeAdj attributeTypeAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.ATTRIBUTE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.ATTRIBUTE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.ATTRIBUTE_ADJ__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccesModifier() {
		return accesModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesModifier(String newAccesModifier) {
		String oldAccesModifier = accesModifier;
		accesModifier = newAccesModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.ATTRIBUTE_ADJ__ACCES_MODIFIER, oldAccesModifier, accesModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeAdj getAttributeTypeAdj() {
		if (attributeTypeAdj != null && attributeTypeAdj.eIsProxy()) {
			InternalEObject oldAttributeTypeAdj = (InternalEObject)attributeTypeAdj;
			attributeTypeAdj = (AttributeTypeAdj)eResolveProxy(oldAttributeTypeAdj);
			if (attributeTypeAdj != oldAttributeTypeAdj) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ, oldAttributeTypeAdj, attributeTypeAdj));
			}
		}
		return attributeTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeAdj basicGetAttributeTypeAdj() {
		return attributeTypeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeTypeAdj(AttributeTypeAdj newAttributeTypeAdj) {
		AttributeTypeAdj oldAttributeTypeAdj = attributeTypeAdj;
		attributeTypeAdj = newAttributeTypeAdj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ, oldAttributeTypeAdj, attributeTypeAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractmodelPackage.ATTRIBUTE_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.ATTRIBUTE_ADJ__VALOR:
				return getValor();
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ACCES_MODIFIER:
				return getAccesModifier();
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ:
				if (resolve) return getAttributeTypeAdj();
				return basicGetAttributeTypeAdj();
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
			case AbstractmodelPackage.ATTRIBUTE_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__VALOR:
				setValor((String)newValue);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ACCES_MODIFIER:
				setAccesModifier((String)newValue);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ:
				setAttributeTypeAdj((AttributeTypeAdj)newValue);
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
			case AbstractmodelPackage.ATTRIBUTE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ACCES_MODIFIER:
				setAccesModifier(ACCES_MODIFIER_EDEFAULT);
				return;
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ:
				setAttributeTypeAdj((AttributeTypeAdj)null);
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
			case AbstractmodelPackage.ATTRIBUTE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.ATTRIBUTE_ADJ__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ACCES_MODIFIER:
				return ACCES_MODIFIER_EDEFAULT == null ? accesModifier != null : !ACCES_MODIFIER_EDEFAULT.equals(accesModifier);
			case AbstractmodelPackage.ATTRIBUTE_ADJ__ATTRIBUTE_TYPE_ADJ:
				return attributeTypeAdj != null;
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
		result.append(", valor: ");
		result.append(valor);
		result.append(", accesModifier: ");
		result.append(accesModifier);
		result.append(')');
		return result.toString();
	}

} //AttributeAdjImpl
