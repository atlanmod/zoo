/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.cobol.COBOLElement;
import org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Redefining Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLRedefiningElementImpl#getRedefines <em>Redefines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLRedefiningElementImpl extends COBOLElementImpl implements COBOLRedefiningElement {
	/**
	 * The cached value of the '{@link #getRedefines() <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefines()
	 * @generated
	 * @ordered
	 */
	protected COBOLElement redefines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLRedefiningElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_REDEFINING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElement getRedefines() {
		if (redefines != null && redefines.eIsProxy()) {
			InternalEObject oldRedefines = (InternalEObject)redefines;
			redefines = (COBOLElement)eResolveProxy(oldRedefines);
			if (redefines != oldRedefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES, oldRedefines, redefines));
			}
		}
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElement basicGetRedefines() {
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefines(COBOLElement newRedefines) {
		COBOLElement oldRedefines = redefines;
		redefines = newRedefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES, oldRedefines, redefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES:
				if (resolve) return getRedefines();
				return basicGetRedefines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES:
				setRedefines((COBOLElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES:
				setRedefines((COBOLElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CobolPackage.COBOL_REDEFINING_ELEMENT__REDEFINES:
				return redefines != null;
		}
		return super.eIsSet(featureID);
	}

} //COBOLRedefiningElementImpl
