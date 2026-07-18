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


package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * Attribute object instance interface. An Attribute describes a named slot within a classifier that may hold a value.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmAttribute extends org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature {
  /**
   * Returns the value of attribute initialValue. An Expression specifying the value of the attribute upon
   * initialization. It is meant to be evaluated at the time the object is initialized. (Note that an explicit
   * constructor may supersede an initial value.)
   * 
   * @return Value of attribute initialValue.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression getInitialValue();

  /**
   * Sets the value of initialValue attribute. See {@link #getInitialValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setInitialValue( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression newValue );
}
