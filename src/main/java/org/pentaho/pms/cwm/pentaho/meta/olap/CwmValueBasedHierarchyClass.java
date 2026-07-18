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
 * ValueBasedHierarchy class proxy interface. ValueBasedHierarchy is a subclass of Hierarchy that ranks Dimension
 * members according to their relative distance from the root. Each member of a ValueBasedHierarchy has a specific
 * "metric" or "value" associated with it. ValueBasedHierarchy is used to model pure "linked node" hierarchies (e.g., p
 * arent-child tables).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmValueBasedHierarchyClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmValueBasedHierarchy createCwmValueBasedHierarchy();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @return The created instance object.
   */
  public CwmValueBasedHierarchy createCwmValueBasedHierarchy( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract );
}
