/**
 */
package org.eclipse.gmt.modisco.cobol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COBOL Usage Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.cobol.CobolPackage#getCOBOLUsageValue()
 * @model
 * @generated
 */
public enum COBOLUsageValue implements Enumerator {
	/**
	 * The '<em><b>Cuv binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_BINARY(1, "cuv_binary", "cuv_binary"),

	/**
	 * The '<em><b>Cuv dbcs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_DBCS_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_DBCS(2, "cuv_dbcs", "cuv_dbcs"),

	/**
	 * The '<em><b>Cuv double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_DOUBLE(3, "cuv_double", "cuv_double"),

	/**
	 * The '<em><b>Cuv display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_DISPLAY(4, "cuv_display", "cuv_display"),

	/**
	 * The '<em><b>Cuv float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_FLOAT(5, "cuv_float", "cuv_float"),

	/**
	 * The '<em><b>Cuv index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_INDEX(6, "cuv_index", "cuv_index"),

	/**
	 * The '<em><b>Cuv object Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_OBJECT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_OBJECT_REFERENCE(7, "cuv_objectReference", "cuv_objectReference"),

	/**
	 * The '<em><b>Cuv packed Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_PACKED_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_PACKED_DECIMAL(8, "cuv_packedDecimal", "cuv_packedDecimal"),

	/**
	 * The '<em><b>Cuv pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_POINTER(9, "cuv_pointer", "cuv_pointer"),

	/**
	 * The '<em><b>Cuv procedure Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUV_PROCEDURE_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	CUV_PROCEDURE_POINTER(10, "cuv_procedurePointer", "cuv_procedurePointer");

	/**
	 * The '<em><b>Cuv binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_BINARY
	 * @model name="cuv_binary"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_BINARY_VALUE = 1;

	/**
	 * The '<em><b>Cuv dbcs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv dbcs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_DBCS
	 * @model name="cuv_dbcs"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_DBCS_VALUE = 2;

	/**
	 * The '<em><b>Cuv double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_DOUBLE
	 * @model name="cuv_double"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_DOUBLE_VALUE = 3;

	/**
	 * The '<em><b>Cuv display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv display</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_DISPLAY
	 * @model name="cuv_display"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_DISPLAY_VALUE = 4;

	/**
	 * The '<em><b>Cuv float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_FLOAT
	 * @model name="cuv_float"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_FLOAT_VALUE = 5;

	/**
	 * The '<em><b>Cuv index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv index</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_INDEX
	 * @model name="cuv_index"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_INDEX_VALUE = 6;

	/**
	 * The '<em><b>Cuv object Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv object Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_OBJECT_REFERENCE
	 * @model name="cuv_objectReference"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_OBJECT_REFERENCE_VALUE = 7;

	/**
	 * The '<em><b>Cuv packed Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv packed Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_PACKED_DECIMAL
	 * @model name="cuv_packedDecimal"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_PACKED_DECIMAL_VALUE = 8;

	/**
	 * The '<em><b>Cuv pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_POINTER
	 * @model name="cuv_pointer"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_POINTER_VALUE = 9;

	/**
	 * The '<em><b>Cuv procedure Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuv procedure Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUV_PROCEDURE_POINTER
	 * @model name="cuv_procedurePointer"
	 * @generated
	 * @ordered
	 */
	public static final int CUV_PROCEDURE_POINTER_VALUE = 10;

	/**
	 * An array of all the '<em><b>COBOL Usage Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COBOLUsageValue[] VALUES_ARRAY =
		new COBOLUsageValue[] {
			CUV_BINARY,
			CUV_DBCS,
			CUV_DOUBLE,
			CUV_DISPLAY,
			CUV_FLOAT,
			CUV_INDEX,
			CUV_OBJECT_REFERENCE,
			CUV_PACKED_DECIMAL,
			CUV_POINTER,
			CUV_PROCEDURE_POINTER,
		};

	/**
	 * A public read-only list of all the '<em><b>COBOL Usage Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COBOLUsageValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COBOL Usage Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLUsageValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBOLUsageValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COBOL Usage Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLUsageValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBOLUsageValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COBOL Usage Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COBOLUsageValue get(int value) {
		switch (value) {
			case CUV_BINARY_VALUE: return CUV_BINARY;
			case CUV_DBCS_VALUE: return CUV_DBCS;
			case CUV_DOUBLE_VALUE: return CUV_DOUBLE;
			case CUV_DISPLAY_VALUE: return CUV_DISPLAY;
			case CUV_FLOAT_VALUE: return CUV_FLOAT;
			case CUV_INDEX_VALUE: return CUV_INDEX;
			case CUV_OBJECT_REFERENCE_VALUE: return CUV_OBJECT_REFERENCE;
			case CUV_PACKED_DECIMAL_VALUE: return CUV_PACKED_DECIMAL;
			case CUV_POINTER_VALUE: return CUV_POINTER;
			case CUV_PROCEDURE_POINTER_VALUE: return CUV_PROCEDURE_POINTER;
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
	private COBOLUsageValue(int value, String name, String literal) {
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
	
} //COBOLUsageValue
