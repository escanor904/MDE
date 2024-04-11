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

import uidiagram.diagram.edit.policies.AdjToolStripAdjToolStripLstAdjWidgetCompartment2CanonicalEditPolicy;
import uidiagram.diagram.edit.policies.AdjToolStripAdjToolStripLstAdjWidgetCompartment2ItemSemanticEditPolicy;
import uidiagram.diagram.part.Messages;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7019;

	/**
	* @generated
	*/
	public AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart_title;
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
				new AdjToolStripAdjToolStripLstAdjWidgetCompartment2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AdjToolStripAdjToolStripLstAdjWidgetCompartment2CanonicalEditPolicy());
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
			if (type == UidiagramElementTypes.AdjLabel_3061) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckBox_3062) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjButton_3063) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjListBox_3064) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDatepicker_3065) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTextBox_3066) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjCheckedListBox_3067) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjLinkLabel_3068) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjRichTextBox_3069) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjTreeView_3070) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPropertyGrid_3071) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjProgressBar_3072) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjDataGridView_3073) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjPanel_3074) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjGroupBox_3075) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjMenuStrip_3080) {
				return this;
			}
			if (type == UidiagramElementTypes.AdjToolStrip_3083) {
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
