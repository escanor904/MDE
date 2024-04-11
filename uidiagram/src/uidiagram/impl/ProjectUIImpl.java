/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.ProjectUI;
import uidiagram.UIDiagram;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.ProjectUIImpl#getLstDiagramUI <em>Lst Diagram UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectUIImpl extends EObjectImpl implements ProjectUI {
	/**
	 * The cached value of the '{@link #getLstDiagramUI() <em>Lst Diagram UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDiagramUI()
	 * @generated
	 * @ordered
	 */
	protected EList<UIDiagram> lstDiagramUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.PROJECT_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIDiagram> getLstDiagramUI() {
		if (lstDiagramUI == null) {
			lstDiagramUI = new EObjectContainmentEList<UIDiagram>(UIDiagram.class, this, UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI);
		}
		return lstDiagramUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI:
				return ((InternalEList<?>)getLstDiagramUI()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI:
				return getLstDiagramUI();
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
			case UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI:
				getLstDiagramUI().clear();
				getLstDiagramUI().addAll((Collection<? extends UIDiagram>)newValue);
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
			case UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI:
				getLstDiagramUI().clear();
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
			case UidiagramPackage.PROJECT_UI__LST_DIAGRAM_UI:
				return lstDiagramUI != null && !lstDiagramUI.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectUIImpl
