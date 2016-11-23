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

package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * Dimension object instance interface. Dimension represents physical dimension in a multidimensional database (e.g., a
 * dimension object defined by the programming model/API of an OLAP database server). Tool-specific extensions to the
 * Multidimensional package will generally contain classes that derive from Dimension.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDimension extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClass {
  /**
   * Returns the value of reference dimensionedObject.
   * 
   * @return Value of reference dimensionedObject. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject}
   */
  public java.util.List
    /* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject> */getDimensionedObject();

  /**
   * Returns the value of reference component.
   * 
   * @return Value of reference component. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension> */getComponent();

  /**
   * Returns the value of reference composite.
   * 
   * @return Value of reference composite. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension> */getComposite();

  /**
   * Returns the value of reference memberSet.
   * 
   * @return Value of reference memberSet. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmMemberSet}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmMemberSet> */getMemberSet();

  /**
   * Returns the value of reference schema.
   * 
   * @return Value of reference schema.
   */
  public org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmSchema getSchema();

  /**
   * Sets the value of reference schema. See {@link #getSchema} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSchema( org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmSchema newValue );
}
