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
