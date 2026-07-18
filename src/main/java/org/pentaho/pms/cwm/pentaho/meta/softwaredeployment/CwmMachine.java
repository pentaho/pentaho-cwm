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
