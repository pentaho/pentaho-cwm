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


package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * HierarchyMemberSelectionGroup object instance interface. This subtype of MemberSelectionGroup allows users to specify
 * that a particular cube region is determined by hierarchy. This allows the description of data to vary by hierarchy
 * and, therefore, provides the ability to model multiple measure values per hierarchy
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmHierarchyMemberSelectionGroup extends org.pentaho.pms.cwm.pentaho.meta.olap.CwmMemberSelectionGroup {
  /**
   * Returns the value of reference hierarchy.
   * 
   * @return Value of reference hierarchy. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy> */getHierarchy();
}
