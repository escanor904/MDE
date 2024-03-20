/*
 * 
 */
package concretemodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concretemodel.diagram.edit.parts.ClassConcreteAdjEditPart;
import concretemodel.diagram.providers.ConcretemodelElementTypes;
import concretemodel.diagram.providers.ConcretemodelModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretemodelModelingAssistantProviderOfClassConcreteAdjEditPart
		extends ConcretemodelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretemodelElementTypes.AttributeConcreteAdj_3001);
		types.add(ConcretemodelElementTypes.MethodConcreteAdj_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClassConcreteAdjEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClassConcreteAdjEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ConcretemodelElementTypes.ContainmentSdj_4001);
		types.add(ConcretemodelElementTypes.SharingAdj_4002);
		types.add(ConcretemodelElementTypes.AssociationAdj_4003);
		types.add(ConcretemodelElementTypes.GeneralizationAdj_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClassConcreteAdjEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClassConcreteAdjEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClassConcreteAdjEditPart) {
			types.add(ConcretemodelElementTypes.ContainmentSdj_4001);
		}
		if (targetEditPart instanceof ClassConcreteAdjEditPart) {
			types.add(ConcretemodelElementTypes.SharingAdj_4002);
		}
		if (targetEditPart instanceof ClassConcreteAdjEditPart) {
			types.add(ConcretemodelElementTypes.AssociationAdj_4003);
		}
		if (targetEditPart instanceof ClassConcreteAdjEditPart) {
			types.add(ConcretemodelElementTypes.GeneralizationAdj_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClassConcreteAdjEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClassConcreteAdjEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretemodelElementTypes.ContainmentSdj_4001) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.SharingAdj_4002) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.AssociationAdj_4003) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.GeneralizationAdj_4004) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClassConcreteAdjEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClassConcreteAdjEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ConcretemodelElementTypes.ContainmentSdj_4001);
		types.add(ConcretemodelElementTypes.SharingAdj_4002);
		types.add(ConcretemodelElementTypes.AssociationAdj_4003);
		types.add(ConcretemodelElementTypes.GeneralizationAdj_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClassConcreteAdjEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClassConcreteAdjEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretemodelElementTypes.ContainmentSdj_4001) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.SharingAdj_4002) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.AssociationAdj_4003) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		} else if (relationshipType == ConcretemodelElementTypes.GeneralizationAdj_4004) {
			types.add(ConcretemodelElementTypes.ClassConcreteAdj_2002);
		}
		return types;
	}

}
