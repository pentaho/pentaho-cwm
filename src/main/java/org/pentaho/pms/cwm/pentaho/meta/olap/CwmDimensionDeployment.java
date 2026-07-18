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
 * DimensionDeployment object instance interface. DimensionDeployment represents a particular implementation strategy
 * for the dimensional/hierarchical portions of an OLAP model. It does so by organizing a collection of StructureMaps,
 * which in turn define a mapping to an implementation model.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDimensionDeployment extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference hierarchyLevelAssociation.
   * 
   * @return Value of reference hierarchyLevelAssociation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation getHierarchyLevelAssociation();

  /**
   * Sets the value of reference hierarchyLevelAssociation. See {@link #getHierarchyLevelAssociation} for description on
   * the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void
    setHierarchyLevelAssociation( org.pentaho.pms.cwm.pentaho.meta.olap.CwmHierarchyLevelAssociation newValue );

  /**
   * Returns the value of reference valueBasedHierarchy.
   * 
   * @return Value of reference valueBasedHierarchy.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmValueBasedHierarchy getValueBasedHierarchy();

  /**
   * Sets the value of reference valueBasedHierarchy. See {@link #getValueBasedHierarchy} for description on the
   * reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setValueBasedHierarchy( org.pentaho.pms.cwm.pentaho.meta.olap.CwmValueBasedHierarchy newValue );

  /**
   * Returns the value of reference structureMap.
   * 
   * @return Value of reference structureMap. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap> */getStructureMap();

  /**
   * Returns the value of reference listOfValues.
   * 
   * @return Value of reference listOfValues.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap getListOfValues();

  /**
   * Sets the value of reference listOfValues. See {@link #getListOfValues} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setListOfValues( org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap newValue );

  /**
   * Returns the value of reference immediateParent.
   * 
   * @return Value of reference immediateParent.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap getImmediateParent();

  /**
   * Sets the value of reference immediateParent. See {@link #getImmediateParent} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setImmediateParent( org.pentaho.pms.cwm.pentaho.meta.olap.CwmStructureMap newValue );

  /**
   * Returns the value of reference deploymentGroup.
   * 
   * @return Value of reference deploymentGroup.
   */
  public org.pentaho.pms.cwm.pentaho.meta.olap.CwmDeploymentGroup getDeploymentGroup();

  /**
   * Sets the value of reference deploymentGroup. See {@link #getDeploymentGroup} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setDeploymentGroup( org.pentaho.pms.cwm.pentaho.meta.olap.CwmDeploymentGroup newValue );
}
