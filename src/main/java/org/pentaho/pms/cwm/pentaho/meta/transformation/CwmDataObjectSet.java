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


package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * DataObjectSet object instance interface. This represents a set of data objects that can be the source or target of a
 * Transformation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataObjectSet extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference element.
   * 
   * @return Value of reference element. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getElement();

  /**
   * Returns the value of reference sourceTransformation.
   * 
   * @return Value of reference sourceTransformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation> */getSourceTransformation();

  /**
   * Returns the value of reference targetTransformation.
   * 
   * @return Value of reference targetTransformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation> */getTargetTransformation();
}
