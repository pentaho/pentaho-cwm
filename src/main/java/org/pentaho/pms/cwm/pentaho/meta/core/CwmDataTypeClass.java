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
 * DataType class proxy interface. A data type is a type whose values have no identity (i.e., they are pure values).
 * Data types include primitive built-in types (such as integer and string) as well as definable enumeration types. In
 * the metamodel, a DataType defines a special kind of Classifier in whic h operations are all pure functions (i.e.,
 * they can return data values but they cannot change data values, because they have no identity). For example, an "add"
 * operation on a number with another number as an argument yields a third number as a result; the target and argument
 * are unchanged. A DataType is a special kind of Classifier whose instances are primitive values, not objects. For
 * example, integers and strings are usually treated as primitive values. A primitive value does not have an identity,
 * so two occu rrences of the same value cannot be differentiated. Usually, DataTypes are used for specification of the
 * type of an attribute or parameter.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataTypeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDataType createCwmDataType();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @return The created instance object.
   */
  public CwmDataType createCwmDataType( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract );
}
