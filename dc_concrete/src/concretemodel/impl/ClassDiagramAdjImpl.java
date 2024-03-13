/**
 */
package concretemodel.impl;

import concretemodel.ClassConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.PackageConcreteAdj;
import concretemodel.RelationshipAdj;

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
 * An implementation of the model object '<em><b>Class Diagram Adj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concretemodel.impl.ClassDiagramAdjImpl#getName <em>Name</em>}</li>
 *   <li>{@link concretemodel.impl.ClassDiagramAdjImpl#getLstPackageConcreteAdj <em>Lst Package Concrete Adj</em>}</li>
 *   <li>{@link concretemodel.impl.ClassDiagramAdjImpl#getLstRelationship <em>Lst Relationship</em>}</li>
 *   <li>{@link concretemodel.impl.ClassDiagramAdjImpl#getLstClassConcreteAdj <em>Lst Class Concrete Adj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramAdjImpl extends EObjectImpl implements ClassDiagramAdj {
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
	 * The cached value of the '{@link #getLstPackageConcreteAdj() <em>Lst Package Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackageConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageConcreteAdj> lstPackageConcreteAdj;

	/**
	 * The cached value of the '{@link #getLstRelationship() <em>Lst Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipAdj> lstRelationship;

	/**
	 * The cached value of the '{@link #getLstClassConcreteAdj() <em>Lst Class Concrete Adj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClassConcreteAdj()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassConcreteAdj> lstClassConcreteAdj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramAdjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageConcreteAdj> getLstPackageConcreteAdj() {
		if (lstPackageConcreteAdj == null) {
			lstPackageConcreteAdj = new EObjectContainmentEList<PackageConcreteAdj>(PackageConcreteAdj.class, this, ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ);
		}
		return lstPackageConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipAdj> getLstRelationship() {
		if (lstRelationship == null) {
			lstRelationship = new EObjectContainmentEList<RelationshipAdj>(RelationshipAdj.class, this, ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP);
		}
		return lstRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassConcreteAdj> getLstClassConcreteAdj() {
		if (lstClassConcreteAdj == null) {
			lstClassConcreteAdj = new EObjectContainmentEList<ClassConcreteAdj>(ClassConcreteAdj.class, this, ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ);
		}
		return lstClassConcreteAdj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstPackageConcreteAdj()).basicRemove(otherEnd, msgs);
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
				return ((InternalEList<?>)getLstRelationship()).basicRemove(otherEnd, msgs);
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				return ((InternalEList<?>)getLstClassConcreteAdj()).basicRemove(otherEnd, msgs);
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
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME:
				return getName();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
				return getLstPackageConcreteAdj();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
				return getLstRelationship();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				return getLstClassConcreteAdj();
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
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME:
				setName((String)newValue);
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
				getLstPackageConcreteAdj().clear();
				getLstPackageConcreteAdj().addAll((Collection<? extends PackageConcreteAdj>)newValue);
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
				getLstRelationship().clear();
				getLstRelationship().addAll((Collection<? extends RelationshipAdj>)newValue);
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				getLstClassConcreteAdj().clear();
				getLstClassConcreteAdj().addAll((Collection<? extends ClassConcreteAdj>)newValue);
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
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
				getLstPackageConcreteAdj().clear();
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
				getLstRelationship().clear();
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				getLstClassConcreteAdj().clear();
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
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
				return lstPackageConcreteAdj != null && !lstPackageConcreteAdj.isEmpty();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
				return lstRelationship != null && !lstRelationship.isEmpty();
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				return lstClassConcreteAdj != null && !lstClassConcreteAdj.isEmpty();
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

} //ClassDiagramAdjImpl
