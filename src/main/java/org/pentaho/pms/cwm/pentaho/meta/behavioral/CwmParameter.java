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


package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * Parameter object instance interface. Parameters are used in the specification of operations, methods and events. A
 * Parameter may include a name, type, and direction of communication.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmParameter extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute defaultValue. An Expression whose evaluation yields a value to be used when no
   * argument is supplied for the Parameter.
   * 
   * @return Value of attribute defaultValue.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression getDefaultValue();

  /**
   * Sets the value of defaultValue attribute. See {@link #getDefaultValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDefaultValue( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression newValue );

  /**
   * Returns the value of attribute kind. Specifies what kind of a Parameter is required.
   * 
   * @return Value of attribute kind.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.ParameterDirectionKind getKind();

  /**
   * Sets the value of kind attribute. See {@link #getKind} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setKind( org.pentaho.pms.cwm.pentaho.meta.behavioral.ParameterDirectionKind newValue );

  /**
   * Returns the value of reference behavioralFeature.
   * 
   * @return Value of reference behavioralFeature.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmBehavioralFeature getBehavioralFeature();

  /**
   * Sets the value of reference behavioralFeature. See {@link #getBehavioralFeature} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBehavioralFeature( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmBehavioralFeature newValue );

  /**
   * Returns the value of reference event.
   * 
   * @return Value of reference event.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmEvent getEvent();

  /**
   * Sets the value of reference event. See {@link #getEvent} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setEvent( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmEvent newValue );

  /**
   * Returns the value of reference type.
   * 
   * @return Value of reference type.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getType();

  /**
   * Sets the value of reference type. See {@link #getType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
