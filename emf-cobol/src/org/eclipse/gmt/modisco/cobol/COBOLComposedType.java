/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COBOL Composed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.cobol.COBOLComposedType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLComposedType()
 * @model
 * @generated
 */
public interface COBOLComposedType extends COBOLClassifier {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.cobol.COBOLElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLComposedType_Elements()
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup
	 * @model opposite="group" containment="true" ordered="false"
	 * @generated
	 */
	EList<COBOLElement> getElements();

} // COBOLComposedType
