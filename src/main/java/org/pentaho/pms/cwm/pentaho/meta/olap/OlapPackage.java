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

package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * Olap package interface. Online Analytical Processing (OLAP) is a class of analytic application software that exposes
 * business data in a multidimensional format. This multidimensional format usually includes the consolidation of data
 * drawn from multiple and diverse information sources. Unlike more traditionally structured representations (e.g., the
 * tabular format of a relational database), the multidimensional orientation is a more natural expression of the way
 * business enterprises view their strategic data. For example, an analyst might use an OLAP application to examine
 * total sales revenue by product and geographic region over time, or, perhaps, compare sales margins for the same
 * fiscal periods of two consecutive years. The ultimate objective of OLAP is the efficient construction of analytical
 * models that transform raw business data into strategic business insight. There are many ways to implement OLAP. Most
 * OLAP systems are constructe d using OLAP server tools that enable logical OLAP structures to be bui lt on top of a
 * variety of physical database systems, such as relational o r native multidimensional databases. The following
 * features are generally found in most OLAP systems: Multidimensional representation of business data. Upward
 * consolidation of multidimensional data in a hierarchical man ner, possibly with the application of specialized
 * processing rules. The ability to navigate a hierarchy from a consolidated value to th e lower level values forming
 * it. Support for time-series analysis; i.e., OLAP users are generally co ncerned with data and consolidations at
 * specific points in time -- By d ate, week, quarter, etc. Support for modeling and scenario analysis -- A user should
 * be able to apply arbitrary "what-if" analyses to a result set without affectin g the stored information. Consistent
 * response times, regardless of how queries are formulated -- This is critical for effective analysis and modeling.
 * OLAP applications integrate well into the data warehousing environment, because a data warehouse provides relatively
 * clean and stable data sto res to drive the OLAP application. These data stores are usually maintain ed in relational
 * tables that can be read directly by OLAP tools or loaded into OLAP servers. These relational tables are often
 * structured in a manner tha t reveals the inherent dimensionality of the data (such as the ubiquitous Star and
 * Snowflake schemas). Also, the data transformation and mapping services provided by a data warehouse can be used to
 * supply OLAP systems with both metadata and data. Transformation-related metadata can be use d to track the lineage of
 * consolidated OLAP data back to its various sources. The primary objectives of the CWM OLAP package are: Define a
 * metamodel of essential OLAP concepts common to most OLAP s ystems. Provide a facility whereby instances of the OLAP
 * metamodel are mapp ed to deployment-capable structures (i.e., models of physical data reso urces, such as the CWM
 * Relational and Multidimensional packages). Ensure that navigation through the logical OLAP model hierarchy and its
 * various resource models is always performed in a uniform manner (i .e., by defining a standard usage of the CWM
 * Transformation package as a means of implementing these mappings). Leverage services provided by other CWM packages,
 * where appropriate (e.g., use the CWM Foundation package to supply a standard representat ion of expressions). The
 * OLAP package depends on the following packages: org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::Expressions
 * org.omg::CWM::Analysis::Transformation The major classes and associations of the OLAP metamodel are shown in F igure
 * 14-1. Schema is the logical container of all elements comprising an OLAP model. It is the root element of the model
 * hierarchy and marks t he entry point for navigating OLAP models. A Schema contains Dimensions and Cubes. A Dimension
 * is an ordinate with in a multidimensional structure and consists of a list of unique values (i.e., members) that
 * share a common semantic meaning within the domain b eing modeled. Each member designates a unique position along its
 * ordinate . A Cube is a collection of analytic values (i.e., measures) that share t he same dimensionality. This
 * dimensionality is specified by a set of un ique Dimensions from the Schema. Each unique combination of members in th
 * e Cartesian product of the Cube?s Dimensions identifies precisely one dat a cell within a multidimensional structure.
 * CubeDimensionAssociation relates a Cube to its defining Dimensions. Fea tures relevant to Cube-Dimension
 * relationships (e.g., calcHierarchy) ar e exposed by this class. A Dimension has zero or more Hierarchies. A Hierarchy
 * is an organizatio nal structure that describes a traversal pattern through a Dimension, b ased on parent/child
 * relationships between members of a Dimension. Hierar chies are used to define both navigational and
 * consolidation/computationa l paths through the Dimension (i.e., a value associated with a child member is a ggregated
 * by one or more parents). For example, a Time Dimension with a b ase periodicity of days might have a Hierarchy
 * specifying the consolidation of days into weeks, weeks into months, mon ths into quarters, and quarters into years. A
 * specific Hierarchy may be designated as the default Hierarchy for dis play purposes (e.g., a user interface that
 * displays the Dimension as a hierarchical tree of members). CubeDimensionAssociation can also identif y a particular
 * Hierarchy as the default Hierarchy for consolidation calcu lations performed on the Cube. MemberSelection models
 * mechanisms capable of partitioning a Dimension?s collection of members. For example, consider a Geography Dimension
 * wit h members representing cities, states, and regions. An OLAP client intere sted specifically in cities might
 * define an instance of MemberSelection t hat extracts the city members. CubeRegion models a sub-unit of a Cube that is
 * of the same dimensionali ty as the Cube itself. Each "dimension" of a CubeRegion is represented by a MemberSelection
 * of the corresponding Dimension of the Cube. Each Me mberSelection may define some subset of its Dimension?s members.
 * CubeRegions are used to implement Cubes. A Cube may be realized by a se t of CubeRegions that map portions of the
 * logical Cube to physical data sources. The MemberSelections defining CubeRegions can also be grouped t ogether via
 * MemberSelectionGroups, enabling the definition of CubeRegions with specific semantics. For example, one can specify a
 * CubeRegion containing o nly the "input level" data cells of a Cube. A CubeRegion may own any number of
 * CubeDeployments. CubeDeployment is a metaclass that represents an implementation strategy for a multidimens ional
 * structure. The ordering of the CubeDeployment classes may optionall y be given some implementation-specific meaning
 * (e.g., desired order of s election of several possible deployment strategies, based on optimization consid erations).
 * The OLAP metamodel defines two special types of Dimension: Time and Mea sure. A Time Dimension provides a means of
 * representing time-series dat a within a multidimensional structure. The members of a Time Dimension us ually define
 * some base periodicity (e.g., days of the week). The implemen tation of a Time Dimension might provide support for
 * advanced "time-intelligent" functionality, such as the ability to automatically convert between diff erent
 * periodicities and calendars. The members of a Measure Dimension describe the meaning of the analytic values stored in
 * each data cell of a multidimensional structure. For e xample, an OLAP application may define Sales, Quantity and
 * Weight as its measures. In this case, each data cell within the Cube stores three value s, with each value
 * corresponding to one of the three measures. A measure may hav e an associated data type. For example, Sales might be
 * of a monetary type , Quantity an integer, and Weight a real number. The OLAP metamodel specifies two subclasses of
 * Hierarchy: LevelBasedHie rarchy and ValueBasedHierarchy. LevelBasedHierarchy describes hierarchical relationships
 * between specif ic levels of a Dimension. LevelBasedHierarchy is used to model both "pu re
 * level" hierarchies (e.g., dimension-level tables) and "mixed" hierarch ies (i.e., levels plus linked nodes).
 * Dimensional levels are modeled by t he Level class, a subclass of MemberSelection that partitions a Dimension?s memb
 * ers into disjoint subsets, each representing a distinct level. For example, the Geography Dimension cited earlier
 * contains members rep resenting cities, states, and regions, such as "Stamford", "Connecticut
 * ", and "NorthEast". It might also contain a single member called "USA" re presenting all regions of the United
 * States. Therefore, the Geography Dim ension could have four Levels named "City", "State", 'Region", and "ALL", respec
 * tively. Each Level specifies the subset of members belonging to it: All c ities belong to the "City" Level, all
 * states belong to the "State" Level , all regions belong to the "Region" Level, and the single "USA" member belongs to
 * the "ALL" Level. When used in the definition of a consolidation path, the meaning of "le vel" is quite clear: Members
 * occupying a given Level consolidate into t he next higher Level (e.g., City rolls up into State, State into Region,
 * and Region into ALL). LevelBasedHierarchy contains an ordered collection of HierarchyLevelAss ocations that defines
 * the natural hierarchy of the Dimension. The order ing defines the hierarchical structure in top-down fashion (i.e.,
 * the "fi rst" HierarchyLevelAssociation in the ordered collection represents the u pper-most level of the dimensional
 * hierarchy). A HierarchyLevelAssociation may own any number of DimensionDeployments. DimensionDeployment is a
 * metaclass that represents an implementation s trategy for hierarchical Dimensions. The ordering of the
 * DimensionDeploym ent classes may optionally be given an implementation-specific meaning (e .g., desired order of
 * selection of several possible deployment strategies, based on optimization considerations). A ValueBasedHierarchy
 * defines a hierarchical ordering of members in whi ch the concept of level has little or no significance. Instead, the
 * top ological structure of the hierarchy conveys meaning. ValueBasedHierarchie s are often used to model situations
 * where members are classified or rank ed according to their distance from a common root member (e.g., an organizationa
 * l chart of a corporation). In this case, each member of the hierarchy has some specific "metric" or "value"
 * associated it with it. ValueBasedHier archy can be used to model pure "linked node" hierarchies (e.g., asymmetric
 * hierarchical graphs or parent-child tables). As with LevelBasedHierarchy, ValueBasedHierarchy also has an ordered co
 * llection of dimensionDeployments, where the ordering semantics are left to implementations to define. Figure 14-3
 * illustrates how classes of the OLAP metamodel inherit from the CWM Object Model. Two classes requiring further
 * explanation are: Measure: A subclass of Attribute that describes the meaning of valu es stored in the data cells of a
 * multidimensional structure. Different OLAP models often give different interpretations to the term "measure". I n a
 * relational Star Schema, individual measures might be represented by n on-key columns of a Fact table (e.g., "Sales"
 * and "Quantity" columns). In this c ase, measure may be an attribute of a Cube or CubeRegion that models the Fact
 * table. On the other hand, measures can also be represented by members of a Measure Dimension. A Fact table sup
 * porting this representation has a single Measure column with column val ues consisting of the members "Sales" and
 * "Quantity", and a single "value " column (i.e., an implicit data dimension) storing the corresponding mea sure
 * values. A similar notion of Measure Dimension is used in modeling pure hype rcube representations of multidimensional
 * servers. Thus, the concept of measure can be represent ed either as a Dimenson or as an Attribute, depending on the
 * type of OL AP system being modeled. Coded Level: A subclass of Level that assigns a unique encoding, or label, to
 * each of its members. CodedLevel is not essential to the OLAP metamodel, but is provided as a helper class for certain
 * applications th at might benefit from the ability of OLAP systems to structure data hiera rchically. For example,
 * CodedLevel could be used to model systems of nomenclatur e or classification. The CWM OLAP metamodel describes
 * logical models of OLAP systems, but do es not directly specify how an OLAP system is physically deployed. Mode ling
 * the deployment of an OLAP system requires mapping instances of OLAP metaclasses to instances of other CWM metaclasses
 * representing physical r esources (e.g., mapping an OLAP Dimension to a Relational Table). This approach offers
 * several advantages: The status of the OLAP metamodel as a conceptual model is preserved by this level of indirection.
 * When using OLAP, a client may perceive t o be working directly with OLAP objects, but the actual implementation of
 * those objects is hidden from the client. For example, a client may view a member as a value of a Dimension, but
 * whether that member value comes from a r ow of a relational table, or from a cell in a multidimensional database, is
 * usually not obvious to the client. On the other hand, if a client nee ds to determine how a logical OLAP structure is
 * physically realized, the metadata describing this mapping is fully available (assuming that the implementation allows
 * the client to drill-down through the metadata). The possibility of defining mappings based on expressions means tha t
 * the amount of metadata required to describe large models (e.g., Dimen sions containing large collections of members)
 * can be kept within reasona ble bounds. It is generally more efficient to provide expressions that sp ecify where
 * large metadata sets reside, how to connect to them, and how to map t heir contents, rather than representing them
 * directly as part of the meta data content. All of the OLAP metaclasses are potential candidates for such deploymen t
 * mappings. In addition, some OLAP models may also define mappings betw een several OLAP metaclass instances, forming a
 * natural hierarchy of logi cal objects (e.g., Dimension Attributes are mapped to Level Attributes wh ich, in turn, are
 * mapped to Table Columns). The CWM Transformation package is used as the primary means of describi ng these mappings.
 * A modeler constructing an OLAP model based on CWM wi ll generally define instances of the TransformationMap metaclass
 * to link logical OLAP objects together, and to link those logical objects to other objects representing their physical
 * data sources. StructureMap is a subclass of TransformationMap that models structure-o riented transformation mappings
 * (i.e., member identity and hierarchical structure). This type of transformation mapping needs to be connected to the
 * OLAP metamodel in a very specific way (according to Level and Hierar chy), so the StructureMap subclass is defined to
 * make these associations explici t. Two specific usages of StructureMap are defined: ListOfValues, which m aps
 * attributes identifying members residing at a specific Level, or at a specific Level within a particular Hierarchy,
 * and ImmediateParent, whic h maps attributes identifying the hierarchical parent(s) of the members. On the other hand,
 * relatively simple TransformationMaps can be defined within any OLAP model to represent attribute-oriented
 * transformations ( e.g., mapping Dimension Attributes to Table Columns that store attribute values). ContentMap is a
 * subclass of TransformationMap that models content-orien ted transformaton mappings (i.e., cell data or measure
 * values). For exa mple, an instance of ContentMap might be used to map each of a CubeRegion ?s Measures to Columns of
 * an underlying Fact Table. Note that, in either case (structural mapping or content mapping), the traversal patterns
 * used by any CWM OLAP implementation are always the s ame, since both deployment mappings are based on the same usage
 * of CWM Tr ansformationMaps. In addition to representing structural mappings, instan ces of TransformationMap and its
 * subclasses are also capable of storing implemen tation-dependent functions or procedures that yield the instance
 * values a ssociated with mapped model elements. For example, a "list of values" St ructureMap might store an SQL
 * statement such as "select memberName from Product where productFamily = ?consumerElectronics? ", as the value of i ts
 * formula attribute. Figure 14-4 illustrates the CWM metaclasses and associations that descr ibe deployment mappings
 * between logical OLAP models and physical resour ce models. Note that it is possible to combine both Cube (content)
 * and Di mension (structure) deployments together within the context of a single O LAP Schema (via the DeploymentGroup
 * metaclass). Thus, an OLAP Schema can have se veral possible deployments that users may select based on
 * implementation- specific considerations (e.g., physical optimizations). OCL Representation of OLAP Constraints [C-1]
 * Ensure that the Dimensions defining a Cube are unique. context Cube inv: self.cubeDimensionAssociation->forAll( c1,
 * c2 | c1 <> c2 implies c1.dimension <> c2.dimension ) [C-2] A Cube without CubeRegions cannot be mapped to a
 * deployment struc ture (i.e., physical source of data). context Cube inv: self.cubeRegion->isEmpty implies
 * self.isVirtual = true [C-3] If a calcHierarchy is defined, it must be a Hierarchy owned by th e Dimension referenced
 * by the CubeDimensionAssociation. context CubeDimensionAssociation inv: self.calcHierarchy->notEmpty implies
 * self.calcHierarchy.dimension = sel f.dimension [C-4] A "fully realized" CubeRegion has no MemberSelectionGroups (and
 * h ence, no MemberSelections). context CubeRegion inv: self.isFullyRealized implies self.memberSelectionGroup->isEmpty
 * [C-5] A CubeRegion defined by MemberSelections must have, for each Dime nsion of its owning Cube, a corresponding
 * MemberSelection within each o f its MemberSelectionGroups. context CubeRegion inv:
 * self.memberSelectionGroup->notEmpty implies self.cube.cubeDimensionAssociation->forAll( d |
 * self.memberSelectionGroup->forAll( g | g.memberSelection->exists( m | m.dimension = d.dimension ) ) ) [C-6] A
 * CubeRegion defined by MemberSelections must have, within each M emberSelectionGroup, a MemberSelection corresponding
 * to each Dimension of its owning Cube. context CubeRegion inv: self.memberSelectionGroup->notEmpty implies
 * self.memberSelectionGroup->forAll( g | g.memberSelection->forAll( m | self.cube.cubeDimensionAssociation->exists( d |
 * d.dimension = m.dimensi on ) ) ) [C-7] A Dimension may be a Time Dimension, a Measure Dimension, or neit her, but
 * never both types at the same time. context Dimension inv: not ( self.isTime and self.isMeasure ) [C-8] The default
 * display Hierarchy (if defined) must be one of the Hie rarchies owned by the Dimension. context Dimension inv:
 * self.displayDefault->notEmpty implies self.hierarchy->includes( self.di splayDefault ) [C-9] An instance of
 * DimensionDeployment must be referenced exclusively by either a HierarchyLevelAssociation or a ValueBasedHierarchy.
 * context DimensionDeployment inv: self.hierarchyLevelAssociation->isEmpty xor self.valueBasedHierarchy->i sEmpty
 * [C-10] Within a DimensionDeployment, an "immediate parent" StructureMap must always have an associated and distinct
 * "list of values" Structure Map. context DimensionDeployment inv: self.immediateParent->notEmpty implies (
 * self.listOfValues->notEmpty and self.listOfValues <> self.immediatePa rent ) [C-11] A StructureMap referenced as a
 * "list of values" StructureMap mus t not reside outside of the DimensionDeployment?s collection of Structu reMaps.
 * context DimensionDeployment inv: self.listOfValues->notEmpty implies self.structureMap->includes( self.l istOfValues
 * ) [C-12] A StructureMap referenced as an "immediate parent" StructureMap must not reside outside of the
 * DimensionDeployment?s collection of Stru ctureMaps. context DimensionDeployment inv: self.immediateParent->notEmpty
 * implies self.structureMap->includes( self.immediateParent ) [C-13] The currentLevel of each HierarchyLevelAssociation
 * must refer to a Level owned by the Dimension of the LevelBasedHierarchy containing t he HierarchyLevelAssociation.
 * context LevelBasedHierarchy inv: self.hierarchyLevelAssociation->notEmpty implies
 * self.hierarchyLevelAssociation->forAll( h | self.dimension.memberSelection ->select( oclType = Olap::Level
 * )->includes( h.currentLevel ) ) [C-14] No two HierarchyLevelAssociations may designate the same Level i nstance as
 * their "current level". context LevelBasedHierarchy inv: self.hierarchyLevelAssociation->forAll( h1, h2 | h1 <> h2
 * implies h1.currentLevel <> h2.currentLevel )
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface OlapPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmContentMap class proxy object.
   * 
   * @return CwmContentMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmContentMapClass getCwmContentMap();

  /**
   * Returns CwmCube class proxy object.
   * 
   * @return CwmCube class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeClass getCwmCube();

  /**
   * Returns CwmCubeDeployment class proxy object.
   * 
   * @return CwmCubeDeployment class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDeploymentClass getCwmCubeDeployment();

  /**
   * Returns CwmCubeDimensionAssociation class proxy object.
   * 
   * @return CwmCubeDimensionAssociation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeDimensionAssociationClass getCwmCubeDimensionAssociation();

  /**
   * Returns CwmCubeRegion class proxy object.
   * 
   * @return CwmCubeRegion class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCubeRegionClass getCwmCubeRegion();

  /**
   * Returns CwmDeploymentGroup class proxy object.
   * 
   * @return CwmDeploymentGroup class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDeploymentGroupClass getCwmDeploymentGroup();

  /**
   * Returns CwmDimension class proxy object.
   * 
   * @return CwmDimension class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionClass getCwmDimension();

  /**
   * Returns CwmDimensionDeployment class proxy object.
   * 
   * @return CwmDimensionDeployment class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeploymentClass getCwmDimensionDeployment();

  /**
   * Returns CwmHierarchy class proxy object.
   * 
   * @return CwmHierarchy class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyClass getCwmHierarchy();

  /**
   * Returns CwmHierarchyLevelAssociation class proxy object.
   * 
   * @return CwmHierarchyLevelAssociation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociationClass getCwmHierarchyLevelAssociation();

  /**
   * Returns CwmLevelBasedHierarchy class proxy object.
   * 
   * @return CwmLevelBasedHierarchy class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelBasedHierarchyClass getCwmLevelBasedHierarchy();

  /**
   * Returns CwmMemberSelectionGroup class proxy object.
   * 
   * @return CwmMemberSelectionGroup class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelectionGroupClass getCwmMemberSelectionGroup();

  /**
   * Returns CwmMemberSelection class proxy object.
   * 
   * @return CwmMemberSelection class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelectionClass getCwmMemberSelection();

  /**
   * Returns CwmSchema class proxy object.
   * 
   * @return CwmSchema class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmSchemaClass getCwmSchema();

  /**
   * Returns CwmValueBasedHierarchy class proxy object.
   * 
   * @return CwmValueBasedHierarchy class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmValueBasedHierarchyClass getCwmValueBasedHierarchy();

  /**
   * Returns CwmLevel class proxy object.
   * 
   * @return CwmLevel class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmLevelClass getCwmLevel();

  /**
   * Returns CwmCodedLevel class proxy object.
   * 
   * @return CwmCodedLevel class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmCodedLevelClass getCwmCodedLevel();

  /**
   * Returns CwmMeasure class proxy object.
   * 
   * @return CwmMeasure class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmMeasureClass getCwmMeasure();

  /**
   * Returns CwmStructureMap class proxy object.
   * 
   * @return CwmStructureMap class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMapClass getCwmStructureMap();

  /**
   * Returns CwmHierarchyMemberSelectionGroup class proxy object.
   * 
   * @return CwmHierarchyMemberSelectionGroup class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyMemberSelectionGroupClass
    getCwmHierarchyMemberSelectionGroup();

  /**
   * Returns LevelBasedHierarchyOwnsHierarchyLevelAssociations association proxy object.
   * 
   * @return LevelBasedHierarchyOwnsHierarchyLevelAssociations association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.LevelBasedHierarchyOwnsHierarchyLevelAssociations
    getLevelBasedHierarchyOwnsHierarchyLevelAssociations();

  /**
   * Returns HierarchyLevelAssocsReferenceLevel association proxy object.
   * 
   * @return HierarchyLevelAssocsReferenceLevel association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.HierarchyLevelAssocsReferenceLevel
    getHierarchyLevelAssocsReferenceLevel();

  /**
   * Returns DimensionOwnsMemberSelections association proxy object.
   * 
   * @return DimensionOwnsMemberSelections association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionOwnsMemberSelections getDimensionOwnsMemberSelections();

  /**
   * Returns CubeOwnsCubeDimensionAssociations association proxy object.
   * 
   * @return CubeOwnsCubeDimensionAssociations association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeOwnsCubeDimensionAssociations getCubeOwnsCubeDimensionAssociations();

  /**
   * Returns CubeDimensionAssociationsReferenceDimension association proxy object.
   * 
   * @return CubeDimensionAssociationsReferenceDimension association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeDimensionAssociationsReferenceDimension
    getCubeDimensionAssociationsReferenceDimension();

  /**
   * Returns DimensionOwnsHierarchies association proxy object.
   * 
   * @return DimensionOwnsHierarchies association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionOwnsHierarchies getDimensionOwnsHierarchies();

  /**
   * Returns DimensionHasDefaultHierarchy association proxy object.
   * 
   * @return DimensionHasDefaultHierarchy association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionHasDefaultHierarchy getDimensionHasDefaultHierarchy();

  /**
   * Returns CubeDimensionAssociationsReferenceCalcHierarchy association proxy object.
   * 
   * @return CubeDimensionAssociationsReferenceCalcHierarchy association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeDimensionAssociationsReferenceCalcHierarchy
    getCubeDimensionAssociationsReferenceCalcHierarchy();

  /**
   * Returns MemberSelectionGroupReferencesMemberSelections association proxy object.
   * 
   * @return MemberSelectionGroupReferencesMemberSelections association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.MemberSelectionGroupReferencesMemberSelections
    getMemberSelectionGroupReferencesMemberSelections();

  /**
   * Returns SchemaOwnsCubes association proxy object.
   * 
   * @return SchemaOwnsCubes association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.SchemaOwnsCubes getSchemaOwnsCubes();

  /**
   * Returns SchemaOwnsDimensions association proxy object.
   * 
   * @return SchemaOwnsDimensions association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.SchemaOwnsDimensions getSchemaOwnsDimensions();

  /**
   * Returns HierarchyLevelAssociationOwnsDimensionDeployments association proxy object.
   * 
   * @return HierarchyLevelAssociationOwnsDimensionDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.HierarchyLevelAssociationOwnsDimensionDeployments
    getHierarchyLevelAssociationOwnsDimensionDeployments();

  /**
   * Returns ValueBasedHierarchyOwnsDimensionDeployments association proxy object.
   * 
   * @return ValueBasedHierarchyOwnsDimensionDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.ValueBasedHierarchyOwnsDimensionDeployments
    getValueBasedHierarchyOwnsDimensionDeployments();

  /**
   * Returns DimensionDeploymentOwnsStructureMaps association proxy object.
   * 
   * @return DimensionDeploymentOwnsStructureMaps association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionDeploymentOwnsStructureMaps
    getDimensionDeploymentOwnsStructureMaps();

  /**
   * Returns DimensionDeploymentHasListOfValues association proxy object.
   * 
   * @return DimensionDeploymentHasListOfValues association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionDeploymentHasListOfValues
    getDimensionDeploymentHasListOfValues();

  /**
   * Returns DimensionDeploymentHasImmediateParent association proxy object.
   * 
   * @return DimensionDeploymentHasImmediateParent association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DimensionDeploymentHasImmediateParent
    getDimensionDeploymentHasImmediateParent();

  /**
   * Returns CubeOwnsCubeRegions association proxy object.
   * 
   * @return CubeOwnsCubeRegions association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeOwnsCubeRegions getCubeOwnsCubeRegions();

  /**
   * Returns CubeRegionOwnsMemberSelectionGroups association proxy object.
   * 
   * @return CubeRegionOwnsMemberSelectionGroups association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeRegionOwnsMemberSelectionGroups
    getCubeRegionOwnsMemberSelectionGroups();

  /**
   * Returns CubeRegionOwnsCubeDeployments association proxy object.
   * 
   * @return CubeRegionOwnsCubeDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeRegionOwnsCubeDeployments getCubeRegionOwnsCubeDeployments();

  /**
   * Returns SchemaOwnsDeploymentGroups association proxy object.
   * 
   * @return SchemaOwnsDeploymentGroups association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.SchemaOwnsDeploymentGroups getSchemaOwnsDeploymentGroups();

  /**
   * Returns DeploymentGroupReferencesCubeDeployments association proxy object.
   * 
   * @return DeploymentGroupReferencesCubeDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DeploymentGroupReferencesCubeDeployments
    getDeploymentGroupReferencesCubeDeployments();

  /**
   * Returns DeploymentGroupReferencesDimensionDeployments association proxy object.
   * 
   * @return DeploymentGroupReferencesDimensionDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.DeploymentGroupReferencesDimensionDeployments
    getDeploymentGroupReferencesDimensionDeployments();

  /**
   * Returns CubeDeploymentOwnsContentMaps association proxy object.
   * 
   * @return CubeDeploymentOwnsContentMaps association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CubeDeploymentOwnsContentMaps getCubeDeploymentOwnsContentMaps();

  /**
   * Returns HierarchyMemberSelectionGroupReferencesHierarchy association proxy object.
   * 
   * @return HierarchyMemberSelectionGroupReferencesHierarchy association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.HierarchyMemberSelectionGroupReferencesHierarchy
    getHierarchyMemberSelectionGroupReferencesHierarchy();
}
