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
 * Expressions package interface. The Expressions package depends on the following packages:
 * org.omg::CWM::ObjectModel::Core The CWM Expressions metamodel provides basic support for the definition of expression
 * trees withi n the CWM. The intent of the Expressions metamodel is to provide a place for other CWM packages (such as
 * Transformation) and CWM compliant tools to record shared expressions in a common form that can be used for interchang
 * e and lineage tracking. The expression concept in the CWM Foundation takes a functional view of expression trees,
 * resulti ng in the ability of relatively few expression types to represent a broa d range of expressions. Every
 * function or traditional mathematical operator that appears in an expression hierarchy is represented as a
 * FeatureNode. F or example, the arithmetic plus operation ?a + b? can be thought of as the function ?sum(a, b).? The
 * semantics of a particular function or operat ion are left to specific tool implementations and are not captured by
 * the CWM . The hierarchical nature of the CWM?s representation of expressions is achieved by the recursive n ature of
 * the OperationArgument association. This association allows the sub-hierarchies within an expression to be treated as
 * actual parameters of t heir parent nodes. OCL Representation of Expressions Constraints [C-5-1] A FeatureNode that
 * has parameters other than the"this" parameter represents a Feature tha t is also an Operation. context FeatureNode
 * inv: if self.feature.ownerScope = #instance then self.argument->size > 1 implies self.feature.oclIsKindOf(Operation)
 * else self.argument->size > 0 implies self.feature.oclIsKindOf(Operation) endif [C-5-2] If the FeatureNode represents
 * an instance-scope feature, the first argument is a "this" o r "self" argument; that is, the object invoking the
 * feature. The convent ion is enforced by checking that the type of the first argument is the same as the type of the
 * feature. context FeatureNode inv: self.feature.ownerScope = #instance implies
 * self.argument->first.type.allFeatures->includes(self.feature) [C-5-3] If the FeatureNode represents a
 * BehavioralFeature, the number of arguments must be equal to the number of the BehavioralFeature?s parameters, plus
 * one for the ?t his? parameter if the BehavioralFeature is of instance scope. context FeatureNode inv:
 * self.feature.oclIsKindOf(BehavioralFeature) implies (if self.feature.ownerScope = #instance then self.argument->size
 * = self.feature.oclAsType(BehavioralFeature).parameters->size + 1 else self.argument->size =
 * self.feature.oclAsType(BehavioralFeature).parameters->size endif)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface ExpressionsPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmExpressionNode class proxy object.
   * 
   * @return CwmExpressionNode class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNodeClass getCwmExpressionNode();

  /**
   * Returns CwmConstantNode class proxy object.
   * 
   * @return CwmConstantNode class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmConstantNodeClass getCwmConstantNode();

  /**
   * Returns CwmElementNode class proxy object.
   * 
   * @return CwmElementNode class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmElementNodeClass getCwmElementNode();

  /**
   * Returns CwmFeatureNode class proxy object.
   * 
   * @return CwmFeatureNode class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmFeatureNodeClass getCwmFeatureNode();

  /**
   * Returns ExpressionNodeClassifier association proxy object.
   * 
   * @return ExpressionNodeClassifier association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.ExpressionNodeClassifier getExpressionNodeClassifier();

  /**
   * Returns NodeFeature association proxy object.
   * 
   * @return NodeFeature association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.NodeFeature getNodeFeature();

  /**
   * Returns OperationArgument association proxy object.
   * 
   * @return OperationArgument association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.OperationArgument getOperationArgument();

  /**
   * Returns ReferencedElement association proxy object.
   * 
   * @return ReferencedElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.ReferencedElement getReferencedElement();
}
