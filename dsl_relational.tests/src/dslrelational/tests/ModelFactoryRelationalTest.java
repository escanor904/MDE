/**
 */
package dslrelational.tests;

import dslrelational.DslrelationalFactory;
import dslrelational.ModelFactoryRelational;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Relational</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryRelationalTest extends TestCase {

	/**
	 * The fixture for this Model Factory Relational test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelational fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryRelationalTest.class);
	}

	/**
	 * Constructs a new Model Factory Relational test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryRelationalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Relational test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryRelational fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Relational test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelational getFixture() {
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
		setFixture(DslrelationalFactory.eINSTANCE.createModelFactoryRelational());
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

} //ModelFactoryRelationalTest
