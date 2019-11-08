/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Element Initial Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getInitVal <em>Init Val</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getValueKind <em>Value Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElementInitialValue()
 * @model
 * @generated
 */
public interface COBOLElementInitialValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Init Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Val</em>' attribute.
	 * @see #setInitVal(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElementInitialValue_InitVal()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getInitVal();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getInitVal <em>Init Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Val</em>' attribute.
	 * @see #getInitVal()
	 * @generated
	 */
	void setInitVal(String value);

	/**
	 * Returns the value of the '<em><b>Value Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind
	 * @see #setValueKind(COBOLInitialValueKind)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLElementInitialValue_ValueKind()
	 * @model unique="false" required="true"
	 * @generated
	 */
	COBOLInitialValueKind getValueKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getValueKind <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind
	 * @see #getValueKind()
	 * @generated
	 */
	void setValueKind(COBOLInitialValueKind value);

} // COBOLElementInitialValue
