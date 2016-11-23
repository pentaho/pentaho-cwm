/*
 * Copyright 2002 - 2016 Pentaho Corporation.  All rights reserved.
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
 * StructuralFeature object instance interface. A structural feature refers to a static feature of a model element. In
 * the metamodel, a StructuralFeature declares a structural aspect of a Classifier that is typed, such as an attribute.
 * For example, it specifies the mu ltiplicity and changeability of the StructuralFeature. StructuralFeature is an a
 * bstract metaclass.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmStructuralFeature extends org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature {
  /**
   * Returns the value of attribute changeability. Specifies whether the value may be modified after the object is
   * created.
   * 
   * @return Value of attribute changeability.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ChangeableKind getChangeability();

  /**
   * Sets the value of changeability attribute. See {@link #getChangeability} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setChangeability( org.pentaho.pms.cwm.pentaho.meta.core.ChangeableKind newValue );

  /**
   * Returns the value of attribute multiplicity. The possible number of data values for the feature that may be held by
   * an instance. The cardinality of the set of values is an implicit part of the feature. In the common case in which
   * the multiplicity is 1..1, then the feature is a scalar (i.e., it holds exactly one value).
   * 
   * @return Value of attribute multiplicity.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicity getMultiplicity();

  /**
   * Sets the value of multiplicity attribute. See {@link #getMultiplicity} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMultiplicity( org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicity newValue );

  /**
   * Returns the value of attribute ordering. Specifies whether the set of instances is ordered. The ordering must be
   * determined and maintained by Operations that add values to the feature. This property is only relevant if the
   * multiplicity is greater than one.
   * 
   * @return Value of attribute ordering.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.OrderingKind getOrdering();

  /**
   * Sets the value of ordering attribute. See {@link #getOrdering} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOrdering( org.pentaho.pms.cwm.pentaho.meta.core.OrderingKind newValue );

  /**
   * Returns the value of attribute targetScope. Specifies whether the targets are ordinary Instances or are
   * Classifiers.
   * 
   * @return Value of attribute targetScope.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind getTargetScope();

  /**
   * Sets the value of targetScope attribute. See {@link #getTargetScope} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTargetScope( org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind newValue );

  /**
   * Returns the value of reference type.
   * 
   * @return Value of reference type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getType();

  /**
   * Sets the value of reference type. See {@link #getType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
