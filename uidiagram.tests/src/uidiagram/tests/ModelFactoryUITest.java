/**
 */
package uidiagram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uidiagram.ModelFactoryUI;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory UI</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryUITest extends TestCase {

	/**
	 * The fixture for this Model Factory UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryUI fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryUITest.class);
	}

	/**
	 * Constructs a new Model Factory UI test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryUITest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryUI fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryUI getFixture() {
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
		setFixture(UidiagramFactory.eINSTANCE.createModelFactoryUI());
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

} //ModelFactoryUITest
