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
 * Dimension object instance interface. A Dimension is an ordinate within a multidimensional structure, and consists of
 * an ordered list of values (i.e., members) that share a common semantic meaning within the domain being modeled. Each
 * member designates a unique position along its ordinate. Typical Dimensions are: Time, Product, Geography, Scenario
 * (e.g., actual, bud get, forecast), Measure (e.g., sales, quantity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDimension extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of attribute isTime. If true, then this Dimension is a Time Dimension (i.e., its members
   * collectively represent a time series).
   * 
   * @return Value of attribute isTime.
   */
  public boolean isTime();

  /**
   * Sets the value of isTime attribute. See {@link #isTime} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTime( boolean newValue );

  /**
   * Returns the value of attribute isMeasure. If true, then this Dimension is a Measure Dimension (i.e., its members
   * represent Measures).
   * 
   * @return Value of attribute isMeasure.
   */
  public boolean isMeasure();

  /**
   * Sets the value of isMeasure attribute. See {@link #isMeasure} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMeasure( boolean newValue );

  /**
   * Returns the value of reference hierarchy.
   * 
   * @return Value of reference hierarchy. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy> */getHierarchy();

  /**
   * Returns the value of reference memberSelection.
   * 
   * @return Value of reference memberSelection. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelection}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelection> */getMemberSelection();

  /**
   * Returns the value of reference cubeDimensionAssociation.
   * 
   * @return Value of reference cubeDimensionAssociation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation> */getCubeDimensionAssociation();

  /**
   * Returns the value of reference displayDefault.
   * 
   * @return Value of reference displayDefault.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy getDisplayDefault();

  /**
   * Sets the value of reference displayDefault. See {@link #getDisplayDefault} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDisplayDefault( org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy newValue );

  /**
   * Returns the value of reference schema.
   * 
   * @return Value of reference schema.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmSchema getSchema();

  /**
   * Sets the value of reference schema. See {@link #getSchema} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSchema( org.pentaho.pms.cwm.pentaho.meta.olap.CwmSchema newValue );
}
