/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Fixed Length Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLFixedLengthArrayImpl#getMaxUpper <em>Max Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLFixedLengthArrayImpl extends MinimalEObjectImpl.Container implements COBOLFixedLengthArray {
	/**
	 * The default value of the '{@link #getMaxUpper() <em>Max Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxUpper() <em>Max Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer maxUpper = MAX_UPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLFixedLengthArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_FIXED_LENGTH_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxUpper() {
		return maxUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUpper(Integer newMaxUpper) {
		Integer oldMaxUpper = maxUpper;
		maxUpper = newMaxUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER, oldMaxUpper, maxUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER:
				return getMaxUpper();
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
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER:
				setMaxUpper((Integer)newValue);
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
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER:
				setMaxUpper(MAX_UPPER_EDEFAULT);
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
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER:
				return MAX_UPPER_EDEFAULT == null ? maxUpper != null : !MAX_UPPER_EDEFAULT.equals(maxUpper);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxUpper: ");
		result.append(maxUpper);
		result.append(')');
		return result.toString();
	}

} //COBOLFixedLengthArrayImpl
