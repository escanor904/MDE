/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AdjPropertyGrid;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adj Property Grid</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjPropertyGridTest extends AdjWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdjPropertyGridTest.class);
	}

	/**
	 * Constructs a new Adj Property Grid test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjPropertyGridTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adj Property Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdjPropertyGrid getFixture() {
		return (AdjPropertyGrid)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAdjPropertyGrid());
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

} //AdjPropertyGridTest
