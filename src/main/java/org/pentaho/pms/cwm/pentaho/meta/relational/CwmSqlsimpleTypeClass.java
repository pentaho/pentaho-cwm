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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * SQLSimpleType class proxy interface. A simple datatype used with an SQL column. Examples are Integer, Varchar, LOB,
 * CLOB, etc...
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqlsimpleTypeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmSqlsimpleType createCwmSqlsimpleType();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param typeNumber
   *          The number assigned to the datatype by the owning RDBMS
   * @param characterMaximumLength
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @param characterOctetLength
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @param numericPrecision
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @param numericPrecisionRadix
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @param numericScale
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @param dateTimePrecision
   *          See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * @return The created instance object.
   */
  public CwmSqlsimpleType createCwmSqlsimpleType( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract,
      java.lang.Integer typeNumber, java.lang.Integer characterMaximumLength, java.lang.Integer characterOctetLength,
      java.lang.Integer numericPrecision, java.lang.Integer numericPrecisionRadix, java.lang.Integer numericScale,
      java.lang.Integer dateTimePrecision );
}
