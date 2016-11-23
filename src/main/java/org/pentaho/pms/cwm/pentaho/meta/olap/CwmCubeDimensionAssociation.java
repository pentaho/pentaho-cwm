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
 * CubeDimensionAssociation object instance interface. CubeDimensionAssociation relates a Cube to the Dimensions that
 * define it. Features relevant to Cube-Dimension relationships (e.g., calcHierarchy) are exposed by this class.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCubeDimensionAssociation extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
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
   * Returns the value of reference calcHierarchy.
   * 
   * @return Value of reference calcHierarchy.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy getCalcHierarchy();

  /**
   * Sets the value of reference calcHierarchy. See {@link #getCalcHierarchy} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCalcHierarchy( org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy newValue );
}
