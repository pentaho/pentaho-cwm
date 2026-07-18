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
 * QueryColumnSet object instance interface. The result set of a query.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmQueryColumnSet extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumnSet {
  /**
   * Returns the value of attribute query. The query expression generating this result. The language attribute of the
   * expression should generally begin with "SQL"
   * 
   * @return Value of attribute query.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpression getQuery();

  /**
   * Sets the value of query attribute. See {@link #getQuery} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setQuery( org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpression newValue );
}
