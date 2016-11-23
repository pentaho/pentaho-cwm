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

package org.pentaho.pms.cwm.pentaho.meta.typemapping;

/**
 * TypeMapping package interface. The TypeMapping package depends on the following packages:
 * org.omg::CWM::ObjectModel::Core The TypeMapping package supports the mapping of data types between different systems.
 * The purpose of these mappings is to indicate data types in different systems that are su fficiently compatible that
 * data values can be interchanged between them. Multi ple mappings are allowed between any pair of types and a means of
 * identifying the preferred mapping is provided. OCL Representation of TypeMapping Constraints [C-8-1] The sourceType
 * and targetType references may not refer to the same Classifier instance. context TypeMapping inv: self.sourceType <>
 * self.targetType [C-8-2] A TypeSystem may own only Classifiers and TypeMappings. context TypeSystem inv:
 * self.ownedElement->forAll( e | e.oclIsKindOf(Classifier) or e.oclIsKindOf(TypeMapping))
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface TypeMappingPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmTypeMapping class proxy object.
   * 
   * @return CwmTypeMapping class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeMappingClass getCwmTypeMapping();

  /**
   * Returns CwmTypeSystem class proxy object.
   * 
   * @return CwmTypeSystem class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeSystemClass getCwmTypeSystem();

  /**
   * Returns MappingSource association proxy object.
   * 
   * @return MappingSource association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.typemapping.MappingSource getMappingSource();

  /**
   * Returns MappingTarget association proxy object.
   * 
   * @return MappingTarget association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.typemapping.MappingTarget getMappingTarget();
}
