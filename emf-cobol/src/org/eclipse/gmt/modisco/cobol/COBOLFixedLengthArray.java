/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Fixed Length Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray#getMaxUpper <em>Max Upper</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLFixedLengthArray()
 * @model
 * @generated
 */
public interface COBOLFixedLengthArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Upper</em>' attribute.
	 * @see #setMaxUpper(Integer)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLFixedLengthArray_MaxUpper()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Integer getMaxUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray#getMaxUpper <em>Max Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Upper</em>' attribute.
	 * @see #getMaxUpper()
	 * @generated
	 */
	void setMaxUpper(Integer value);

} // COBOLFixedLengthArray
