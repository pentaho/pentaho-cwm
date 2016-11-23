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
 * DataSlot object instance interface. A Slot which is used to hold a data value where there is no need to manage the
 * value as an element in its own right (in which case a DataValue would be used) - for example it is a one-off string
 * value or a number. The dataValue (and dataType where set) must be consistent with the type of the DataSlot's feature
 * (Attribute) and must obey any constraints on the full descriptor of the Attribute's DataType (including both explicit
 * constraints and built-in constraints such as multiplicity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataSlot extends org.pentaho.pms.cwm.pentaho.meta.instance.CwmSlot {
  /**
   * Returns the value of attribute dataValue. The value for the slot expressed as a string.
   * 
   * @return Value of attribute dataValue.
   */
  public java.lang.String getDataValue();

  /**
   * Sets the value of dataValue attribute. See {@link #getDataValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDataValue( java.lang.String newValue );

  /**
   * Returns the value of reference dataType.
   * 
   * @return Value of reference dataType.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmDataType getDataType();

  /**
   * Sets the value of reference dataType. See {@link #getDataType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDataType( org.pentaho.pms.cwm.pentaho.meta.core.CwmDataType newValue );
}
