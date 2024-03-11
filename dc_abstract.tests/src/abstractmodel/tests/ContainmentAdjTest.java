/**
 */
package abstractmodel.tests;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.ContainmentAdj;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Containment Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentAdjTest extends RelationshipAdjTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainmentAdjTest.class);
	}

	/**
	 * Constructs a new Containment Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentAdjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Containment Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainmentAdj getFixture() {
		return (ContainmentAdj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractmodelFactory.eINSTANCE.createContainmentAdj());
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

} //ContainmentAdjTest
