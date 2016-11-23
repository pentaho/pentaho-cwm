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

package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * MultiplicityRange class proxy interface. In the metamodel a MultiplicityRange defines a range of integers. The upper
 * bound of the range cannot be below the lower bound. The lower bound must be a nonnegative integer. The upper bound
 * must be a nonnegative integer or the special value unlimited, which indicates there is no upper bound on the range.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmMultiplicityRangeClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmMultiplicityRange createCwmMultiplicityRange();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param lower
   *          Specifies the positive integer lower bound of the range.
   * @param upper
   *          Specifies the upper bound of the range, which is a positive integer or the special value ?unlimited?
   *          indicating no upper bound is defined.
   * @return The created instance object.
   */
  public CwmMultiplicityRange createCwmMultiplicityRange( int lower, int upper );
}
