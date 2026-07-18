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
 * Contact class proxy interface. Each Contact instance collects together the various types of related contact
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
public interface CwmContactClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmContact createCwmContact();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @return The created instance object.
   */
  public CwmContact createCwmContact( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility );
}
