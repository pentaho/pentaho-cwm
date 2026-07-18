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
 * NamedColumnSet object instance interface. A catalogued set of columns, which may be Table or View. Note for typed
 * tables: It is assumed that the typed table will own a set of columns conforming to the type they are OF. This set of
 * columns allows the ma nipulation of the table by products which ignore this [SQL] extension. I t also allows the
 * columns of type REF, to be copied to a column with a S COPE reference.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmNamedColumnSet extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumnSet {
  /**
   * Returns the value of reference optionScopeColumn.
   * 
   * @return Value of reference optionScopeColumn. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn> */getOptionScopeColumn();

  /**
   * Returns the value of reference type.
   * 
   * @return Value of reference type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlstructuredType getType();

  /**
   * Sets the value of reference type. See {@link #getType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlstructuredType newValue );

  /**
   * Returns the value of reference usingTrigger.
   * 
   * @return Value of reference usingTrigger. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger> */getUsingTrigger();
}
