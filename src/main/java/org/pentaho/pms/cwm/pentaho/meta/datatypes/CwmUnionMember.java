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
 * UnionMember object instance interface. UnionMembers are described as features of a Union and each represents one of
 * the members of a Union. Note, however, that multiple case values can map to a single UnionMember. If isDefault is
 * true, the union member is the default member. UnionMember instances are allowed to have a memberCase and be the
 * default case. UnionMember instances often represent structured storage areas. A particular UnionMember may be
 * associated with a Classifier that describ es its internal structure via the StructuralFeatureType association
 * (defined in the ObjectModel::Core package). For example, the Record::Group class, itself a Classifier, can be used as
 * the type of a UnionMember in a manner co mpletely analogous to how it is used to describe the type of a structured
 * field (see the instance diagrams in the Record metamodel chapter for details).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmUnionMember extends org.pentaho.pms.cwm.pentaho.meta.core.CwmAttribute {
  /**
   * Returns the value of attribute memberCase. Contains the value of the Union?s discriminator for this UnionMember.
   * 
   * @return Value of attribute memberCase.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression getMemberCase();

  /**
   * Sets the value of memberCase attribute. See {@link #getMemberCase} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMemberCase( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression newValue );

  /**
   * Returns the value of attribute isDefault. Indicates if this UnionMember is the default member of the Union
   * (implying that when unstated, the Union?s discriminator would assume this instance?s memberCase value).
   * 
   * @return Value of attribute isDefault.
   */
  public boolean isDefault();

  /**
   * Sets the value of isDefault attribute. See {@link #isDefault} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDefault( boolean newValue );
}
