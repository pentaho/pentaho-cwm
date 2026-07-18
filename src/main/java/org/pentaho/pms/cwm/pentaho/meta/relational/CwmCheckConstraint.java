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
 * CheckConstraint object instance interface. A rule that specifies the values allowed in one or more columns of every
 * row of a table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCheckConstraint extends org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint {
  /**
   * Returns the value of attribute deferrability. Indicates the timing of the constraint enforcement during
   * multiple-user updates.
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
