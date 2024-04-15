
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
		paletteContainer.add(createAdjComboBox4CreationTool());
		paletteContainer.add(createAdjDateTimePicker5CreationTool());
		paletteContainer.add(createAdjGroupBox6CreationTool());
		paletteContainer.add(createAdjLabel7CreationTool());
		paletteContainer.add(createAdjLinkLabel8CreationTool());
		paletteContainer.add(createAdjListBox9CreationTool());
		paletteContainer.add(createAdjListView10CreationTool());
		paletteContainer.add(createAdjListViewColumn11CreationTool());
		paletteContainer.add(createAdjPanel12CreationTool());
		paletteContainer.add(createAdjPictureBox13CreationTool());
		paletteContainer.add(createAdjRadioButton14CreationTool());
		paletteContainer.add(createAdjRichTextBox15CreationTool());
		paletteContainer.add(createAdjTextBox16CreationTool());
		paletteContainer.add(createFormUI17CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjButton_3003);
		types.add(UidiagramElementTypes.AdjButton_3018);
		types.add(UidiagramElementTypes.AdjButton_3033);
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjCheckBox_3002);
		types.add(UidiagramElementTypes.AdjCheckBox_3017);
		types.add(UidiagramElementTypes.AdjCheckBox_3032);
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3007);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3022);
		types.add(UidiagramElementTypes.AdjCheckedListBox_3037);
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
	private ToolEntry createAdjComboBox4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjComboBox_3087);
		types.add(UidiagramElementTypes.AdjComboBox_3088);
		types.add(UidiagramElementTypes.AdjComboBox_3089);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjComboBox4CreationTool_title,
				Messages.AdjComboBox4CreationTool_desc, types);
		entry.setId("createAdjComboBox4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjComboBox_3087));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjDateTimePicker5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjDateTimePicker_3098);
		types.add(UidiagramElementTypes.AdjDateTimePicker_3101);
		types.add(UidiagramElementTypes.AdjDateTimePicker_3104);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjDateTimePicker5CreationTool_title,
				Messages.AdjDateTimePicker5CreationTool_desc, types);
		entry.setId("createAdjDateTimePicker5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjDateTimePicker_3098));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjGroupBox6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjGroupBox_3030);
		types.add(UidiagramElementTypes.AdjGroupBox_3076);
		types.add(UidiagramElementTypes.AdjGroupBox_3084);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjGroupBox6CreationTool_title,
				Messages.AdjGroupBox6CreationTool_desc, types);
		entry.setId("createAdjGroupBox6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjGroupBox_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjLabel7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjLabel_3001);
		types.add(UidiagramElementTypes.AdjLabel_3016);
		types.add(UidiagramElementTypes.AdjLabel_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjLabel7CreationTool_title,
				Messages.AdjLabel7CreationTool_desc, types);
		entry.setId("createAdjLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjLabel_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjLinkLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjLinkLabel_3008);
		types.add(UidiagramElementTypes.AdjLinkLabel_3023);
		types.add(UidiagramElementTypes.AdjLinkLabel_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjLinkLabel8CreationTool_title,
				Messages.AdjLinkLabel8CreationTool_desc, types);
		entry.setId("createAdjLinkLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjLinkLabel_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjListBox9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjListBox_3004);
		types.add(UidiagramElementTypes.AdjListBox_3019);
		types.add(UidiagramElementTypes.AdjListBox_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjListBox9CreationTool_title,
				Messages.AdjListBox9CreationTool_desc, types);
		entry.setId("createAdjListBox9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjListBox_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjListView10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjListView_3092);
		types.add(UidiagramElementTypes.AdjListView_3094);
		types.add(UidiagramElementTypes.AdjListView_3095);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjListView10CreationTool_title,
				Messages.AdjListView10CreationTool_desc, types);
		entry.setId("createAdjListView10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjListView_3092));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjListViewColumn11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjListViewColumn11CreationTool_title,
				Messages.AdjListViewColumn11CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.AdjListViewColumn_3093));
		entry.setId("createAdjListViewColumn11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjListViewColumn_3093));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjPanel12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjPanel_3015);
		types.add(UidiagramElementTypes.AdjPanel_3029);
		types.add(UidiagramElementTypes.AdjPanel_3044);
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
	private ToolEntry createAdjPictureBox13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjPictureBox_3100);
		types.add(UidiagramElementTypes.AdjPictureBox_3103);
		types.add(UidiagramElementTypes.AdjPictureBox_3106);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjPictureBox13CreationTool_title,
				Messages.AdjPictureBox13CreationTool_desc, types);
		entry.setId("createAdjPictureBox13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjPictureBox_3100));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjRadioButton14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjRadioButton_3099);
		types.add(UidiagramElementTypes.AdjRadioButton_3102);
		types.add(UidiagramElementTypes.AdjRadioButton_3105);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdjRadioButton14CreationTool_title,
				Messages.AdjRadioButton14CreationTool_desc, types);
		entry.setId("createAdjRadioButton14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AdjRadioButton_3099));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdjRichTextBox15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjRichTextBox_3009);
		types.add(UidiagramElementTypes.AdjRichTextBox_3024);
		types.add(UidiagramElementTypes.AdjRichTextBox_3039);
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.AdjTextBox_3006);
		types.add(UidiagramElementTypes.AdjTextBox_3021);
		types.add(UidiagramElementTypes.AdjTextBox_3036);
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
	private ToolEntry createFormUI17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FormUI17CreationTool_title,
				Messages.FormUI17CreationTool_desc, Collections.singletonList(UidiagramElementTypes.FormUI_2001));
		entry.setId("createFormUI17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.FormUI_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
