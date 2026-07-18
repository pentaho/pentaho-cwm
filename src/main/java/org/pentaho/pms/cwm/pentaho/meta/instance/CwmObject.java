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


package org.pentaho.pms.cwm.pentaho.meta.instance;

/**
 * Object object instance interface. An object is an instance that originates from a class. In the metamodel, Object is
 * a subclass of Instance originating from a Clas s. The Class may be modified dynamically, which means that the set of
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
public interface CwmObject extends org.pentaho.pms.cwm.pentaho.meta.instance.CwmInstance {
  /**
   * Returns the value of reference slot.
   * 
   * @return Value of reference slot. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.instance.CwmSlot}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.instance.CwmSlot> */getSlot();
}
