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
 * Machine class proxy interface. A Machine represents a computer. The Site at which the Machine is located and the
 * Components deployed on the Machine may be recorded.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMachineClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmMachine createCwmMachine();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param ipAddress
   *          A fixed IP address for the Machine.
   * @param hostName
   *          A Host Name for the Machine. This may be used to identify the Machine on the network when IP addresses are
   *          dynamically allocated.
   * @param machineID
   *          An identification code for the Machine.
   * @return The created instance object.
   */
  public CwmMachine createCwmMachine( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.util.List/* <java.lang.String> */ipAddress,
      java.util.List/* <java.lang.String> */hostName, java.lang.String machineId );
}
