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
 * Catalog object instance interface. A Catalog is the unit of logon and identification. It also identifies the scope of
 * SQL statements: the tables contained in a catalog can be used in a single SQL statement.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCatalog extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
  /**
   * Returns the value of attribute defaultCharacterSetName. The name of the default character set used for the values
   * in the column. This field applies only to columns whose datatype is a character string.
   * 
   * @return Value of attribute defaultCharacterSetName.
   */
  public java.lang.String getDefaultCharacterSetName();

  /**
   * Sets the value of defaultCharacterSetName attribute. See {@link #getDefaultCharacterSetName} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDefaultCharacterSetName( java.lang.String newValue );

  /**
   * Returns the value of attribute defaultCollationName. The name of the default collation sequence used to sort the
   * data values in the column.
   * 
   * @return Value of attribute defaultCollationName.
   */
  public java.lang.String getDefaultCollationName();

  /**
   * Sets the value of defaultCollationName attribute. See {@link #getDefaultCollationName} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDefaultCollationName( java.lang.String newValue );
}
