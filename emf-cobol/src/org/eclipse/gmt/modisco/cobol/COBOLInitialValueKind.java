/**
 */
package org.eclipse.gmt.modisco.cobol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COBOL Initial Value Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLInitialValueKind()
 * @model
 * @generated
 */
public enum COBOLInitialValueKind implements Enumerator {
	/**
	 * The '<em><b>Civk string value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_STRING_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_STRING_VALUE(1, "civk_string_value", "civk_string_value"),

	/**
	 * The '<em><b>Civk low value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_LOW_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_LOW_VALUE(2, "civk_low_value", "civk_low_value"),

	/**
	 * The '<em><b>Civk high value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_HIGH_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_HIGH_VALUE(3, "civk_high_value", "civk_high_value"),

	/**
	 * The '<em><b>Civk zero value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_ZERO_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_ZERO_VALUE(4, "civk_zero_value", "civk_zero_value"),

	/**
	 * The '<em><b>Civk quotes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_QUOTES_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_QUOTES(5, "civk_quotes", "civk_quotes"),

	/**
	 * The '<em><b>Civk null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_NULL(6, "civk_null", "civk_null"),

	/**
	 * The '<em><b>Civk all literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVK_ALL_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	CIVK_ALL_LITERAL(7, "civk_all_literal", "civk_all_literal");

	/**
	 * The '<em><b>Civk string value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk string value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_STRING_VALUE
	 * @model name="civk_string_value"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_STRING_VALUE_VALUE = 1;

	/**
	 * The '<em><b>Civk low value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk low value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_LOW_VALUE
	 * @model name="civk_low_value"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_LOW_VALUE_VALUE = 2;

	/**
	 * The '<em><b>Civk high value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk high value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_HIGH_VALUE
	 * @model name="civk_high_value"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_HIGH_VALUE_VALUE = 3;

	/**
	 * The '<em><b>Civk zero value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk zero value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_ZERO_VALUE
	 * @model name="civk_zero_value"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_ZERO_VALUE_VALUE = 4;

	/**
	 * The '<em><b>Civk quotes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk quotes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_QUOTES
	 * @model name="civk_quotes"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_QUOTES_VALUE = 5;

	/**
	 * The '<em><b>Civk null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk null</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_NULL
	 * @model name="civk_null"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_NULL_VALUE = 6;

	/**
	 * The '<em><b>Civk all literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Civk all literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVK_ALL_LITERAL
	 * @model name="civk_all_literal"
	 * @generated
	 * @ordered
	 */
	public static final int CIVK_ALL_LITERAL_VALUE = 7;

	/**
	 * An array of all the '<em><b>COBOL Initial Value Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COBOLInitialValueKind[] VALUES_ARRAY =
		new COBOLInitialValueKind[] {
			CIVK_STRING_VALUE,
			CIVK_LOW_VALUE,
			CIVK_HIGH_VALUE,
			CIVK_ZERO_VALUE,
			CIVK_QUOTES,
			CIVK_NULL,
			CIVK_ALL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>COBOL Initial Value Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COBOLInitialValueKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COBOL Initial Value Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLInitialValueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBOLInitialValueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COBOL Initial Value Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLInitialValueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBOLInitialValueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COBOL Initial Value Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLInitialValueKind get(int value) {
		switch (value) {
			case CIVK_STRING_VALUE_VALUE: return CIVK_STRING_VALUE;
			case CIVK_LOW_VALUE_VALUE: return CIVK_LOW_VALUE;
			case CIVK_HIGH_VALUE_VALUE: return CIVK_HIGH_VALUE;
			case CIVK_ZERO_VALUE_VALUE: return CIVK_ZERO_VALUE;
			case CIVK_QUOTES_VALUE: return CIVK_QUOTES;
			case CIVK_NULL_VALUE: return CIVK_NULL;
			case CIVK_ALL_LITERAL_VALUE: return CIVK_ALL_LITERAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private COBOLInitialValueKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //COBOLInitialValueKind
