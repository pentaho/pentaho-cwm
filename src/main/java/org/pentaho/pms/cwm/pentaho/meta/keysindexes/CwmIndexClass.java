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
 * Index class proxy interface. Instances of the Index class represent the ordering of the instances of some other
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
public interface CwmIndexClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmIndex createCwmIndex();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isPartitioning
   *          If True, this Index instance is used as a partitioning index.
   * @param isSorted
   *          If True, the Index instance is maintained in a sorted order.
   * @param isUnique
   *          The isUnique attribute is True if the Index instance guarantees all of its instances have a unique key
   *          value.
   * @return The created instance object.
   */
  public CwmIndex createCwmIndex( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isPartitioning, boolean isSorted,
      boolean isUnique );
}
