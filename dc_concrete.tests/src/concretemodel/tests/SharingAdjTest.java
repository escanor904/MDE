/**
 */
package concretemodel.tests;

import concretemodel.ConcretemodelFactory;
import concretemodel.SharingAdj;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sharing Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharingAdjTest extends RelationshipAdjTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SharingAdjTest.class);
	}

	/**
	 * Constructs a new Sharing Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingAdjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sharing Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SharingAdj getFixture() {
		return (SharingAdj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretemodelFactory.eINSTANCE.createSharingAdj());
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

} //SharingAdjTest
