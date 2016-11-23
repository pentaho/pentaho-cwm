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

package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * CodedLevel object instance interface. CodedLevel is a subclass of Level that assigns a unique encoding, or label, to
 * each of its Dimension members.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmCodedLevel extends org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevel {
  /**
   * Returns the value of attribute encoding. Encoding is an expression that generates a unique encoding, or label, for
   * each member of a CodedLevel.
   * 
   * @return Value of attribute encoding.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode getEncoding();

  /**
   * Sets the value of encoding attribute. See {@link #getEncoding} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setEncoding( org.pentaho.pms.cwm.pentaho.meta.expressions.CwmExpressionNode newValue );
}
