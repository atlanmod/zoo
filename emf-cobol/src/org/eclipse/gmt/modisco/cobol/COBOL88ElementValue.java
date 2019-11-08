/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL88 Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL88ElementValue()
 * @model
 * @generated
 */
public interface COBOL88ElementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' attribute.
	 * @see #setLowerLimit(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL88ElementValue_LowerLimit()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getLowerLimit <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' attribute.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(String value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' attribute.
	 * @see #setUpperLimit(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL88ElementValue_UpperLimit()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getUpperLimit <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' attribute.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(Boolean)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOL88ElementValue_Range()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Boolean value);

} // COBOL88ElementValue
