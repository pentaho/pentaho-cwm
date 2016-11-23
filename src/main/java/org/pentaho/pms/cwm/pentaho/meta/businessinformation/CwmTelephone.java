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

package org.pentaho.pms.cwm.pentaho.meta.businessinformation;

/**
 * Telephone object instance interface. Instances of the Telephone class represent telephone contact information.
 * Because telephones are first class objects within the CWM, they can be used for purposes beyond those associated with
 * the CWM Foundation?s Busines s Information concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTelephone extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute phoneNumber. A textual representation of the telephone?s number.
   * 
   * @return Value of attribute phoneNumber.
   */
  public java.lang.String getPhoneNumber();

  /**
   * Sets the value of phoneNumber attribute. See {@link #getPhoneNumber} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPhoneNumber( java.lang.String newValue );

  /**
   * Returns the value of attribute phoneType. A textual representation of the telephone?s type, such as "multi-line",
   * or its usage, such as "home", "work", "fax", or "mobile".
   * 
   * @return Value of attribute phoneType.
   */
  public java.lang.String getPhoneType();

  /**
   * Sets the value of phoneType attribute. See {@link #getPhoneType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPhoneType( java.lang.String newValue );

  /**
   * Returns the value of reference contact.
   * 
   * @return Value of reference contact. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact> */getContact();
}
