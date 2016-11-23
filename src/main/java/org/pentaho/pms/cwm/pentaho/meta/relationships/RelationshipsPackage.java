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
 * Relationships package interface. The Relationships metamodel depends on the following package:
 * org.omg::CWM::ObjectModel::Core The Relationships metamodel collects together classes and associations that describe
 * the relationsh ips between object within a CWM information store. The Relationships me tamodel describes to types of
 * relationships: association and generalizati on. Association relationships record linkages between model elements.
 * These linkages may represent simpl e linkages between model elements or aggregation ("is part of") relatio nships
 * between model elements; aggregation relationships come in two form s -- shared and composite. Associations have two
 * or more named ends that link them to instances of the classes connected by the association. Generalization
 * relationships record arrangements of model elements into type hierarchies in a parent /child (or "is type of")
 * fashion. Child types are said to "specialize", "subclass" or "subtype" their parental types, represent a subset of
 * par ental instances that fulfill the definition of the child type, and inher it the structural features (Attributes,
 * AssociationEnd) and behavioral features (Operations, Methods) of their parents. Parenta l types are said to
 * "generalize" their child types or to be "superclass es" or "supertypes" of their children. CWM generalization
 * hierarchies support multiple inheritance; that is, child types may have more than one parental type and inherit the
 * union of the features of all their p arental types. Although called "hierarchies", multiple inheritance actual ly
 * represents a directed acyclic graph of parental and child types. OCL Representation of Relationships Constraints
 * Operations The operation allConnections results in the set of all AssociationEnds of the Association. allConnections
 * : Set(AssociationEnd); allConnections = self.feature.oclIsKindOf(AssociationEnd) Constraints [C-5-1] An Association
 * must have at least 2 AssociationEnds. context Association inv: self.allConnections->size > 1 [C-5-2] The
 * AssociationEnds must have a unique name within the association. context Association inv: self.allConnections->forAll(
 * r1, r2 | r1.name = r2.name implies r1 = r2) [C-5-3] At most one AssociationEnd may be an aggregation or composition.
 * context Association inv: self.allConnections->select(aggregation <> #ak_none)->size <= 1 [C-5-4] If an Association
 * has three or more AssociationEnds, then no AssociationEnd may be an aggreg ation or composition. context Association
 * inv: self.allConnections->size >=3 implies self.allConnections->forall(aggregation = #ak_none) [C-5-5] The connected
 * Classifiers of the AssociationEnds should be included in the Namespace of the Association, or be Classifiers with
 * public visibility in other Namespac es to which the Association has access. context Association inv:
 * self.allConnections->forAll(r | self.namespace.allContents->includes (r.type) ) or self.allConnections->forAll(r |
 * self.namespace.allContents->excludes (r.type)) implies self.namespace.clientDependency->exists (d |
 * d.supplier.oclAsType(Namespace).ownedElement->select (e | e.elementOwnership.visibility = #ak_public)->includes
 * (r.type) or d.supplier.oclAsType(Classifier).allParents. oclAsType(Namespace).ownedElement->select (e |
 * e.elementOwnership.visibility = #ak_public)->includes (r.type) or
 * d.supplier.oclAsType(Package).allImportedElements->select (e | e.elementImport.visibility = #ak_public) ->includes
 * (r.type) ) ) [C-5-6] An AssociationEnd must have an owning Association. context AssociationEnd inv:
 * self.owner.oclIsKindOf(Association) [C-5-7] The Classifier of an AssociationEnd cannot be an Interface or a DataType
 * if the association is navigable away from that end. context AssociationEnd inv: (self.type.oclIsKindOf (Interface) or
 * self.type.oclIsKindOf (DataType)) implies self.owner->select (ae | ae <self)->forAll(ae | ae.isNavigable = #false)
 * [C-5-8] An instance may not belong by composition to more than one composite Instance. context AssociationEnd inv:
 * self.aggregation = #ak_composite implies self.multiplicity.max <= 1 [C-5-9] An AssociationEnd with composite or
 * shared aggregation semantics must be owned by an Associa tion. context AssociationEnd inv: self.aggregation =
 * #ak_composite or self.aggregation = #ak_shared implies self.owner.oclIsKindOf(Association)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface RelationshipsPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmAssociation class proxy object.
   * 
   * @return CwmAssociation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.CwmAssociationClass getCwmAssociation();

  /**
   * Returns CwmAssociationEnd class proxy object.
   * 
   * @return CwmAssociationEnd class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.CwmAssociationEndClass getCwmAssociationEnd();

  /**
   * Returns CwmGeneralization class proxy object.
   * 
   * @return CwmGeneralization class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.CwmGeneralizationClass getCwmGeneralization();

  /**
   * Returns ChildElement association proxy object.
   * 
   * @return ChildElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.ChildElement getChildElement();

  /**
   * Returns ParentElement association proxy object.
   * 
   * @return ParentElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.ParentElement getParentElement();
}
