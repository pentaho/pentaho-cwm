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

package org.pentaho.pms.cwm.pentaho.meta.keysindexes;

/**
 * KeysIndexes package interface. The KeysIndexes package depends on the following package:
 * org.omg::CWM::ObjectModel::Core Keys and indexes as means for specifying instances and for identifying alternate
 * sortings of ins tances are epresented in the CWMFoundation so that they can be shared among the various data models
 * that employ hem. The CWM Foundation define s the base concepts (uniqueness and relationships implemented as keys) pon
 * which more specific key structures can be built by other CWM and tool- specific packages. The concepts of key and
 * index have been placed in the CWM Foundation because they are available in many types of data resources. In the CWM
 * Foundation class and assoc iation descriptions that follow, relational model examples are frequent ly used when
 * discussing the definition and usage of key and index types . This is done because of the wide-spread availability of
 * relational system s and is thought to promote an understanding of the underlying concepts. T hese concepts, however,
 * are no less applicable to other data models as w ell. The two central classes for representing the concept of keys
 * are UniqueKey and KeyRelationship. UniqueKey instances correspond to the notion that keys represent the id entity of
 * instances -- similar to the relational model?s concept of a pr imary key or an object model?s concept of an object
 * identity. In contra st, KeyRelationship instancescorrespond to the notion that keys embedded in an instance can be
 * used to determine the identity of other related instan ces -- similar to the relational model concept of foreign key
 * and the ob ject model concept of a reference. Consequently, UniqueKey and KeyRelations hip are best thought of as
 * representing roles that collections of Features of Clas sifiers play rather than Classifiers describing the internal
 * structure of ke ys. Representing keys as roles rather than structural entities provides g reater flexibility and
 * allows the reuse of Features in multiple keys and in differing relationships to each other. Associations within the
 * KeysIndexes package describe how UniqueKey and KeyRelationship instances describe the roles they play for various
 * Class instances and the StructuralFeature instances they contain. OCL Representation of KeysIndexes Constraints
 * [C-6-1]The isAscending attribute is valid only if the isSorted attribute is True. context IndexedFeature inv:
 * self.isAscending->notEmpty implies self.index.isSorted [C-6-2] A KeyRelationship instance must be owned by one and
 * only one Class instance. context KeyRelationship inv: (self.namespace->size = 1) and
 * self.namespace.oclIsKindOf(Class) [C-6-3] An UniqueKey instance must be owned by one and only one Class instance.
 * context UniqueKey inv: (self.namespace->size = 1) and self.namespace.oclIsKindOf(Class)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface KeysIndexesPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmUniqueKey class proxy object.
   * 
   * @return CwmUniqueKey class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKeyClass getCwmUniqueKey();

  /**
   * Returns CwmIndex class proxy object.
   * 
   * @return CwmIndex class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexClass getCwmIndex();

  /**
   * Returns CwmKeyRelationship class proxy object.
   * 
   * @return CwmKeyRelationship class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationshipClass getCwmKeyRelationship();

  /**
   * Returns CwmIndexedFeature class proxy object.
   * 
   * @return CwmIndexedFeature class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmIndexedFeatureClass getCwmIndexedFeature();

  /**
   * Returns IndexedFeatures association proxy object.
   * 
   * @return IndexedFeatures association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.IndexedFeatures getIndexedFeatures();

  /**
   * Returns IndexedFeatureInfo association proxy object.
   * 
   * @return IndexedFeatureInfo association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.IndexedFeatureInfo getIndexedFeatureInfo();

  /**
   * Returns KeyRelationshipFeatures association proxy object.
   * 
   * @return KeyRelationshipFeatures association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.KeyRelationshipFeatures getKeyRelationshipFeatures();

  /**
   * Returns UniqueFeature association proxy object.
   * 
   * @return UniqueFeature association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.UniqueFeature getUniqueFeature();

  /**
   * Returns UniqueKeyRelationship association proxy object.
   * 
   * @return UniqueKeyRelationship association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.UniqueKeyRelationship getUniqueKeyRelationship();

  /**
   * Returns IndexSpansClass association proxy object.
   * 
   * @return IndexSpansClass association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.IndexSpansClass getIndexSpansClass();
}
