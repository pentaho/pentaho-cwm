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
