/*
 * 
 */
package uidiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramModelingAssistantProvider;

/**
 * @generated
 */
public class UidiagramModelingAssistantProviderOfUIDiagramEditPart extends UidiagramModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UidiagramElementTypes.FormUI_2001);
		return types;
	}

}
