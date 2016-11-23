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
 * Location class proxy interface. Instances of the Location class represent physical locations. Note that the name of a
 * Location is derived from its superclass, ModelElement. Because Locations are first class objects within the CWM, they
 * can be us ed for purposes beyond those associated with the CWM Foundation?s Business Inf ormation concepts. If
 * additional attributes about Location instances ar e required, they should be added by creating subtypes of the
 * Location class and placing the additional attributes therein.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmLocationClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmLocation createCwmLocation();

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
  public CwmLocation createCwmLocation( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String locationType,
      java.lang.String address, java.lang.String city, java.lang.String postCode, java.lang.String area,
      java.lang.String country );
}
