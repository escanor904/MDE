package generator.views;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Widget;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.AbstractmodelPackage;
import abstractmodel.AssociationAdj;
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;
import abstractmodel.AttributeTypeFactoryAdj;
import abstractmodel.ClassAdj;
import abstractmodel.ContainmentAdj;
import abstractmodel.GeneralizationAdj;
import abstractmodel.MethodAdj;
import abstractmodel.ModelFactoryAbstract;
import abstractmodel.PackageAdj;
import abstractmodel.ParameterAdj;
import abstractmodel.SharingAdj;
import abstractmodel.impl.AbstractmodelFactoryImpl;
import abstractmodel.impl.AttributeAdjImpl;
import concretemodel.AttributeConcreteAdj;
import concretemodel.AttributeTypeConcreteAdj;
import concretemodel.ClassConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.ConcretemodelFactory;
import concretemodel.ConcretemodelPackage;
import concretemodel.MethodConcreteAdj;
import concretemodel.ModelFactoryConcrete;
import concretemodel.PackageConcreteAdj;
import concretemodel.ParameterConcreteAdj;
import concretemodel.ProjectAdj;
import concretemodel.RelationshipAdj;
import dslrelational.Column;
import dslrelational.DataProject;
import dslrelational.DslrelationalFactory;
import dslrelational.ForeignKey;
import dslrelational.Function;
import dslrelational.ModelFactoryRelational;
import dslrelational.Parameter;
import dslrelational.PrimaryKey;
import dslrelational.Schema;
import dslrelational.Table;
import uidiagram.AdjButton;
import uidiagram.AdjCheckBox;
import uidiagram.AdjCheckedListBox;
import uidiagram.AdjComboBox;
import uidiagram.AdjDateTimePicker;
import uidiagram.AdjGroupBox;
import uidiagram.AdjLabel;
import uidiagram.AdjLinkLabel;
import uidiagram.AdjListBox;
import uidiagram.AdjListView;
import uidiagram.AdjListViewColumn;
import uidiagram.AdjPanel;
import uidiagram.AdjPictureBox;
import uidiagram.AdjRadioButton;
import uidiagram.AdjRichTextBox;
import uidiagram.AdjTextBox;
import uidiagram.AdjWidget;
import uidiagram.FormUI;
import uidiagram.ModelFactoryUI;
import uidiagram.ProjectUI;
import uidiagram.UIDiagram;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;

public class ModelFactoryModel {

	// --------------------------------------------------------------------------
	// Singleton
	// --------------------------------------------------------------------------

	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Metodo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// Creacion de las factories
	ModelFactoryConcrete modelFactoryConcreta = ConcretemodelFactory.eINSTANCE.createModelFactoryConcrete();
	ModelFactoryAbstract modelFactoryAbstracta = AbstractmodelFactoryImpl.eINSTANCE.createModelFactoryAbstract();
	ModelFactoryUI modelFactoryUIDiagram = UidiagramFactory.eINSTANCE.createModelFactoryUI();
	ModelFactoryRelational modelFactoryRelational = DslrelationalFactory.eINSTANCE.createModelFactoryRelational();
	
	//Variable de la ruta del proyecto
	private String rutaProyecto;
	//Variable del nombre del proyecto
	private String nombreProyecto;


	public ModelFactoryModel() {
		modelFactoryConcreta = loadConcreteModel();
		modelFactoryAbstracta = loadAbstractaModel();
		modelFactoryUIDiagram = loadUIDiagramModel();
		modelFactoryRelational = loadRelationalModel();
	}
	

	// -----------------------------------------------------------------Load and
	// Save ModelFactorys
	// ---------------------------------------------------------------

	/**
	 * Este metodo permite cargar el modelfactoryspecific del diagrama de clases
	 * 
	 * @return El modelFactorySpecific cargada
	 */
	public ModelFactoryConcrete loadConcreteModel() {
		ModelFactoryConcrete modelFactoryConcreta = null;
		ConcretemodelPackage whoownmePackage = ConcretemodelPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.concretemodel");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryConcreta = (ModelFactoryConcrete) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryConcreta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryConcreta;
	}

	/**
	 * Este metodo permite cargar el modelFactoryAbstract del diagrama de clases
	 * 
	 * @return
	 */
	public ModelFactoryAbstract loadAbstractaModel() {
		ModelFactoryAbstract modelFactoryAbstracta = null;
		AbstractmodelPackage whoownmePackage = AbstractmodelPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.abstractmodel");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryAbstracta = (ModelFactoryAbstract) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstracta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryAbstracta;
	}
	
	
	/**
	 * Este metodo permite cargar el modelFactoryUI del diagrama de clases
	 * @return
	 */
	private ModelFactoryUI loadUIDiagramModel() {
		ModelFactoryUI modelFactoryUI = null;
		UidiagramPackage whoownmePackage = UidiagramPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.uidiagram");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryUI = (ModelFactoryUI) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryUI);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryUI;
	}
	
	
	/**
	 * Este metodo permite cargar el modelFactoryRelational del diagrama de clases
	 * @return
	 */
	private ModelFactoryRelational loadRelationalModel() {
		ModelFactoryRelational modelFactoryRelational = null;
		UidiagramPackage whoownmePackage = UidiagramPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.dslrelational");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryRelational = (ModelFactoryRelational) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryRelational);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryRelational;
	}
	
	

	/**
	 * Este metodo permite guardar el ModelFactorySpecific del diagrama de clases
	 */
	public void saveConcreta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.concreta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryConcreta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	 /**
	 * Este metodo permite guardar el ModelFactoryAbstract del diagrama de clases
	 */
	public void saveAbstracta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.abstractmodel");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 *  Este metodo permite guardar el ModelFactoryUI del diagrama de clases
	 */
	public void saveUIDiagram() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.uidiagram");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryUIDiagram);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Este metodo permite guardar el modelFactoryRelational del diagrama de clases
	 */
	public void saveRelational() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.dslrelational");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryRelational);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	// ----------------------------------------- Tranformacion M2M de parte especifica a parte a abstracta -------------------------------------------
	
	
	/**
	 * Este metodo realiza la transformacion del modelo especifico a el modelo
	 * abstracto
	 */
	public void transformationM2M() throws Exception {

		modelFactoryConcreta = loadConcreteModel();// el modelo origen
		modelFactoryAbstracta = loadAbstractaModel();// el modelo destino
		modelFactoryAbstracta.getListProjects().clear();
		
	
		for (ProjectAdj projectAdjConcreta : modelFactoryConcreta.getListProjects()) {
			
			//Captura nombre de proyecto
			this.nombreProyecto = capturarNombreProyecto();
			projectAdjConcreta.setName(getNombreProyecto());

			// por un proyecto de la concreta se crea uno en la abstracta
			abstractmodel.ProjectAdj proyectoAdjAbstracta = AbstractmodelFactory.eINSTANCE.createProjectAdj();
			proyectoAdjAbstracta.setName(projectAdjConcreta.getName());
			proyectoAdjAbstracta.setPath(projectAdjConcreta.getPath());
			modelFactoryAbstracta.getListProjects().add(proyectoAdjAbstracta);
			abstractmodel.AttributeTypeFactoryAdj  atrAbstractmodelFactory= AbstractmodelFactory.eINSTANCE.createAttributeTypeFactoryAdj();
			proyectoAdjAbstracta.setAttributeTypeFactoryAdj(atrAbstractmodelFactory);
			
			

			// creamos el paquete raiz por defecto
			PackageAdj packageRaizAdj = AbstractmodelFactory.eINSTANCE.createPackageAdj();
			packageRaizAdj.setName(projectAdjConcreta.getName());
			packageRaizAdj.setPath(projectAdjConcreta.getPath());

			proyectoAdjAbstracta.getLstPackageAdj().add(packageRaizAdj);
			
			for (AttributeTypeConcreteAdj attributeTypeConcreteAdj : projectAdjConcreta.getLstAttributeTypeConcreteAdj()) {
				
				crearTipoAtributo(attributeTypeConcreteAdj, proyectoAdjAbstracta.getAttributeTypeFactoryAdj().getLstAttributeTypeAdj());
			}

			// se recorren todos los diagramas y se crea el sistema de paquetes
			for (ClassDiagramAdj diagrama : projectAdjConcreta.getLstClassDiagramAdj()) {

				// va a recorrer todos los paquetes de todos los diagramas
				// por cada paquete se crea un paquete
				for (PackageConcreteAdj packageConcreta : diagrama.getLstPackageConcreteAdj()) {
					crearPaquete(packageConcreta, packageRaizAdj);
				}
				for (ClassConcreteAdj classAdjConcreta : diagrama.getLstClassConcreteAdj()) {
					crearClass(packageRaizAdj, classAdjConcreta, proyectoAdjAbstracta);
				}
				//
				for (RelationshipAdj relationAdj : diagrama.getLstRelationship()) {
					// System.out.println(relationAdj.getClass().getName());
					crearRelacion(relationAdj, packageRaizAdj);
				}
			}



		}
		saveAbstracta();
	}



