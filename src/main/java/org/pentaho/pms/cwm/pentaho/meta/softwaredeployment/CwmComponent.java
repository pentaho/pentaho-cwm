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

package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * Component object instance interface. A Component represents a physical piece of implementation of a system, including
 * software code (source, binary or executable) or equivalents such as scripts or command files. A Component is a
 * subtype of Classifier, and so may have its own Features, such as Attributes and Operations. Deployment of a Component
 * on a specific Machine is represented as a Dep loyedComponent.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmComponent extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier {
  /**
   * Returns the value of reference designPackage.
   * 
   * @return Value of reference designPackage. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage> */getDesignPackage();
}
