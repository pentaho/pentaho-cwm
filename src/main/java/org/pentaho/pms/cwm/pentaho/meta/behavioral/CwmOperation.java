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
 * Operation object instance interface. Operation is a service that can be requested from an object to effect behavior.
 * An Operation has a signature, which describes the parameters that are possible (including possible return values). In
 * the metamodel, an Operation is a BehavioralFeature that can be applied to ins tances of the Classifier that contains
 * the Operation. Operation is the specification, while Method is the implementation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmOperation extends org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmBehavioralFeature {
  /**
   * Returns the value of attribute isAbstract. If true, then the Operation does not have an implementation, and one
   * must be supplied by a descendant. If false, the Operation must have an implementation in the class or inherited
   * from an ancestor.
   * 
   * @return Value of attribute isAbstract.
   */
  public boolean isAbstract();

  /**
   * Sets the value of isAbstract attribute. See {@link #isAbstract} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setAbstract( boolean newValue );

  /**
   * Returns the value of reference method.
   * 
   * @return Value of reference method. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmMethod}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmMethod> */getMethod();
}
