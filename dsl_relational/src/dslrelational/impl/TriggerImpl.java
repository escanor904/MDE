/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Schema;
import dslrelational.Table;
import dslrelational.Trigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelational.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelational.impl.TriggerImpl#getStatementTime <em>Statement Time</em>}</li>
 *   <li>{@link dslrelational.impl.TriggerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link dslrelational.impl.TriggerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link dslrelational.impl.TriggerImpl#getOwnedBySchema <em>Owned By Schema</em>}</li>
 *   <li>{@link dslrelational.impl.TriggerImpl#getTheTable <em>The Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends EObjectImpl implements Trigger {
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
	 * The default value of the '{@link #getStatementTime() <em>Statement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementTime()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementTime() <em>Statement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementTime()
	 * @generated
	 * @ordered
	 */
	protected String statementTime = STATEMENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedBySchema() <em>Owned By Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBySchema()
	 * @generated
	 * @ordered
	 */
	protected Schema ownedBySchema;

	/**
	 * The cached value of the '{@link #getTheTable() <em>The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTable()
	 * @generated
	 * @ordered
	 */
	protected Table theTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelationalPackage.Literals.TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementTime() {
		return statementTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementTime(String newStatementTime) {
		String oldStatementTime = statementTime;
		statementTime = newStatementTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__STATEMENT_TIME, oldStatementTime, statementTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getOwnedBySchema() {
		if (ownedBySchema != null && ownedBySchema.eIsProxy()) {
			InternalEObject oldOwnedBySchema = (InternalEObject)ownedBySchema;
			ownedBySchema = (Schema)eResolveProxy(oldOwnedBySchema);
			if (ownedBySchema != oldOwnedBySchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, oldOwnedBySchema, ownedBySchema));
			}
		}
		return ownedBySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetOwnedBySchema() {
		return ownedBySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBySchema(Schema newOwnedBySchema) {
		Schema oldOwnedBySchema = ownedBySchema;
		ownedBySchema = newOwnedBySchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, oldOwnedBySchema, ownedBySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTheTable() {
		if (theTable != null && theTable.eIsProxy()) {
			InternalEObject oldTheTable = (InternalEObject)theTable;
			theTable = (Table)eResolveProxy(oldTheTable);
			if (theTable != oldTheTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelationalPackage.TRIGGER__THE_TABLE, oldTheTable, theTable));
			}
		}
		return theTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTheTable() {
		return theTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTable(Table newTheTable) {
		Table oldTheTable = theTable;
		theTable = newTheTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__THE_TABLE, oldTheTable, theTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelationalPackage.TRIGGER__NAME:
				return getName();
			case DslrelationalPackage.TRIGGER__STATEMENT_TIME:
				return getStatementTime();
			case DslrelationalPackage.TRIGGER__EVENT:
				return getEvent();
			case DslrelationalPackage.TRIGGER__BODY:
				return getBody();
			case DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA:
				if (resolve) return getOwnedBySchema();
				return basicGetOwnedBySchema();
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				if (resolve) return getTheTable();
				return basicGetTheTable();
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
			case DslrelationalPackage.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case DslrelationalPackage.TRIGGER__STATEMENT_TIME:
				setStatementTime((String)newValue);
				return;
			case DslrelationalPackage.TRIGGER__EVENT:
				setEvent((String)newValue);
				return;
			case DslrelationalPackage.TRIGGER__BODY:
				setBody((String)newValue);
				return;
			case DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)newValue);
				return;
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				setTheTable((Table)newValue);
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
			case DslrelationalPackage.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelationalPackage.TRIGGER__STATEMENT_TIME:
				setStatementTime(STATEMENT_TIME_EDEFAULT);
				return;
			case DslrelationalPackage.TRIGGER__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case DslrelationalPackage.TRIGGER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA:
				setOwnedBySchema((Schema)null);
				return;
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				setTheTable((Table)null);
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
			case DslrelationalPackage.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelationalPackage.TRIGGER__STATEMENT_TIME:
				return STATEMENT_TIME_EDEFAULT == null ? statementTime != null : !STATEMENT_TIME_EDEFAULT.equals(statementTime);
			case DslrelationalPackage.TRIGGER__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
			case DslrelationalPackage.TRIGGER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA:
				return ownedBySchema != null;
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				return theTable != null;
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
		result.append(", statementTime: ");
		result.append(statementTime);
		result.append(", event: ");
		result.append(event);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
