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
 * DataManagerDataPackage association proxy interface. This associates the Package(s) containing the definition of the
 * data with the DataManager that is used to access it. For example, it may be used to associate a Schema, Relational
 * Catalog or F ile with the DataManager that manages access to it.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface DataManagerDataPackage extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param dataPackage
   *          Value of the first association end.
   * @param dataManager
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage dataPackage,
      org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager dataManager );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param dataManager
   *          Required value of the second association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getDataPackage(
      org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager dataManager );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param dataPackage
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getDataManager( org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage dataPackage );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param dataPackage
   *          Value of the first association end.
   * @param dataManager
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage dataPackage,
      org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager dataManager );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param dataPackage
   *          Value of the first association end.
   * @param dataManager
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage dataPackage,
      org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManager dataManager );
}
