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
