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

package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * Machine object instance interface. A Machine represents a computer. The Site at which the Machine is located and the
 * Components deployed on the Machine may be recorded.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMachine extends org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace {
  /**
   * Returns the value of attribute ipAddress. A fixed IP address for the Machine.
   * 
   * @return Value of ipAddress attribute. Element type: {@link java.lang.String}
   */
  public java.util.List/* <java.lang.String> */getIpAddress();

  /**
   * Returns the value of attribute hostName. A Host Name for the Machine. This may be used to identify the Machine on
   * the network when IP addresses are dynamically allocated.
   * 
   * @return Value of hostName attribute. Element type: {@link java.lang.String}
   */
  public java.util.List/* <java.lang.String> */getHostName();

  /**
   * Returns the value of attribute machineID. An identification code for the Machine.
   * 
   * @return Value of attribute machineID.
   */
  public java.lang.String getMachineId();

  /**
   * Sets the value of machineID attribute. See {@link #getMachineId} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMachineId( java.lang.String newValue );

  /**
   * Returns the value of reference site.
   * 
   * @return Value of reference site.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSite getSite();

  /**
   * Sets the value of reference site. See {@link #getSite} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSite( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSite newValue );

  /**
   * Returns the value of reference deployedComponent.
   * 
   * @return Value of reference deployedComponent. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent> */getDeployedComponent();
}
