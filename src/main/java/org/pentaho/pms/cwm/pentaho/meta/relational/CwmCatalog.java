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
