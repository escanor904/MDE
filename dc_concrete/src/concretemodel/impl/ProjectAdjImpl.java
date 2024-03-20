/**
 */
package concretemodel.impl;

import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.ProjectAdj;

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
 *   <li>{@link concretemodel.impl.ProjectAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.ProjectAdjImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concretemodel.impl.ProjectAdjImpl#getLstClassDiagramAdj <em>Lst Class Diagram Adj</em>}</li>
 *   <li>{@link concretemodel.impl.ProjectAdjImpl#getLstAttributeTypeConcreteAdj <em>Lst Attribute Type Concrete Adj</em>}</li>
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
	 * The cached value of the '{@link #getLstClassDiagramAdj() <em>Lst Class Diagram Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClassDiagramAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDiagramAdj> lstClassDiagramAdj;

	/**
	 * The cached value of the '{@link #getLstAttributeTypeConcreteAdj() <em>Lst Attribute Type Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributeTypeConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeTypeConcreteAdj> lstAttributeTypeConcreteAdj;

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
		return ConcretemodelPackage.Literals.PROJECT_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.PROJECT_ADJ__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.PROJECT_ADJ__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDiagramAdj> getLstClassDiagramAdj() {
		if (lstClassDiagramAdj == null) {
			lstClassDiagramAdj = new EObjectContainmentEList<ClassDiagramAdj>(ClassDiagramAdj.class, this, ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ);
		}
		return lstClassDiagramAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeTypeConcreteAdj> getLstAttributeTypeConcreteAdj() {
		if (lstAttributeTypeConcreteAdj == null) {
			lstAttributeTypeConcreteAdj = new EObjectContainmentEList<AttributeTypeConcreteAdj>(AttributeTypeConcreteAdj.class, this, ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ);
		}
		return lstAttributeTypeConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ:
				return ((InternalEList<?>)getLstClassDiagramAdj()).basicRemove(otherEnd, msgs);
			case ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstAttributeTypeConcreteAdj()).basicRemove(otherEnd, msgs);
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
			case ConcretemodelPackage.PROJECT_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.PROJECT_ADJ__PATH:
				return getPath();
			case ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ:
				return getLstClassDiagramAdj();
			case ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ:
				return getLstAttributeTypeConcreteAdj();
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
			case ConcretemodelPackage.PROJECT_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.PROJECT_ADJ__PATH:
				setPath((String)newValue);
				return;
			case ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ:
				getLstClassDiagramAdj().clear();
				getLstClassDiagramAdj().addAll((Collection<? extends ClassDiagramAdj>)newValue);
				return;
			case ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ:
				getLstAttributeTypeConcreteAdj().clear();
				getLstAttributeTypeConcreteAdj().addAll((Collection<? extends AttributeTypeConcreteAdj>)newValue);
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
			case ConcretemodelPackage.PROJECT_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.PROJECT_ADJ__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ:
				getLstClassDiagramAdj().clear();
				return;
			case ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ:
				getLstAttributeTypeConcreteAdj().clear();
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
			case ConcretemodelPackage.PROJECT_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.PROJECT_ADJ__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretemodelPackage.PROJECT_ADJ__LST_CLASS_DIAGRAM_ADJ:
				return lstClassDiagramAdj != null && !lstClassDiagramAdj.isEmpty();
			case ConcretemodelPackage.PROJECT_ADJ__LST_ATTRIBUTE_TYPE_CONCRETE_ADJ:
				return lstAttributeTypeConcreteAdj != null && !lstAttributeTypeConcreteAdj.isEmpty();
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
