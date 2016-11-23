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
 * Expression object instance interface. In the metamodel an Expression defines a statement which will evaluate to a
 * (possibly empty) set of instances when executed in a context. An Expression does not modify the environment in which
 * it is evaluated. An expression contains an expression string and the name of an interpretation language with which to
 * evaluate the string.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmExpression extends org.pentaho.pms.cwm.pentaho.meta.core.CwmElement {
  /**
   * Returns the value of attribute body. The text of the expression expressed in the given language.
   * 
   * @return Value of attribute body.
   */
  public java.lang.String getBody();

  /**
   * Sets the value of body attribute. See {@link #getBody} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setBody( java.lang.String newValue );

  /**
   * Returns the value of attribute language. Names the language in which the expression body is represented. The
   * interpretation of the expression depends on the language. If the language name is omitted, no interpretation for
   * the expression can be assumed. In general, a language name should be spelled and capitalized exactly as it appears
   * in the document defining the language. For example, use COBOL, not Cobol; use Ada, not ADA; use PostScript, not
   * Postscript.
   * 
   * @return Value of attribute language.
   */
  public java.lang.String getLanguage();

  /**
   * Sets the value of language attribute. See {@link #getLanguage} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setLanguage( java.lang.String newValue );
}
