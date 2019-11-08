/**
 */
package org.eclipse.gmt.modisco.cobol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Variable Length Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getMinUpper <em>Min Upper</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getDependingOn <em>Depending On</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLVariableLengthArray()
 * @model
 * @generated
 */
public interface COBOLVariableLengthArray extends COBOLFixedLengthArray {
	/**
	 * Returns the value of the '<em><b>Min Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Upper</em>' attribute.
	 * @see #setMinUpper(Integer)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLVariableLengthArray_MinUpper()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Integer getMinUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getMinUpper <em>Min Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Upper</em>' attribute.
	 * @see #getMinUpper()
	 * @generated
	 */
	void setMinUpper(Integer value);

	/**
	 * Returns the value of the '<em><b>Depending On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depending On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depending On</em>' reference.
	 * @see #setDependingOn(COBOLElement)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLVariableLengthArray_DependingOn()
	 * @model required="true"
	 * @generated
	 */
	COBOLElement getDependingOn();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getDependingOn <em>Depending On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depending On</em>' reference.
	 * @see #getDependingOn()
	 * @generated
	 */
	void setDependingOn(COBOLElement value);

} // COBOLVariableLengthArray
