/*
 * 
 */
package concretemodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import concretemodel.diagram.edit.policies.SharingAdjItemSemanticEditPolicy;

/**
 * @generated
 */
public class SharingAdjEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	* @generated
	*/
	public SharingAdjEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SharingAdjItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new SharingAdjFigure();
	}

	/**
	* @generated
	*/
	public SharingAdjFigure getPrimaryShape() {
		return (SharingAdjFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SharingAdjFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public SharingAdjFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
