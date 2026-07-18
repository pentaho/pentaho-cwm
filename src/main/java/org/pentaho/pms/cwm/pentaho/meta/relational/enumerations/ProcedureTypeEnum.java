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
 * ProcedureType enumeration class implementation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public final class ProcedureTypeEnum implements ProcedureType {
  /**
   * Enumeration constant corresponding to literal procedure.
   */
  public static final ProcedureTypeEnum PROCEDURE = new ProcedureTypeEnum( "procedure" );
  /**
   * Enumeration constant corresponding to literal function.
   */
  public static final ProcedureTypeEnum FUNCTION = new ProcedureTypeEnum( "function" );

  private static final java.util.List typeName;
  private final java.lang.String literalName;

  static {
    java.util.ArrayList temp = new java.util.ArrayList();
    temp.add( "Pentaho" );
    temp.add( "Meta" );
    temp.add( "Relational" );
    temp.add( "Enumerations" );
    temp.add( "ProcedureType" );
    typeName = java.util.Collections.unmodifiableList( temp );
  }

  private ProcedureTypeEnum( java.lang.String literalName ) {
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
    if ( o instanceof ProcedureTypeEnum ) {
      return ( o == this );
    } else if ( o instanceof ProcedureType ) {
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
  public static ProcedureType forName( java.lang.String name ) {
    if ( name.equals( "procedure" ) ) {
      return PROCEDURE;
    }
    if ( name.equals( "function" ) ) {
      return FUNCTION;
    }
    throw new java.lang.IllegalArgumentException( "Unknown literal name '" + name
        + "' for enumeration 'Pentaho.Meta.Relational.Enumerations.ProcedureType'" );
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
