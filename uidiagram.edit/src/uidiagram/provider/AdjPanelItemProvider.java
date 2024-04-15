/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.AdjPanel;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;

/**
 * This is the item provider adapter for a {@link uidiagram.AdjPanel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjPanelItemProvider extends AdjWidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjPanelItemProvider(AdapterFactory adapterFactory) {
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

			addFontPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdjPanel_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdjPanel_font_feature", "_UI_AdjPanel_type"),
				 UidiagramPackage.Literals.ADJ_PANEL__FONT,
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
			childrenFeatures.add(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET);
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
	 * This returns AdjPanel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdjPanel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AdjPanel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AdjPanel_type") :
			getString("_UI_AdjPanel_type") + " " + label;
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

		switch (notification.getFeatureID(AdjPanel.class)) {
			case UidiagramPackage.ADJ_PANEL__FONT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagramPackage.ADJ_PANEL__LST_ADJ_WIDGET:
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
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjListBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjDateTimePicker()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjTextBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjCheckedListBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjLinkLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjRichTextBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjPictureBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjListView()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjPanel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.ADJ_PANEL__LST_ADJ_WIDGET,
				 UidiagramFactory.eINSTANCE.createAdjGroupBox()));
	}

}
