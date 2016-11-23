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
 * Document class proxy interface. The Document class represents externally stored descriptive information about some
 * aspect of the modeled system. An instance of Document might be associated with one or more ModelElements. The name of
 * a Document instance is derived from its superclasses. Although the purposes of the Description and Document types may
 * overlap somewhat, their chief distinction is that Description instances are sto red with the CWM metadata whereas
 * Documentation instances are stored externall y to the CWM metadata. Although there is an implication here that
 * Documentat ion instances might represent more voluminous information than Descriptio n instances, there is no
 * particular requirement that this be so. Because Documentation instances are themselves Namespace instances, hier
 * archical relationships between various externally stored documents can be represented.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDocumentClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmDocument createCwmDocument();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param reference
   *          Contains a textual representation of the identification, and perhaps the physical location, of externally
   *          maintained documentary information about some aspect of the ModelElement(s) with which the Document
   *          instance is associated.
   * @param type
   *          Contains a textual description of the type of information the Document represents. Specific contents are
   *          usage defined.
   * @return The created instance object.
   */
  public CwmDocument
    createCwmDocument( java.lang.String name, org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
        java.lang.String reference, java.lang.String type );
}
