
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAdjButton1CreationTool());
		paletteContainer.add(createAdjCheckBox2CreationTool());
		paletteContainer.add(createAdjCheckedListBox3CreationTool());
		paletteContainer.add(createAdjDataGridView4CreationTool());
		paletteContainer.add(createAdjDataGridViewTextBoxColumn5CreationTool());
		paletteContainer.add(createAdjDatepicker6CreationTool());
		paletteContainer.add(createAdjGroupBox7CreationTool());
		paletteContainer.add(createAdjLabel8CreationTool());
		paletteContainer.add(createAdjLinkLabel9CreationTool());
		paletteContainer.add(createAdjListBox10CreationTool());
		paletteContainer.add(createAdjMenuStrip11CreationTool());
		paletteContainer.add(createAdjPanel12CreationTool());
		paletteContainer.add(createAdjProgressBar13CreationTool());
		paletteContainer.add(createAdjPropertyGrid14CreationTool());
		paletteContainer.add(createAdjRichTextBox15CreationTool());
		paletteContainer.add(createAdjTextBox16CreationTool());
		paletteContainer.add(createAdjToolStrip17CreationTool());
		paletteContainer.add(createAdjTreeView18CreationTool());
		paletteContainer.add(createFormUI19CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjButton_3003);
		types.add(UidiagramElementTypes.AdjButton_3018);
		types.add(UidiagramElementTypes.AdjButton_3033);
		types.add(UidiagramElementTypes.AdjButton_3048);
		types.add(UidiagramElementTypes.AdjButton_3063);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjButton1CreationTool_title,
				Messages.AdjButton1CreationTool_desc, types);
		entry.setId("createAdjButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjButton_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjCheckBox_3002);
		types.add(UidiagramElementTypes.AdjCheckBox_3017);
		types.add(UidiagramElementTypes.AdjCheckBox_3032);
		types.add(UidiagramElementTypes.AdjCheckBox_3047);
		types.add(UidiagramElementTypes.AdjCheckBox_3062);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjCheckBox2CreationTool_title,
				Messages.AdjCheckBox2CreationTool_desc, types);
		entry.setId("createAdjCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjCheckBox_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjCheckedListBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3007);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3022);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3037);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3052);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3067);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjCheckedListBox3CreationTool_title,
				Messages.AdjCheckedListBox3CreationTool_desc, types);
		entry.setId("createAdjCheckedListBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjCheckedListBox_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjDataGridView4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjDataGridView_3013);
		types.add(UidiagramElementTypes.AdjDataGridView_3028);
		types.add(UidiagramElementTypes.AdjDataGridView_3043);
		types.add(UidiagramElementTypes.AdjDataGridView_3058);
		types.add(UidiagramElementTypes.AdjDataGridView_3073);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjDataGridView4CreationTool_title,
				Messages.AdjDataGridView4CreationTool_desc, types);
		entry.setId("createAdjDataGridView4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjDataGridView_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjDataGridViewTextBoxColumn5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjDataGridViewTextBoxColumn5CreationTool_title,
				Messages.AdjDataGridViewTextBoxColumn5CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.AdjDataGridViewTextBoxColumn_3014));
		entry.setId("createAdjDataGridViewTextBoxColumn5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjDataGridViewTextBoxColumn_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjDatepicker6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjDatepicker_3005);
		types.add(UidiagramElementTypes.AdjDatepicker_3020);
		types.add(UidiagramElementTypes.AdjDatepicker_3035);
		types.add(UidiagramElementTypes.AdjDatepicker_3050);
		types.add(UidiagramElementTypes.AdjDatepicker_3065);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjDatepicker6CreationTool_title,
				Messages.AdjDatepicker6CreationTool_desc, types);
		entry.setId("createAdjDatepicker6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjDatepicker_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjGroupBox7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjGroupBox_3030);
		types.add(UidiagramElementTypes.AdjGroupBox_3075);
		types.add(UidiagramElementTypes.AdjGroupBox_3076);
		types.add(UidiagramElementTypes.AdjGroupBox_3078);
		types.add(UidiagramElementTypes.AdjGroupBox_3084);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjGroupBox7CreationTool_title,
				Messages.AdjGroupBox7CreationTool_desc, types);
		entry.setId("createAdjGroupBox7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjGroupBox_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjLabel_3001);
		types.add(UidiagramElementTypes.AdjLabel_3016);
		types.add(UidiagramElementTypes.AdjLabel_3031);
		types.add(UidiagramElementTypes.AdjLabel_3046);
		types.add(UidiagramElementTypes.AdjLabel_3061);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjLabel8CreationTool_title,
				Messages.AdjLabel8CreationTool_desc, types);
		entry.setId("createAdjLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjLabel_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjLinkLabel9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjLinkLabel_3008);
		types.add(UidiagramElementTypes.AdjLinkLabel_3023);
		types.add(UidiagramElementTypes.AdjLinkLabel_3038);
		types.add(UidiagramElementTypes.AdjLinkLabel_3053);
		types.add(UidiagramElementTypes.AdjLinkLabel_3068);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjLinkLabel9CreationTool_title,
				Messages.AdjLinkLabel9CreationTool_desc, types);
		entry.setId("createAdjLinkLabel9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjLinkLabel_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjListBox10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjListBox_3004);
		types.add(UidiagramElementTypes.AdjListBox_3019);
		types.add(UidiagramElementTypes.AdjListBox_3034);
		types.add(UidiagramElementTypes.AdjListBox_3049);
		types.add(UidiagramElementTypes.AdjListBox_3064);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjListBox10CreationTool_title,
				Messages.AdjListBox10CreationTool_desc, types);
		entry.setId("createAdjListBox10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjListBox_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjMenuStrip11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjMenuStrip_3045);
		types.add(UidiagramElementTypes.AdjMenuStrip_3077);
		types.add(UidiagramElementTypes.AdjMenuStrip_3080);
		types.add(UidiagramElementTypes.AdjMenuStrip_3081);
		types.add(UidiagramElementTypes.AdjMenuStrip_3085);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjMenuStrip11CreationTool_title,
				Messages.AdjMenuStrip11CreationTool_desc, types);
		entry.setId("createAdjMenuStrip11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjMenuStrip_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjPanel12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjPanel_3015);
		types.add(UidiagramElementTypes.AdjPanel_3029);
		types.add(UidiagramElementTypes.AdjPanel_3044);
		types.add(UidiagramElementTypes.AdjPanel_3059);
		types.add(UidiagramElementTypes.AdjPanel_3074);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjPanel12CreationTool_title,
				Messages.AdjPanel12CreationTool_desc, types);
		entry.setId("createAdjPanel12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjPanel_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjProgressBar13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjProgressBar_3012);
		types.add(UidiagramElementTypes.AdjProgressBar_3027);
		types.add(UidiagramElementTypes.AdjProgressBar_3042);
		types.add(UidiagramElementTypes.AdjProgressBar_3057);
		types.add(UidiagramElementTypes.AdjProgressBar_3072);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjProgressBar13CreationTool_title,
				Messages.AdjProgressBar13CreationTool_desc, types);
		entry.setId("createAdjProgressBar13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjProgressBar_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjPropertyGrid14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjPropertyGrid_3011);
		types.add(UidiagramElementTypes.AdjPropertyGrid_3026);
		types.add(UidiagramElementTypes.AdjPropertyGrid_3041);
		types.add(UidiagramElementTypes.AdjPropertyGrid_3056);
		types.add(UidiagramElementTypes.AdjPropertyGrid_3071);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjPropertyGrid14CreationTool_title,
				Messages.AdjPropertyGrid14CreationTool_desc, types);
		entry.setId("createAdjPropertyGrid14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjPropertyGrid_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjRichTextBox15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjRichTextBox_3009);
		types.add(UidiagramElementTypes.AdjRichTextBox_3024);
		types.add(UidiagramElementTypes.AdjRichTextBox_3039);
		types.add(UidiagramElementTypes.AdjRichTextBox_3054);
		types.add(UidiagramElementTypes.AdjRichTextBox_3069);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjRichTextBox15CreationTool_title,
				Messages.AdjRichTextBox15CreationTool_desc, types);
		entry.setId("createAdjRichTextBox15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjRichTextBox_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjTextBox16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjTextBox_3006);
		types.add(UidiagramElementTypes.AdjTextBox_3021);
		types.add(UidiagramElementTypes.AdjTextBox_3036);
		types.add(UidiagramElementTypes.AdjTextBox_3051);
		types.add(UidiagramElementTypes.AdjTextBox_3066);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjTextBox16CreationTool_title,
				Messages.AdjTextBox16CreationTool_desc, types);
		entry.setId("createAdjTextBox16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjTextBox_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjToolStrip17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjToolStrip_3060);
		types.add(UidiagramElementTypes.AdjToolStrip_3079);
		types.add(UidiagramElementTypes.AdjToolStrip_3082);
		types.add(UidiagramElementTypes.AdjToolStrip_3083);
		types.add(UidiagramElementTypes.AdjToolStrip_3086);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjToolStrip17CreationTool_title,
				Messages.AdjToolStrip17CreationTool_desc, types);
		entry.setId("createAdjToolStrip17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjToolStrip_3060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjTreeView18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.AdjTreeView_3010);
		types.add(UidiagramElementTypes.AdjTreeView_3025);
		types.add(UidiagramElementTypes.AdjTreeView_3040);
		types.add(UidiagramElementTypes.AdjTreeView_3055);
		types.add(UidiagramElementTypes.AdjTreeView_3070);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjTreeView18CreationTool_title,
				Messages.AdjTreeView18CreationTool_desc, types);
		entry.setId("createAdjTreeView18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjTreeView_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFormUI19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FormUI19CreationTool_title,
				Messages.FormUI19CreationTool_desc, Collections.singletonList(UidiagramElementTypes.FormUI_2001));
		entry.setId("createFormUI19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.FormUI_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
