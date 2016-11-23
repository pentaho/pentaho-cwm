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
 * DataProvider object instance interface. A DataProvider is a deployed software Component that acts as a client to
 * provide access to data that is managed by another product. For instance, a DataProvider might represent a deployed
 * ODBC or JDBC product. The DataProvider may have resourceConnection references to ProviderConnec tions identifying the
 * DataManagers to which it provides access.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataProvider extends org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager {
  /**
   * Returns the value of reference resourceConnection.
   * 
   * @return Value of reference resourceConnection. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmProviderConnection}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmProviderConnection> */getResourceConnection();
}
