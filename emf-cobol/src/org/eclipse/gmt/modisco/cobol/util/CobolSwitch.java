/**
 */
package org.eclipse.gmt.modisco.cobol.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gmt.modisco.cobol.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage
 * @generated
 */
public class CobolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CobolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CobolSwitch() {
		if (modelPackage == null) {
			modelPackage = CobolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CobolPackage.COBOL_ELEMENT: {
				COBOLElement cobolElement = (COBOLElement)theEObject;
				T result = caseCOBOLElement(cobolElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_CLASSIFIER: {
				COBOLClassifier cobolClassifier = (COBOLClassifier)theEObject;
				T result = caseCOBOLClassifier(cobolClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_SIMPLE_TYPE: {
				COBOLSimpleType cobolSimpleType = (COBOLSimpleType)theEObject;
				T result = caseCOBOLSimpleType(cobolSimpleType);
				if (result == null) result = caseCOBOLClassifier(cobolSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_COMPOSED_TYPE: {
				COBOLComposedType cobolComposedType = (COBOLComposedType)theEObject;
				T result = caseCOBOLComposedType(cobolComposedType);
				if (result == null) result = caseCOBOLClassifier(cobolComposedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE: {
				COBOLElementInitialValue cobolElementInitialValue = (COBOLElementInitialValue)theEObject;
				T result = caseCOBOLElementInitialValue(cobolElementInitialValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL88_ELEMENT: {
				COBOL88Element cobol88Element = (COBOL88Element)theEObject;
				T result = caseCOBOL88Element(cobol88Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL88_ELEMENT_VALUE: {
				COBOL88ElementValue cobol88ElementValue = (COBOL88ElementValue)theEObject;
				T result = caseCOBOL88ElementValue(cobol88ElementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_REDEFINING_ELEMENT: {
				COBOLRedefiningElement cobolRedefiningElement = (COBOLRedefiningElement)theEObject;
				T result = caseCOBOLRedefiningElement(cobolRedefiningElement);
				if (result == null) result = caseCOBOLElement(cobolRedefiningElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL66_ELEMENT: {
				COBOL66Element cobol66Element = (COBOL66Element)theEObject;
				T result = caseCOBOL66Element(cobol66Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_SOURCE_TEXT: {
				COBOLSourceText cobolSourceText = (COBOLSourceText)theEObject;
				T result = caseCOBOLSourceText(cobolSourceText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY: {
				COBOLFixedLengthArray cobolFixedLengthArray = (COBOLFixedLengthArray)theEObject;
				T result = caseCOBOLFixedLengthArray(cobolFixedLengthArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY: {
				COBOLVariableLengthArray cobolVariableLengthArray = (COBOLVariableLengthArray)theEObject;
				T result = caseCOBOLVariableLengthArray(cobolVariableLengthArray);
				if (result == null) result = caseCOBOLFixedLengthArray(cobolVariableLengthArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLElement(COBOLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLClassifier(COBOLClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLSimpleType(COBOLSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Composed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Composed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLComposedType(COBOLComposedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Element Initial Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Element Initial Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLElementInitialValue(COBOLElementInitialValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL88 Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL88 Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOL88Element(COBOL88Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL88 Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL88 Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOL88ElementValue(COBOL88ElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Redefining Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Redefining Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLRedefiningElement(COBOLRedefiningElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL66 Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL66 Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOL66Element(COBOL66Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Source Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Source Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLSourceText(COBOLSourceText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Fixed Length Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Fixed Length Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLFixedLengthArray(COBOLFixedLengthArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COBOL Variable Length Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COBOL Variable Length Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOBOLVariableLengthArray(COBOLVariableLengthArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CobolSwitch
