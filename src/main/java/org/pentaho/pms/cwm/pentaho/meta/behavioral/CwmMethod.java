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
 * Method object instance interface. Method is the implementation of an Operation. It specifies the algorithm or
 * procedure that effects the results of an Operation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMethod extends org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmBehavioralFeature {
  /**
   * Returns the value of attribute body. A specification of the Method in some appropriate form (such as a programming
   * language). The exact form of a Method?s specification and knowledge of the language in which it is described is
   * outside the scope of the CWM.
   * 
   * @return Value of attribute body.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression getBody();

  /**
   * Sets the value of body attribute. See {@link #getBody} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBody( org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression newValue );

  /**
   * Returns the value of reference specification.
   * 
   * @return Value of reference specification.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation getSpecification();

  /**
   * Sets the value of reference specification. See {@link #getSpecification} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSpecification( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation newValue );
}
