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


package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * Enumeration object instance interface. The Enumeration class is intended as a starting point from which enumerated
 * data types can be created. An enumerated data type is a collection of identifiers often used as the permitted states
 * that some other attribute or property of the enumerated type may take. The isOrdered attribute of an Enumeration
 * instance is used to determine if t he ordered constraint on the EnumerationLiterals association is relevant for the e
 * numeration. The particular ordering of EnumerationLiteral instances is ob tained from the ordered constraint on the
 * association even if the value attr ibutes of the EnumerationLiteral instances contain non-null values that might be
 * us ed to determine ordering. This is done to provide more flexible ordering semantics. An instance of Enumeration is
 * also required to create a range data type. Ref er to the EnumerationLiteral class for details.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmEnumeration extends org.pentaho.pms.cwm.pentaho.meta.core.CwmDataType {
  /**
   * Returns the value of attribute isOrdered. If True, the ordered constraint on the EnumerationLiterals association is
   * relevant. Otherwise, the ordering of EnumerationLiteral instances is considered unspecified.
   * 
   * @return Value of attribute isOrdered.
   */
  public boolean isOrdered();

  /**
   * Sets the value of isOrdered attribute. See {@link #isOrdered} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setOrdered( boolean newValue );

  /**
   * Returns the value of reference literal.
   * 
   * @return Value of reference literal. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmEnumerationLiteral}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.datatypes.CwmEnumerationLiteral> */getLiteral();
}
