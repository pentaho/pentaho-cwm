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

package org.pentaho.pms.cwm.pentaho.meta.relationships;

/**
 * Generalization object instance interface. A generalization is a taxonomic relationship between a more general element
 * and a more specific element. The more specific element is fully consistent with the more general element (it has all
 * of its properties, members, and relationships) and may contain additional information. In the metamodel, a
 * Generalization is a directed inheritance relationship, u niting a Classifier with a more general Classifier in a
 * hierarchy. Generali zation is a subtyping relationship; that is, an instance of the more gener al ("parent")
 * Classifier may be substituted by an instance of the more spe cific ("child") Classifier. To understand inheritance
 * fully, it is necessary to understand the concept o f a full descriptor and a segment descriptor. A full descriptor is
 * the full description needed to describe an instance of a metamodel object. It cont ains a description of all of the
 * attributes, associations, and operations that the object contains. In a pre-object-oriented language, the full
 * descriptor of a data structure w as declared directly in its entirety. In an object-oriented language, the d
 * escription of an object is built out of incremental segments that are comb ined using inheritance to produce a full
 * descriptor for an object. The seg ments are the modeling elements that are actually declared in a model. Each cl
 * assifier contains a list of features and other relationships that it adds to what it inherits from its ancestors. The
 * mechanism of inheritance defines how full descriptors are produced from a set of segments connected by generaliza
 * tion.The full descriptors are implicit, but they define the structure of ac tual instances. Features of a classifier
 * that have private visibility ar e not visible to descendants of the classifier. If a classifier has no parent, then
 * its full descriptor is the same as its s egment descriptor. If a classifier has one or more parents, then its full d
 * escriptor contains the union of the features from its own segment descript or and the segment descriptors of all of
 * its ancestors. No attribute, oper ation, or association end with the same signature may be declared in more than one
 * of the segments (in other words, they may not be redefined). A method ma y be declared in more than one segment. A
 * method declared in any segment supe rsedes and replaces a method with the same signature declared in any ancestor. If
 * two or more methods nevertheless remain, then they conflict and the mod el is ill-formed. The constraints on the full
 * descriptor are the union o f the constraints on the segment itself and all of its ancestors. If an y of them are
 * inconsistent, then the model is ill-formed. In any full descriptor for a classifier, each method must have a
 * correspondi ng operation. In a concrete classifier, each operation in its full descript or must have a corresponding
 * method in the full descriptor.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmGeneralization extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference child.
   * 
   * @return Value of reference child.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getChild();

  /**
   * Sets the value of reference child. See {@link #getChild} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setChild( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );

  /**
   * Returns the value of reference parent.
   * 
   * @return Value of reference parent.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getParent();

  /**
   * Sets the value of reference parent. See {@link #getParent} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setParent( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
