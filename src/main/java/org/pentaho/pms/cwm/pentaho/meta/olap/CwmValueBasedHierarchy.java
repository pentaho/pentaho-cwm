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

package org.pentaho.pms.cwm.pentaho.meta.olap;

/**
 * ValueBasedHierarchy object instance interface. ValueBasedHierarchy is a subclass of Hierarchy that ranks Dimension
 * members according to their relative distance from the root. Each member of a ValueBasedHierarchy has a specific
 * "metric" or "value" associated with it. ValueBasedHierarchy is used to model pure "linked node" hierarchies (e.g., p
 * arent-child tables).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmValueBasedHierarchy extends org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchy {
  /**
   * Returns the value of reference dimensionDeployment.
   * 
   * @return Value of reference dimensionDeployment. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmDimensionDeployment> */getDimensionDeployment();
}
