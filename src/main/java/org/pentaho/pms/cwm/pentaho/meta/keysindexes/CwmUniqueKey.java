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
