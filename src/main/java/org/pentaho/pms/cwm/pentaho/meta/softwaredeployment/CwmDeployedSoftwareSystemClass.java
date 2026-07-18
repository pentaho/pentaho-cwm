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
 * DeployedSoftwareSystem class proxy interface. A DeployedSoftwareSystem represents a deployment of a SoftwareSystem.
 * Its associated DeployedComponents identify the individual Component dep loyments that constitute the
 * DeployedSoftwareSystem. These DeployedComponents ar e not necessarily all deployed on the same Machine.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDeployedSoftwareSystemClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDeployedSoftwareSystem createCwmDeployedSoftwareSystem();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param fixLevel
   *          Describes the fix level of the DeployedSoftwareSystem instance.
   * @return The created instance object.
   */
  public CwmDeployedSoftwareSystem createCwmDeployedSoftwareSystem( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String fixLevel );
}
