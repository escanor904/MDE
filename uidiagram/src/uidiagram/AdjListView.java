/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adj List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.AdjListView#getLstAdjListViewColumn <em>Lst Adj List View Column</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getAdjListView()
 * @model annotation="gmf.node label='text'"
 * @generated
 */
public interface AdjListView extends AdjWidget {
	/**
	 * Returns the value of the '<em><b>Lst Adj List View Column</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.AdjListViewColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Adj List View Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Adj List View Column</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getAdjListView_LstAdjListViewColumn()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<AdjListViewColumn> getLstAdjListViewColumn();

} // AdjListView
