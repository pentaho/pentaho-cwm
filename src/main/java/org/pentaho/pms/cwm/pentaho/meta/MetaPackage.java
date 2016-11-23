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

package org.pentaho.pms.cwm.pentaho.meta;

/**
 * Meta package interface. CWM Metadata Container
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface MetaPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns nested package Core.
   * 
   * @return Proxy object related to nested package Core.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CorePackage getCore();

  /**
   * Returns nested package Behavioral.
   * 
   * @return Proxy object related to nested package Behavioral.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.BehavioralPackage getBehavioral();

  /**
   * Returns nested package Relationships.
   * 
   * @return Proxy object related to nested package Relationships.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relationships.RelationshipsPackage getRelationships();

  /**
   * Returns nested package Instance.
   * 
   * @return Proxy object related to nested package Instance.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.InstancePackage getInstance();

  /**
   * Returns nested package BusinessInformation.
   * 
   * @return Proxy object related to nested package BusinessInformation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.BusinessInformationPackage getBusinessInformation();

  /**
   * Returns nested package DataTypes.
   * 
   * @return Proxy object related to nested package DataTypes.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.DataTypesPackage getDataTypes();

  /**
   * Returns nested package Expressions.
   * 
   * @return Proxy object related to nested package Expressions.
   */
  public org.pentaho.pms.cwm.pentaho.meta.expressions.ExpressionsPackage getExpressions();

  /**
   * Returns nested package KeysIndexes.
   * 
   * @return Proxy object related to nested package KeysIndexes.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.KeysIndexesPackage getKeysIndexes();

  /**
   * Returns nested package SoftwareDeployment.
   * 
   * @return Proxy object related to nested package SoftwareDeployment.
   */
  public org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.SoftwareDeploymentPackage getSoftwareDeployment();

  /**
   * Returns nested package TypeMapping.
   * 
   * @return Proxy object related to nested package TypeMapping.
   */
  public org.pentaho.pms.cwm.pentaho.meta.typemapping.TypeMappingPackage getTypeMapping();

  /**
   * Returns nested package Relational.
   * 
   * @return Proxy object related to nested package Relational.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.RelationalPackage getRelational();

  /**
   * Returns nested package Multidimensional.
   * 
   * @return Proxy object related to nested package Multidimensional.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.MultidimensionalPackage getMultidimensional();

  /**
   * Returns nested package Transformation.
   * 
   * @return Proxy object related to nested package Transformation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.transformation.TransformationPackage getTransformation();

  /**
   * Returns nested package Olap.
   * 
   * @return Proxy object related to nested package Olap.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.OlapPackage getOlap();
}
