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
 * ContentMap object instance interface. ContentMap is a subclass of TransformationMap that maps CubeRegion attributes
 * to their physical data sources.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmContentMap extends org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationMap {
  /**
   * Returns the value of reference cubeDeployment.
   * 
   * @return Value of reference cubeDeployment.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment getCubeDeployment();

  /**
   * Sets the value of reference cubeDeployment. See {@link #getCubeDeployment} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCubeDeployment( org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment newValue );
}
