/*
 * 
 */
package concretemodel.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import concretemodel.diagram.edit.parts.ClassDiagramAdjEditPart;

/**
 * @generated
 */
public class ConcretemodelNewDiagramFileWizard extends Wizard {

	/**
	* @generated
	*/
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	* @generated
	*/
	private ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	* @generated
	*/
	private TransactionalEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	public ConcretemodelNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(Messages.ConcretemodelNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(Messages.ConcretemodelNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(Messages.ConcretemodelNewDiagramFileWizard_CreationPageDescription,
				ClassDiagramAdjEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(
				ConcretemodelDiagramEditorUtil.getUniqueFileName(filePath, fileName, "concretemodel_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	* @generated
	*/
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		ConcretemodelDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(myEditingDomain,
				Messages.ConcretemodelNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = ConcretemodelVisualIDRegistry
						.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != ClassDiagramAdjEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(Messages.ConcretemodelNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(diagramRootElementSelectionPage.getModelElement(),
						ClassDiagramAdjEditPart.MODEL_ID, ConcretemodelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
			diagramResource.save(ConcretemodelDiagramEditorUtil.getSaveOptions());
			ConcretemodelDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Save operation failed for: " + diagramModelURI, //$NON-NLS-1$
					ex);
		} catch (PartInitException ex) {
			ConcretemodelDiagramEditorPlugin.getInstance().logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	* @generated
	*/
	private static class DiagramRootElementSelectionPage extends ModelElementSelectionPage {

		/**
		* @generated
		*/
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		* @generated
		*/
		protected String getSelectionTitle() {
			return Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		* @generated
		*/
		protected boolean validatePage() {
			if (getModelElement() == null) {
				setErrorMessage(Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService.getInstance()
					.provides(new CreateDiagramViewOperation(new EObjectAdapter(getModelElement()),
							ClassDiagramAdjEditPart.MODEL_ID,
							ConcretemodelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: Messages.ConcretemodelNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
