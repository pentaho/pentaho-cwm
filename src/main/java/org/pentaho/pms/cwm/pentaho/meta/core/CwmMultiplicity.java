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
 * Multiplicity object instance interface. In the metamodel a Multiplicity defines a non-empty set of non-negative
 * integers. A set which only contains zero ({0}) is not considered a valid Multiplicity. Every Multiplicity has at
 * least one corresponding String representation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMultiplicity extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of reference range.
   * 
   * @return Value of reference range. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicityRange}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicityRange> */getRange();
}
