/*
* 
*/
package concretemodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concretemodel.AssociationAdj;
import concretemodel.AttributeConcreteAdj;
import concretemodel.ClassConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.ContainmentSdj;
import concretemodel.GeneralizationAdj;
import concretemodel.MethodConcreteAdj;
import concretemodel.PackageConcreteAdj;
import concretemodel.SharingAdj;
import concretemodel.diagram.edit.parts.AssociationAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.SharingAdjEditPart;
import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ConcretemodelDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return getClassDiagramAdj_1000SemanticChildren(view);
		case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
			return getClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartment_7001SemanticChildren(view);
		case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
			return getClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelNodeDescriptor> getClassDiagramAdj_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClassDiagramAdj modelElement = (ClassDiagramAdj) view.getElement();
		LinkedList<ConcretemodelNodeDescriptor> result = new LinkedList<ConcretemodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstPackageConcreteAdj().iterator(); it.hasNext();) {
			PackageConcreteAdj childElement = (PackageConcreteAdj) it.next();
			int visualID = ConcretemodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageConcreteAdjEditPart.VISUAL_ID) {
				result.add(new ConcretemodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLstClassConcreteAdj().iterator(); it.hasNext();) {
			ClassConcreteAdj childElement = (ClassConcreteAdj) it.next();
			int visualID = ConcretemodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassConcreteAdjEditPart.VISUAL_ID) {
				result.add(new ConcretemodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelNodeDescriptor> getClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassConcreteAdj modelElement = (ClassConcreteAdj) containerView.getElement();
		LinkedList<ConcretemodelNodeDescriptor> result = new LinkedList<ConcretemodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAttributeConcreteAdj().iterator(); it.hasNext();) {
			AttributeConcreteAdj childElement = (AttributeConcreteAdj) it.next();
			int visualID = ConcretemodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeConcreteAdjEditPart.VISUAL_ID) {
				result.add(new ConcretemodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelNodeDescriptor> getClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassConcreteAdj modelElement = (ClassConcreteAdj) containerView.getElement();
		LinkedList<ConcretemodelNodeDescriptor> result = new LinkedList<ConcretemodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMethodConcreteAdj().iterator(); it.hasNext();) {
			MethodConcreteAdj childElement = (MethodConcreteAdj) it.next();
			int visualID = ConcretemodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodConcreteAdjEditPart.VISUAL_ID) {
				result.add(new ConcretemodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return getClassDiagramAdj_1000ContainedLinks(view);
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return getPackageConcreteAdj_2001ContainedLinks(view);
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return getClassConcreteAdj_2002ContainedLinks(view);
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return getAttributeConcreteAdj_3001ContainedLinks(view);
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return getMethodConcreteAdj_3002ContainedLinks(view);
		case ContainmentSdjEditPart.VISUAL_ID:
			return getContainmentSdj_4001ContainedLinks(view);
		case SharingAdjEditPart.VISUAL_ID:
			return getSharingAdj_4002ContainedLinks(view);
		case AssociationAdjEditPart.VISUAL_ID:
			return getAssociationAdj_4003ContainedLinks(view);
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getGeneralizationAdj_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return getPackageConcreteAdj_2001IncomingLinks(view);
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return getClassConcreteAdj_2002IncomingLinks(view);
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return getAttributeConcreteAdj_3001IncomingLinks(view);
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return getMethodConcreteAdj_3002IncomingLinks(view);
		case ContainmentSdjEditPart.VISUAL_ID:
			return getContainmentSdj_4001IncomingLinks(view);
		case SharingAdjEditPart.VISUAL_ID:
			return getSharingAdj_4002IncomingLinks(view);
		case AssociationAdjEditPart.VISUAL_ID:
			return getAssociationAdj_4003IncomingLinks(view);
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getGeneralizationAdj_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretemodelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return getPackageConcreteAdj_2001OutgoingLinks(view);
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return getClassConcreteAdj_2002OutgoingLinks(view);
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return getAttributeConcreteAdj_3001OutgoingLinks(view);
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return getMethodConcreteAdj_3002OutgoingLinks(view);
		case ContainmentSdjEditPart.VISUAL_ID:
			return getContainmentSdj_4001OutgoingLinks(view);
		case SharingAdjEditPart.VISUAL_ID:
			return getSharingAdj_4002OutgoingLinks(view);
		case AssociationAdjEditPart.VISUAL_ID:
			return getAssociationAdj_4003OutgoingLinks(view);
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getGeneralizationAdj_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getClassDiagramAdj_1000ContainedLinks(View view) {
		ClassDiagramAdj modelElement = (ClassDiagramAdj) view.getElement();
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ContainmentSdj_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SharingAdj_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationAdj_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationAdj_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getPackageConcreteAdj_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getClassConcreteAdj_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAttributeConcreteAdj_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getMethodConcreteAdj_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getContainmentSdj_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getSharingAdj_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAssociationAdj_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getGeneralizationAdj_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getPackageConcreteAdj_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getClassConcreteAdj_2002IncomingLinks(View view) {
		ClassConcreteAdj modelElement = (ClassConcreteAdj) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentSdj_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SharingAdj_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationAdj_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GeneralizationAdj_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAttributeConcreteAdj_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getMethodConcreteAdj_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getContainmentSdj_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getSharingAdj_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAssociationAdj_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getGeneralizationAdj_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getPackageConcreteAdj_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getClassConcreteAdj_2002OutgoingLinks(View view) {
		ClassConcreteAdj modelElement = (ClassConcreteAdj) view.getElement();
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ContainmentSdj_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SharingAdj_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssociationAdj_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GeneralizationAdj_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAttributeConcreteAdj_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getMethodConcreteAdj_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getContainmentSdj_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getSharingAdj_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getAssociationAdj_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretemodelLinkDescriptor> getGeneralizationAdj_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getContainedTypeModelFacetLinks_ContainmentSdj_4001(
			ClassDiagramAdj container) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentSdj) {
				continue;
			}
			ContainmentSdj link = (ContainmentSdj) linkObject;
			if (ContainmentSdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.ContainmentSdj_4001,
					ContainmentSdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getContainedTypeModelFacetLinks_SharingAdj_4002(
			ClassDiagramAdj container) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SharingAdj) {
				continue;
			}
			SharingAdj link = (SharingAdj) linkObject;
			if (SharingAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.SharingAdj_4002,
					SharingAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getContainedTypeModelFacetLinks_AssociationAdj_4003(
			ClassDiagramAdj container) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationAdj) {
				continue;
			}
			AssociationAdj link = (AssociationAdj) linkObject;
			if (AssociationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.AssociationAdj_4003,
					AssociationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getContainedTypeModelFacetLinks_GeneralizationAdj_4004(
			ClassDiagramAdj container) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GeneralizationAdj) {
				continue;
			}
			GeneralizationAdj link = (GeneralizationAdj) linkObject;
			if (GeneralizationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.GeneralizationAdj_4004,
					GeneralizationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretemodelLinkDescriptor> getIncomingTypeModelFacetLinks_ContainmentSdj_4001(
			ClassConcreteAdj target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretemodelPackage.eINSTANCE.getRelationshipAdj_ClassTarget()
					|| false == setting.getEObject() instanceof ContainmentSdj) {
				continue;
			}
			ContainmentSdj link = (ContainmentSdj) setting.getEObject();
			if (ContainmentSdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, target, link, ConcretemodelElementTypes.ContainmentSdj_4001,
					ContainmentSdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretemodelLinkDescriptor> getIncomingTypeModelFacetLinks_SharingAdj_4002(
			ClassConcreteAdj target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretemodelPackage.eINSTANCE.getRelationshipAdj_ClassTarget()
					|| false == setting.getEObject() instanceof SharingAdj) {
				continue;
			}
			SharingAdj link = (SharingAdj) setting.getEObject();
			if (SharingAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, target, link, ConcretemodelElementTypes.SharingAdj_4002,
					SharingAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretemodelLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationAdj_4003(
			ClassConcreteAdj target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretemodelPackage.eINSTANCE.getRelationshipAdj_ClassTarget()
					|| false == setting.getEObject() instanceof AssociationAdj) {
				continue;
			}
			AssociationAdj link = (AssociationAdj) setting.getEObject();
			if (AssociationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, target, link, ConcretemodelElementTypes.AssociationAdj_4003,
					AssociationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretemodelLinkDescriptor> getIncomingTypeModelFacetLinks_GeneralizationAdj_4004(
			ClassConcreteAdj target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretemodelPackage.eINSTANCE.getRelationshipAdj_ClassTarget()
					|| false == setting.getEObject() instanceof GeneralizationAdj) {
				continue;
			}
			GeneralizationAdj link = (GeneralizationAdj) setting.getEObject();
			if (GeneralizationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj src = link.getClassSource();
			result.add(new ConcretemodelLinkDescriptor(src, target, link,
					ConcretemodelElementTypes.GeneralizationAdj_4004, GeneralizationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainmentSdj_4001(
			ClassConcreteAdj source) {
		ClassDiagramAdj container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramAdj) {
				container = (ClassDiagramAdj) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentSdj) {
				continue;
			}
			ContainmentSdj link = (ContainmentSdj) linkObject;
			if (ContainmentSdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.ContainmentSdj_4001,
					ContainmentSdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getOutgoingTypeModelFacetLinks_SharingAdj_4002(
			ClassConcreteAdj source) {
		ClassDiagramAdj container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramAdj) {
				container = (ClassDiagramAdj) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SharingAdj) {
				continue;
			}
			SharingAdj link = (SharingAdj) linkObject;
			if (SharingAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.SharingAdj_4002,
					SharingAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getOutgoingTypeModelFacetLinks_AssociationAdj_4003(
			ClassConcreteAdj source) {
		ClassDiagramAdj container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramAdj) {
				container = (ClassDiagramAdj) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationAdj) {
				continue;
			}
			AssociationAdj link = (AssociationAdj) linkObject;
			if (AssociationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.AssociationAdj_4003,
					AssociationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretemodelLinkDescriptor> getOutgoingTypeModelFacetLinks_GeneralizationAdj_4004(
			ClassConcreteAdj source) {
		ClassDiagramAdj container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramAdj) {
				container = (ClassDiagramAdj) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretemodelLinkDescriptor> result = new LinkedList<ConcretemodelLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GeneralizationAdj) {
				continue;
			}
			GeneralizationAdj link = (GeneralizationAdj) linkObject;
			if (GeneralizationAdjEditPart.VISUAL_ID != ConcretemodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassConcreteAdj dst = link.getClassTarget();
			ClassConcreteAdj src = link.getClassSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretemodelLinkDescriptor(src, dst, link, ConcretemodelElementTypes.GeneralizationAdj_4004,
					GeneralizationAdjEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcretemodelNodeDescriptor> getSemanticChildren(View view) {
			return ConcretemodelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretemodelLinkDescriptor> getContainedLinks(View view) {
			return ConcretemodelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretemodelLinkDescriptor> getIncomingLinks(View view) {
			return ConcretemodelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretemodelLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretemodelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
