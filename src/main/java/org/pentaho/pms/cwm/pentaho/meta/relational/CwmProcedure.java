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
 * Procedure object instance interface. This class describes Relational DBMS Stored procedures and functions.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmProcedure extends org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmMethod {
  /**
   * Returns the value of attribute type. A Procedure can be either a Function or a true Procedure. This indicates
   * whether this object returns a value or not.
   * 
   * @return Value of attribute type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ProcedureType getType();

  /**
   * Sets the value of type attribute. See {@link #getType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ProcedureType newValue );
}
