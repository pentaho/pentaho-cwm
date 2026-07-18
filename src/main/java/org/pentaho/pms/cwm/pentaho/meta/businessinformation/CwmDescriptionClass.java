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
 * Description class proxy interface. Instances of the Description class contain arbitrary textual information relevant
 * to a particular ModelElement. While Description instances may contain any desired textual information, they will
 * typically contain documentation or references to external reference information about the owning ModelElement. Any
 * ModelElement may have multiple Description instances associated with it. Indeed, a ModelElement instance that is a
 * Description instance may itself have multiple Description instances linked to it. Also, a hierarchies of Des cription
 * instances can be constructed. Description instances are meant to hold descriptive textual information t hat will be
 * stored in the metamodel itself. In contrast, Document insta nces are meant to describe the location documentary
 * information stored outside the metamodel.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDescriptionClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDescription createCwmDescription();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param body
   *          Contains a textual description of information pertaining to the owning ModelElement.
   * @param language
   *          Contains an identification of the language in which the content of the body attribute is specified. If
   *          desired, the language specification may be applied to the name attribute derived from ModelElement as
   *          well.
   * @param type
   *          Contains a textual description of the type of information the Description represents. Specific contents
   *          are usage defined.
   * @return The created instance object.
   */
  public CwmDescription createCwmDescription( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, java.lang.String body,
      java.lang.String language, java.lang.String type );
}
