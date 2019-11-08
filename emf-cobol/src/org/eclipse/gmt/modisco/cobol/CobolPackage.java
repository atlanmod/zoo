/**
 */
package org.eclipse.gmt.modisco.cobol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/emf-cobol/src' importerID='org.eclipse.emf.importer.ecore' basePackage='org.eclipse.gmt.modisco'"
 * @generated
 */
public interface CobolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cobol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoo.atlanmod.org/emf-cobol";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cobol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CobolPackage eINSTANCE = org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl <em>COBOL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLElement()
	 * @generated
	 */
	int COBOL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__REFINED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__SHARED_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__GROUP = 4;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__INITIAL = 5;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__CONTAINS = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT__ARRAY = 8;

	/**
	 * The number of structural features of the '<em>COBOL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>COBOL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl <em>COBOL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLClassifier()
	 * @generated
	 */
	int COBOL_CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Typeded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_CLASSIFIER__TYPEDED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_CLASSIFIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_CLASSIFIER__TYPED_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>COBOL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_CLASSIFIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>COBOL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl <em>COBOL Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLSimpleType()
	 * @generated
	 */
	int COBOL_SIMPLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Typeded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__TYPEDED = COBOL_CLASSIFIER__TYPEDED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__NAME = COBOL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__TYPED_ELEMENTS = COBOL_CLASSIFIER__TYPED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Usage Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__USAGE_VALUE = COBOL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Picture String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__PICTURE_STRING = COBOL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE__USAGE = COBOL_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>COBOL Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE_FEATURE_COUNT = COBOL_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>COBOL Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SIMPLE_TYPE_OPERATION_COUNT = COBOL_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLComposedTypeImpl <em>COBOL Composed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLComposedTypeImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLComposedType()
	 * @generated
	 */
	int COBOL_COMPOSED_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Typeded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE__TYPEDED = COBOL_CLASSIFIER__TYPEDED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE__NAME = COBOL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE__TYPED_ELEMENTS = COBOL_CLASSIFIER__TYPED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE__ELEMENTS = COBOL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>COBOL Composed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE_FEATURE_COUNT = COBOL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>COBOL Composed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_COMPOSED_TYPE_OPERATION_COUNT = COBOL_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl <em>COBOL Element Initial Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLElementInitialValue()
	 * @generated
	 */
	int COBOL_ELEMENT_INITIAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Init Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL = 0;

	/**
	 * The feature id for the '<em><b>Value Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND = 1;

	/**
	 * The number of structural features of the '<em>COBOL Element Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_INITIAL_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>COBOL Element Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ELEMENT_INITIAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementImpl <em>COBOL88 Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL88Element()
	 * @generated
	 */
	int COBOL88_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT__HAS = 1;

	/**
	 * The number of structural features of the '<em>COBOL88 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>COBOL88 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl <em>COBOL88 Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL88ElementValue()
	 * @generated
	 */
	int COBOL88_ELEMENT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_VALUE__LOWER_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_VALUE__UPPER_LIMIT = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_VALUE__RANGE = 2;

	/**
	 * The number of structural features of the '<em>COBOL88 Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>COBOL88 Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL88_ELEMENT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLRedefiningElementImpl <em>COBOL Redefining Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLRedefiningElementImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLRedefiningElement()
	 * @generated
	 */
	int COBOL_REDEFINING_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__LEVEL = COBOL_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__REFINED = COBOL_ELEMENT__REFINED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__NAME = COBOL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__SHARED_TYPE = COBOL_ELEMENT__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__GROUP = COBOL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__INITIAL = COBOL_ELEMENT__INITIAL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__CONTAINS = COBOL_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__SOURCE = COBOL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__ARRAY = COBOL_ELEMENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT__REDEFINES = COBOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>COBOL Redefining Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT_FEATURE_COUNT = COBOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>COBOL Redefining Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_REDEFINING_ELEMENT_OPERATION_COUNT = COBOL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL66ElementImpl <em>COBOL66 Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL66ElementImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL66Element()
	 * @generated
	 */
	int COBOL66_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL66_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL66_ELEMENT__END = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL66_ELEMENT__START = 2;

	/**
	 * The number of structural features of the '<em>COBOL66 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL66_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>COBOL66 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL66_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSourceTextImpl <em>COBOL Source Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLSourceTextImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLSourceText()
	 * @generated
	 */
	int COBOL_SOURCE_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SOURCE_TEXT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SOURCE_TEXT__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>COBOL Source Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SOURCE_TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>COBOL Source Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_SOURCE_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLFixedLengthArrayImpl <em>COBOL Fixed Length Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLFixedLengthArrayImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLFixedLengthArray()
	 * @generated
	 */
	int COBOL_FIXED_LENGTH_ARRAY = 10;

	/**
	 * The feature id for the '<em><b>Max Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER = 0;

	/**
	 * The number of structural features of the '<em>COBOL Fixed Length Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_FIXED_LENGTH_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>COBOL Fixed Length Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_FIXED_LENGTH_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl <em>COBOL Variable Length Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLVariableLengthArray()
	 * @generated
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Max Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY__MAX_UPPER = COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER;

	/**
	 * The feature id for the '<em><b>Min Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER = COBOL_FIXED_LENGTH_ARRAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depending On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON = COBOL_FIXED_LENGTH_ARRAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>COBOL Variable Length Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY_FEATURE_COUNT = COBOL_FIXED_LENGTH_ARRAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>COBOL Variable Length Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_VARIABLE_LENGTH_ARRAY_OPERATION_COUNT = COBOL_FIXED_LENGTH_ARRAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.COBOLUsageValue <em>COBOL Usage Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.COBOLUsageValue
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLUsageValue()
	 * @generated
	 */
	int COBOL_USAGE_VALUE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind <em>COBOL Initial Value Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind
	 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLInitialValueKind()
	 * @generated
	 */
	int COBOL_INITIAL_VALUE_KIND = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLElement <em>COBOL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Element</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement
	 * @generated
	 */
	EClass getCOBOLElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getLevel()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EAttribute getCOBOLElement_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refined</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getRefined()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EAttribute getCOBOLElement_Refined();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getName()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EAttribute getCOBOLElement_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType <em>Shared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Type</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getSharedType()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_SharedType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getGroup()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initial</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getInitial()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getContains()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_Contains();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getSource()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.cobol.COBOLElement#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement#getArray()
	 * @see #getCOBOLElement()
	 * @generated
	 */
	EReference getCOBOLElement_Array();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier <em>COBOL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Classifier</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier
	 * @generated
	 */
	EClass getCOBOLClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypeded <em>Typeded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeded</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypeded()
	 * @see #getCOBOLClassifier()
	 * @generated
	 */
	EAttribute getCOBOLClassifier_Typeded();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier#getName()
	 * @see #getCOBOLClassifier()
	 * @generated
	 */
	EAttribute getCOBOLClassifier_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypedElements <em>Typed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Elements</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier#getTypedElements()
	 * @see #getCOBOLClassifier()
	 * @generated
	 */
	EReference getCOBOLClassifier_TypedElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType <em>COBOL Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Simple Type</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSimpleType
	 * @generated
	 */
	EClass getCOBOLSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsageValue <em>Usage Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Value</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsageValue()
	 * @see #getCOBOLSimpleType()
	 * @generated
	 */
	EAttribute getCOBOLSimpleType_UsageValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getPictureString <em>Picture String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture String</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getPictureString()
	 * @see #getCOBOLSimpleType()
	 * @generated
	 */
	EAttribute getCOBOLSimpleType_PictureString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSimpleType#getUsage()
	 * @see #getCOBOLSimpleType()
	 * @generated
	 */
	EAttribute getCOBOLSimpleType_Usage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLComposedType <em>COBOL Composed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Composed Type</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLComposedType
	 * @generated
	 */
	EClass getCOBOLComposedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.cobol.COBOLComposedType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLComposedType#getElements()
	 * @see #getCOBOLComposedType()
	 * @generated
	 */
	EReference getCOBOLComposedType_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue <em>COBOL Element Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Element Initial Value</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue
	 * @generated
	 */
	EClass getCOBOLElementInitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getInitVal <em>Init Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Val</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getInitVal()
	 * @see #getCOBOLElementInitialValue()
	 * @generated
	 */
	EAttribute getCOBOLElementInitialValue_InitVal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getValueKind <em>Value Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Kind</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue#getValueKind()
	 * @see #getCOBOLElementInitialValue()
	 * @generated
	 */
	EAttribute getCOBOLElementInitialValue_ValueKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOL88Element <em>COBOL88 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL88 Element</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88Element
	 * @generated
	 */
	EClass getCOBOL88Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOL88Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88Element#getName()
	 * @see #getCOBOL88Element()
	 * @generated
	 */
	EAttribute getCOBOL88Element_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.cobol.COBOL88Element#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88Element#getHas()
	 * @see #getCOBOL88Element()
	 * @generated
	 */
	EReference getCOBOL88Element_Has();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue <em>COBOL88 Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL88 Element Value</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88ElementValue
	 * @generated
	 */
	EClass getCOBOL88ElementValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getLowerLimit()
	 * @see #getCOBOL88ElementValue()
	 * @generated
	 */
	EAttribute getCOBOL88ElementValue_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getUpperLimit()
	 * @see #getCOBOL88ElementValue()
	 * @generated
	 */
	EAttribute getCOBOL88ElementValue_UpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88ElementValue#getRange()
	 * @see #getCOBOL88ElementValue()
	 * @generated
	 */
	EAttribute getCOBOL88ElementValue_Range();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement <em>COBOL Redefining Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Redefining Element</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement
	 * @generated
	 */
	EClass getCOBOLRedefiningElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefines</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement#getRedefines()
	 * @see #getCOBOLRedefiningElement()
	 * @generated
	 */
	EReference getCOBOLRedefiningElement_Redefines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element <em>COBOL66 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL66 Element</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL66Element
	 * @generated
	 */
	EClass getCOBOL66Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL66Element#getName()
	 * @see #getCOBOL66Element()
	 * @generated
	 */
	EAttribute getCOBOL66Element_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL66Element#getEnd()
	 * @see #getCOBOL66Element()
	 * @generated
	 */
	EReference getCOBOL66Element_End();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL66Element#getStart()
	 * @see #getCOBOL66Element()
	 * @generated
	 */
	EReference getCOBOL66Element_Start();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLSourceText <em>COBOL Source Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Source Text</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSourceText
	 * @generated
	 */
	EClass getCOBOLSourceText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLSourceText#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSourceText#getSource()
	 * @see #getCOBOLSourceText()
	 * @generated
	 */
	EAttribute getCOBOLSourceText_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLSourceText#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSourceText#getFileName()
	 * @see #getCOBOLSourceText()
	 * @generated
	 */
	EAttribute getCOBOLSourceText_FileName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray <em>COBOL Fixed Length Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Fixed Length Array</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray
	 * @generated
	 */
	EClass getCOBOLFixedLengthArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray#getMaxUpper <em>Max Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Upper</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray#getMaxUpper()
	 * @see #getCOBOLFixedLengthArray()
	 * @generated
	 */
	EAttribute getCOBOLFixedLengthArray_MaxUpper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray <em>COBOL Variable Length Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COBOL Variable Length Array</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray
	 * @generated
	 */
	EClass getCOBOLVariableLengthArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getMinUpper <em>Min Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Upper</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getMinUpper()
	 * @see #getCOBOLVariableLengthArray()
	 * @generated
	 */
	EAttribute getCOBOLVariableLengthArray_MinUpper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getDependingOn <em>Depending On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depending On</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray#getDependingOn()
	 * @see #getCOBOLVariableLengthArray()
	 * @generated
	 */
	EReference getCOBOLVariableLengthArray_DependingOn();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.cobol.COBOLUsageValue <em>COBOL Usage Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COBOL Usage Value</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLUsageValue
	 * @generated
	 */
	EEnum getCOBOLUsageValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind <em>COBOL Initial Value Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COBOL Initial Value Kind</em>'.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind
	 * @generated
	 */
	EEnum getCOBOLInitialValueKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CobolFactory getCobolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl <em>COBOL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLElementImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLElement()
		 * @generated
		 */
		EClass COBOL_ELEMENT = eINSTANCE.getCOBOLElement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_ELEMENT__LEVEL = eINSTANCE.getCOBOLElement_Level();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_ELEMENT__REFINED = eINSTANCE.getCOBOLElement_Refined();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_ELEMENT__NAME = eINSTANCE.getCOBOLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Shared Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__SHARED_TYPE = eINSTANCE.getCOBOLElement_SharedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__GROUP = eINSTANCE.getCOBOLElement_Group();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__INITIAL = eINSTANCE.getCOBOLElement_Initial();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__CONTAINS = eINSTANCE.getCOBOLElement_Contains();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__SOURCE = eINSTANCE.getCOBOLElement_Source();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_ELEMENT__ARRAY = eINSTANCE.getCOBOLElement_Array();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl <em>COBOL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLClassifierImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLClassifier()
		 * @generated
		 */
		EClass COBOL_CLASSIFIER = eINSTANCE.getCOBOLClassifier();

		/**
		 * The meta object literal for the '<em><b>Typeded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_CLASSIFIER__TYPEDED = eINSTANCE.getCOBOLClassifier_Typeded();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_CLASSIFIER__NAME = eINSTANCE.getCOBOLClassifier_Name();

		/**
		 * The meta object literal for the '<em><b>Typed Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_CLASSIFIER__TYPED_ELEMENTS = eINSTANCE.getCOBOLClassifier_TypedElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl <em>COBOL Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLSimpleTypeImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLSimpleType()
		 * @generated
		 */
		EClass COBOL_SIMPLE_TYPE = eINSTANCE.getCOBOLSimpleType();

		/**
		 * The meta object literal for the '<em><b>Usage Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_SIMPLE_TYPE__USAGE_VALUE = eINSTANCE.getCOBOLSimpleType_UsageValue();

		/**
		 * The meta object literal for the '<em><b>Picture String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_SIMPLE_TYPE__PICTURE_STRING = eINSTANCE.getCOBOLSimpleType_PictureString();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_SIMPLE_TYPE__USAGE = eINSTANCE.getCOBOLSimpleType_Usage();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLComposedTypeImpl <em>COBOL Composed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLComposedTypeImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLComposedType()
		 * @generated
		 */
		EClass COBOL_COMPOSED_TYPE = eINSTANCE.getCOBOLComposedType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_COMPOSED_TYPE__ELEMENTS = eINSTANCE.getCOBOLComposedType_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl <em>COBOL Element Initial Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLElementInitialValueImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLElementInitialValue()
		 * @generated
		 */
		EClass COBOL_ELEMENT_INITIAL_VALUE = eINSTANCE.getCOBOLElementInitialValue();

		/**
		 * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL = eINSTANCE.getCOBOLElementInitialValue_InitVal();

		/**
		 * The meta object literal for the '<em><b>Value Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND = eINSTANCE.getCOBOLElementInitialValue_ValueKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementImpl <em>COBOL88 Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL88Element()
		 * @generated
		 */
		EClass COBOL88_ELEMENT = eINSTANCE.getCOBOL88Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL88_ELEMENT__NAME = eINSTANCE.getCOBOL88Element_Name();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL88_ELEMENT__HAS = eINSTANCE.getCOBOL88Element_Has();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl <em>COBOL88 Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL88ElementValueImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL88ElementValue()
		 * @generated
		 */
		EClass COBOL88_ELEMENT_VALUE = eINSTANCE.getCOBOL88ElementValue();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL88_ELEMENT_VALUE__LOWER_LIMIT = eINSTANCE.getCOBOL88ElementValue_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL88_ELEMENT_VALUE__UPPER_LIMIT = eINSTANCE.getCOBOL88ElementValue_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL88_ELEMENT_VALUE__RANGE = eINSTANCE.getCOBOL88ElementValue_Range();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLRedefiningElementImpl <em>COBOL Redefining Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLRedefiningElementImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLRedefiningElement()
		 * @generated
		 */
		EClass COBOL_REDEFINING_ELEMENT = eINSTANCE.getCOBOLRedefiningElement();

		/**
		 * The meta object literal for the '<em><b>Redefines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_REDEFINING_ELEMENT__REDEFINES = eINSTANCE.getCOBOLRedefiningElement_Redefines();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOL66ElementImpl <em>COBOL66 Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOL66ElementImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOL66Element()
		 * @generated
		 */
		EClass COBOL66_ELEMENT = eINSTANCE.getCOBOL66Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL66_ELEMENT__NAME = eINSTANCE.getCOBOL66Element_Name();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL66_ELEMENT__END = eINSTANCE.getCOBOL66Element_End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL66_ELEMENT__START = eINSTANCE.getCOBOL66Element_Start();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLSourceTextImpl <em>COBOL Source Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLSourceTextImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLSourceText()
		 * @generated
		 */
		EClass COBOL_SOURCE_TEXT = eINSTANCE.getCOBOLSourceText();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_SOURCE_TEXT__SOURCE = eINSTANCE.getCOBOLSourceText_Source();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_SOURCE_TEXT__FILE_NAME = eINSTANCE.getCOBOLSourceText_FileName();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLFixedLengthArrayImpl <em>COBOL Fixed Length Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLFixedLengthArrayImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLFixedLengthArray()
		 * @generated
		 */
		EClass COBOL_FIXED_LENGTH_ARRAY = eINSTANCE.getCOBOLFixedLengthArray();

		/**
		 * The meta object literal for the '<em><b>Max Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER = eINSTANCE.getCOBOLFixedLengthArray_MaxUpper();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl <em>COBOL Variable Length Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.impl.COBOLVariableLengthArrayImpl
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLVariableLengthArray()
		 * @generated
		 */
		EClass COBOL_VARIABLE_LENGTH_ARRAY = eINSTANCE.getCOBOLVariableLengthArray();

		/**
		 * The meta object literal for the '<em><b>Min Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER = eINSTANCE.getCOBOLVariableLengthArray_MinUpper();

		/**
		 * The meta object literal for the '<em><b>Depending On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON = eINSTANCE.getCOBOLVariableLengthArray_DependingOn();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.COBOLUsageValue <em>COBOL Usage Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.COBOLUsageValue
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLUsageValue()
		 * @generated
		 */
		EEnum COBOL_USAGE_VALUE = eINSTANCE.getCOBOLUsageValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind <em>COBOL Initial Value Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind
		 * @see org.eclipse.gmt.modisco.cobol.impl.CobolPackageImpl#getCOBOLInitialValueKind()
		 * @generated
		 */
		EEnum COBOL_INITIAL_VALUE_KIND = eINSTANCE.getCOBOLInitialValueKind();

	}

} //CobolPackage
