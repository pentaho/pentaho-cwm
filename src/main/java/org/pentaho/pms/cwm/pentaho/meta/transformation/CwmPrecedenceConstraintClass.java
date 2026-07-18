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
 * PrecedenceConstraint class proxy interface. This is used to define order-of-execution constraint among
 * TransformationSteps. It may be used independent of or in conjunction with StepPrecedence.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmPrecedenceConstraintClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmPrecedenceConstraint createCwmPrecedenceConstraint();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param body
   *          A BooleanExpression that must be true when evaluated for an instance of a system to be well-formed. A
   *          boolean expression defining the constraint. Expressions are written as strings in a designated language.
   *          For the model to be well formed, the expression must always yield a true value when evaluated for
   *          instances of the constrained elements at any time when the system is stable (i.e., not during the
   *          execution of an atomic operation).
   * @return The created instance object.
   */
  public CwmPrecedenceConstraint createCwmPrecedenceConstraint( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression body );
}
