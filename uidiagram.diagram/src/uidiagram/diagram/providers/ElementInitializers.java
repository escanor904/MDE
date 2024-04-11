/*
 * 
 */
package uidiagram.diagram.providers;

import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

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
		ElementInitializers cached = UidiagramDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UidiagramDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
