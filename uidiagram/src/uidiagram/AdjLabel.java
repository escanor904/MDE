/**
 */
package uidiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adj Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.AdjLabel#getFont <em>Font</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getAdjLabel()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface AdjLabel extends AdjWidget {
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
	 * @see uidiagram.UidiagramPackage#getAdjLabel_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link uidiagram.AdjLabel#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

} // AdjLabel
