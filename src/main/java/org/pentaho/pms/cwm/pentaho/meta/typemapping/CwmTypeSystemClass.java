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


package org.pentaho.pms.cwm.pentaho.meta.typemapping;

/**
 * TypeSystem class proxy interface. Instances of the TypeSystem class collect together the data types (subclasses of
 * Classifier) defined by a software system and the TypeMapping instances defining how they are mapped to data types in
 * other TypeSystems. TypeMapping instances collected by a TypeSystem instance include both those in which the software
 * system?s data types act as sources and as targets of mappings. Classifiers and TapeMappings are maintained in a
 * single collection via the ElementOwnership association but can be distinguished by their respective types. Because it
 * is a Package, a TypeSystem can also serve to collect together the C lassifier instances for a particular software
 * system.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTypeSystemClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTypeSystem createCwmTypeSystem();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param version
   *          A string describing the version identification of the type system represented.
   * @return The created instance object.
   */
  public CwmTypeSystem createCwmTypeSystem( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String version );
}
