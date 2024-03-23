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
	
	//Variable de la ruta del proyecto
	private String rutaProyecto;
	//Variable del nombre del proyecto
	private String nombreProyecto;


	public ModelFactoryModel() {
		modelFactoryConcreta = loadConcreteModel();
		modelFactoryAbstracta = loadAbstractaModel();
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

	//
	//
	//
	// /**
	// * Este metodo permite guardar el ModelFactoryAbstract del diagrama de clases
	// */
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

	//
	//
	//
	// // ----------------------------------------- Tranformacion M2M de parte
	// especifica a parte a abstracta -------------------------------------------
	//
	// /**
	// * Este metodo realiza la transformacion del modelo especifico a el modelo
	// * abstracto
	// */
	public void transformationM2M() {

		modelFactoryConcreta = loadConcreteModel();// el modelo origen
		modelFactoryAbstracta = loadAbstractaModel();// el modelo destino
		modelFactoryAbstracta.getListProjects().clear();
		
		this.nombreProyecto = capturarNombreProyecto();
	
		for (ProjectAdj projectAdjConcreta : modelFactoryConcreta.getListProjects()) {

			// por un proyecto de la concreta se crea uno en la abstracta

			abstractmodel.ProjectAdj proyectoAdjAbstracta = AbstractmodelFactory.eINSTANCE.createProjectAdj();
			proyectoAdjAbstracta.setName(getNombreProyecto());
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

	//
	//
	// // -------------------------------- Tranformacion M2T de parte abstracta a
	// archivos de texto -----------------------------------------------

	
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
	 String extendsCadena = crearCadenaExtends(clase);

	 cadenaClass.append(
					 "using System;\r\n" +
					 "\r\n" +
					 	"namespace "+getNombreProyecto() + "\r\n" +
					 	"{ \r\n" +
					 	"\tpublic class "+clase.getName()+" "+extendsCadena
					  + "\r\n\t{" +
					  	"\r\n" + "\t\t" +
					  		crearCadenaAtributos(clase)
					  				+ "\r\n \t\t" +
					  		crearCadenaRelaciones(clase)
					 	+ "\r\n" +
					 	"\r\n \t\t" +
					 	"public "+clase.getName() +" ()" + "\r\n\t\t" +
					 	"{"+ "\r\n\t\t" +
					 	"\t //Empty Constructor" + "\r\n\t\t" +
					 	"}"+
					 	
					   
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
	 * Crea la cadena para los atributos de las relaciones
	 * @param clase
	 * @return
	 */
	private StringBuilder crearCadenaRelaciones(ClassAdj clase) {
		StringBuilder atributosRelaciones = new StringBuilder();
		
		for (abstractmodel.RelationshipAdj relationshipAdj : clase.getLstRelationShipAdj()) {
			if (!(relationshipAdj instanceof abstractmodel.GeneralizationAdj)) {
			
			atributosRelaciones.append(
					"private "+obtenerTipoAtributoRelacion(relationshipAdj)+" "+relationshipAdj.getRoleTarget()+";\r\n"
					
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
	 * @return
	 */
	private String obtenerTipoAtributoRelacion(abstractmodel.RelationshipAdj relationshipAdj) {
		
		if (relationshipAdj.getMultiplicityTargetClass() != null) {
			if (relationshipAdj.getMultiplicityTargetClass().equals("*")) {
				return "List<"+relationshipAdj.getTargetClass().getName()+">";
			}
		}
		
		return relationshipAdj.getTargetClass().getName();
	}

	
	
	/**
	 * Crea la cadena de atributos de la clase creados desde el diagrama
	 * @param clase
	 * @return
	 */
	private StringBuilder crearCadenaAtributos(ClassAdj clase) {
		StringBuilder atributos = new StringBuilder();
		
		for (abstractmodel.AttributeAdj attribute : clase.getLstAttributeAdj()) {
			atributos.append(
					"private "+attribute.getAttributeTypeAdj().getName()+" "+attribute.getName()+";\\r\\n"
					
					);
		}
		
		return atributos;
	}

	/**
	 * Metodo que obtiene la palabra extends que la clase dada
	 * tenga una relacion de generalizacion
	 * @param clase
	 * @return
	 */
	private String crearCadenaExtends(ClassAdj clase) {
		
		for (abstractmodel.RelationshipAdj relationshipAdj: clase.getLstRelationShipAdj()) {
			if (relationshipAdj instanceof abstractmodel.GeneralizationAdj) {
				return " : "+relationshipAdj.getTargetClass().getName()+" ";
			}
		}
		return "";
	}
	
	
	
	
	
	
	//---------------------------------------------------INPUTS
	
	

	/**
	 * Este metodo permite abrir un cuadro de dialogo para ingresar el nombre del
	 proyecto
	 * @return el nombre del proyecto
	 */
	public String capturarNombreProyecto() {
		// Mostrar un cuadro de diálogo de entrada
		String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");

		// Comprobar si el usuario ingresó algo y mostrarlo
		if (nameProject != null) {
			return nameProject;
		} else {
			return "newProject";
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

}