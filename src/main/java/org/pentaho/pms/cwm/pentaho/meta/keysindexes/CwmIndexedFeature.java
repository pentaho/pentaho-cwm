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
 * IndexedFeature object instance interface. Instances of the IndexedFeature class map StructuralFeature instances of
 * the spanned Class instance to the Index instances that employ them as (part of) their key. Attributes of
 * IndexedFeature instances indicate how specific StructuralFeature instance are used in Index keys.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmIndexedFeature extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute isAscending. The isAscending attribute is true if the feature is sorted in ascending
   * order and false, if descending order.
   * 
   * @return Value of attribute isAscending.
   */
  public java.lang.Boolean isAscending();

  /**
   * Sets the value of isAscending attribute. See {@link #isAscending} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setAscending( java.lang.Boolean newValue );

  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature getFeature();

  /**
   * Sets the value of reference feature. See {@link #getFeature} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFeature( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature newValue );

  /**
   * Returns the value of reference index.
   * 
   * @return Value of reference index.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex getIndex();

  /**
   * Sets the value of reference index. See {@link #getIndex} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setIndex( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex newValue );
}
