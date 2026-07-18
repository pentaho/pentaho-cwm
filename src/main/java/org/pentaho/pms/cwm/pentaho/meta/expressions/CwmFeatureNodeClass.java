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
