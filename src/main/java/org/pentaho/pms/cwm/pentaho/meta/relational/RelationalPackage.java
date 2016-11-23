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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * Relational package interface. The Relational package describes data accessible through a relational interface such as
 * a native RDBMS, ODBC, or JDBC. The Relational package is based on the [SQL] standard section concerning RDBMS
 * catalogs. The scope of the top level container, Catalog, is intended to cover all the tabl es a user can use in a
 * single statement. A catalog is also the unit whi ch is managed by a data resource. A catalog contains schemas which
 * them selves contain tables. Tables are made of columns which have an associat ed data type. The Relational package
 * uses constructs in the ObjectModel package to describe th e object extensions added to SQL by the [SQL] standards.
 * The Relational package also addresses the issues of indexing, primary keys and f oreign keys by extending the
 * corresponding concepts from the Foundation packages. The Relational package depends on the following packages:
 * org.omg::CWM::ObjectModel::Behavioral org.omg::CWM::ObjectModel::Core org.omg::CWM::ObjectModel::Instance
 * org.omg::CWM::Foundation::DataTypes org.omg::CWM::Foundation::KeysIndexes The Relational package references the
 * ObjectModel and Foundation packages. OCL Representation of Relational Constraints [C-1] temporaryScope is valid only
 * if the isTemporary is True. context Tabl e inv: self.temporaryScope.notEmpty implies self.isTemporary=True [C-2]
 * checkOption is valid only if isReadOnly is False. context View inv: self.checkOption implies self.isReadOnly=False
 * [C-3] scale is valid only if precision is specified. context Column inv: self.scale.nonEmpty implies
 * self.precision.notEmpty
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface RelationalPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns nested package Enumerations.
   * 
   * @return Proxy object related to nested package Enumerations.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.EnumerationsPackage getEnumerations();

  /**
   * Returns CwmCatalog class proxy object.
   * 
   * @return CwmCatalog class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmCatalogClass getCwmCatalog();

  /**
   * Returns CwmSchema class proxy object.
   * 
   * @return CwmSchema class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSchemaClass getCwmSchema();

  /**
   * Returns CwmColumnSet class proxy object.
   * 
   * @return CwmColumnSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumnSetClass getCwmColumnSet();

  /**
   * Returns CwmNamedColumnSet class proxy object.
   * 
   * @return CwmNamedColumnSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSetClass getCwmNamedColumnSet();

  /**
   * Returns CwmTable class proxy object.
   * 
   * @return CwmTable class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmTableClass getCwmTable();

  /**
   * Returns CwmView class proxy object.
   * 
   * @return CwmView class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmViewClass getCwmView();

  /**
   * Returns CwmQueryColumnSet class proxy object.
   * 
   * @return CwmQueryColumnSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmQueryColumnSetClass getCwmQueryColumnSet();

  /**
   * Returns CwmSqldataType class proxy object.
   * 
   * @return CwmSqldataType class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldataTypeClass getCwmSqldataType();

  /**
   * Returns CwmSqldistinctType class proxy object.
   * 
   * @return CwmSqldistinctType class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldistinctTypeClass getCwmSqldistinctType();

  /**
   * Returns CwmSqlsimpleType class proxy object.
   * 
   * @return CwmSqlsimpleType class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlsimpleTypeClass getCwmSqlsimpleType();

  /**
   * Returns CwmSqlstructuredType class proxy object.
   * 
   * @return CwmSqlstructuredType class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlstructuredTypeClass getCwmSqlstructuredType();

  /**
   * Returns CwmColumn class proxy object.
   * 
   * @return CwmColumn class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumnClass getCwmColumn();

  /**
   * Returns CwmProcedure class proxy object.
   * 
   * @return CwmProcedure class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmProcedureClass getCwmProcedure();

  /**
   * Returns CwmTrigger class proxy object.
   * 
   * @return CwmTrigger class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmTriggerClass getCwmTrigger();

  /**
   * Returns CwmSqlindex class proxy object.
   * 
   * @return CwmSqlindex class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlindexClass getCwmSqlindex();

  /**
   * Returns CwmUniqueConstraint class proxy object.
   * 
   * @return CwmUniqueConstraint class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmUniqueConstraintClass getCwmUniqueConstraint();

  /**
   * Returns CwmForeignKey class proxy object.
   * 
   * @return CwmForeignKey class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmForeignKeyClass getCwmForeignKey();

  /**
   * Returns CwmSqlindexColumn class proxy object.
   * 
   * @return CwmSqlindexColumn class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlindexColumnClass getCwmSqlindexColumn();

  /**
   * Returns CwmPrimaryKey class proxy object.
   * 
   * @return CwmPrimaryKey class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmPrimaryKeyClass getCwmPrimaryKey();

  /**
   * Returns CwmRow class proxy object.
   * 
   * @return CwmRow class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmRowClass getCwmRow();

  /**
   * Returns CwmColumnValue class proxy object.
   * 
   * @return CwmColumnValue class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumnValueClass getCwmColumnValue();

  /**
   * Returns CwmCheckConstraint class proxy object.
   * 
   * @return CwmCheckConstraint class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmCheckConstraintClass getCwmCheckConstraint();

  /**
   * Returns CwmRowSet class proxy object.
   * 
   * @return CwmRowSet class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmRowSetClass getCwmRowSet();

  /**
   * Returns CwmSqlparameter class proxy object.
   * 
   * @return CwmSqlparameter class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqlparameterClass getCwmSqlparameter();

  /**
   * Returns TriggerUsingColumnSet association proxy object.
   * 
   * @return TriggerUsingColumnSet association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.TriggerUsingColumnSet getTriggerUsingColumnSet();

  /**
   * Returns TableOwningTrigger association proxy object.
   * 
   * @return TableOwningTrigger association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.TableOwningTrigger getTableOwningTrigger();

  /**
   * Returns ColumnSetOfStructuredType association proxy object.
   * 
   * @return ColumnSetOfStructuredType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.ColumnSetOfStructuredType getColumnSetOfStructuredType();

  /**
   * Returns ColumnRefStructuredType association proxy object.
   * 
   * @return ColumnRefStructuredType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.ColumnRefStructuredType getColumnRefStructuredType();

  /**
   * Returns ColumnOptionsColumnSet association proxy object.
   * 
   * @return ColumnOptionsColumnSet association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.ColumnOptionsColumnSet getColumnOptionsColumnSet();

  /**
   * Returns DistinctTypeHasSimpleType association proxy object.
   * 
   * @return DistinctTypeHasSimpleType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.DistinctTypeHasSimpleType getDistinctTypeHasSimpleType();
}
