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

package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * Transformation package interface. A key aspect of data warehousing is to extract, transform, and load data from
 * operational resources to a data warehouse or data mart for analysis. Extr action, transformation, and loading can all
 * be characterized as transformations. In fact, whenever data needs to be converted from one form to another in data
 * ware housing, whether for storage, retrieval, or presentation purposes, transformations are involved. Transformation,
 * therefore, is central to data warehousing. The Transformation package contains classes and associations that represe
 * nt common transformation metadata used in data warehousing. It covers basic transfo rmations among all types of data
 * sources and targets: object-oriented, relational, record, multidimensional, XML, OLAP, and data mining. The
 * Transformation package is designed to enable interchange of common me tadata about transformation tools and
 * activities. Specifically it is desig ned to: 1. Relate a transformation with its data sources and targets. These data
 * sources and targets can be of any type (e.g., object-oriented, relational) or granularity (e.g., class, attribute,
 * table, column). They can be persistent (e.g. , stored in a relational database) or transient. 2. Accommodate both
 * "black box" and "white box" transformations. In the c ase of "black box" transformations, data sources and targets
 * are related t o a transformation and to each other at a coarse-grain level. We know the data source s and targets are
 * related through the transformation, but we don?t know h ow a specific piece of a data source is related to a specific
 * piece of a dat a target. In the case of "white box" transformations, however, data sou rces and targets are related
 * to a transformation and to each other at a fine-gr ain level. We know exactly how a specific piece of a data source
 * is rela ted to a specific piece of a data target through a specific part of the trans formation. 3. Allow grouping of
 * transformations into logical units. At the functiona l level, a logical unit defines a single unit of work, within
 * which all tr ansformations must be executed and completed together. At the execution level, logica l units can be
 * used to define the execution grouping and sequencing (eith er explicitly through precedence constraints or implicitly
 * through data depe ndencies). A key consideration here is that both parallel and sequentia l executions (or a
 * combination of both) can be accommodated. The Transformation package assumes the existence of the following package s
 * that represent types of potential data sources or targets: ObjectModel ( object-oriented), Relational, Record,
 * Multidimensional, XML, OLAP, and Data Mining. T he Transformation package is an integral part of the following
 * packages: OLAP, Data Mining, Warehouse Process, and Warehouse Operation. In particular , the Transformation and
 * Warehouse Process packages together provide me tamodel constructs that facilitate scheduling and execution in data
 * warehousing , and the Transformation and Warehouse Operation packages together provi de metamodel constructs that
 * enable data lineage in data warehousing. This section provides a description of the main features of the Transform
 * ation package, as illustrated in Figure 13-1 (see specification document for figure). A transformation transforms a
 * set of source objects into a set of target objects. The elements of a data object set can be any ObjectModel model el
 * ements, but typically are tables, columns, or model elements that represent transient , in memory, objects. Data
 * object sets can be both sources and targets fo r different transformations. In particular, a given data object set
 * can be t he target of one transformation and the source of one or more transform ations within the same logical unit.
 * This is often the case with transformation that produce and consume temporary objects. Transformations allow a wide
 * range of types (and granularity) to be defin ed for their data sources and targets. For example, the source type of a
 * t ransformation can be an XML schema while the target type is a column, if the transfor mation deals with storing an
 * XML document in a column of a relational dat abase. More typically, the source types of a transformation are classes
 * and attributes while the target types are tables and columns, or vice versa , if the transformation deals with
 * converting object data into relational data, or vice versa. Existing programs, queries, or rules (in fact, any
 * ObjectModel operations ) can be used to perform a transformation by associating them with the tra nsformation using
 * the transformation use dependency. Transformations can be grouped into logical units. At the functional leve l, they
 * are grouped into transformation tasks, each of which defines a set of transformations that must be executed and
 * completed together - a logical unit of work. At the execution level, transformation steps are used to coordinate the
 * flow of control between transformation tasks, with each transformation step executing a single transformation task.
 * The transformation steps a re further grouped into transformation activities. Within each transformation activity,
 * the execution sequence of its transf ormation steps are defined either explicitly by using the step precedence
 * dependency or precedence constraint, or implicitly through data dependency. There are certain "white-box"
 * transformations which are commonly used and which can relate data sources and targets to a transformation and to each
 * other at a detailed level. These transformations are convenient to use and they prov ide data lineage at a fine-grain
 * level. One such transformation is the tr ansformation map which consists of a set of classifier maps that in turn con
 * sists of a set of feature maps or classifier-feature maps. The other is the transformation tree, which represents a
 * transformation as an unary or bina ry expression tree. For an example usage of the transformation map, plea se see
 * Figure 13-4. The Transformation package depends on the following packages: omg.org::CWM::ObjectModel::Behavioral
 * omg.org::CWM::ObjectModel::Core omg.org::CWM::Foundation::Expressions omg.org::CWM::Foundation::SoftwareDeployment
 * The CWM uses packages to control complexity and create groupings of logic ally interrelated classes and associations.
 * The Transformation package is one such package. Within the Transformation package itself, however, the definition o f
 * subpackages is purposefully left out to reduce the length and complexit y of the fully qualified names of
 * Transformation classes and associations. T here are, however, several groupings of classes and associations that f
 * orm related sets of functionality within the Transformation package. Although s eparate subpackages have not been
 * created for these functional areas, th eir identification improves the understandability of the Transformation packa
 * ge. The Transformation package contains metamodel elements that support the f ollowing functions: 1. Transformation
 * and data lineage. These classes and associations deal w ith transformations and their sources, targets, constraints,
 * and operation s. 2. Transformation grouping and execution. These classes and associations deal with grouping of
 * transformations to form logical units and to define execution sequences. 3. Specialized transformations. These
 * classes and associations define spe cialized, "white box", transformations that are commonly used in data ware
 * housing. The specific Transformation classes and associations supporting each functio nal area are delineated in
 * Table 13-1 (see specification document for tab le). The metamodel diagram for the Transformation package is split
 * into four p arts. The first two diagrams show the Transformation classes and associati ons, while the last two show
 * the inheritance hierarchy. 13.5 OCL Representation of Transformation Constraints [C-1] The preceding step and
 * succeeding step of StepPrecedence must not b e the same. context StepPrecedence inv: self.precedingStep->forAll( p |
 * self.succeedingStep->forAll( q | p < > q ) ) [C-2] A TransformationTask may not be its own inverse task. Identifies
 * the Transformation context TransformationTask inv: self.inverseTask->forAll( p | p <> self ) [C-3] A
 * TransformationTask may not be its own original task. context TransformationTask inv: self.originalTask->forAll( p | p
 * <> self ) [C-4] The ClassifierMapToCFMap association is derived from the Namespace- ModelElement association. All
 * ownedElement ends of the association must be ClassifierFeatureMaps. context ClassifierMapToCFMap inv
 * Namespace-ModelElement.allInstances.select( ownedElement.oclIsKindOf( ClassifierFeatureMap ) ) [C-5] The
 * ClassifierMapToFeatureMap association is derived from the Names pace-ModelElement association. All ownedElement ends
 * of the association mu st be FeatureMaps. context ClassifierMapToFeatureMap inv
 * Namespace-ModelElement.allInstances.select( ownedElement.oclIsKindOf( FeatureMap ) )
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface TransformationPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmTransformation class proxy object.
   * 
   * @return CwmTransformation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationClass getCwmTransformation();

  /**
   * Returns CwmDataObjectSet class proxy object.
   * 
   * @return CwmDataObjectSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmDataObjectSetClass getCwmDataObjectSet();

  /**
   * Returns CwmTransformationTask class proxy object.
   * 
   * @return CwmTransformationTask class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTaskClass getCwmTransformationTask();

  /**
   * Returns CwmTransformationStep class proxy object.
   * 
   * @return CwmTransformationStep class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationStepClass getCwmTransformationStep();

  /**
   * Returns CwmTransformationActivity class proxy object.
   * 
   * @return CwmTransformationActivity class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationActivityClass getCwmTransformationActivity();

  /**
   * Returns CwmPrecedenceConstraint class proxy object.
   * 
   * @return CwmPrecedenceConstraint class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmPrecedenceConstraintClass getCwmPrecedenceConstraint();

  /**
   * Returns CwmTransformationUse class proxy object.
   * 
   * @return CwmTransformationUse class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationUseClass getCwmTransformationUse();

  /**
   * Returns CwmTransformationMap class proxy object.
   * 
   * @return CwmTransformationMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationMapClass getCwmTransformationMap();

  /**
   * Returns CwmTransformationTree class proxy object.
   * 
   * @return CwmTransformationTree class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTreeClass getCwmTransformationTree();

  /**
   * Returns CwmClassifierMap class proxy object.
   * 
   * @return CwmClassifierMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierMapClass getCwmClassifierMap();

  /**
   * Returns CwmFeatureMap class proxy object.
   * 
   * @return CwmFeatureMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmFeatureMapClass getCwmFeatureMap();

  /**
   * Returns CwmStepPrecedence class proxy object.
   * 
   * @return CwmStepPrecedence class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmStepPrecedenceClass getCwmStepPrecedence();

  /**
   * Returns CwmClassifierFeatureMap class proxy object.
   * 
   * @return CwmClassifierFeatureMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CwmClassifierFeatureMapClass getCwmClassifierFeatureMap();

  /**
   * Returns TransformationSource association proxy object.
   * 
   * @return TransformationSource association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TransformationSource getTransformationSource();

  /**
   * Returns TransformationTarget association proxy object.
   * 
   * @return TransformationTarget association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TransformationTarget getTransformationTarget();

  /**
   * Returns TransformationStepTask association proxy object.
   * 
   * @return TransformationStepTask association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TransformationStepTask getTransformationStepTask();

  /**
   * Returns InverseTransformationTask association proxy object.
   * 
   * @return InverseTransformationTask association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.InverseTransformationTask getInverseTransformationTask();

  /**
   * Returns DataObjectSetElement association proxy object.
   * 
   * @return DataObjectSetElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.DataObjectSetElement getDataObjectSetElement();

  /**
   * Returns TransformationTaskElement association proxy object.
   * 
   * @return TransformationTaskElement association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TransformationTaskElement getTransformationTaskElement();

  /**
   * Returns ClassifierMapToFeatureMap association proxy object.
   * 
   * @return ClassifierMapToFeatureMap association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.ClassifierMapToFeatureMap getClassifierMapToFeatureMap();

  /**
   * Returns ClassifierMapToCfmap association proxy object.
   * 
   * @return ClassifierMapToCfmap association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.ClassifierMapToCfmap getClassifierMapToCfmap();

  /**
   * Returns ClassifierMapSource association proxy object.
   * 
   * @return ClassifierMapSource association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.ClassifierMapSource getClassifierMapSource();

  /**
   * Returns ClassifierMapTarget association proxy object.
   * 
   * @return ClassifierMapTarget association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.ClassifierMapTarget getClassifierMapTarget();

  /**
   * Returns FeatureMapTarget association proxy object.
   * 
   * @return FeatureMapTarget association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.FeatureMapTarget getFeatureMapTarget();

  /**
   * Returns FeatureMapSource association proxy object.
   * 
   * @return FeatureMapSource association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.FeatureMapSource getFeatureMapSource();

  /**
   * Returns CfmapClassifier association proxy object.
   * 
   * @return CfmapClassifier association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CfmapClassifier getCfmapClassifier();

  /**
   * Returns CfmapFeature association proxy object.
   * 
   * @return CfmapFeature association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.CfmapFeature getCfmapFeature();
}
