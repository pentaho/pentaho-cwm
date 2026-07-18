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
 * MemberSelectionGroup object instance interface. MemberSelectionGroup enables the grouping together of
 * semantically-related MemberSelections.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMemberSelectionGroup extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference memberSelection.
   * 
   * @return Value of reference memberSelection. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelection}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelection> */getMemberSelection();

  /**
   * Returns the value of reference cubeRegion.
   * 
   * @return Value of reference cubeRegion.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion getCubeRegion();

  /**
   * Sets the value of reference cubeRegion. See {@link #getCubeRegion} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCubeRegion( org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion newValue );
}
