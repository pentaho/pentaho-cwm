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
 * IndexSpansClass association proxy interface. Associates indexes with the classes they span. This relationship is
 * separate from the ownership of indexes, to allow modeling of systems where an index is NOT owned by the object it
 * spans. In most situations, however, the spanned and owning Class instances will be the same.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface IndexSpansClass extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param spannedClass
   *          Value of the first association end.
   * @param index
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmClass spannedClass,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param index
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClass getSpannedClass(
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param spannedClass
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getIndex( org.pentaho.pms.cwm.pentaho.meta.core.CwmClass spannedClass );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param spannedClass
   *          Value of the first association end.
   * @param index
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmClass spannedClass,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param spannedClass
   *          Value of the first association end.
   * @param index
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmClass spannedClass,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndex index );
}
