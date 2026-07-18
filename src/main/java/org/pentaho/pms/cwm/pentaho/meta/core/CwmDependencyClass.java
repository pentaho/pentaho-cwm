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
 * Dependency class proxy interface. A dependency states that the implementation or functioning of one or more elements
 * requires the presence of one or more other elements. In the metamodel, a Dependency is a directed relationship from a
 * client (o r clients) to a supplier (or suppliers) stating that the client is dependent on t he supplier (i.e., the
 * client element requires the presence and knowledg e of the supplier element). A dependency specifies that the
 * semantics of a set of model elements requi res the presence of another set of model elements. This implies that if
 * the sourc e is somehow modified, the dependents probably must be modified. The rea son for the dependency can be
 * specified in several different ways (e.g., usin g natural language or an algorithm) but is often implicit. Whenever
 * the supplier element of a dependency changes, the client element is potentially invalidated. After such invalidation,
 * a check should be performed followed by possible changes to the derived client element. Such a check should be
 * performed after which action can be taken to change the derived el ement to validate it again.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDependencyClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDependency createCwmDependency();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param kind
   *          Contains a description of the nature of the dependency relationship between the client and supplier. The
   *          list of possible values is open-ended. However, CWM predefines the values "Abstraction" and "Usage".
   * @return The created instance object.
   */
  public CwmDependency createCwmDependency( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String kind );
}
