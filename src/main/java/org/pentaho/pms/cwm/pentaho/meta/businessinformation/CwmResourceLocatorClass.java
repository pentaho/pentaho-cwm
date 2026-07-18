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
 * ResourceLocator class proxy interface. Instances of the ResourceLocator class provide a general means for describing
 * the resources whose location is not defined by a traditional mailing address. For example, a ResourceLocator instance
 * could refer to anything from a location within a building ("Room 317, third file cabinet, 2nd drawer") to a web
 * location ("www.omg.org"). Because they are first class objects in the CWM, ResourceLocator instances may also be used
 * for purposes beyond those associated with the CWM Foundation's B usiness Information concepts.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmResourceLocatorClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmResourceLocator createCwmResourceLocator();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param url
   *          Contains the text of the resource location. For Internet locations, this will be a web URL (Uniform
   *          Resource Locator) but there is no requirement that this be so. In fact, the string can contain any text
   *          meaningful to its intended use in a particular environment.
   * @return The created instance object.
   */
  public CwmResourceLocator createCwmResourceLocator( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String url );
}
