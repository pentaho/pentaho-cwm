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

package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * Instance class proxy interface. The instance construct defines an entity to which a set of operations can be applied
 * and which has a state that stores the effects of the operations. In the metamodel Instance is connected to a
 * Classifier that declares its structure and behavior. It has a set of attribute values matching the definition of its
 * Classifier. The set of attribute values implements the current state of the Instance. Because Instance is an abstract
 * class, all Instances are either Object or DataValue instances. The data content of an Instance comprises one value
 * for each attribute in its full descriptor (and nothing more). The value must be consistent with th e type of the
 * attribute. An instance must obey any constraints on the ful l descriptor of the Classifier of which it is an instance
 * (including both explicit constraints and built- in constraints such as multiplicity).
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmInstanceClass extends javax.jmi.reflect.RefClass {
}
