/*
 * 
 */
package concretemodel.diagram.providers;

import concretemodel.diagram.part.ConcretemodelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ConcretemodelDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ConcretemodelDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
