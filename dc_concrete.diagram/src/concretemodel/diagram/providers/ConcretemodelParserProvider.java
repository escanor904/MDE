/*
 * 
 */
package concretemodel.diagram.providers;

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

import concretemodel.ConcretemodelPackage;
import concretemodel.diagram.edit.parts.AssociationAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.AssociationAdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjRoleTargetEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjMethodNameEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.SharingAdjMultiplicitySourceClassEditPart;
import concretemodel.diagram.edit.parts.SharingAdjMultiplicityTargetClassEditPart;
import concretemodel.diagram.edit.parts.SharingAdjRoleSourceEditPart;
import concretemodel.diagram.edit.parts.SharingAdjRoleTargetEditPart;
import concretemodel.diagram.parsers.MessageFormatParser;
import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;

/**
 * @generated
 */
public class ConcretemodelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser packageConcreteAdjName_5001Parser;

	/**
	* @generated
	*/
	private IParser getPackageConcreteAdjName_5001Parser() {
		if (packageConcreteAdjName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getPackageConcreteAdj_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageConcreteAdjName_5001Parser = parser;
		}
		return packageConcreteAdjName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser classConcreteAdjName_5004Parser;

	/**
	* @generated
	*/
	private IParser getClassConcreteAdjName_5004Parser() {
		if (classConcreteAdjName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getClassConcreteAdj_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classConcreteAdjName_5004Parser = parser;
		}
		return classConcreteAdjName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeConcreteAdjName_5002Parser;

	/**
	* @generated
	*/
	private IParser getAttributeConcreteAdjName_5002Parser() {
		if (attributeConcreteAdjName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getAttributeConcreteAdj_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeConcreteAdjName_5002Parser = parser;
		}
		return attributeConcreteAdjName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser methodConcreteAdjMethodName_5003Parser;

	/**
	* @generated
	*/
	private IParser getMethodConcreteAdjMethodName_5003Parser() {
		if (methodConcreteAdjMethodName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getMethodConcreteAdj_MethodName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodConcreteAdjMethodName_5003Parser = parser;
		}
		return methodConcreteAdjMethodName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentSdjRoleSource_6001Parser;

	/**
	* @generated
	*/
	private IParser getContainmentSdjRoleSource_6001Parser() {
		if (containmentSdjRoleSource_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleSource() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentSdjRoleSource_6001Parser = parser;
		}
		return containmentSdjRoleSource_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentSdjMultiplicitySourceClass_6002Parser;

	/**
	* @generated
	*/
	private IParser getContainmentSdjMultiplicitySourceClass_6002Parser() {
		if (containmentSdjMultiplicitySourceClass_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicitySourceClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentSdjMultiplicitySourceClass_6002Parser = parser;
		}
		return containmentSdjMultiplicitySourceClass_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentSdjRoleTarget_6003Parser;

	/**
	* @generated
	*/
	private IParser getContainmentSdjRoleTarget_6003Parser() {
		if (containmentSdjRoleTarget_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleTarget() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentSdjRoleTarget_6003Parser = parser;
		}
		return containmentSdjRoleTarget_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser sharingAdjRoleSource_6004Parser;

	/**
	* @generated
	*/
	private IParser getSharingAdjRoleSource_6004Parser() {
		if (sharingAdjRoleSource_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleSource() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sharingAdjRoleSource_6004Parser = parser;
		}
		return sharingAdjRoleSource_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser sharingAdjMultiplicitySourceClass_6005Parser;

	/**
	* @generated
	*/
	private IParser getSharingAdjMultiplicitySourceClass_6005Parser() {
		if (sharingAdjMultiplicitySourceClass_6005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicitySourceClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sharingAdjMultiplicitySourceClass_6005Parser = parser;
		}
		return sharingAdjMultiplicitySourceClass_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser sharingAdjRoleTarget_6006Parser;

	/**
	* @generated
	*/
	private IParser getSharingAdjRoleTarget_6006Parser() {
		if (sharingAdjRoleTarget_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleTarget() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sharingAdjRoleTarget_6006Parser = parser;
		}
		return sharingAdjRoleTarget_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser sharingAdjMultiplicityTargetClass_6007Parser;

	/**
	* @generated
	*/
	private IParser getSharingAdjMultiplicityTargetClass_6007Parser() {
		if (sharingAdjMultiplicityTargetClass_6007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicityTargetClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sharingAdjMultiplicityTargetClass_6007Parser = parser;
		}
		return sharingAdjMultiplicityTargetClass_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser associationAdjRoleSource_6008Parser;

	/**
	* @generated
	*/
	private IParser getAssociationAdjRoleSource_6008Parser() {
		if (associationAdjRoleSource_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleSource() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationAdjRoleSource_6008Parser = parser;
		}
		return associationAdjRoleSource_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser associationAdjMultiplicitySourceClass_6009Parser;

	/**
	* @generated
	*/
	private IParser getAssociationAdjMultiplicitySourceClass_6009Parser() {
		if (associationAdjMultiplicitySourceClass_6009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicitySourceClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationAdjMultiplicitySourceClass_6009Parser = parser;
		}
		return associationAdjMultiplicitySourceClass_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser associationAdjRoleTarget_6010Parser;

	/**
	* @generated
	*/
	private IParser getAssociationAdjRoleTarget_6010Parser() {
		if (associationAdjRoleTarget_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleTarget() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationAdjRoleTarget_6010Parser = parser;
		}
		return associationAdjRoleTarget_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser associationAdjMultiplicityTargetClass_6011Parser;

	/**
	* @generated
	*/
	private IParser getAssociationAdjMultiplicityTargetClass_6011Parser() {
		if (associationAdjMultiplicityTargetClass_6011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicityTargetClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationAdjMultiplicityTargetClass_6011Parser = parser;
		}
		return associationAdjMultiplicityTargetClass_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser generalizationAdjRoleSource_6012Parser;

	/**
	* @generated
	*/
	private IParser getGeneralizationAdjRoleSource_6012Parser() {
		if (generalizationAdjRoleSource_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleSource() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationAdjRoleSource_6012Parser = parser;
		}
		return generalizationAdjRoleSource_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser generalizationAdjMultiplicitySourceClass_6013Parser;

	/**
	* @generated
	*/
	private IParser getGeneralizationAdjMultiplicitySourceClass_6013Parser() {
		if (generalizationAdjMultiplicitySourceClass_6013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicitySourceClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationAdjMultiplicitySourceClass_6013Parser = parser;
		}
		return generalizationAdjMultiplicitySourceClass_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser generalizationAdjRoleTarget_6014Parser;

	/**
	* @generated
	*/
	private IParser getGeneralizationAdjRoleTarget_6014Parser() {
		if (generalizationAdjRoleTarget_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretemodelPackage.eINSTANCE.getRelationshipAdj_RoleTarget() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationAdjRoleTarget_6014Parser = parser;
		}
		return generalizationAdjRoleTarget_6014Parser;
	}

	/**
	* @generated
	*/
	private IParser generalizationAdjMultiplicityTargetClass_6015Parser;

	/**
	* @generated
	*/
	private IParser getGeneralizationAdjMultiplicityTargetClass_6015Parser() {
		if (generalizationAdjMultiplicityTargetClass_6015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConcretemodelPackage.eINSTANCE.getRelationshipAdj_MultiplicityTargetClass() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationAdjMultiplicityTargetClass_6015Parser = parser;
		}
		return generalizationAdjMultiplicityTargetClass_6015Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageConcreteAdjNameEditPart.VISUAL_ID:
			return getPackageConcreteAdjName_5001Parser();
		case ClassConcreteAdjNameEditPart.VISUAL_ID:
			return getClassConcreteAdjName_5004Parser();
		case AttributeConcreteAdjNameEditPart.VISUAL_ID:
			return getAttributeConcreteAdjName_5002Parser();
		case MethodConcreteAdjMethodNameEditPart.VISUAL_ID:
			return getMethodConcreteAdjMethodName_5003Parser();
		case ContainmentSdjRoleSourceEditPart.VISUAL_ID:
			return getContainmentSdjRoleSource_6001Parser();
		case ContainmentSdjMultiplicitySourceClassEditPart.VISUAL_ID:
			return getContainmentSdjMultiplicitySourceClass_6002Parser();
		case ContainmentSdjRoleTargetEditPart.VISUAL_ID:
			return getContainmentSdjRoleTarget_6003Parser();
		case SharingAdjRoleSourceEditPart.VISUAL_ID:
			return getSharingAdjRoleSource_6004Parser();
		case SharingAdjMultiplicitySourceClassEditPart.VISUAL_ID:
			return getSharingAdjMultiplicitySourceClass_6005Parser();
		case SharingAdjRoleTargetEditPart.VISUAL_ID:
			return getSharingAdjRoleTarget_6006Parser();
		case SharingAdjMultiplicityTargetClassEditPart.VISUAL_ID:
			return getSharingAdjMultiplicityTargetClass_6007Parser();
		case AssociationAdjRoleSourceEditPart.VISUAL_ID:
			return getAssociationAdjRoleSource_6008Parser();
		case AssociationAdjMultiplicitySourceClassEditPart.VISUAL_ID:
			return getAssociationAdjMultiplicitySourceClass_6009Parser();
		case AssociationAdjRoleTargetEditPart.VISUAL_ID:
			return getAssociationAdjRoleTarget_6010Parser();
		case AssociationAdjMultiplicityTargetClassEditPart.VISUAL_ID:
			return getAssociationAdjMultiplicityTargetClass_6011Parser();
		case GeneralizationAdjRoleSourceEditPart.VISUAL_ID:
			return getGeneralizationAdjRoleSource_6012Parser();
		case GeneralizationAdjMultiplicitySourceClassEditPart.VISUAL_ID:
			return getGeneralizationAdjMultiplicitySourceClass_6013Parser();
		case GeneralizationAdjRoleTargetEditPart.VISUAL_ID:
			return getGeneralizationAdjRoleTarget_6014Parser();
		case GeneralizationAdjMultiplicityTargetClassEditPart.VISUAL_ID:
			return getGeneralizationAdjMultiplicityTargetClass_6015Parser();
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
			return getParser(ConcretemodelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcretemodelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcretemodelElementTypes.getElement(hint) == null) {
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
