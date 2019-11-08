/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getRefined <em>Refined</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType <em>Shared Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement()
 * @model
 * @generated
 */
public interface COBOLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Level()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined</em>' attribute.
	 * @see #setRefined(Boolean)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Refined()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getRefined();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getRefined <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' attribute.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Boolean value);

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
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shared Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypedElements <em>Typed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Type</em>' reference.
	 * @see #setSharedType(COBOLClassifier)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_SharedType()
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypedElements
	 * @model opposite="typedElements" required="true"
	 * @generated
	 */
	COBOLClassifier getSharedType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType <em>Shared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Type</em>' reference.
	 * @see #getSharedType()
	 * @generated
	 */
	void setSharedType(COBOLClassifier value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.cobol.COBOLComposedType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(COBOLComposedType)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Group()
	 * @see org.eclipse.gmt.modisco.cobol.COBOLComposedType#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	COBOLComposedType getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(COBOLComposedType value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference list.
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Initial()
	 * @model ordered="false"
	 * @generated
	 */
	EList<COBOLElementInitialValue> getInitial();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.cobol.COBOL88Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Contains()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<COBOL88Element> getContains();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(COBOLSourceText)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Source()
	 * @model required="true"
	 * @generated
	 */
	COBOLSourceText getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(COBOLSourceText value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(COBOLFixedLengthArray)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElement_Array()
	 * @model containment="true"
	 * @generated
	 */
	COBOLFixedLengthArray getArray();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(COBOLFixedLengthArray value);

} // COBOLElement
