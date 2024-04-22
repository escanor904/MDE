/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagram.AdjWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adj Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getText <em>Text</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link uidiagram.impl.AdjWidgetImpl#getItalic <em>Italic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdjWidgetImpl extends EObjectImpl implements AdjWidget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected Integer positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected Integer positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected Integer fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected Boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ITALIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected Boolean italic = ITALIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.ADJ_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(Integer newPositionX) {
		Integer oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(Integer newPositionY) {
		Integer oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Integer newHeight) {
		Integer oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(Integer newFontSize) {
		Integer oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(Boolean newBold) {
		Boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(Boolean newItalic) {
		Boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.ADJ_WIDGET__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.ADJ_WIDGET__NAME:
				return getName();
			case UidiagramPackage.ADJ_WIDGET__TEXT:
				return getText();
			case UidiagramPackage.ADJ_WIDGET__POSITION_X:
				return getPositionX();
			case UidiagramPackage.ADJ_WIDGET__POSITION_Y:
				return getPositionY();
			case UidiagramPackage.ADJ_WIDGET__WIDTH:
				return getWidth();
			case UidiagramPackage.ADJ_WIDGET__HEIGHT:
				return getHeight();
			case UidiagramPackage.ADJ_WIDGET__BACKGROUND:
				return getBackground();
			case UidiagramPackage.ADJ_WIDGET__FONT_NAME:
				return getFontName();
			case UidiagramPackage.ADJ_WIDGET__FONT_SIZE:
				return getFontSize();
			case UidiagramPackage.ADJ_WIDGET__BOLD:
				return getBold();
			case UidiagramPackage.ADJ_WIDGET__ITALIC:
				return getItalic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidiagramPackage.ADJ_WIDGET__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__TEXT:
				setText((String)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__POSITION_X:
				setPositionX((Integer)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__POSITION_Y:
				setPositionY((Integer)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__WIDTH:
				setWidth((Integer)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__BACKGROUND:
				setBackground((String)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__FONT_NAME:
				setFontName((String)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__BOLD:
				setBold((Boolean)newValue);
				return;
			case UidiagramPackage.ADJ_WIDGET__ITALIC:
				setItalic((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UidiagramPackage.ADJ_WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case UidiagramPackage.ADJ_WIDGET__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UidiagramPackage.ADJ_WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.ADJ_WIDGET__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case UidiagramPackage.ADJ_WIDGET__POSITION_X:
				return POSITION_X_EDEFAULT == null ? positionX != null : !POSITION_X_EDEFAULT.equals(positionX);
			case UidiagramPackage.ADJ_WIDGET__POSITION_Y:
				return POSITION_Y_EDEFAULT == null ? positionY != null : !POSITION_Y_EDEFAULT.equals(positionY);
			case UidiagramPackage.ADJ_WIDGET__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case UidiagramPackage.ADJ_WIDGET__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case UidiagramPackage.ADJ_WIDGET__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case UidiagramPackage.ADJ_WIDGET__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case UidiagramPackage.ADJ_WIDGET__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case UidiagramPackage.ADJ_WIDGET__BOLD:
				return BOLD_EDEFAULT == null ? bold != null : !BOLD_EDEFAULT.equals(bold);
			case UidiagramPackage.ADJ_WIDGET__ITALIC:
				return ITALIC_EDEFAULT == null ? italic != null : !ITALIC_EDEFAULT.equals(italic);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", background: ");
		result.append(background);
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(')');
		return result.toString();
	}

} //AdjWidgetImpl
