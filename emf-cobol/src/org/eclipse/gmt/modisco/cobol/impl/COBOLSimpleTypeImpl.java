/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.cobol.COBOLSimpleType;
import org.eclipse.gmt.modisco.cobol.COBOLUsageValue;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl#getUsageValue <em>Usage Value</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl#getPictureString <em>Picture String</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLSimpleTypeImpl extends COBOLClassifierImpl implements COBOLSimpleType {
	/**
	 * The default value of the '{@link #getUsageValue() <em>Usage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageValue()
	 * @generated
	 * @ordered
	 */
	protected static final COBOLUsageValue USAGE_VALUE_EDEFAULT = COBOLUsageValue.CUV_BINARY;

	/**
	 * The cached value of the '{@link #getUsageValue() <em>Usage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageValue()
	 * @generated
	 * @ordered
	 */
	protected COBOLUsageValue usageValue = USAGE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPictureString() <em>Picture String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureString()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPictureString() <em>Picture String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureString()
	 * @generated
	 * @ordered
	 */
	protected String pictureString = PICTURE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Boolean usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLUsageValue getUsageValue() {
		return usageValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageValue(COBOLUsageValue newUsageValue) {
		COBOLUsageValue oldUsageValue = usageValue;
		usageValue = newUsageValue == null ? USAGE_VALUE_EDEFAULT : newUsageValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_SIMPLE_TYPE__USAGE_VALUE, oldUsageValue, usageValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPictureString() {
		return pictureString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPictureString(String newPictureString) {
		String oldPictureString = pictureString;
		pictureString = newPictureString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_SIMPLE_TYPE__PICTURE_STRING, oldPictureString, pictureString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(Boolean newUsage) {
		Boolean oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_SIMPLE_TYPE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE_VALUE:
				return getUsageValue();
			case CobolPackage.COBOL_SIMPLE_TYPE__PICTURE_STRING:
				return getPictureString();
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE:
				return getUsage();
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
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE_VALUE:
				setUsageValue((COBOLUsageValue)newValue);
				return;
			case CobolPackage.COBOL_SIMPLE_TYPE__PICTURE_STRING:
				setPictureString((String)newValue);
				return;
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE:
				setUsage((Boolean)newValue);
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
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE_VALUE:
				setUsageValue(USAGE_VALUE_EDEFAULT);
				return;
			case CobolPackage.COBOL_SIMPLE_TYPE__PICTURE_STRING:
				setPictureString(PICTURE_STRING_EDEFAULT);
				return;
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE_VALUE:
				return usageValue != USAGE_VALUE_EDEFAULT;
			case CobolPackage.COBOL_SIMPLE_TYPE__PICTURE_STRING:
				return PICTURE_STRING_EDEFAULT == null ? pictureString != null : !PICTURE_STRING_EDEFAULT.equals(pictureString);
			case CobolPackage.COBOL_SIMPLE_TYPE__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (usageValue: ");
		result.append(usageValue);
		result.append(", pictureString: ");
		result.append(pictureString);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //COBOLSimpleTypeImpl
