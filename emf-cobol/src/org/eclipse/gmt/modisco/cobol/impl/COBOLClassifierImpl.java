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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.cobol.COBOLClassifier;
import org.eclipse.gmt.modisco.cobol.COBOLElement;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COBOL Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl#getTypeded <em>Typeded</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COBOLClassifierImpl extends MinimalEObjectImpl.Container implements COBOLClassifier {
	/**
	 * The default value of the '{@link #getTypeded() <em>Typeded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TYPEDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeded() <em>Typeded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeded()
	 * @generated
	 * @ordered
	 */
	protected Boolean typeded = TYPEDED_EDEFAULT;

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
	 * The cached value of the '{@link #getTypedElements() <em>Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<COBOLElement> typedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COBOLClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobolPackage.Literals.COBOL_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTypeded() {
		return typeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeded(Boolean newTypeded) {
		Boolean oldTypeded = typeded;
		typeded = newTypeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_CLASSIFIER__TYPEDED, oldTypeded, typeded));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CobolPackage.COBOL_CLASSIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COBOLElement> getTypedElements() {
		if (typedElements == null) {
			typedElements = new EObjectWithInverseResolvingEList<COBOLElement>(COBOLElement.class, this, CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS, CobolPackage.COBOL_ELEMENT__SHARED_TYPE);
		}
		return typedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedElements()).basicAdd(otherEnd, msgs);
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
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				return ((InternalEList<?>)getTypedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobolPackage.COBOL_CLASSIFIER__TYPEDED:
				return getTypeded();
			case CobolPackage.COBOL_CLASSIFIER__NAME:
				return getName();
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				return getTypedElements();
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
			case CobolPackage.COBOL_CLASSIFIER__TYPEDED:
				setTypeded((Boolean)newValue);
				return;
			case CobolPackage.COBOL_CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				getTypedElements().clear();
				getTypedElements().addAll((Collection<? extends COBOLElement>)newValue);
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
			case CobolPackage.COBOL_CLASSIFIER__TYPEDED:
				setTypeded(TYPEDED_EDEFAULT);
				return;
			case CobolPackage.COBOL_CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				getTypedElements().clear();
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
			case CobolPackage.COBOL_CLASSIFIER__TYPEDED:
				return TYPEDED_EDEFAULT == null ? typeded != null : !TYPEDED_EDEFAULT.equals(typeded);
			case CobolPackage.COBOL_CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CobolPackage.COBOL_CLASSIFIER__TYPED_ELEMENTS:
				return typedElements != null && !typedElements.isEmpty();
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
		result.append(" (typeded: ");
		result.append(typeded);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //COBOLClassifierImpl
