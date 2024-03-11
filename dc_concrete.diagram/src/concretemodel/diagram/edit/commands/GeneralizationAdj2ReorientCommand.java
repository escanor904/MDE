/*
 * 
 */
package concretemodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concretemodel.ClassConcreteAdj;
import concretemodel.ClassDiagramAdj;
import concretemodel.GeneralizationAdj;
import concretemodel.diagram.edit.policies.ConcretemodelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GeneralizationAdj2ReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public GeneralizationAdj2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GeneralizationAdj) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ClassConcreteAdj && newEnd instanceof ClassConcreteAdj)) {
			return false;
		}
		ClassConcreteAdj target = getLink().getClassTarget();
		if (!(getLink().eContainer() instanceof ClassDiagramAdj)) {
			return false;
		}
		ClassDiagramAdj container = (ClassDiagramAdj) getLink().eContainer();
		return ConcretemodelBaseItemSemanticEditPolicy.getLinkConstraints().canExistGeneralizationAdj_4008(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ClassConcreteAdj && newEnd instanceof ClassConcreteAdj)) {
			return false;
		}
		ClassConcreteAdj source = getLink().getClassSource();
		if (!(getLink().eContainer() instanceof ClassDiagramAdj)) {
			return false;
		}
		ClassDiagramAdj container = (ClassDiagramAdj) getLink().eContainer();
		return ConcretemodelBaseItemSemanticEditPolicy.getLinkConstraints().canExistGeneralizationAdj_4008(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setClassSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setClassTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected GeneralizationAdj getLink() {
		return (GeneralizationAdj) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ClassConcreteAdj getOldSource() {
		return (ClassConcreteAdj) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassConcreteAdj getNewSource() {
		return (ClassConcreteAdj) newEnd;
	}

	/**
	* @generated
	*/
	protected ClassConcreteAdj getOldTarget() {
		return (ClassConcreteAdj) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassConcreteAdj getNewTarget() {
		return (ClassConcreteAdj) newEnd;
	}
}
