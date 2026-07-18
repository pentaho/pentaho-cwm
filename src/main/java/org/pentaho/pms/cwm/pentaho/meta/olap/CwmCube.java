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
 * Cube object instance interface. A Cube is a collection of analytic values (i.e., measures) that share the same
 * dimensionality. This dimensionality is specified by a set of unique Dimensions from the Schema. Each unique
 * combination of members in the Cartesian product of the Cube?s Dimensions identifies precisely one data cell within a
 * multidimensional structure. Synonyms: Multidimensional Array, Hypercube, Hypervolume.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCube extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of attribute isVirtual. If true, then this Cube is a Virtual Cube (i.e., it has no physical
   * realization).
   * 
   * @return Value of attribute isVirtual.
   */
  public boolean isVirtual();

  /**
   * Sets the value of isVirtual attribute. See {@link #isVirtual} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setVirtual( boolean newValue );

  /**
   * Returns the value of reference cubeDimensionAssociation.
   * 
   * @return Value of reference cubeDimensionAssociation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociation> */getCubeDimensionAssociation();

  /**
   * Returns the value of reference cubeRegion.
   * 
   * @return Value of reference cubeRegion. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegion> */getCubeRegion();

  /**
   * Returns the value of reference schema.
   * 
   * @return Value of reference schema.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmSchema getSchema();

  /**
   * Sets the value of reference schema. See {@link #getSchema} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSchema( org.pentaho.pms.cwm.pentaho.meta.olap.CwmSchema newValue );
}
