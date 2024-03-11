/**
 */
package concretemodel.tests;

import concretemodel.ConcretemodelFactory;
import concretemodel.ContainmentSdj;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Containment Sdj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentSdjTest extends RelationshipAdjTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainmentSdjTest.class);
	}

	/**
	 * Constructs a new Containment Sdj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentSdjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Containment Sdj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainmentSdj getFixture() {
		return (ContainmentSdj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretemodelFactory.eINSTANCE.createContainmentSdj());
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

} //ContainmentSdjTest
