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
