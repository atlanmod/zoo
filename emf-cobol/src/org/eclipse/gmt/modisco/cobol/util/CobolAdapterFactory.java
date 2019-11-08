/**
 */
package org.eclipse.gmt.modisco.cobol.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.cobol.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage
 * @generated
 */
public class CobolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CobolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CobolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CobolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CobolSwitch<Adapter> modelSwitch =
		new CobolSwitch<Adapter>() {
			@Override
			public Adapter caseCOBOLElement(COBOLElement object) {
				return createCOBOLElementAdapter();
			}
			@Override
			public Adapter caseCOBOLClassifier(COBOLClassifier object) {
				return createCOBOLClassifierAdapter();
			}
			@Override
			public Adapter caseCOBOLSimpleType(COBOLSimpleType object) {
				return createCOBOLSimpleTypeAdapter();
			}
			@Override
			public Adapter caseCOBOLComposedType(COBOLComposedType object) {
				return createCOBOLComposedTypeAdapter();
			}
			@Override
			public Adapter caseCOBOLElementInitialValue(COBOLElementInitialValue object) {
				return createCOBOLElementInitialValueAdapter();
			}
			@Override
			public Adapter caseCOBOL88Element(COBOL88Element object) {
				return createCOBOL88ElementAdapter();
			}
			@Override
			public Adapter caseCOBOL88ElementValue(COBOL88ElementValue object) {
				return createCOBOL88ElementValueAdapter();
			}
			@Override
			public Adapter caseCOBOLRedefiningElement(COBOLRedefiningElement object) {
				return createCOBOLRedefiningElementAdapter();
			}
			@Override
			public Adapter caseCOBOL66Element(COBOL66Element object) {
				return createCOBOL66ElementAdapter();
			}
			@Override
			public Adapter caseCOBOLSourceText(COBOLSourceText object) {
				return createCOBOLSourceTextAdapter();
			}
			@Override
			public Adapter caseCOBOLFixedLengthArray(COBOLFixedLengthArray object) {
				return createCOBOLFixedLengthArrayAdapter();
			}
			@Override
			public Adapter caseCOBOLVariableLengthArray(COBOLVariableLengthArray object) {
				return createCOBOLVariableLengthArrayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLElement <em>COBOL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElement
	 * @generated
	 */
	public Adapter createCOBOLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLClassifier <em>COBOL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLClassifier
	 * @generated
	 */
	public Adapter createCOBOLClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLSimpleType <em>COBOL Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSimpleType
	 * @generated
	 */
	public Adapter createCOBOLSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLComposedType <em>COBOL Composed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLComposedType
	 * @generated
	 */
	public Adapter createCOBOLComposedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue <em>COBOL Element Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLElementInitialValue
	 * @generated
	 */
	public Adapter createCOBOLElementInitialValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOL88Element <em>COBOL88 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88Element
	 * @generated
	 */
	public Adapter createCOBOL88ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOL88ElementValue <em>COBOL88 Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL88ElementValue
	 * @generated
	 */
	public Adapter createCOBOL88ElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement <em>COBOL Redefining Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLRedefiningElement
	 * @generated
	 */
	public Adapter createCOBOLRedefiningElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOL66Element <em>COBOL66 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOL66Element
	 * @generated
	 */
	public Adapter createCOBOL66ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLSourceText <em>COBOL Source Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLSourceText
	 * @generated
	 */
	public Adapter createCOBOLSourceTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray <em>COBOL Fixed Length Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLFixedLengthArray
	 * @generated
	 */
	public Adapter createCOBOLFixedLengthArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray <em>COBOL Variable Length Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.cobol.COBOLVariableLengthArray
	 * @generated
	 */
	public Adapter createCOBOLVariableLengthArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CobolAdapterFactory
