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
 * Level object instance interface. Level is a subclass of MemberSelection that assigns each member of a Dimension to a
 * specific hierarchical level within the Dimension.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmLevel extends org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelection {
  /**
   * Returns the value of reference hierarchyLevelAssociation.
   * 
   * @return Value of reference hierarchyLevelAssociation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation> */getHierarchyLevelAssociation();
}
