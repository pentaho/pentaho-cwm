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
 * TypeMapping object instance interface. TypeMapping instances permit the creation of mappings between data types
 * defined within different environments and are used to indicate data type compatibilities that permit direct
 * assignment of values from one environment (the "source" type) into equivalent values in another environment (the
 * "target" type). For example, an integer field data type in a record-oriented DBMS (the source type) might be mapped
 * to a compatible integer data type in a relational DBMS (the target type). Whereas the actual transfer of data values
 * between environments is accomp lished using the CWM?s Transformation package, TypeMapping instances can be used the
 * identify both the permissible and preferred mappings between data types. Value interchange between a pair of data
 * types is considered pe rmissible if a TypeMapping instance is defined for the pair. A TypeMapping in stance is
 * considered the preferred mapping if the instance?s isBestMatch attribute has the value true. Typically, there will be
 * one TypeMapping Instance between a pair of data types that is considered the preferred mapping. To promote flexible
 * use o f this feature, there is no requirement that a preferred TypeMapping instance must be identified between a pair
 * of data types nor are multiple prefe rred instances prohibited. In these latter cases, however, the precise semant
 * ics are usage-defined. Interchange between data types defined by non-preferred mappings may ofte n function as
 * intended. However, the isLossy boolean may be set to indica te that such interchanges may be subject to validity
 * restrictions in certain circumstances. For example, it may be valid to move data values from a 32-bit integer data
 * type to a 16-bit integer data type as long as the actual values in the 32-bit underlying data type do not exceed the
 * range permitt ed for 16-bit integers. The CWM Foundation leaves the understanding and handling of such differences to
 * individual tools. If such differences must be mo deled, consider using the CWM Transformation package to filter data
 * values du ring interchange. TypeMapping instances are unidirectional, so two instances are required t o show that a
 * data type pair can be mutually interchanged between environ ments.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTypeMapping extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute isBestMatch. True if this TypeMapping instance represents the best available mapping
   * between a pair of data types in different software systems.
   * 
   * @return Value of attribute isBestMatch.
   */
  public boolean isBestMatch();

  /**
   * Sets the value of isBestMatch attribute. See {@link #isBestMatch} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBestMatch( boolean newValue );

  /**
   * Returns the value of attribute isLossy. True if this TypeMapping instance may result in a data conversion error if
   * the source data is within certain ranges. For example, storing a 32-bit unsigned integer value into a 16-bit
   * unsigned integer container will result in a data conversion error only when the source data has a value greater
   * than 65535.
   * 
   * @return Value of attribute isLossy.
   */
  public boolean isLossy();

  /**
   * Sets the value of isLossy attribute. See {@link #isLossy} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLossy( boolean newValue );

  /**
   * Returns the value of reference sourceType.
   * 
   * @return Value of reference sourceType.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getSourceType();

  /**
   * Sets the value of reference sourceType. See {@link #getSourceType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSourceType( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );

  /**
   * Returns the value of reference targetType.
   * 
   * @return Value of reference targetType.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier getTargetType();

  /**
   * Sets the value of reference targetType. See {@link #getTargetType} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTargetType( org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier newValue );
}
