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
 * DataType object instance interface. A data type is a type whose values have no identity (i.e., they are pure values).
 * Data types include primitive built-in types (such as integer and string) as well as definable enumeration types. In
 * the metamodel, a DataType defines a special kind of Classifier in whic h operations are all pure functions (i.e.,
 * they can return data values but they cannot change data values, because they have no identity). For example, an "add"
 * operation on a number with another number as an argument yields a third number as a result; the target and argument
 * are unchanged. A DataType is a special kind of Classifier whose instances are primitive values, not objects. For
 * example, integers and strings are usually treated as primitive values. A primitive value does not have an identity,
 * so two occu rrences of the same value cannot be differentiated. Usually, DataTypes are used for specification of the
 * type of an attribute or parameter.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataType extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier {
}
