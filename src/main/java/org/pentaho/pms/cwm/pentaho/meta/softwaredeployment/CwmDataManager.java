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
 * DataManager object instance interface. A DataManager represents a DeployedComponent that manages access to data. For
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
public interface CwmDataManager extends org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponent {
  /**
   * Returns the value of attribute isCaseSensitive. Indicates whether or not the DataManager treats lower case letters
   * within object names as being different from the corresponding upper case letters.
   * 
   * @return Value of attribute isCaseSensitive.
   */
  public boolean isCaseSensitive();

  /**
   * Sets the value of isCaseSensitive attribute. See {@link #isCaseSensitive} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCaseSensitive( boolean newValue );

  /**
   * Returns the value of reference dataPackage.
   * 
   * @return Value of reference dataPackage. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage> */getDataPackage();
}
