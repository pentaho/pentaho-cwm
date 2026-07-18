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


package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * Dimension class proxy interface. A Dimension is an ordinate within a multidimensional structure, and consists of an
 * ordered list of values (i.e., members) that share a common semantic meaning within the domain being modeled. Each
 * member designates a unique position along its ordinate. Typical Dimensions are: Time, Product, Geography, Scenario
 * (e.g., actual, bud get, forecast), Measure (e.g., sales, quantity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDimensionClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDimension createCwmDimension();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param isTime
   *          If true, then this Dimension is a Time Dimension (i.e., its members collectively represent a time series).
   * @param isMeasure
   *          If true, then this Dimension is a Measure Dimension (i.e., its members represent Measures).
   * @return The created instance object.
   */
  public CwmDimension createCwmDimension( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract, boolean isTime,
      boolean isMeasure );
}
