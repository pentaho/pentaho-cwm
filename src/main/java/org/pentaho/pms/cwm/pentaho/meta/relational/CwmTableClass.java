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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * Table class proxy interface. A materialized NamedColumnSet.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTableClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTable createCwmTable();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param isTemporary
   *          Indicates that the table content is temporary. SQL92 standards provide two types of temporary tables
   *          (local Temporary and Global Temporary). However, RDBMS products have implemented variations on this theme.
   *          It is recommended that the product manufacturers provide specific temporary information (besides the
   *          temporaryScope attribute) in their extensions.
   * @param temporaryScope
   *          This attribute is meaningful only when the isTemporary flag is True [C-1]. The scope indicates when the
   *          data of this table are available. "SESSION", "APPLICATION" are examples of possible values. Look at the
   *          Scope attribute for Global Temporary tables in the SQL standards for more details.
   * @param isSystem
   *          Indicates that the Table is a System Table (generally part of or view on the system catalog).
   * @return The created instance object.
   */
  public CwmTable createCwmTable( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract, boolean isTemporary,
      java.lang.String temporaryScope, boolean isSystem );
}
