/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AdjRichTextBox;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adj Rich Text Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjRichTextBoxTest extends AdjWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdjRichTextBoxTest.class);
	}

	/**
	 * Constructs a new Adj Rich Text Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjRichTextBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adj Rich Text Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdjRichTextBox getFixture() {
		return (AdjRichTextBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAdjRichTextBox());
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

} //AdjRichTextBoxTest
