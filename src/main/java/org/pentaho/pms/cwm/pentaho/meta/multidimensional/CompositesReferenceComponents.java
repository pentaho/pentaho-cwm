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

package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * CompositesReferenceComponents association proxy interface. A Dimension may reference other instances of Dimension in
 * order to derive more complex dimensional structures.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CompositesReferenceComponents extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param composite
   *          Value of the first association end.
   * @param component
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension composite,
      org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension component );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param component
   *          Required value of the second association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getComposite( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension component );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param composite
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getComponent( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension composite );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param composite
   *          Value of the first association end.
   * @param component
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension composite,
      org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension component );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param composite
   *          Value of the first association end.
   * @param component
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension composite,
      org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension component );
}
