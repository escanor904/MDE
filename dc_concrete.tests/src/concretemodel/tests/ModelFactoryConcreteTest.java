/**
 */
package concretemodel.tests;

import concretemodel.ConcretemodelFactory;
import concretemodel.ModelFactoryConcrete;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Concrete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryConcreteTest extends TestCase {

	/**
	 * The fixture for this Model Factory Concrete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryConcrete fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryConcreteTest.class);
	}

	/**
	 * Constructs a new Model Factory Concrete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryConcreteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Concrete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryConcrete fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Concrete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryConcrete getFixture() {
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
		setFixture(ConcretemodelFactory.eINSTANCE.createModelFactoryConcrete());
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

} //ModelFactoryConcreteTest
