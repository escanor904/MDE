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
import uidiagram.diagram.edit.parts.AdjCheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerName3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerNameEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnNameEditPart;
import uidiagram.diagram.edit.parts.AdjListViewName2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewName3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewNameEditPart;
import uidiagram.diagram.edit.parts.AdjPanelName2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelNameEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxNameEditPart;
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
	private IParser adjLabelName_5001Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelName_5001Parser() {
		if (adjLabelName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelName_5001Parser = parser;
		}
		return adjLabelName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxName_5002Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxName_5002Parser() {
		if (adjCheckBoxName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxName_5002Parser = parser;
		}
		return adjCheckBoxName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonName_5003Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonName_5003Parser() {
		if (adjButtonName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonName_5003Parser = parser;
		}
		return adjButtonName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxName_5004Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxName_5004Parser() {
		if (adjListBoxName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxName_5004Parser = parser;
		}
		return adjListBoxName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerName_5099Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerName_5099Parser() {
		if (adjDateTimePickerName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerName_5099Parser = parser;
		}
		return adjDateTimePickerName_5099Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxName_5006Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxName_5006Parser() {
		if (adjTextBoxName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxName_5006Parser = parser;
		}
		return adjTextBoxName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxName_5007Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxName_5007Parser() {
		if (adjCheckedListBoxName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxName_5007Parser = parser;
		}
		return adjCheckedListBoxName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelName_5008Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelName_5008Parser() {
		if (adjLinkLabelName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelName_5008Parser = parser;
		}
		return adjLinkLabelName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxName_5009Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxName_5009Parser() {
		if (adjRichTextBoxName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxName_5009Parser = parser;
		}
		return adjRichTextBoxName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxName_5088Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxName_5088Parser() {
		if (adjComboBoxName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxName_5088Parser = parser;
		}
		return adjComboBoxName_5088Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonName_5100Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonName_5100Parser() {
		if (adjRadioButtonName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonName_5100Parser = parser;
		}
		return adjRadioButtonName_5100Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxName_5107Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxName_5107Parser() {
		if (adjPictureBoxName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxName_5107Parser = parser;
		}
		return adjPictureBoxName_5107Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewName_5094Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewName_5094Parser() {
		if (adjListViewName_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewName_5094Parser = parser;
		}
		return adjListViewName_5094Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewColumnName_5093Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewColumnName_5093Parser() {
		if (adjListViewColumnName_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjListViewColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewColumnName_5093Parser = parser;
		}
		return adjListViewColumnName_5093Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelName_5083Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelName_5083Parser() {
		if (adjPanelName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelName_5083Parser = parser;
		}
		return adjPanelName_5083Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelName_5015Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelName_5015Parser() {
		if (adjLabelName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelName_5015Parser = parser;
		}
		return adjLabelName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxName_5016Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxName_5016Parser() {
		if (adjCheckBoxName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxName_5016Parser = parser;
		}
		return adjCheckBoxName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonName_5017Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonName_5017Parser() {
		if (adjButtonName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonName_5017Parser = parser;
		}
		return adjButtonName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxName_5018Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxName_5018Parser() {
		if (adjListBoxName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxName_5018Parser = parser;
		}
		return adjListBoxName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerName_5102Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerName_5102Parser() {
		if (adjDateTimePickerName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerName_5102Parser = parser;
		}
		return adjDateTimePickerName_5102Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxName_5020Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxName_5020Parser() {
		if (adjTextBoxName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxName_5020Parser = parser;
		}
		return adjTextBoxName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxName_5021Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxName_5021Parser() {
		if (adjCheckedListBoxName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxName_5021Parser = parser;
		}
		return adjCheckedListBoxName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelName_5022Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelName_5022Parser() {
		if (adjLinkLabelName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelName_5022Parser = parser;
		}
		return adjLinkLabelName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxName_5023Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxName_5023Parser() {
		if (adjRichTextBoxName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxName_5023Parser = parser;
		}
		return adjRichTextBoxName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxName_5089Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxName_5089Parser() {
		if (adjComboBoxName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxName_5089Parser = parser;
		}
		return adjComboBoxName_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonName_5103Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonName_5103Parser() {
		if (adjRadioButtonName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonName_5103Parser = parser;
		}
		return adjRadioButtonName_5103Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxName_5108Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxName_5108Parser() {
		if (adjPictureBoxName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxName_5108Parser = parser;
		}
		return adjPictureBoxName_5108Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewName_5095Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewName_5095Parser() {
		if (adjListViewName_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewName_5095Parser = parser;
		}
		return adjListViewName_5095Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelName_5082Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelName_5082Parser() {
		if (adjPanelName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelName_5082Parser = parser;
		}
		return adjPanelName_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxName_5081Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxName_5081Parser() {
		if (adjGroupBoxName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxName_5081Parser = parser;
		}
		return adjGroupBoxName_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelName_5028Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelName_5028Parser() {
		if (adjLabelName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelName_5028Parser = parser;
		}
		return adjLabelName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxName_5029Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxName_5029Parser() {
		if (adjCheckBoxName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxName_5029Parser = parser;
		}
		return adjCheckBoxName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonName_5030Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonName_5030Parser() {
		if (adjButtonName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonName_5030Parser = parser;
		}
		return adjButtonName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxName_5031Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxName_5031Parser() {
		if (adjListBoxName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxName_5031Parser = parser;
		}
		return adjListBoxName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDateTimePickerName_5105Parser;

	/**
	* @generated
	*/
	private IParser getAdjDateTimePickerName_5105Parser() {
		if (adjDateTimePickerName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDateTimePickerName_5105Parser = parser;
		}
		return adjDateTimePickerName_5105Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxName_5033Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxName_5033Parser() {
		if (adjTextBoxName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxName_5033Parser = parser;
		}
		return adjTextBoxName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxName_5034Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxName_5034Parser() {
		if (adjCheckedListBoxName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxName_5034Parser = parser;
		}
		return adjCheckedListBoxName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelName_5035Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelName_5035Parser() {
		if (adjLinkLabelName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelName_5035Parser = parser;
		}
		return adjLinkLabelName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxName_5036Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxName_5036Parser() {
		if (adjRichTextBoxName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxName_5036Parser = parser;
		}
		return adjRichTextBoxName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser adjComboBoxName_5090Parser;

	/**
	* @generated
	*/
	private IParser getAdjComboBoxName_5090Parser() {
		if (adjComboBoxName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjComboBoxName_5090Parser = parser;
		}
		return adjComboBoxName_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRadioButtonName_5106Parser;

	/**
	* @generated
	*/
	private IParser getAdjRadioButtonName_5106Parser() {
		if (adjRadioButtonName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRadioButtonName_5106Parser = parser;
		}
		return adjRadioButtonName_5106Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPictureBoxName_5109Parser;

	/**
	* @generated
	*/
	private IParser getAdjPictureBoxName_5109Parser() {
		if (adjPictureBoxName_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPictureBoxName_5109Parser = parser;
		}
		return adjPictureBoxName_5109Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListViewName_5096Parser;

	/**
	* @generated
	*/
	private IParser getAdjListViewName_5096Parser() {
		if (adjListViewName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListViewName_5096Parser = parser;
		}
		return adjListViewName_5096Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelName_5080Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelName_5080Parser() {
		if (adjPanelName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelName_5080Parser = parser;
		}
		return adjPanelName_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxName_5075Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxName_5075Parser() {
		if (adjGroupBoxName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxName_5075Parser = parser;
		}
		return adjGroupBoxName_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxName_5084Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxName_5084Parser() {
		if (adjGroupBoxName_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxName_5084Parser = parser;
		}
		return adjGroupBoxName_5084Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FormUINameEditPart.VISUAL_ID:
			return getFormUIName_5087Parser();
		case AdjLabelNameEditPart.VISUAL_ID:
			return getAdjLabelName_5001Parser();
		case AdjCheckBoxNameEditPart.VISUAL_ID:
			return getAdjCheckBoxName_5002Parser();
		case AdjButtonNameEditPart.VISUAL_ID:
			return getAdjButtonName_5003Parser();
		case AdjListBoxNameEditPart.VISUAL_ID:
			return getAdjListBoxName_5004Parser();
		case AdjDateTimePickerNameEditPart.VISUAL_ID:
			return getAdjDateTimePickerName_5099Parser();
		case AdjTextBoxNameEditPart.VISUAL_ID:
			return getAdjTextBoxName_5006Parser();
		case AdjCheckedListBoxNameEditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5007Parser();
		case AdjLinkLabelNameEditPart.VISUAL_ID:
			return getAdjLinkLabelName_5008Parser();
		case AdjRichTextBoxNameEditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5009Parser();
		case AdjComboBoxNameEditPart.VISUAL_ID:
			return getAdjComboBoxName_5088Parser();
		case AdjRadioButtonNameEditPart.VISUAL_ID:
			return getAdjRadioButtonName_5100Parser();
		case AdjPictureBoxNameEditPart.VISUAL_ID:
			return getAdjPictureBoxName_5107Parser();
		case AdjListViewNameEditPart.VISUAL_ID:
			return getAdjListViewName_5094Parser();
		case AdjListViewColumnNameEditPart.VISUAL_ID:
			return getAdjListViewColumnName_5093Parser();
		case AdjPanelNameEditPart.VISUAL_ID:
			return getAdjPanelName_5083Parser();
		case AdjLabelName2EditPart.VISUAL_ID:
			return getAdjLabelName_5015Parser();
		case AdjCheckBoxName2EditPart.VISUAL_ID:
			return getAdjCheckBoxName_5016Parser();
		case AdjButtonName2EditPart.VISUAL_ID:
			return getAdjButtonName_5017Parser();
		case AdjListBoxName2EditPart.VISUAL_ID:
			return getAdjListBoxName_5018Parser();
		case AdjDateTimePickerName2EditPart.VISUAL_ID:
			return getAdjDateTimePickerName_5102Parser();
		case AdjTextBoxName2EditPart.VISUAL_ID:
			return getAdjTextBoxName_5020Parser();
		case AdjCheckedListBoxName2EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5021Parser();
		case AdjLinkLabelName2EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5022Parser();
		case AdjRichTextBoxName2EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5023Parser();
		case AdjComboBoxName2EditPart.VISUAL_ID:
			return getAdjComboBoxName_5089Parser();
		case AdjRadioButtonName2EditPart.VISUAL_ID:
			return getAdjRadioButtonName_5103Parser();
		case AdjPictureBoxName2EditPart.VISUAL_ID:
			return getAdjPictureBoxName_5108Parser();
		case AdjListViewName2EditPart.VISUAL_ID:
			return getAdjListViewName_5095Parser();
		case AdjPanelName2EditPart.VISUAL_ID:
			return getAdjPanelName_5082Parser();
		case AdjGroupBoxNameEditPart.VISUAL_ID:
			return getAdjGroupBoxName_5081Parser();
		case AdjLabelName3EditPart.VISUAL_ID:
			return getAdjLabelName_5028Parser();
		case AdjCheckBoxName3EditPart.VISUAL_ID:
			return getAdjCheckBoxName_5029Parser();
		case AdjButtonName3EditPart.VISUAL_ID:
			return getAdjButtonName_5030Parser();
		case AdjListBoxName3EditPart.VISUAL_ID:
			return getAdjListBoxName_5031Parser();
		case AdjDateTimePickerName3EditPart.VISUAL_ID:
			return getAdjDateTimePickerName_5105Parser();
		case AdjTextBoxName3EditPart.VISUAL_ID:
			return getAdjTextBoxName_5033Parser();
		case AdjCheckedListBoxName3EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5034Parser();
		case AdjLinkLabelName3EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5035Parser();
		case AdjRichTextBoxName3EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5036Parser();
		case AdjComboBoxName3EditPart.VISUAL_ID:
			return getAdjComboBoxName_5090Parser();
		case AdjRadioButtonName3EditPart.VISUAL_ID:
			return getAdjRadioButtonName_5106Parser();
		case AdjPictureBoxName3EditPart.VISUAL_ID:
			return getAdjPictureBoxName_5109Parser();
		case AdjListViewName3EditPart.VISUAL_ID:
			return getAdjListViewName_5096Parser();
		case AdjPanelName3EditPart.VISUAL_ID:
			return getAdjPanelName_5080Parser();
		case AdjGroupBoxName2EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5075Parser();
		case AdjGroupBoxName3EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5084Parser();
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
