/**
 */
package scheduler.mergebuilder.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scheduler.mergebuilder.Builder;
import scheduler.mergebuilder.Director;
import scheduler.mergebuilder.MergebuilderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Director</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DirectorImpl extends MinimalEObjectImpl.Container implements Director {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MergebuilderPackage.Literals.DIRECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mergeSchedule(Builder builder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MergebuilderPackage.DIRECTOR___MERGE_SCHEDULE__BUILDER:
				mergeSchedule((Builder)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DirectorImpl
