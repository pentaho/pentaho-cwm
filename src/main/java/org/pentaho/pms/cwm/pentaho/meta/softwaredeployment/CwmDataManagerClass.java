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
 * DataManager class proxy interface. A DataManager represents a DeployedComponent that manages access to data. For
 * example, a deployed DBMS or File Management System would be represented as a DataManager. The DataManager may be
 * associated with one or more data Packages identifyi ng the Schema, Relational Catalog, Files, or other data container
 * that it pr ovides access to.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataManagerClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDataManager createCwmDataManager();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param pathname
   *          A pathname for the DeployedComponent within the Machine?s file system.
   * @param isCaseSensitive
   *          Indicates whether or not the DataManager treats lower case letters within object names as being different
   *          from the corresponding upper case letters.
   * @return The created instance object.
   */
  public CwmDataManager createCwmDataManager( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String pathname,
      boolean isCaseSensitive );
}
