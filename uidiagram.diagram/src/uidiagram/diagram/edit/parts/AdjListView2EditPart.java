/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import uidiagram.AdjWidget;
import uidiagram.diagram.edit.policies.AdjListView2ItemSemanticEditPolicy;
import uidiagram.diagram.edit.policies.OpenDiagramEditPolicy;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AdjListView2EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3094;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AdjListView2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AdjListView2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AdjListViewFigure();
	}

	/**
	* @generated
	*/
	public AdjListViewFigure getPrimaryShape() {
		return (AdjListViewFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AdjListViewText2EditPart) {
			((AdjListViewText2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAdjListViewLabelFigure());
			return true;
		}
		if (childEditPart instanceof AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getAdjListViewLstAdjListViewColumnCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AdjListViewText2EditPart) {
			return true;
		}
		if (childEditPart instanceof AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getAdjListViewLstAdjListViewColumnCompartmentFigure();
			pane.remove(((AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart) {
			return getPrimaryShape().getAdjListViewLstAdjListViewColumnCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UidiagramVisualIDRegistry.getType(AdjListViewText2EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UidiagramElementTypes.AdjListViewColumn_3093) {
				return getChildBySemanticHint(UidiagramVisualIDRegistry
						.getType(AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AdjListViewFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAdjListViewLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAdjListViewLstAdjListViewColumnCompartmentFigure;

		/**
		 * @generated
		 */
		public AdjListViewFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAdjListViewLabelFigure = new WrappingLabel();

			fFigureAdjListViewLabelFigure.setText("AdjListView");
			fFigureAdjListViewLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAdjListViewLabelFigure);

			fAdjListViewLstAdjListViewColumnCompartmentFigure = new RectangleFigure();

			fAdjListViewLstAdjListViewColumnCompartmentFigure.setOutline(false);

			this.add(fAdjListViewLstAdjListViewColumnCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAdjListViewLabelFigure() {
			return fFigureAdjListViewLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAdjListViewLstAdjListViewColumnCompartmentFigure() {
			return fAdjListViewLstAdjListViewColumnCompartmentFigure;
		}

	}
	
	/**
	 * Metodo para capturar los eventos del diagrama UIDiagram
	 */
	protected void handleNotificationEvent(Notification arg0) {
		// SET was the type i need
		if (arg0.getEventType() == Notification.SET) {

			//Verificamos si la instancia es de dimensiones
			if (arg0.getNotifier() instanceof BoundsImpl) {

				BoundsImpl notifier = (BoundsImpl) arg0.getNotifier();
				// for my special coordinate mapping i also need the node,
				// so i save it in this variable ...
				NodeImpl node = (NodeImpl) this.getModel();
				// get the corresponding FieldLabel Object from the model
				AdjWidget model = (AdjWidget) node.getElement();

				if (notifier.getWidth() == -1) {
					model.setWidth(120);
				} else {
					model.setWidth(notifier.getWidth());

				}
				if (notifier.getHeight() == -1) {
					model.setHeight(24);
				} else {
					model.setHeight(notifier.getHeight());

				}
				model.setPositionX(notifier.getX());
				model.setPositionY(notifier.getY());
			}

			//Verificamos si la instancia es del tipo de letra
			if (arg0.getNotifier() instanceof ShapeImpl) {

				ShapeImpl fontStyleImpl = (ShapeImpl) arg0.getNotifier();
				int fontHeight = fontStyleImpl.getFontHeight();
				String fontName = fontStyleImpl.getFontName();
				boolean bold = fontStyleImpl.isBold();
				boolean italic = fontStyleImpl.isItalic();
				NodeImpl node = (NodeImpl) this.getModel();
				AdjWidget model = (AdjWidget) node.getElement();

				model.setBold(bold);
				model.setItalic(italic);
				model.setFontName(fontName);
				model.setFontSize(fontHeight);
			}

		}
		super.handleNotificationEvent(arg0);
	}

}
