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
 * ElementNode object instance interface. An ElementNode is a node in an expression that references some ModelElement
 * instance. This subclass of ExpressionNode allows an expression to reference any CWM model element that is not a
 * Feature and cannot, therefore, be represented as a FeatureNode. Typically, use of this subclass of ExpressionNode
 * implies that a tool attemp ting to evaluate the expression will be able to determine if the referenced ModelElement
 * instance is also an instance of some interesting subclass of ModelEle ment that contains a value of interest in the
 * expression.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmElementNode extends org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode {
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
}
