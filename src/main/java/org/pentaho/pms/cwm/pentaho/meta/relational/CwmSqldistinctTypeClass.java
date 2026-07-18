/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2002 - 2026 by Pentaho Canada Inc. : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2030-06-15
 ******************************************************************************/


package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * SQLDistinctType class proxy interface. A datatype defined as a Distinct Type, per [SQL] standard.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqldistinctTypeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmSqldistinctType createCwmSqldistinctType();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param typeNumber
   *          The number assigned to the datatype by the owning RDBMS
   * @param length
   *          The length of fixed length character or byte strings. Maximum length if length is variable.
   * @param precision
   *          The total number of digits in the field
   * @param scale
   *          The number of digits on the right of the decimal separator.
   * @return The created instance object.
   */
  public CwmSqldistinctType createCwmSqldistinctType( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract,
      java.lang.Integer typeNumber, java.lang.Integer length, java.lang.Integer precision, java.lang.Integer scale );
}
