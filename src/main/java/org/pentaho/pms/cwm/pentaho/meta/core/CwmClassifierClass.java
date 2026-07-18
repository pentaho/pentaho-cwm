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
 * Classifier class proxy interface. A classifier is an element that describes structural and behavioral features; it
 * comes in several specific forms, including class, data type, interface, component, and others that are defined in
 * other metamodel packages. Classifier is often used as a type. In the metamodel, a Classifier may declare a collection
 * of Features, such as A ttributes, Operations and Methods. It has a name, which is unique in the Na mespace enclosing
 * the Classifier. Classifier is an abstract metaclass. Classifier is a child of Namespace. As a Namespace, a Classifier
 * may declare o ther Classifiers nested in its scope. Nested Classifiers may be accessed by other Classifiers only if
 * the nested Classifiers have adequate visibility. Ther e are no data value or state consequences of nested
 * Classifiers, i.e., it is not an aggregation or composition.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmClassifierClass extends javax.jmi.reflect.RefClass {
}
