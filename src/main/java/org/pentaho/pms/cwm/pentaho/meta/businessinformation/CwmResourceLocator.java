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
 * ResourceLocator object instance interface. Instances of the ResourceLocator class provide a general means for
 * describing the resources whose location is not defined by a traditional mailing address. For example, a
 * ResourceLocator instance could refer to anything from a location within a building
 * ("Room 317, third file cabinet, 2nd drawer") to a web location ("www.omg.org"). Because they are first class objects
 * in the CWM, ResourceLocator instances may also be used for purposes beyond those associated with the CWM Foundation's
 * B usiness Information concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmResourceLocator extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute url. Contains the text of the resource location. For Internet locations, this will
   * be a web URL (Uniform Resource Locator) but there is no requirement that this be so. In fact, the string can
   * contain any text meaningful to its intended use in a particular environment.
   * 
   * @return Value of attribute url.
   */
  public java.lang.String getUrl();

  /**
   * Sets the value of url attribute. See {@link #getUrl} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setUrl( java.lang.String newValue );

  /**
   * Returns the value of reference contact.
   * 
   * @return Value of reference contact. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact> */getContact();
}
