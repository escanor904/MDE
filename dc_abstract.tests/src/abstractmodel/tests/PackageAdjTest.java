/**
 */
package abstractmodel.tests;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.PackageAdj;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageAdjTest extends TestCase {

	/**
	 * The fixture for this Package Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAdj fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageAdjTest.class);
	}

	/**
	 * Constructs a new Package Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAdjTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Package Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PackageAdj fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Package Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAdj getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractmodelFactory.eINSTANCE.createPackageAdj());
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

} //PackageAdjTest
