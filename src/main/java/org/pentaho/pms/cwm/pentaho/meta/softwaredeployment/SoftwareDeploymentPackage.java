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

package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * SoftwareDeployment package interface. The Software Deployment package depends on the following packages:
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::BusinessInformation org.omg::CWM::Foundation::TypeMapping
 * The Software Deployment package contains classes to record how the softw are in a data warehouse is used. A software
 * package is represented as a SoftwareSystem object, which is a subtype of Subsystem. A SoftwareSystem may reference
 * one or more TypeSystems that def ine the datatypes supported by the SoftwareSystem. The mappings between datatypes in
 * different TypeSystems may be recorded as TypeMappings, as de scribed in the TypeMapping metamodel. The separate
 * components of a software package are each represented as Co mponents that are either owned or imported by the
 * SoftwareSystem. When a SoftwareSyste m is installed, the deployment is recorded as a DeployedSoftwareSystem and a set
 * of DeployedComponents. A DeployedComponent represents the deployment of a specific Component on a specific computer.
 * Dependencies between DeployedComponents on the same computer may be documented as Usage dependencies between them.
 * Individual computers are represented as Machine objects, located at a Si te. A Site represents a geographical
 * location, which may be recorded at any relevant l evel of granularity, e.g. a country, a building, or a room in a
 * buildin g. Hierarchical links between Sites at different levels of granularity may be documented. A DataManager is a
 * DeployedComponent such as a DBMS or file management s ystem that provides access to data. It may be associated with
 * one or more data Package s identifying the Schema, Relational Catalog, Files or other data conta iners that it
 * provides access to. A DataProvider is a DeployedComponent that acts as a client to provide a ccess to data held by a
 * DataManager. For example, an ODBC or JDBC client on a specific Machine would be represented as a DataProvider. A
 * DataProvider may hav e several ProviderConnections, each identifying a DataManager that may be accessed using the
 * DataProvider. If a DataProvider uses a name for a data Package that is different from the actual name used by the
 * DataManager, a PackageUsage object can be added to record this. As a DataProvider is a subtype of DataManager, it is
 * possible for a Data Provider to access data from a DataManager which is actually a DataProvider acting as a client to
 * yet another DataManager. The model for the Software Deployment package is shown in three diagrams . The first diagram
 * shows the objects related to software deployment, while the second diagram displays the DataManager and DataProvider
 * area of the model. T he third diagram shows the inheritance structure for all the classes in th e Software Deployment
 * package. OCL Representation of SoftwareDeployment Constraints [C-8-1] A PackageUsage must have a single Package (or
 * subtype of Package ) as its supplier context PackageUsage inv: self.supplier->size=1 and
 * self.supplier->at(1).oclIsKindOf(Package) [C-8-2] A ProviderConnection must not associate a DataProvider with itse lf
 * context ProviderConnection inv: self.dataManager <> self.dataProvider [C-8-3] A Site must not have a containingSite
 * reference that refers to i tself. context Site inv: self.containingSite -> forAll (c | c <> self)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface SoftwareDeploymentPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmSite class proxy object.
   * 
   * @return CwmSite class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSiteClass getCwmSite();

  /**
   * Returns CwmMachine class proxy object.
   * 
   * @return CwmMachine class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmMachineClass getCwmMachine();

  /**
   * Returns CwmSoftwareSystem class proxy object.
   * 
   * @return CwmSoftwareSystem class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSoftwareSystemClass getCwmSoftwareSystem();

  /**
   * Returns CwmDeployedComponent class proxy object.
   * 
   * @return CwmDeployedComponent class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedComponentClass getCwmDeployedComponent();

  /**
   * Returns CwmDeployedSoftwareSystem class proxy object.
   * 
   * @return CwmDeployedSoftwareSystem class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDeployedSoftwareSystemClass
    getCwmDeployedSoftwareSystem();

  /**
   * Returns CwmDataManager class proxy object.
   * 
   * @return CwmDataManager class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataManagerClass getCwmDataManager();

  /**
   * Returns CwmDataProvider class proxy object.
   * 
   * @return CwmDataProvider class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmDataProviderClass getCwmDataProvider();

  /**
   * Returns CwmProviderConnection class proxy object.
   * 
   * @return CwmProviderConnection class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmProviderConnectionClass getCwmProviderConnection();

  /**
   * Returns CwmComponent class proxy object.
   * 
   * @return CwmComponent class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmComponentClass getCwmComponent();

  /**
   * Returns CwmPackageUsage class proxy object.
   * 
   * @return CwmPackageUsage class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmPackageUsageClass getCwmPackageUsage();

  /**
   * Returns RelatedSites association proxy object.
   * 
   * @return RelatedSites association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.RelatedSites getRelatedSites();

  /**
   * Returns ComponentsOnMachine association proxy object.
   * 
   * @return ComponentsOnMachine association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.ComponentsOnMachine getComponentsOnMachine();

  /**
   * Returns SiteMachines association proxy object.
   * 
   * @return SiteMachines association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.SiteMachines getSiteMachines();

  /**
   * Returns DataProviderConnections association proxy object.
   * 
   * @return DataProviderConnections association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.DataProviderConnections getDataProviderConnections();

  /**
   * Returns DataManagerConnections association proxy object.
   * 
   * @return DataManagerConnections association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.DataManagerConnections getDataManagerConnections();

  /**
   * Returns SoftwareSystemDeployments association proxy object.
   * 
   * @return SoftwareSystemDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.SoftwareSystemDeployments getSoftwareSystemDeployments();

  /**
   * Returns DataManagerDataPackage association proxy object.
   * 
   * @return DataManagerDataPackage association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.DataManagerDataPackage getDataManagerDataPackage();

  /**
   * Returns DeployedSoftwareSystemComponents association proxy object.
   * 
   * @return DeployedSoftwareSystemComponents association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.DeployedSoftwareSystemComponents
    getDeployedSoftwareSystemComponents();

  /**
   * Returns ComponentDeployments association proxy object.
   * 
   * @return ComponentDeployments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.ComponentDeployments getComponentDeployments();

  /**
   * Returns SystemTypespace association proxy object.
   * 
   * @return SystemTypespace association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.SystemTypespace getSystemTypespace();

  /**
   * Returns ComponentDesign association proxy object.
   * 
   * @return ComponentDesign association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.ComponentDesign getComponentDesign();

  /**
   * Returns DeployedComponentUsage association proxy object.
   * 
   * @return DeployedComponentUsage association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.DeployedComponentUsage getDeployedComponentUsage();
}
