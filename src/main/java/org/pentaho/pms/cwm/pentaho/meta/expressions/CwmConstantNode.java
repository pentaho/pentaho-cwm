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
 * ConstantNode object instance interface. Instances of the ConstantNode class are ExpressionNodes that represent
 * constant values within expressions. Appropriate uses of the ConstantNode class place the values of constants in the
 * value attribute, rather than in the expression::body attribute inherited from ExpressionNode. The latter attribute is
 * intended for a different purpose; see the description of the ExpressionNode class for details.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmConstantNode extends org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode {
  /**
   * Returns the value of attribute value. The value of a constant in an expression tree.
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
}
