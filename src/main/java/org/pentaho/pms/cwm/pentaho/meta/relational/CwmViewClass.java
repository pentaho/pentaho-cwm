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
 * View class proxy interface. A view is a non-materialized set of rows, defined by the associated query.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmViewClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmView createCwmView();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param isReadOnly
   *          Indicates whether the underlying tables can be updated through an update to this View.
   * @param checkOption
   *          This field is meaningful only if the view is not ReadOnly. CheckOption indicates that the RDBMS will
   *          validate that changes made to the data verify the view filtering condition and belong to the view result
   *          set.
   * @param queryExpression
   *          The query associated with the View. The query result must match the set of Columns associated with the
   *          View (in p arent class ColumnSet)
   * @return The created instance object.
   */
  public CwmView createCwmView( java.lang.String name, org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      boolean isAbstract, boolean isReadOnly, boolean checkOption,
      org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpression queryExpression );
}
