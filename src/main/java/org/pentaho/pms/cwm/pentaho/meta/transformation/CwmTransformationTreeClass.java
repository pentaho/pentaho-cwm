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
 * TransformationTree class proxy interface. This represents a specialized Transformation which can be modeled as an
 * expression tree.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationTreeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTransformationTree createCwmTransformationTree();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param function
   *          Any code or script for the Transformation.
   * @param functionDescription
   *          A short description for any code or script performed by the Transformation.
   * @param isPrimary
   *          This Transformation is the primary transformation for the associated TransformationTask.
   * @param type
   *          Identifies the type of TransformationTree, which can be unary or binary.
   * @param body
   *          Identifies the expression tree that embodies the TransformationTree.
   * @return The created instance object.
   */
  public CwmTransformationTree createCwmTransformationTree( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression function, java.lang.String functionDescription,
      boolean isPrimary, org.pentaho.pms.cwm.pentaho.meta.transformation.TreeType type,
      org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode body );
}
