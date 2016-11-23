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
 * ExpressionNode object instance interface. All node types within an expression are derived from the ExpressionNode
 * type. An expression is stored as a collection of instances of the subtypes of ExpressionNode arranged in a
 * hierarchical fashion. The ExpressionNode instan ce at the top (or ?root?) of the hierarchy represents the value of
 * the ex pression and serves as a starting point for expression evaluation. Refer to the descriptions of the subtypes
 * of ExpressionNode (ElementNode, Const antNode, and FeatureNode) for additional information about the representat ion
 * of expressions. One important purpose for providing storage of expressions as a general feature of the CWM is to
 * promote sharing them between tools and to provide a means for recording lineage relationships between components
 * within expr essions. Specific details of the implementation of expression operators a re left to the implementing
 * tools. When ExpressionNode is used as the type of an Attribute, an instance of the Attribute can contain either an
 * expression tree as described here or a t extual representation of the expression in body and language values of in an
 * attribute of type Expression (defined ObjectModel). The expression at tribute is provided for the latter usage. To
 * obtain CWM?s sharing and lin eage tracking features for elements within an expression, the expression m ust be
 * represented as an expression hierarcy.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmExpressionNode extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of attribute expression. Contains a textual representation of the expression relevant for this
   * ExpressionNode instance.
   * 
   * @return Value of attribute expression.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression getExpression();

  /**
   * Sets the value of expression attribute. See {@link #getExpression} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setExpression( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression newValue );

  /**
   * Returns the value of reference featureNode.
   * 
   * @return Value of reference featureNode.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmFeatureNode getFeatureNode();

  /**
   * Sets the value of reference featureNode. See {@link #getFeatureNode} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFeatureNode( org.pentaho.pms.cwm.pentaho.meta.expressions.CwmFeatureNode newValue );

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
