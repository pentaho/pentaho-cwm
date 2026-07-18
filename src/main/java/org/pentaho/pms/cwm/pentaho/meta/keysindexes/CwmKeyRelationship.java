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
