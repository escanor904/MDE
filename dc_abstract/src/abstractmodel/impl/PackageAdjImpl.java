/**
 */
package abstractmodel.impl;

import abstractmodel.AbstractmodelPackage;
import abstractmodel.ClassAdj;
import abstractmodel.PackageAdj;

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
 * An implementation of the model object '<em><b>Package Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractmodel.impl.PackageAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractmodel.impl.PackageAdjImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractmodel.impl.PackageAdjImpl#getLstChildPackageAdj <em>Lst Child Package Adj</em>}</li>
 *   <li>{@link abstractmodel.impl.PackageAdjImpl#getLstClassAdj <em>Lst Class Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageAdjImpl extends EObjectImpl implements PackageAdj {
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
	 * The cached value of the '{@link #getLstChildPackageAdj() <em>Lst Child Package Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstChildPackageAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAdj> lstChildPackageAdj;

	/**
	 * The cached value of the '{@link #getLstClassAdj() <em>Lst Class Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClassAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAdj> lstClassAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractmodelPackage.Literals.PACKAGE_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PACKAGE_ADJ__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractmodelPackage.PACKAGE_ADJ__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageAdj> getLstChildPackageAdj() {
		if (lstChildPackageAdj == null) {
			lstChildPackageAdj = new EObjectContainmentEList<PackageAdj>(PackageAdj.class, this, AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ);
		}
		return lstChildPackageAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAdj> getLstClassAdj() {
		if (lstClassAdj == null) {
			lstClassAdj = new EObjectContainmentEList<ClassAdj>(ClassAdj.class, this, AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ);
		}
		return lstClassAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ:
				return ((InternalEList<?>)getLstChildPackageAdj()).basicRemove(otherEnd, msgs);
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ:
				return ((InternalEList<?>)getLstClassAdj()).basicRemove(otherEnd, msgs);
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
			case AbstractmodelPackage.PACKAGE_ADJ__NAME:
				return getName();
			case AbstractmodelPackage.PACKAGE_ADJ__PATH:
				return getPath();
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ:
				return getLstChildPackageAdj();
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ:
				return getLstClassAdj();
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
			case AbstractmodelPackage.PACKAGE_ADJ__NAME:
				setName((String)newValue);
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__PATH:
				setPath((String)newValue);
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ:
				getLstChildPackageAdj().clear();
				getLstChildPackageAdj().addAll((Collection<? extends PackageAdj>)newValue);
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ:
				getLstClassAdj().clear();
				getLstClassAdj().addAll((Collection<? extends ClassAdj>)newValue);
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
			case AbstractmodelPackage.PACKAGE_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ:
				getLstChildPackageAdj().clear();
				return;
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ:
				getLstClassAdj().clear();
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
			case AbstractmodelPackage.PACKAGE_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractmodelPackage.PACKAGE_ADJ__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CHILD_PACKAGE_ADJ:
				return lstChildPackageAdj != null && !lstChildPackageAdj.isEmpty();
			case AbstractmodelPackage.PACKAGE_ADJ__LST_CLASS_ADJ:
				return lstClassAdj != null && !lstClassAdj.isEmpty();
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

} //PackageAdjImpl
