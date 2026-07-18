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
 * TaggedValue class proxy interface. A tagged value allows information to be attached to any model element in the form
 * of a "tagged value" pair (i.e., name = value). The interpretation of tagged value semantics is intentionally beyond
 * the scope of CWM. It must be determined by user or tool conventions. It is expected that tools will define tags to
 * supply information needed for their operations beyond the basic semantics of CWM. Such information could include code
 * generation options, model management information, or user-specified semantics. Even though TaggedValues are a simple
 * and straightforward extension techn ique, their use restricts semantic interchange of metadata to only those to ols
 * that share a common understanding of the specific tagged value name s.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTaggedValueClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTaggedValue createCwmTaggedValue();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param tag
   *          Contains the name of the TaggedValue. This name determines the semantics that are applicable to the
   *          contents of the value attribute.
   * @param value
   *          Contains the current value of the TaggedValue.
   * @return The created instance object.
   */
  public CwmTaggedValue createCwmTaggedValue( java.lang.String tag, java.lang.String value );
}
