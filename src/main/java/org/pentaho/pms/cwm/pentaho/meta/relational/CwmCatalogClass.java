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


package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * Catalog class proxy interface. A Catalog is the unit of logon and identification. It also identifies the scope of SQL
 * statements: the tables contained in a catalog can be used in a single SQL statement.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCatalogClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmCatalog createCwmCatalog();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param defaultCharacterSetName
   *          The name of the default character set used for the values in the column. This field applies only to
   *          columns whose datatype is a character string.
   * @param defaultCollationName
   *          The name of the default collation sequence used to sort the data values in the column.
   * @return The created instance object.
   */
  public CwmCatalog createCwmCatalog( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String defaultCharacterSetName,
      java.lang.String defaultCollationName );
}
