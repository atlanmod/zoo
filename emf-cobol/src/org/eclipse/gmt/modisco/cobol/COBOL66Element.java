/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL66 Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL66Element()
 * @model
 * @generated
 */
public interface COBOL66Element extends EObject {
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
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL66Element_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(COBOLElement)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL66Element_End()
	 * @model
	 * @generated
	 */
	COBOLElement getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(COBOLElement value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(COBOLElement)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL66Element_Start()
	 * @model required="true"
	 * @generated
	 */
	COBOLElement getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(COBOLElement value);

} // COBOL66Element
