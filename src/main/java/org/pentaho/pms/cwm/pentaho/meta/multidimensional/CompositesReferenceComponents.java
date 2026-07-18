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
