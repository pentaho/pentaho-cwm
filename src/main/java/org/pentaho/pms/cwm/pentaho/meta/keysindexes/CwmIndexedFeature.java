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
