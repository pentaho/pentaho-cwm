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

package org.pentaho.pms.cwm.pentaho.meta.relational;

/**
 * Trigger class proxy interface. An action run by the DBMS when specified events occur on the table owning the Trigger
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTriggerClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmTrigger createCwmTrigger();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param eventManipulation
   *          Indicates what types of events are using the current Trigger.
   * @param actionCondition
   *          A boolean expression which defines when the trigger has to be executed
   * @param actionStatement
   *          The Trigger action itself
   * @param actionOrientation
   *          It indicates if the trigger is called once per statement execution or before or after each row of the
   *          table is modified.
   * @param conditionTiming
   *          It indicates if the trigger activity is run before or after the statement or row is modified.
   * @param conditionReferenceNewTable
   *          The alias for the owning table name, used in the actionStatement, to represent the state of the table
   *          after the insert/delete/update
   * @param conditionReferenceOldTable
   *          The alias for the name of the owning table, used in the actionStatement, to represent the state of the
   *          table before the update/delete/insert.
   * @return The created instance object.
   */
  public CwmTrigger createCwmTrigger( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.EventManipulationType eventManipulation,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression actionCondition,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression actionStatement,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ActionOrientationType actionOrientation,
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ConditionTimingType conditionTiming,
      java.lang.String conditionReferenceNewTable, java.lang.String conditionReferenceOldTable );
}
