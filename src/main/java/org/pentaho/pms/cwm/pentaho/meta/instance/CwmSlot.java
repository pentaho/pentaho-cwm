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


package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * Slot object instance interface. A slot is a named location in an Object instance that holds the current value of the
 * StructuralFeature associated with the Slot instance. Normally, the StructuralFeature associated with the slot will be
 * either an Attribute instance or an AssociationEnd instance. Slots are owned by Objects; DataValues do not have slots.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSlot extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference object.
   * 
   * @return Value of reference object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmObject getObject();

  /**
   * Sets the value of reference object. See {@link #getObject} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setObject( org.pentaho.pms.cwm.pentaho.meta.instance.CwmObject newValue );

  /**
   * Returns the value of reference value.
   * 
   * @return Value of reference value.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmInstance getValue();

  /**
   * Sets the value of reference value. See {@link #getValue} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setValue( org.pentaho.pms.cwm.pentaho.meta.instance.CwmInstance newValue );

  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature getFeature();

  /**
   * Sets the value of reference feature. See {@link #getFeature} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setFeature( org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature newValue );
}
