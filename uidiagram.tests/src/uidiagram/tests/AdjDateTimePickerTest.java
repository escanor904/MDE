/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AdjDateTimePicker;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adj Date Time Picker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjDateTimePickerTest extends AdjWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdjDateTimePickerTest.class);
	}

	/**
	 * Constructs a new Adj Date Time Picker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjDateTimePickerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adj Date Time Picker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdjDateTimePicker getFixture() {
		return (AdjDateTimePicker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAdjDateTimePicker());
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

} //AdjDateTimePickerTest
