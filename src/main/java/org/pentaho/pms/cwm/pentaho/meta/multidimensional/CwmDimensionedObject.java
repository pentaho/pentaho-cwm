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


package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * DimensionedObject object instance interface. DimensionedObject represents an attribute of Dimension.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDimensionedObject extends org.pentaho.pms.cwm.pentaho.meta.core.CwmAttribute {
  /**
   * Returns the value of reference dimension.
   * 
   * @return Value of reference dimension. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension> */getDimension();

  /**
   * Returns the value of reference schema.
   * 
   * @return Value of reference schema.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmSchema getSchema();

  /**
   * Sets the value of reference schema. See {@link #getSchema} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSchema( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmSchema newValue );
}
