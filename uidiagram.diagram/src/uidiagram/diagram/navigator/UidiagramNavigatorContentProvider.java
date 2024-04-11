/*
* 
*/
package uidiagram.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import uidiagram.diagram.edit.parts.*;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public UidiagramNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, UIDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {

		case UIDiagramEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FormUIEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGridEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjDataGridViewEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry.getType(
					AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjPanelEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjDataGridView2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry.getType(
					AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjPanel2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjGroupBoxEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjDataGridView3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry.getType(
					AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjPanel3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjMenuStripEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjDataGridView4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry.getType(
					AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjPanel4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjToolStripEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjDataGridView5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry.getType(
					AdjDataGridViewAdjDataGridViewLstAdjDataGridViewTextBoxColumnCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridViewTextBoxColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjPanel5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStripEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjGroupBox2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjGroupBox3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjMenuStrip2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjGroupBox4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjToolStrip2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjMenuStrip3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjMenuStrip4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjToolStrip3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjToolStrip4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjGroupBox5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjMenuStrip5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjMenuStripAdjMenuStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjToolStrip5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDatepicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjCheckedListBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjLinkLabel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRichTextBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjTreeView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPropertyGrid5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjProgressBar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjDataGridView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjMenuStrip3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjToolStripAdjToolStripLstAdjWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjToolStrip4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return UIDiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new UidiagramNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof UidiagramAbstractNavigatorItem) {
			UidiagramAbstractNavigatorItem abstractNavigatorItem = (UidiagramAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
