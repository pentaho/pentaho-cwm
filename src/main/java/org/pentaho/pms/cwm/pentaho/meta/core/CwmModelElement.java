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
 * ModelElement object instance interface. A model element is an element that is an abstraction drawn from the system
 * being modeled. In the metamodel, a ModelElement is a named entity in a Model. It is the ba se for all modeling
 * metaclasses in the CWM. All other modeling metaclass es are either direct or indirect subclasses of ModelElement.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmModelElement extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of attribute name. An identifier for the ModelElement within its containing Namespace.
   * 
   * @return Value of attribute name.
   */
  public java.lang.String getName();

  /**
   * Sets the value of name attribute. See {@link #getName} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setName( java.lang.String newValue );

  /**
   * Returns the value of attribute visibility. Specifies extent of the visibility of the ModelElement within its owning
   * Namespace.
   * 
   * @return Value of attribute visibility.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind getVisibility();

  /**
   * Sets the value of visibility attribute. See {@link #getVisibility} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setVisibility( org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind newValue );

  /**
   * Returns the value of reference clientDependency.
   * 
   * @return Value of reference clientDependency. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency> */getClientDependency();

  /**
   * Returns the value of reference constraint.
   * 
   * @return Value of reference constraint. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint> */getConstraint();

  /**
   * Returns the value of reference importer.
   * 
   * @return Value of reference importer. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage> */getImporter();

  /**
   * Returns the value of reference namespace.
   * 
   * @return Value of reference namespace.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace getNamespace();

  /**
   * Sets the value of reference namespace. See {@link #getNamespace} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setNamespace( org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace newValue );

  /**
   * Returns the value of reference taggedValue.
   * 
   * @return Value of reference taggedValue. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmTaggedValue}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmTaggedValue> */getTaggedValue();
}
