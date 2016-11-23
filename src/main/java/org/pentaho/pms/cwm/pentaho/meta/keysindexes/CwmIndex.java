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
 * Index object instance interface. Instances of the Index class represent the ordering of the instances of some other
 * Class, and the Index is said to "span" the Class. Indexes normally have an ordered set of attributes of the Class
 * instance they span that make up the "key" of the index; this set of relationships is represented by the
 * IndexedFeature class that indicates how the attributes are used by the Index instance. The Index class is intended
 * primarily as a starting point for tools that require the notion of an index.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmIndex extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute isPartitioning. If True, this Index instance is used as a partitioning index.
   * 
   * @return Value of attribute isPartitioning.
   */
  public boolean isPartitioning();

  /**
   * Sets the value of isPartitioning attribute. See {@link #isPartitioning} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPartitioning( boolean newValue );

  /**
   * Returns the value of attribute isSorted. If True, the Index instance is maintained in a sorted order.
   * 
   * @return Value of attribute isSorted.
   */
  public boolean isSorted();

  /**
   * Sets the value of isSorted attribute. See {@link #isSorted} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSorted( boolean newValue );

  /**
   * Returns the value of attribute isUnique. The isUnique attribute is True if the Index instance guarantees all of its
   * instances have a unique key value.
   * 
   * @return Value of attribute isUnique.
   */
  public boolean isUnique();

  /**
   * Sets the value of isUnique attribute. See {@link #isUnique} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setUnique( boolean newValue );

  /**
   * Returns the value of reference indexedFeature.
   * 
   * @return Value of reference indexedFeature. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature> */getIndexedFeature();

  /**
   * Returns the value of reference spannedClass.
   * 
   * @return Value of reference spannedClass.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClass getSpannedClass();

  /**
   * Sets the value of reference spannedClass. See {@link #getSpannedClass} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSpannedClass( org.pentaho.pms.cwm.pentaho.meta.core.CwmClass newValue );
}
