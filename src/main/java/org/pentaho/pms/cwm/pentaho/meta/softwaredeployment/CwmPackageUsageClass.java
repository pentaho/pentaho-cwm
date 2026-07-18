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
 * PackageUsage class proxy interface. A PackageUsage represents a usage of a Package. It is particularly relevant in
 * situations where a specific usage uses an alternative name for the Package, as this alternative name can be recorded
 * using the packageAlias attribute. For example, if a DataProvider representing an ODBC or JDBC client uses a na me for
 * a relational database that is different from the dataPackage name used b y the RDBMS server, a PackageUsage that has
 * the relevant ProviderConnection as client and the server?s data Package as supplier can be added. Its pa ckageAlias
 * attribute can be used to record the name by which the data Pa ckage is known to the DataProvider.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmPackageUsageClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmPackageUsage createCwmPackageUsage();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param kind
   *          Contains a description of the nature of the dependency relationship between the client and supplier. The
   *          list of possible values is open-ended. However, CWM predefines the values "Abstraction" and "Usage".
   * @param packageAlias
   *          If this attribute is present, it identifies the name by which the Package is known to the client.
   * @return The created instance object.
   */
  public CwmPackageUsage createCwmPackageUsage( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String kind,
      java.lang.String packageAlias );
}
