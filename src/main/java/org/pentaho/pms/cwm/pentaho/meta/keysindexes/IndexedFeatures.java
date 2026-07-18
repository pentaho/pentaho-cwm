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
 * IndexedFeatures association proxy interface. The IndexedFeatures association links StructuralFeature instances to
 * information about how they participate in the keys of Index instances.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface IndexedFeatures extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param feature
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature feature,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param indexedFeature
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature getFeature(
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param feature
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getIndexedFeature( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature feature );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param feature
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature feature,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param feature
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature feature,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );
}
