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

package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * DataValue object instance interface. A data value is an instance with no identity. In the metamodel, DataValue is a
 * child of Instance that cannot change its state, i.e. all operations that are applicable to it are pure functions or
 * queries that do not cause any side effects. DataValues are typically used as attribute values. Since it is not
 * possible to differentiate between two data values that app ear to be the same, it becomes more of a philosophical
 * issue whether ther e are several data values representing the same value or just one for each value. In addition, a
 * data value cannot change its data type and it does no t have contained instances.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataValue extends org.pentaho.pms.cwm.pentaho.meta.instance.CwmInstance {
  /**
   * Returns the value of attribute value. A string representation of the value.
   * 
   * @return Value of attribute value.
   */
  public java.lang.String getValue();

  /**
   * Sets the value of value attribute. See {@link #getValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setValue( java.lang.String newValue );
}
