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
 * Trigger object instance interface. An action run by the DBMS when specified events occur on the table owning the
 * Trigger
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTrigger extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of attribute eventManipulation. Indicates what types of events are using the current Trigger.
   * 
   * @return Value of attribute eventManipulation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.EventManipulationType getEventManipulation();

  /**
   * Sets the value of eventManipulation attribute. See {@link #getEventManipulation} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setEventManipulation(
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.EventManipulationType newValue );

  /**
   * Returns the value of attribute actionCondition. A boolean expression which defines when the trigger has to be
   * executed
   * 
   * @return Value of attribute actionCondition.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression getActionCondition();

  /**
   * Sets the value of actionCondition attribute. See {@link #getActionCondition} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setActionCondition( org.pentaho.pms.cwm.pentaho.meta.core.CwmBooleanExpression newValue );

  /**
   * Returns the value of attribute actionStatement. The Trigger action itself
   * 
   * @return Value of attribute actionStatement.
   */
  public org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression getActionStatement();

  /**
   * Sets the value of actionStatement attribute. See {@link #getActionStatement} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setActionStatement( org.pentaho.pms.cwm.pentaho.meta.core.CwmProcedureExpression newValue );

  /**
   * Returns the value of attribute actionOrientation. It indicates if the trigger is called once per statement
   * execution or before or after each row of the table is modified.
   * 
   * @return Value of attribute actionOrientation.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ActionOrientationType getActionOrientation();

  /**
   * Sets the value of actionOrientation attribute. See {@link #getActionOrientation} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setActionOrientation(
      org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ActionOrientationType newValue );

  /**
   * Returns the value of attribute conditionTiming. It indicates if the trigger activity is run before or after the
   * statement or row is modified.
   * 
   * @return Value of attribute conditionTiming.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ConditionTimingType getConditionTiming();

  /**
   * Sets the value of conditionTiming attribute. See {@link #getConditionTiming} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void
    setConditionTiming( org.pentaho.pms.cwm.pentaho.meta.relational.enumerations.ConditionTimingType newValue );

  /**
   * Returns the value of attribute conditionReferenceNewTable. The alias for the owning table name, used in the
   * actionStatement, to represent the state of the table after the insert/delete/update
   * 
   * @return Value of attribute conditionReferenceNewTable.
   */
  public java.lang.String getConditionReferenceNewTable();

  /**
   * Sets the value of conditionReferenceNewTable attribute. See {@link #getConditionReferenceNewTable} for description
   * on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setConditionReferenceNewTable( java.lang.String newValue );

  /**
   * Returns the value of attribute conditionReferenceOldTable. The alias for the name of the owning table, used in the
   * actionStatement, to represent the state of the table before the update/delete/insert.
   * 
   * @return Value of attribute conditionReferenceOldTable.
   */
  public java.lang.String getConditionReferenceOldTable();

  /**
   * Sets the value of conditionReferenceOldTable attribute. See {@link #getConditionReferenceOldTable} for description
   * on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setConditionReferenceOldTable( java.lang.String newValue );

  /**
   * Returns the value of reference table.
   * 
   * @return Value of reference table.
   */
  public org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable getTable();

  /**
   * Sets the value of reference table. See {@link #getTable} for description on the reference.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setTable( org.pentaho.pms.cwm.pentaho.meta.relational.CwmTable newValue );

  /**
   * Returns the value of reference usedColumnSet.
   * 
   * @return Value of reference usedColumnSet. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.relational.CwmNamedColumnSet> */getUsedColumnSet();
}
