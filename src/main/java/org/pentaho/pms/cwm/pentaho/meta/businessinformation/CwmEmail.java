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


package org.pentaho.pms.cwm.pentaho.meta.businessinformation;

/**
 * Email object instance interface. An Email instance identifies a single email address. Via a Contact instance, an
 * email address can be associated with one or more ResponsibleParty instances. Email instances might, for example, be
 * used by an automated tool to send an automatically generated email message to a ResponsibleParty instance responsible
 * about some change of state for a particular ModelElement. Multiple Email instances may be associated with a single
 * Contact instance and the ordering of the association between them may be used to represent the sequence in which the
 * Email instances should be contacted. Because email addresses are first class objects within the CWM, they can be u
 * sed for purposes beyond those associated with the CWMFoundation?s Business Infor mation concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmEmail extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute emailAddress. A textual representation of an email address.
   * 
   * @return Value of attribute emailAddress.
   */
  public java.lang.String getEmailAddress();

  /**
   * Sets the value of emailAddress attribute. See {@link #getEmailAddress} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setEmailAddress( java.lang.String newValue );

  /**
   * Returns the value of attribute emailType. Contains a textual representation of the type of the email address.
   * Interesting values might include location information such as "home" or "work", or perhaps an indication of the
   * type of email system for which the eMailAddress is formatted, such as "SMTP" or "X.400".
   * 
   * @return Value of attribute emailType.
   */
  public java.lang.String getEmailType();

  /**
   * Sets the value of emailType attribute. See {@link #getEmailType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setEmailType( java.lang.String newValue );

  /**
   * Returns the value of reference contact.
   * 
   * @return Value of reference contact. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact> */getContact();
}
