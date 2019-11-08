/**
 */
package org.eclipse.gmt.modisco.cobol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Redefining Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement#getRedefines <em>Redefines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLRedefiningElement()
 * @model
 * @generated
 */
public interface COBOLRedefiningElement extends COBOLElement {
	/**
	 * Returns the value of the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefines</em>' reference.
	 * @see #setRedefines(COBOLElement)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLRedefiningElement_Redefines()
	 * @model required="true"
	 * @generated
	 */
	COBOLElement getRedefines();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement#getRedefines <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefines</em>' reference.
	 * @see #getRedefines()
	 * @generated
	 */
	void setRedefines(COBOLElement value);

} // COBOLRedefiningElement
