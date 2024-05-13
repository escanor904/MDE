/**
 */
package dslrelational.impl;

import dslrelational.DslrelationalPackage;
import dslrelational.Schema;
import dslrelational.Table;
import dslrelational.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getOwnedBySchema() <em>Owned By Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBySchema()
	 * @generated
	 * @ordered
	 */
	protected Schema ownedBySchema;

	/**
	 * The cached value of the '{@link #getTheTable() <em>The Table</em>}' containment reference.
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
		return ownedBySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBySchema(Schema newOwnedBySchema, NotificationChain msgs) {
		Schema oldOwnedBySchema = ownedBySchema;
		ownedBySchema = newOwnedBySchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, oldOwnedBySchema, newOwnedBySchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBySchema(Schema newOwnedBySchema) {
		if (newOwnedBySchema != ownedBySchema) {
			NotificationChain msgs = null;
			if (ownedBySchema != null)
				msgs = ((InternalEObject)ownedBySchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, null, msgs);
			if (newOwnedBySchema != null)
				msgs = ((InternalEObject)newOwnedBySchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, null, msgs);
			msgs = basicSetOwnedBySchema(newOwnedBySchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA, newOwnedBySchema, newOwnedBySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTheTable() {
		return theTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTable(Table newTheTable, NotificationChain msgs) {
		Table oldTheTable = theTable;
		theTable = newTheTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__THE_TABLE, oldTheTable, newTheTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTable(Table newTheTable) {
		if (newTheTable != theTable) {
			NotificationChain msgs = null;
			if (theTable != null)
				msgs = ((InternalEObject)theTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TRIGGER__THE_TABLE, null, msgs);
			if (newTheTable != null)
				msgs = ((InternalEObject)newTheTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslrelationalPackage.TRIGGER__THE_TABLE, null, msgs);
			msgs = basicSetTheTable(newTheTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelationalPackage.TRIGGER__THE_TABLE, newTheTable, newTheTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelationalPackage.TRIGGER__OWNED_BY_SCHEMA:
				return basicSetOwnedBySchema(null, msgs);
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				return basicSetTheTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getOwnedBySchema();
			case DslrelationalPackage.TRIGGER__THE_TABLE:
				return getTheTable();
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
