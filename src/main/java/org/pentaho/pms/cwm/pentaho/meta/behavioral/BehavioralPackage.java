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

package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * Behavioral package interface. The Behavioral metamodel depends on the following package:
 * org.omg::CWM::ObjectModel::Core The Behavioral metamodel collects together classes and associations that describe the
 * behavior o f CWM types and provides a foundation for recording the invocations of de fined behaviors. The elements of
 * the Behavioral metamodel are shown in the following figure. OCL Representation of Behavioral Constraints Operations
 * The operation hasSameSignature checks if the argument has the same signature as the instance its elf.
 * hasSameSignature ( b : BehavioralFeature ) : Boolean; hasSameSignature (b) = (self.name = b.name) and
 * (self.parameter->size = b.parameter->size) and Sequence{ 1..(self.parameter->size) }->forAll( index : Integer |
 * b.parameter->at(index).type = self.parameter->at(index).type and b.parameter->at(index).kind =
 * self.parameter->at(index).kind ) The operation allOperations results in a Set containing all Operations of the
 * Classifier itself and all its inherited Operations. allOperations : Set(Operation); allOperations =
 * self.allFeatures->select(f | f.ockIsKindOf(Operations)) The operation allMethods results in a Set containing all
 * Methods of the Classifier itself and al l its inherited Methods. allOperations : Set(Method); allMethods =
 * self.allFeatures->select(f | f.ockIsKindOf(Method)) Constraints [C-4-1] All Parameters should have a unique name.
 * context BehavioralFeature inv: self.parameter->forAll(p1, p2 | p1.name = p2.name implies p1 = p2) [C-4-2] The type of
 * the Parameters should be included in the Namespace of the Classifier. context BehavioralFeature inv:
 * self.parameter->forAll( p | self.owner.namespace.allContents->includes (p.type) ) [C-4-3] The number of arguments
 * must be the same as the number of parameters of the Operation. context CallAction inv: self.actualArgument->size =
 * self.operation.parameter->size [C-4-4] An Interface can only contain Operations. context Interface inv:
 * self.allFeatures->forAll( f | f.oclIsKindOf( Operation ) ) [C-4-5] An Interface cannot contain any ModelElements.
 * context Interface inv: self.allContents->isEmpty [C-4-6] All Features defined in an Interface are public. context
 * Interface inv: self.allFeatures->forAll( f | f.visibility = #public ) [C-4-7] If the realized Operation is a query,
 * then so is the Method. context Method inv: self.specification->isQuery implies self.isQuery
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface BehavioralPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmArgument class proxy object.
   * 
   * @return CwmArgument class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmArgumentClass getCwmArgument();

  /**
   * Returns CwmBehavioralFeature class proxy object.
   * 
   * @return CwmBehavioralFeature class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmBehavioralFeatureClass getCwmBehavioralFeature();

  /**
   * Returns CwmCallAction class proxy object.
   * 
   * @return CwmCallAction class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmCallActionClass getCwmCallAction();

  /**
   * Returns CwmEvent class proxy object.
   * 
   * @return CwmEvent class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmEventClass getCwmEvent();

  /**
   * Returns CwmInterface class proxy object.
   * 
   * @return CwmInterface class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmInterfaceClass getCwmInterface();

  /**
   * Returns CwmMethod class proxy object.
   * 
   * @return CwmMethod class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmMethodClass getCwmMethod();

  /**
   * Returns CwmOperation class proxy object.
   * 
   * @return CwmOperation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmOperationClass getCwmOperation();

  /**
   * Returns CwmParameter class proxy object.
   * 
   * @return CwmParameter class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CwmParameterClass getCwmParameter();

  /**
   * Returns BehavioralFeatureParameter association proxy object.
   * 
   * @return BehavioralFeatureParameter association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.BehavioralFeatureParameter getBehavioralFeatureParameter();

  /**
   * Returns CallArguments association proxy object.
   * 
   * @return CallArguments association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CallArguments getCallArguments();

  /**
   * Returns EventParameter association proxy object.
   * 
   * @return EventParameter association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.EventParameter getEventParameter();

  /**
   * Returns CalledOperation association proxy object.
   * 
   * @return CalledOperation association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.CalledOperation getCalledOperation();

  /**
   * Returns OperationMethod association proxy object.
   * 
   * @return OperationMethod association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.OperationMethod getOperationMethod();

  /**
   * Returns ParameterType association proxy object.
   * 
   * @return ParameterType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.behavioral.ParameterType getParameterType();
}
