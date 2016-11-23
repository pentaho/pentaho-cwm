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
 * Core package interface. The Core metamodel depends on no other packages. The ObjectModel Core metamodel contains
 * basic metamodel classes and ass ociations used by all other CWM metamodel packages, including other Obje ctModel
 * packages OCL Representation of Core Constraints Operations The operation allFeatures results in a Set containing all
 * Features of t he Classifier itself and all its inherited Features. allFeatures : Set(Feature); allFeatures =
 * self.feature->union(self.parent.oclAsType(Classifier). allFeatures) The operation allAttributes results in a Set
 * containing all Attributes of the Classifier itself and all its inherited Attributes. allAttributes : set(Attribute);
 * allAttributes = self.allFeatures->select(f | f.oclIsKindOf(Attribute )) The operation specification yields the set of
 * Classifiers that the curr ent Classifier realizes. specification: Set(Classifier) specification =
 * self.clientDependency-> select(d | d.stereotype.name = "realization" and
 * d.supplier.oclIsKindOf(Classifier)).supplier.oclAsType(Classi fier) The operation parent returns a Set containing all
 * direct parents of a C lassifier. parent : Set(Classifier); parent = self.generalization.parent The operation
 * allParents returns a Set containing all the Classifiers i nherited by this Classifier (the transitive closure),
 * excluding the Clas sifier itself. allParents : Set(Classifier); allParents =
 * self.parent->union(self.parent.allParents) The operation allContents returns a Set containing all ModelElements co
 * ntained in the Classifier together with the contents inherited from its parents. allContents : Set(ModelElement);
 * allContents = self.contents->union(self.parent.allContents-> select(e | e.elementOwnership.visibility = #public or
 * e.elementOwnership.visibility = #protected)) The operation supplier results in a Set containing all direct suppliers
 * of the ModelElement. supplier : Set(ModelElement); supplier = self.clientDependency.supplier The operation
 * allSuppliers results in a Set containing all the ModelEle ments that are suppliers of this ModelElement, including
 * the suppliers o f these Model Elements. This is the transitive closure. allSuppliers : Set(ModelElement);
 * allSuppliers = self.supplier->union(self.supplier.allSuppliers) The operation contents results in a Set containing
 * all ModelElements co ntained by the Namespace. contents : Set(ModelElement) contents = self.ownedElement ->
 * union(self.namespace.contents) The operation allContents results in a Set containing all ModelElements contained by
 * the Namespace. allContents : Set(ModelElement); allContents = self.contents The operation allVisibleElements results
 * in a Set containing all ModelE lements visible outside of the Namespace. allVisibleElements : Set(ModelElement)
 * allVisibleElements = self.allContents -> select(e | e.elementOwnership.visibility = #public) The operation
 * allSurroundingNamespaces results in a Set containing all surrounding Namespaces. allSurroundingNamespaces :
 * Set(Namespace) allSurroundingNamespaces = self.namespace->union(self.namespace.allSurroundingNamespaces) The
 * operation contents results in a Set containing the ModelElements ow ned by or imported by the Package. contents :
 * Set(ModelElement) contents = self.ownedElement->union(self.importedElement) The operation allImportedElements results
 * in a Set containing the Model Elements imported by the Package. allImportedElements : Set(ModelElement)
 * allImportedElements = self.importedElement The operation allContents results in a Set containing the ModelElements
 * owned by or imported by the Package. allContents : Set(ModelElement) allContents = self.contents Constraints [C-3-1]
 * A Constraint cannot be applied to itself. context Constraint inv: not self.constrainedElement->includes (self)
 * [C-3-2] A DataType cannot contain any other ModelElements. context DataType inv: self.ownedElement->isEmpty [C-3-3]
 * Tags associated with a model element (directly via a property l ist or indirectly via a stereotype) must not clash
 * with any meta attribu tes associated with the model element. context ModelElement inv: -- cannot be specified with
 * OCL
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CorePackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmElement class proxy object.
   * 
   * @return CwmElement class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmElementClass getCwmElement();

  /**
   * Returns CwmModelElement class proxy object.
   * 
   * @return CwmModelElement class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElementClass getCwmModelElement();

  /**
   * Returns CwmNamespace class proxy object.
   * 
   * @return CwmNamespace class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespaceClass getCwmNamespace();

  /**
   * Returns CwmClassifier class proxy object.
   * 
   * @return CwmClassifier class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifierClass getCwmClassifier();

  /**
   * Returns CwmClass class proxy object.
   * 
   * @return CwmClass class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassClass getCwmClass();

  /**
   * Returns CwmDataType class proxy object.
   * 
   * @return CwmDataType class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmDataTypeClass getCwmDataType();

  /**
   * Returns CwmPackage class proxy object.
   * 
   * @return CwmPackage class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmPackageClass getCwmPackage();

  /**
   * Returns CwmSubsystem class proxy object.
   * 
   * @return CwmSubsystem class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmSubsystemClass getCwmSubsystem();

  /**
   * Returns CwmModel class proxy object.
   * 
   * @return CwmModel class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmModelClass getCwmModel();

  /**
   * Returns CwmFeature class proxy object.
   * 
   * @return CwmFeature class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmFeatureClass getCwmFeature();

  /**
   * Returns CwmStructuralFeature class proxy object.
   * 
   * @return CwmStructuralFeature class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeatureClass getCwmStructuralFeature();

  /**
   * Returns CwmAttribute class proxy object.
   * 
   * @return CwmAttribute class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmAttributeClass getCwmAttribute();

  /**
   * Returns CwmConstraint class proxy object.
   * 
   * @return CwmConstraint class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmConstraintClass getCwmConstraint();

  /**
   * Returns CwmDependency class proxy object.
   * 
   * @return CwmDependency class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmDependencyClass getCwmDependency();

  /**
   * Returns CwmExpression class proxy object.
   * 
   * @return CwmExpression class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmExpressionClass getCwmExpression();

  /**
   * Returns CwmBooleanExpression class proxy object.
   * 
   * @return CwmBooleanExpression class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpressionClass getCwmBooleanExpression();

  /**
   * Returns CwmProcedureExpression class proxy object.
   * 
   * @return CwmProcedureExpression class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpressionClass getCwmProcedureExpression();

  /**
   * Returns CwmMultiplicity class proxy object.
   * 
   * @return CwmMultiplicity class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicityClass getCwmMultiplicity();

  /**
   * Returns CwmMultiplicityRange class proxy object.
   * 
   * @return CwmMultiplicityRange class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicityRangeClass getCwmMultiplicityRange();

  /**
   * Returns CwmStereotype class proxy object.
   * 
   * @return CwmStereotype class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmStereotypeClass getCwmStereotype();

  /**
   * Returns CwmTaggedValue class proxy object.
   * 
   * @return CwmTaggedValue class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmTaggedValueClass getCwmTaggedValue();

  /**
   * Returns ClassifierFeature association proxy object.
   * 
   * @return ClassifierFeature association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ClassifierFeature getClassifierFeature();

  /**
   * Returns DependencyClient association proxy object.
   * 
   * @return DependencyClient association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.DependencyClient getDependencyClient();

  /**
   * Returns DependencySupplier association proxy object.
   * 
   * @return DependencySupplier association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.DependencySupplier getDependencySupplier();

  /**
   * Returns ElementConstraint association proxy object.
   * 
   * @return ElementConstraint association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ElementConstraint getElementConstraint();

  /**
   * Returns ElementOwnership association proxy object.
   * 
   * @return ElementOwnership association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ElementOwnership getElementOwnership();

  /**
   * Returns ImportedElements association proxy object.
   * 
   * @return ImportedElements association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.ImportedElements getImportedElements();

  /**
   * Returns RangeMultiplicity association proxy object.
   * 
   * @return RangeMultiplicity association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.RangeMultiplicity getRangeMultiplicity();

  /**
   * Returns StereotypeConstraints association proxy object.
   * 
   * @return StereotypeConstraints association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.StereotypeConstraints getStereotypeConstraints();

  /**
   * Returns StereotypedElement association proxy object.
   * 
   * @return StereotypedElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.StereotypedElement getStereotypedElement();

  /**
   * Returns StereotypeTaggedValues association proxy object.
   * 
   * @return StereotypeTaggedValues association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.StereotypeTaggedValues getStereotypeTaggedValues();

  /**
   * Returns StructuralFeatureType association proxy object.
   * 
   * @return StructuralFeatureType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.StructuralFeatureType getStructuralFeatureType();

  /**
   * Returns TaggedElement association proxy object.
   * 
   * @return TaggedElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.TaggedElement getTaggedElement();
}
