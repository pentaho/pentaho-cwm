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


package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * Site object instance interface. A Site represents a geographical location. It provides a grouping mechanism for a
 * group of machines at the same location. Sites may be documented at different levels of granularity; containment link
 * s may be used to record hierarchical relationships between Sites.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSite extends org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmLocation {
  /**
   * Returns the value of reference containingSite.
   * 
   * @return Value of reference containingSite. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSite}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmSite> */getContainingSite();
}
