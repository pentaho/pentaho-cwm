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
 * SQLSimpleType object instance interface. A simple datatype used with an SQL column. Examples are Integer, Varchar,
 * LOB, CLOB, etc...
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqlsimpleType extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldataType,
    org.pentaho.pms.cwm.pentaho.meta.core.CwmDataType {
  /**
   * Returns the value of attribute characterMaximumLength. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute characterMaximumLength.
   */
  public java.lang.Integer getCharacterMaximumLength();

  /**
   * Sets the value of characterMaximumLength attribute. See {@link #getCharacterMaximumLength} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCharacterMaximumLength( java.lang.Integer newValue );

  /**
   * Returns the value of attribute characterOctetLength. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute characterOctetLength.
   */
  public java.lang.Integer getCharacterOctetLength();

  /**
   * Sets the value of characterOctetLength attribute. See {@link #getCharacterOctetLength} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCharacterOctetLength( java.lang.Integer newValue );

  /**
   * Returns the value of attribute numericPrecision. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute numericPrecision.
   */
  public java.lang.Integer getNumericPrecision();

  /**
   * Sets the value of numericPrecision attribute. See {@link #getNumericPrecision} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setNumericPrecision( java.lang.Integer newValue );

  /**
   * Returns the value of attribute numericPrecisionRadix. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute numericPrecisionRadix.
   */
  public java.lang.Integer getNumericPrecisionRadix();

  /**
   * Sets the value of numericPrecisionRadix attribute. See {@link #getNumericPrecisionRadix} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setNumericPrecisionRadix( java.lang.Integer newValue );

  /**
   * Returns the value of attribute numericScale. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute numericScale.
   */
  public java.lang.Integer getNumericScale();

  /**
   * Sets the value of numericScale attribute. See {@link #getNumericScale} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setNumericScale( java.lang.Integer newValue );

  /**
   * Returns the value of attribute dateTimePrecision. See [SQL], corresponding field in DATA_TYPE_DESCRIPTOR
   * 
   * @return Value of attribute dateTimePrecision.
   */
  public java.lang.Integer getDateTimePrecision();

  /**
   * Sets the value of dateTimePrecision attribute. See {@link #getDateTimePrecision} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDateTimePrecision( java.lang.Integer newValue );
}
