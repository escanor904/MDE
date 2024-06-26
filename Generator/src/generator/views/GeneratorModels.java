package generator.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;


import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class GeneratorModels extends ViewPart {
	public GeneratorModels() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "generator.views.GeneratorModels";

	@Inject IWorkbench workbench;
	

	

	@Override
	public void setFocus() {
		
	}


	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Label lblPmooTool = new Label(parent, SWT.CENTER);
		lblPmooTool.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblPmooTool.setBounds(186, 24, 175, 32);
		lblPmooTool.setText("Pmoo Tool");
		
		Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(22, 62, 547, 11);
		
		Group group = new Group(parent, SWT.NONE);
		group.setBounds(22, 89, 531, 82);
		
		Label lblTransformationModelTo = new Label(group, SWT.NONE);
		lblTransformationModelTo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblTransformationModelTo.setForeground(SWTResourceManager.getColor(0, 0, 128));
		lblTransformationModelTo.setBounds(10, 0, 219, 24);
		lblTransformationModelTo.setText("Model to Model (M2M) Transformation ");
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				try {
					mfm.transformationM2M();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnNewButton.setBounds(78, 36, 369, 25);
		btnNewButton.setText("Generate Model to Model Transformation ");
		
		Group group_1 = new Group(parent, SWT.NONE);
		group_1.setBounds(22, 177, 531, 82);
		
		Label lblTransformacionModelTo = new Label(group_1, SWT.NONE);
		lblTransformacionModelTo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblTransformacionModelTo.setForeground(SWTResourceManager.getColor(0, 0, 128));
		lblTransformacionModelTo.setBounds(10, 0, 209, 15);
		lblTransformacionModelTo.setText("Model To Text (M2T) Transformation");
		
		Button btnGenerateCodeJava = new Button(group_1, SWT.NONE);
		btnGenerateCodeJava.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				try {
					mfm.transformationM2T();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnGenerateCodeJava.setBounds(79, 31, 362, 25);
		btnGenerateCodeJava.setText("Generate C# Code");
		
		Group group_1_1 = new Group(parent, SWT.NONE);
		group_1_1.setBounds(22, 279, 531, 82);
		
		Label lblTransformationModelUi = new Label(group_1_1, SWT.NONE);
		lblTransformationModelUi.setText("Model UI To Text Transformation ");
		lblTransformationModelUi.setForeground(SWTResourceManager.getColor(0, 0, 128));
		lblTransformationModelUi.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblTransformationModelUi.setBounds(10, 0, 192, 15);
		
		Button btnGenerateCUi = new Button(group_1_1, SWT.NONE);
		btnGenerateCUi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				try {
					mfm.transformationM2TUIDiagram();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnGenerateCUi.setText("Generate C# UI");
		btnGenerateCUi.setBounds(79, 31, 362, 25);
		
		Group group_1_1_1 = new Group(parent, SWT.NONE);
		group_1_1_1.setBounds(22, 377, 531, 82);
		
		Label lblModelToModel = new Label(group_1_1_1, SWT.NONE);
		lblModelToModel.setText("Model To Model (M2M) Transformation Relational");
		lblModelToModel.setForeground(SWTResourceManager.getColor(0, 0, 128));
		lblModelToModel.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblModelToModel.setBounds(10, 0, 283, 15);
		
		Button btnGenerateModelTo = new Button(group_1_1_1, SWT.NONE);
		btnGenerateModelTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				try {
					mfm.transformationM2MRelational();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnGenerateModelTo.setText("Generate Model to Model Transformation (Relational)");
		btnGenerateModelTo.setBounds(79, 31, 362, 25);
		// TODO Auto-generated method stub
		
	}
}
