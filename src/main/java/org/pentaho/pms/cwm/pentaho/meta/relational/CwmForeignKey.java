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
 * ForeignKey object instance interface. A Foreign Key associates columns from one table with columns of another table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmForeignKey extends org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship {
  /**
   * Returns the value of attribute deleteRule. An enumerated type. Indicates the disposition of the data records
   * containing the foreign key value when the record of the matching primary key is deleted.
   * 
   * @return Value of attribute deleteRule.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType getDeleteRule();

  /**
   * Sets the value of deleteRule attribute. See {@link #getDeleteRule} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDeleteRule( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType newValue );

  /**
   * Returns the value of attribute updateRule. Same as deleteRule for updates of the primary key data record
   * 
   * @return Value of attribute updateRule.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType getUpdateRule();

  /**
   * Sets the value of updateRule attribute. See {@link #getUpdateRule} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setUpdateRule( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ReferentialRuleType newValue );

  /**
   * Returns the value of attribute deferrability. Indicates if the validity of the ForeignKey is to be tested at each
   * statement or at the end of a transaction.
   * 
   * @return Value of attribute deferrability.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.DeferrabilityType getDeferrability();

  /**
   * Sets the value of deferrability attribute. See {@link #getDeferrability} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDeferrability( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.DeferrabilityType newValue );
}
