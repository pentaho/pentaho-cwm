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


package org.pentaho.pms.cwm.pentaho.meta.behavioral;

/**
 * Interface object instance interface. Interface is a named set of operations that specify the behavior of an element.
 * In the metamodel, an Interface contains a set of Operations that togeth er define a service offered by a Classifier
 * realizing the Interface. A Clas sifier may offer several services, which means that it may realize several
 * Interfaces, and several Classifiers may realize the same Interface.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmInterface extends org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier {
}
