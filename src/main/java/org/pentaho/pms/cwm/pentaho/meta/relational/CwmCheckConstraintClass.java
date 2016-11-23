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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * CheckConstraint class proxy interface. A rule that specifies the values allowed in one or more columns of every row
 * of a table.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCheckConstraintClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmCheckConstraint createCwmCheckConstraint();

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
   * @param deferrability
   *          Indicates the timing of the constraint enforcement during multiple-user updates.
   * @return The created instance object.
   */
  public CwmCheckConstraint createCwmCheckConstraint( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression body,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.DeferrabilityType deferrability );
}
