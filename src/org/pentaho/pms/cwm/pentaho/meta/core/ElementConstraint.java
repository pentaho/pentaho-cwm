/*
 * Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
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

package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * ElementConstraint association proxy interface. The ElementConstraint association provides linkages between
 * ModelElements and the Constraint instances that constrain their state. Note that a Constraint instance may not
 * simultaneously participate in both the ElementConstraint and the StereotypeConstraint associations.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface ElementConstraint extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param constrainedElement
   *          Value of the first association end.
   * @param constraint
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement constrainedElement,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint constraint );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param constraint
   *          Required value of the second association end.
   * @return List of related objects.
   */
  public java.util.List getConstrainedElement( org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint constraint );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param constrainedElement
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getConstraint( org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement constrainedElement );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param constrainedElement
   *          Value of the first association end.
   * @param constraint
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement constrainedElement,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint constraint );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param constrainedElement
   *          Value of the first association end.
   * @param constraint
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement constrainedElement,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint constraint );
}
