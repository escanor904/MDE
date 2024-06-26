/**
 */
package concretemodel.impl;

import concretemodel.AccessModifierClass;
import concretemodel.AttributeConcreteAdj;
import concretemodel.ClassConcreteAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.MethodConcreteAdj;
import concretemodel.TypeClass;

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
 * An implementation of the model object '<em><b>Class Concrete Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getAccesModifierClass <em>Acces Modifier Class</em>}</li>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getTipeClass <em>Tipe Class</em>}</li>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getLstAttributeConcreteAdj <em>Lst Attribute Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.impl.ClassConcreteAdjImpl#getLstMethodConcreteAdj <em>Lst Method Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassConcreteAdjImpl extends EObjectImpl implements ClassConcreteAdj {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesModifierClass() <em>Acces Modifier Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifierClass()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifierClass ACCES_MODIFIER_CLASS_EDEFAULT = AccessModifierClass.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccesModifierClass() <em>Acces Modifier Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifierClass()
	 * @generated
	 * @ordered
	 */
	protected AccessModifierClass accesModifierClass = ACCES_MODIFIER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipeClass() <em>Tipe Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipeClass()
	 * @generated
	 * @ordered
	 */
	protected static final TypeClass TIPE_CLASS_EDEFAULT = TypeClass.REGULAR;

	/**
	 * The cached value of the '{@link #getTipeClass() <em>Tipe Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipeClass()
	 * @generated
	 * @ordered
	 */
	protected TypeClass tipeClass = TIPE_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getLstMethodConcreteAdj() <em>Lst Method Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMethodConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConcreteAdj> lstMethodConcreteAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassConcreteAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.CLASS_CONCRETE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.CLASS_CONCRETE_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.CLASS_CONCRETE_ADJ__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifierClass getAccesModifierClass() {
		return accesModifierClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesModifierClass(AccessModifierClass newAccesModifierClass) {
		AccessModifierClass oldAccesModifierClass = accesModifierClass;
		accesModifierClass = newAccesModifierClass == null ? ACCES_MODIFIER_CLASS_EDEFAULT : newAccesModifierClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.CLASS_CONCRETE_ADJ__ACCES_MODIFIER_CLASS, oldAccesModifierClass, accesModifierClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeClass getTipeClass() {
		return tipeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipeClass(TypeClass newTipeClass) {
		TypeClass oldTipeClass = tipeClass;
		tipeClass = newTipeClass == null ? TIPE_CLASS_EDEFAULT : newTipeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.CLASS_CONCRETE_ADJ__TIPE_CLASS, oldTipeClass, tipeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConcreteAdj> getLstAttributeConcreteAdj() {
		if (lstAttributeConcreteAdj == null) {
			lstAttributeConcreteAdj = new EObjectContainmentEList<AttributeConcreteAdj>(AttributeConcreteAdj.class, this, ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ);
		}
		return lstAttributeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConcreteAdj> getLstMethodConcreteAdj() {
		if (lstMethodConcreteAdj == null) {
			lstMethodConcreteAdj = new EObjectContainmentEList<MethodConcreteAdj>(MethodConcreteAdj.class, this, ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ);
		}
		return lstMethodConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstAttributeConcreteAdj()).basicRemove(otherEnd, msgs);
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstMethodConcreteAdj()).basicRemove(otherEnd, msgs);
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
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__PATH:
				return getPath();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__ACCES_MODIFIER_CLASS:
				return getAccesModifierClass();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__TIPE_CLASS:
				return getTipeClass();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return getLstAttributeConcreteAdj();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ:
				return getLstMethodConcreteAdj();
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
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__PATH:
				setPath((String)newValue);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__ACCES_MODIFIER_CLASS:
				setAccesModifierClass((AccessModifierClass)newValue);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__TIPE_CLASS:
				setTipeClass((TypeClass)newValue);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				getLstAttributeConcreteAdj().clear();
				getLstAttributeConcreteAdj().addAll((Collection<? extends AttributeConcreteAdj>)newValue);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ:
				getLstMethodConcreteAdj().clear();
				getLstMethodConcreteAdj().addAll((Collection<? extends MethodConcreteAdj>)newValue);
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
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__ACCES_MODIFIER_CLASS:
				setAccesModifierClass(ACCES_MODIFIER_CLASS_EDEFAULT);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__TIPE_CLASS:
				setTipeClass(TIPE_CLASS_EDEFAULT);
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				getLstAttributeConcreteAdj().clear();
				return;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ:
				getLstMethodConcreteAdj().clear();
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
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__ACCES_MODIFIER_CLASS:
				return accesModifierClass != ACCES_MODIFIER_CLASS_EDEFAULT;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__TIPE_CLASS:
				return tipeClass != TIPE_CLASS_EDEFAULT;
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_ATTRIBUTE_CONCRETE_ADJ:
				return lstAttributeConcreteAdj != null && !lstAttributeConcreteAdj.isEmpty();
			case ConcretemodelPackage.CLASS_CONCRETE_ADJ__LST_METHOD_CONCRETE_ADJ:
				return lstMethodConcreteAdj != null && !lstMethodConcreteAdj.isEmpty();
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
		result.append(", path: ");
		result.append(path);
		result.append(", accesModifierClass: ");
		result.append(accesModifierClass);
		result.append(", tipeClass: ");
		result.append(tipeClass);
		result.append(')');
		return result.toString();
	}

} //ClassConcreteAdjImpl
