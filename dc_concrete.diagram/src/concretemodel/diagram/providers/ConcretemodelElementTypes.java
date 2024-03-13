/*
 * 
 */
package concretemodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concretemodel.ConcretemodelPackage;
import concretemodel.diagram.edit.parts.AssociationAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.SharingAdjEditPart;
import concretemodel.diagram.part.ConcretemodelDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcretemodelElementTypes {

	/**
	* @generated
	*/
	private ConcretemodelElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcretemodelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ClassDiagramAdj_1000 = getElementType("dc_concrete.diagram.ClassDiagramAdj_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PackageConcreteAdj_2001 = getElementType(
			"dc_concrete.diagram.PackageConcreteAdj_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClassConcreteAdj_2002 = getElementType(
			"dc_concrete.diagram.ClassConcreteAdj_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeConcreteAdj_3001 = getElementType(
			"dc_concrete.diagram.AttributeConcreteAdj_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodConcreteAdj_3002 = getElementType(
			"dc_concrete.diagram.MethodConcreteAdj_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainmentSdj_4001 = getElementType("dc_concrete.diagram.ContainmentSdj_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SharingAdj_4003 = getElementType("dc_concrete.diagram.SharingAdj_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssociationAdj_4005 = getElementType("dc_concrete.diagram.AssociationAdj_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeneralizationAdj_4007 = getElementType(
			"dc_concrete.diagram.GeneralizationAdj_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ClassDiagramAdj_1000, ConcretemodelPackage.eINSTANCE.getClassDiagramAdj());

			elements.put(PackageConcreteAdj_2001, ConcretemodelPackage.eINSTANCE.getPackageConcreteAdj());

			elements.put(ClassConcreteAdj_2002, ConcretemodelPackage.eINSTANCE.getClassConcreteAdj());

			elements.put(AttributeConcreteAdj_3001, ConcretemodelPackage.eINSTANCE.getAttributeConcreteAdj());

			elements.put(MethodConcreteAdj_3002, ConcretemodelPackage.eINSTANCE.getMethodConcreteAdj());

			elements.put(ContainmentSdj_4001, ConcretemodelPackage.eINSTANCE.getContainmentSdj());

			elements.put(SharingAdj_4003, ConcretemodelPackage.eINSTANCE.getSharingAdj());

			elements.put(AssociationAdj_4005, ConcretemodelPackage.eINSTANCE.getAssociationAdj());

			elements.put(GeneralizationAdj_4007, ConcretemodelPackage.eINSTANCE.getGeneralizationAdj());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ClassDiagramAdj_1000);
			KNOWN_ELEMENT_TYPES.add(PackageConcreteAdj_2001);
			KNOWN_ELEMENT_TYPES.add(ClassConcreteAdj_2002);
			KNOWN_ELEMENT_TYPES.add(AttributeConcreteAdj_3001);
			KNOWN_ELEMENT_TYPES.add(MethodConcreteAdj_3002);
			KNOWN_ELEMENT_TYPES.add(ContainmentSdj_4001);
			KNOWN_ELEMENT_TYPES.add(SharingAdj_4003);
			KNOWN_ELEMENT_TYPES.add(AssociationAdj_4005);
			KNOWN_ELEMENT_TYPES.add(GeneralizationAdj_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return ClassDiagramAdj_1000;
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return PackageConcreteAdj_2001;
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return ClassConcreteAdj_2002;
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return AttributeConcreteAdj_3001;
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return MethodConcreteAdj_3002;
		case ContainmentSdjEditPart.VISUAL_ID:
			return ContainmentSdj_4001;
		case SharingAdjEditPart.VISUAL_ID:
			return SharingAdj_4003;
		case AssociationAdjEditPart.VISUAL_ID:
			return AssociationAdj_4005;
		case GeneralizationAdjEditPart.VISUAL_ID:
			return GeneralizationAdj_4007;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concretemodel.diagram.providers.ConcretemodelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concretemodel.diagram.providers.ConcretemodelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concretemodel.diagram.providers.ConcretemodelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
