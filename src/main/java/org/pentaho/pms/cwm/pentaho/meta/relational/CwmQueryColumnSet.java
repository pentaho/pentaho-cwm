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
