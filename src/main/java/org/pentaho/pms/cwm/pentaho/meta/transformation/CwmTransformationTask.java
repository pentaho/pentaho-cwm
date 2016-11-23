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

package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * TransformationTask object instance interface. This represents a set of Transformations that must be executed together
 * as a single task (logical unit). A TransformationTask may have an inverse task. A transformation task tha t maps a
 * source set "A" into a target set "B" can be reversed by the invers e transformation task that maps "B" into "A".
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmTransformationTask extends org.pentaho.pms.cwm.pentaho.meta.softwaredeployment.CwmComponent {
  /**
   * Returns the value of reference transformation.
   * 
   * @return Value of reference transformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation> */getTransformation();

  /**
   * Returns the value of reference inverseTask.
   * 
   * @return Value of reference inverseTask. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask> */getInverseTask();

  /**
   * Returns the value of reference originalTask.
   * 
   * @return Value of reference originalTask. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformationTask> */getOriginalTask();
}
