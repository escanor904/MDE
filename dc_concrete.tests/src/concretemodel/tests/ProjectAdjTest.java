/**
 */
package concretemodel.tests;

import concretemodel.ConcretemodelFactory;
import concretemodel.ProjectAdj;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Adj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectAdjTest extends TestCase {

	/**
	 * The fixture for this Project Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectAdj fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectAdjTest.class);
	}

	/**
	 * Constructs a new Project Adj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectAdjTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectAdj fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project Adj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectAdj getFixture() {
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
		setFixture(ConcretemodelFactory.eINSTANCE.createProjectAdj());
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

} //ProjectAdjTest
