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
 * ConstantNode class proxy interface. Instances of the ConstantNode class are ExpressionNodes that represent constant
 * values within expressions. Appropriate uses of the ConstantNode class place the values of constants in the value
 * attribute, rather than in the expression::body attribute inherited from ExpressionNode. The latter attribute is
 * intended for a different purpose; see the description of the ExpressionNode class for details.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmConstantNodeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmConstantNode createCwmConstantNode();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param expression
   *          Contains a textual representation of the expression relevant for this ExpressionNode instance.
   * @param value
   *          The value of a constant in an expression tree.
   * @return The created instance object.
   */
  public CwmConstantNode createCwmConstantNode( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression expression,
      java.lang.String value );
}
