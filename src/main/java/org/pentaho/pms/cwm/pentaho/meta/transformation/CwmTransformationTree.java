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


package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * TransformationTree object instance interface. This represents a specialized Transformation which can be modeled as an
 * expression tree.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationTree extends org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation {
  /**
   * Returns the value of attribute type. Identifies the type of TransformationTree, which can be unary or binary.
   * 
   * @return Value of attribute type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TreeType getType();

  /**
   * Sets the value of type attribute. See {@link #getType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.transformation.TreeType newValue );

  /**
   * Returns the value of attribute body. Identifies the expression tree that embodies the TransformationTree.
   * 
   * @return Value of attribute body.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode getBody();

  /**
   * Sets the value of body attribute. See {@link #getBody} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBody( org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode newValue );
}
