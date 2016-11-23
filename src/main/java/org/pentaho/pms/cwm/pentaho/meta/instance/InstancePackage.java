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

package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * Instance package interface. The Instance metamodel depends on the following package: org.omg::CWM::ObjectModel::Core
 * In addition to the metadata normally interchanged with CWM, it is sometimes useful to interchan ge specific data
 * instances as well. The ObjectModel?s Instance metamodel all ows the inclusion of data instances with the metadata.
 * OCL Representation of Instance Constraints Constraints [C-6-1] A DataValue originates from a Classifier that is a
 * DataType. context DataValue inv: self.classifier.oclIsKindOf(DataType) [C-6-2] A DataValue has no Slots. context
 * DataValue inv: self.valueSlot->isEmpty [C-6-3] An Object may only own Objects and DataValues. context Object inv:
 * self.contents->forAll(c | c.oclIsKindOf(Object) or c.oclIsKindOf(DataValue)) [C-6-4] If an Object represents an
 * association, at least two of its ends must be not be empty. context Object inv:
 * self.classifier.oclIsKindOf(Association) implies self.slot.feature->iterate( ae ; cnt : Integer = 0 | if
 * ae.oclIsKindOf(AssociationEnd) and ae.value.notEmpty then cnt + 1 else cnt end if ) > 1 [C-6-5] If the
 * StructuralFeature describing a Slot is an AssociationEnd, the Classifier associa ted with the Object owning the Slot
 * must be an Association. context Slot inv: self.feature.oclIsKindOf(AssociationEnd) implies
 * self.value.classifier.oclIsKindOf(Association)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface InstancePackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmDataSlot class proxy object.
   * 
   * @return CwmDataSlot class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmDataSlotClass getCwmDataSlot();

  /**
   * Returns CwmDataValue class proxy object.
   * 
   * @return CwmDataValue class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmDataValueClass getCwmDataValue();

  /**
   * Returns CwmExtent class proxy object.
   * 
   * @return CwmExtent class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmExtentClass getCwmExtent();

  /**
   * Returns CwmInstance class proxy object.
   * 
   * @return CwmInstance class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmInstanceClass getCwmInstance();

  /**
   * Returns CwmObject class proxy object.
   * 
   * @return CwmObject class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmObjectClass getCwmObject();

  /**
   * Returns CwmSlot class proxy object.
   * 
   * @return CwmSlot class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.CwmSlotClass getCwmSlot();

  /**
   * Returns SlotValue association proxy object.
   * 
   * @return SlotValue association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.SlotValue getSlotValue();

  /**
   * Returns InstanceClassifier association proxy object.
   * 
   * @return InstanceClassifier association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.InstanceClassifier getInstanceClassifier();

  /**
   * Returns ObjectSlot association proxy object.
   * 
   * @return ObjectSlot association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.ObjectSlot getObjectSlot();

  /**
   * Returns FeatureSlot association proxy object.
   * 
   * @return FeatureSlot association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.FeatureSlot getFeatureSlot();

  /**
   * Returns DataSlotType association proxy object.
   * 
   * @return DataSlotType association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.instance.DataSlotType getDataSlotType();
}
