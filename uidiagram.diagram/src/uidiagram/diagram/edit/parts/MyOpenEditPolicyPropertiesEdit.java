package uidiagram.diagram.edit.parts;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import uidiagram.AdjLabel;


/**
 * ESte evento se jecuta cuando da doble clic en el diagrama
 * @author Acer
 *
 */
public class MyOpenEditPolicyPropertiesEdit extends OpenEditPolicy {


	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				EditPart editpart = getHost();
				EditPart parent = null;
				
				if (editpart instanceof AdjLabelTextEditPart ) {
					 parent = editpart.getParent();
				}
				
				
				if (editpart instanceof AdjLabelEditPart || editpart instanceof AdjLabel2EditPart ) {
					parent = editpart;

				}
				
				if(parent instanceof AdjLabelEditPart) {
					AdjLabel model = (AdjLabel) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesLabel dialogClass = new PropertiesLabel(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				
				



				
			}
		};
	}
}
