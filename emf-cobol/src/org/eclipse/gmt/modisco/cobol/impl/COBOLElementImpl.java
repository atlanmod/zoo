/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.cobol.COBOL88Element;
import org.eclipse.gmt.modisco.cobol.COBOLClassifier;
import org.eclipse.gmt.modisco.cobol.COBOLComposedType;
import org.eclipse.gmt.modisco.cobol.COBOLElement;
import org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue;
import org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray;
import org.eclipse.gmt.modisco.cobol.COBOLSourceText;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getSharedType <em>Shared Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLElementImpl extends MinimalEObjectImpl.Container implements COBOLElement {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefined() <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REFINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected Boolean refined = REFINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedType() <em>Shared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedType()
	 * @generated
	 * @ordered
	 */
	protected COBOLClassifier sharedType;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected EList<COBOLElementInitialValue> initial;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<COBOL88Element> contains;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected COBOLSourceText source;

	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected COBOLFixedLengthArray array;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefined(Boolean newRefined) {
		Boolean oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLClassifier getSharedType() {
		if (sharedType != null && sharedType.eIsProxy()) {
			InternalEObject oldSharedType = (InternalEObject)sharedType;
			sharedType = (COBOLClassifier)eResolveProxy(oldSharedType);
			if (sharedType != oldSharedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobolPackage.COBOL_ELEMENT__SHARED_TYPE, oldSharedType, sharedType));
			}
		}
		return sharedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLClassifier basicGetSharedType() {
		return sharedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedType(COBOLClassifier newSharedType, NotificationChain msgs) {
		COBOLClassifier oldSharedType = sharedType;
		sharedType = newSharedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__SHARED_TYPE, oldSharedType, newSharedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedType(COBOLClassifier newSharedType) {
		if (newSharedType != sharedType) {
			NotificationChain msgs = null;
			if (sharedType != null)
				msgs = ((InternalEObject)sharedType).eInverseRemove(this, CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS, COBOLClassifier.class, msgs);
			if (newSharedType != null)
				msgs = ((InternalEObject)newSharedType).eInverseAdd(this, CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS, COBOLClassifier.class, msgs);
			msgs = basicSetSharedType(newSharedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__SHARED_TYPE, newSharedType, newSharedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLComposedType getGroup() {
		if (eContainerFeatureID() != CobolPackage.COBOL_ELEMENT__GROUP) return null;
		return (COBOLComposedType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLComposedType basicGetGroup() {
		if (eContainerFeatureID() != CobolPackage.COBOL_ELEMENT__GROUP) return null;
		return (COBOLComposedType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(COBOLComposedType newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, CobolPackage.COBOL_ELEMENT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(COBOLComposedType newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != CobolPackage.COBOL_ELEMENT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, CobolPackage.COBOL_COMPOSED_TYPE__ELEMENTS, COBOLComposedType.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COBOLElementInitialValue> getInitial() {
		if (initial == null) {
			initial = new EObjectResolvingEList<COBOLElementInitialValue>(COBOLElementInitialValue.class, this, CobolPackage.COBOL_ELEMENT__INITIAL);
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COBOL88Element> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<COBOL88Element>(COBOL88Element.class, this, CobolPackage.COBOL_ELEMENT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLSourceText getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (COBOLSourceText)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobolPackage.COBOL_ELEMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLSourceText basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(COBOLSourceText newSource) {
		COBOLSourceText oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLFixedLengthArray getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(COBOLFixedLengthArray newArray, NotificationChain msgs) {
		COBOLFixedLengthArray oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__ARRAY, oldArray, newArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(COBOLFixedLengthArray newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CobolPackage.COBOL_ELEMENT__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CobolPackage.COBOL_ELEMENT__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_ELEMENT__ARRAY, newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				if (sharedType != null)
					msgs = ((InternalEObject)sharedType).eInverseRemove(this, CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS, COBOLClassifier.class, msgs);
				return basicSetSharedType((COBOLClassifier)otherEnd, msgs);
			case CobolPackage.COBOL_ELEMENT__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((COBOLComposedType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				return basicSetSharedType(null, msgs);
			case CobolPackage.COBOL_ELEMENT__GROUP:
				return basicSetGroup(null, msgs);
			case CobolPackage.COBOL_ELEMENT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case CobolPackage.COBOL_ELEMENT__ARRAY:
				return basicSetArray(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CobolPackage.COBOL_ELEMENT__GROUP:
				return eInternalContainer().eInverseRemove(this, CobolPackage.COBOL_COMPOSED_TYPE__ELEMENTS, COBOLComposedType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_ELEMENT__LEVEL:
				return getLevel();
			case CobolPackage.COBOL_ELEMENT__REFINED:
				return getRefined();
			case CobolPackage.COBOL_ELEMENT__NAME:
				return getName();
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				if (resolve) return getSharedType();
				return basicGetSharedType();
			case CobolPackage.COBOL_ELEMENT__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case CobolPackage.COBOL_ELEMENT__INITIAL:
				return getInitial();
			case CobolPackage.COBOL_ELEMENT__CONTAINS:
				return getContains();
			case CobolPackage.COBOL_ELEMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CobolPackage.COBOL_ELEMENT__ARRAY:
				return getArray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CobolPackage.COBOL_ELEMENT__LEVEL:
				setLevel((String)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__REFINED:
				setRefined((Boolean)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				setSharedType((COBOLClassifier)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__GROUP:
				setGroup((COBOLComposedType)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__INITIAL:
				getInitial().clear();
				getInitial().addAll((Collection<? extends COBOLElementInitialValue>)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends COBOL88Element>)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__SOURCE:
				setSource((COBOLSourceText)newValue);
				return;
			case CobolPackage.COBOL_ELEMENT__ARRAY:
				setArray((COBOLFixedLengthArray)newValue);
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
			case CobolPackage.COBOL_ELEMENT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case CobolPackage.COBOL_ELEMENT__REFINED:
				setRefined(REFINED_EDEFAULT);
				return;
			case CobolPackage.COBOL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				setSharedType((COBOLClassifier)null);
				return;
			case CobolPackage.COBOL_ELEMENT__GROUP:
				setGroup((COBOLComposedType)null);
				return;
			case CobolPackage.COBOL_ELEMENT__INITIAL:
				getInitial().clear();
				return;
			case CobolPackage.COBOL_ELEMENT__CONTAINS:
				getContains().clear();
				return;
			case CobolPackage.COBOL_ELEMENT__SOURCE:
				setSource((COBOLSourceText)null);
				return;
			case CobolPackage.COBOL_ELEMENT__ARRAY:
				setArray((COBOLFixedLengthArray)null);
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
			case CobolPackage.COBOL_ELEMENT__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case CobolPackage.COBOL_ELEMENT__REFINED:
				return REFINED_EDEFAULT == null ? refined != null : !REFINED_EDEFAULT.equals(refined);
			case CobolPackage.COBOL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CobolPackage.COBOL_ELEMENT__SHARED_TYPE:
				return sharedType != null;
			case CobolPackage.COBOL_ELEMENT__GROUP:
				return basicGetGroup() != null;
			case CobolPackage.COBOL_ELEMENT__INITIAL:
				return initial != null && !initial.isEmpty();
			case CobolPackage.COBOL_ELEMENT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case CobolPackage.COBOL_ELEMENT__SOURCE:
				return source != null;
			case CobolPackage.COBOL_ELEMENT__ARRAY:
				return array != null;
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
		result.append(" (level: ");
		result.append(level);
		result.append(", refined: ");
		result.append(refined);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //COBOLElementImpl
