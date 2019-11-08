/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmt.modisco.cobol.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CobolFactoryImpl extends EFactoryImpl implements CobolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CobolFactory init() {
		try {
			CobolFactory theCobolFactory = (CobolFactory)EPackage.Registry.INSTANCE.getEFactory(CobolPackage.eNS_URI);
			if (theCobolFactory != null) {
				return theCobolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CobolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CobolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CobolPackage.COBOL_ELEMENT: return createCOBOLElement();
			case CobolPackage.COBOL_CLASSIFIER: return createCOBOLClassifier();
			case CobolPackage.COBOL_SIMPLE_TYPE: return createCOBOLSimpleType();
			case CobolPackage.COBOL_COMPOSED_TYPE: return createCOBOLComposedType();
			case CobolPackage.COBOL_ELEMENT_INITIAL_VALUE: return createCOBOLElementInitialValue();
			case CobolPackage.COBOL88_ELEMENT: return createCOBOL88Element();
			case CobolPackage.COBOL88_ELEMENT_VALUE: return createCOBOL88ElementValue();
			case CobolPackage.COBOL_REDEFINING_ELEMENT: return createCOBOLRedefiningElement();
			case CobolPackage.COBOL66_ELEMENT: return createCOBOL66Element();
			case CobolPackage.COBOL_SOURCE_TEXT: return createCOBOLSourceText();
			case CobolPackage.COBOL_FIXED_LENGTH_ARRAY: return createCOBOLFixedLengthArray();
			case CobolPackage.COBOL_VARIABLE_LENGTH_ARRAY: return createCOBOLVariableLengthArray();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CobolPackage.COBOL_USAGE_VALUE:
				return createCOBOLUsageValueFromString(eDataType, initialValue);
			case CobolPackage.COBOL_INITIAL_VALUE_KIND:
				return createCOBOLInitialValueKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CobolPackage.COBOL_USAGE_VALUE:
				return convertCOBOLUsageValueToString(eDataType, instanceValue);
			case CobolPackage.COBOL_INITIAL_VALUE_KIND:
				return convertCOBOLInitialValueKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElement createCOBOLElement() {
		COBOLElementImpl cobolElement = new COBOLElementImpl();
		return cobolElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLClassifier createCOBOLClassifier() {
		COBOLClassifierImpl cobolClassifier = new COBOLClassifierImpl();
		return cobolClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLSimpleType createCOBOLSimpleType() {
		COBOLSimpleTypeImpl cobolSimpleType = new COBOLSimpleTypeImpl();
		return cobolSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLComposedType createCOBOLComposedType() {
		COBOLComposedTypeImpl cobolComposedType = new COBOLComposedTypeImpl();
		return cobolComposedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLElementInitialValue createCOBOLElementInitialValue() {
		COBOLElementInitialValueImpl cobolElementInitialValue = new COBOLElementInitialValueImpl();
		return cobolElementInitialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOL88Element createCOBOL88Element() {
		COBOL88ElementImpl cobol88Element = new COBOL88ElementImpl();
		return cobol88Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOL88ElementValue createCOBOL88ElementValue() {
		COBOL88ElementValueImpl cobol88ElementValue = new COBOL88ElementValueImpl();
		return cobol88ElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLRedefiningElement createCOBOLRedefiningElement() {
		COBOLRedefiningElementImpl cobolRedefiningElement = new COBOLRedefiningElementImpl();
		return cobolRedefiningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOL66Element createCOBOL66Element() {
		COBOL66ElementImpl cobol66Element = new COBOL66ElementImpl();
		return cobol66Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLSourceText createCOBOLSourceText() {
		COBOLSourceTextImpl cobolSourceText = new COBOLSourceTextImpl();
		return cobolSourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLFixedLengthArray createCOBOLFixedLengthArray() {
		COBOLFixedLengthArrayImpl cobolFixedLengthArray = new COBOLFixedLengthArrayImpl();
		return cobolFixedLengthArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLVariableLengthArray createCOBOLVariableLengthArray() {
		COBOLVariableLengthArrayImpl cobolVariableLengthArray = new COBOLVariableLengthArrayImpl();
		return cobolVariableLengthArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLUsageValue createCOBOLUsageValueFromString(EDataType eDataType, String initialValue) {
		COBOLUsageValue result = COBOLUsageValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOBOLUsageValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBOLInitialValueKind createCOBOLInitialValueKindFromString(EDataType eDataType, String initialValue) {
		COBOLInitialValueKind result = COBOLInitialValueKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOBOLInitialValueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CobolPackage getCobolPackage() {
		return (CobolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CobolPackage getPackage() {
		return CobolPackage.eINSTANCE;
	}

} //CobolFactoryImpl
