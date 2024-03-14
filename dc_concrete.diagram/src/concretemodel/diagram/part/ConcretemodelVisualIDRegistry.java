/*
* 
*/
package concretemodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelPackage;
import concretemodel.diagram.edit.parts.AssociationAdjEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjMethodNameEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.SharingAdjEditPart;
import concretemodel.diagram.edit.parts.SharingAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.SharingAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.SharingAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.SharingAdjRoleTargetEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretemodelVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dc_concrete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ClassDiagramAdjEditPart.MODEL_ID.equals(view.getType())) {
				return ClassDiagramAdjEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcretemodelDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretemodelPackage.eINSTANCE.getClassDiagramAdj().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ClassDiagramAdj) domainElement)) {
			return ClassDiagramAdjEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramAdjEditPart.MODEL_ID.equals(containerModelID) && !"concretemodel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ClassDiagramAdjEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramAdjEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			if (ConcretemodelPackage.eINSTANCE.getPackageConcreteAdj().isSuperTypeOf(domainElement.eClass())) {
				return PackageConcreteAdjEditPart.VISUAL_ID;
			}
			if (ConcretemodelPackage.eINSTANCE.getClassConcreteAdj().isSuperTypeOf(domainElement.eClass())) {
				return ClassConcreteAdjEditPart.VISUAL_ID;
			}
			break;
		case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
			if (ConcretemodelPackage.eINSTANCE.getAttributeConcreteAdj().isSuperTypeOf(domainElement.eClass())) {
				return AttributeConcreteAdjEditPart.VISUAL_ID;
			}
			break;
		case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
			if (ConcretemodelPackage.eINSTANCE.getMethodConcreteAdj().isSuperTypeOf(domainElement.eClass())) {
				return MethodConcreteAdjEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramAdjEditPart.MODEL_ID.equals(containerModelID) && !"concretemodel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ClassDiagramAdjEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramAdjEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			if (PackageConcreteAdjEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassConcreteAdjEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageConcreteAdjEditPart.VISUAL_ID:
			if (PackageConcreteAdjNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassConcreteAdjEditPart.VISUAL_ID:
			if (ClassConcreteAdjNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			if (AttributeConcreteAdjNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodConcreteAdjEditPart.VISUAL_ID:
			if (MethodConcreteAdjMethodNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
			if (AttributeConcreteAdjEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
			if (MethodConcreteAdjEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainmentSdjEditPart.VISUAL_ID:
			if (ContainmentSdjRoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentSdjMultiplicitySourceClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentSdjRoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SharingAdjEditPart.VISUAL_ID:
			if (SharingAdjRoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SharingAdjMultiplicitySourceClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SharingAdjRoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SharingAdjMultiplicityTargetClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationAdjEditPart.VISUAL_ID:
			if (AssociationAdjRoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationAdjMultiplicitySourceClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationAdjRoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationAdjMultiplicityTargetClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretemodelPackage.eINSTANCE.getContainmentSdj().isSuperTypeOf(domainElement.eClass())) {
			return ContainmentSdjEditPart.VISUAL_ID;
		}
		if (ConcretemodelPackage.eINSTANCE.getSharingAdj().isSuperTypeOf(domainElement.eClass())) {
			return SharingAdjEditPart.VISUAL_ID;
		}
		if (ConcretemodelPackage.eINSTANCE.getAssociationAdj().isSuperTypeOf(domainElement.eClass())) {
			return AssociationAdjEditPart.VISUAL_ID;
		}
		if (ConcretemodelPackage.eINSTANCE.getGeneralizationAdj().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationAdjEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ClassDiagramAdj element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
		case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return false;
		case PackageConcreteAdjEditPart.VISUAL_ID:
		case AttributeConcreteAdjEditPart.VISUAL_ID:
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concretemodel.diagram.part.ConcretemodelVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
