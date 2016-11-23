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
 * Measure class proxy interface. Measure is a subclass of Attribute representing Dimension Measures (e.g., Sales,
 * Quantity, Weight). Synonym: Variable.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMeasureClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmMeasure createCwmMeasure();

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
   * @param changeability
   *          Specifies whether the value may be modified after the object is created.
   * @param multiplicity
   *          The possible number of data values for the feature that may be held by an instance. The cardinality of the
   *          set of values is an implicit part of the feature. In the common case in which the multiplicity is 1..1,
   *          then the feature is a scalar (i.e., it holds exactly one value).
   * @param ordering
   *          Specifies whether the set of instances is ordered. The ordering must be determined and maintained by
   *          Operations that add values to the feature. This property is only relevant if the multiplicity is greater
   *          than one.
   * @param targetScope
   *          Specifies whether the targets are ordinary Instances or are Classifiers.
   * @param initialValue
   *          An Expression specifying the value of the attribute upon initialization. It is meant to be evaluated at
   *          the time the object is initialized. (Note that an explicit constructor may supersede an initial value.)
   * @return The created instance object.
   */
  public CwmMeasure createCwmMeasure( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind ownerScope,
      org.pentaho.pms.cwm.pentaho.meta.core.ChangeableKind changeability,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmMultiplicity multiplicity,
      org.pentaho.pms.cwm.pentaho.meta.core.OrderingKind ordering,
      org.pentaho.pms.cwm.pentaho.meta.core.ScopeKind targetScope,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression initialValue );
}
