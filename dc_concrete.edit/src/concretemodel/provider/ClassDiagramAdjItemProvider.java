/**
 */
package concretemodel.provider;


import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelFactory;
import concretemodel.ConcretemodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link concretemodel.ClassDiagramAdj} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramAdjItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramAdjItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassDiagramAdj_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassDiagramAdj_name_feature", "_UI_ClassDiagramAdj_type"),
				 ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ);
			childrenFeatures.add(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP);
			childrenFeatures.add(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ClassDiagramAdj.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassDiagramAdj"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassDiagramAdj)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassDiagramAdj_type") :
			getString("_UI_ClassDiagramAdj_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ClassDiagramAdj.class)) {
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ:
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP:
			case ConcretemodelPackage.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_PACKAGE_CONCRETE_ADJ,
				 ConcretemodelFactory.eINSTANCE.createPackageConcreteAdj()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP,
				 ConcretemodelFactory.eINSTANCE.createContainmentSdj()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP,
				 ConcretemodelFactory.eINSTANCE.createSharingAdj()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP,
				 ConcretemodelFactory.eINSTANCE.createAssociationAdj()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_RELATIONSHIP,
				 ConcretemodelFactory.eINSTANCE.createGeneralizationAdj()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretemodelPackage.Literals.CLASS_DIAGRAM_ADJ__LST_CLASS_CONCRETE_ADJ,
				 ConcretemodelFactory.eINSTANCE.createClassConcreteAdj()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConcretemodelEditPlugin.INSTANCE;
	}

}
