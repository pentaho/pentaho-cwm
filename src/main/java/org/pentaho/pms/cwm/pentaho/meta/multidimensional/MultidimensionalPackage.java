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

package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * Multidimensional package interface. The CWM Multidimensional metamodel is a generic representation of a
 * multidimensional database. Multidimensional databases are OLAP databases that are directly implemented by multid
 * imensional database systems. In a multidimensional database, key OLAP const ructs (dimensions, hierarchies, etc.) are
 * represented by the internal da ta structures of a ultidimensional database server, and common OLAP operations
 * (consolidation, drill-down, etc.) are performed by the server acting on t hose data structures. Multidimensional
 * databases are often classified as "physical OLAP" or "MOLAP" (memory -based OLAP) databases. Multidimensional
 * databases offer enhanced performance and flexibility over OLAP syste ms that simulate multidimensional functionality
 * using other technologies (e .g., relational database or spreadsheet): Performance: Multidimensional databases provide
 * rapid consolidation times and formula calculations, and consistent query response times regardless of query comp
 * lexity. This is accomplished, in part, through the use of efficient cell storage techniques and highly-optimized
 * index paths. Flexibility: The specification and use of multidimensional schemas and queries (inclu ding the design of
 * cubes, dimensions, hierarchies, member formulas, the man ipulation of query result sets, etc.) can be accomplished in
 * a relativel y straight-forward manner, since the server directly supports (and exposes) th e multidimensional
 * paradigm. The CWM Multidimensional metamodel does not attempt to provide a complete representat ion of all aspects of
 * commercially available, multidimensional databases. U nlike relational database management systems, multidimensional
 * databases tend to be proprietary in structure, and there are no published, widely agree d upon, standard
 * representations of the logical schema of a multidimension al database. Therefore, the CWM Multidimensional Database
 * metamodel is oriented toward complete generality of specification. Tool-specific extensio ns to the metamodel are
 * relatively easy to formulate, and several examp les are provided in Volume 2, Extensions, of the CWM Specification.
 * The Multidimensional package depends on the following packages: org.omg::CWM::ObjectModel::Core
 * org.omg::CWM::ObjectModel::Instance The major classes and associations of the Multidimensional metamodel are shown in
 * Fig ure 11-1. Schema is the container of all elements comprising a Multidimensional model. It also represents the
 * logical unit of deployment of a Multidimensional database in stance. Dimension represents a physical dimension in a
 * Multidimensional database. Whereas the OLAP metamodel defines ?dimension? as a purely conceptual entity, this
 * Dimension represents the dimension object exposed by the programming model of a Multidimensional database. A
 * Dimension may reference other instances of Dimension to form arbitrarily complex dimensional structures (e.g.,
 * hierarchies with varying levels of detail). DimensionedObject represents an attribute of Dimension. Examples of
 * DimensionedObject s include measures (variables), formulas, consolidation functions, member a lias names, etc.
 * DimensionedObjects are contained by the Schema and refe renced by the Dimensions that use them. MemberSet represents
 * the collection of Members associated with an instance of Dimensi on, and MemberValue represents an instance value of
 * a Member. MemberSet, Me mber and MemberValue enable the specification and interchange of both M1 -level
 * Multidimensional models and associated M0-level data values. Figure 11-2 illustrates the inheritance of the
 * Multidimensional classes from metaclas ses of the Object Model. OCL Representation of Multidimensional Constraints
 * [C-1] A Dimension may not reference itself as a component, nor as a composite. context Dimension inv:
 * self.component->excludes( self ) inv: self.composite->excludes( self ) The transitive closure of components of an
 * instance of Dimension must not include the Dimension instance. The transitive closure of composites of an instance of
 * Dimension must not include the Dimension instance.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface MultidimensionalPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmDimension class proxy object.
   * 
   * @return CwmDimension class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionClass getCwmDimension();

  /**
   * Returns CwmDimensionedObject class proxy object.
   * 
   * @return CwmDimensionedObject class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObjectClass getCwmDimensionedObject();

  /**
   * Returns CwmMember class proxy object.
   * 
   * @return CwmMember class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmMemberClass getCwmMember();

  /**
   * Returns CwmMemberSet class proxy object.
   * 
   * @return CwmMemberSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmMemberSetClass getCwmMemberSet();

  /**
   * Returns CwmMemberValue class proxy object.
   * 
   * @return CwmMemberValue class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmMemberValueClass getCwmMemberValue();

  /**
   * Returns CwmSchema class proxy object.
   * 
   * @return CwmSchema class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmSchemaClass getCwmSchema();

  /**
   * Returns DimensionsReferenceDimensionedObjects association proxy object.
   * 
   * @return DimensionsReferenceDimensionedObjects association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.DimensionsReferenceDimensionedObjects
    getDimensionsReferenceDimensionedObjects();

  /**
   * Returns CompositesReferenceComponents association proxy object.
   * 
   * @return CompositesReferenceComponents association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CompositesReferenceComponents
    getCompositesReferenceComponents();

  /**
   * Returns MdschemaOwnsDimensionedObjects association proxy object.
   * 
   * @return MdschemaOwnsDimensionedObjects association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.MdschemaOwnsDimensionedObjects
    getMdschemaOwnsDimensionedObjects();

  /**
   * Returns MdschemaOwnsDimensions association proxy object.
   * 
   * @return MdschemaOwnsDimensions association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.MdschemaOwnsDimensions getMdschemaOwnsDimensions();

  /**
   * Returns DimensionOwnsMemberSets association proxy object.
   * 
   * @return DimensionOwnsMemberSets association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.DimensionOwnsMemberSets getDimensionOwnsMemberSets();
}
