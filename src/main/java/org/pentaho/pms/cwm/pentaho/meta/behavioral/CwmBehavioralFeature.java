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
 * BehavioralFeature object instance interface. A behavioral feature refers to a dynamic feature of a model element,
 * such as an operation or method. In the metamodel, BehavioralFeature specifies a behavioral aspect of a Classifier.
 * All different kinds of behavioral aspects of a Classifier, such as Operation and Method, are subclasses of
 * BehavioralFeature. BehavioralFeature is an abstract metaclass.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmBehavioralFeature extends org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature {
  /**
   * Returns the value of attribute isQuery. Specifies whether an execution of the BehavioralFeature leaves the state of
   * the system unchanged. True indicates that the state is unchanged; false indicates that side-effects may occur.
   * 
   * @return Value of attribute isQuery.
   */
  public boolean isQuery();

  /**
   * Sets the value of isQuery attribute. See {@link #isQuery} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setQuery( boolean newValue );

  /**
   * Returns the value of reference parameter.
   * 
   * @return Value of reference parameter. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmParameter}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmParameter> */getParameter();
}
