/**
 */
package dslrelational.impl;

import dslrelational.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslrelationalFactoryImpl extends EFactoryImpl implements DslrelationalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslrelationalFactory init() {
		try {
			DslrelationalFactory theDslrelationalFactory = (DslrelationalFactory)EPackage.Registry.INSTANCE.getEFactory(DslrelationalPackage.eNS_URI);
			if (theDslrelationalFactory != null) {
				return theDslrelationalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslrelationalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslrelationalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DslrelationalPackage.MODEL_FACTORY_RELATIONAL: return createModelFactoryRelational();
			case DslrelationalPackage.DATA_PROJECT: return createDataProject();
			case DslrelationalPackage.SCHEMA: return createSchema();
			case DslrelationalPackage.TABLE: return createTable();
			case DslrelationalPackage.COLUMN: return createColumn();
			case DslrelationalPackage.PRIMARY_KEY: return createPrimaryKey();
			case DslrelationalPackage.FOREIGN_KEY: return createForeignKey();
			case DslrelationalPackage.TRIGGER: return createTrigger();
			case DslrelationalPackage.FUNCTION: return createFunction();
			case DslrelationalPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryRelational createModelFactoryRelational() {
		ModelFactoryRelationalImpl modelFactoryRelational = new ModelFactoryRelationalImpl();
		return modelFactoryRelational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProject createDataProject() {
		DataProjectImpl dataProject = new DataProjectImpl();
		return dataProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslrelationalPackage getDslrelationalPackage() {
		return (DslrelationalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslrelationalPackage getPackage() {
		return DslrelationalPackage.eINSTANCE;
	}

} //DslrelationalFactoryImpl
