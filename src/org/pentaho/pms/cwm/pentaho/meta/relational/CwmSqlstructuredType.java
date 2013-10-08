/*
 * Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * SQLStructuredType object instance interface. A Datatype defined as Structured Type, per [SQL] standard.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSqlstructuredType extends org.pentaho.pms.cwm.pentaho.meta.relational.CwmSqldataType,
    org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference referencingColumn.
   * 
   * @return Value of reference referencingColumn. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmColumn> */getReferencingColumn();

  /**
   * Returns the value of reference columnSet.
   * 
   * @return Value of reference columnSet. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet> */getColumnSet();
}
