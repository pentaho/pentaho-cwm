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

package org.pentaho.pms.cwm.pentaho.meta.expressions;

/**
 * FeatureNode object instance interface. The FeatureNode class represents ExpressionNode instances that are features
 * (i.e., attributes or operations) of some Classifier instance within the CWM. A FeatureNode with a null
 * OperationArgument association represents either a parameter-less operation or an attribute value obtained from some
 * Struct uralFeature instance.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmFeatureNode extends org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode {
  /**
   * Returns the value of reference argument.
   * 
   * @return Value of reference argument. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode> */getArgument();

  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature getFeature();

  /**
   * Sets the value of reference feature. See {@link #getFeature} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFeature( org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature newValue );
}
