/**
 */
package abstractmodel.tests;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.AssociationAdj;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationAdjTest extends RelationshipAdjTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationAdjTest.class);
	}

	/**
	 * Constructs a new Association Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationAdjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociationAdj getFixture() {
		return (AssociationAdj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractmodelFactory.eINSTANCE.createAssociationAdj());
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

} //AssociationAdjTest
