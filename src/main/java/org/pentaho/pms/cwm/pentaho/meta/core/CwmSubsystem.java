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
 * Subsystem object instance interface. A subsystem is a grouping of model elements that represents a behavioral unit in
 * a physical system. A subsystem offers interfaces and has operations. In the metamodel, Subsystem is a subclass of
 * both Package and Classifier. As such it may have a set of Features. The purpose of the subsystem construct is to
 * provide a grouping mechanism for specifying a behavioral unit of a physical system. Apart from defining a namespace
 * for its contents, a subsystem serves as a specification unit for the behavior of its contained model elements. The
 * contents of a subsystem is defined in the same way as for a package, thus it consists of owned elements and imported
 * elements, with unique names withi n the subsystem.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSubsystem extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage,
    org.pentaho.pms.cwm.pentaho.meta.core.CwmClassifier {
}
