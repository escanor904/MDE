/**
 */
package abstractmodel.tests;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.MethodAdj;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodAdjTest extends TestCase {

	/**
	 * The fixture for this Method Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodAdj fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodAdjTest.class);
	}

	/**
	 * Constructs a new Method Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodAdjTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Method Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MethodAdj fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Method Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodAdj getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractmodelFactory.eINSTANCE.createMethodAdj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MethodAdjTest
