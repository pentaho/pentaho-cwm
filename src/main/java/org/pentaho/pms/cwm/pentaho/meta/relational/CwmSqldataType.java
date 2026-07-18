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
 * SQLDataType object instance interface. A SQLDataType is used to reference any datatype associated with a column
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqldataType extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier {
  /**
   * Returns the value of attribute typeNumber. The number assigned to the datatype by the owning RDBMS
   * 
   * @return Value of attribute typeNumber.
   */
  public java.lang.Integer getTypeNumber();

  /**
   * Sets the value of typeNumber attribute. See {@link #getTypeNumber} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTypeNumber( java.lang.Integer newValue );
}
