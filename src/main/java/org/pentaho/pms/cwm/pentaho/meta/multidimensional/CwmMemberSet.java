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


package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * MemberSet object instance interface. MemberSet represents the collection of Members associated with an instance of
 * Dimension.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMemberSet extends org.pentaho.pms.cwm.pentaho.meta.instance.CwmExtent {
  /**
   * Returns the value of reference dimension.
   * 
   * @return Value of reference dimension.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension getDimension();

  /**
   * Sets the value of reference dimension. See {@link #getDimension} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDimension( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension newValue );
}
