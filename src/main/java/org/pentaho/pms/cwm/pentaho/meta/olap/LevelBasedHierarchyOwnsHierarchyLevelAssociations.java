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


package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * LevelBasedHierarchyOwnsHierarchyLevelAssociations association proxy interface. A LevelBasedHierarchy generally owns
 * one or more HierarchyLevelAssociations.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface LevelBasedHierarchyOwnsHierarchyLevelAssociations extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param levelBasedHierarchy
   *          Value of the first association end.
   * @param hierarchyLevelAssociation
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy levelBasedHierarchy,
      org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation hierarchyLevelAssociation );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param hierarchyLevelAssociation
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy getLevelBasedHierarchy(
      org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation hierarchyLevelAssociation );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param levelBasedHierarchy
   *          Required value of the first association end.
   * @return List of related objects.
   */
  public java.util.List getHierarchyLevelAssociation(
      org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy levelBasedHierarchy );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param levelBasedHierarchy
   *          Value of the first association end.
   * @param hierarchyLevelAssociation
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy levelBasedHierarchy,
      org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation hierarchyLevelAssociation );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param levelBasedHierarchy
   *          Value of the first association end.
   * @param hierarchyLevelAssociation
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy levelBasedHierarchy,
      org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation hierarchyLevelAssociation );
}
