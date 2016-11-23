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

package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * Dependency object instance interface. A dependency states that the implementation or functioning of one or more
 * elements requires the presence of one or more other elements. In the metamodel, a Dependency is a directed
 * relationship from a client (o r clients) to a supplier (or suppliers) stating that the client is dependent on t he
 * supplier (i.e., the client element requires the presence and knowledg e of the supplier element). A dependency
 * specifies that the semantics of a set of model elements requi res the presence of another set of model elements. This
 * implies that if the sourc e is somehow modified, the dependents probably must be modified. The rea son for the
 * dependency can be specified in several different ways (e.g., usin g natural language or an algorithm) but is often
 * implicit. Whenever the supplier element of a dependency changes, the client element is potentially invalidated. After
 * such invalidation, a check should be performed followed by possible changes to the derived client element. Such a
 * check should be performed after which action can be taken to change the derived el ement to validate it again.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDependency extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute kind. Contains a description of the nature of the dependency relationship between
   * the client and supplier. The list of possible values is open-ended. However, CWM predefines the values
   * "Abstraction" and "Usage".
   * 
   * @return Value of attribute kind.
   */
  public java.lang.String getKind();

  /**
   * Sets the value of kind attribute. See {@link #getKind} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setKind( java.lang.String newValue );

  /**
   * Returns the value of reference client.
   * 
   * @return Value of reference client. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getClient();

  /**
   * Returns the value of reference supplier.
   * 
   * @return Value of reference supplier. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getSupplier();
}