 /**
  * Este m�todo crea los atributos si a�n no existen
  * @param attributeTypeConcreteAdj
  * @param lstAttributeTypeAbstractaAdj
  */
	private void crearTipoAtributo(AttributeTypeConcreteAdj attributeTypeConcreteAdj,
			EList<AttributeTypeAdj> lstAttributeTypeAbstractaAdj) {
		// TODO Auto-generated method stub
		
			if (lstAttributeTypeAbstractaAdj.size()>0) {
				for (AttributeTypeAdj attributeTypeAbstractaAdj : lstAttributeTypeAbstractaAdj) {
					if (attributeTypeConcreteAdj.getName().equals(attributeTypeAbstractaAdj.getName())) {
						break;
					}
				}
				abstractmodel.AttributeTypeAdj atrAttributeTypeAdjNuevo = AbstractmodelFactory.eINSTANCE
						.createAttributeTypeAdj();
				atrAttributeTypeAdjNuevo.setName(attributeTypeConcreteAdj.getName());
				lstAttributeTypeAbstractaAdj.add(atrAttributeTypeAdjNuevo);
				
			}else {
				abstractmodel.AttributeTypeAdj atrAttributeTypeAdjNuevo = AbstractmodelFactory.eINSTANCE
						.createAttributeTypeAdj();
				atrAttributeTypeAdjNuevo.setName(attributeTypeConcreteAdj.getName());
				lstAttributeTypeAbstractaAdj.add(atrAttributeTypeAdjNuevo);
			}
		
	
	}

