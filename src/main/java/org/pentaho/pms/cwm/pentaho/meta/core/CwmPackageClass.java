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

package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * Package class proxy interface. A package is a grouping of model elements. In the metamodel, Package is a subclass of
 * Namespace. A Package contains ModelElements such as Packages and Classifiers. A Package may also contain Constraints
 * and Dependencies between ModelElements of the Package. The purpose of the package construct is to provide a general
 * grouping mec hanism. In fact, its only semantics is to define a namespace for its conten ts. The package construct
 * can be used for organizing elements for any pur pose; the criteria to use for grouping elements together into one
 * package ar e not defined. A package owns a set of model elements, with the implication that if the package is removed
 * from the model, so are the elements owned by the package . Elements with names, such as classifiers, that are owned
 * by the same pa ckage must have unique names within the package, although elements in differ ent packages may have the
 * same name. There may be relationships between elements contained in the same package , and between an element in one
 * package and an element in a surrounding pac kage at any level. In other words, elements ?see? all the way out through
 * nested levels of packages. Elements in peer packages, however, are encapsulated and are not a priori visible to each
 * other. The same goes for elements in contained packages, i .e. packages do not see "inwards". Elements owned by a
 * Package can be made available to other Packages by im porting them. Although any ModelElement may be imported by a
 * Package, imported ModelElements are typically other Packages. When an element is imported b y a package it extends
 * the namespace of that package. Thus the elements avail able in a Package consists of its owned and imported
 * ModelElements.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmPackageClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmPackage createCwmPackage();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @return The created instance object.
   */
  public CwmPackage createCwmPackage( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility );
}
