package generator.views;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;

import abstractmodel.AbstractmodelFactory;
import abstractmodel.AbstractmodelPackage;
import abstractmodel.AttributeAdj;
import abstractmodel.AttributeTypeAdj;
import abstractmodel.AttributeTypeFactoryAdj;
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

		modelFactoryConcreta = loadConcreteModel();// el modelo oigen
		modelFactoryAbstracta = loadAbstractaModel();// el modelo destino
		modelFactoryAbstracta.getListProjects().clear();
		//
		//
		for (ProjectAdj projectAdjConcreta : modelFactoryConcreta.getListProjects()) {

			// por un proyecto de la concrera se crea uno en la abstracta

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

	//
	//
	// // -------------------------------- Tranformacion M2T de parte abstracta a
	// archivos de texto -----------------------------------------------
	//
	// private TypeRam obtenerTipo(String nameType) {
	//
	// if(nameType.equals("String")) {
	// TypeRam typeRam = AbstractaFactory.eINSTANCE.createTypeRam();
	// typeRam.setName("String");
	// return typeRam;
	// }
	// return null;
	// }
	//
	//
	//
	//

	//
	//
	//
	//
	// /**
	// * Este metodo permite tranformar la parte abstacta del diagrama de clases a
	// archivos de python
	// */
	// public void transformationM2T() {
	//
	// modelFactoryAbstracta = loadAbstractaModel();
	//
	// for (ProjectRam proyecto : modelFactoryAbstracta.getListProjects()) {
	//
	// createFolderWindows(proyecto.getPath(), proyecto.getName());
	//
	// for (abstracta.PackageRam paquete : proyecto.getListPackagesRam()) {
	// createFolderWindows(paquete.getPath(), paquete.getName());
	//
	// for (abstracta.ClassRam clase : paquete.getListClassRam()) {
	// generarClase(clase);
	// }
	//
	// generarPaquete(paquete);
	// }
	// }
	// }
	//
	//
	// private void generarPaquete(abstracta.PackageRam paquete) {
	// createFolderWindows(paquete.getPath(), paquete.getName());
	//
	// for (abstracta.ClassRam clase : paquete.getListClassRam()) {
	// generarClase(clase);
	// }
	//
	// for (abstracta.PackageRam paquetHijo : paquete.getListPackagesChildsRam()) {
	// generarPaquete(paquetHijo);
	// }
	//
	// }
	//
	//
	//
	//
	// private void generarClase(abstracta.ClassRam clase) {
	//
	// StringBuilder cadenaClass = new StringBuilder();
	// String abstractaCadena = (clase.isIsAbstract()?"abstract":"");
	// String extendsCadena = crearCadenaExtends(clase);
	//
	// cadenaClass.append("package "+clase.getPathPackage().replace("/",".")+";\r\n"
	// +
	// "\r\n" +
	// "import java.io.File;\r\n" +
	// "\r\n" +
	// "import java.io.FileWriter;\r\n" +
	// "import java.io.IOException;\r\n" +
	// "import java.io.PrintWriter;\r\n" +
	// "import java.util.ArrayList;\r\n" +
	// "import java.util.List;\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "public class "+clase.getName()+" {\r\n" +
	// "\r\n" +
	// " //
	// --------------------------------------------------------------------------
	// Singleton
	// --------------------------------------------------------------------------\r\n"
	// +
	// "\r\n" +
	// " // Clase estatica oculta. Tan solo se instanciara el singleton una vez\r\n"
	// +
	// " private static class SingletonHolder {\r\n" +
	// " // El constructor de Singleton puede ser llamado desde aqui al ser
	// protected\r\n" +
	// " private final static ModelFactoryModel eINSTANCE = new
	// ModelFactoryModel();\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// " // Metodo para obtener la instancia de nuestra clase\r\n" +
	// " public static ModelFactoryModel getInstance() {\r\n" +
	// " return SingletonHolder.eINSTANCE;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// " //Creacion de las factories \r\n" +
	// " ModelFactoryConcreta modelFactoryConcreta =
	// ConcretaFactory.eINSTANCE.createModelFactoryConcreta();\r\n" +
	// " ModelFactoryAbstract modelFactoryAbstracta =
	// AbstractaFactory.eINSTANCE.createModelFactoryAbstract();\r\n" +
	// "\r\n" +
	// " public ModelFactoryModel() {\r\n" +
	// " modelFactoryConcreta = loadConcretaModel();\r\n" +
	// " modelFactoryAbstracta = loadAbstractaModel();\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " // -----------------------------------------------------------------Load
	// and Save ModelFactorys
	// ---------------------------------------------------------------\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite cargar el modelfactoryspecific del diagrama de
	// clases\r\n" +
	// " * @return El modelFactorySpecific cargada\r\n" +
	// " */\r\n" +
	// " public ModelFactoryConcreta loadConcretaModel() {\r\n" +
	// " ModelFactoryConcreta modelFactoryConcreta = null;\r\n" +
	// " ConcretaPackage whoownmePackage = ConcretaPackage.eINSTANCE;\r\n" +
	// " org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new
	// org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n" +
	// " org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n"
	// +
	// " .createURI(\"platform:/resource/test/src/model.concreta\");\r\n" +
	// " org.eclipse.emf.ecore.resource.Resource resource =
	// resourceSet.createResource(uri);\r\n" +
	// " try {\r\n" +
	// " resource.load(null);\r\n" +
	// " modelFactoryConcreta = (ModelFactoryConcreta)
	// resource.getContents().get(0);\r\n" +
	// " System.out.println(\"loaded: \" + modelFactoryConcreta);\r\n" +
	// " } catch (java.io.IOException e) {\r\n" +
	// " System.out.println(\"failed to read \" + uri);\r\n" +
	// " System.out.println(e);\r\n" +
	// " }\r\n" +
	// " return modelFactoryConcreta;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite cargar el modelFactoryAbstract del diagrama de
	// clases\r\n" +
	// " * @return\r\n" +
	// " */\r\n" +
	// " public ModelFactoryAbstract loadAbstractaModel() {\r\n" +
	// " ModelFactoryAbstract modelFactoryAbstracta = null;\r\n" +
	// " AbstractaPackage whoownmePackage = AbstractaPackage.eINSTANCE;\r\n" +
	// " org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new
	// org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n" +
	// " org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n"
	// +
	// " .createURI(\"platform:/resource/test/src/model.abstracta\");\r\n" +
	// " org.eclipse.emf.ecore.resource.Resource resource =
	// resourceSet.createResource(uri);\r\n" +
	// " try {\r\n" +
	// " resource.load(null);\r\n" +
	// " modelFactoryAbstracta = (ModelFactoryAbstract)
	// resource.getContents().get(0);\r\n" +
	// " System.out.println(\"loaded: \" + modelFactoryAbstracta);\r\n" +
	// " } catch (java.io.IOException e) {\r\n" +
	// " System.out.println(\"failed to read \" + uri);\r\n" +
	// " System.out.println(e);\r\n" +
	// " }\r\n" +
	// " return modelFactoryAbstracta;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite guardar el ModelFactorySpecific del diagrama de
	// clases\r\n" +
	// " */\r\n" +
	// " public void saveConcreta() {\r\n" +
	// "\r\n" +
	// " // EXISTEN 2 FORMAS DE GUARDAR EL RECURSO\r\n" +
	// " org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n"
	// +
	// " .createURI(\"platform:/resource/test/src/model.concreta\");\r\n" +
	// " org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new
	// org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n" +
	// "\r\n" +
	// " org.eclipse.emf.ecore.resource.Resource resource =
	// resourceSet.createResource(uri);\r\n" +
	// " resource.getContents().add(modelFactoryConcreta);\r\n" +
	// " try {\r\n" +
	// " resource.save(java.util.Collections.EMPTY_MAP);\r\n" +
	// " } catch (java.io.IOException e) {\r\n" +
	// " // TO-DO Auto-generated catch block\r\n" +
	// " e.printStackTrace();\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite guardar el ModelFactoryAbstract del diagrama de
	// clases\r\n" +
	// " */\r\n" +
	// " public void saveAbstracta() {\r\n" +
	// "\r\n" +
	// " // EXISTEN 2 FORMAS DE GUARDAR EL RECURSO\r\n" +
	// " org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n"
	// +
	// " .createURI(\"platform:/resource/test/src/model.abstracta\");\r\n" +
	// " org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new
	// org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n" +
	// "\r\n" +
	// " org.eclipse.emf.ecore.resource.Resource resource =
	// resourceSet.createResource(uri);\r\n" +
	// " resource.getContents().add(modelFactoryAbstracta);\r\n" +
	// " try {\r\n" +
	// " resource.save(java.util.Collections.EMPTY_MAP);\r\n" +
	// " } catch (java.io.IOException e) {\r\n" +
	// " // TO-DO Auto-generated catch block\r\n" +
	// " e.printStackTrace();\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " // ----------------------------------------- Tranformacion M2M de parte
	// especifica a parte a abstracta
	// -------------------------------------------\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo realiza la transformacion del modelo especifico a el
	// modelo\r\n" +
	// " * abstracto\r\n" +
	// " */\r\n" +
	// " public void transformationM2M() {\r\n" +
	// "\r\n" +
	// " modelFactoryConcreta = loadConcretaModel();// el modelo oigen\r\n" +
	// " modelFactoryAbstracta = loadAbstractaModel();// el modelo destino\r\n" +
	// " modelFactoryAbstracta.getListProjects().clear();\r\n" +
	// " \r\n" +
	// " \r\n" +
	// " for (concreta.ProjectRam projectRamConcreta :
	// modelFactoryConcreta.getListProjects()) {\r\n" +
	// "\r\n" +
	// " // por un proyecto de la concrera se crea uno en la abstracta\r\n" +
	// " ProjectRam proyectoRamAbstracta =
	// AbstractaFactory.eINSTANCE.createProjectRam();\r\n" +
	// " proyectoRamAbstracta.setName(projectRamConcreta.getName());\r\n" +
	// " proyectoRamAbstracta.setPath(projectRamConcreta.getPath());\r\n" +
	// " modelFactoryAbstracta.getListProjects().add(proyectoRamAbstracta);\r\n" +
	// " \r\n" +
	// " abstracta.PackageRam packageRaizRam =
	// AbstractaFactory.eINSTANCE.createPackageRam();\r\n" +
	// " packageRaizRam.setName(projectRamConcreta.getName());\r\n" +
	// " packageRaizRam.setPath(\"\");\r\n" +
	// " proyectoRamAbstracta.getListPackagesRam().add(packageRaizRam);\r\n" +
	// " \r\n" +
	// " for (DiagramClassRam diagrama :
	// projectRamConcreta.getListDiagramClassRam()) {\r\n" +
	// " for (PackageRam packageConcreta : diagrama.getListPackageRam()) {\r\n" +
	// " crearPaquete(packageConcreta,packageRaizRam);\r\n" +
	// " }\r\n" +
	// " for (ClassRam classRamConcreta : diagrama.getListClassRam()) {\r\n" +
	// " crearClass(packageRaizRam, classRamConcreta);\r\n" +
	// " }\r\n" +
	// " \r\n" +
	// " for (RelationRam relationRam : diagrama.getListRelationRam()) {\r\n" +
	// " crearRelacion(relationRam,packageRaizRam);\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// " \r\n" +
	// " \r\n" +
	// " }\r\n" +
	// " saveAbstracta();\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private void crearRelacion(RelationRam relationRamConcreta,
	// abstracta.PackageRam packageRaizRam) {\r\n" +
	// " \r\n" +
	// " ClassRam sourceConcreta = relationRamConcreta.getSource();\r\n" +
	// " ClassRam targetConcret = relationRamConcreta.getTarget();\r\n" +
	// " \r\n" +
	// " abstracta.ClassRam classRamAbstractaSource =
	// obtenerClase(sourceConcreta,packageRaizRam);\r\n" +
	// " abstracta.ClassRam classRamAbstractaTarget =
	// obtenerClase(targetConcret,packageRaizRam);\r\n" +
	// " \r\n" +
	// " abstracta.RelationRam relationRamAbstractaSource =
	// AbstractaFactory.eINSTANCE.createRelationRam();\r\n" +
	// " relationRamAbstractaSource.setSource(classRamAbstractaSource);\r\n" +
	// " relationRamAbstractaSource.setTarget(classRamAbstractaTarget);\r\n" +
	// " relationRamAbstractaSource.setRoleA(relationRamConcreta.getRoleA());\r\n" +
	// " relationRamAbstractaSource.setRoleB(relationRamConcreta.getRoleB());\r\n" +
	// " relationRamAbstractaSource.setMultA(relationRamConcreta.getMultA());\r\n" +
	// " relationRamAbstractaSource.setMultB(relationRamConcreta.getMultB());\r\n" +
	// "
	// classRamAbstractaSource.getListRelationRamSalida().add(relationRamAbstractaSource);\r\n"
	// +
	// " \r\n" +
	// " abstracta.RelationRam relationRamAbstractaTarget =
	// AbstractaFactory.eINSTANCE.createRelationRam();\r\n" +
	// " relationRamAbstractaSource.setSource(classRamAbstractaSource);\r\n" +
	// " relationRamAbstractaSource.setTarget(classRamAbstractaTarget);\r\n" +
	// " relationRamAbstractaSource.setRoleA(relationRamConcreta.getRoleB());\r\n" +
	// " relationRamAbstractaSource.setRoleB(relationRamConcreta.getRoleA());\r\n" +
	// " relationRamAbstractaSource.setMultA(relationRamConcreta.getMultB());\r\n" +
	// " relationRamAbstractaSource.setMultB(relationRamConcreta.getMultA());\r\n" +
	// "
	// classRamAbstractaTarget.getListRelationRamSalida().add(relationRamAbstractaSource);\r\n"
	// +
	// " \r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private abstracta.ClassRam obtenerClase(ClassRam claseABuscar,
	// abstracta.PackageRam packageRaizRam) {\r\n" +
	// "\r\n" +
	// " abstracta.PackageRam packageRam =
	// obtenerPackagePadre(claseABuscar.getPathPackage(), packageRaizRam);\r\n" +
	// " \r\n" +
	// " for (abstracta.ClassRam clase : packageRam.getListClassRam()) {\r\n" +
	// " if(claseABuscar.getName().equals(clase.getName())) {\r\n" +
	// " return clase;\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// " return null;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private void crearClass(abstracta.PackageRam packageRaizRam, ClassRam
	// classRamConcreta) {\r\n" +
	// " abstracta.ClassRam classRamAbsracta =
	// AbstractaFactory.eINSTANCE.createClassRam();\r\n" +
	// " classRamAbsracta.setDescription(classRamConcreta.getDescription());\r\n" +
	// " classRamAbsracta.setIsAbstract(classRamConcreta.isIsAbstract());\r\n" +
	// " classRamAbsracta.setName(classRamConcreta.getName());\r\n" +
	// " classRamAbsracta.setPathPackage(classRamConcreta.getPathPackage());\r\n" +
	// " \r\n" +
	// " abstracta.PackageRam paquetePadre =
	// obtenerPackagePadre(classRamAbsracta.getPathPackage(), packageRaizRam);\r\n"
	// +
	// " paquetePadre.getListClassRam().add(classRamAbsracta);\r\n" +
	// " \r\n" +
	// " for (AttributeRam attributeRamConcreta :
	// classRamConcreta.getListAttributeRam()) {\r\n" +
	// " abstracta.AttributeRam attributeRamAbstracta =
	// AbstractaFactory.eINSTANCE.createAttributeRam();\r\n" +
	// " attributeRamAbstracta.setName(attributeRamConcreta.getName());\r\n" +
	// " attributeRamAbstracta.setTypeRam(null);\r\n" +
	// " attributeRamAbstracta.setValue(attributeRamAbstracta.getValue());\r\n" +
	// " classRamAbsracta.getListAttributeRam().add(attributeRamAbstracta);\r\n" +
	// " }\r\n" +
	// " for (MethodRam methodRamConcreta : classRamConcreta.getListMethodRam())
	// {\r\n" +
	// " abstracta.MethodRam methodRam =
	// AbstractaFactory.eINSTANCE.createMethodRam();\r\n" +
	// " methodRam.setName(methodRamConcreta.getName());\r\n" +
	// " methodRam.setBody(methodRamConcreta.getBody());\r\n" +
	// " methodRam.setReturnType(methodRamConcreta.getReturnType());\r\n" +
	// " classRamAbsracta.getListMethodRam().add(methodRam);\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " // -------------------------------- Tranformacion M2T de parte abstracta a
	// archivos de texto -----------------------------------------------\r\n" +
	// "\r\n" +
	// " private TypeRam obtenerTipo(String nameType) {\r\n" +
	// " \r\n" +
	// " if(nameType.equals(\"String\")) {\r\n" +
	// " TypeRam typeRam = AbstractaFactory.eINSTANCE.createTypeRam();\r\n" +
	// " typeRam.setName(\"String\");\r\n" +
	// " return typeRam;\r\n" +
	// " }\r\n" +
	// " return null;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private void crearPaquete(PackageRam packageConcreta, abstracta.PackageRam
	// packageRaizRam) {\r\n" +
	// "\r\n" +
	// " abstracta.PackageRam newPaqueteAbstracta = null;\r\n" +
	// " newPaqueteAbstracta = AbstractaFactory.eINSTANCE.createPackageRam();\r\n" +
	// " newPaqueteAbstracta.setName(packageConcreta.getName());\r\n" +
	// " newPaqueteAbstracta.setPath(packageConcreta.getPath()==
	// null?\"\":packageConcreta.getPath());\r\n" +
	// "\r\n" +
	// " abstracta.PackageRam packageRamPadre =
	// obtenerPackagePadre(packageConcreta.getPath(),packageRaizRam);//src/main\r\n"
	// +
	// " packageRamPadre.getListPackagesChildsRam().add(newPaqueteAbstracta);\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private abstracta.PackageRam obtenerPackagePadre(String path,
	// abstracta.PackageRam packageRaizRam) {\r\n" +
	// " \r\n" +
	// " \r\n" +
	// " String[] pathArray = path.split(\"/\");//src,main\r\n" +
	// " abstracta.PackageRam padre = packageRaizRam;\r\n" +
	// " for (int j = 0; j < pathArray.length; j++) {\r\n" +
	// " padre = obtenerPaquete(pathArray[j],padre);\r\n" +
	// " }\r\n" +
	// " \r\n" +
	// " return padre;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private abstracta.PackageRam obtenerPaquete(String
	// nameP,abstracta.PackageRam packageParentRam) {\r\n" +
	// " for (abstracta.PackageRam pac :
	// packageParentRam.getListPackagesChildsRam()) {\r\n" +
	// " if(pac.getName().equalsIgnoreCase(nameP)) {\r\n" +
	// " return pac;\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// " abstracta.PackageRam packageRam2 =
	// AbstractaFactory.eINSTANCE.createPackageRam();\r\n" +
	// " packageRam2.setName(nameP);\r\n" +
	// "
	// packageRam2.setPath(packageParentRam.getPath()+\"/\"+packageParentRam.getName());\r\n"
	// +
	// " packageParentRam.getListPackagesChildsRam().add(packageRam2);\r\n" +
	// " return packageRam2;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite tranformar la parte abstacta del diagrama de clases a
	// archivos de python\r\n" +
	// " */\r\n" +
	// " public void transformationM2T() {\r\n" +
	// "\r\n" +
	// " modelFactoryAbstracta = loadAbstractaModel();\r\n" +
	// " \r\n" +
	// " for (ProjectRam proyecto : modelFactoryAbstracta.getListProjects()) {\r\n"
	// +
	// " \r\n" +
	// " createFolderWindows(proyecto.getPath(), proyecto.getName());\r\n" +
	// " \r\n" +
	// " for (abstracta.PackageRam paquete : proyecto.getListPackagesRam()) {\r\n" +
	// " createFolderWindows(paquete.getPath(), paquete.getName());\r\n" +
	// " \r\n" +
	// " for (abstracta.ClassRam clase : paquete.getListClassRam()) {\r\n" +
	// " generarClase(clase);\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private void generarClase(abstracta.ClassRam clase) {\r\n" +
	// " \r\n" +
	// " StringBuilder cadenaClass = new StringBuilder();\r\n" +
	// " String abstractaCadena = (clase.isIsAbstract()?\"abstract\":\"\");\r\n" +
	// " String extendsCadena = crearCadenaExtends(clase);\r\n" +
	// " \r\n" +
	// " cadenaClass.append(\"\");\r\n" +
	// "\r\n" +
	// " createFileWindows(clase.getPathPackage(), clase.getName()+\".java\",
	// cadenaClass.toString());\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " private String crearCadenaExtends(abstracta.ClassRam clase) {\r\n" +
	// " String cadena = \"\";\r\n" +
	// " \r\n" +
	// " for (int i = 0; i < clase.getListRelationRamSalida().size(); i++) {\r\n" +
	// " cadena +=
	// clase.getListRelationRamSalida().get(i).getTarget().getName();\r\n" +
	// " break;\r\n" +
	// " }\r\n" +
	// " if(clase.getListRelationRamSalida().size() > 0) {\r\n" +
	// " cadena = \"extends \"+cadena;\r\n" +
	// " }\r\n" +
	// " return cadena;\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite abrir un cuadro de dialogo para ingresar el nomber
	// del proyecto\r\n" +
	// " * @return el nombre del proyecto\r\n" +
	// " */\r\n" +
	// " public String ingresarInput() {\r\n" +
	// " // Mostrar un cuadro de diálogo de entrada\r\n" +
	// " String nameProject = JOptionPane.showInputDialog(\"Ingrese el nombre del
	// projecto:\");\r\n" +
	// "\r\n" +
	// " // Comprobar si el usuario ingresó algo y mostrarlo\r\n" +
	// " if (nameProject != null) {\r\n" +
	// " return nameProject;\r\n" +
	// " } else {\r\n" +
	// " return \"newProject\";\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite crear una carpeta en el sistema de windows\r\n" +
	// " * @param path\r\n" +
	// " * @param nameFolder\r\n" +
	// " */\r\n" +
	// " private void createFolderWindows(String path, String nameFolder) {\r\n" +
	// "\r\n" +
	// " // Crea un objeto File que representa la carpeta\r\n" +
	// " File newFolder = new File(path, nameFolder);\r\n" +
	// "\r\n" +
	// " // Verifica si la carpeta ya existe\r\n" +
	// " if (!newFolder.exists()) {\r\n" +
	// " // Intenta crear la carpeta\r\n" +
	// " boolean creado = newFolder.mkdirs();\r\n" +
	// " if (creado) {\r\n" +
	// " System.out.println(\"La carpeta se creó exitosamente.\");\r\n" +
	// " } else {\r\n" +
	// " System.out.println(\"No se pudo crear la carpeta.\");\r\n" +
	// " }\r\n" +
	// " } else {\r\n" +
	// " System.out.println(\"La carpeta ya existe.\");\r\n" +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// " /**\r\n" +
	// " * Este metodo permite crear un archivo en el sistema de windows\r\n" +
	// " * @param path\r\n" +
	// " * @param nameFile\r\n" +
	// " * @param content\r\n" +
	// " */\r\n" +
	// " private void createFileWindows(String path, String nameFile, String
	// content) {\r\n" +
	// "\r\n" +
	// " // Combinar la ruta y el nombre del archivo\r\n" +
	// " String absolutePath = path + \"\\\\\" + nameFile + \".py\";\r\n" +
	// "\r\n" +
	// " try {\r\n" +
	// " // Crear un objeto FileWriter para escribir en el archivo\r\n" +
	// " FileWriter fileWriter = new FileWriter(absolutePath);\r\n" +
	// "\r\n" +
	// " // Crear un objeto PrintWriter para escribir en el archivo de manera
	// más\r\n" +
	// " // conveniente\r\n" +
	// " PrintWriter printWriter = new PrintWriter(fileWriter);\r\n" +
	// "\r\n" +
	// " // Agregar contenido al archivo (por ejemplo, un programa Python
	// simple)\r\n" +
	// " printWriter.println(content);\r\n" +
	// " printWriter.close();\r\n" +
	// "\r\n" +
	// " System.out.println(\"El archivo se creó exitosamente.\");\r\n" +
	// " } catch (IOException e) {\r\n" +
	// " System.out.println(\"Error al crear el archivo: \" + e.getMessage());\r\n"
	// +
	// " }\r\n" +
	// " }\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "\r\n" +
	// "}\r\n" +
	// "");
	//
	// createFileWindows(clase.getPathPackage(), clase.getName()+".java",
	// cadenaClass.toString());
	// }
	//
	//
	//
	//
	// private String crearCadenaExtends(abstracta.ClassRam clase) {
	// String cadena = "";
	//
	// for (int i = 0; i < clase.getListRelationRamSalida().size(); i++) {
	// cadena += clase.getListRelationRamSalida().get(i).getTarget().getName();
	// break;
	// }
	// if(clase.getListRelationRamSalida().size() > 0) {
	// cadena = "extends "+cadena;
	// }
	// return cadena;
	// }
	//
	//
	//
	//
	// /**
	// * Este metodo permite abrir un cuadro de dialogo para ingresar el nomber del
	// proyecto
	// * @return el nombre del proyecto
	// */
	// public String ingresarInput() {
	// // Mostrar un cuadro de diálogo de entrada
	// String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del
	// projecto:");
	//
	// // Comprobar si el usuario ingresó algo y mostrarlo
	// if (nameProject != null) {
	// return nameProject;
	// } else {
	// return "newProject";
	// }
	// }
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	// /**
	// * Este metodo permite crear una carpeta en el sistema de windows
	// * @param path
	// * @param nameFolder
	// */
	// private void createFolderWindows(String path, String nameFolder) {
	//
	// // Crea un objeto File que representa la carpeta
	// File newFolder = new File(path, nameFolder);
	//
	// // Verifica si la carpeta ya existe
	// if (!newFolder.exists()) {
	// // Intenta crear la carpeta
	// boolean creado = newFolder.mkdirs();
	// if (creado) {
	// System.out.println("La carpeta se creó exitosamente.");
	// } else {
	// System.out.println("No se pudo crear la carpeta.");
	// }
	// } else {
	// System.out.println("La carpeta ya existe.");
	// }
	// }
	//
	// /**
	// * Este metodo permite crear un archivo en el sistema de windows
	// * @param path
	// * @param nameFile
	// * @param content
	// */
	// private void createFileWindows(String path, String nameFile, String content)
	// {
	//
	// // Combinar la ruta y el nombre del archivo
	// String absolutePath = path + "\\" + nameFile + ".py";
	//
	// try {
	// // Crear un objeto FileWriter para escribir en el archivo
	// FileWriter fileWriter = new FileWriter(absolutePath);
	//
	// // Crear un objeto PrintWriter para escribir en el archivo de manera más
	// // conveniente
	// PrintWriter printWriter = new PrintWriter(fileWriter);
	//
	// // Agregar contenido al archivo (por ejemplo, un programa Python simple)
	// printWriter.println(content);
	// printWriter.close();
	//
	// System.out.println("El archivo se creó exitosamente.");
	// } catch (IOException e) {
	// System.out.println("Error al crear el archivo: " + e.getMessage());
	// }
	// }
	//

}