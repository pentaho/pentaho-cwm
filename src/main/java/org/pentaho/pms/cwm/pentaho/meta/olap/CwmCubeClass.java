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
 * Cube class proxy interface. A Cube is a collection of analytic values (i.e., measures) that share the same
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
public interface CwmCubeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmCube createCwmCube();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param isVirtual
   *          If true, then this Cube is a Virtual Cube (i.e., it has no physical realization).
   * @return The created instance object.
   */
  public CwmCube createCwmCube( java.lang.String name, org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      boolean isAbstract, boolean isVirtual );
}
