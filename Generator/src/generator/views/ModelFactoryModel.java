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
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;
import abstractmodel.AttributeTypeFactoryAdj;
import abstractmodel.ClassAdj;
import abstractmodel.ModelFactoryAbstract;
import abstractmodel.PackageAdj;
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
import concretemodel.ProjectAdj;
import concretemodel.RelationshipAdj;
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
	
	//Variable de la ruta del proyecto
	private String rutaProyecto;
	//Variable del nombre del proyecto
	private String nombreProyecto;


	public ModelFactoryModel() {
		modelFactoryConcreta = loadConcreteModel();
		modelFactoryAbstracta = loadAbstractaModel();
		modelFactoryUIDiagram = loadUIDiagramModel();
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
	 * 
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
  * Este método crea los atributos si aún no existen
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

			// la multiplicidad para la generalización es la misma en todos los casos
			relationAdjConcreta.setMultiplicitySourceClass("*");
			relationAdjConcreta.setMultiplicityTargetClass("0");

			// Clase A - la Generalización es unidireccional
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
	 * obtiene el paquete padre dado el path y el paquete raíz
	 * 
	 * @param path
	 * @param packageRaizAdj
	 * @return
	 */
	private PackageAdj obtenerPackagePadre(String path, PackageAdj packageRaizAdj) {

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
	 * Método recursivo para generar paquetes en los directorios, estos a su vez
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
	 * Método para la generación de la clase
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
	 * Transformación model to text de la UI
	 * @throws Exception
	 */
	public void transformationM2TUIDiagram() throws Exception {
		
		this.rutaProyecto = capturarRutaProyecto();
		modelFactoryUIDiagram = loadUIDiagramModel();
		
		for (ProjectUI projectUI : modelFactoryUIDiagram.getLstProjectUI()) {
			String projectName = capturarNombreProyecto();
			//createFolderWindows(rutaProyecto, "UI_"+projectName);
			
			for (UIDiagram uiDiagram : projectUI.getLstDiagramUI()) {
				generarArchivoUI(uiDiagram.getForm(), projectName);
			}
		}
		
		saveUIDiagram();
	}
	
	
	/**
	 * Método para generar el archivo de la UI, dado el formUI
	 * @param formUI
	 * @param projectName
	 * @throws Exception 
	 */
	private void generarArchivoUI(FormUI formUI, String projectName) throws Exception {
		
		checkSomeData(formUI);
		StringBuilder uiClassText = new StringBuilder();
		
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
						
						
						"			this.SuspendLayout();" +
						"\r\n" +
						"\r\n			//Set Component Attributes" +
						"\r\n" +setComponentAttributes(formUI)
						
						
						
						
						
						
						
						
						 + 
						"        }" +
						"\r\n" + 
						"			//-------------------Component Declaration" +
						"\r\n" + 
						"\t\t\t" + getComponentDeclaration(formUI) 
				);
		
		//createFileWindows(rutaProyecto+"\\"+projectName, formUI.getName(), uiClassText);
	}
	
	
	
	
	private String getComponentInstances(FormUI formUI) {
		// TODO Auto-generated method stub
		return null;
	}

	private StringBuilder setComponentAttributes(FormUI formUI) {
		StringBuilder setTextComponentDeclaration = new StringBuilder();
		for (AdjWidget widget : formUI.getLstAdjWidget()) {
			
			if(widget instanceof AdjLabel) {
				setTextComponentDeclaration.append("\n\t\t\t//Label");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + "\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + "\n\t\t\t");

			}
			
			if(widget instanceof AdjCheckBox) {
				setTextComponentDeclaration.append("\n\t\t\t//Checkbox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");

			}
			
			if(widget instanceof AdjButton) {
				setTextComponentDeclaration.append("\n\t\t\t//button");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");

			}
			if(widget instanceof AdjListBox) {
				setTextComponentDeclaration.append("\n\t\t\t//ListBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjDateTimePicker) {
				setTextComponentDeclaration.append("\n\t\t\t//DateTimePicker");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjTextBox) {
				setTextComponentDeclaration.append("\n\t\t\t//TextBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjCheckedListBox) {
				setTextComponentDeclaration.append("\n\t\t\t//CheckedListBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjLinkLabel) {
				setTextComponentDeclaration.append("\n\t\t\t//LinkLabel");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjRichTextBox) {
				setTextComponentDeclaration.append("\n\t\t\t//RichLinkLabel");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjComboBox) {
				setTextComponentDeclaration.append("\n\t\t\t//ComboBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjRadioButton) {
				setTextComponentDeclaration.append("\n\t\t\t//RadioButton");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjPictureBox) {
				setTextComponentDeclaration.append("\n\t\t\t//PictureBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if(widget instanceof AdjListView) {
				setTextComponentDeclaration.append("\n\t\t\t//ListView");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			
			if (widget instanceof AdjPanel) {
			    EList<AdjWidget> list = ((AdjPanel) widget).getLstAdjWidget();
			    setTextComponentDeclaration.append("\n\t\t\t// Panel");
			    for (AdjWidget adjWidget : list) {
			        setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Control.Add(this." + adjWidget.getName() + ");");
			    }
			    setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
			    setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");" + "\";\n\t\t\t");
			    setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");" + "\";\n\t\t\t");
			}


			
			if(widget instanceof AdjGroupBox) {
				setTextComponentDeclaration.append("\n\t\t\t//GruopBox");
				setTextComponentDeclaration.append("\n\t\t\tthis." + widget.getName() + ".Name = \"" + widget.getName() + "\";\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Size = new System.Drawing.Size(" + widget.getPositionX() + ", " + widget.getPositionY() + ");\n\t\t\t");
				setTextComponentDeclaration.append("this." + widget.getName() + ".Location = new System.Drawing.Point(" + widget.getWidth() + ", " + widget.getHeight() + ");\n\t\t\t");
			}
			if (widget instanceof AdjListView) {
		        AdjListView listView = (AdjListView) widget;
		        for (AdjListViewColumn column : listView.getLstAdjListViewColumn()) {
		        setTextComponentDeclaration.append("\n\t\t\t//ListViewColumn");
		        setTextComponentDeclaration.append("\n\t\t\tthis." + column.getText() + ".Text = \"" + column.getText() + "\";\n\t\t\t");
		        setTextComponentDeclaration.append("\n\t\t\tthis." + column.getText() + ".Width = \"" + "50" + "\";\n\t\t\t");
		        }
			}
			
		}
		return setTextComponentDeclaration;
		
	}

	/**
	 * Método que estructura la declaración de componentes de la UI
	 * @param formUI
	 * @return
	 */
	private StringBuilder getComponentDeclaration(FormUI formUI) {
		StringBuilder textComponentDeclaration = new StringBuilder();
		for (AdjWidget widget : formUI.getLstAdjWidget()) {
			
			textComponentDeclaration.append("private " + getWidgetType(widget) + " " + widget.getName() + ";\n\t\t\t");
			
			if (widget instanceof AdjListView) {
				for (AdjListViewColumn listViewColumn : ((AdjListView) widget).getLstAdjListViewColumn()) {
					textComponentDeclaration.append("private System.Windows.Forms.ColumnHeader " + listViewColumn.getText() + ";\n\t\t\t");
				}
			}
		}
		return textComponentDeclaration;
	}


	/**
	 * Método para obtener el tipo del widget dado
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




	//---------------------------------------------------INPUTS
	
	/**
	 * Este metodo permite abrir un cuadro de dialogo para ingresar el nombre del
	 proyecto
	 * @return el nombre del proyecto
	 * @throws Exception 
	 */
	public String capturarNombreProyecto() throws Exception {
		// Mostrar un cuadro de diálogo de entrada
		String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");

		// Comprobar si el usuario ingresó algo y mostrarlo
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

		int opcion = chooser.showSaveDialog(null); // Muestra la ventana de selección
		
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
				System.out.println("La carpeta se creó exitosamente.");
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

			// Crear un objeto PrintWriter para escribir en el archivo de manera más
			// conveniente
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// Agregar contenido al archivo (por ejemplo, un programa Python simple)
			printWriter.println(content);
			printWriter.close();

			System.out.println("El archivo se creó exitosamente.");
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