	/**
	 * Crea las relaciones hacia el modelo abstracto
	 * 
	 * @param relationAdjConcreta
	 * @param packageRaizRam
	 */
	private void crearRelacion(RelationshipAdj relationAdjConcreta, abstractmodel.PackageAdj packageRaizRam) {
		// relationAdjConcreta.
		ClassConcreteAdj sourceConcreta = relationAdjConcreta.getClassSource();
		ClassConcreteAdj targetConcret = relationAdjConcreta.getClassTarget();

		abstractmodel.ClassAdj classAdjAbstractaSource = obtenerClase(sourceConcreta, packageRaizRam);
		abstractmodel.ClassAdj classAdjAbstractaTarget = obtenerClase(targetConcret, packageRaizRam);

		switch (relationAdjConcreta.getClass().getName()) {
		case "concretemodel.impl.ContainmentSdjImpl":

			// Clase A
			abstractmodel.ContainmentAdj relationAdjAbstractaContaintmentSource = AbstractmodelFactory.eINSTANCE
					.createContainmentAdj();
			relationAdjAbstractaContaintmentSource
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaContaintmentSource
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaContaintmentSource.setRoleSource(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaContaintmentSource.setRoleTarget(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaContaintmentSource.setTargetClass(classAdjAbstractaTarget);

			// Clase B
			abstractmodel.ContainmentAdj relationAdjAbstractaContaintmentTarget = AbstractmodelFactory.eINSTANCE
					.createContainmentAdj();
			relationAdjAbstractaContaintmentTarget
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaContaintmentTarget
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaContaintmentTarget.setRoleSource(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaContaintmentTarget.setRoleTarget(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaContaintmentTarget.setTargetClass(classAdjAbstractaSource);

			// Asignamos las relaciones que salen y las que entran a la clase A
			classAdjAbstractaSource.getLstRelationShipAdj().add(relationAdjAbstractaContaintmentSource);
			classAdjAbstractaSource.getLstInputRelationshipAdj().add(relationAdjAbstractaContaintmentTarget);

			// Asignamos las relaciones que salen y las que entran a la clase B
			classAdjAbstractaTarget.getLstRelationShipAdj().add(relationAdjAbstractaContaintmentTarget);
			classAdjAbstractaTarget.getLstInputRelationshipAdj().add(relationAdjAbstractaContaintmentSource);

			break;

		case "concretemodel.impl.AssociationAdjImpl":

			// Clase A
			abstractmodel.AssociationAdj relationAdjAbstractaAssociationSource = AbstractmodelFactory.eINSTANCE
					.createAssociationAdj();
			relationAdjAbstractaAssociationSource
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaAssociationSource
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaAssociationSource.setRoleSource(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaAssociationSource.setRoleTarget(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaAssociationSource.setTargetClass(classAdjAbstractaTarget);

			// Clase B
			abstractmodel.AssociationAdj relationAdjAbstractaAssociationTarget = AbstractmodelFactory.eINSTANCE
					.createAssociationAdj();
			relationAdjAbstractaAssociationTarget
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaAssociationTarget
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaAssociationTarget.setRoleSource(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaAssociationTarget.setRoleTarget(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaAssociationTarget.setTargetClass(classAdjAbstractaSource);

			// Asignamos las relaciones que salen y las que entran a la clase A
			classAdjAbstractaSource.getLstRelationShipAdj().add(relationAdjAbstractaAssociationSource);
			classAdjAbstractaSource.getLstInputRelationshipAdj().add(relationAdjAbstractaAssociationTarget);

			// Asignamos las relaciones que salen y las que entran a la clase B
			classAdjAbstractaTarget.getLstRelationShipAdj().add(relationAdjAbstractaAssociationTarget);
			classAdjAbstractaTarget.getLstInputRelationshipAdj().add(relationAdjAbstractaAssociationSource);

			break;

		case "concretemodel.impl.GeneralizationAdjImpl":

			// la multiplicidad para la generalizaci�n es la misma en todos los casos
			relationAdjConcreta.setMultiplicitySourceClass("*");
			relationAdjConcreta.setMultiplicityTargetClass("0");

			// Clase A - la Generalizaci�n es unidireccional
			abstractmodel.GeneralizationAdj relationAdjAbstractaGeneralizationSource = AbstractmodelFactory.eINSTANCE
					.createGeneralizationAdj();
			relationAdjAbstractaGeneralizationSource
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaGeneralizationSource
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaGeneralizationSource.setRoleSource(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaGeneralizationSource.setRoleTarget(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaGeneralizationSource.setTargetClass(classAdjAbstractaTarget);

			classAdjAbstractaSource.getLstRelationShipAdj().add(relationAdjAbstractaGeneralizationSource);

			break;

		case "concretemodel.impl.SharingAdjImpl":

			// Clase A
			abstractmodel.SharingAdj relationAdjAbstractaSharingSource = AbstractmodelFactory.eINSTANCE
					.createSharingAdj();
			relationAdjAbstractaSharingSource
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaSharingSource
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaSharingSource.setRoleSource(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaSharingSource.setRoleTarget(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaSharingSource.setTargetClass(classAdjAbstractaTarget);

			// Clase B
			abstractmodel.SharingAdj relationAdjAbstractaSharingTarget = AbstractmodelFactory.eINSTANCE
					.createSharingAdj();
			relationAdjAbstractaSharingTarget
					.setMultiplicitySourceClass(relationAdjConcreta.getMultiplicityTargetClass());
			relationAdjAbstractaSharingTarget
					.setMultiplicityTargetClass(relationAdjConcreta.getMultiplicitySourceClass());
			relationAdjAbstractaSharingTarget.setRoleSource(relationAdjConcreta.getRoleTarget());
			relationAdjAbstractaSharingTarget.setRoleTarget(relationAdjConcreta.getRoleSource());
			relationAdjAbstractaSharingTarget.setTargetClass(classAdjAbstractaSource);

			// Asignamos las relaciones que salen y las que entran a la clase A
			classAdjAbstractaSource.getLstRelationShipAdj().add(relationAdjAbstractaSharingSource);
			classAdjAbstractaSource.getLstInputRelationshipAdj().add(relationAdjAbstractaSharingTarget);

			// Asignamos las relaciones que salen y las que entran a la clase B
			classAdjAbstractaTarget.getLstRelationShipAdj().add(relationAdjAbstractaSharingTarget);
			classAdjAbstractaTarget.getLstInputRelationshipAdj().add(relationAdjAbstractaSharingSource);

			break;

		default:
			break;
		}

	}

	/**
	 * Obtenemos una clase
	 * 
	 * @param claseABuscar
	 * @param packageRaizRam
	 * @return
	 */
	private abstractmodel.ClassAdj obtenerClase(ClassConcreteAdj claseABuscar,
			abstractmodel.PackageAdj packageRaizRam) {

		abstractmodel.PackageAdj packageRam = obtenerPackagePadre(claseABuscar.getPath(), packageRaizRam);

		for (abstractmodel.ClassAdj clase : packageRam.getLstClassAdj()) {
			if (claseABuscar.getName().equals(clase.getName())) {
				return clase;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param packageRaizAdj
	 * @param classAdjConcreta
	 * @param proyectoAdjAbstracta
	 */
	private void crearClass(abstractmodel.PackageAdj packageRaizAdj, ClassConcreteAdj classAdjConcreta,
			abstractmodel.ProjectAdj proyectoAdjAbstracta) {
		abstractmodel.ClassAdj classAdjAbstracta = AbstractmodelFactory.eINSTANCE.createClassAdj();

		classAdjAbstracta.setName(classAdjConcreta.getName());
		// se concatena el nombre del paquete raiz para tener el path completo
		classAdjAbstracta.setPathPackage(packageRaizAdj.getName() + "/" + classAdjConcreta.getPath());
		classAdjAbstracta.setClassType(classAdjConcreta.getTipeClass().getName());
		classAdjAbstracta.setAccesModifierClass(classAdjConcreta.getAccesModifierClass().getName());
		
		

		// Verificamos si el path es vacio, colocamos las clases en el paquete raiz
		if (classAdjConcreta.getPath() == null || classAdjConcreta.getPath().equals("")) {
			packageRaizAdj.getLstClassAdj().add(classAdjAbstracta);
		} else {
			// buscamos el paquete padre con el path de la clase concreta
			abstractmodel.PackageAdj paquetePadre = obtenerPackagePadre(classAdjConcreta.getPath(), packageRaizAdj);
			paquetePadre.getLstClassAdj().add(classAdjAbstracta);
		}

		for (AttributeConcreteAdj attributeAdjConcreta : classAdjConcreta.getLstAttributeConcreteAdj()) {
			abstractmodel.AttributeAdj attributeAdjAbstracta = AbstractmodelFactory.eINSTANCE.createAttributeAdj();
			attributeAdjAbstracta.setAccesModifier(attributeAdjConcreta.getAccessModifier().getName());
			attributeAdjAbstracta.setName(attributeAdjConcreta.getName());
			abstractmodel.AttributeTypeAdj tipoAtributo = buscarTipoAtributoPorNombre(attributeAdjConcreta.getAttributeTypeConcreteAdj().getName(),proyectoAdjAbstracta);
			attributeAdjAbstracta.setAttributeTypeAdj(tipoAtributo);
			attributeAdjAbstracta.setValor(attributeAdjConcreta.getValue());
			classAdjAbstracta.getLstAttributeAdj().add(attributeAdjAbstracta);
		}
		
		for (MethodConcreteAdj methodAdjConcreta : classAdjConcreta.getLstMethodConcreteAdj()) {
			abstractmodel.MethodAdj methodAdj = AbstractmodelFactory.eINSTANCE.createMethodAdj();
			methodAdj.setMethodName(methodAdjConcreta.getMethodName());
			methodAdj.setBody(methodAdjConcreta.getBody());
			methodAdj.setReturnTypeAdj(methodAdjConcreta.getReturnType());
			
			for (ParameterConcreteAdj parameterConcreta : methodAdjConcreta.getLstParameterConcreteAdj()) {
				abstractmodel.ParameterAdj parameterAbstracta = AbstractmodelFactory.eINSTANCE.createParameterAdj();
				parameterAbstracta.setName(parameterConcreta.getName());
				parameterAbstracta.setAttributeTypeAdj(buscarTipoAtributoPorNombre(parameterConcreta.getAttributeTypeConcreteAdj().getName(), proyectoAdjAbstracta));
				methodAdj.getLstParameterAdj().add(parameterAbstracta);
			}
			
			classAdjAbstracta.getLstMethodAdj().add(methodAdj);
		}
	}


/**
 * Esta clase me permite retornar el tipo de atributo en la abstracta, que tiene el mismo nombre que en la concreta
 * @param name
 * @param proyectoAdjAbstracta
 * @return
 */
	private AttributeTypeAdj buscarTipoAtributoPorNombre(String name, abstractmodel.ProjectAdj proyectoAdjAbstracta) {
		// TODO Auto-generated method stub
		abstractmodel.AttributeTypeAdj tipoAtributo = AbstractmodelFactory.eINSTANCE.createAttributeTypeAdj();
		
		for (AttributeTypeAdj iterable_element : proyectoAdjAbstracta.getAttributeTypeFactoryAdj().getLstAttributeTypeAdj()) {
			
			if (iterable_element.getName().equals(name)) {
				tipoAtributo=iterable_element;
				break;
			}
		}
		
		return tipoAtributo;
	}


	/**
	 * Crea la estructuracion de paquetes
	 * 
	 * @param packageConcreta
	 * @param packageRaizAdj
	 */
	private void crearPaquete(PackageConcreteAdj packageConcreta, PackageAdj packageRaizAdj) {

		PackageAdj newPaqueteAbstracta = null;
		newPaqueteAbstracta = AbstractmodelFactory.eINSTANCE.createPackageAdj();
		newPaqueteAbstracta.setName(packageConcreta.getName());

		if (packageConcreta.getPath() == null || packageConcreta.getPath().equals("")) {
			newPaqueteAbstracta.setPath(packageRaizAdj.getName());
			packageRaizAdj.getLstChildPackageAdj().add(newPaqueteAbstracta);
		} else {
			PackageAdj packageAdjPadre = obtenerPackagePadre(packageConcreta.getPath(), packageRaizAdj);// src/main
			newPaqueteAbstracta.setPath(packageAdjPadre.getPath() + "/" + packageAdjPadre.getName());
			packageAdjPadre.getLstChildPackageAdj().add(newPaqueteAbstracta);
		}

	}

	/**
	 * obtiene el paquete padre dado el path y el paquete ra�z
	 * 
	 * @param path
	 * @param packageRaizAdj
	 * @return
	 */
	private PackageAdj obtenerPackagePadre(String path, PackageAdj packageRaizAdj) {

		if (path == null)
			return packageRaizAdj;
		
		String[] pathArray = path.split("/");
		PackageAdj padre = packageRaizAdj;

		for (int j = 0; j < pathArray.length; j++) {
			padre = obtenerPaquete(pathArray[j], padre);
		}

		return padre;
	}

	/**
	 * crea (si no existe) y obtiene un paquete dado su nombre y el paquete padre
	 * (paquete que lo contiene)
	 * 
	 * @param nameP
	 * @param packageParentAdj
	 * @return
	 */
	private PackageAdj obtenerPaquete(String nameP, PackageAdj packageParentAdj) {

		for (PackageAdj pac : packageParentAdj.getLstChildPackageAdj()) {
			if (pac.getName().equalsIgnoreCase(nameP)) {
				return pac;
			}
		}

		PackageAdj packageAdj = AbstractmodelFactory.eINSTANCE.createPackageAdj();
		packageAdj.setName(nameP);
		packageAdj.setPath(packageParentAdj.getPath() + "/" + packageParentAdj.getName());
		packageParentAdj.getLstChildPackageAdj().add(packageAdj);
		return packageAdj;
	}

	
	// -------------------------------- Tranformacion M2T de parte abstracta a archivos de texto -----------------------------------------------

	
	/**
	* Este metodo permite tranformar la parte abstacta del diagrama de clases a
	 archivos de python
	 * @throws Exception 
	*/
	public void transformationM2T() throws Exception {
		//Captura de la ruta absoluta del proyecto
		this.rutaProyecto = capturarRutaProyecto();
		//Carga del modelFactoryAbstracta
		modelFactoryAbstracta = loadAbstractaModel();

		for (abstractmodel.ProjectAdj proyecto : modelFactoryAbstracta.getListProjects()) {

			createFolderWindows(rutaProyecto, proyecto.getName());

			for (abstractmodel.PackageAdj paquete : proyecto.getLstPackageAdj()) {
				if (paquete.getPath() == null || paquete.getPath().equals("")) {
					createFolderWindows(rutaProyecto+"\\"+proyecto.getName(), paquete.getName());
				}
				else {
					createFolderWindows(rutaProyecto+"\\"+paquete.getPath(), paquete.getName());
				}

				for (abstractmodel.ClassAdj clase : paquete.getLstClassAdj()) {
					generarClase(clase);
				}

				for (abstractmodel.PackageAdj paqueteHijo : paquete.getLstChildPackageAdj()) {
					generarPaquete(paqueteHijo);
				}
			}
		}
	}
	

	/**
	 * M�todo recursivo para generar paquetes en los directorios, estos a su vez
	 * crean los paquetes de los paquetes hijos
	 * @param paquete hijo
	 */
	private void generarPaquete(abstractmodel.PackageAdj paquete) {
		createFolderWindows(rutaProyecto+"\\"+paquete.getPath(), paquete.getName());

		for (abstractmodel.ClassAdj clase : paquete.getLstClassAdj()) {
			generarClase(clase);
		}

		for (abstractmodel.PackageAdj paquetHijo : paquete.getLstChildPackageAdj()) {
			generarPaquete(paquetHijo);
		}

	}
	
	
	
	/**
	 * M�todo para la generaci�n de la clase
	 * @param clase
	 */
	 private void generarClase(abstractmodel.ClassAdj clase) {
	
	 StringBuilder cadenaClass = new StringBuilder();
	 String extendsCadena = crearCadenaHerencia(clase);

	 cadenaClass.append(
			 		 "//codigo generado por el equipo maravilla" +
			 		 "\r\n" +
					 "using System;\r\n" +
					 "\r\n" +
					 	"namespace "+getNombreProyecto() + "\r\n" +
					 	"{ \r\n" +
					 	"\tpublic class "+clase.getName()+" "+extendsCadena
					  + "\r\n\t{" +
					  	"\r\n" +
					  		crearCadenaAtributos(clase)
					  				+ "\r\n \t\t" +
					  		crearCadenaRelaciones(clase)
					 	+ "\r\n" +
					 	"\r\n \t\t" +
					 	"public "+clase.getName() +" ()" + "\r\n\t\t" +
					 	"{"+ "\r\n\t\t" +
					 	"\t //Empty Constructor" + "\r\n\t\t" +
					 	"}"+ "\r\n" +
					 	"\r\n" +
					 	crearCadenaGettersSettersToString(clase) + "\r\n\t\t" +
					   
						"\r\n" +
						"\r\n" +
					   "\t}" +
					   "\r\n" +
					 "\r\n" +
				    "}"

	 );
	 
	 createFileWindows(rutaProyecto+"\\"+clase.getPathPackage(), clase.getName(), cadenaClass);

	 }
	
	
	
	 /**
	  * Metodo para crear la cadena de los getters, setters y toString de los
	  * atributos de la clase
	  * @param clase
	  * @return cadena getters, setters y toString
	  */
	private StringBuilder crearCadenaGettersSettersToString(ClassAdj clase) {
		StringBuilder gettersSetters = new StringBuilder();
		StringBuilder toString = new StringBuilder();
		toString.append("\"" +clase.getName() + " [");
		
		for (abstractmodel.AttributeAdj attribute : clase.getLstAttributeAdj()) {
			String atributoConvertido = attribute.getName().substring(0, 1).toUpperCase() + attribute.getName().substring(1);
			
			gettersSetters.append("\t\tpublic "+attribute.getAttributeTypeAdj().getName()+" get"+atributoConvertido+"()\r\n\t\t"
					+ "{\r\n\t\t\t"
					+ "return "+attribute.getName()+";"
					+"\r\n\t\t}"
					+"\r\n"
					+"\r\n\t\t"
					
					+"public void set"+atributoConvertido+"("+attribute.getAttributeTypeAdj().getName()+" "+attribute.getName()+")\r\n\t\t"
					+ "{\r\n\t\t\t"
					+ "this."+attribute.getName()+" = "+attribute.getName()+";"
					+"\r\n\t\t}"
					+"\r\n"
					+"\r\n"
					);
			toString.append(attribute.getName()+"=\" + "+attribute.getName()+" + \"");
		}
		
		for (abstractmodel.RelationshipAdj relationshipAdj : clase.getLstRelationShipAdj()) {
			if (!(relationshipAdj instanceof abstractmodel.GeneralizationAdj)) {
				String atributoConvertido = relationshipAdj.getRoleTarget().substring(0, 1).toUpperCase() + relationshipAdj.getRoleTarget().substring(1);
				
				gettersSetters.append("\t\tpublic "+obtenerTipoAtributoRelacion(relationshipAdj)+" get"+atributoConvertido+"()\r\n\t\t"
						+ "{\r\n\t\t\t"
						+ "return "+relationshipAdj.getRoleTarget()+";"
						+"\r\n\t\t}"
						+"\r\n"
						+"\r\n\t\t"
						
						+"public void set"+atributoConvertido+"("+obtenerTipoAtributoRelacion(relationshipAdj)+" "+relationshipAdj.getRoleTarget()+")\r\n\t\t"
						+ "{\r\n\t\t\t"
						+ "this."+relationshipAdj.getRoleTarget()+" = "+relationshipAdj.getRoleTarget()+";"
						+"\r\n\t\t}"
						+"\r\n"
						+"\r\n"
						);
				
				toString.append(relationshipAdj.getRoleTarget()+"=\" + "+relationshipAdj.getRoleTarget()+" + \"");
			}
		}
		
		toString.append("]\";");
		
		gettersSetters.append("\t\tpublic override string ToString()\r\n\t\t"
				+ "{\r\n\t\t\t"
				+ "return "+toString
				+"\r\n\t\t}"
				);
		
		return gettersSetters;
	}

	/**
	 * Crea la cadena para los atributos de las relaciones
	 * @param clase
	 * @return cadena de atributos de relaciones
	 */
	private StringBuilder crearCadenaRelaciones(ClassAdj clase) {
		StringBuilder atributosRelaciones = new StringBuilder();
		
		for (abstractmodel.RelationshipAdj relationshipAdj : clase.getLstRelationShipAdj()) {
			if (!(relationshipAdj instanceof abstractmodel.GeneralizationAdj)) {
			
			atributosRelaciones.append(
					"private "+obtenerTipoAtributoRelacion(relationshipAdj)+" "+relationshipAdj.getRoleTarget()+";\r\n\t\t"
					
					);
			}
		}
		
		return atributosRelaciones;
	}

	/**
	 * Metod para obtener el tipo de atributo de la relacion:
	 *  Si es multiplicidad uno, se coloca el nombre de la clase,
	 *  si es multiplicidad *, se agrega una lista
	 * @param relationshipAdj
	 * @return cadena tipo de atributo de relacion
	 */
	private String obtenerTipoAtributoRelacion(abstractmodel.RelationshipAdj relationshipAdj) {
		
		if (relationshipAdj.getMultiplicityTargetClass() != null) {
			if (relationshipAdj.getMultiplicityTargetClass().equals("*"))
				return "List<"+relationshipAdj.getTargetClass().getName()+">";
		}
		
		return relationshipAdj.getTargetClass().getName();
	}

	
	
	/**
	 * Crea la cadena de atributos de la clase creados desde el diagrama
	 * @param clase
	 * @return cadena de atributos propios de la clase
	 */
	private StringBuilder crearCadenaAtributos(ClassAdj clase) {
		StringBuilder atributos = new StringBuilder();
		
		for (abstractmodel.AttributeAdj attribute : clase.getLstAttributeAdj()) {
			atributos.append("\t\tprivate "+attribute.getAttributeTypeAdj().getName()+" "+attribute.getName());
			
			if (attribute.getValor() != null) {
				if (!attribute.getValor().equals(""))
					atributos.append(" = "+attribute.getValor());
			}
			
			atributos.append(";\r\n");
			
		}
		
		return atributos;
	}

	/**
	 * Metodo que obtiene la cadena de herencia que la clase dada
	 * tenga una relacion de generalizacion
	 * @param clase
	 * @return cadena de herencia
	 */
	private String crearCadenaHerencia(ClassAdj clase) {
		
		for (abstractmodel.RelationshipAdj relationshipAdj: clase.getLstRelationShipAdj()) {
			if (relationshipAdj instanceof abstractmodel.GeneralizationAdj) {
				return " : "+relationshipAdj.getTargetClass().getName()+" ";
			}
		}
		return "";
	}
	
	
	// -------------------------------- Tranformacion M2T de parte de la UIDiagram a archivos de texto -----------------------------------------------
	
	/**
	 * Transformaci�n model to text de la UI
	 * @throws Exception
	 */
	public void transformationM2TUIDiagram() throws Exception {
		
		this.rutaProyecto = capturarRutaProyecto();
		modelFactoryUIDiagram = loadUIDiagramModel();
		
		for (ProjectUI projectUI : modelFactoryUIDiagram.getLstProjectUI()) {
			String projectName = capturarNombreProyecto();
			createFolderWindows(rutaProyecto, "UI_"+projectName);
			this.rutaProyecto = rutaProyecto + "\\UI_"+projectName;
			
			for (UIDiagram uiDiagram : projectUI.getLstDiagramUI()) {
				generarArchivoUI(uiDiagram.getForm(), projectName);
			}
		}
		
		saveUIDiagram();
	}
	
	
	/**
	 * M�todo para generar el archivo de la UI, dado el formUI
	 * @param formUI
	 * @param projectName
	 * @throws Exception 
	 */
	private void generarArchivoUI(FormUI formUI, String projectName) throws Exception {
		
		checkSomeData(formUI);
		StringBuilder uiClassText = new StringBuilder();
		StringBuilder uiClassTextAditional = new StringBuilder();
		
		uiClassText.append(
						"//codigo generado por el equipo maravilla" +
						"\r\n" +
						"namespace " + projectName + "\r\n" +
						"{ \r\n" +
						"\tpartial class " + formUI.getName() + " "
						+ "\r\n\t{"
						+ "\r\n\t\tprivate System.ComponentModel.IContainer components = null;" +
						"\r\n\r\n" +
						"		protected override void Dispose(bool disposing)\r\n" + 
						"        {\r\n" + 
						"            if (disposing && (components != null))\r\n" + 
						"            {\r\n" + 
						"                components.Dispose();\r\n" + 
						"            }\r\n" + 
						"\r\n" + 
						"            base.Dispose(disposing);\r\n" + 
						"        }" + "\r\n\r\n" +
						"		//-------------------Component Initialization" +
						"\r\n" +
						"		private void InitializeComponent()\r\n" + 
						"        {" +
						"\r\n" + 
						"			System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(" + formUI.getName() + "));" +
						"\r\n" +
						"\r\n			//Instances" +
						"\r\n" +
						"\t\t\t" + getComponentInstances(formUI) +
						"this.SuspendLayout();" +
						"\r\n" +
						"\r\n			//Set Component Attributes" +
						"\r\n" + setComponentAttributes(formUI) + 
						"\r\n" +
						"			//" +formUI.getName() +
						"\r\n\t\t\t" + setFormAttributes(formUI) + 
						"		}" +
						"\r\n" + 
						"\r\n" + 
						"		//-------------------Component Declaration" +
						"\r\n" + 
						"\t\t" + getComponentDeclaration(formUI) + 
						"\r\n\t}" + 
						"\r\n}"
				);
		
		createFileWindows(rutaProyecto, formUI.getName()+".Designer", uiClassText);
		
		uiClassTextAditional.append("//codigo generado por el equipo maravilla" + 
				"\r\n" +
				"using System;\r\n" + 
				"using System.Windows.Forms;\r\n" + 
				"\r\n" + 
				"namespace WindowsFormsApp1\r\n" + 
				"{\r\n" + 
				"    public partial class " + formUI.getName() + " : Form\r\n" + 
				"    {\r\n" + 
				"        public " + formUI.getName() + "()\r\n" + 
				"        {\r\n" + 
				"            InitializeComponent();\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}");
		createFileWindows(rutaProyecto, formUI.getName(), uiClassTextAditional);
	}
	
	
	/**
	 * M�todo para crear el texto del set de los atributos del Form
	 * @param formUI
	 * @return
	 */
	private StringBuilder setFormAttributes(FormUI formUI) {
		StringBuilder textSetFormAttributes = new StringBuilder();
		StringBuilder textSetFormAttributesAux = new StringBuilder();
		
		textSetFormAttributes.append("this.ClientSize = new System.Drawing.Size(800, 600);\n\t\t\t"
				+ "this.BackColor = System.Drawing.SystemColors.ButtonFace;\n\t\t\t"
				+ "this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;\n\t\t\t"
				+ "this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);\n\t\t\t"
				+ "this.Location = new System.Drawing.Point(15, 15);\n\t\t\t"
				+ "this.Name = \""+formUI.getName() + ";\n\t\t\t");
		
		textSetFormAttributesAux = setFormAttributesRecursive(textSetFormAttributesAux, formUI.getLstAdjWidget());
		textSetFormAttributes.append(textSetFormAttributesAux);
		
		textSetFormAttributes.append("this.ResumeLayout(false);\n\t\t\t" + 
				"this.PerformLayout();\n");

		return textSetFormAttributes;
	}

	
	/**
	 * M�todo para hacer set a los atributos del formulario de forma recursiva
	 * @param textSetFormAttributes
	 * @param lstAdjWidget
	 * @return
	 */
	private StringBuilder setFormAttributesRecursive(StringBuilder textSetFormAttributes, EList<AdjWidget> lstAdjWidget) {
		
		for (AdjWidget widget : lstAdjWidget) {

			textSetFormAttributes.append("this.Controls.Add(this." + widget.getName() + ");\n\t\t\t");

			if (widget instanceof AdjListView) {
				for (AdjListViewColumn listViewColumn : ((AdjListView) widget).getLstAdjListViewColumn()) {
					textSetFormAttributes.append("this.Controls.Add(this." + listViewColumn.getText() + ");\n\t\t\t");
				}
			}

			if (widget instanceof AdjGroupBox) {
				textSetFormAttributes = setFormAttributesRecursive(textSetFormAttributes, ((AdjGroupBox) widget).getLstAdjWidget());
				textSetFormAttributes.append("this." + widget.getName() + "ResumeLayout(false);\n\t\t\t");
			}

			if (widget instanceof AdjPanel) {
				textSetFormAttributes = setFormAttributesRecursive(textSetFormAttributes, ((AdjPanel) widget).getLstAdjWidget());
				textSetFormAttributes.append("this." + widget.getName() + "ResumeLayout(false);\n\t\t\t");
			}
			
			if (widget instanceof AdjPictureBox) {
				textSetFormAttributes.append("((System.ComponentModel.ISupportInitialize)(this." + widget.getName() + ")).BeginInit();\n\\t\t\t");
			}
		}
		
		return textSetFormAttributes;
	}



	/**
	 * M�todo para crear el texto de las instancias de los componentes de la UI
	 * @param formUI
	 * @return
	 */
	private StringBuilder getComponentInstances(FormUI formUI) {
		StringBuilder textComponentInstances = new StringBuilder();
		return getComponentInstancesRecursive(textComponentInstances, formUI.getLstAdjWidget());
	}

	
	/**
	 * M�todo para obtener las instancias de los componentes del formulario de forma recursiva
	 * @param textComponentInstances
	 * @param lstAdjWidget
	 * @return
	 */
	private StringBuilder getComponentInstancesRecursive(StringBuilder textComponentInstances,
			EList<AdjWidget> lstAdjWidget) {
		
		for (AdjWidget widget : lstAdjWidget) {

			textComponentInstances.append("this." + widget.getName() + " = new " + getWidgetType(widget) + "()" + ";\n\t\t\t");

			if (widget instanceof AdjListView) {
				for (AdjListViewColumn listViewColumn : ((AdjListView) widget).getLstAdjListViewColumn()) {
					textComponentInstances.append("this." + listViewColumn.getText() + " = new System.Windows.Forms.ColumnHeader()" + ";\n\t\t\t");
				}
			}

			if (widget instanceof AdjGroupBox) {
				textComponentInstances = getComponentInstancesRecursive(textComponentInstances, ((AdjGroupBox) widget).getLstAdjWidget());
				textComponentInstances.append("this." +widget.getName() + ".SuspendLayout();\n\t\t\t");
			}

			if (widget instanceof AdjPanel) {
				textComponentInstances = getComponentInstancesRecursive(textComponentInstances, ((AdjPanel) widget).getLstAdjWidget());
				textComponentInstances.append("this." +widget.getName() + ".SuspendLayout();\n\t\t\t");
			}

			if (widget instanceof AdjPictureBox) {
				textComponentInstances.append("((System.ComponentModel.ISupportInitialize)(this." + widget.getName() + ")).BeginInit();\n\t\t\t");
			}

		}

		return textComponentInstances;
	}



	/**
	 * M�todo para crear textod el seteo de los atributos de los componentes de la UI
	 * @param formUI
	 * @return
	 */
	private StringBuilder setComponentAttributes(FormUI formUI) {
		StringBuilder textSetComponentAttributes = new StringBuilder();
		for (AdjWidget widget : formUI.getLstAdjWidget()) {
			
			if (widget instanceof AdjLabel) {
				textSetComponentAttributes.append("\n\t\t\t//Label");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + "\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + "\n");

			}
			
			if (widget instanceof AdjCheckBox) {
				textSetComponentAttributes.append("\n\t\t\t//Checkbox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");

			}
			
			if (widget instanceof AdjButton) {
				textSetComponentAttributes.append("\n\t\t\t//button");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");

			}
			if (widget instanceof AdjListBox) {
				textSetComponentAttributes.append("\n\t\t\t//ListBox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjDateTimePicker) {
				textSetComponentAttributes.append("\n\t\t\t//DateTimePicker");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjTextBox) {
				textSetComponentAttributes.append("\n\t\t\t//TextBox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");");
			}
			
			if (widget instanceof AdjCheckedListBox) {
				textSetComponentAttributes.append("\n\t\t\t//CheckedListBox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjLinkLabel) {
				textSetComponentAttributes.append("\n\t\t\t//LinkLabel");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjRichTextBox) {
				textSetComponentAttributes.append("\n\t\t\t//RichLinkLabel");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjComboBox) {
				textSetComponentAttributes.append("\n\t\t\t//ComboBox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjRadioButton) {
				textSetComponentAttributes.append("\n\t\t\t//RadioButton");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjPictureBox) {
				textSetComponentAttributes.append("\n\t\t\t//PictureBox");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjListView) {
				textSetComponentAttributes.append("\n\t\t\t//ListView");
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjPanel) {
				EList<AdjWidget> list = ((AdjPanel) widget).getLstAdjWidget();
				textSetComponentAttributes.append("\n\t\t\t// Panel");
				
				for (AdjWidget adjWidget : list) {
					textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Control.Add(this." + adjWidget.getName() + ");");
				}
				
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");" + "\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");" + "\n");
			}

			if (widget instanceof AdjGroupBox) {
				EList<AdjWidget> list = ((AdjGroupBox) widget).getLstAdjWidget();
				textSetComponentAttributes.append("\n\t\t\t//GroupBox");
				
				for (AdjWidget adjWidget : list) {
					textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Control.Add(this." + adjWidget.getName() + ");");
				}
				
				textSetComponentAttributes.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				textSetComponentAttributes.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n");
			}
			
			if (widget instanceof AdjListView) {
		        AdjListView listView = (AdjListView) widget;
		        
		        for (AdjListViewColumn column : listView.getLstAdjListViewColumn()) {
		        	textSetComponentAttributes.append("\n\t\t\t//ListViewColumn");
		        	textSetComponentAttributes.append("\n\t\t\tthis." + column.getText() + ".Text = \"" + column.getText() + ";");
		        	textSetComponentAttributes.append("\n\t\t\tthis." + column.getText() + ".Width = 50;\r\n");
		        }
			}
			
		}
		
		return textSetComponentAttributes;
		
	}

	/**
	 * M�todo que estructura la declaraci�n de componentes de la UI
	 * @param formUI
	 * @return
	 */
	private StringBuilder getComponentDeclaration(FormUI formUI) {
		StringBuilder textComponentDeclaration = new StringBuilder();
		return getComponentDeclarationRecursive(textComponentDeclaration, formUI.getLstAdjWidget());
	}


	/**
	 * M�todo para obtener la declaraci�n de los componentes del formulario de forma recursiva
	 * @param textComponentDeclaration
	 * @param lstAdjWidget
	 * @return
	 */
	private StringBuilder getComponentDeclarationRecursive(StringBuilder textComponentDeclaration,
			EList<AdjWidget> lstAdjWidget) {
		
		for (AdjWidget widget : lstAdjWidget) {

			textComponentDeclaration.append("private " + getWidgetType(widget) + " " + widget.getName() + ";\n\t\t");

			if (widget instanceof AdjListView) {
				for (AdjListViewColumn listViewColumn : ((AdjListView) widget).getLstAdjListViewColumn()) {
					textComponentDeclaration.append("private System.Windows.Forms.ColumnHeader " + listViewColumn.getText() + ";\n\t\t");
				}
			}

			if (widget instanceof AdjGroupBox) {
				textComponentDeclaration = getComponentDeclarationRecursive(textComponentDeclaration, ((AdjGroupBox) widget).getLstAdjWidget());

			}

			if (widget instanceof AdjPanel) {
				textComponentDeclaration = getComponentDeclarationRecursive(textComponentDeclaration, ((AdjPanel) widget).getLstAdjWidget());
			}
		}
		
		return textComponentDeclaration;
	}



	/**
	 * M�todo para obtener el tipo del widget dado
	 * @param widget
	 * @return
	 */
	private String getWidgetType(AdjWidget widget) {
		String type = "System.Windows.Forms.";
		if (widget instanceof AdjLabel) 
			return type + "Label";
		if (widget instanceof AdjCheckBox) 
			return type + "CheckBox";
		if (widget instanceof AdjButton) 
			return type + "Button";
		if (widget instanceof AdjListBox) 
			return type + "ListBox";
		if (widget instanceof AdjDateTimePicker) 
			return type + "DateTimePicker";
		if (widget instanceof AdjTextBox) 
			return type + "TextBox";
		if (widget instanceof AdjCheckedListBox) 
			return type + "CheckedListBox";
		if (widget instanceof AdjLinkLabel) 
			return type + "LinkLabel";
		if (widget instanceof AdjRichTextBox) 
			return type + "RichTextBox";
		if (widget instanceof AdjComboBox) 
			return type + "ComboBox";
		if (widget instanceof AdjRadioButton) 
			return type + "RadioButton";
		if (widget instanceof AdjPictureBox) 
			return type + "PictureBox";
		if (widget instanceof AdjListView) 
			return type + "ListView";
		if (widget instanceof AdjPanel) 
			return type + "Panel";
		if (widget instanceof AdjGroupBox) 
			return type + "GroupBox";
		return "";
	}

	
	/**
	 * Verifica datos si: existencia del nombre del form y duplicidad de variables
	 * @param formUI
	 * @throws Exception
	 */
	private void checkSomeData(FormUI formUI) throws Exception {
		if(formUI.getName() == null || formUI.getName().equals(""))
			throw new Exception("EL NOMBRE DEL FORM ESTA VACIO");
		
		String info = verifyDuplicatedVariableNames(formUI);
		
		if(info != null)
			throw new Exception("NOMBRES DE VARIABLES REPETIDAS: "+info);
		
	}
	
	/**
	 * Metodo para verificar duplicidad de nombres de variables de los componentes de la UI
	 * @param formUI
	 * @return
	 */
	private String verifyDuplicatedVariableNames(FormUI formUI) {
		EList<AdjWidget> widgetList = formUI.getLstAdjWidget();
		List<AdjListViewColumn> adjListViewColumnList = new ArrayList<AdjListViewColumn>();
		
		for (AdjWidget adjWidget : widgetList) {
			if (adjWidget instanceof AdjListView) {
				for (AdjListViewColumn adjListViewColumn : ((AdjListView) adjWidget).getLstAdjListViewColumn()) {
					adjListViewColumnList.add(adjListViewColumn);
				}
			}
		}
		
		//widgets vs widgets + columns
		for (AdjWidget adjWidget : widgetList) {
			String widgetName = adjWidget.getName();
			int i = 0;
			
			for (AdjWidget adjWidgetToSeek : widgetList) {
				if (adjWidgetToSeek.getName().equals(widgetName)) 
					i++;
			}
			
			for (AdjListViewColumn adjListViewColumn : adjListViewColumnList) {
				if (adjListViewColumn.getText().equals(widgetName)) 
					i++;
			}
			
			if (i > 1)
				return adjWidget.getClass().getSimpleName();
		}
		
		//columns vs columns
		for (AdjListViewColumn adjListViewColumn : adjListViewColumnList) {
			String columnName = adjListViewColumn.getText();
			int i = 0;
			
			for (AdjListViewColumn adjListViewColumnToSeek : adjListViewColumnList) {
				if (adjListViewColumnToSeek.getText().equals(columnName)) 
					i++;
			}
			
			if (i > 1)
				return adjListViewColumn.getClass().getSimpleName();
		}
		
		return null;
	}


	
	
	
	// ----------------------------------------- Tranformacion M2M de parte abstracta a parte relacional -------------------------------------------
	
	
		
		/**
		 * Este metodo realiza la transformacion del modelo especifico a el modelo
		 * abstracto y a su vez, al modelo relacional
		 */
		public void transformationM2MRelational() throws Exception {
			transformationM2M();
			modelFactoryAbstracta = loadAbstractaModel();
			modelFactoryRelational = loadRelationalModel();
			modelFactoryRelational.getLstDataProject().clear();
			
			int i = 1;
			//crear tablas e intermedias
			for (abstractmodel.ProjectAdj projectAbstract : modelFactoryAbstracta.getListProjects()) {
				//las clases deben estar en el paquete raiz del proyecto
				abstractmodel.PackageAdj paqueteRaiz = projectAbstract.getLstPackageAdj().get(0);
				
				//crear dataproject
				DataProject dataProject = DslrelationalFactory.eINSTANCE.createDataProject();
				dataProject.setName("script"+i);
				
				//crear esquema y asignarselo al dataproject
				Schema schema = DslrelationalFactory.eINSTANCE.createSchema();
				
				dataProject.setSchema(schema);
				schema.setName("schema"+i);
				modelFactoryRelational.getLstDataProject().add(dataProject);
				
				//crear tablas
				for (abstractmodel.ClassAdj clase : paqueteRaiz.getLstClassAdj()) {
					Table tabla = crearTabla(clase, schema);
					tabla.setOwnedBySchema(schema);
					schema.getLstTable().add(tabla);
				}
				
				//crear fks a partir de relaciones
				for (abstractmodel.ClassAdj clase : paqueteRaiz.getLstClassAdj()) {
					Table tabla = buscarTabla(schema, clase.getName());
					
					for (abstractmodel.RelationshipAdj relationshipAdj : clase.getLstRelationShipAdj()) {
						abstractmodel.ClassAdj targetClass = relationshipAdj.getTargetClass();

						if (relationshipAdj instanceof AssociationAdj || relationshipAdj instanceof SharingAdj || relationshipAdj instanceof ContainmentAdj) {
							String multSource = relationshipAdj.getMultiplicitySourceClass();
							String multTarget = relationshipAdj.getMultiplicityTargetClass();
							
							if (multSource == null)
								multSource = "1";
							if (multTarget == null)
								multTarget = "1";

							//Verificacion de relaci�n n a n
							if (multSource.equals("*") && multTarget.equals("*")) {
								Table tablaTarget = buscarTabla(schema, targetClass.getName());
								//crear tabla intermedia
								//b�squeda de la tabla intermedia
								if (buscarTabla(schema, tabla.getName()+"_"+tablaTarget.getName()) == null && buscarTabla(schema, tablaTarget.getName()+"_"+tabla.getName()) == null) {
									Table tablaIntermedia = obtenerTablaIntermedia(tabla, tablaTarget);
									tablaIntermedia.setOwnedBySchema(schema);
									schema.getLstTable().add(tablaIntermedia);
								}
							}
							else {
								//Verificacion de relaci�n 1 a 1
								if (multSource.equals("1") && multTarget.equals("1")) {
									Table tablaTarget = buscarTabla(schema, targetClass.getName());
									
									//Verificar existencia de la pk de tabla src en target
									if (!verificarExistenciaPk(tabla, tablaTarget)) {
										for (PrimaryKey pk : tabla.getLstPrimaryKey()) {
											PrimaryKey pkCopy = obtenerCopiaPk(pk, tablaTarget);

											tablaTarget.getLstPrimaryKey().add(pkCopy);

											ForeignKey foreignKey = DslrelationalFactory.eINSTANCE.createForeignKey();

											pk.getLstForeignKey().add(foreignKey);
											foreignKey.setThePrimaryKey(pkCopy);
											foreignKey.setOwnedByTable(tablaTarget);
											tablaTarget.getLstForeignKey().add(foreignKey);
										}
									}
								}
								else {
									//Verificacion de relaci�n n a 1
									if (multSource.equals("*") && multTarget.equals("1")) {
										Table tablaTarget = buscarTabla(schema, targetClass.getName());

										for (PrimaryKey pk : tablaTarget.getLstPrimaryKey()) {
											ForeignKey foreignKey = DslrelationalFactory.eINSTANCE.createForeignKey();

											pk.getLstForeignKey().add(foreignKey);
											foreignKey.setThePrimaryKey(pk);
											foreignKey.setOwnedByTable(tabla);
											tabla.getLstForeignKey().add(foreignKey);
										}
									}
								}
							}
						}
						else {
							//herencia
							if (relationshipAdj instanceof GeneralizationAdj) {
								Table tablaTarget = buscarTabla(schema, targetClass.getName());
								
								for (PrimaryKey pk : tablaTarget.getLstPrimaryKey()) {
									PrimaryKey pkCopy = obtenerCopiaPk(pk, tabla);

									tabla.getLstPrimaryKey().add(pkCopy);

									ForeignKey foreignKey = DslrelationalFactory.eINSTANCE.createForeignKey();

									pk.getLstForeignKey().add(foreignKey);
									foreignKey.setThePrimaryKey(pk);
									foreignKey.setOwnedByTable(tabla);
									tabla.getLstForeignKey().add(foreignKey);
								}
							}
						}
					}
				}
				i++;
			}
			saveRelational();
		}
		
		
		
		
		/**
		 * M�todo para verificar la existencia de pks dado una tabla src y una tabla target
		 * @param tabla
		 * @param tablaTarget
		 * @return true si encuentra alguna, de lo contrario false
		 */
		private Boolean verificarExistenciaPk(Table tabla, Table tablaTarget) {
			for (PrimaryKey pk : tabla.getLstPrimaryKey()) {
				for (PrimaryKey pkTarget : tablaTarget.getLstPrimaryKey()) {
					if (pk.getTheColumn().getName().equals(pkTarget.getTheColumn().getName()))
						return true;
				}
			}
			return false;
		}


		/**
		 * M�todo para buscar una tabla en el esquema, dado el nombre de la clase
		 * @param schema
		 * @param className
		 * @return tablaEncontrada, de lo contraro null
		 */
		private Table buscarTabla(Schema schema, String className) {
			for (Table tabla : schema.getLstTable()) {
				if (tabla.getName().equalsIgnoreCase(className))
					return tabla;
			}
			return null;
		}
		
		
		/**
		 * M�todo para crear una tabla intermedia
		 * @param tabla - origen
		 * @param tablaTarget - destino
		 * @return
		 */
		private Table obtenerTablaIntermedia(Table tabla, Table tablaTarget) {
			Table tablaIntermedia = DslrelationalFactory.eINSTANCE.createTable();
			tablaIntermedia.setName(tabla.getName()+"_"+tablaTarget.getName());

			//Crear Primary Key default
			Column column = DslrelationalFactory.eINSTANCE.createColumn();
			column.setName("id"+tabla.getName()+tablaTarget.getName());
			column.setColumnType("INTEGER");
			column.setIsNullable(false);
			column.setOwnedByTable(tablaIntermedia);
			
			tablaIntermedia.getLstColumn().add(column);
			
			//Crear Primary Key y foreign key default
			//pks para tabla src
			for (PrimaryKey pk : tabla.getLstPrimaryKey()) {
				PrimaryKey pkCopy = obtenerCopiaPk(pk, tablaIntermedia);

				tablaIntermedia.getLstPrimaryKey().add(pkCopy);

				ForeignKey foreignKey = DslrelationalFactory.eINSTANCE.createForeignKey();
				
				pk.getLstForeignKey().add(foreignKey);
				foreignKey.setThePrimaryKey(pk);
				foreignKey.setOwnedByTable(tablaIntermedia);
				tablaIntermedia.getLstForeignKey().add(foreignKey);
			}

			//pks para tabla target
			for (PrimaryKey pk : tablaTarget.getLstPrimaryKey()) {
				PrimaryKey pkCopy = obtenerCopiaPk(pk, tablaIntermedia);

				tablaIntermedia.getLstPrimaryKey().add(pkCopy);

				ForeignKey foreignKey = DslrelationalFactory.eINSTANCE.createForeignKey();

				pk.getLstForeignKey().add(foreignKey);
				foreignKey.setThePrimaryKey(pk);
				foreignKey.setOwnedByTable(tablaIntermedia);
				tablaIntermedia.getLstForeignKey().add(foreignKey);
			}

			return tablaIntermedia;
		}

		
		/**
		 * M�todo para crear una copia de una pk dada
		 * @param pk - para crear la copia
		 * @param tablaOwner - la nueva tabla duenia de la copia
		 * @return
		 */
		private PrimaryKey obtenerCopiaPk(PrimaryKey pk, Table tablaOwner) {
			PrimaryKey primaryKey = DslrelationalFactory.eINSTANCE.createPrimaryKey();
			primaryKey.setTheColumn(pk.getTheColumn());
			primaryKey.setOwnedByTable(tablaOwner);
			return primaryKey;
		}


		/**
		 * M�todo para crear una tabla con atributos y una pk generada
		 * @param clase
		 * @param schema 
		 * @return
		 */
		private Table crearTabla(ClassAdj clase, Schema schema) {
			Table tabla = DslrelationalFactory.eINSTANCE.createTable();
			tabla.setName(clase.getName());
			Column column = DslrelationalFactory.eINSTANCE.createColumn();
			
			//No crear pk y columna generada si la clase es hija de otra
			if (!verificarHerencia(clase)) {
				//Crear Primary Key default
				column = DslrelationalFactory.eINSTANCE.createColumn();
				column.setName("id"+tabla.getName());
				column.setColumnType("INTEGER");
				column.setIsNullable(false);
				column.setOwnedByTable(tabla);

				tabla.getLstColumn().add(column);

				PrimaryKey primaryKey = DslrelationalFactory.eINSTANCE.createPrimaryKey();
				column.getLstPrimaryKey().add(primaryKey);
				primaryKey.setTheColumn(column);
				primaryKey.setOwnedByTable(tabla);

				tabla.getLstPrimaryKey().add(primaryKey);
			}
			else {
				column = DslrelationalFactory.eINSTANCE.createColumn();
				column.setName("id"+tabla.getName());
				column.setColumnType("INTEGER");
				column.setIsNullable(false);
				column.setOwnedByTable(tabla);

				tabla.getLstColumn().add(column);
			}
			
			//Crear columnas
			for (AttributeAdj attributeAdj : clase.getLstAttributeAdj()) {
				column = DslrelationalFactory.eINSTANCE.createColumn();
				
				column.setName(attributeAdj.getName());
				column.setColumnType(obtenerColumnType(attributeAdj.getAttributeTypeAdj().getName()));
				column.setIsNullable(true);
				column.setOwnedByTable(tabla);
				tabla.getLstColumn().add(column);
			}
			
			//Crear Funciones y procedimientos
			for (MethodAdj method : clase.getLstMethodAdj()) {
				if (method.getReturnTypeAdj() == null)
					method.setReturnTypeAdj("");

				crearFunction(method, schema);
			}
			
			return tabla;
		}

		/**
		 * M�todo para crear funciones y procedimientos
		 * @param method
		 * @param schema
		 */
		private void crearFunction(MethodAdj method, Schema schema) {
			Function f = DslrelationalFactory.eINSTANCE.createFunction();
			f.setName(method.getMethodName());
			
			if (method.getReturnTypeAdj().equals("")) {
				f.setReturnType(null);
			}
			else {
				f.setReturnType(obtenerColumnType(method.getReturnTypeAdj()));
			}
			
			for (ParameterAdj parameter : method.getLstParameterAdj()) {
				Parameter parameterRelational = DslrelationalFactory.eINSTANCE.createParameter();
				parameterRelational.setName(parameter.getName());
				parameterRelational.setColumnType(obtenerColumnType(parameter.getAttributeTypeAdj().getName()));
				parameterRelational.setOwnedByFunction(f);
				f.getLstParameter().add((parameterRelational));
			}
			
			f.setBody(method.getBody());
			f.setOwnedBySchema(schema);
			schema.getLstFunction().add(f);
		}


		/**
		 * M�todo para obtener el tipo de columna a partir de el nombre de un atributo (abstracta uml)
		 * @param attributeName
		 * @return columnType en Relational (si no hay coincidencia se obtiene INTEGER por default)
		 */
		private String obtenerColumnType(String attributeName) {
			if (attributeName.equalsIgnoreCase("String"))
				return "VARCHAR(200)";
			if (attributeName.equalsIgnoreCase("Integer"))
				return "INTEGER";
			if (attributeName.equalsIgnoreCase("Date"))
				return "DATE";
			if (attributeName.equalsIgnoreCase("Double"))
				return "NUMBER";
			return "INTEGER";
		}


		/**
		 * M�todo para verificar si una clase tienen alguna relacion de tipo generalization (herencia)
		 * @param clase
		 * @return true, si la tiene, de lo contrario false
		 */
		private boolean verificarHerencia(ClassAdj clase) {
			for (abstractmodel.RelationshipAdj relationshipAdj : clase.getLstRelationShipAdj()) {
				if (relationshipAdj instanceof GeneralizationAdj)
					return true;
			}
			return false;
		}
		

		
		//---------------------------------------------------INPUTS

		/**
		 * Este metodo permite abrir un cuadro de dialogo para ingresar el nombre del
		 proyecto
		 * @return el nombre del proyecto
		 * @throws Exception 
		 */
		public String capturarNombreProyecto() throws Exception {
			// Mostrar un cuadro de di�logo de entrada
			String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");

			// Comprobar si el usuario ingres� algo y mostrarlo
			if (nameProject != null) {
				if (!nameProject.equals(""))
					return nameProject;
				return "newProject";

			} else {
				throw new Exception("OPERACION CANCELADA");
			}
		}


		/**
		 * Metodo para capturar la ruta absoluta del proyecto
		 * @return
		 * @throws Exception
		 */
		private String capturarRutaProyecto() throws Exception{
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

			int opcion = chooser.showSaveDialog(null); // Muestra la ventana de selecci�n

			if (opcion == JFileChooser.APPROVE_OPTION) {
				File archivo = chooser.getSelectedFile(); // Obtiene la ruta seleccionada por el usuario
				return archivo.getAbsolutePath();
			}
			else {
				throw new Exception("OPERACION CANCELADA");
			}

		}
		
		
	//-------------------------------------------------------FOLDERS Y ARCHIVOS
	

	/**
	 * Este metodo permite crear una carpeta en el sistema de windows
	 * @param path
	 * @param nameFolder
	 */
	private void createFolderWindows(String path, String nameFolder) {

		// Crea un objeto File que representa la carpeta
		File newFolder = new File(path, nameFolder);

		// Verifica si la carpeta ya existe
		if (!newFolder.exists()) {
			// Intenta crear la carpeta
			boolean creado = newFolder.mkdirs();
			if (creado) {
				System.out.println("La carpeta se cre� exitosamente.");
			} else {
				System.out.println("No se pudo crear la carpeta.");
			}
		} else {
			System.out.println("La carpeta ya existe.");
		}
	}
	
	 /**
	 * Este metodo permite crear un archivo en el sistema de windows
	 * @param path
	 * @param nameFile
	 * @param content
	 */
	private void createFileWindows(String path, String nameFile, StringBuilder content)
	{

		// Combinar la ruta y el nombre del archivo
		String absolutePath = path + "\\" + nameFile + ".cs";

		try {
			// Crear un objeto FileWriter para escribir en el archivo
			FileWriter fileWriter = new FileWriter(absolutePath);

			// Crear un objeto PrintWriter para escribir en el archivo de manera m�s
			// conveniente
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// Agregar contenido al archivo (por ejemplo, un programa Python simple)
			printWriter.println(content);
			printWriter.close();

			System.out.println("El archivo se cre� exitosamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}
	
	
	//-----------------------------------------GETTERS Y SETTERS DE VARIABLES UTILES DE LA CLASE
	
	
	public String getRutaProyecto() {
		return rutaProyecto;
	}

	public void setRutaProyecto(String rutaProyecto) {
		this.rutaProyecto = rutaProyecto;
	}
	
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	@Override
	public String toString() {
		return "ModelFactoryModel [rutaProyecto=" + rutaProyecto + ", nombreProyecto=" + nombreProyecto + "]";
	}
	
	

}