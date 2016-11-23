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

package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * TransformationActivity object instance interface. This represents a transformation activity. Each
 * TransformationActivity consists of a set of TransformationSteps.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationActivity extends org.pentaho.pms.cwm.pentaho.meta.core.CwmSubsystem {
  /**
   * Returns the value of attribute creationDate. When the TransformationActivity was created.
   * 
   * @return Value of attribute creationDate.
   */
  public java.lang.String getCreationDate();

  /**
   * Sets the value of creationDate attribute. See {@link #getCreationDate} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCreationDate( java.lang.String newValue );

  /**
   * Returns the value of reference step.
   * 
   * @return Value of reference step. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getStep();
}
