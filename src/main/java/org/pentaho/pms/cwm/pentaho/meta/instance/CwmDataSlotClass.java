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
 * DataSlot class proxy interface. A Slot which is used to hold a data value where there is no need to manage the value
 * as an element in its own right (in which case a DataValue would be used) - for example it is a one-off string value
 * or a number. The dataValue (and dataType where set) must be consistent with the type of the DataSlot's feature
 * (Attribute) and must obey any constraints on the full descriptor of the Attribute's DataType (including both explicit
 * constraints and built-in constraints such as multiplicity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataSlotClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDataSlot createCwmDataSlot();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param dataValue
   *          The value for the slot expressed as a string.
   * @return The created instance object.
   */
  public CwmDataSlot createCwmDataSlot( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String dataValue );
}
