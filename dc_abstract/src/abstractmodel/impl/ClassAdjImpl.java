/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeAdj;
import abstractmodel.ClassAdj;
import abstractmodel.MethodAdj;
import abstractmodel.RelationshipAdj;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getAccesModifierClass <em>Acces Modifier Class</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getLstAttributeAdj <em>Lst Attribute Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getLstMethodAdj <em>Lst Method Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getLstRelationShipAdj <em>Lst Relation Ship Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.ClassAdjImpl#getLstInputRelationshipAdj <em>Lst Input Relationship Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassAdjImpl extends EObjectImpl implements ClassAdj {
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
	 * The default value of the '{@link #getPathPackage() <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPackage() <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPackage()
	 * @generated
	 * @ordered
	 */
	protected String pathPackage = PATH_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected String classType = CLASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesModifierClass() <em>Acces Modifier Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifierClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCES_MODIFIER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccesModifierClass() <em>Acces Modifier Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModifierClass()
	 * @generated
	 * @ordered
	 */
	protected String accesModifierClass = ACCES_MODIFIER_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getLstMethodAdj() <em>Lst Method Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMethodAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodAdj> lstMethodAdj;

	/**
	 * The cached value of the '{@link #getLstRelationShipAdj() <em>Lst Relation Ship Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelationShipAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipAdj> lstRelationShipAdj;

	/**
	 * The cached value of the '{@link #getLstInputRelationshipAdj() <em>Lst Input Relationship Adj</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstInputRelationshipAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipAdj> lstInputRelationshipAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.CLASS_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.CLASS_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathPackage() {
		return pathPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPackage(String newPathPackage) {
		String oldPathPackage = pathPackage;
		pathPackage = newPathPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE, oldPathPackage, pathPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassType(String newClassType) {
		String oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.CLASS_ADJ__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccesModifierClass() {
		return accesModifierClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesModifierClass(String newAccesModifierClass) {
		String oldAccesModifierClass = accesModifierClass;
		accesModifierClass = newAccesModifierClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.CLASS_ADJ__ACCES_MODIFIER_CLASS, oldAccesModifierClass, accesModifierClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAdj> getLstAttributeAdj() {
		if (lstAttributeAdj == null) {
			lstAttributeAdj = new EObjectContainmentEList<AttributeAdj>(AttributeAdj.class, this, AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ);
		}
		return lstAttributeAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodAdj> getLstMethodAdj() {
		if (lstMethodAdj == null) {
			lstMethodAdj = new EObjectContainmentEList<MethodAdj>(MethodAdj.class, this, AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ);
		}
		return lstMethodAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipAdj> getLstRelationShipAdj() {
		if (lstRelationShipAdj == null) {
			lstRelationShipAdj = new EObjectContainmentEList<RelationshipAdj>(RelationshipAdj.class, this, AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ);
		}
		return lstRelationShipAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipAdj> getLstInputRelationshipAdj() {
		if (lstInputRelationshipAdj == null) {
			lstInputRelationshipAdj = new EObjectResolvingEList<RelationshipAdj>(RelationshipAdj.class, this, AbstractmodelPackage.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ);
		}
		return lstInputRelationshipAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
				return ((InternalEList<?>)getLstAttributeAdj()).basicRemove(otherEnd, msgs);
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
				return ((InternalEList<?>)getLstMethodAdj()).basicRemove(otherEnd, msgs);
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
				return ((InternalEList<?>)getLstRelationShipAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.CLASS_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE:
				return getPathPackage();
			case AbstractmodelPackage.CLASS_ADJ__CLASS_TYPE:
				return getClassType();
			case AbstractmodelPackage.CLASS_ADJ__ACCES_MODIFIER_CLASS:
				return getAccesModifierClass();
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
				return getLstAttributeAdj();
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
				return getLstMethodAdj();
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
				return getLstRelationShipAdj();
			case AbstractmodelPackage.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ:
				return getLstInputRelationshipAdj();
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
			case AbstractmodelPackage.CLASS_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE:
				setPathPackage((String)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__CLASS_TYPE:
				setClassType((String)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__ACCES_MODIFIER_CLASS:
				setAccesModifierClass((String)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
				getLstAttributeAdj().clear();
				getLstAttributeAdj().addAll((Collection<? extends AttributeAdj>)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
				getLstMethodAdj().clear();
				getLstMethodAdj().addAll((Collection<? extends MethodAdj>)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
				getLstRelationShipAdj().clear();
				getLstRelationShipAdj().addAll((Collection<? extends RelationshipAdj>)newValue);
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ:
				getLstInputRelationshipAdj().clear();
				getLstInputRelationshipAdj().addAll((Collection<? extends RelationshipAdj>)newValue);
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
			case AbstractmodelPackage.CLASS_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE:
				setPathPackage(PATH_PACKAGE_EDEFAULT);
				return;
			case AbstractmodelPackage.CLASS_ADJ__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
				return;
			case AbstractmodelPackage.CLASS_ADJ__ACCES_MODIFIER_CLASS:
				setAccesModifierClass(ACCES_MODIFIER_CLASS_EDEFAULT);
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
				getLstAttributeAdj().clear();
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
				getLstMethodAdj().clear();
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
				getLstRelationShipAdj().clear();
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ:
				getLstInputRelationshipAdj().clear();
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
			case AbstractmodelPackage.CLASS_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE:
				return PATH_PACKAGE_EDEFAULT == null ? pathPackage != null : !PATH_PACKAGE_EDEFAULT.equals(pathPackage);
			case AbstractmodelPackage.CLASS_ADJ__CLASS_TYPE:
				return CLASS_TYPE_EDEFAULT == null ? classType != null : !CLASS_TYPE_EDEFAULT.equals(classType);
			case AbstractmodelPackage.CLASS_ADJ__ACCES_MODIFIER_CLASS:
				return ACCES_MODIFIER_CLASS_EDEFAULT == null ? accesModifierClass != null : !ACCES_MODIFIER_CLASS_EDEFAULT.equals(accesModifierClass);
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
				return lstAttributeAdj != null && !lstAttributeAdj.isEmpty();
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
				return lstMethodAdj != null && !lstMethodAdj.isEmpty();
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
				return lstRelationShipAdj != null && !lstRelationShipAdj.isEmpty();
			case AbstractmodelPackage.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ:
				return lstInputRelationshipAdj != null && !lstInputRelationshipAdj.isEmpty();
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
		result.append(", pathPackage: ");
		result.append(pathPackage);
		result.append(", classType: ");
		result.append(classType);
		result.append(", accesModifierClass: ");
		result.append(accesModifierClass);
		result.append(')');
		return result.toString();
	}

} //ClassAdjImpl
