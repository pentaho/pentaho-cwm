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
 * Location object instance interface. Instances of the Location class represent physical locations. Note that the name
 * of a Location is derived from its superclass, ModelElement. Because Locations are first class objects within the CWM,
 * they can be us ed for purposes beyond those associated with the CWM Foundation?s Business Inf ormation concepts. If
 * additional attributes about Location instances ar e required, they should be added by creating subtypes of the
 * Location class and placing the additional attributes therein.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmLocation extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute locationType. Descriptive information about the character or identity of the
   * Location instance.
   * 
   * @return Value of attribute locationType.
   */
  public java.lang.String getLocationType();

  /**
   * Sets the value of locationType attribute. See {@link #getLocationType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLocationType( java.lang.String newValue );

  /**
   * Returns the value of attribute address. The address of the Location instance. The precise content of this string is
   * usage-defined.
   * 
   * @return Value of attribute address.
   */
  public java.lang.String getAddress();

  /**
   * Sets the value of address attribute. See {@link #getAddress} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setAddress( java.lang.String newValue );

  /**
   * Returns the value of attribute city. The name of the city in which the Location instance is found. The precise
   * content of this string is usage-defined.
   * 
   * @return Value of attribute city.
   */
  public java.lang.String getCity();

  /**
   * Sets the value of city attribute. See {@link #getCity} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCity( java.lang.String newValue );

  /**
   * Returns the value of attribute postCode. The postal code of the Location instance. The precise content of this
   * string is usage-defined.
   * 
   * @return Value of attribute postCode.
   */
  public java.lang.String getPostCode();

  /**
   * Sets the value of postCode attribute. See {@link #getPostCode} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setPostCode( java.lang.String newValue );

  /**
   * Returns the value of attribute area. The area in which the Location instance is found. The precise content of this
   * string is usage-defined, but a common usage would be to refer to a geographical subdivision such as a state or
   * province.
   * 
   * @return Value of attribute area.
   */
  public java.lang.String getArea();

  /**
   * Sets the value of area attribute. See {@link #getArea} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setArea( java.lang.String newValue );

  /**
   * Returns the value of attribute country. The name of the country in which the Location instance is found. The
   * precise content of this string is usage-defined.
   * 
   * @return Value of attribute country.
   */
  public java.lang.String getCountry();

  /**
   * Sets the value of country attribute. See {@link #getCountry} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setCountry( java.lang.String newValue );

  /**
   * Returns the value of reference contact.
   * 
   * @return Value of reference contact. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact> */getContact();
}
