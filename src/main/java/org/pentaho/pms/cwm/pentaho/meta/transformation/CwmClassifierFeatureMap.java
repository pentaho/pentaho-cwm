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
 * ClassifierFeatureMap object instance interface. This represents a mapping of Classifiers to Features.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmClassifierFeatureMap extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
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
   * Returns the value of attribute classifierToFeature. Identifies if the mapping is from Classifiers (source) to
   * Features (target). The default is true.
   * 
   * @return Value of attribute classifierToFeature.
   */
  public boolean isClassifierToFeature();

  /**
   * Sets the value of classifierToFeature attribute. See {@link #isClassifierToFeature} for description on the
   * attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setClassifierToFeature( boolean newValue );

  /**
   * Returns the value of reference classifier.
   * 
   * @return Value of reference classifier. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier> */getClassifier();

  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature> */getFeature();

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
