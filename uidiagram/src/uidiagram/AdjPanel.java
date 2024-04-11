/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adj Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.AdjPanel#getFont <em>Font</em>}</li>
 *   <li>{@link uidiagram.AdjPanel#getLstAdjWidget <em>Lst Adj Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getAdjPanel()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface AdjPanel extends AdjWidget {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see uidiagram.UidiagramPackage#getAdjPanel_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link uidiagram.AdjPanel#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>Lst Adj Widget</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.AdjWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Adj Widget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Adj Widget</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getAdjPanel_LstAdjWidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdjWidget> getLstAdjWidget();

} // AdjPanel
