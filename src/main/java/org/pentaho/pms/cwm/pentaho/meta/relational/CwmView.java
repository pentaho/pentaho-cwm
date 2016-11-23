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
 * View object instance interface. A view is a non-materialized set of rows, defined by the associated query.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmView extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet {
  /**
   * Returns the value of attribute isReadOnly. Indicates whether the underlying tables can be updated through an update
   * to this View.
   * 
   * @return Value of attribute isReadOnly.
   */
  public boolean isReadOnly();

  /**
   * Sets the value of isReadOnly attribute. See {@link #isReadOnly} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setReadOnly( boolean newValue );

  /**
   * Returns the value of attribute checkOption. This field is meaningful only if the view is not ReadOnly. CheckOption
   * indicates that the RDBMS will validate that changes made to the data verify the view filtering condition and belong
   * to the view result set.
   * 
   * @return Value of attribute checkOption.
   */
  public boolean isCheckOption();

  /**
   * Sets the value of checkOption attribute. See {@link #isCheckOption} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCheckOption( boolean newValue );

  /**
   * Returns the value of attribute queryExpression. The query associated with the View. The query result must match the
   * set of Columns associated with the View ( in parent class ColumnSet)
   * 
   * @return Value of attribute queryExpression.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpression getQueryExpression();

  /**
   * Sets the value of queryExpression attribute. See {@link #getQueryExpression} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setQueryExpression( org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpression newValue );
}
