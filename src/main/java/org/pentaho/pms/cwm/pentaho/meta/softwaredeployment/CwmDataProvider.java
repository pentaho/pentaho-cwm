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
