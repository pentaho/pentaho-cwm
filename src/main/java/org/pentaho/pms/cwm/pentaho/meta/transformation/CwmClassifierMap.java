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
 * ClassifierMap object instance interface. This represents a mapping of source Classifiers to target Classifiers. A
 * ClassifierMap may consists of a group of ClassifierFeatureMaps and/or FeatureMaps.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmClassifierMap extends org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace {
  /**
   * Returns the value of attribute function. Any code or script for the ClassifierMap.
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
   * ClassifierMap.
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
   * @return Value of reference source. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier> */getSource();

  /**
   * Returns the value of reference target.
   * 
   * @return Value of reference target. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier> */getTarget();

  /**
   * Returns the value of reference transformationMap.
   * 
   * @return Value of reference transformationMap.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace getTransformationMap();

  /**
   * Sets the value of reference transformationMap. See {@link #getTransformationMap} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTransformationMap( org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace newValue );

  /**
   * Returns the value of reference featureMap.
   * 
   * @return Value of reference featureMap. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmFeatureMap}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmFeatureMap> */getFeatureMap();

  /**
   * Returns the value of reference cfMap.
   * 
   * @return Value of reference cfMap. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierFeatureMap}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierFeatureMap> */getCfMap();
}
