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
 * Association class proxy interface. An association defines a semantic relationship between classifiers. Associations
 * have two or more named ends. Associations with two or more ends are called "n-ary" whereas associations with exactly
 * two ends are called "binary". Each end, depending upon its multiplicity, connects to zero or more instances of some
 * classifier. In the metamodel, an Association is a declaration of a semantic relationship betw een Classifiers, such
 * as Classes. Associations must have two, and may have more, association ends. Each end is connected to a Classifier;
 * the same Classifier may be connected to more than one association end in the same association. (Refer to the
 * ObjectModel?s Instance package, below, for a description of how Associatio ns are instantiated.) Because Associations
 * are classifiers, they own and order their association ends ( which are Attributes) via the ClassifierFeature
 * association. In addition, b ecause Associations are Classes, they can also own more traditional Stru cturalFeatures
 * such as Attributes. Consequently, they may act in a manner simi lar to "association classes" described by some other
 * object models. An association may represent an aggregation (i.e., a whole/part relationship). In this case, the
 * association end attached to the whole element is designated , and the other association end represents the parts of
 * the aggregation. Associations can be of three different kinds: (1) ordinary association, (2) compo site aggregate,
 * and (3) shareable aggregate. Since the aggregate construct can have several different meanings depending on the
 * application area, C WM gives a more precise meaning to two of these constructs (i.e., association and composite
 * aggregate) and leaves the shareable aggregate more loosel y defined in between. Only binary Associations can have
 * composite or sharable aggregation semantics. Composite aggregation is a strong form of aggregation which requires
 * that a part instance be included in at most one composite at a time and that the compos ite object has sole
 * responsibility for the disposition of its parts. Thi s means that the composite object is responsible for the
 * creation and destruct ion of the parts. In implementation terms, it is responsible for their memory allocation. If a
 * composite object is destroyed, it must destroy all of its parts. It may remove a part and give it to another
 * composite object, w hich then assumes responsibility for it. If the multiplicity from a part to composite is
 * zero-to-one, the composite may remove the part and the part m ay assume responsibility for itself, otherwise it may
 * not live apart from a composite. A consequence of these rules is that a composite aggregation implies propagation
 * semantics (i.e., some of the dynamic semantics of the whole is propagated t o its parts). For example, if the whole
 * is copied or destroyed, then so are the parts as well (because a part may belong to at most one composite). A
 * classifier on the composite end of an association may have parts that are class ifiers and associations. At the
 * instance level, an instance of a part eleme nt is considered "part of" the instance of a composite element. If an as
 * sociation is part of a composite and it connects two classes that are also par t of the same composite, then an
 * instance of the association will conne ct objects that are part of the same composite object of which the instance is
 * part. A shareable aggregation denotes weak ownership (i.e., the part may be included in several aggregates) and its
 * owner may also change over time. However, the semantics of a shareable aggregation does not imply deletion of the
 * part s when an aggregate referencing it is deleted. Both kinds of aggregations define a transitive, antisy mmetric
 * relationship (i.e., the instances form a directed, non-cyclic graph ). Composition instances form a strict tree (or
 * rather a forest).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmAssociationClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmAssociation createCwmAssociation();

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
  public CwmAssociation createCwmAssociation( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract );
}
