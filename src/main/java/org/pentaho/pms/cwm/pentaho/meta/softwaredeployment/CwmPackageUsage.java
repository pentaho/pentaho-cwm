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
 * PackageUsage object instance interface. A PackageUsage represents a usage of a Package. It is particularly relevant
 * in situations where a specific usage uses an alternative name for the Package, as this alternative name can be
 * recorded using the packageAlias attribute. For example, if a DataProvider representing an ODBC or JDBC client uses a
 * na me for a relational database that is different from the dataPackage name used b y the RDBMS server, a PackageUsage
 * that has the relevant ProviderConnection as client and the server?s data Package as supplier can be added. Its pa
 * ckageAlias attribute can be used to record the name by which the data Pa ckage is known to the DataProvider.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmPackageUsage extends org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency {
  /**
   * Returns the value of attribute packageAlias. If this attribute is present, it identifies the name by which the
   * Package is known to the client.
   * 
   * @return Value of attribute packageAlias.
   */
  public java.lang.String getPackageAlias();

  /**
   * Sets the value of packageAlias attribute. See {@link #getPackageAlias} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPackageAlias( java.lang.String newValue );
}
