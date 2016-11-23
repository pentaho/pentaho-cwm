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

package org.pentaho.pms.cwm.pentaho.meta.keysindexes;

/**
 * KeyRelationship object instance interface. KeyRelationship instances represent relationships between UniqueKey
 * instances and the Class(es) that reference them. This class is intended as a starting point for the creation of
 * "foreign key" and other associative relationships.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmKeyRelationship extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature> */getFeature();

  /**
   * Returns the value of reference uniqueKey.
   * 
   * @return Value of reference uniqueKey.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey getUniqueKey();

  /**
   * Sets the value of reference uniqueKey. See {@link #getUniqueKey} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setUniqueKey( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey newValue );
}
