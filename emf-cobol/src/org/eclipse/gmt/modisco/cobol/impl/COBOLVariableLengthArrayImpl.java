/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.cobol.COBOLElement;
import org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Variable Length Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl#getMinUpper <em>Min Upper</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl#getDependingOn <em>Depending On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLVariableLengthArrayImpl extends COBOLFixedLengthArrayImpl implements COBOLVariableLengthArray {
	/**
	 * The default value of the '{@link #getMinUpper() <em>Min Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinUpper() <em>Min Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer minUpper = MIN_UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependingOn() <em>Depending On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependingOn()
	 * @generated
	 * @ordered
	 */
	protected COBOLElement dependingOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLVariableLengthArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_VARIABLE_LENGTH_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinUpper() {
		return minUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinUpper(Integer newMinUpper) {
		Integer oldMinUpper = minUpper;
		minUpper = newMinUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER, oldMinUpper, minUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElement getDependingOn() {
		if (dependingOn != null && dependingOn.eIsProxy()) {
			InternalEObject oldDependingOn = (InternalEObject)dependingOn;
			dependingOn = (COBOLElement)eResolveProxy(oldDependingOn);
			if (dependingOn != oldDependingOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON, oldDependingOn, dependingOn));
			}
		}
		return dependingOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElement basicGetDependingOn() {
		return dependingOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependingOn(COBOLElement newDependingOn) {
		COBOLElement oldDependingOn = dependingOn;
		dependingOn = newDependingOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON, oldDependingOn, dependingOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER:
				return getMinUpper();
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON:
				if (resolve) return getDependingOn();
				return basicGetDependingOn();
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
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER:
				setMinUpper((Integer)newValue);
				return;
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON:
				setDependingOn((COBOLElement)newValue);
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
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER:
				setMinUpper(MIN_UPPER_EDEFAULT);
				return;
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON:
				setDependingOn((COBOLElement)null);
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
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER:
				return MIN_UPPER_EDEFAULT == null ? minUpper != null : !MIN_UPPER_EDEFAULT.equals(minUpper);
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON:
				return dependingOn != null;
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
		result.append(" (minUpper: ");
		result.append(minUpper);
		result.append(')');
		return result.toString();
	}

} //COBOLVariableLengthArrayImpl
