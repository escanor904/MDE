/*
 * 
 */
package uidiagram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AdjButtonName2EditPart;
import uidiagram.diagram.edit.parts.AdjButtonName3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjButtonText2EditPart;
import uidiagram.diagram.edit.parts.AdjButtonText3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonTextEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerNameEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerText2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerText3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerTextEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjLabelText2EditPart;
import uidiagram.diagram.edit.parts.AdjLabelText3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelTextEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelText2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelText3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelTextEditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjListBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnNameEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnTextEditPart;
import uidiagram.diagram.edit.parts.AdjListViewName2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewName3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewNameEditPart;
import uidiagram.diagram.edit.parts.AdjListViewText2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewText3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewTextEditPart;
import uidiagram.diagram.edit.parts.AdjPanelName2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelNameEditPart;
import uidiagram.diagram.edit.parts.AdjPanelText2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelText3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelTextEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonText2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonText3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonTextEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxTextEditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxText2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxText3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxTextEditPart;
import uidiagram.diagram.edit.parts.FormUINameEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser formUIName_5087Parser;

	/**
	* @generated
	*/
	private IParser getFormUIName_5087Parser() {
		if (formUIName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getFormUI_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formUIName_5087Parser = parser;
		}
		return formUIName_5087Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelText_5001Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelText_5001Parser() {
		if (adjLabelText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelText_5001Parser = parser;
		}
		return adjLabelText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxText_5002Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxText_5002Parser() {
		if (adjCheckBoxText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxText_5002Parser = parser;
		}
		return adjCheckBoxText_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonText_5003Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonText_5003Parser() {
		if (adjButtonText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonText_5003Parser = parser;
		}
		return adjButtonText_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxText_5004Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxText_5004Parser() {
		if (adjListBoxText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxText_5004Parser = parser;
		}
		return adjListBoxText_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerText_5099Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerText_5099Parser() {
		if (adjDateTimePickerText_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerText_5099Parser = parser;
		}
		return adjDateTimePickerText_5099Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxText_5006Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxText_5006Parser() {
		if (adjTextBoxText_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxText_5006Parser = parser;
		}
		return adjTextBoxText_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxText_5007Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxText_5007Parser() {
		if (adjCheckedListBoxText_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxText_5007Parser = parser;
		}
		return adjCheckedListBoxText_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelText_5008Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelText_5008Parser() {
		if (adjLinkLabelText_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelText_5008Parser = parser;
		}
		return adjLinkLabelText_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxText_5009Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxText_5009Parser() {
		if (adjRichTextBoxText_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxText_5009Parser = parser;
		}
		return adjRichTextBoxText_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxText_5088Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxText_5088Parser() {
		if (adjComboBoxText_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxText_5088Parser = parser;
		}
		return adjComboBoxText_5088Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonText_5100Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonText_5100Parser() {
		if (adjRadioButtonText_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonText_5100Parser = parser;
		}
		return adjRadioButtonText_5100Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxText_5107Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxText_5107Parser() {
		if (adjPictureBoxText_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxText_5107Parser = parser;
		}
		return adjPictureBoxText_5107Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewText_5094Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewText_5094Parser() {
		if (adjListViewText_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewText_5094Parser = parser;
		}
		return adjListViewText_5094Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewColumnText_5093Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewColumnText_5093Parser() {
		if (adjListViewColumnText_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjListViewColumn_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewColumnText_5093Parser = parser;
		}
		return adjListViewColumnText_5093Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelText_5083Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelText_5083Parser() {
		if (adjPanelText_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelText_5083Parser = parser;
		}
		return adjPanelText_5083Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelText_5015Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelText_5015Parser() {
		if (adjLabelText_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelText_5015Parser = parser;
		}
		return adjLabelText_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxText_5016Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxText_5016Parser() {
		if (adjCheckBoxText_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxText_5016Parser = parser;
		}
		return adjCheckBoxText_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonText_5017Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonText_5017Parser() {
		if (adjButtonText_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonText_5017Parser = parser;
		}
		return adjButtonText_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxText_5018Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxText_5018Parser() {
		if (adjListBoxText_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxText_5018Parser = parser;
		}
		return adjListBoxText_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerText_5102Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerText_5102Parser() {
		if (adjDateTimePickerText_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerText_5102Parser = parser;
		}
		return adjDateTimePickerText_5102Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxText_5020Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxText_5020Parser() {
		if (adjTextBoxText_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxText_5020Parser = parser;
		}
		return adjTextBoxText_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxText_5021Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxText_5021Parser() {
		if (adjCheckedListBoxText_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxText_5021Parser = parser;
		}
		return adjCheckedListBoxText_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelText_5022Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelText_5022Parser() {
		if (adjLinkLabelText_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelText_5022Parser = parser;
		}
		return adjLinkLabelText_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxText_5023Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxText_5023Parser() {
		if (adjRichTextBoxText_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxText_5023Parser = parser;
		}
		return adjRichTextBoxText_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxText_5089Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxText_5089Parser() {
		if (adjComboBoxText_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxText_5089Parser = parser;
		}
		return adjComboBoxText_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonText_5103Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonText_5103Parser() {
		if (adjRadioButtonText_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonText_5103Parser = parser;
		}
		return adjRadioButtonText_5103Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxText_5108Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxText_5108Parser() {
		if (adjPictureBoxText_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxText_5108Parser = parser;
		}
		return adjPictureBoxText_5108Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewText_5095Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewText_5095Parser() {
		if (adjListViewText_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewText_5095Parser = parser;
		}
		return adjListViewText_5095Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelText_5082Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelText_5082Parser() {
		if (adjPanelText_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelText_5082Parser = parser;
		}
		return adjPanelText_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxText_5081Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxText_5081Parser() {
		if (adjGroupBoxText_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxText_5081Parser = parser;
		}
		return adjGroupBoxText_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelText_5028Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelText_5028Parser() {
		if (adjLabelText_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelText_5028Parser = parser;
		}
		return adjLabelText_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxText_5029Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxText_5029Parser() {
		if (adjCheckBoxText_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxText_5029Parser = parser;
		}
		return adjCheckBoxText_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonText_5030Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonText_5030Parser() {
		if (adjButtonText_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonText_5030Parser = parser;
		}
		return adjButtonText_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxText_5031Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxText_5031Parser() {
		if (adjListBoxText_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxText_5031Parser = parser;
		}
		return adjListBoxText_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerText_5105Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerText_5105Parser() {
		if (adjDateTimePickerText_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerText_5105Parser = parser;
		}
		return adjDateTimePickerText_5105Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxText_5033Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxText_5033Parser() {
		if (adjTextBoxText_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxText_5033Parser = parser;
		}
		return adjTextBoxText_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxText_5034Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxText_5034Parser() {
		if (adjCheckedListBoxText_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxText_5034Parser = parser;
		}
		return adjCheckedListBoxText_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelText_5035Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelText_5035Parser() {
		if (adjLinkLabelText_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelText_5035Parser = parser;
		}
		return adjLinkLabelText_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxText_5036Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxText_5036Parser() {
		if (adjRichTextBoxText_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxText_5036Parser = parser;
		}
		return adjRichTextBoxText_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxText_5090Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxText_5090Parser() {
		if (adjComboBoxText_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxText_5090Parser = parser;
		}
		return adjComboBoxText_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonText_5106Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonText_5106Parser() {
		if (adjRadioButtonText_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonText_5106Parser = parser;
		}
		return adjRadioButtonText_5106Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxText_5109Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxText_5109Parser() {
		if (adjPictureBoxText_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxText_5109Parser = parser;
		}
		return adjPictureBoxText_5109Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewText_5096Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewText_5096Parser() {
		if (adjListViewText_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewText_5096Parser = parser;
		}
		return adjListViewText_5096Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelText_5080Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelText_5080Parser() {
		if (adjPanelText_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelText_5080Parser = parser;
		}
		return adjPanelText_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxText_5075Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxText_5075Parser() {
		if (adjGroupBoxText_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxText_5075Parser = parser;
		}
		return adjGroupBoxText_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxText_5084Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxText_5084Parser() {
		if (adjGroupBoxText_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxText_5084Parser = parser;
		}
		return adjGroupBoxText_5084Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FormUINameEditPart.VISUAL_ID:
			return getFormUIName_5087Parser();
		case AdjLabelTextEditPart.VISUAL_ID:
			return getAdjLabelText_5001Parser();
		case AdjCheckBoxTextEditPart.VISUAL_ID:
			return getAdjCheckBoxText_5002Parser();
		case AdjButtonTextEditPart.VISUAL_ID:
			return getAdjButtonText_5003Parser();
		case AdjListBoxTextEditPart.VISUAL_ID:
			return getAdjListBoxText_5004Parser();
		case AdjDateTimePickerTextEditPart.VISUAL_ID:
			return getAdjDateTimePickerText_5099Parser();
		case AdjTextBoxTextEditPart.VISUAL_ID:
			return getAdjTextBoxText_5006Parser();
		case AdjCheckedListBoxTextEditPart.VISUAL_ID:
			return getAdjCheckedListBoxText_5007Parser();
		case AdjLinkLabelTextEditPart.VISUAL_ID:
			return getAdjLinkLabelText_5008Parser();
		case AdjRichTextBoxTextEditPart.VISUAL_ID:
			return getAdjRichTextBoxText_5009Parser();
		case AdjComboBoxTextEditPart.VISUAL_ID:
			return getAdjComboBoxText_5088Parser();
		case AdjRadioButtonTextEditPart.VISUAL_ID:
			return getAdjRadioButtonText_5100Parser();
		case AdjPictureBoxTextEditPart.VISUAL_ID:
			return getAdjPictureBoxText_5107Parser();
		case AdjListViewTextEditPart.VISUAL_ID:
			return getAdjListViewText_5094Parser();
		case AdjListViewColumnTextEditPart.VISUAL_ID:
			return getAdjListViewColumnText_5093Parser();
		case AdjPanelTextEditPart.VISUAL_ID:
			return getAdjPanelText_5083Parser();
		case AdjLabelText2EditPart.VISUAL_ID:
			return getAdjLabelText_5015Parser();
		case AdjCheckBoxText2EditPart.VISUAL_ID:
			return getAdjCheckBoxText_5016Parser();
		case AdjButtonText2EditPart.VISUAL_ID:
			return getAdjButtonText_5017Parser();
		case AdjListBoxText2EditPart.VISUAL_ID:
			return getAdjListBoxText_5018Parser();
		case AdjDateTimePickerText2EditPart.VISUAL_ID:
			return getAdjDateTimePickerText_5102Parser();
		case AdjTextBoxText2EditPart.VISUAL_ID:
			return getAdjTextBoxText_5020Parser();
		case AdjCheckedListBoxText2EditPart.VISUAL_ID:
			return getAdjCheckedListBoxText_5021Parser();
		case AdjLinkLabelText2EditPart.VISUAL_ID:
			return getAdjLinkLabelText_5022Parser();
		case AdjRichTextBoxText2EditPart.VISUAL_ID:
			return getAdjRichTextBoxText_5023Parser();
		case AdjComboBoxText2EditPart.VISUAL_ID:
			return getAdjComboBoxText_5089Parser();
		case AdjRadioButtonText2EditPart.VISUAL_ID:
			return getAdjRadioButtonText_5103Parser();
		case AdjPictureBoxText2EditPart.VISUAL_ID:
			return getAdjPictureBoxText_5108Parser();
		case AdjListViewText2EditPart.VISUAL_ID:
			return getAdjListViewText_5095Parser();
		case AdjPanelText2EditPart.VISUAL_ID:
			return getAdjPanelText_5082Parser();
		case AdjGroupBoxTextEditPart.VISUAL_ID:
			return getAdjGroupBoxText_5081Parser();
		case AdjLabelText3EditPart.VISUAL_ID:
			return getAdjLabelText_5028Parser();
		case AdjCheckBoxText3EditPart.VISUAL_ID:
			return getAdjCheckBoxText_5029Parser();
		case AdjButtonText3EditPart.VISUAL_ID:
			return getAdjButtonText_5030Parser();
		case AdjListBoxText3EditPart.VISUAL_ID:
			return getAdjListBoxText_5031Parser();
		case AdjDateTimePickerText3EditPart.VISUAL_ID:
			return getAdjDateTimePickerText_5105Parser();
		case AdjTextBoxText3EditPart.VISUAL_ID:
			return getAdjTextBoxText_5033Parser();
		case AdjCheckedListBoxText3EditPart.VISUAL_ID:
			return getAdjCheckedListBoxText_5034Parser();
		case AdjLinkLabelText3EditPart.VISUAL_ID:
			return getAdjLinkLabelText_5035Parser();
		case AdjRichTextBoxText3EditPart.VISUAL_ID:
			return getAdjRichTextBoxText_5036Parser();
		case AdjComboBoxText3EditPart.VISUAL_ID:
			return getAdjComboBoxText_5090Parser();
		case AdjRadioButtonText3EditPart.VISUAL_ID:
			return getAdjRadioButtonText_5106Parser();
		case AdjPictureBoxText3EditPart.VISUAL_ID:
			return getAdjPictureBoxText_5109Parser();
		case AdjListViewText3EditPart.VISUAL_ID:
			return getAdjListViewText_5096Parser();
		case AdjPanelText3EditPart.VISUAL_ID:
			return getAdjPanelText_5080Parser();
		case AdjGroupBoxText2EditPart.VISUAL_ID:
			return getAdjGroupBoxText_5075Parser();
		case AdjGroupBoxText3EditPart.VISUAL_ID:
			return getAdjGroupBoxText_5084Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
