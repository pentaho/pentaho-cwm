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


package org.pentaho.pms.cwm.pentaho.meta.core;

/**
 * Expression class proxy interface. In the metamodel an Expression defines a statement which will evaluate to a
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
public interface CwmExpressionClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmExpression createCwmExpression();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param body
   *          The text of the expression expressed in the given language.
   * @param language
   *          Names the language in which the expression body is represented. The interpretation of the expression
   *          depends on the language. If the language name is omitted, no interpretation for the expression can be
   *          assumed. In general, a language name should be spelled and capitalized exactly as it appears in the
   *          document defining the language. For example, use COBOL, not Cobol; use Ada, not ADA; use PostScript, not
   *          Postscript.
   * @return The created instance object.
   */
  public CwmExpression createCwmExpression( java.lang.String body, java.lang.String language );
}
