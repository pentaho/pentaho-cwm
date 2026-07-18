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
 * LevelBasedHierarchy object instance interface. A LevelBasedHierarchy is a hierarchy that describes relationships
 * between specific levels of a Dimension. LevelBasedHierarchy can be used to model to "pure level" hierarchies (e.g.,
 * dimension-level tables) and "mixed" hierarchies (i.e., levels + linked nodes).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmLevelBasedHierarchy extends org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy {
  /**
   * Returns the value of reference hierarchyLevelAssociation.
   * 
   * @return Value of reference hierarchyLevelAssociation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation}
   */
  public java.util.List
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation> */getHierarchyLevelAssociation();
}
