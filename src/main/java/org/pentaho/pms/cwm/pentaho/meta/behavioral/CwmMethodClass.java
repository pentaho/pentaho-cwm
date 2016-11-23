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

package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * Method class proxy interface. Method is the implementation of an Operation. It specifies the algorithm or procedure
 * that effects the results of an Operation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMethodClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmMethod createCwmMethod();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param ownerScope
   *          Specifies whether the Feature appears in every instance of the Classifier or whether it appears only once
   *          for the entire Classifier.
   * @param isQuery
   *          Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged. True
   *          indicates that the state is unchanged; false indicates that side-effects may occur.
   * @param body
   *          A specification of the Method in some appropriate form (such as a programming language). The exact form of
   *          a Method?s specification and knowledge of the language in which it is described is outside the scope of
   *          the CWM.
   * @return The created instance object.
   */
  public CwmMethod createCwmMethod( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind ownerScope, boolean isQuery,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression body );
}
