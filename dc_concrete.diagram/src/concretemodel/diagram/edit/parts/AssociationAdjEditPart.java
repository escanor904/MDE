/*
 * 
 */
package concretemodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import concretemodel.diagram.edit.policies.AssociationAdjItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssociationAdjEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	* @generated
	*/
	public AssociationAdjEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssociationAdjItemSemanticEditPolicy());
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
		return new AssociationAdjFigure();
	}

	/**
	* @generated
	*/
	public AssociationAdjFigure getPrimaryShape() {
		return (AssociationAdjFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssociationAdjFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public AssociationAdjFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
