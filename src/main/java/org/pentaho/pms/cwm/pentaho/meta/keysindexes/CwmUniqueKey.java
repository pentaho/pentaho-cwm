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


package org.pentaho.pms.cwm.pentaho.meta.keysindexes;

/**
 * UniqueKey object instance interface. A UniqueKey represents a collection of features of some Class that, taken
 * together, uniquely identify instances of the Class. Instances of UniqueKey for which all features are required to
 * have non-null values are candidates for use as primary keys such as those defined by relational DBMSs.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmUniqueKey extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmStructuralFeature> */getFeature();

  /**
   * Returns the value of reference keyRelationship.
   * 
   * @return Value of reference keyRelationship. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship> */getKeyRelationship();
}
