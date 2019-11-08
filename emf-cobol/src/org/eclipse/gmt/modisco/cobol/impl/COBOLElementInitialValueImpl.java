/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue;
import org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Element Initial Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl#getInitVal <em>Init Val</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl#getValueKind <em>Value Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLElementInitialValueImpl extends MinimalEObjectImpl.Container implements COBOLElementInitialValue {
	/**
	 * The default value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVal()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVal()
	 * @generated
	 * @ordered
	 */
	protected String initVal = INIT_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueKind() <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueKind()
	 * @generated
	 * @ordered
	 */
	protected static final COBOLInitialValueKind VALUE_KIND_EDEFAULT = COBOLInitialValueKind.CIVK_STRING_VALUE;

	/**
	 * The cached value of the '{@link #getValueKind() <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueKind()
	 * @generated
	 * @ordered
	 */
	protected COBOLInitialValueKind valueKind = VALUE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLElementInitialValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_ELEMENT_INITIAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitVal() {
		return initVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitVal(String newInitVal) {
		String oldInitVal = initVal;
		initVal = newInitVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL, oldInitVal, initVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLInitialValueKind getValueKind() {
		return valueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueKind(COBOLInitialValueKind newValueKind) {
		COBOLInitialValueKind oldValueKind = valueKind;
		valueKind = newValueKind == null ? VALUE_KIND_EDEFAULT : newValueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND, oldValueKind, valueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL:
				return getInitVal();
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND:
				return getValueKind();
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
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL:
				setInitVal((String)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND:
				setValueKind((COBOLInitialValueKind)newValue);
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
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL:
				setInitVal(INIT_VAL_EDEFAULT);
				return;
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND:
				setValueKind(VALUE_KIND_EDEFAULT);
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
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL:
				return INIT_VAL_EDEFAULT == null ? initVal != null : !INIT_VAL_EDEFAULT.equals(initVal);
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND:
				return valueKind != VALUE_KIND_EDEFAULT;
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
		result.append(" (initVal: ");
		result.append(initVal);
		result.append(", valueKind: ");
		result.append(valueKind);
		result.append(')');
		return result.toString();
	}

} //COBOLElementInitialValueImpl
