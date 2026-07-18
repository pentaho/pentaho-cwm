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


package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * Constraint class proxy interface. A constraint is a semantic condition or restriction expressed in text. In the
 * metamodel, a Constraint is a BooleanExpression on an associated M odelElement(s) which must be true for the model to
 * be well formed. This restriction can be stated in natural language, or in different kinds of languages with
 * well-defined semantics. Certain Constraints are predefine d, others may be user defined. Note that a Constraint is an
 * assertion, not an executable mechanism. The specification is written as an expression in a designated constraint
 * language. The language can be specially designed for writing constrain ts (such as OCL), a programming language,
 * mathematical notation, or natur al language. If constraints are to be enforced by a model editor tool, t hen the tool
 * must understand the syntax and semantics of the constraint lan guage. Because the choice of language is arbitrary,
 * constraints can be u sed as an extension mechanism. The constraint concept allows new semantics to be specified
 * linguistical ly for a model element. In the metamodel a Constraint directly attached to a ModelElement describes
 * semantic restrictions that this ModelElement must obey.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmConstraintClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmConstraint createCwmConstraint();

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
  public CwmConstraint createCwmConstraint( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression body );
}
