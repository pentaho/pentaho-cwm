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

package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * StructureMap object instance interface. StructureMap is a subclass of TransformationMap that maps Dimension
 * attributes to their physical data sources. (Note: Multiple StructureMaps may be grouped together into single,
 * cohesive uni t via TransformationTask.)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmStructureMap extends org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationMap {
  /**
   * Returns the value of reference dimensionDeployment.
   * 
   * @return Value of reference dimensionDeployment.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment getDimensionDeployment();

  /**
   * Sets the value of reference dimensionDeployment. See {@link #getDimensionDeployment} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDimensionDeployment( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment newValue );

  /**
   * Returns the value of reference dimensionDeploymentLV.
   * 
   * @return Value of reference dimensionDeploymentLV.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment getDimensionDeploymentLv();

  /**
   * Sets the value of reference dimensionDeploymentLV. See {@link #getDimensionDeploymentLv} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDimensionDeploymentLv( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment newValue );

  /**
   * Returns the value of reference dimensionDeploymentIP.
   * 
   * @return Value of reference dimensionDeploymentIP.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment getDimensionDeploymentIp();

  /**
   * Sets the value of reference dimensionDeploymentIP. See {@link #getDimensionDeploymentIp} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDimensionDeploymentIp( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment newValue );
}
