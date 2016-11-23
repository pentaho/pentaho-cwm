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
 * SQLDistinctType object instance interface. A datatype defined as a Distinct Type, per [SQL] standard.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqldistinctType extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldataType,
    org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmTypeAlias {
  /**
   * Returns the value of attribute length. The length of fixed length character or byte strings. Maximum length if
   * length is variable.
   * 
   * @return Value of attribute length.
   */
  public java.lang.Integer getLength();

  /**
   * Sets the value of length attribute. See {@link #getLength} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLength( java.lang.Integer newValue );

  /**
   * Returns the value of attribute precision. The total number of digits in the field
   * 
   * @return Value of attribute precision.
   */
  public java.lang.Integer getPrecision();

  /**
   * Sets the value of precision attribute. See {@link #getPrecision} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPrecision( java.lang.Integer newValue );

  /**
   * Returns the value of attribute scale. The number of digits on the right of the decimal separator.
   * 
   * @return Value of attribute scale.
   */
  public java.lang.Integer getScale();

  /**
   * Sets the value of scale attribute. See {@link #getScale} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setScale( java.lang.Integer newValue );

  /**
   * Returns the value of reference sqlSimpleType.
   * 
   * @return Value of reference sqlSimpleType.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlsimpleType getSqlSimpleType();

  /**
   * Sets the value of reference sqlSimpleType. See {@link #getSqlSimpleType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSqlSimpleType( org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlsimpleType newValue );
}
