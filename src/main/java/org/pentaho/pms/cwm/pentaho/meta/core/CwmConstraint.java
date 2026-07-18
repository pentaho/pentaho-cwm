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
 * Constraint object instance interface. A constraint is a semantic condition or restriction expressed in text. In the
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
public interface CwmConstraint extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute body. A BooleanExpression that must be true when evaluated for an instance of a
   * system to be well-formed. A boolean expression defining the constraint. Expressions are written as strings in a
   * designated language. For the model to be well formed, the expression must always yield a true value when evaluated
   * for instances of the constrained elements at any time when the system is stable (i.e., not during the execution of
   * an atomic operation).
   * 
   * @return Value of attribute body.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression getBody();

  /**
   * Sets the value of body attribute. See {@link #getBody} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBody( org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression newValue );

  /**
   * Returns the value of reference constrainedElement.
   * 
   * @return Value of reference constrainedElement. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getConstrainedElement();
}
