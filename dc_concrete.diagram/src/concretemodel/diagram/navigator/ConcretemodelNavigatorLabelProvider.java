/*
* 
*/
package concretemodel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concretemodel.AssociationAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ContainmentSdj;
import concretemodel.GeneralizationAdj;
import concretemodel.SharingAdj;
import concretemodel.diagram.edit.parts.AssociationAdj2EditPart;
import concretemodel.diagram.edit.parts.AssociationAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.AttributeConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.ClassConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;
import concretemodel.diagram.edit.parts.ContainmentSdj2EditPart;
import concretemodel.diagram.edit.parts.ContainmentSdjEditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdj2EditPart;
import concretemodel.diagram.edit.parts.GeneralizationAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.MethodConcreteAdjMethodNameEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjEditPart;
import concretemodel.diagram.edit.parts.PackageConcreteAdjNameEditPart;
import concretemodel.diagram.edit.parts.SharingAdj2EditPart;
import concretemodel.diagram.edit.parts.SharingAdjEditPart;
import concretemodel.diagram.part.ConcretemodelDiagramEditorPlugin;
import concretemodel.diagram.part.ConcretemodelVisualIDRegistry;
import concretemodel.diagram.providers.ConcretemodelElementTypes;
import concretemodel.diagram.providers.ConcretemodelParserProvider;

/**
 * @generated
 */
public class ConcretemodelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretemodelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretemodelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretemodelNavigatorItem
				&& !isOwnView(((ConcretemodelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretemodelNavigatorGroup) {
			ConcretemodelNavigatorGroup group = (ConcretemodelNavigatorGroup) element;
			return ConcretemodelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretemodelNavigatorItem) {
			ConcretemodelNavigatorItem navigatorItem = (ConcretemodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://concretemodel?ClassDiagramAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.ClassDiagramAdj_1000);
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concretemodel?PackageConcreteAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.PackageConcreteAdj_2001);
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concretemodel?ClassConcreteAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.ClassConcreteAdj_2002);
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://concretemodel?AttributeConcreteAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.AttributeConcreteAdj_3001);
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://concretemodel?MethodConcreteAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.MethodConcreteAdj_3002);
		case ContainmentSdjEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?ContainmentSdj", //$NON-NLS-1$
					ConcretemodelElementTypes.ContainmentSdj_4001);
		case ContainmentSdj2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?ContainmentSdj", //$NON-NLS-1$
					ConcretemodelElementTypes.ContainmentSdj_4002);
		case SharingAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?SharingAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.SharingAdj_4003);
		case SharingAdj2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?SharingAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.SharingAdj_4004);
		case AssociationAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?AssociationAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.AssociationAdj_4005);
		case AssociationAdj2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?AssociationAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.AssociationAdj_4006);
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?GeneralizationAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.GeneralizationAdj_4007);
		case GeneralizationAdj2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://concretemodel?GeneralizationAdj", //$NON-NLS-1$
					ConcretemodelElementTypes.GeneralizationAdj_4008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretemodelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretemodelElementTypes.isKnownElementType(elementType)) {
			image = ConcretemodelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcretemodelNavigatorGroup) {
			ConcretemodelNavigatorGroup group = (ConcretemodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretemodelNavigatorItem) {
			ConcretemodelNavigatorItem navigatorItem = (ConcretemodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcretemodelVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramAdjEditPart.VISUAL_ID:
			return getClassDiagramAdj_1000Text(view);
		case PackageConcreteAdjEditPart.VISUAL_ID:
			return getPackageConcreteAdj_2001Text(view);
		case ClassConcreteAdjEditPart.VISUAL_ID:
			return getClassConcreteAdj_2002Text(view);
		case AttributeConcreteAdjEditPart.VISUAL_ID:
			return getAttributeConcreteAdj_3001Text(view);
		case MethodConcreteAdjEditPart.VISUAL_ID:
			return getMethodConcreteAdj_3002Text(view);
		case ContainmentSdjEditPart.VISUAL_ID:
			return getContainmentSdj_4001Text(view);
		case ContainmentSdj2EditPart.VISUAL_ID:
			return getContainmentSdj_4002Text(view);
		case SharingAdjEditPart.VISUAL_ID:
			return getSharingAdj_4003Text(view);
		case SharingAdj2EditPart.VISUAL_ID:
			return getSharingAdj_4004Text(view);
		case AssociationAdjEditPart.VISUAL_ID:
			return getAssociationAdj_4005Text(view);
		case AssociationAdj2EditPart.VISUAL_ID:
			return getAssociationAdj_4006Text(view);
		case GeneralizationAdjEditPart.VISUAL_ID:
			return getGeneralizationAdj_4007Text(view);
		case GeneralizationAdj2EditPart.VISUAL_ID:
			return getGeneralizationAdj_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getClassDiagramAdj_1000Text(View view) {
		ClassDiagramAdj domainModelElement = (ClassDiagramAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageConcreteAdj_2001Text(View view) {
		IParser parser = ConcretemodelParserProvider.getParser(ConcretemodelElementTypes.PackageConcreteAdj_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretemodelVisualIDRegistry.getType(PackageConcreteAdjNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassConcreteAdj_2002Text(View view) {
		IParser parser = ConcretemodelParserProvider.getParser(ConcretemodelElementTypes.ClassConcreteAdj_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcretemodelVisualIDRegistry.getType(ClassConcreteAdjNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeConcreteAdj_3001Text(View view) {
		IParser parser = ConcretemodelParserProvider.getParser(ConcretemodelElementTypes.AttributeConcreteAdj_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretemodelVisualIDRegistry.getType(AttributeConcreteAdjNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethodConcreteAdj_3002Text(View view) {
		IParser parser = ConcretemodelParserProvider.getParser(ConcretemodelElementTypes.MethodConcreteAdj_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretemodelVisualIDRegistry.getType(MethodConcreteAdjMethodNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainmentSdj_4001Text(View view) {
		ContainmentSdj domainModelElement = (ContainmentSdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainmentSdj_4002Text(View view) {
		ContainmentSdj domainModelElement = (ContainmentSdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSharingAdj_4003Text(View view) {
		SharingAdj domainModelElement = (SharingAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSharingAdj_4004Text(View view) {
		SharingAdj domainModelElement = (SharingAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationAdj_4005Text(View view) {
		AssociationAdj domainModelElement = (AssociationAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationAdj_4006Text(View view) {
		AssociationAdj domainModelElement = (AssociationAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeneralizationAdj_4007Text(View view) {
		GeneralizationAdj domainModelElement = (GeneralizationAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeneralizationAdj_4008Text(View view) {
		GeneralizationAdj domainModelElement = (GeneralizationAdj) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRoleTarget();
		} else {
			ConcretemodelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ClassDiagramAdjEditPart.MODEL_ID.equals(ConcretemodelVisualIDRegistry.getModelID(view));
	}

}
