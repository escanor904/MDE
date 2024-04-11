/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AdjLinkLabel;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adj Link Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjLinkLabelTest extends AdjWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdjLinkLabelTest.class);
	}

	/**
	 * Constructs a new Adj Link Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjLinkLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adj Link Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdjLinkLabel getFixture() {
		return (AdjLinkLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAdjLinkLabel());
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

} //AdjLinkLabelTest
