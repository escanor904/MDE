/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7031;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7030;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem item = (UidiagramNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UidiagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
