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

import uidiagram.diagram.edit.policies.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5CanonicalEditPolicy;
import uidiagram.diagram.edit.policies.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5ItemSemanticEditPolicy;
import uidiagram.diagram.part.Messages;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7024;

	/**
	* @generated
	*/
	public AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart_title;
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
				new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5CanonicalEditPolicy());
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
			if (type == UidiagramElementTypes.AdjLabel_3031) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckBox_3032) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjButton_3033) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjListBox_3034) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDatepicker_3035) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTextBox_3036) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckedListBox_3037) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjLinkLabel_3038) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjRichTextBox_3039) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTreeView_3040) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPropertyGrid_3041) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjProgressBar_3042) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDataGridView_3043) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPanel_3044) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjGroupBox_3076) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjMenuStrip_3077) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjToolStrip_3079) {
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
