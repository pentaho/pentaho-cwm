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
 * Hierarchy object instance interface. A Hierarchy is an organizational structure that imposes a parent/child ordering
 * on the members of the Dimension, usually to define either a navigational or consolidation/computational paths through
 * the Dimension (i.e., a value associated with a child member is aggregated into one or more parents).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmHierarchy extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference dimension.
   * 
   * @return Value of reference dimension.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimension getDimension();

  /**
   * Sets the value of reference dimension. See {@link #getDimension} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDimension( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimension newValue );

  /**
   * Returns the value of reference cubeDimensionAssociation.
   * 
   * @return Value of reference cubeDimensionAssociation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation> */getCubeDimensionAssociation();

  /**
   * Returns the value of reference defaultedDimension.
   * 
   * @return Value of reference defaultedDimension.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimension getDefaultedDimension();

  /**
   * Sets the value of reference defaultedDimension. See {@link #getDefaultedDimension} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDefaultedDimension( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimension newValue );

  /**
   * Returns the value of reference hierarchyMemberSelectionGroup.
   * 
   * @return Value of reference hierarchyMemberSelectionGroup. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyMemberSelectionGroup}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyMemberSelectionGroup> */getHierarchyMemberSelectionGroup();
}
