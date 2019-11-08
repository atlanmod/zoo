/**
 */
package org.eclipse.gmt.modisco.cobol.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.cobol.COBOL66Element;
import org.eclipse.gmt.modisco.cobol.COBOL88Element;
import org.eclipse.gmt.modisco.cobol.COBOL88ElementValue;
import org.eclipse.gmt.modisco.cobol.COBOLClassifier;
import org.eclipse.gmt.modisco.cobol.COBOLComposedType;
import org.eclipse.gmt.modisco.cobol.COBOLElement;
import org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue;
import org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray;
import org.eclipse.gmt.modisco.cobol.COBOLInitialValueKind;
import org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement;
import org.eclipse.gmt.modisco.cobol.COBOLSimpleType;
import org.eclipse.gmt.modisco.cobol.COBOLSourceText;
import org.eclipse.gmt.modisco.cobol.COBOLUsageValue;
import org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray;
import org.eclipse.gmt.modisco.cobol.CobolFactory;
import org.eclipse.gmt.modisco.cobol.CobolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CobolPackageImpl extends EPackageImpl implements CobolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolComposedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolElementInitialValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobol88ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobol88ElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolRedefiningElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobol66ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolSourceTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolFixedLengthArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cobolVariableLengthArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cobolUsageValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cobolInitialValueKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CobolPackageImpl() {
		super(eNS_URI, CobolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CobolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CobolPackage init() {
		if (isInited) return (CobolPackage)EPackage.Registry.INSTANCE.getEPackage(CobolPackage.eNS_URI);

		// Obtain or create and register package
		CobolPackageImpl theCobolPackage = (CobolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CobolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CobolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCobolPackage.createPackageContents();

		// Initialize created meta-data
		theCobolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCobolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CobolPackage.eNS_URI, theCobolPackage);
		return theCobolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLElement() {
		return cobolElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLElement_Level() {
		return (EAttribute)cobolElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLElement_Refined() {
		return (EAttribute)cobolElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLElement_Name() {
		return (EAttribute)cobolElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_SharedType() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_Group() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_Initial() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_Contains() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_Source() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLElement_Array() {
		return (EReference)cobolElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLClassifier() {
		return cobolClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLClassifier_Typeded() {
		return (EAttribute)cobolClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLClassifier_Name() {
		return (EAttribute)cobolClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLClassifier_TypedElements() {
		return (EReference)cobolClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLSimpleType() {
		return cobolSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLSimpleType_UsageValue() {
		return (EAttribute)cobolSimpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLSimpleType_PictureString() {
		return (EAttribute)cobolSimpleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLSimpleType_Usage() {
		return (EAttribute)cobolSimpleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLComposedType() {
		return cobolComposedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLComposedType_Elements() {
		return (EReference)cobolComposedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLElementInitialValue() {
		return cobolElementInitialValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLElementInitialValue_InitVal() {
		return (EAttribute)cobolElementInitialValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLElementInitialValue_ValueKind() {
		return (EAttribute)cobolElementInitialValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOL88Element() {
		return cobol88ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOL88Element_Name() {
		return (EAttribute)cobol88ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOL88Element_Has() {
		return (EReference)cobol88ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOL88ElementValue() {
		return cobol88ElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOL88ElementValue_LowerLimit() {
		return (EAttribute)cobol88ElementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOL88ElementValue_UpperLimit() {
		return (EAttribute)cobol88ElementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOL88ElementValue_Range() {
		return (EAttribute)cobol88ElementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLRedefiningElement() {
		return cobolRedefiningElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLRedefiningElement_Redefines() {
		return (EReference)cobolRedefiningElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOL66Element() {
		return cobol66ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOL66Element_Name() {
		return (EAttribute)cobol66ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOL66Element_End() {
		return (EReference)cobol66ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOL66Element_Start() {
		return (EReference)cobol66ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLSourceText() {
		return cobolSourceTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLSourceText_Source() {
		return (EAttribute)cobolSourceTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLSourceText_FileName() {
		return (EAttribute)cobolSourceTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLFixedLengthArray() {
		return cobolFixedLengthArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLFixedLengthArray_MaxUpper() {
		return (EAttribute)cobolFixedLengthArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOBOLVariableLengthArray() {
		return cobolVariableLengthArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOBOLVariableLengthArray_MinUpper() {
		return (EAttribute)cobolVariableLengthArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOBOLVariableLengthArray_DependingOn() {
		return (EReference)cobolVariableLengthArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOBOLUsageValue() {
		return cobolUsageValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOBOLInitialValueKind() {
		return cobolInitialValueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CobolFactory getCobolFactory() {
		return (CobolFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cobolElementEClass = createEClass(COBOL_ELEMENT);
		createEAttribute(cobolElementEClass, COBOL_ELEMENT__LEVEL);
		createEAttribute(cobolElementEClass, COBOL_ELEMENT__REFINED);
		createEAttribute(cobolElementEClass, COBOL_ELEMENT__NAME);
		createEReference(cobolElementEClass, COBOL_ELEMENT__SHARED_TYPE);
		createEReference(cobolElementEClass, COBOL_ELEMENT__GROUP);
		createEReference(cobolElementEClass, COBOL_ELEMENT__INITIAL);
		createEReference(cobolElementEClass, COBOL_ELEMENT__CONTAINS);
		createEReference(cobolElementEClass, COBOL_ELEMENT__SOURCE);
		createEReference(cobolElementEClass, COBOL_ELEMENT__ARRAY);

		cobolClassifierEClass = createEClass(COBOL_CLASSIFIER);
		createEAttribute(cobolClassifierEClass, COBOL_CLASSIFIER__TYPEDED);
		createEAttribute(cobolClassifierEClass, COBOL_CLASSIFIER__NAME);
		createEReference(cobolClassifierEClass, COBOL_CLASSIFIER__TYPED_ELEMENTS);

		cobolSimpleTypeEClass = createEClass(COBOL_SIMPLE_TYPE);
		createEAttribute(cobolSimpleTypeEClass, COBOL_SIMPLE_TYPE__USAGE_VALUE);
		createEAttribute(cobolSimpleTypeEClass, COBOL_SIMPLE_TYPE__PICTURE_STRING);
		createEAttribute(cobolSimpleTypeEClass, COBOL_SIMPLE_TYPE__USAGE);

		cobolComposedTypeEClass = createEClass(COBOL_COMPOSED_TYPE);
		createEReference(cobolComposedTypeEClass, COBOL_COMPOSED_TYPE__ELEMENTS);

		cobolElementInitialValueEClass = createEClass(COBOL_ELEMENT_INITIAL_VALUE);
		createEAttribute(cobolElementInitialValueEClass, COBOL_ELEMENT_INITIAL_VALUE__INIT_VAL);
		createEAttribute(cobolElementInitialValueEClass, COBOL_ELEMENT_INITIAL_VALUE__VALUE_KIND);

		cobol88ElementEClass = createEClass(COBOL88_ELEMENT);
		createEAttribute(cobol88ElementEClass, COBOL88_ELEMENT__NAME);
		createEReference(cobol88ElementEClass, COBOL88_ELEMENT__HAS);

		cobol88ElementValueEClass = createEClass(COBOL88_ELEMENT_VALUE);
		createEAttribute(cobol88ElementValueEClass, COBOL88_ELEMENT_VALUE__LOWER_LIMIT);
		createEAttribute(cobol88ElementValueEClass, COBOL88_ELEMENT_VALUE__UPPER_LIMIT);
		createEAttribute(cobol88ElementValueEClass, COBOL88_ELEMENT_VALUE__RANGE);

		cobolRedefiningElementEClass = createEClass(COBOL_REDEFINING_ELEMENT);
		createEReference(cobolRedefiningElementEClass, COBOL_REDEFINING_ELEMENT__REDEFINES);

		cobol66ElementEClass = createEClass(COBOL66_ELEMENT);
		createEAttribute(cobol66ElementEClass, COBOL66_ELEMENT__NAME);
		createEReference(cobol66ElementEClass, COBOL66_ELEMENT__END);
		createEReference(cobol66ElementEClass, COBOL66_ELEMENT__START);

		cobolSourceTextEClass = createEClass(COBOL_SOURCE_TEXT);
		createEAttribute(cobolSourceTextEClass, COBOL_SOURCE_TEXT__SOURCE);
		createEAttribute(cobolSourceTextEClass, COBOL_SOURCE_TEXT__FILE_NAME);

		cobolFixedLengthArrayEClass = createEClass(COBOL_FIXED_LENGTH_ARRAY);
		createEAttribute(cobolFixedLengthArrayEClass, COBOL_FIXED_LENGTH_ARRAY__MAX_UPPER);

		cobolVariableLengthArrayEClass = createEClass(COBOL_VARIABLE_LENGTH_ARRAY);
		createEAttribute(cobolVariableLengthArrayEClass, COBOL_VARIABLE_LENGTH_ARRAY__MIN_UPPER);
		createEReference(cobolVariableLengthArrayEClass, COBOL_VARIABLE_LENGTH_ARRAY__DEPENDING_ON);

		// Create enums
		cobolUsageValueEEnum = createEEnum(COBOL_USAGE_VALUE);
		cobolInitialValueKindEEnum = createEEnum(COBOL_INITIAL_VALUE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cobolSimpleTypeEClass.getESuperTypes().add(this.getCOBOLClassifier());
		cobolComposedTypeEClass.getESuperTypes().add(this.getCOBOLClassifier());
		cobolRedefiningElementEClass.getESuperTypes().add(this.getCOBOLElement());
		cobolVariableLengthArrayEClass.getESuperTypes().add(this.getCOBOLFixedLengthArray());

		// Initialize classes, features, and operations; add parameters
		initEClass(cobolElementEClass, COBOLElement.class, "COBOLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLElement_Level(), theEcorePackage.getEString(), "level", null, 1, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLElement_Refined(), theEcorePackage.getEBooleanObject(), "refined", null, 1, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLElement_Name(), theEcorePackage.getEString(), "name", null, 1, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLElement_SharedType(), this.getCOBOLClassifier(), this.getCOBOLClassifier_TypedElements(), "sharedType", null, 1, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLElement_Group(), this.getCOBOLComposedType(), this.getCOBOLComposedType_Elements(), "group", null, 0, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLElement_Initial(), this.getCOBOLElementInitialValue(), null, "initial", null, 0, -1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCOBOLElement_Contains(), this.getCOBOL88Element(), null, "contains", null, 0, -1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCOBOLElement_Source(), this.getCOBOLSourceText(), null, "source", null, 1, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLElement_Array(), this.getCOBOLFixedLengthArray(), null, "array", null, 0, 1, COBOLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolClassifierEClass, COBOLClassifier.class, "COBOLClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLClassifier_Typeded(), theEcorePackage.getEBooleanObject(), "typeded", null, 1, 1, COBOLClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLClassifier_Name(), theEcorePackage.getEString(), "name", null, 1, 1, COBOLClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLClassifier_TypedElements(), this.getCOBOLElement(), this.getCOBOLElement_SharedType(), "typedElements", null, 0, -1, COBOLClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cobolSimpleTypeEClass, COBOLSimpleType.class, "COBOLSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLSimpleType_UsageValue(), this.getCOBOLUsageValue(), "usageValue", null, 1, 1, COBOLSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLSimpleType_PictureString(), theEcorePackage.getEString(), "pictureString", null, 1, 1, COBOLSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLSimpleType_Usage(), theEcorePackage.getEBooleanObject(), "usage", null, 1, 1, COBOLSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolComposedTypeEClass, COBOLComposedType.class, "COBOLComposedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOBOLComposedType_Elements(), this.getCOBOLElement(), this.getCOBOLElement_Group(), "elements", null, 0, -1, COBOLComposedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cobolElementInitialValueEClass, COBOLElementInitialValue.class, "COBOLElementInitialValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLElementInitialValue_InitVal(), theEcorePackage.getEString(), "initVal", null, 1, 1, COBOLElementInitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLElementInitialValue_ValueKind(), this.getCOBOLInitialValueKind(), "valueKind", null, 1, 1, COBOLElementInitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobol88ElementEClass, COBOL88Element.class, "COBOL88Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOL88Element_Name(), theEcorePackage.getEString(), "name", null, 1, 1, COBOL88Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOL88Element_Has(), this.getCOBOL88ElementValue(), null, "has", null, 1, -1, COBOL88Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cobol88ElementValueEClass, COBOL88ElementValue.class, "COBOL88ElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOL88ElementValue_LowerLimit(), theEcorePackage.getEString(), "lowerLimit", null, 1, 1, COBOL88ElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOL88ElementValue_UpperLimit(), theEcorePackage.getEString(), "upperLimit", null, 1, 1, COBOL88ElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOL88ElementValue_Range(), theEcorePackage.getEBooleanObject(), "range", null, 1, 1, COBOL88ElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolRedefiningElementEClass, COBOLRedefiningElement.class, "COBOLRedefiningElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOBOLRedefiningElement_Redefines(), this.getCOBOLElement(), null, "redefines", null, 1, 1, COBOLRedefiningElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobol66ElementEClass, COBOL66Element.class, "COBOL66Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOL66Element_Name(), theEcorePackage.getEString(), "name", null, 1, 1, COBOL66Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOL66Element_End(), this.getCOBOLElement(), null, "end", null, 0, 1, COBOL66Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOL66Element_Start(), this.getCOBOLElement(), null, "start", null, 1, 1, COBOL66Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolSourceTextEClass, COBOLSourceText.class, "COBOLSourceText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLSourceText_Source(), theEcorePackage.getEString(), "source", null, 1, 1, COBOLSourceText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOBOLSourceText_FileName(), theEcorePackage.getEString(), "fileName", null, 1, 1, COBOLSourceText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolFixedLengthArrayEClass, COBOLFixedLengthArray.class, "COBOLFixedLengthArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLFixedLengthArray_MaxUpper(), theEcorePackage.getEIntegerObject(), "maxUpper", null, 1, 1, COBOLFixedLengthArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cobolVariableLengthArrayEClass, COBOLVariableLengthArray.class, "COBOLVariableLengthArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOBOLVariableLengthArray_MinUpper(), theEcorePackage.getEIntegerObject(), "minUpper", null, 1, 1, COBOLVariableLengthArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOBOLVariableLengthArray_DependingOn(), this.getCOBOLElement(), null, "dependingOn", null, 1, 1, COBOLVariableLengthArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cobolUsageValueEEnum, COBOLUsageValue.class, "COBOLUsageValue");
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_BINARY);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_DBCS);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_DOUBLE);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_DISPLAY);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_FLOAT);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_INDEX);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_OBJECT_REFERENCE);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_PACKED_DECIMAL);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_POINTER);
		addEEnumLiteral(cobolUsageValueEEnum, COBOLUsageValue.CUV_PROCEDURE_POINTER);

		initEEnum(cobolInitialValueKindEEnum, COBOLInitialValueKind.class, "COBOLInitialValueKind");
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_STRING_VALUE);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_LOW_VALUE);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_HIGH_VALUE);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_ZERO_VALUE);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_QUOTES);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_NULL);
		addEEnumLiteral(cobolInitialValueKindEEnum, COBOLInitialValueKind.CIVK_ALL_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CobolPackageImpl
