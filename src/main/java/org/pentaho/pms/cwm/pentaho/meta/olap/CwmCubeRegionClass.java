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
 * CubeRegion class proxy interface. CubeRegion models a sub-unit of a Cube of the same dimensionality as the Cube
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
public interface CwmCubeRegionClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmCubeRegion createCwmCubeRegion();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param isReadOnly
   *          If true, then the CubeRegion content is read-only (i.e., may not be written or updated through the
   *          CubeRegion -- e.g., a CubeRegion implemented via an SQL view may not permit updates to the underlying base
   *          table).
   * @param isFullyRealized
   *          If true, then this CubeRegion has a direct physical realization and is not bound by any MemberSelections.
   * @return The created instance object.
   */
  public CwmCubeRegion createCwmCubeRegion( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract, boolean isReadOnly,
      boolean isFullyRealized );
}
