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
 * ProviderConnection object instance interface. A ProviderConnection represents a connection that allows a DataProvider
 * acting as a client to access data from a specific DataManager. For example a ProviderConnection could represent a
 * connection from an ODBC or JDBC client to a DBMS.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmProviderConnection extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute isReadOnly. Indicates whether the ProviderConnection only allows read access to the
   * DataManager.
   * 
   * @return Value of attribute isReadOnly.
   */
  public boolean isReadOnly();

  /**
   * Sets the value of isReadOnly attribute. See {@link #isReadOnly} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setReadOnly( boolean newValue );

  /**
   * Returns the value of reference dataProvider.
   * 
   * @return Value of reference dataProvider.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataProvider getDataProvider();

  /**
   * Sets the value of reference dataProvider. See {@link #getDataProvider} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDataProvider( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataProvider newValue );

  /**
   * Returns the value of reference dataManager.
   * 
   * @return Value of reference dataManager.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager getDataManager();

  /**
   * Sets the value of reference dataManager. See {@link #getDataManager} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDataManager( org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager newValue );
}
