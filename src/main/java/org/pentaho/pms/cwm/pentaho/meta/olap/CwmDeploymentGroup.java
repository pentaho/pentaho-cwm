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
 * DeploymentGroup object instance interface. DeploymentGroup represents a logical grouping of model elements defining a
 * single, complete deployment of an instance of Olap Schema (i.e., CubeDeployments and DimensionDeployments). The usage
 * of DeploymentGroup is as follows: A user may specify a particul ar DeploymentGroup as the session-wide, default
 * deployment for all metadata queries performed throughout the session. Alternatively, for queries involving some
 * particular deployed object (e.g., a Cube or a Dimension), the user may b e asked to choose from a list of
 * deployments. This either becomes the default deploy ment for the remainder of the session, or the user may continue
 * to be a sked to specify a deployment for each subsequent query against deployed ob jects.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDeploymentGroup extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
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

  /**
   * Returns the value of reference cubeDeployment.
   * 
   * @return Value of reference cubeDeployment. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment> */getCubeDeployment();

  /**
   * Returns the value of reference dimensionDeployment.
   * 
   * @return Value of reference dimensionDeployment. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment> */getDimensionDeployment();
}
