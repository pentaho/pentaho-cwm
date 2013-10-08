/*
 * Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
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
 * CubeDeployment object instance interface. CubeDeployment represents a particular implementation strategy for the data
 * portions of an OLAP model. It does so by organizing a collection of ContentMaps, which in turn define a mapping to an
 * implementation model.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCubeDeployment extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference cubeRegion.
   * 
   * @return Value of reference cubeRegion.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion getCubeRegion();

  /**
   * Sets the value of reference cubeRegion. See {@link #getCubeRegion} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCubeRegion( org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion newValue );

  /**
   * Returns the value of reference deploymentGroup.
   * 
   * @return Value of reference deploymentGroup.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDeploymentGroup getDeploymentGroup();

  /**
   * Sets the value of reference deploymentGroup. See {@link #getDeploymentGroup} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDeploymentGroup( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDeploymentGroup newValue );

  /**
   * Returns the value of reference contentMap.
   * 
   * @return Value of reference contentMap. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmContentMap}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmContentMap> */getContentMap();
}
