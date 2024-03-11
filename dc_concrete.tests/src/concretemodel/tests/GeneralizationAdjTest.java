/**
 */
package concretemodel.tests;

import concretemodel.ConcretemodelFactory;
import concretemodel.GeneralizationAdj;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizationAdjTest extends RelationshipAdjTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneralizationAdjTest.class);
	}

	/**
	 * Constructs a new Generalization Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationAdjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generalization Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneralizationAdj getFixture() {
		return (GeneralizationAdj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretemodelFactory.eINSTANCE.createGeneralizationAdj());
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

} //GeneralizationAdjTest
