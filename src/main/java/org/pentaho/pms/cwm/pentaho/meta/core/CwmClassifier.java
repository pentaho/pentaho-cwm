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
 * Classifier object instance interface. A classifier is an element that describes structural and behavioral features;
 * it comes in several specific forms, including class, data type, interface, component, and others that are defined in
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
public interface CwmClassifier extends org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace {
  /**
   * Returns the value of attribute isAbstract. An abstract Classifier is not instantiable.
   * 
   * @return Value of attribute isAbstract.
   */
  public boolean isAbstract();

  /**
   * Sets the value of isAbstract attribute. See {@link #isAbstract} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setAbstract( boolean newValue );

  /**
   * Returns the value of reference feature.
   * 
   * @return Value of reference feature. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmFeature> */getFeature();
}
