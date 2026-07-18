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
 * TransformationUse object instance interface. This is a specialized dependency used to associate a Transformation to
 * the model of an existing object (e.g., program, query, or rule) that performs the transformation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationUse extends org.pentaho.pms.cwm.pentaho.meta.core.CwmDependency {
  /**
   * Returns the value of attribute type. Identifies the type of object that can perform the transformation.
   * 
   * @return Value of attribute type.
   */
  public java.lang.String getType();

  /**
   * Sets the value of type attribute. See {@link #getType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( java.lang.String newValue );

  /**
   * Returns the value of reference transformation.
   * 
   * @return Value of reference transformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getTransformation();

  /**
   * Returns the value of reference operation.
   * 
   * @return Value of reference operation. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getOperation();
}
