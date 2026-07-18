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
 * SQLStructuredType object instance interface. A Datatype defined as Structured Type, per [SQL] standard.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqlstructuredType extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldataType,
    org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference referencingColumn.
   * 
   * @return Value of reference referencingColumn. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn> */getReferencingColumn();

  /**
   * Returns the value of reference columnSet.
   * 
   * @return Value of reference columnSet. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet> */getColumnSet();
}
