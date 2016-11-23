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
 * Argument object instance interface. Argument is an expression describing how to determine an actual value passed in a
 * CallAction. In the metamodel an Argument is a composite part of a CallAction and contains a meta-attribute, value, of
 * type Expression. It states how the actual a rgument is determined when the owning CallAction is executed.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmArgument extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute value. An expression determining the actual Argument instance when executed.
   * 
   * @return Value of attribute value.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression getValue();

  /**
   * Sets the value of value attribute. See {@link #getValue} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setValue( org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression newValue );

  /**
   * Returns the value of reference callAction.
   * 
   * @return Value of reference callAction.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction getCallAction();

  /**
   * Sets the value of reference callAction. See {@link #getCallAction} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCallAction( org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallAction newValue );
}
