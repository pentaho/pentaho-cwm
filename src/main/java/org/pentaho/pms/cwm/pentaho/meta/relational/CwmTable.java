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
 * Table object instance interface. A materialized NamedColumnSet.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTable extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet {
  /**
   * Returns the value of attribute isTemporary. Indicates that the table content is temporary. SQL92 standards provide
   * two types of temporary tables (local Temporary and Global Temporary). However, RDBMS products have implemented
   * variations on this theme. It is recommended that the product manufacturers provide specific temporary information
   * (besides the temporaryScope attribute) in their extensions.
   * 
   * @return Value of attribute isTemporary.
   */
  public boolean isTemporary();

  /**
   * Sets the value of isTemporary attribute. See {@link #isTemporary} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTemporary( boolean newValue );

  /**
   * Returns the value of attribute temporaryScope. This attribute is meaningful only when the isTemporary flag is True
   * [C-1]. The scope indicates when the data of this table are available. "SESSION", "APPLICATION" are examples of
   * possible values. Look at the Scope attribute for Global Temporary tables in the SQL standards for more details.
   * 
   * @return Value of attribute temporaryScope.
   */
  public java.lang.String getTemporaryScope();

  /**
   * Sets the value of temporaryScope attribute. See {@link #getTemporaryScope} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTemporaryScope( java.lang.String newValue );

  /**
   * Returns the value of attribute isSystem. Indicates that the Table is a System Table (generally part of or view on
   * the system catalog).
   * 
   * @return Value of attribute isSystem.
   */
  public boolean isSystem();

  /**
   * Sets the value of isSystem attribute. See {@link #isSystem} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSystem( boolean newValue );

  /**
   * Returns the value of reference trigger.
   * 
   * @return Value of reference trigger. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger> */getTrigger();
}
