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
 * Telephone class proxy interface. Instances of the Telephone class represent telephone contact information. Because
 * telephones are first class objects within the CWM, they can be used for purposes beyond those associated with the CWM
 * Foundation?s Busines s Information concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTelephoneClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTelephone createCwmTelephone();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param phoneNumber
   *          A textual representation of the telephone?s number.
   * @param phoneType
   *          A textual representation of the telephone?s type, such as "multi-line", or its usage, such as "home",
   *          "work", "fax", or "mobile".
   * @return The created instance object.
   */
  public CwmTelephone createCwmTelephone( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String phoneNumber,
      java.lang.String phoneType );
}
