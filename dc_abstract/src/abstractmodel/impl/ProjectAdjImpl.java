/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeTypeFactoryAdj;
import abstractmodel.ClassTypeFactoryAdj;
import abstractmodel.PackageAdj;
import abstractmodel.ProjectAdj;

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
 * An implementation of the model object '<em><b>Project Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.ProjectAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.ProjectAdjImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractmodel.impl.ProjectAdjImpl#getClassTypeFactoryAdj <em>Class Type Factory Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.ProjectAdjImpl#getAttributeTypeFactoryAdj <em>Attribute Type Factory Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.ProjectAdjImpl#getLstPackageAdj <em>Lst Package Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectAdjImpl extends EObjectImpl implements ProjectAdj {
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
	 * The cached value of the '{@link #getClassTypeFactoryAdj() <em>Class Type Factory Adj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTypeFactoryAdj()
	 * @generated
	 * @ordered
	 */
	protected ClassTypeFactoryAdj classTypeFactoryAdj;

	/**
	 * The cached value of the '{@link #getAttributeTypeFactoryAdj() <em>Attribute Type Factory Adj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeFactoryAdj()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypeFactoryAdj attributeTypeFactoryAdj;

	/**
	 * The cached value of the '{@link #getLstPackageAdj() <em>Lst Package Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackageAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAdj> lstPackageAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.PROJECT_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTypeFactoryAdj getClassTypeFactoryAdj() {
		return classTypeFactoryAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassTypeFactoryAdj(ClassTypeFactoryAdj newClassTypeFactoryAdj, NotificationChain msgs) {
		ClassTypeFactoryAdj oldClassTypeFactoryAdj = classTypeFactoryAdj;
		classTypeFactoryAdj = newClassTypeFactoryAdj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ, oldClassTypeFactoryAdj, newClassTypeFactoryAdj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassTypeFactoryAdj(ClassTypeFactoryAdj newClassTypeFactoryAdj) {
		if (newClassTypeFactoryAdj != classTypeFactoryAdj) {
			NotificationChain msgs = null;
			if (classTypeFactoryAdj != null)
				msgs = ((InternalEObject)classTypeFactoryAdj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ, null, msgs);
			if (newClassTypeFactoryAdj != null)
				msgs = ((InternalEObject)newClassTypeFactoryAdj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ, null, msgs);
			msgs = basicSetClassTypeFactoryAdj(newClassTypeFactoryAdj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ, newClassTypeFactoryAdj, newClassTypeFactoryAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeFactoryAdj getAttributeTypeFactoryAdj() {
		return attributeTypeFactoryAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeTypeFactoryAdj(AttributeTypeFactoryAdj newAttributeTypeFactoryAdj, NotificationChain msgs) {
		AttributeTypeFactoryAdj oldAttributeTypeFactoryAdj = attributeTypeFactoryAdj;
		attributeTypeFactoryAdj = newAttributeTypeFactoryAdj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ, oldAttributeTypeFactoryAdj, newAttributeTypeFactoryAdj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeTypeFactoryAdj(AttributeTypeFactoryAdj newAttributeTypeFactoryAdj) {
		if (newAttributeTypeFactoryAdj != attributeTypeFactoryAdj) {
			NotificationChain msgs = null;
			if (attributeTypeFactoryAdj != null)
				msgs = ((InternalEObject)attributeTypeFactoryAdj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ, null, msgs);
			if (newAttributeTypeFactoryAdj != null)
				msgs = ((InternalEObject)newAttributeTypeFactoryAdj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ, null, msgs);
			msgs = basicSetAttributeTypeFactoryAdj(newAttributeTypeFactoryAdj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ, newAttributeTypeFactoryAdj, newAttributeTypeFactoryAdj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageAdj> getLstPackageAdj() {
		if (lstPackageAdj == null) {
			lstPackageAdj = new EObjectContainmentEList<PackageAdj>(PackageAdj.class, this, AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ);
		}
		return lstPackageAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ:
				return basicSetClassTypeFactoryAdj(null, msgs);
			case AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ:
				return basicSetAttributeTypeFactoryAdj(null, msgs);
			case AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ:
				return ((InternalEList<?>)getLstPackageAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.PROJECT_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.PROJECT_ADJ__PATH:
				return getPath();
			case AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ:
				return getClassTypeFactoryAdj();
			case AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ:
				return getAttributeTypeFactoryAdj();
			case AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ:
				return getLstPackageAdj();
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
			case AbstractmodelPackage.PROJECT_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__PATH:
				setPath((String)newValue);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ:
				setClassTypeFactoryAdj((ClassTypeFactoryAdj)newValue);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ:
				setAttributeTypeFactoryAdj((AttributeTypeFactoryAdj)newValue);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ:
				getLstPackageAdj().clear();
				getLstPackageAdj().addAll((Collection<? extends PackageAdj>)newValue);
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
			case AbstractmodelPackage.PROJECT_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ:
				setClassTypeFactoryAdj((ClassTypeFactoryAdj)null);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ:
				setAttributeTypeFactoryAdj((AttributeTypeFactoryAdj)null);
				return;
			case AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ:
				getLstPackageAdj().clear();
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
			case AbstractmodelPackage.PROJECT_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.PROJECT_ADJ__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractmodelPackage.PROJECT_ADJ__CLASS_TYPE_FACTORY_ADJ:
				return classTypeFactoryAdj != null;
			case AbstractmodelPackage.PROJECT_ADJ__ATTRIBUTE_TYPE_FACTORY_ADJ:
				return attributeTypeFactoryAdj != null;
			case AbstractmodelPackage.PROJECT_ADJ__LST_PACKAGE_ADJ:
				return lstPackageAdj != null && !lstPackageAdj.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProjectAdjImpl
