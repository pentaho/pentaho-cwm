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
 * Schema object instance interface. Schema contains all elements comprising a Multidimensional database.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSchema extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
  /**
   * Returns the value of reference dimensionedObject.
   * 
   * @return Value of reference dimensionedObject. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject> */getDimensionedObject();

  /**
   * Returns the value of reference dimension.
   * 
   * @return Value of reference dimension. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension> */getDimension();
}
