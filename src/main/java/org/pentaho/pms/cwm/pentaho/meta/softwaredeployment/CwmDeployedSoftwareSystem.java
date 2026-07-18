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
 * DeployedSoftwareSystem object instance interface. A DeployedSoftwareSystem represents a deployment of a
 * SoftwareSystem. Its associated DeployedComponents identify the individual Component dep loyments that constitute the
 * DeployedSoftwareSystem. These DeployedComponents ar e not necessarily all deployed on the same Machine.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDeployedSoftwareSystem extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
  /**
   * Returns the value of attribute fixLevel. Describes the fix level of the DeployedSoftwareSystem instance.
   * 
   * @return Value of attribute fixLevel.
   */
  public java.lang.String getFixLevel();

  /**
   * Sets the value of fixLevel attribute. See {@link #getFixLevel} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFixLevel( java.lang.String newValue );

  /**
   * Returns the value of reference softwareSystem.
   * 
   * @return Value of reference softwareSystem.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSoftwareSystem getSoftwareSystem();

  /**
   * Sets the value of reference softwareSystem. See {@link #getSoftwareSystem} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSoftwareSystem( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSoftwareSystem newValue );
}
