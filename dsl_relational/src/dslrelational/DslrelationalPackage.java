/**
 */
package dslrelational;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dslrelational.DslrelationalFactory
 * @model kind="package"
 * @generated
 */
public interface DslrelationalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslrelational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dslrelational";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dslrelational";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslrelationalPackage eINSTANCE = dslrelational.impl.DslrelationalPackageImpl.init();

	/**
	 * The meta object id for the '{@link dslrelational.impl.ModelFactoryRelationalImpl <em>Model Factory Relational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.ModelFactoryRelationalImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getModelFactoryRelational()
	 * @generated
	 */
	int MODEL_FACTORY_RELATIONAL = 0;

	/**
	 * The feature id for the '<em><b>Lst Data Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT = 0;

	/**
	 * The number of structural features of the '<em>Model Factory Relational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELATIONAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslrelational.impl.DataProjectImpl <em>Data Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.DataProjectImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getDataProject()
	 * @generated
	 */
	int DATA_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__SCHEMA = 2;

	/**
	 * The number of structural features of the '<em>Data Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dslrelational.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.SchemaImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LST_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Lst Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LST_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Lst Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LST_TRIGGER = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dslrelational.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.TableImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OWNED_BY_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Lst Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Lst Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Lst Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Lst Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_FOREIGN_KEY = 5;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link dslrelational.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.ColumnImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWNED_BY_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Lst Primary Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LST_PRIMARY_KEY = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dslrelational.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.PrimaryKeyImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__OWNED_BY_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Lst Foreign Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__LST_FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>The Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__THE_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dslrelational.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.ForeignKeyImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 6;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OWNED_BY_TABLE = 0;

	/**
	 * The feature id for the '<em><b>The Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__THE_PRIMARY_KEY = 1;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dslrelational.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.TriggerImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__STATEMENT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BODY = 3;

	/**
	 * The feature id for the '<em><b>Owned By Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_BY_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__THE_TABLE = 5;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link dslrelational.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.FunctionImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 2;

	/**
	 * The feature id for the '<em><b>Owned By Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_BY_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Lst Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LST_PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dslrelational.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelational.impl.ParameterImpl
	 * @see dslrelational.impl.DslrelationalPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Owned By Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_BY_FUNCTION = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link dslrelational.ModelFactoryRelational <em>Model Factory Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Relational</em>'.
	 * @see dslrelational.ModelFactoryRelational
	 * @generated
	 */
	EClass getModelFactoryRelational();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.ModelFactoryRelational#getLstDataProject <em>Lst Data Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Data Project</em>'.
	 * @see dslrelational.ModelFactoryRelational#getLstDataProject()
	 * @see #getModelFactoryRelational()
	 * @generated
	 */
	EReference getModelFactoryRelational_LstDataProject();

	/**
	 * Returns the meta object for class '{@link dslrelational.DataProject <em>Data Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Project</em>'.
	 * @see dslrelational.DataProject
	 * @generated
	 */
	EClass getDataProject();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.DataProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.DataProject#getName()
	 * @see #getDataProject()
	 * @generated
	 */
	EAttribute getDataProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.DataProject#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see dslrelational.DataProject#getPath()
	 * @see #getDataProject()
	 * @generated
	 */
	EAttribute getDataProject_Path();

	/**
	 * Returns the meta object for the containment reference '{@link dslrelational.DataProject#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see dslrelational.DataProject#getSchema()
	 * @see #getDataProject()
	 * @generated
	 */
	EReference getDataProject_Schema();

	/**
	 * Returns the meta object for class '{@link dslrelational.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see dslrelational.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Schema#getLstTable <em>Lst Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Table</em>'.
	 * @see dslrelational.Schema#getLstTable()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_LstTable();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Schema#getLstFunction <em>Lst Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Function</em>'.
	 * @see dslrelational.Schema#getLstFunction()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_LstFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Schema#getLstTrigger <em>Lst Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Trigger</em>'.
	 * @see dslrelational.Schema#getLstTrigger()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_LstTrigger();

	/**
	 * Returns the meta object for class '{@link dslrelational.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see dslrelational.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Table#getOwnedBySchema <em>Owned By Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Schema</em>'.
	 * @see dslrelational.Table#getOwnedBySchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_OwnedBySchema();

	/**
	 * Returns the meta object for the reference list '{@link dslrelational.Table#getLstTrigger <em>Lst Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Trigger</em>'.
	 * @see dslrelational.Table#getLstTrigger()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Table#getLstColumn <em>Lst Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Column</em>'.
	 * @see dslrelational.Table#getLstColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Table#getLstPrimaryKey <em>Lst Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Primary Key</em>'.
	 * @see dslrelational.Table#getLstPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Table#getLstForeignKey <em>Lst Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Foreign Key</em>'.
	 * @see dslrelational.Table#getLstForeignKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstForeignKey();

	/**
	 * Returns the meta object for class '{@link dslrelational.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see dslrelational.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Column#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Type</em>'.
	 * @see dslrelational.Column#getColumnType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnType();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Column#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see dslrelational.Column#getIsNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNullable();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Column#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Table</em>'.
	 * @see dslrelational.Column#getOwnedByTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_OwnedByTable();

	/**
	 * Returns the meta object for the reference list '{@link dslrelational.Column#getLstPrimaryKey <em>Lst Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Primary Key</em>'.
	 * @see dslrelational.Column#getLstPrimaryKey()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_LstPrimaryKey();

	/**
	 * Returns the meta object for class '{@link dslrelational.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see dslrelational.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.PrimaryKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Table</em>'.
	 * @see dslrelational.PrimaryKey#getOwnedByTable()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_OwnedByTable();

	/**
	 * Returns the meta object for the reference list '{@link dslrelational.PrimaryKey#getLstForeignKey <em>Lst Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Foreign Key</em>'.
	 * @see dslrelational.PrimaryKey#getLstForeignKey()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_LstForeignKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.PrimaryKey#getTheColumn <em>The Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Column</em>'.
	 * @see dslrelational.PrimaryKey#getTheColumn()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_TheColumn();

	/**
	 * Returns the meta object for class '{@link dslrelational.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see dslrelational.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.ForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Table</em>'.
	 * @see dslrelational.ForeignKey#getOwnedByTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_OwnedByTable();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.ForeignKey#getThePrimaryKey <em>The Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Primary Key</em>'.
	 * @see dslrelational.ForeignKey#getThePrimaryKey()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_ThePrimaryKey();

	/**
	 * Returns the meta object for class '{@link dslrelational.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see dslrelational.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Trigger#getStatementTime <em>Statement Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Time</em>'.
	 * @see dslrelational.Trigger#getStatementTime()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_StatementTime();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see dslrelational.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Event();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Trigger#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see dslrelational.Trigger#getBody()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Body();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Trigger#getOwnedBySchema <em>Owned By Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Schema</em>'.
	 * @see dslrelational.Trigger#getOwnedBySchema()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_OwnedBySchema();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Trigger#getTheTable <em>The Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Table</em>'.
	 * @see dslrelational.Trigger#getTheTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_TheTable();

	/**
	 * Returns the meta object for class '{@link dslrelational.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see dslrelational.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see dslrelational.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see dslrelational.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Function#getOwnedBySchema <em>Owned By Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Schema</em>'.
	 * @see dslrelational.Function#getOwnedBySchema()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_OwnedBySchema();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelational.Function#getLstParameter <em>Lst Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parameter</em>'.
	 * @see dslrelational.Function#getLstParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_LstParameter();

	/**
	 * Returns the meta object for class '{@link dslrelational.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dslrelational.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelational.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelational.Parameter#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Type</em>'.
	 * @see dslrelational.Parameter#getColumnType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ColumnType();

	/**
	 * Returns the meta object for the reference '{@link dslrelational.Parameter#getOwnedByFunction <em>Owned By Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By Function</em>'.
	 * @see dslrelational.Parameter#getOwnedByFunction()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_OwnedByFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslrelationalFactory getDslrelationalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dslrelational.impl.ModelFactoryRelationalImpl <em>Model Factory Relational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.ModelFactoryRelationalImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getModelFactoryRelational()
		 * @generated
		 */
		EClass MODEL_FACTORY_RELATIONAL = eINSTANCE.getModelFactoryRelational();

		/**
		 * The meta object literal for the '<em><b>Lst Data Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_RELATIONAL__LST_DATA_PROJECT = eINSTANCE.getModelFactoryRelational_LstDataProject();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.DataProjectImpl <em>Data Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.DataProjectImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getDataProject()
		 * @generated
		 */
		EClass DATA_PROJECT = eINSTANCE.getDataProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROJECT__NAME = eINSTANCE.getDataProject_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROJECT__PATH = eINSTANCE.getDataProject_Path();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROJECT__SCHEMA = eINSTANCE.getDataProject_Schema();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.SchemaImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LST_TABLE = eINSTANCE.getSchema_LstTable();

		/**
		 * The meta object literal for the '<em><b>Lst Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LST_FUNCTION = eINSTANCE.getSchema_LstFunction();

		/**
		 * The meta object literal for the '<em><b>Lst Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LST_TRIGGER = eINSTANCE.getSchema_LstTrigger();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.TableImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__OWNED_BY_SCHEMA = eINSTANCE.getTable_OwnedBySchema();

		/**
		 * The meta object literal for the '<em><b>Lst Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_TRIGGER = eINSTANCE.getTable_LstTrigger();

		/**
		 * The meta object literal for the '<em><b>Lst Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_COLUMN = eINSTANCE.getTable_LstColumn();

		/**
		 * The meta object literal for the '<em><b>Lst Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_PRIMARY_KEY = eINSTANCE.getTable_LstPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Lst Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_FOREIGN_KEY = eINSTANCE.getTable_LstForeignKey();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.ColumnImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_TYPE = eINSTANCE.getColumn_ColumnType();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NULLABLE = eINSTANCE.getColumn_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__OWNED_BY_TABLE = eINSTANCE.getColumn_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Lst Primary Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__LST_PRIMARY_KEY = eINSTANCE.getColumn_LstPrimaryKey();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.PrimaryKeyImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__OWNED_BY_TABLE = eINSTANCE.getPrimaryKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Lst Foreign Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__LST_FOREIGN_KEY = eINSTANCE.getPrimaryKey_LstForeignKey();

		/**
		 * The meta object literal for the '<em><b>The Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__THE_COLUMN = eINSTANCE.getPrimaryKey_TheColumn();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.ForeignKeyImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>The Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__THE_PRIMARY_KEY = eINSTANCE.getForeignKey_ThePrimaryKey();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.TriggerImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Statement Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__STATEMENT_TIME = eINSTANCE.getTrigger_StatementTime();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__BODY = eINSTANCE.getTrigger_Body();

		/**
		 * The meta object literal for the '<em><b>Owned By Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__OWNED_BY_SCHEMA = eINSTANCE.getTrigger_OwnedBySchema();

		/**
		 * The meta object literal for the '<em><b>The Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__THE_TABLE = eINSTANCE.getTrigger_TheTable();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.FunctionImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Owned By Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OWNED_BY_SCHEMA = eINSTANCE.getFunction_OwnedBySchema();

		/**
		 * The meta object literal for the '<em><b>Lst Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LST_PARAMETER = eINSTANCE.getFunction_LstParameter();

		/**
		 * The meta object literal for the '{@link dslrelational.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelational.impl.ParameterImpl
		 * @see dslrelational.impl.DslrelationalPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COLUMN_TYPE = eINSTANCE.getParameter_ColumnType();

		/**
		 * The meta object literal for the '<em><b>Owned By Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OWNED_BY_FUNCTION = eINSTANCE.getParameter_OwnedByFunction();

	}

} //DslrelationalPackage
