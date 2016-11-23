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
