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
