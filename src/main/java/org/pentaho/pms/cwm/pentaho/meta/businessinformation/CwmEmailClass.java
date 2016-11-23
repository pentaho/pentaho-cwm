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
 * Email class proxy interface. An Email instance identifies a single email address. Via a Contact instance, an email
 * address can be associated with one or more ResponsibleParty instances. Email instances might, for example, be used by
 * an automated tool to send an automatically generated email message to a ResponsibleParty instance responsible about
 * some change of state for a particular ModelElement. Multiple Email instances may be associated with a single Contact
 * instance and the ordering of the association between them may be used to represent the sequence in which the Email
 * instances should be contacted. Because email addresses are first class objects within the CWM, they can be u sed for
 * purposes beyond those associated with the CWMFoundation?s Business Infor mation concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmEmailClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmEmail createCwmEmail();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param emailAddress
   *          A textual representation of an email address.
   * @param emailType
   *          Contains a textual representation of the type of the email address. Interesting values might include
   *          location information such as "home" or "work", or perhaps an indication of the type of email system for
   *          which the eMailAddress is formatted, such as "SMTP" or "X.400".
   * @return The created instance object.
   */
  public CwmEmail createCwmEmail( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String emailAddress,
      java.lang.String emailType );
}
