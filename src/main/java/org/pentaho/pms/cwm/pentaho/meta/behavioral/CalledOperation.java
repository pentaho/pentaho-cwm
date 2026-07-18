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


package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * CalledOperation association proxy interface. The CalledOperation association identifies the CallAction instance
 * representing a particular invocation of an Operation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CalledOperation extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param callAction
   *          Value of the first association end.
   * @param operation
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction callAction,
      org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation operation );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param operation
   *          Required value of the second association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getCallAction( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation operation );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param callAction
   *          Required value of the first association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation getOperation(
      org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction callAction );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param callAction
   *          Value of the first association end.
   * @param operation
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction callAction,
      org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation operation );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param callAction
   *          Value of the first association end.
   * @param operation
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction callAction,
      org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation operation );
}
