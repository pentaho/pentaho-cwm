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
 * Class class proxy interface. A class is a description of a set of objects that share the same attributes, operations,
 * methods, relationships, and semantics. A class may use a set of interfaces to specify collections of operations it
 * provides to its environment. In the metamodel, a Class describes a set of objects sharing a collection of Features
 * that are common to the set of objects. The purpose of a Class is to declare a collection of Features that fully desc
 * ribe the structure and behavior of objects. Some Classes may not be direc tly instantiated. These Classes are said to
 * be abstract and exist only for other Cl asses to inherit and reuse the Features declared by them. No object may be a
 * direct instance of an abstract Class, although an object may be an indir ect instance of one through a subclass that
 * is non-abstract. A Class acts as the namespace for various kinds of contained elements defined within its scope,
 * including classes, interfaces and associations (note t hat this is purely a scoping construction and does not imply
 * anything about aggrega tion). The contained classes can be used as ordinary classes in the contai ner class. If a
 * class inherits another class, the contents of the ancestor are available to its descendents if the visibility of an
 * element is publi c or protected; however, if the visibility is private, then the element is not visible and therefore
 * not available in the descendant.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmClassClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmClass createCwmClass();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @return The created instance object.
   */
  public CwmClass createCwmClass( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract );
}
