package uidiagram.diagram.edit.parts;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import uidiagram.AdjButton;
import uidiagram.AdjCheckBox;
import uidiagram.AdjCheckedListBox;
import uidiagram.AdjComboBox;
import uidiagram.AdjDateTimePicker;
import uidiagram.AdjGroupBox;
import uidiagram.AdjLabel;
import uidiagram.AdjLinkLabel;
import uidiagram.AdjListBox;
import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;
import uidiagram.AdjPanel;
import uidiagram.AdjPictureBox;
import uidiagram.AdjRadioButton;
import uidiagram.AdjRichTextBox;
import uidiagram.AdjTextBox;


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
				
				if (editpart instanceof AdjLabelTextEditPart || editpart instanceof AdjLabelText2EditPart || editpart instanceof AdjLabelText3EditPart ) {
					 parent = editpart.getParent();
				}
				
				
				if (editpart instanceof AdjLabelEditPart || editpart instanceof AdjLabel2EditPart || editpart instanceof AdjLabel3EditPart ) {
					parent = editpart;

				}
				
				
				if (parent instanceof AdjLabelEditPart || parent instanceof AdjLabel2EditPart || parent instanceof AdjLabel3EditPart) {
					AdjLabel model = (AdjLabel) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjLabel dialogClass = new PropertiesAdjLabel(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				
				//click al AdjButton
				
				if (editpart instanceof AdjButtonTextEditPart ||  editpart instanceof AdjButtonText2EditPart || editpart  instanceof AdjButtonText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjButtonEditPart || editpart instanceof AdjButton2EditPart|| editpart instanceof AdjButton3EditPart ) {
					parent = editpart;

				}
				
				if (parent instanceof AdjButtonEditPart || parent instanceof AdjButton2EditPart|| parent instanceof AdjButton3EditPart ) {
					AdjButton model = (AdjButton) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjButton dialogClass = new PropertiesAdjButton(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjButton
				
				if (editpart instanceof AdjCheckBoxTextEditPart || editpart instanceof AdjCheckBoxText2EditPart || editpart instanceof AdjCheckBoxText3EditPart ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjCheckBoxEditPart || editpart instanceof AdjCheckBox2EditPart|| editpart instanceof AdjCheckBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjCheckBoxEditPart || parent instanceof AdjCheckBox2EditPart|| parent instanceof AdjCheckBox3EditPart) {
					AdjCheckBox model = (AdjCheckBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjCheckBox dialogClass = new PropertiesAdjCheckBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjCheckedListBox
				
				if (editpart instanceof AdjCheckedListBoxTextEditPart || editpart instanceof AdjCheckedListBoxText2EditPart || editpart instanceof AdjCheckedListBoxText3EditPart  ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjCheckedListBoxEditPart || editpart instanceof AdjCheckedListBox2EditPart|| editpart instanceof AdjCheckedListBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjCheckedListBoxEditPart || parent instanceof AdjCheckedListBox2EditPart|| parent instanceof AdjCheckedListBox3EditPart) {
					AdjCheckedListBox model = (AdjCheckedListBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjCheckedListBox dialogClass = new PropertiesAdjCheckedListBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjComboBox
				
				if (editpart instanceof AdjComboBoxTextEditPart || editpart instanceof AdjComboBoxText2EditPart || editpart instanceof AdjComboBoxText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjComboBoxEditPart || editpart instanceof AdjComboBox2EditPart|| editpart instanceof AdjComboBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjComboBoxEditPart || parent instanceof AdjComboBox2EditPart|| parent instanceof AdjComboBox3EditPart) {
					AdjComboBox model = (AdjComboBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjComboBox dialogClass = new PropertiesAdjComboBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjDateTimePicker
				
				if (editpart instanceof AdjDateTimePickerTextEditPart || editpart instanceof AdjDateTimePickerText2EditPart || editpart instanceof AdjDateTimePickerText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjDateTimePickerEditPart || editpart instanceof AdjDateTimePicker2EditPart|| editpart instanceof AdjDateTimePicker3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjDateTimePickerEditPart || parent instanceof AdjDateTimePicker2EditPart|| parent instanceof AdjDateTimePicker3EditPart) {
					AdjDateTimePicker model = (AdjDateTimePicker) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjDateTimePicker dialogClass = new PropertiesAdjDateTimePicker(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjGroupBox
				
				if (editpart instanceof AdjGroupBoxTextEditPart || editpart instanceof AdjGroupBoxText2EditPart || editpart instanceof AdjGroupBoxText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjGroupBoxEditPart || editpart instanceof AdjGroupBox2EditPart|| editpart instanceof AdjGroupBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjGroupBoxEditPart || parent instanceof AdjGroupBox2EditPart|| parent instanceof AdjGroupBox3EditPart) {
					AdjGroupBox model = (AdjGroupBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjGroupBox dialogClass = new PropertiesAdjGroupBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				

				
				//click al AdjlinkLabel
				
				if (editpart instanceof AdjLinkLabelTextEditPart || editpart instanceof AdjLinkLabelText2EditPart  || editpart instanceof AdjLinkLabelText3EditPart  ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjLinkLabelEditPart || editpart instanceof AdjLinkLabel2EditPart|| editpart instanceof AdjLinkLabel3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjLinkLabelEditPart || parent instanceof AdjLinkLabel2EditPart|| parent instanceof AdjLinkLabel3EditPart) {
					AdjLinkLabel model = (AdjLinkLabel) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjLinkLabel dialogClass = new PropertiesAdjLinkLabel(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjlistBox
				
				if (editpart instanceof AdjListBoxTextEditPart || editpart instanceof AdjListBoxText2EditPart  || editpart instanceof AdjListBoxText3EditPart ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjListBoxEditPart || editpart instanceof AdjListBox2EditPart|| editpart instanceof AdjListBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjListBoxEditPart || parent instanceof AdjListBox2EditPart|| parent instanceof AdjListBox3EditPart) {
					AdjListBox model = (AdjListBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjListBox dialogClass = new PropertiesAdjListBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjlistView
				
				if (editpart instanceof AdjListViewTextEditPart ||  editpart instanceof AdjListViewText2EditPart || editpart instanceof AdjListViewText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjListViewEditPart || editpart instanceof AdjListView2EditPart || editpart instanceof AdjListView3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjListViewEditPart || parent instanceof AdjListView2EditPart || parent instanceof AdjListView3EditPart) {
					AdjListView model = (AdjListView) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjListView dialogClass = new PropertiesAdjListView(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjlistViewColumn
				
				if (editpart instanceof AdjListViewColumnTextEditPart ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjListViewColumnEditPart ) {
					parent = editpart;

				}
				
//				if (parent instanceof AdjListViewEditPart) {
//					AdjListViewColumn model = (AdjListViewColumn) ((GraphicalEditPart) parent).resolveSemanticElement();
//					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
//					Shell parentShell = new Shell();
//					PropertiesAdjListViewColumn dialogClass = new PropertiesAdjListViewColumn(parentShell,model,domain,parent);
//					dialogClass.open();
//				}
				
				
				//click al AdjPanel
				
				if (editpart instanceof AdjPanelTextEditPart || editpart instanceof AdjPanelText2EditPart || editpart instanceof AdjPanelText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjPanelEditPart || editpart instanceof AdjPanel2EditPart || editpart instanceof AdjPanel3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjPanelEditPart || parent instanceof AdjPanel2EditPart || parent instanceof AdjPanel3EditPart) {
					AdjPanel model = (AdjPanel) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjPanel dialogClass = new PropertiesAdjPanel(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjPictureBox
				
				if (editpart instanceof AdjPictureBoxTextEditPart || editpart instanceof AdjPictureBoxText2EditPart || editpart instanceof AdjPictureBoxText3EditPart ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjPictureBoxEditPart || editpart instanceof AdjPictureBox2EditPart || editpart instanceof AdjPictureBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjPictureBoxEditPart || editpart instanceof AdjPictureBox2EditPart || editpart instanceof AdjPictureBox3EditPart) {
					AdjPictureBox model = (AdjPictureBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjPictureBox dialogClass = new PropertiesAdjPictureBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjRadioButton
				
				if (editpart instanceof AdjRadioButtonTextEditPart || editpart instanceof AdjRadioButtonText2EditPart || editpart instanceof AdjRadioButtonText3EditPart ) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjRadioButtonEditPart || editpart instanceof AdjRadioButton2EditPart || editpart instanceof AdjRadioButton3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjRadioButtonEditPart || parent instanceof AdjRadioButton2EditPart || parent instanceof AdjRadioButton3EditPart) {
					AdjRadioButton model = (AdjRadioButton) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjRadioButton dialogClass = new PropertiesAdjRadioButton(parentShell,model,domain,parent);
					dialogClass.open();
				}
				

				
				//click al AdjRichTextBox
				
				if (editpart instanceof AdjRichTextBoxTextEditPart || editpart instanceof AdjRichTextBoxText2EditPart || editpart instanceof AdjRichTextBoxText3EditPart) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjRichTextBoxEditPart || editpart instanceof AdjRichTextBox2EditPart || editpart instanceof AdjRichTextBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjRichTextBoxEditPart || parent instanceof AdjRichTextBox2EditPart || parent instanceof AdjRichTextBox3EditPart) {
					AdjRichTextBox model = (AdjRichTextBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjRichTextBox dialogClass = new PropertiesAdjRichTextBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
				//click al AdjTextBox
				
				if (editpart instanceof AdjTextBoxTextEditPart || editpart instanceof AdjTextBoxText2EditPart || editpart instanceof AdjTextBoxText3EditPart	) {
					 parent = editpart.getParent();
				}
				
				if (editpart instanceof AdjTextBoxEditPart || editpart instanceof AdjTextBox2EditPart || editpart instanceof AdjTextBox3EditPart) {
					parent = editpart;

				}
				
				if (parent instanceof AdjTextBoxEditPart || editpart instanceof AdjTextBox2EditPart || editpart instanceof AdjTextBox3EditPart) {
					AdjTextBox model = (AdjTextBox) ((GraphicalEditPart) parent).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GraphicalEditPart) parent).getEditingDomain();
					Shell parentShell = new Shell();
					PropertiesAdjTextBox dialogClass = new PropertiesAdjTextBox(parentShell,model,domain,parent);
					dialogClass.open();
				}
				
	
				
				

				
				
				



				
			}
		};
	}
}
