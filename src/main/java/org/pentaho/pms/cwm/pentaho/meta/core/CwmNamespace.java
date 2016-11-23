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
 * Namespace object instance interface. A namespace is a part of a model that contains a set of ModelElements each of
 * whose names designates a unique element within the namespace. In the metamodel, a Namespace is a ModelElement that
 * can own other ModelEle ments, such as Classifiers. The name of each owned ModelElement must be un ique within the
 * Namespace. Moreover, each contained ModelElement is owned b y at most one Namespace. The concrete subclasses of
 * Namespace may have a dditional constraints on which kind of elements may be contained. Namespace is an abstract
 * metaclass. Note that explicit parts of a model element, such as the features of a Clas sifier, are not modeled as
 * owned elements in a namespace. A namespace is u sed for unstructured contents such as the contents of a package, or a
 * clas s declared inside the scope of another class.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmNamespace extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference ownedElement.
   * 
   * @return Value of reference ownedElement. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getOwnedElement();
}
