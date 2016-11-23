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
 * FeatureNode class proxy interface. The FeatureNode class represents ExpressionNode instances that are features (i.e.,
 * attributes or operations) of some Classifier instance within the CWM. A FeatureNode with a null OperationArgument
 * association represents either a parameter-less operation or an attribute value obtained from some Struct uralFeature
 * instance.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmFeatureNodeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmFeatureNode createCwmFeatureNode();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param expression
   *          Contains a textual representation of the expression relevant for this ExpressionNode instance.
   * @return The created instance object.
   */
  public CwmFeatureNode createCwmFeatureNode( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression expression );
}
