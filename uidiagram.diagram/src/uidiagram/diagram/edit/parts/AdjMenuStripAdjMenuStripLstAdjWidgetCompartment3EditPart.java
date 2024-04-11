/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import uidiagram.diagram.edit.policies.AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3CanonicalEditPolicy;
import uidiagram.diagram.edit.policies.AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3ItemSemanticEditPolicy;
import uidiagram.diagram.part.Messages;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7020;

	/**
	* @generated
	*/
	public AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UidiagramElementTypes.AdjLabel_3046) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckBox_3047) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjButton_3048) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjListBox_3049) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDatepicker_3050) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTextBox_3051) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckedListBox_3052) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjLinkLabel_3053) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjRichTextBox_3054) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTreeView_3055) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPropertyGrid_3056) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjProgressBar_3057) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDataGridView_3058) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPanel_3059) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjGroupBox_3078) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjMenuStrip_3081) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjToolStrip_3082) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
