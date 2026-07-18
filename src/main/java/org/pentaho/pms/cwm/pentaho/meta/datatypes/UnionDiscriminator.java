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


package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * UnionDiscriminator association proxy interface. The UnionDiscriminator association connects a Union instance with the
 * StructuralFeature instance that can be used to determine which UnionMember instance is currently present in the Union
 * instance. This "discriminating" attribute may be a feature of the UnionMembers themselves or may be a feature of some
 * Classifier that contains the Union instance as one of its Features. In the former case, the discriminating feature
 * will usually be present at the same offset in each UnionMember in stance. If the discriminator reference is empty for
 * a particular Union instance , it is considered to be an "undiscriminated" Union and determination of the current
 * UnionMember residing in the Union is usage-defined.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface UnionDiscriminator extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param discriminator
   *          Value of the first association end.
   * @param discriminatedUnion
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature discriminator,
      org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnion discriminatedUnion );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param discriminatedUnion
   *          Required value of the second association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature getDiscriminator(
      org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnion discriminatedUnion );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param discriminator
   *          Required value of the first association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getDiscriminatedUnion(
      org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature discriminator );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param discriminator
   *          Value of the first association end.
   * @param discriminatedUnion
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature discriminator,
      org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnion discriminatedUnion );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param discriminator
   *          Value of the first association end.
   * @param discriminatedUnion
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature discriminator,
      org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnion discriminatedUnion );
}
