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
 * SQLIndex object instance interface. An Index on a table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqlindex extends org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex {
  /**
   * Returns the value of attribute filterCondition. Which subset of the table is indexed
   * 
   * @return Value of attribute filterCondition.
   */
  public java.lang.String getFilterCondition();

  /**
   * Sets the value of filterCondition attribute. See {@link #getFilterCondition} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFilterCondition( java.lang.String newValue );

  /**
   * Returns the value of attribute isNullable. Entries in this index can be null
   * 
   * @return Value of attribute isNullable.
   */
  public boolean isNullable();

  /**
   * Sets the value of isNullable attribute. See {@link #isNullable} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setNullable( boolean newValue );

  /**
   * Returns the value of attribute autoUpdate. The index is updated automatically
   * 
   * @return Value of attribute autoUpdate.
   */
  public boolean isAutoUpdate();

  /**
   * Sets the value of autoUpdate attribute. See {@link #isAutoUpdate} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setAutoUpdate( boolean newValue );
}
