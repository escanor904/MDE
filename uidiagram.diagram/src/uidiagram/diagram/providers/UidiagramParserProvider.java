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
import uidiagram.diagram.edit.parts.AdjButtonName4EditPart;
import uidiagram.diagram.edit.parts.AdjButtonName5EditPart;
import uidiagram.diagram.edit.parts.AdjButtonNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewName2EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewName3EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewName4EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewName5EditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewNameEditPart;
import uidiagram.diagram.edit.parts.AdjDataGridViewTextBoxColumnNameEditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerName2EditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerName3EditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerName4EditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerName5EditPart;
import uidiagram.diagram.edit.parts.AdjDatepickerNameEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName4EditPart;
import uidiagram.diagram.edit.parts.AdjLabelName5EditPart;
import uidiagram.diagram.edit.parts.AdjLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName4EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelName5EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelNameEditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripName2EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripName3EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripName4EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripName5EditPart;
import uidiagram.diagram.edit.parts.AdjMenuStripNameEditPart;
import uidiagram.diagram.edit.parts.AdjPanelName2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName4EditPart;
import uidiagram.diagram.edit.parts.AdjPanelName5EditPart;
import uidiagram.diagram.edit.parts.AdjPanelNameEditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarName2EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarName3EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarName4EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarName5EditPart;
import uidiagram.diagram.edit.parts.AdjProgressBarNameEditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridName2EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridName3EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridName4EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridName5EditPart;
import uidiagram.diagram.edit.parts.AdjPropertyGridNameEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName4EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxName5EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxNameEditPart;
import uidiagram.diagram.edit.parts.AdjToolStripName2EditPart;
import uidiagram.diagram.edit.parts.AdjToolStripName3EditPart;
import uidiagram.diagram.edit.parts.AdjToolStripName4EditPart;
import uidiagram.diagram.edit.parts.AdjToolStripName5EditPart;
import uidiagram.diagram.edit.parts.AdjToolStripNameEditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewName2EditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewName3EditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewName4EditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewName5EditPart;
import uidiagram.diagram.edit.parts.AdjTreeViewNameEditPart;
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
	private IParser adjDatepickerName_5005Parser;

	/**
	* @generated
	*/
	private IParser getAdjDatepickerName_5005Parser() {
		if (adjDatepickerName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDatepickerName_5005Parser = parser;
		}
		return adjDatepickerName_5005Parser;
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
	private IParser adjTreeViewName_5010Parser;

	/**
	* @generated
	*/
	private IParser getAdjTreeViewName_5010Parser() {
		if (adjTreeViewName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTreeViewName_5010Parser = parser;
		}
		return adjTreeViewName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPropertyGridName_5011Parser;

	/**
	* @generated
	*/
	private IParser getAdjPropertyGridName_5011Parser() {
		if (adjPropertyGridName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPropertyGridName_5011Parser = parser;
		}
		return adjPropertyGridName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser adjProgressBarName_5012Parser;

	/**
	* @generated
	*/
	private IParser getAdjProgressBarName_5012Parser() {
		if (adjProgressBarName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjProgressBarName_5012Parser = parser;
		}
		return adjProgressBarName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewName_5014Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewName_5014Parser() {
		if (adjDataGridViewName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewName_5014Parser = parser;
		}
		return adjDataGridViewName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewTextBoxColumnName_5013Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewTextBoxColumnName_5013Parser() {
		if (adjDataGridViewTextBoxColumnName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					UidiagramPackage.eINSTANCE.getAdjDataGridViewTextBoxColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewTextBoxColumnName_5013Parser = parser;
		}
		return adjDataGridViewTextBoxColumnName_5013Parser;
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
	private IParser adjDatepickerName_5019Parser;

	/**
	* @generated
	*/
	private IParser getAdjDatepickerName_5019Parser() {
		if (adjDatepickerName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDatepickerName_5019Parser = parser;
		}
		return adjDatepickerName_5019Parser;
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
	private IParser adjTreeViewName_5024Parser;

	/**
	* @generated
	*/
	private IParser getAdjTreeViewName_5024Parser() {
		if (adjTreeViewName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTreeViewName_5024Parser = parser;
		}
		return adjTreeViewName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPropertyGridName_5025Parser;

	/**
	* @generated
	*/
	private IParser getAdjPropertyGridName_5025Parser() {
		if (adjPropertyGridName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPropertyGridName_5025Parser = parser;
		}
		return adjPropertyGridName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser adjProgressBarName_5026Parser;

	/**
	* @generated
	*/
	private IParser getAdjProgressBarName_5026Parser() {
		if (adjProgressBarName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjProgressBarName_5026Parser = parser;
		}
		return adjProgressBarName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewName_5027Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewName_5027Parser() {
		if (adjDataGridViewName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewName_5027Parser = parser;
		}
		return adjDataGridViewName_5027Parser;
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
	private IParser adjDatepickerName_5032Parser;

	/**
	* @generated
	*/
	private IParser getAdjDatepickerName_5032Parser() {
		if (adjDatepickerName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDatepickerName_5032Parser = parser;
		}
		return adjDatepickerName_5032Parser;
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
	private IParser adjTreeViewName_5037Parser;

	/**
	* @generated
	*/
	private IParser getAdjTreeViewName_5037Parser() {
		if (adjTreeViewName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTreeViewName_5037Parser = parser;
		}
		return adjTreeViewName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPropertyGridName_5038Parser;

	/**
	* @generated
	*/
	private IParser getAdjPropertyGridName_5038Parser() {
		if (adjPropertyGridName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPropertyGridName_5038Parser = parser;
		}
		return adjPropertyGridName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser adjProgressBarName_5039Parser;

	/**
	* @generated
	*/
	private IParser getAdjProgressBarName_5039Parser() {
		if (adjProgressBarName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjProgressBarName_5039Parser = parser;
		}
		return adjProgressBarName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewName_5040Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewName_5040Parser() {
		if (adjDataGridViewName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewName_5040Parser = parser;
		}
		return adjDataGridViewName_5040Parser;
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
	private IParser adjMenuStripName_5079Parser;

	/**
	* @generated
	*/
	private IParser getAdjMenuStripName_5079Parser() {
		if (adjMenuStripName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjMenuStripName_5079Parser = parser;
		}
		return adjMenuStripName_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelName_5041Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelName_5041Parser() {
		if (adjLabelName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelName_5041Parser = parser;
		}
		return adjLabelName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxName_5042Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxName_5042Parser() {
		if (adjCheckBoxName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxName_5042Parser = parser;
		}
		return adjCheckBoxName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonName_5043Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonName_5043Parser() {
		if (adjButtonName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonName_5043Parser = parser;
		}
		return adjButtonName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxName_5044Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxName_5044Parser() {
		if (adjListBoxName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxName_5044Parser = parser;
		}
		return adjListBoxName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDatepickerName_5045Parser;

	/**
	* @generated
	*/
	private IParser getAdjDatepickerName_5045Parser() {
		if (adjDatepickerName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDatepickerName_5045Parser = parser;
		}
		return adjDatepickerName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxName_5046Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxName_5046Parser() {
		if (adjTextBoxName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxName_5046Parser = parser;
		}
		return adjTextBoxName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxName_5047Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxName_5047Parser() {
		if (adjCheckedListBoxName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxName_5047Parser = parser;
		}
		return adjCheckedListBoxName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelName_5048Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelName_5048Parser() {
		if (adjLinkLabelName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelName_5048Parser = parser;
		}
		return adjLinkLabelName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxName_5049Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxName_5049Parser() {
		if (adjRichTextBoxName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxName_5049Parser = parser;
		}
		return adjRichTextBoxName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTreeViewName_5050Parser;

	/**
	* @generated
	*/
	private IParser getAdjTreeViewName_5050Parser() {
		if (adjTreeViewName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTreeViewName_5050Parser = parser;
		}
		return adjTreeViewName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPropertyGridName_5051Parser;

	/**
	* @generated
	*/
	private IParser getAdjPropertyGridName_5051Parser() {
		if (adjPropertyGridName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPropertyGridName_5051Parser = parser;
		}
		return adjPropertyGridName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser adjProgressBarName_5052Parser;

	/**
	* @generated
	*/
	private IParser getAdjProgressBarName_5052Parser() {
		if (adjProgressBarName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjProgressBarName_5052Parser = parser;
		}
		return adjProgressBarName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewName_5053Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewName_5053Parser() {
		if (adjDataGridViewName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewName_5053Parser = parser;
		}
		return adjDataGridViewName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelName_5078Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelName_5078Parser() {
		if (adjPanelName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelName_5078Parser = parser;
		}
		return adjPanelName_5078Parser;
	}

	/**
	* @generated
	*/
	private IParser adjToolStripName_5077Parser;

	/**
	* @generated
	*/
	private IParser getAdjToolStripName_5077Parser() {
		if (adjToolStripName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjToolStripName_5077Parser = parser;
		}
		return adjToolStripName_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLabelName_5054Parser;

	/**
	* @generated
	*/
	private IParser getAdjLabelName_5054Parser() {
		if (adjLabelName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLabelName_5054Parser = parser;
		}
		return adjLabelName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckBoxName_5055Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckBoxName_5055Parser() {
		if (adjCheckBoxName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckBoxName_5055Parser = parser;
		}
		return adjCheckBoxName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser adjButtonName_5056Parser;

	/**
	* @generated
	*/
	private IParser getAdjButtonName_5056Parser() {
		if (adjButtonName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjButtonName_5056Parser = parser;
		}
		return adjButtonName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser adjListBoxName_5057Parser;

	/**
	* @generated
	*/
	private IParser getAdjListBoxName_5057Parser() {
		if (adjListBoxName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjListBoxName_5057Parser = parser;
		}
		return adjListBoxName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDatepickerName_5058Parser;

	/**
	* @generated
	*/
	private IParser getAdjDatepickerName_5058Parser() {
		if (adjDatepickerName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDatepickerName_5058Parser = parser;
		}
		return adjDatepickerName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTextBoxName_5059Parser;

	/**
	* @generated
	*/
	private IParser getAdjTextBoxName_5059Parser() {
		if (adjTextBoxName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTextBoxName_5059Parser = parser;
		}
		return adjTextBoxName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser adjCheckedListBoxName_5060Parser;

	/**
	* @generated
	*/
	private IParser getAdjCheckedListBoxName_5060Parser() {
		if (adjCheckedListBoxName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjCheckedListBoxName_5060Parser = parser;
		}
		return adjCheckedListBoxName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser adjLinkLabelName_5061Parser;

	/**
	* @generated
	*/
	private IParser getAdjLinkLabelName_5061Parser() {
		if (adjLinkLabelName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjLinkLabelName_5061Parser = parser;
		}
		return adjLinkLabelName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser adjRichTextBoxName_5062Parser;

	/**
	* @generated
	*/
	private IParser getAdjRichTextBoxName_5062Parser() {
		if (adjRichTextBoxName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjRichTextBoxName_5062Parser = parser;
		}
		return adjRichTextBoxName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser adjTreeViewName_5063Parser;

	/**
	* @generated
	*/
	private IParser getAdjTreeViewName_5063Parser() {
		if (adjTreeViewName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjTreeViewName_5063Parser = parser;
		}
		return adjTreeViewName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPropertyGridName_5064Parser;

	/**
	* @generated
	*/
	private IParser getAdjPropertyGridName_5064Parser() {
		if (adjPropertyGridName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPropertyGridName_5064Parser = parser;
		}
		return adjPropertyGridName_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser adjProgressBarName_5065Parser;

	/**
	* @generated
	*/
	private IParser getAdjProgressBarName_5065Parser() {
		if (adjProgressBarName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjProgressBarName_5065Parser = parser;
		}
		return adjProgressBarName_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser adjDataGridViewName_5066Parser;

	/**
	* @generated
	*/
	private IParser getAdjDataGridViewName_5066Parser() {
		if (adjDataGridViewName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjDataGridViewName_5066Parser = parser;
		}
		return adjDataGridViewName_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser adjPanelName_5067Parser;

	/**
	* @generated
	*/
	private IParser getAdjPanelName_5067Parser() {
		if (adjPanelName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjPanelName_5067Parser = parser;
		}
		return adjPanelName_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxName_5076Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxName_5076Parser() {
		if (adjGroupBoxName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxName_5076Parser = parser;
		}
		return adjGroupBoxName_5076Parser;
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
	private IParser adjMenuStripName_5074Parser;

	/**
	* @generated
	*/
	private IParser getAdjMenuStripName_5074Parser() {
		if (adjMenuStripName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjMenuStripName_5074Parser = parser;
		}
		return adjMenuStripName_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser adjGroupBoxName_5073Parser;

	/**
	* @generated
	*/
	private IParser getAdjGroupBoxName_5073Parser() {
		if (adjGroupBoxName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjGroupBoxName_5073Parser = parser;
		}
		return adjGroupBoxName_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser adjToolStripName_5072Parser;

	/**
	* @generated
	*/
	private IParser getAdjToolStripName_5072Parser() {
		if (adjToolStripName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjToolStripName_5072Parser = parser;
		}
		return adjToolStripName_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser adjMenuStripName_5071Parser;

	/**
	* @generated
	*/
	private IParser getAdjMenuStripName_5071Parser() {
		if (adjMenuStripName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjMenuStripName_5071Parser = parser;
		}
		return adjMenuStripName_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser adjMenuStripName_5070Parser;

	/**
	* @generated
	*/
	private IParser getAdjMenuStripName_5070Parser() {
		if (adjMenuStripName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjMenuStripName_5070Parser = parser;
		}
		return adjMenuStripName_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser adjToolStripName_5069Parser;

	/**
	* @generated
	*/
	private IParser getAdjToolStripName_5069Parser() {
		if (adjToolStripName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjToolStripName_5069Parser = parser;
		}
		return adjToolStripName_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser adjToolStripName_5068Parser;

	/**
	* @generated
	*/
	private IParser getAdjToolStripName_5068Parser() {
		if (adjToolStripName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjToolStripName_5068Parser = parser;
		}
		return adjToolStripName_5068Parser;
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
	private IParser adjMenuStripName_5085Parser;

	/**
	* @generated
	*/
	private IParser getAdjMenuStripName_5085Parser() {
		if (adjMenuStripName_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjMenuStripName_5085Parser = parser;
		}
		return adjMenuStripName_5085Parser;
	}

	/**
	* @generated
	*/
	private IParser adjToolStripName_5086Parser;

	/**
	* @generated
	*/
	private IParser getAdjToolStripName_5086Parser() {
		if (adjToolStripName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getAdjWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adjToolStripName_5086Parser = parser;
		}
		return adjToolStripName_5086Parser;
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
		case AdjDatepickerNameEditPart.VISUAL_ID:
			return getAdjDatepickerName_5005Parser();
		case AdjTextBoxNameEditPart.VISUAL_ID:
			return getAdjTextBoxName_5006Parser();
		case AdjCheckedListBoxNameEditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5007Parser();
		case AdjLinkLabelNameEditPart.VISUAL_ID:
			return getAdjLinkLabelName_5008Parser();
		case AdjRichTextBoxNameEditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5009Parser();
		case AdjTreeViewNameEditPart.VISUAL_ID:
			return getAdjTreeViewName_5010Parser();
		case AdjPropertyGridNameEditPart.VISUAL_ID:
			return getAdjPropertyGridName_5011Parser();
		case AdjProgressBarNameEditPart.VISUAL_ID:
			return getAdjProgressBarName_5012Parser();
		case AdjDataGridViewNameEditPart.VISUAL_ID:
			return getAdjDataGridViewName_5014Parser();
		case AdjDataGridViewTextBoxColumnNameEditPart.VISUAL_ID:
			return getAdjDataGridViewTextBoxColumnName_5013Parser();
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
		case AdjDatepickerName2EditPart.VISUAL_ID:
			return getAdjDatepickerName_5019Parser();
		case AdjTextBoxName2EditPart.VISUAL_ID:
			return getAdjTextBoxName_5020Parser();
		case AdjCheckedListBoxName2EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5021Parser();
		case AdjLinkLabelName2EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5022Parser();
		case AdjRichTextBoxName2EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5023Parser();
		case AdjTreeViewName2EditPart.VISUAL_ID:
			return getAdjTreeViewName_5024Parser();
		case AdjPropertyGridName2EditPart.VISUAL_ID:
			return getAdjPropertyGridName_5025Parser();
		case AdjProgressBarName2EditPart.VISUAL_ID:
			return getAdjProgressBarName_5026Parser();
		case AdjDataGridViewName2EditPart.VISUAL_ID:
			return getAdjDataGridViewName_5027Parser();
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
		case AdjDatepickerName3EditPart.VISUAL_ID:
			return getAdjDatepickerName_5032Parser();
		case AdjTextBoxName3EditPart.VISUAL_ID:
			return getAdjTextBoxName_5033Parser();
		case AdjCheckedListBoxName3EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5034Parser();
		case AdjLinkLabelName3EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5035Parser();
		case AdjRichTextBoxName3EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5036Parser();
		case AdjTreeViewName3EditPart.VISUAL_ID:
			return getAdjTreeViewName_5037Parser();
		case AdjPropertyGridName3EditPart.VISUAL_ID:
			return getAdjPropertyGridName_5038Parser();
		case AdjProgressBarName3EditPart.VISUAL_ID:
			return getAdjProgressBarName_5039Parser();
		case AdjDataGridViewName3EditPart.VISUAL_ID:
			return getAdjDataGridViewName_5040Parser();
		case AdjPanelName3EditPart.VISUAL_ID:
			return getAdjPanelName_5080Parser();
		case AdjMenuStripNameEditPart.VISUAL_ID:
			return getAdjMenuStripName_5079Parser();
		case AdjLabelName4EditPart.VISUAL_ID:
			return getAdjLabelName_5041Parser();
		case AdjCheckBoxName4EditPart.VISUAL_ID:
			return getAdjCheckBoxName_5042Parser();
		case AdjButtonName4EditPart.VISUAL_ID:
			return getAdjButtonName_5043Parser();
		case AdjListBoxName4EditPart.VISUAL_ID:
			return getAdjListBoxName_5044Parser();
		case AdjDatepickerName4EditPart.VISUAL_ID:
			return getAdjDatepickerName_5045Parser();
		case AdjTextBoxName4EditPart.VISUAL_ID:
			return getAdjTextBoxName_5046Parser();
		case AdjCheckedListBoxName4EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5047Parser();
		case AdjLinkLabelName4EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5048Parser();
		case AdjRichTextBoxName4EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5049Parser();
		case AdjTreeViewName4EditPart.VISUAL_ID:
			return getAdjTreeViewName_5050Parser();
		case AdjPropertyGridName4EditPart.VISUAL_ID:
			return getAdjPropertyGridName_5051Parser();
		case AdjProgressBarName4EditPart.VISUAL_ID:
			return getAdjProgressBarName_5052Parser();
		case AdjDataGridViewName4EditPart.VISUAL_ID:
			return getAdjDataGridViewName_5053Parser();
		case AdjPanelName4EditPart.VISUAL_ID:
			return getAdjPanelName_5078Parser();
		case AdjToolStripNameEditPart.VISUAL_ID:
			return getAdjToolStripName_5077Parser();
		case AdjLabelName5EditPart.VISUAL_ID:
			return getAdjLabelName_5054Parser();
		case AdjCheckBoxName5EditPart.VISUAL_ID:
			return getAdjCheckBoxName_5055Parser();
		case AdjButtonName5EditPart.VISUAL_ID:
			return getAdjButtonName_5056Parser();
		case AdjListBoxName5EditPart.VISUAL_ID:
			return getAdjListBoxName_5057Parser();
		case AdjDatepickerName5EditPart.VISUAL_ID:
			return getAdjDatepickerName_5058Parser();
		case AdjTextBoxName5EditPart.VISUAL_ID:
			return getAdjTextBoxName_5059Parser();
		case AdjCheckedListBoxName5EditPart.VISUAL_ID:
			return getAdjCheckedListBoxName_5060Parser();
		case AdjLinkLabelName5EditPart.VISUAL_ID:
			return getAdjLinkLabelName_5061Parser();
		case AdjRichTextBoxName5EditPart.VISUAL_ID:
			return getAdjRichTextBoxName_5062Parser();
		case AdjTreeViewName5EditPart.VISUAL_ID:
			return getAdjTreeViewName_5063Parser();
		case AdjPropertyGridName5EditPart.VISUAL_ID:
			return getAdjPropertyGridName_5064Parser();
		case AdjProgressBarName5EditPart.VISUAL_ID:
			return getAdjProgressBarName_5065Parser();
		case AdjDataGridViewName5EditPart.VISUAL_ID:
			return getAdjDataGridViewName_5066Parser();
		case AdjPanelName5EditPart.VISUAL_ID:
			return getAdjPanelName_5067Parser();
		case AdjGroupBoxName2EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5076Parser();
		case AdjGroupBoxName3EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5075Parser();
		case AdjMenuStripName2EditPart.VISUAL_ID:
			return getAdjMenuStripName_5074Parser();
		case AdjGroupBoxName4EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5073Parser();
		case AdjToolStripName2EditPart.VISUAL_ID:
			return getAdjToolStripName_5072Parser();
		case AdjMenuStripName3EditPart.VISUAL_ID:
			return getAdjMenuStripName_5071Parser();
		case AdjMenuStripName4EditPart.VISUAL_ID:
			return getAdjMenuStripName_5070Parser();
		case AdjToolStripName3EditPart.VISUAL_ID:
			return getAdjToolStripName_5069Parser();
		case AdjToolStripName4EditPart.VISUAL_ID:
			return getAdjToolStripName_5068Parser();
		case AdjGroupBoxName5EditPart.VISUAL_ID:
			return getAdjGroupBoxName_5084Parser();
		case AdjMenuStripName5EditPart.VISUAL_ID:
			return getAdjMenuStripName_5085Parser();
		case AdjToolStripName5EditPart.VISUAL_ID:
			return getAdjToolStripName_5086Parser();
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
