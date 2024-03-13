/**
 */
package abstractmodel.provider;


import abstractmodel.AbstractmodelFactory;
import abstractmodel.AbstractmodelPackage;
import abstractmodel.ClassAdj;

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
 * This is the item provider adapter for a {@link abstractmodel.ClassAdj} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassAdjItemProvider 
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
	public ClassAdjItemProvider(AdapterFactory adapterFactory) {
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
			addPathPackagePropertyDescriptor(object);
			addClassTypeAdjPropertyDescriptor(object);
			addLstInputRelationshipAdjPropertyDescriptor(object);
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
				 getString("_UI_ClassAdj_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAdj_name_feature", "_UI_ClassAdj_type"),
				 AbstractmodelPackage.Literals.CLASS_ADJ__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAdj_pathPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAdj_pathPackage_feature", "_UI_ClassAdj_type"),
				 AbstractmodelPackage.Literals.CLASS_ADJ__PATH_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class Type Adj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassTypeAdjPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAdj_classTypeAdj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAdj_classTypeAdj_feature", "_UI_ClassAdj_type"),
				 AbstractmodelPackage.Literals.CLASS_ADJ__CLASS_TYPE_ADJ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lst Input Relationship Adj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLstInputRelationshipAdjPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAdj_lstInputRelationshipAdj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAdj_lstInputRelationshipAdj_feature", "_UI_ClassAdj_type"),
				 AbstractmodelPackage.Literals.CLASS_ADJ__LST_INPUT_RELATIONSHIP_ADJ,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(AbstractmodelPackage.Literals.CLASS_ADJ__LST_ATTRIBUTE_ADJ);
			childrenFeatures.add(AbstractmodelPackage.Literals.CLASS_ADJ__LST_METHOD_ADJ);
			childrenFeatures.add(AbstractmodelPackage.Literals.CLASS_ADJ__LST_RELATION_SHIP_ADJ);
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
	 * This returns ClassAdj.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassAdj"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassAdj)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassAdj_type") :
			getString("_UI_ClassAdj_type") + " " + label;
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

		switch (notification.getFeatureID(ClassAdj.class)) {
			case AbstractmodelPackage.CLASS_ADJ__NAME:
			case AbstractmodelPackage.CLASS_ADJ__PATH_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractmodelPackage.CLASS_ADJ__LST_ATTRIBUTE_ADJ:
			case AbstractmodelPackage.CLASS_ADJ__LST_METHOD_ADJ:
			case AbstractmodelPackage.CLASS_ADJ__LST_RELATION_SHIP_ADJ:
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
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_ATTRIBUTE_ADJ,
				 AbstractmodelFactory.eINSTANCE.createAttributeAdj()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_METHOD_ADJ,
				 AbstractmodelFactory.eINSTANCE.createMethodAdj()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_RELATION_SHIP_ADJ,
				 AbstractmodelFactory.eINSTANCE.createContainmentAdj()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_RELATION_SHIP_ADJ,
				 AbstractmodelFactory.eINSTANCE.createSharingAdj()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_RELATION_SHIP_ADJ,
				 AbstractmodelFactory.eINSTANCE.createAssociationAdj()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractmodelPackage.Literals.CLASS_ADJ__LST_RELATION_SHIP_ADJ,
				 AbstractmodelFactory.eINSTANCE.createGeneralizationAdj()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractmodelEditPlugin.INSTANCE;
	}

}
