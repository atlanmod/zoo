/**
 */
package org.eclipse.gmt.modisco.cobol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsageValue <em>Usage Value</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getPictureString <em>Picture String</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLSimpleType()
 * @model
 * @generated
 */
public interface COBOLSimpleType extends COBOLClassifier {
	/**
	 * Returns the value of the '<em><b>Usage Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.cobol.COBOLUsageValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Value</em>' attribute.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLUsageValue
	 * @see #setUsageValue(COBOLUsageValue)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLSimpleType_UsageValue()
	 * @model unique="false" required="true"
	 * @generated
	 */
	COBOLUsageValue getUsageValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsageValue <em>Usage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Value</em>' attribute.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLUsageValue
	 * @see #getUsageValue()
	 * @generated
	 */
	void setUsageValue(COBOLUsageValue value);

	/**
	 * Returns the value of the '<em><b>Picture String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture String</em>' attribute.
	 * @see #setPictureString(String)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLSimpleType_PictureString()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getPictureString();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getPictureString <em>Picture String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture String</em>' attribute.
	 * @see #getPictureString()
	 * @generated
	 */
	void setPictureString(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Boolean)
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLSimpleType_Usage()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Boolean value);

} // COBOLSimpleType
