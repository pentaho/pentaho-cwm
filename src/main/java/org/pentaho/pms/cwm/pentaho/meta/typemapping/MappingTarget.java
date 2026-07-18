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


package org.pentaho.pms.cwm.pentaho.meta.typemapping;

/**
 * MappingTarget association proxy interface. The MappingTarget association indicates the exposed data type for a
 * particular TypeMapping instance.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface MappingTarget extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param targetType
   *          Value of the first association end.
   * @param mappingTo
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier targetType,
      org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeMapping mappingTo );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param mappingTo
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getTargetType(
      org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeMapping mappingTo );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param targetType
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getMappingTo( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier targetType );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param targetType
   *          Value of the first association end.
   * @param mappingTo
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier targetType,
      org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeMapping mappingTo );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param targetType
   *          Value of the first association end.
   * @param mappingTo
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier targetType,
      org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeMapping mappingTo );
}
