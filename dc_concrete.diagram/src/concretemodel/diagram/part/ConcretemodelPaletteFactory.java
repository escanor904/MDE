
/*
 * 
 */
package concretemodel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concretemodel.diagram.providers.ConcretemodelElementTypes;

/**
 * @generated
 */
public class ConcretemodelPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributeConcreteAdj1CreationTool());
		paletteContainer.add(createClassConcreteAdj2CreationTool());
		paletteContainer.add(createMethodConcreteAdj3CreationTool());
		paletteContainer.add(createPackageConcreteAdj4CreationTool());
		paletteContainer.add(createParameterConcreteAdj5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociationAdj1CreationTool());
		paletteContainer.add(createContainmentSdj2CreationTool());
		paletteContainer.add(createGeneralizationAdj3CreationTool());
		paletteContainer.add(createSharingAdj4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeConcreteAdj1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AttributeConcreteAdj1CreationTool_title,
				Messages.AttributeConcreteAdj1CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.AttributeConcreteAdj_3001));
		entry.setId("createAttributeConcreteAdj1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.AttributeConcreteAdj_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassConcreteAdj2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ClassConcreteAdj2CreationTool_title,
				Messages.ClassConcreteAdj2CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.ClassConcreteAdj_2002));
		entry.setId("createClassConcreteAdj2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.ClassConcreteAdj_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodConcreteAdj3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MethodConcreteAdj3CreationTool_title,
				Messages.MethodConcreteAdj3CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.MethodConcreteAdj_3002));
		entry.setId("createMethodConcreteAdj3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.MethodConcreteAdj_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageConcreteAdj4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PackageConcreteAdj4CreationTool_title,
				Messages.PackageConcreteAdj4CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.PackageConcreteAdj_2001));
		entry.setId("createPackageConcreteAdj4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.PackageConcreteAdj_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameterConcreteAdj5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ParameterConcreteAdj5CreationTool_title,
				Messages.ParameterConcreteAdj5CreationTool_desc, null, null) {
		};
		entry.setId("createParameterConcreteAdj5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociationAdj1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AssociationAdj1CreationTool_title,
				Messages.AssociationAdj1CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.AssociationAdj_4003));
		entry.setId("createAssociationAdj1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.AssociationAdj_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainmentSdj2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ContainmentSdj2CreationTool_title,
				Messages.ContainmentSdj2CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.ContainmentSdj_4001));
		entry.setId("createContainmentSdj2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.ContainmentSdj_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneralizationAdj3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.GeneralizationAdj3CreationTool_title,
				Messages.GeneralizationAdj3CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.GeneralizationAdj_4004));
		entry.setId("createGeneralizationAdj3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.GeneralizationAdj_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSharingAdj4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SharingAdj4CreationTool_title,
				Messages.SharingAdj4CreationTool_desc,
				Collections.singletonList(ConcretemodelElementTypes.SharingAdj_4002));
		entry.setId("createSharingAdj4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretemodelElementTypes.getImageDescriptor(ConcretemodelElementTypes.SharingAdj_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
