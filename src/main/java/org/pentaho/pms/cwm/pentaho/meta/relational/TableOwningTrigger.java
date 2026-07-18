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


package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * TableOwningTrigger association proxy interface. Associates a Table with its Triggers. The Trigger will be activated
 * when an action is performed on the Table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface TableOwningTrigger extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param table
   *          Value of the first association end.
   * @param trigger
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable table,
      org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger trigger );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param trigger
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable getTable(
      org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger trigger );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param table
   *          Required value of the first association end.
   * @return List of related objects.
   */
  public java.util.List getTrigger( org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable table );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param table
   *          Value of the first association end.
   * @param trigger
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable table,
      org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger trigger );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param table
   *          Value of the first association end.
   * @param trigger
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable table,
      org.pentaho.pms.cwm.pentaho.meta.relational.CwmTrigger trigger );
}
