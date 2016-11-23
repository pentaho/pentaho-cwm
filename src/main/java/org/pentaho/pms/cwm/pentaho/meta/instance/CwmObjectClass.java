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
 * Object class proxy interface. An object is an instance that originates from a class. In the metamodel, Object is a
 * subclass of Instance originating from a Clas s. The Class may be modified dynamically, which means that the set of
 * fea tures of the Object may change during its life-time. An object is an instance that originates from a class; it is
 * structured an d behaves according to its class. All objects originating from the same c lass are structured in the
 * same way, although each of them has its own set o f attribute slots. Each attribute slot references an instance,
 * usually a da ta value or possibly, another object. The number of attribute slots wit h the same name fulfills the
 * multiplicity of the corresponding attribute in the class. The set may be modified according to the specification in
 * the corresponding attribute, e.g. each referenced instance must origina te from (a specialization of) the type of the
 * attribute, and attribute slots may be added or removed according to the changeable property of the attribute.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmObjectClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmObject createCwmObject();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @return The created instance object.
   */
  public CwmObject createCwmObject( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility );
}
