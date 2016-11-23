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

package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * TypeAlias object instance interface. The TypeAlias class is intended to provide a renaming capability for Classifier
 * instances. This class is required to support situations in which creation of an alias for a class effectively creates
 * a new class. For example, CORBA IDL type aliases have different typeCodes than their base types and are therefore
 * treated as distinct types.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTypeAlias extends org.pentaho.pms.cwm.pentaho.meta.core.CwmDataType {
  /**
   * Returns the value of reference type.
   * 
   * @return Value of reference type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getType();

  /**
   * Sets the value of reference type. See {@link #getType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
