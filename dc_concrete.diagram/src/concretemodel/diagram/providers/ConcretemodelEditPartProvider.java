/*
 * 
 */
package concretemodel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;
import concretemodel.diagram.edit.parts.ConcretemodelEditPartFactory;
import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;

/**
 * @generated
 */
public class ConcretemodelEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ConcretemodelEditPartProvider() {
		super(new ConcretemodelEditPartFactory(), ConcretemodelVisualIDRegistry.TYPED_INSTANCE,
				ClassDiagramAdjEditPart.MODEL_ID);
	}

}
