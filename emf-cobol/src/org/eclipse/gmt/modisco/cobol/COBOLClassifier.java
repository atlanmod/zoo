/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypeded <em>Typeded</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLClassifier()
 * @model
 * @generated
 */
public interface COBOLClassifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Typeded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeded</em>' attribute.
	 * @see #setTypeded(Boolean)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLClassifier_Typeded()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getTypeded();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypeded <em>Typeded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeded</em>' attribute.
	 * @see #getTypeded()
	 * @generated
	 */
	void setTypeded(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLClassifier_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Typed Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.cobol.COBOLElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType <em>Shared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Elements</em>' reference list.
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLClassifier_TypedElements()
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType
	 * @model opposite="sharedType" ordered="false"
	 * @generated
	 */
	EList<COBOLElement> getTypedElements();

} // COBOLClassifier
