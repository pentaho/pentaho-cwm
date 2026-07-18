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
 * IndexedFeatureInfo association proxy interface. The IndexedFeatureInfo association connects an Index instance to
 * information about how the StructuralFeature instances that are constituents of the Index?s key are used by the Index.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface IndexedFeatureInfo extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param index
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param indexedFeature
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex getIndex(
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param index
   *          Required value of the first association end.
   * @return List of related objects.
   */
  public java.util.List getIndexedFeature( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param index
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param index
   *          Value of the first association end.
   * @param indexedFeature
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeature indexedFeature );
}
