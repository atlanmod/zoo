/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gmt.modisco.cobol.COBOL88ElementValue;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL88 Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOL88ElementValueImpl extends MinimalEObjectImpl.Container implements COBOL88ElementValue {
	/**
	 * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected String lowerLimit = LOWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected String upperLimit = UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Boolean range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOL88ElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL88_ELEMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(String newLowerLimit) {
		String oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL88_ELEMENT_VALUE__LOWER_LIMIT, oldLowerLimit, lowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(String newUpperLimit) {
		String oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL88_ELEMENT_VALUE__UPPER_LIMIT, oldUpperLimit, upperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Boolean newRange) {
		Boolean oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL88_ELEMENT_VALUE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL88_ELEMENT_VALUE__LOWER_LIMIT:
				return getLowerLimit();
			case CobolPackage.COBOL88_ELEMENT_VALUE__UPPER_LIMIT:
				return getUpperLimit();
			case CobolPackage.COBOL88_ELEMENT_VALUE__RANGE:
				return getRange();
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
			case CobolPackage.COBOL88_ELEMENT_VALUE__LOWER_LIMIT:
				setLowerLimit((String)newValue);
				return;
			case CobolPackage.COBOL88_ELEMENT_VALUE__UPPER_LIMIT:
				setUpperLimit((String)newValue);
				return;
			case CobolPackage.COBOL88_ELEMENT_VALUE__RANGE:
				setRange((Boolean)newValue);
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
			case CobolPackage.COBOL88_ELEMENT_VALUE__LOWER_LIMIT:
				setLowerLimit(LOWER_LIMIT_EDEFAULT);
				return;
			case CobolPackage.COBOL88_ELEMENT_VALUE__UPPER_LIMIT:
				setUpperLimit(UPPER_LIMIT_EDEFAULT);
				return;
			case CobolPackage.COBOL88_ELEMENT_VALUE__RANGE:
				setRange(RANGE_EDEFAULT);
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
			case CobolPackage.COBOL88_ELEMENT_VALUE__LOWER_LIMIT:
				return LOWER_LIMIT_EDEFAULT == null ? lowerLimit != null : !LOWER_LIMIT_EDEFAULT.equals(lowerLimit);
			case CobolPackage.COBOL88_ELEMENT_VALUE__UPPER_LIMIT:
				return UPPER_LIMIT_EDEFAULT == null ? upperLimit != null : !UPPER_LIMIT_EDEFAULT.equals(upperLimit);
			case CobolPackage.COBOL88_ELEMENT_VALUE__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
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
		result.append(" (lowerLimit: ");
		result.append(lowerLimit);
		result.append(", upperLimit: ");
		result.append(upperLimit);
		result.append(", range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //COBOL88ElementValueImpl
