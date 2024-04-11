/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AdjCheckedListBox;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adj Checked List Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjCheckedListBoxTest extends AdjWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdjCheckedListBoxTest.class);
	}

	/**
	 * Constructs a new Adj Checked List Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjCheckedListBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adj Checked List Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdjCheckedListBox getFixture() {
		return (AdjCheckedListBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAdjCheckedListBox());
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

} //AdjCheckedListBoxTest
