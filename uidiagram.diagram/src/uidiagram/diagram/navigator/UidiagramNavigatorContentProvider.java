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

import uidiagram.diagram.edit.parts.AdjButton2EditPart;
import uidiagram.diagram.edit.parts.AdjButton3EditPart;
import uidiagram.diagram.edit.parts.AdjButtonEditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckBoxEditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjCheckedListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjComboBox2EditPart;
import uidiagram.diagram.edit.parts.AdjComboBox3EditPart;
import uidiagram.diagram.edit.parts.AdjComboBoxEditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker2EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePicker3EditPart;
import uidiagram.diagram.edit.parts.AdjDateTimePickerEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBox3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjGroupBoxEditPart;
import uidiagram.diagram.edit.parts.AdjLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLabelEditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel2EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabel3EditPart;
import uidiagram.diagram.edit.parts.AdjLinkLabelEditPart;
import uidiagram.diagram.edit.parts.AdjListBox2EditPart;
import uidiagram.diagram.edit.parts.AdjListBox3EditPart;
import uidiagram.diagram.edit.parts.AdjListBoxEditPart;
import uidiagram.diagram.edit.parts.AdjListView2EditPart;
import uidiagram.diagram.edit.parts.AdjListView3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjListViewColumnEditPart;
import uidiagram.diagram.edit.parts.AdjListViewEditPart;
import uidiagram.diagram.edit.parts.AdjPanel2EditPart;
import uidiagram.diagram.edit.parts.AdjPanel3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.AdjPanelEditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox2EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBox3EditPart;
import uidiagram.diagram.edit.parts.AdjPictureBoxEditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton2EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButton3EditPart;
import uidiagram.diagram.edit.parts.AdjRadioButtonEditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjRichTextBoxEditPart;
import uidiagram.diagram.edit.parts.AdjTextBox2EditPart;
import uidiagram.diagram.edit.parts.AdjTextBox3EditPart;
import uidiagram.diagram.edit.parts.AdjTextBoxEditPart;
import uidiagram.diagram.edit.parts.FormUIEditPart;
import uidiagram.diagram.edit.parts.FormUIFormUILstAdjWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePickerEditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(FormUIFormUILstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox3EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker3EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AdjPanelAdjPanelLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker3EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjDateTimePicker3EditPart.VISUAL_ID));
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
					UidiagramVisualIDRegistry.getType(AdjComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjRadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPictureBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjPanel3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjGroupBoxAdjGroupBoxLstAdjWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjGroupBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjListViewEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjListViewAdjListViewLstAdjListViewColumnCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListViewColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjListView2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjListViewAdjListViewLstAdjListViewColumnCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListViewColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AdjListView3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(AdjListViewAdjListViewLstAdjListViewColumnCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AdjListViewColumnEditPart.VISUAL_ID));
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
