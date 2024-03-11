/*
 * 
 */
package concretemodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;

/**
 * @generated
 */
public class ConcretemodelEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {

			case ClassDiagramAdjEditPart.VISUAL_ID:
				return new ClassDiagramAdjEditPart(view);

			case PackageConcreteAdjEditPart.VISUAL_ID:
				return new PackageConcreteAdjEditPart(view);

			case PackageConcreteAdjNameEditPart.VISUAL_ID:
				return new PackageConcreteAdjNameEditPart(view);

			case ClassConcreteAdjEditPart.VISUAL_ID:
				return new ClassConcreteAdjEditPart(view);

			case ClassConcreteAdjNameEditPart.VISUAL_ID:
				return new ClassConcreteAdjNameEditPart(view);

			case AttributeConcreteAdjEditPart.VISUAL_ID:
				return new AttributeConcreteAdjEditPart(view);

			case AttributeConcreteAdjNameEditPart.VISUAL_ID:
				return new AttributeConcreteAdjNameEditPart(view);

			case MethodConcreteAdjEditPart.VISUAL_ID:
				return new MethodConcreteAdjEditPart(view);

			case MethodConcreteAdjMethodNameEditPart.VISUAL_ID:
				return new MethodConcreteAdjMethodNameEditPart(view);

			case ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart.VISUAL_ID:
				return new ClassConcreteAdjClassConcreteAdjLstAttributeConcreteAdjCompartmentEditPart(view);

			case ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart.VISUAL_ID:
				return new ClassConcreteAdjClassConcreteAdjLstMethodConcreteAdjCompartmentEditPart(view);

			case ContainmentSdjEditPart.VISUAL_ID:
				return new ContainmentSdjEditPart(view);

			case ContainmentSdj2EditPart.VISUAL_ID:
				return new ContainmentSdj2EditPart(view);

			case SharingAdjEditPart.VISUAL_ID:
				return new SharingAdjEditPart(view);

			case SharingAdj2EditPart.VISUAL_ID:
				return new SharingAdj2EditPart(view);

			case AssociationAdjEditPart.VISUAL_ID:
				return new AssociationAdjEditPart(view);

			case AssociationAdj2EditPart.VISUAL_ID:
				return new AssociationAdj2EditPart(view);

			case GeneralizationAdjEditPart.VISUAL_ID:
				return new GeneralizationAdjEditPart(view);

			case GeneralizationAdj2EditPart.VISUAL_ID:
				return new GeneralizationAdj2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
