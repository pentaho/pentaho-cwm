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

package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * HierarchyLevelAssociation object instance interface. HierarchyLevelAssociation is a class that orders Levels within a
 * LevelBasedHierarchy, and provides a means of mapping Level/Hierarchy-oriented Dimension attributes to one or more
 * physical deployments. The relative ordering of DimensionDeployment classes optionally implies a desired orde r of
 * selection of DimensionDeployments, based on implementation-specific consid erations (e.g., optimized access of
 * aggregate data).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmHierarchyLevelAssociation extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference levelBasedHierarchy.
   * 
   * @return Value of reference levelBasedHierarchy.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy getLevelBasedHierarchy();

  /**
   * Sets the value of reference levelBasedHierarchy. See {@link #getLevelBasedHierarchy} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLevelBasedHierarchy( org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchy newValue );

  /**
   * Returns the value of reference currentLevel.
   * 
   * @return Value of reference currentLevel.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevel getCurrentLevel();

  /**
   * Sets the value of reference currentLevel. See {@link #getCurrentLevel} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCurrentLevel( org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevel newValue );

  /**
   * Returns the value of reference dimensionDeployment.
   * 
   * @return Value of reference dimensionDeployment. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment> */getDimensionDeployment();
}
