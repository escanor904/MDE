/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adj Data Grid View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.AdjDataGridView#getLstAdjDataGridViewTextBoxColumn <em>Lst Adj Data Grid View Text Box Column</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getAdjDataGridView()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface AdjDataGridView extends AdjWidget {
	/**
	 * Returns the value of the '<em><b>Lst Adj Data Grid View Text Box Column</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.AdjDataGridViewTextBoxColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Adj Data Grid View Text Box Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Adj Data Grid View Text Box Column</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getAdjDataGridView_LstAdjDataGridViewTextBoxColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdjDataGridViewTextBoxColumn> getLstAdjDataGridViewTextBoxColumn();

} // AdjDataGridView
