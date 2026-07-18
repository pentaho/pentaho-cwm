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
 * CallAction object instance interface. A call action is an action resulting in an invocation of an operation. The
 * purpose of a CallAction is to identify the actual Arguments used in a specific invocation of an Operation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCallAction extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference operation.
   * 
   * @return Value of reference operation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation getOperation();

  /**
   * Sets the value of reference operation. See {@link #getOperation} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOperation( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperation newValue );

  /**
   * Returns the value of reference actualArgument.
   * 
   * @return Value of reference actualArgument. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmArgument}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmArgument> */getActualArgument();
}
