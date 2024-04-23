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
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PropertiesLabel extends Dialog {
	private Text textName;
	private Text textText;
	private Text textPX;
	private Text textPy;
	private Text textWidth;
	private Text textHeight;
	private Text textBackG;
	private Text textFontN;
	private Text textFontS;
	private Combo comboStyle;
	private AdjLabel model;
	private TransactionalEditingDomain domain;
	private EditPart editpart;
	private Text textStyle;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param editpart 
	 * @param domain 
	 * @param model 
	 */
	public PropertiesLabel(Shell parentShell, uidiagram.AdjLabel model, TransactionalEditingDomain domain, EditPart editpart) {
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

	    if (textPX != null  &&  model.getPositionX() != null) {
	        textPX.setText(""+(model.getPositionX()));
	    }

	    if (textPy != null && model.getPositionY() != null) {
	        textPy.setText(""+(model.getPositionY()));
	    }

	    if ( textWidth!= null && model.getWidth() != null) {
	        textWidth.setText(""+(model.getWidth()));
	    }

	    if (textHeight != null && model.getHeight() != null) {
	        textHeight.setText(""+(model.getHeight()));
	    }

	    if (textBackG != null && model.getBackground() != null) {
	        textBackG.setText(model.getBackground());
	    }

	    if (textFontN != null && model.getFontName() != null) {
	        textFontN.setText(model.getFontName());
	    }
	    
	    if (textFontN != null && model.getFontSize() != null) {
	        textFontS.setText(""+model.getFontSize());
	    }
	    
	    //este código me ayuda a asignarle un valor a el campo de texto Style
	    if (model.getBold() != null &&  model.getItalic() != null) {
			if (model.getBold() == false && model.getItalic() == false) {
				textStyle.setText("Normal");
			}else {
				if (model.getBold() == true && model.getItalic() == false) {
					textStyle.setText("Normal");
				}
				if (model.getBold() == false && model.getItalic() == true) {
					textStyle.setText("Normal");
				}
			}
		
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
		lblDeta.setText("Properties Button");
		
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
		lblPositionx.setText("PositionX:");
		
		textPX = new Text(container, SWT.BORDER);
		textPX.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblPositiony = new Label(container, SWT.NONE);
		lblPositiony.setText("PositionY:");
		
		textPy = new Text(container, SWT.BORDER);
		textPy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblWidth = new Label(container, SWT.NONE);
		lblWidth.setText("Width:");
		
		textWidth = new Text(container, SWT.BORDER);
		textWidth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblHeight = new Label(container, SWT.NONE);
		lblHeight.setText("Height:");
		
		textHeight = new Text(container, SWT.BORDER);
		textHeight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Background:");
		
		textBackG = new Text(container, SWT.BORDER);
		GridData gd_textBackG = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
		gd_textBackG.widthHint = 229;
		textBackG.setLayoutData(gd_textBackG);
		
		Button btnSelect = new Button(container, SWT.NONE);
		btnSelect.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnSelect.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			      Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);
			      textBackG.setText(color.toString());
			}
		});
		btnSelect.setText("Select");
		
		Label lblFontname = new Label(container, SWT.NONE);
		lblFontname.setText("FontName:");
		
		textFontN = new Text(container, SWT.BORDER);
		textFontN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblNewLabel_2.setText("FontSize:");
		
		textFontS = new Text(container, SWT.BORDER);
		textFontS.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		
		Label lblNewLabel_3 = new Label(container, SWT.NONE);
		lblNewLabel_3.setText("Style:");
		
		textStyle = new Text(container, SWT.BORDER);
		textStyle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		comboStyle = new Combo(container, SWT.NONE);
		comboStyle.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (comboStyle.getSelectionIndex()==0) {
					textStyle.setText("Normal");
				}
				if (comboStyle.getSelectionIndex()==1) {
					textStyle.setText("Bold");
				}
				if (comboStyle.getSelectionIndex()==2) {
					textStyle.setText("Italic");
				}
			}
		});
		comboStyle.setItems(new String[] {"Normal", "Bold", "Italic"});
		GridData gd_comboStyle = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_comboStyle.widthHint = 97;
		comboStyle.setLayoutData(gd_comboStyle);
		comboStyle.setText("Select");
		
		
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

	        private uidiagram.AdjLabel modelElementWidget; 
	        String evento = new String();
	        TransactionalEditingDomain transactionalEditingDomain2;
	        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain,uidiagram.AdjLabel modelElementWidget,String event) {
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
 	       	    
 	       	    if (!textPX.getText().isEmpty()) {
 	       	    modelElementWidget.setPositionX(Integer.parseInt(textPX.getText()));	
				}
	            
	            modelElementWidget.setPositionY(Integer.parseInt(textPy.getText()));
	            modelElementWidget.setWidth(Integer.parseInt(textWidth.getText()));
	            modelElementWidget.setHeight(Integer.parseInt(textHeight.getText()));
	            modelElementWidget.setBackground(textBackG.getText());
	            modelElementWidget.setFontName(textFontN.getText());
				
	            if (!textFontS.getText().isEmpty()) {
	            	modelElementWidget.setFontSize(Integer.parseInt(textFontS.getText()));	
				}
	            
	            modelElementWidget.setBold(false);
	            modelElementWidget.setItalic(false);
	            textStyle.setText("Normal");
	            if (comboStyle.getSelectionIndex() != -1) {
				
	            	if (!comboStyle.getItem(comboStyle.getSelectionIndex()).equals("Normal")) {
						
		        		if (comboStyle.getItem(comboStyle.getSelectionIndex()).equals("Bold")) {
		        			model.setBold(true);
		        			textStyle.setText("Bold");
						}
		        		
		        		if (comboStyle.getItem(comboStyle.getSelectionIndex()).equals("Italic")) {
		        			model.setItalic(true);
		        			textStyle.setText("Italic");
						}
		        		
		        		
					}
				}
	        	
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



