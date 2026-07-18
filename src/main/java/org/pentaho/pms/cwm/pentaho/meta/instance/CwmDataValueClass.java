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
 * DataValue class proxy interface. A data value is an instance with no identity. In the metamodel, DataValue is a child
 * of Instance that cannot change its state, i.e. all operations that are applicable to it are pure functions or queries
 * that do not cause any side effects. DataValues are typically used as attribute values. Since it is not possible to
 * differentiate between two data values that app ear to be the same, it becomes more of a philosophical issue whether
 * ther e are several data values representing the same value or just one for each value. In addition, a data value
 * cannot change its data type and it does no t have contained instances.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataValueClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDataValue createCwmDataValue();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param value
   *          A string representation of the value.
   * @return The created instance object.
   */
  public CwmDataValue createCwmDataValue( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String value );
}
