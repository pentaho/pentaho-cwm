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
 * Contact object instance interface. Each Contact instance collects together the various types of related contact
 * information. Each Contact instance can be associated with multiple Email, Location and Telephone instances.
 * Conversely, each Email, Location, ResourceLocator and Telephone instance can be associated with many Contact
 * instances. The ordering constraints on the associations between these classes and the Contact class can be used to
 * represent a prioritized sequence in which the various types of contact information should be used. A particular
 * ResponsibleParty instance may have multiple instances of Contact associated with it via the ResponsiblePartyContact
 * association. This asso ciation is ordered to support representation of the sequence in which Contact instan ces
 * should be used. For example, a ResponsibleParty instance representing an employee might be associated with Contact
 * instances representing the ir office, home, and mobile contact information with an indication that the employee
 * should be contacted first at the office, then at home, and finally via their mobile phone. To maximize flexibility of
 * the metamodel, Contact instances may provide conta ct information for multiple ResponsibleParty instances.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmContact extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference email.
   * 
   * @return Value of reference email. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmEmail}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmEmail> */getEmail();

  /**
   * Returns the value of reference location.
   * 
   * @return Value of reference location. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmLocation}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmLocation> */getLocation();

  /**
   * Returns the value of reference responsibleParty.
   * 
   * @return Value of reference responsibleParty. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResponsibleParty}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResponsibleParty> */getResponsibleParty();

  /**
   * Returns the value of reference telephone.
   * 
   * @return Value of reference telephone. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmTelephone}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmTelephone> */getTelephone();

  /**
   * Returns the value of reference url.
   * 
   * @return Value of reference url. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResourceLocator}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResourceLocator> */getUrl();
}
