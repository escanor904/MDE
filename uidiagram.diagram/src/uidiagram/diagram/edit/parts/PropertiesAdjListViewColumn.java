package uidiagram.diagram.edit.parts;


import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import uidiagram.AdjLabel;
import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PropertiesAdjListViewColumn extends Dialog {
	private Text textName;
	private Text textText;
	private Text textVariable;
	private AdjListViewColumn model;
	private TransactionalEditingDomain domain;
	private EditPart editpart;
	
	

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param editpart 
	 * @param domain 
	 * @param model 
	 */
	public PropertiesAdjListViewColumn(Shell parentShell, uidiagram.AdjListViewColumn model, TransactionalEditingDomain domain, EditPart editpart) {
		super(parentShell);
		this.model = model;
		this.domain = domain;
		this.editpart = editpart;
		
		
	}
	
	/**
	 * Metodo para inicializar la interfaz con los datos del modelo
	 */

	private void init() {
		
	    if (textName != null && model.getName() != null) {
	        textName.setText(model.getName());
	    }

	    if (textText != null && model.getText() != null) {
	        textText.setText(model.getText());
	    }

	    if (textVariable != null  &&  model.getVariable() != null) {
	        textVariable.setText(""+(model.getVariable()));
	    }

	    
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(5, false));
		
		Label lblDeta = new Label(container, SWT.NONE);
		lblDeta.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		lblDeta.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblDeta.setAlignment(SWT.CENTER);
		GridData gd_lblDeta = new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1);
		gd_lblDeta.widthHint = 157;
		lblDeta.setLayoutData(gd_lblDeta);
		lblDeta.setText("Properties AdjListView");
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Name:");
		
		textName = new Text(container, SWT.BORDER);
		GridData gd_textName = new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1);
		gd_textName.widthHint = 477;
		textName.setLayoutData(gd_textName);
		
		Label lblText = new Label(container, SWT.NONE);
		lblText.setText("Text:");
		
		textText = new Text(container, SWT.BORDER);
		textText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblPositionx = new Label(container, SWT.NONE);
		lblPositionx.setText("Variable:");
		
		textVariable = new Text(container, SWT.BORDER);
		textVariable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		
		init();

		return container;
	}


	
	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		
		 if(textName.getText().equalsIgnoreCase("") ) {
	            JOptionPane.showMessageDialog(null,"Please to insert the information");
	        }else {
	        	
	        	
	            ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain,model,"1");                    
	            domain.getCommandStack().execute((Command) command);
	            close();
	        }

	}
	
	
	/**
	 * 
	 * @author escanor
	 *
	 *Este método permite actualizar los valores del modelo
	 */
	 public class ChangeOPerationDialogCommand extends RecordingCommand{

	        private uidiagram.AdjListViewColumn modelElementWidget; 
	        String evento = new String();
	        TransactionalEditingDomain transactionalEditingDomain2;
	        
	        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain,uidiagram.AdjListViewColumn modelElementWidget,String event) {
	            super(transactionalEditingDomain);
	            this.modelElementWidget = modelElementWidget;
	            this.evento = event;
	            this.transactionalEditingDomain2 =transactionalEditingDomain;
	        }
	        @Override
	        protected void doExecute()
	        {
	        	
	            modelElementWidget.setName(textName.getText());  
 	       	    modelElementWidget.setText(textText.getText());
 	       	    modelElementWidget.setText(textVariable.getText());
 	       	    
 	       	           	
	        }
	    
	}
	 
	


   

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(416, 471);
	}

}



