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

package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * DataTypes package interface. The DataTypes package depends on the following packages: org.omg::CWM::ObjectModel::Core
 * The CWM DataTypes metamodel supports definition of metamodel constructs that modelers can use t o create the specific
 * data types they need. Although the CWM Foundation itself does not contain specific data type definitions, a number of
 * data typ e definitions for widely used environments are provided (in the CWM Data Ty pes chapter) as examples of the
 * appropriate usage of CWM Foundation classes for creating data type definitions. OCL Representation of DataTypes
 * Constraints [C-4-1] A TypeAlias instance cannot alias itself. context TypeAlias inv: self.type <> self [C-4-2] A
 * Union can have at most one default UnionMember instance. context Union inv: self.allFeatures->select(isDefault)->size
 * <= 1
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface DataTypesPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmEnumeration class proxy object.
   * 
   * @return CwmEnumeration class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmEnumerationClass getCwmEnumeration();

  /**
   * Returns CwmEnumerationLiteral class proxy object.
   * 
   * @return CwmEnumerationLiteral class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmEnumerationLiteralClass getCwmEnumerationLiteral();

  /**
   * Returns CwmQueryExpression class proxy object.
   * 
   * @return CwmQueryExpression class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmQueryExpressionClass getCwmQueryExpression();

  /**
   * Returns CwmTypeAlias class proxy object.
   * 
   * @return CwmTypeAlias class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmTypeAliasClass getCwmTypeAlias();

  /**
   * Returns CwmUnion class proxy object.
   * 
   * @return CwmUnion class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnionClass getCwmUnion();

  /**
   * Returns CwmUnionMember class proxy object.
   * 
   * @return CwmUnionMember class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmUnionMemberClass getCwmUnionMember();

  /**
   * Returns ClassifierAlias association proxy object.
   * 
   * @return ClassifierAlias association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.ClassifierAlias getClassifierAlias();

  /**
   * Returns EnumerationLiterals association proxy object.
   * 
   * @return EnumerationLiterals association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.EnumerationLiterals getEnumerationLiterals();

  /**
   * Returns UnionDiscriminator association proxy object.
   * 
   * @return UnionDiscriminator association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.datatypes.UnionDiscriminator getUnionDiscriminator();
}
