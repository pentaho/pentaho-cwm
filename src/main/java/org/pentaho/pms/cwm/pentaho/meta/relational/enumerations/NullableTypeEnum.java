/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2002 - 2026 by Pentaho Canada Inc. : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2030-06-15
 ******************************************************************************/


package org.pentaho.pms.cwm.pentaho.meta.relational.enumerations;

/**
 * NullableType enumeration class implementation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public final class NullableTypeEnum implements NullableType {
  /**
   * Enumeration constant corresponding to literal columnNoNulls.
   */
  public static final NullableTypeEnum COLUMN_NO_NULLS = new NullableTypeEnum( "columnNoNulls" );
  /**
   * Enumeration constant corresponding to literal columnNullable.
   */
  public static final NullableTypeEnum COLUMN_NULLABLE = new NullableTypeEnum( "columnNullable" );
  /**
   * Enumeration constant corresponding to literal columnNullableUnknown.
   */
  public static final NullableTypeEnum COLUMN_NULLABLE_UNKNOWN = new NullableTypeEnum( "columnNullableUnknown" );

  private static final java.util.List typeName;
  private final java.lang.String literalName;

  static {
    java.util.ArrayList temp = new java.util.ArrayList();
    temp.add( "Pentaho" );
    temp.add( "Meta" );
    temp.add( "Relational" );
    temp.add( "Enumerations" );
    temp.add( "NullableType" );
    typeName = java.util.Collections.unmodifiableList( temp );
  }

  private NullableTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  /**
   * Returns fully qualified name of the enumeration type.
   * 
   * @return List containing all parts of the fully qualified name.
   */
  public java.util.List refTypeName() {
    return typeName;
  }

  /**
   * Returns a string representation of the enumeration value.
   * 
   * @return A string representation of the enumeration value.
   */
  public java.lang.String toString() {
    return literalName;
  }

  /**
   * Returns a hash code for this the enumeration value.
   * 
   * @return A hash code for this enumeration value.
   */
  public int hashCode() {
    return literalName.hashCode();
  }

  /**
   * Indicates whether some other object is equal to this enumeration value.
   * 
   * @param o
   *          The reference object with which to compare.
   * @return true if the other object is the enumeration of the same type and of the same value.
   */
  public boolean equals( java.lang.Object o ) {
    if ( o instanceof NullableTypeEnum ) {
      return ( o == this );
    } else if ( o instanceof NullableType ) {
      return ( o.toString().equals( literalName ) );
    } else {
      return ( ( o instanceof javax.jmi.reflect.RefEnum )
          && ( (javax.jmi.reflect.RefEnum) o ).refTypeName().equals( typeName ) && o.toString().equals( literalName ) );
    }
  }

  /**
   * Translates literal name to correspondent enumeration value.
   * 
   * @param name
   *          Enumeration literal.
   * @return Enumeration value corresponding to the passed literal.
   */
  public static NullableType forName( java.lang.String name ) {
    if ( name.equals( "columnNoNulls" ) ) {
      return COLUMN_NO_NULLS;
    }
    if ( name.equals( "columnNullable" ) ) {
      return COLUMN_NULLABLE;
    }
    if ( name.equals( "columnNullableUnknown" ) ) {
      return COLUMN_NULLABLE_UNKNOWN;
    }
    throw new java.lang.IllegalArgumentException( "Unknown literal name '" + name
        + "' for enumeration 'Pentaho.Meta.Relational.Enumerations.NullableType'" );
  }

  /**
   * Resolves serialized instance of enumeration value.
   * 
   * @return Resolved enumeration value.
   */
  protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
    try {
      return forName( literalName );
    } catch ( java.lang.IllegalArgumentException e ) {
      throw new java.io.InvalidObjectException( e.getMessage() );
    }
  }
}
