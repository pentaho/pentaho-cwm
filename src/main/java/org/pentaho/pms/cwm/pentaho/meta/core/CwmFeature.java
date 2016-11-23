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
 * Feature object instance interface. A feature is a property, like attribute or operation, which is encapsulated within
 * a Classifier. In the metamodel, a Feature declares a structural or behavioral characterist ic of an instance of a
 * Classifier or of the Classifier itself. Feature i s an abstract metaclass.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmFeature extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute ownerScope. Specifies whether the Feature appears in every instance of the
   * Classifier or whether it appears only once for the entire Classifier.
   * 
   * @return Value of attribute ownerScope.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind getOwnerScope();

  /**
   * Sets the value of ownerScope attribute. See {@link #getOwnerScope} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOwnerScope( org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind newValue );

  /**
   * Returns the value of reference owner.
   * 
   * @return Value of reference owner.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getOwner();

  /**
   * Sets the value of reference owner. See {@link #getOwner} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOwner( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
