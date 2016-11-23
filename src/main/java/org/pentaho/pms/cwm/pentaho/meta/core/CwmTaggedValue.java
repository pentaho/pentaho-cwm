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
 * TaggedValue object instance interface. A tagged value allows information to be attached to any model element in the
 * form of a "tagged value" pair (i.e., name = value). The interpretation of tagged value semantics is intentionally
 * beyond the scope of CWM. It must be determined by user or tool conventions. It is expected that tools will define
 * tags to supply information needed for their operations beyond the basic semantics of CWM. Such information could
 * include code generation options, model management information, or user-specified semantics. Even though TaggedValues
 * are a simple and straightforward extension techn ique, their use restricts semantic interchange of metadata to only
 * those to ols that share a common understanding of the specific tagged value name s.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTaggedValue extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of attribute tag. Contains the name of the TaggedValue. This name determines the semantics that
   * are applicable to the contents of the value attribute.
   * 
   * @return Value of attribute tag.
   */
  public java.lang.String getTag();

  /**
   * Sets the value of tag attribute. See {@link #getTag} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTag( java.lang.String newValue );

  /**
   * Returns the value of attribute value. Contains the current value of the TaggedValue.
   * 
   * @return Value of attribute value.
   */
  public java.lang.String getValue();

  /**
   * Sets the value of value attribute. See {@link #getValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setValue( java.lang.String newValue );

  /**
   * Returns the value of reference modelElement.
   * 
   * @return Value of reference modelElement.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement getModelElement();

  /**
   * Sets the value of reference modelElement. See {@link #getModelElement} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setModelElement( org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement newValue );

  /**
   * Returns the value of reference stereotype.
   * 
   * @return Value of reference stereotype.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStereotype getStereotype();

  /**
   * Sets the value of reference stereotype. See {@link #getStereotype} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setStereotype( org.pentaho.pms.cwm.pentaho.meta.core.CwmStereotype newValue );
}
