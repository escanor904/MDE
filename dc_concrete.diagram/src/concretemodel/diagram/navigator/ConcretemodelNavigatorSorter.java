/*
* 
*/
package concretemodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;

/**
 * @generated
 */
public class ConcretemodelNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ConcretemodelNavigatorItem) {
			ConcretemodelNavigatorItem item = (ConcretemodelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConcretemodelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
