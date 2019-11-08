/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage
 * @generated
 */
public interface CobolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CobolFactory eINSTANCE = org.eclipse.gmt.modisco.cobol.impl.CobolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>COBOL Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Element</em>'.
	 * @generated
	 */
	COBOLElement createCOBOLElement();

	/**
	 * Returns a new object of class '<em>COBOL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Classifier</em>'.
	 * @generated
	 */
	COBOLClassifier createCOBOLClassifier();

	/**
	 * Returns a new object of class '<em>COBOL Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Simple Type</em>'.
	 * @generated
	 */
	COBOLSimpleType createCOBOLSimpleType();

	/**
	 * Returns a new object of class '<em>COBOL Composed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Composed Type</em>'.
	 * @generated
	 */
	COBOLComposedType createCOBOLComposedType();

	/**
	 * Returns a new object of class '<em>COBOL Element Initial Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Element Initial Value</em>'.
	 * @generated
	 */
	COBOLElementInitialValue createCOBOLElementInitialValue();

	/**
	 * Returns a new object of class '<em>COBOL88 Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL88 Element</em>'.
	 * @generated
	 */
	COBOL88Element createCOBOL88Element();

	/**
	 * Returns a new object of class '<em>COBOL88 Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL88 Element Value</em>'.
	 * @generated
	 */
	COBOL88ElementValue createCOBOL88ElementValue();

	/**
	 * Returns a new object of class '<em>COBOL Redefining Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Redefining Element</em>'.
	 * @generated
	 */
	COBOLRedefiningElement createCOBOLRedefiningElement();

	/**
	 * Returns a new object of class '<em>COBOL66 Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL66 Element</em>'.
	 * @generated
	 */
	COBOL66Element createCOBOL66Element();

	/**
	 * Returns a new object of class '<em>COBOL Source Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Source Text</em>'.
	 * @generated
	 */
	COBOLSourceText createCOBOLSourceText();

	/**
	 * Returns a new object of class '<em>COBOL Fixed Length Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Fixed Length Array</em>'.
	 * @generated
	 */
	COBOLFixedLengthArray createCOBOLFixedLengthArray();

	/**
	 * Returns a new object of class '<em>COBOL Variable Length Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COBOL Variable Length Array</em>'.
	 * @generated
	 */
	COBOLVariableLengthArray createCOBOLVariableLengthArray();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CobolPackage getCobolPackage();

} //CobolFactory
