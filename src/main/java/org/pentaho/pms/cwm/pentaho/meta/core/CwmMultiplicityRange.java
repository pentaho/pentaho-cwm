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


package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * MultiplicityRange object instance interface. In the metamodel a MultiplicityRange defines a range of integers. The
 * upper bound of the range cannot be below the lower bound. The lower bound must be a nonnegative integer. The upper
 * bound must be a nonnegative integer or the special value unlimited, which indicates there is no upper bound on the
 * range.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMultiplicityRange extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of attribute lower. Specifies the positive integer lower bound of the range.
   * 
   * @return Value of attribute lower.
   */
  public int getLower();

  /**
   * Sets the value of lower attribute. See {@link #getLower} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLower( int newValue );

  /**
   * Returns the value of attribute upper. Specifies the upper bound of the range, which is a positive integer or the
   * special value ?unlimited? indicating no upper bound is defined.
   * 
   * @return Value of attribute upper.
   */
  public int getUpper();

  /**
   * Sets the value of upper attribute. See {@link #getUpper} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setUpper( int newValue );

  /**
   * Returns the value of reference multiplicity.
   * 
   * @return Value of reference multiplicity.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicity getMultiplicity();

  /**
   * Sets the value of reference multiplicity. See {@link #getMultiplicity} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setMultiplicity( org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicity newValue );
}
