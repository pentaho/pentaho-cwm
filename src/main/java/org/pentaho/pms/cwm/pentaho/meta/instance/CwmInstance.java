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


package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * Instance object instance interface. The instance construct defines an entity to which a set of operations can be
 * applied and which has a state that stores the effects of the operations. In the metamodel Instance is connected to a
 * Classifier that declares its structure and behavior. It has a set of attribute values matching the definition of its
 * Classifier. The set of attribute values implements the current state of the Instance. Because Instance is an abstract
 * class, all Instances are either Object or DataValue instances. The data content of an Instance comprises one value
 * for each attribute in its full descriptor (and nothing more). The value must be consistent with th e type of the
 * attribute. An instance must obey any constraints on the ful l descriptor of the Classifier of which it is an instance
 * (including both explicit constraints and built- in constraints such as multiplicity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmInstance extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference classifier.
   * 
   * @return Value of reference classifier.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getClassifier();

  /**
   * Sets the value of reference classifier. See {@link #getClassifier} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setClassifier( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
