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

package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * EnumerationLiteral class proxy interface. EnumerationLiteral instances describe the enumeration identifiers, and
 * possibly the values, associated with an enumerated data type. Enumeration identifier s are contained in the name
 * attribute derived from the EnumerationLiteral instance?s Mo delElement superclass. EnumerationLiteral instances may
 * also be used to define expression-base d values such as ranges. To do so, simply state the membership expression in
 * the instance?s value. For example, a range literal can be created by setting the value attribute to "m..n", where m
 * represents the lower bound of the range, and n, the upper bound. In this way, ranges and other more complicated exp
 * ressions can be intermixed with simple enumeration literals. For example, an enumeration might contain the lit erals
 * "1", "2", "4..7", and "> 10". Consequently, a simple range data type can be created with an Enumerati on instance
 * that owns a single EnumerationLiteral instance. For example, a data type for positive integers could be created as
 * shown in the following instance diagram. A model attribute of this data type might then be declared as "po sInt :
 * PositiveInteger".
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmEnumerationLiteralClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmEnumerationLiteral createCwmEnumerationLiteral();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param value
   *          The value associated with an enumeration identifier can be stored here. The attribute is optional because
   *          enumeration literals are not required to have a specific, displayable value. This is indicated by either
   *          an empty value attribute or a value attribute value whose expression body attribute is a zero-length
   *          string.
   * @return The created instance object.
   */
  public CwmEnumerationLiteral createCwmEnumerationLiteral( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility,
      org.pentaho.pms.cwm.pentaho.meta.core.CwmExpression value );
}
