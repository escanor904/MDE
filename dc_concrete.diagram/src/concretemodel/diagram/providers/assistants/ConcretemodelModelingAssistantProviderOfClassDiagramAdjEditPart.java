/*
 * 
 */
package concretemodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concretemodel.diagram.providers.ConcretemodelElementTypes;
import concretemodel.diagram.providers.ConcretemodelModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretemodelModelingAssistantProviderOfClassDiagramAdjEditPart
		extends ConcretemodelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretemodelElementTypes.PackageConcreteAdj_2001);
		types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		return types;
	}

}
