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


package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * Operation class proxy interface. Operation is a service that can be requested from an object to effect behavior. An
 * Operation has a signature, which describes the parameters that are possible (including possible return values). In
 * the metamodel, an Operation is a BehavioralFeature that can be applied to ins tances of the Classifier that contains
 * the Operation. Operation is the specification, while Method is the implementation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmOperationClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmOperation createCwmOperation();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param ownerScope
   *          Specifies whether the Feature appears in every instance of the Classifier or whether it appears only once
   *          for the entire Classifier.
   * @param isQuery
   *          Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged. True
   *          indicates that the state is unchanged; false indicates that side-effects may occur.
   * @param isAbstract
   *          If true, then the Operation does not have an implementation, and one must be supplied by a descendant. If
   *          false, the Operation must have an implementation in the class or inherited from an ancestor.
   * @return The created instance object.
   */
  public CwmOperation createCwmOperation( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind ownerScope, boolean isQuery, boolean isAbstract );
}
