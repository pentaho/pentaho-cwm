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
 * DeployedComponent object instance interface. A DeployedComponent represents the deployment of a Component on a
 * specific Machine. It may represent the deployment of any type of Component. However, if the C omponent is part of a
 * SoftwareSystem, the DeployedComponent should be part of a DeployedSoftwareSystem. Usage dependencies may be used to
 * document that one DeployedComponent uses another DeployedComponent.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDeployedComponent extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
  /**
   * Returns the value of attribute pathname. A pathname for the DeployedComponent within the Machine?s file system.
   * 
   * @return Value of attribute pathname.
   */
  public java.lang.String getPathname();

  /**
   * Sets the value of pathname attribute. See {@link #getPathname} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPathname( java.lang.String newValue );

  /**
   * Returns the value of reference component.
   * 
   * @return Value of reference component.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmComponent getComponent();

  /**
   * Sets the value of reference component. See {@link #getComponent} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setComponent( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmComponent newValue );

  /**
   * Returns the value of reference machine.
   * 
   * @return Value of reference machine.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmMachine getMachine();

  /**
   * Sets the value of reference machine. See {@link #getMachine} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMachine( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmMachine newValue );

  /**
   * Returns the value of reference usingComponents.
   * 
   * @return Value of reference usingComponents. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent> */getUsingComponents();

  /**
   * Returns the value of reference usedComponents.
   * 
   * @return Value of reference usedComponents. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent> */getUsedComponents();
}
