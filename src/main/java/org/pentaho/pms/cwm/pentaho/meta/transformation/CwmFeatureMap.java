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
 * FeatureMap object instance interface. This represents a mapping of source Features to target Features.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmFeatureMap extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute function. Any code or script for the FeatureMap.
   * 
   * @return Value of attribute function.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression getFunction();

  /**
   * Sets the value of function attribute. See {@link #getFunction} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFunction( org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression newValue );

  /**
   * Returns the value of attribute functionDescription. A short description for any code or script performed by the
   * FeatureMap.
   * 
   * @return Value of attribute functionDescription.
   */
  public java.lang.String getFunctionDescription();

  /**
   * Sets the value of functionDescription attribute. See {@link #getFunctionDescription} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFunctionDescription( java.lang.String newValue );

  /**
   * Returns the value of reference source.
   * 
   * @return Value of reference source. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature> */getSource();

  /**
   * Returns the value of reference target.
   * 
   * @return Value of reference target. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature> */getTarget();

  /**
   * Returns the value of reference classifierMap.
   * 
   * @return Value of reference classifierMap.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierMap getClassifierMap();

  /**
   * Sets the value of reference classifierMap. See {@link #getClassifierMap} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setClassifierMap( org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierMap newValue );
}
