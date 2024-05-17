/**
 */
package dslrelational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.Trigger#getStatementTime <em>Statement Time</em>}</li>
 *   <li>{@link dslrelational.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link dslrelational.Trigger#getBody <em>Body</em>}</li>
 *   <li>{@link dslrelational.Trigger#getOwnedBySchema <em>Owned By Schema</em>}</li>
 *   <li>{@link dslrelational.Trigger#getTheTable <em>The Table</em>}</li>
 * </ul>
 *
 * @see dslrelational.DslrelationalPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dslrelational.DslrelationalPackage#getTrigger_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Statement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Time</em>' attribute.
	 * @see #setStatementTime(String)
	 * @see dslrelational.DslrelationalPackage#getTrigger_StatementTime()
	 * @model
	 * @generated
	 */
	String getStatementTime();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getStatementTime <em>Statement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Time</em>' attribute.
	 * @see #getStatementTime()
	 * @generated
	 */
	void setStatementTime(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see dslrelational.DslrelationalPackage#getTrigger_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see dslrelational.DslrelationalPackage#getTrigger_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Schema</em>' reference.
	 * @see #setOwnedBySchema(Schema)
	 * @see dslrelational.DslrelationalPackage#getTrigger_OwnedBySchema()
	 * @model
	 * @generated
	 */
	Schema getOwnedBySchema();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getOwnedBySchema <em>Owned By Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Schema</em>' reference.
	 * @see #getOwnedBySchema()
	 * @generated
	 */
	void setOwnedBySchema(Schema value);

	/**
	 * Returns the value of the '<em><b>The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Table</em>' reference.
	 * @see #setTheTable(Table)
	 * @see dslrelational.DslrelationalPackage#getTrigger_TheTable()
	 * @model
	 * @generated
	 */
	Table getTheTable();

	/**
	 * Sets the value of the '{@link dslrelational.Trigger#getTheTable <em>The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Table</em>' reference.
	 * @see #getTheTable()
	 * @generated
	 */
	void setTheTable(Table value);

} // Trigger
