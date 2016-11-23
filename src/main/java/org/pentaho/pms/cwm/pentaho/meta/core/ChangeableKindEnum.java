/*
 * Copyright 2002 - 2016 Pentaho Corporation.  All rights reserved.
 * 
 * This software was developed by Pentaho Corporation and is provided under the terms
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */

package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * ChangeableKind enumeration class implementation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public final class ChangeableKindEnum implements ChangeableKind {
  /**
   * Enumeration constant corresponding to literal ck_changeable.
   */
  public static final ChangeableKindEnum CK_CHANGEABLE = new ChangeableKindEnum( "ck_changeable" );
  /**
   * Enumeration constant corresponding to literal ck_frozen.
   */
  public static final ChangeableKindEnum CK_FROZEN = new ChangeableKindEnum( "ck_frozen" );
  /**
   * Enumeration constant corresponding to literal ck_addOnly.
   */
  public static final ChangeableKindEnum CK_ADD_ONLY = new ChangeableKindEnum( "ck_addOnly" );

  private static final java.util.List typeName;
  private final java.lang.String literalName;

  static {
    java.util.ArrayList temp = new java.util.ArrayList();
    temp.add( "Pentaho" );
    temp.add( "Meta" );
    temp.add( "Core" );
    temp.add( "ChangeableKind" );
    typeName = java.util.Collections.unmodifiableList( temp );
  }

  private ChangeableKindEnum( java.lang.String literalName ) {
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
    if ( o instanceof ChangeableKindEnum ) {
      return ( o == this );
    } else if ( o instanceof ChangeableKind ) {
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
  public static ChangeableKind forName( java.lang.String name ) {
    if ( name.equals( "ck_changeable" ) ) {
      return CK_CHANGEABLE;
    }
    if ( name.equals( "ck_frozen" ) ) {
      return CK_FROZEN;
    }
    if ( name.equals( "ck_addOnly" ) ) {
      return CK_ADD_ONLY;
    }
    throw new java.lang.IllegalArgumentException( "Unknown literal name '" + name
        + "' for enumeration 'Pentaho.Meta.Core.ChangeableKind'" );
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
