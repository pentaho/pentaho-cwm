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
 * Model object instance interface. A model captures a view of a physical system. It is an abstraction of the physical
 * system, with a certain purpose. The model completely describes those aspects of the physical system that are relevant
 * to the purpose of the model, at the appropriate level of detail. In the metamodel, Model is a subclass of Package. It
 * contains a containmen t hierarchy of ModelElements that together describe the physical system. A Model also contains
 * a set of ModelElements that represents the environ ment of the system. Different Models can be defined for the same
 * physical system, where each m odel represents a view of the physical system defined by its purpose and abstraction
 * level, e.g. an analysis model, a design model, an implementa tion model. Typically different models are complementary
 * and defined fro m the perspectives (viewpoints) of different system stakeholders.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmModel extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
}
