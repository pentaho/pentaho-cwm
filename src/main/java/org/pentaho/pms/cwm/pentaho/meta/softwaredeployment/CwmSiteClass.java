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


package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * Site class proxy interface. A Site represents a geographical location. It provides a grouping mechanism for a group
 * of machines at the same location. Sites may be documented at different levels of granularity; containment link s may
 * be used to record hierarchical relationships between Sites.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSiteClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmSite createCwmSite();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param locationType
   *          Descriptive information about the character or identity of the Location instance.
   * @param address
   *          The address of the Location instance. The precise content of this string is usage-defined.
   * @param city
   *          The name of the city in which the Location instance is found. The precise content of this string is
   *          usage-defined.
   * @param postCode
   *          The postal code of the Location instance. The precise content of this string is usage-defined.
   * @param area
   *          The area in which the Location instance is found. The precise content of this string is usage-defined, but
   *          a common usage would be to refer to a geographical subdivision such as a state or province.
   * @param country
   *          The name of the country in which the Location instance is found. The precise content of this string is
   *          usage-defined.
   * @return The created instance object.
   */
  public CwmSite createCwmSite( java.lang.String name, org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      java.lang.String locationType, java.lang.String address, java.lang.String city, java.lang.String postCode,
      java.lang.String area, java.lang.String country );
}
