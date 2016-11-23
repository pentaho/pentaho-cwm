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
 * CubeRegion object instance interface. CubeRegion models a sub-unit of a Cube of the same dimensionality as the Cube
 * itself, with each Dimension optionally subsetted in its list of members. When mapped to its physical source, a
 * CubeRegion contains data cells iden tified by the member combinations of the Cartesian product of the CubeRegion's
 * associated Dimensions and Measures. The relative ordering of CubeDeployment classes optionally implies a desi red
 * order of selection of the CubeDeployments, based on implementation-specific considerations (e.g., optimized access of
 * aggregate data). Synonyms: Sub-Cube, Partition, Slice, Region, Area. Misc. notes: 1. A CubeRegion is not a Cube, and
 * a Cube is not a CubeRegion. 2. A Cube has a Measure and CubeRegion may have a corresponding measure (Measures are
 * Attributes). 3. A Cube may or may not have CubeRegions. 4. If a Cube does not have a CubeRegion, then it's not
 * physically mapped (it's virtual). All physical mapping is based on the CubeRegion , not the Cub e.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCubeRegion extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of attribute isReadOnly. If true, then the CubeRegion content is read-only (i.e., may not be
   * written or updated through the CubeRegion -- e.g., a CubeRegion implemented via an SQL view may not permit updates
   * to the underlying base table).
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
   * Returns the value of attribute isFullyRealized. If true, then this CubeRegion has a direct physical realization and
   * is not bound by any MemberSelections.
   * 
   * @return Value of attribute isFullyRealized.
   */
  public boolean isFullyRealized();

  /**
   * Sets the value of isFullyRealized attribute. See {@link #isFullyRealized} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFullyRealized( boolean newValue );

  /**
   * Returns the value of reference memberSelectionGroup.
   * 
   * @return Value of reference memberSelectionGroup. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelectionGroup}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelectionGroup> */getMemberSelectionGroup();

  /**
   * Returns the value of reference cube.
   * 
   * @return Value of reference cube.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCube getCube();

  /**
   * Sets the value of reference cube. See {@link #getCube} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCube( org.pentaho.pms.cwm.pentaho.meta.olap.CwmCube newValue );

  /**
   * Returns the value of reference cubeDeployment.
   * 
   * @return Value of reference cubeDeployment. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeployment> */getCubeDeployment();
}
