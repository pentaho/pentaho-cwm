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
 * Stereotype object instance interface. The stereotype concept provides a way of branding (classifying) model elements
 * so that they behave as if they were instances of new virtual metamodel constructs. These model elements have the same
 * structure (attributes, associations, operations) as similar non-stereotyped model elements of the same kind. The
 * stereotype may specify additional constraints and required tagged values that apply to model elements. In addition, a
 * stereotype may be used to indicate a difference in meaning or usage between two model elements with identical
 * structure. In the metamodel the Stereotype metaclass is a subclass of ModelElement. Tagged Values and Constraints
 * attached to a Stereotype apply to all ModelElem ents branded by that Stereotype. A stereotype keeps track of the base
 * class to which it may be applied. The base class is a class in the metamodel (not a user-level modeling element) such
 * as Class, Association, etc. If a model element is branded by an attached stereo type, then the CWM base class of the
 * model element must be the base clas s specified by the stereotype or one of the subclasses of that base class.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmStereotype extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute baseClass. Specifies the name of a modeling element to which the stereotype applies,
   * such as Class, Association, Constraint, etc. This is the name of a metaclass, that is, a class from the metamodel
   * itself rather than a user model class.
   * 
   * @return Value of attribute baseClass.
   */
  public java.lang.String getBaseClass();

  /**
   * Sets the value of baseClass attribute. See {@link #getBaseClass} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBaseClass( java.lang.String newValue );

  /**
   * Returns the value of reference extendedElement.
   * 
   * @return Value of reference extendedElement. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getExtendedElement();

  /**
   * Returns the value of reference requiredTag.
   * 
   * @return Value of reference requiredTag. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmTaggedValue}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmTaggedValue> */getRequiredTag();

  /**
   * Returns the value of reference stereotypeConstraint.
   * 
   * @return Value of reference stereotypeConstraint. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint> */getStereotypeConstraint();
}
