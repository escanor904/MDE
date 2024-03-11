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
import concretemodel.diagram.edit.parts.AttributeConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjMethodNameEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjNameEditPart;
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
