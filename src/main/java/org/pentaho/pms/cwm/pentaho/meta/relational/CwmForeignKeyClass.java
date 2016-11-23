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
 * ForeignKey class proxy interface. A Foreign Key associates columns from one table with columns of another table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmForeignKeyClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmForeignKey createCwmForeignKey();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param deleteRule
   *          An enumerated type. Indicates the disposition of the data records containing the foreign key value when
   *          the record of the matching primary key is deleted.
   * @param updateRule
   *          Same as deleteRule for updates of the primary key data record
   * @param deferrability
   *          Indicates if the validity of the ForeignKey is to be tested at each statement or at the end of a
   *          transaction.
   * @return The created instance object.
   */
  public CwmForeignKey createCwmForeignKey( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType deleteRule,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType updateRule,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.DeferrabilityType deferrability );
}
