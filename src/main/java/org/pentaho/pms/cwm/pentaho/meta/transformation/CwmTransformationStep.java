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
 * TransformationStep object instance interface. This represents the usage of a TransformationTask in a
 * TransformationActivity. A TransformationStep relates to one TransformationTask. TransformationSteps are used to
 * coordinate the flow of control between their Tr ansformationTasks. Ordering of the TransformationSteps are defined
 * using the P recedenceConstrainedBy dependency.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationStep extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference task.
   * 
   * @return Value of reference task.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask getTask();

  /**
   * Sets the value of reference task. See {@link #getTask} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTask( org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask newValue );

  /**
   * Returns the value of reference activity.
   * 
   * @return Value of reference activity.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace getActivity();

  /**
   * Sets the value of reference activity. See {@link #getActivity} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setActivity( org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace newValue );

  /**
   * Returns the value of reference precedence.
   * 
   * @return Value of reference precedence. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraint> */getPrecedence();

  /**
   * Returns the value of reference precedingStep.
   * 
   * @return Value of reference precedingStep. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency> */getPrecedingStep();

  /**
   * Returns the value of reference succeedingStep.
   * 
   * @return Value of reference succeedingStep. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency> */getSucceedingStep();
}
