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


package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * Column object instance interface. A column in a result set, a view, a table, or an SQLStructuredType.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmColumn extends org.pentaho.pms.cwm.pentaho.meta.core.CwmAttribute {
  /**
   * Returns the value of attribute precision. The total number of digits in the field.
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
   * Returns the value of attribute isNullable. Indicates if null values are valid in this column. Note: Default values
   * for Column data are provided in initialValue in the UML Attribute class (the class from which the Column class
   * inherits).
   * 
   * @return Value of attribute isNullable.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.NullableType getIsNullable();

  /**
   * Sets the value of isNullable attribute. See {@link #getIsNullable} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setIsNullable( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.NullableType newValue );

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
   * Returns the value of attribute collationName. The name of the collation sequence used to sort the data values in
   * the column. This applies only to columns whose datatype is a form of character stri ng.
   * 
   * @return Value of attribute collationName.
   */
  public java.lang.String getCollationName();

  /**
   * Sets the value of collationName attribute. See {@link #getCollationName} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCollationName( java.lang.String newValue );

  /**
   * Returns the value of attribute characterSetName. The name of the character set used for the values in the column.
   * This field applies only to columns whose datatype is a character string.
   * 
   * @return Value of attribute characterSetName.
   */
  public java.lang.String getCharacterSetName();

  /**
   * Sets the value of characterSetName attribute. See {@link #getCharacterSetName} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCharacterSetName( java.lang.String newValue );

  /**
   * Returns the value of reference optionScopeColumnSet.
   * 
   * @return Value of reference optionScopeColumnSet.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet getOptionScopeColumnSet();

  /**
   * Sets the value of reference optionScopeColumnSet. See {@link #getOptionScopeColumnSet} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOptionScopeColumnSet( org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet newValue );

  /**
   * Returns the value of reference referencedTableType.
   * 
   * @return Value of reference referencedTableType.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlstructuredType getReferencedTableType();

  /**
   * Sets the value of reference referencedTableType. See {@link #getReferencedTableType} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setReferencedTableType( org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlstructuredType newValue );
}
