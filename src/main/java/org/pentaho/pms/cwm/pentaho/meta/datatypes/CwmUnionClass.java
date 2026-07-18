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


package org.pentaho.pms.cwm.pentaho.meta.datatypes;

/**
 * Union class proxy interface. The Union class represents programming language unions and similarly structured data
 * types. Because of the diversity of union semantics found across software systems, the Union and UnionMember classes
 * are likely candidates for specialization to better capture union semantics in specific language extension packages. A
 * discriminated Union has a collection of UnionMembers that determine the sets o f contents that the Union may contain.
 * Such Unions have an attribute called th e discriminator that identifies the memberCase value of the UnionMember that
 * the Uni on currently contains. The discriminator is found via the UnionDiscriminator association to
 * StructuralFeature. The discriminator may be embedded withi n UnionMembers or may be located outside the
 * discriminator. If it is locate d within UnionMembers, the discriminator should occur in every UnionMember at the same
 * location (often, the first). Undiscriminated unions (for example, a C language union) are also supported, but have an
 * empty discriminator reference, and the memberCase attribute of the Un ionMembers it contains is ignored.
 * Undiscriminated Unions are often used to represent alternate views of a single p hysical storage area. A fine degree
 * of control over this aspect of Unions may be obtaine d by creating a class that derives from both UnionMember and
 * FixedOffsetField (in the CWM Record package) and setting the offset attribute instances of that class accordingly.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmUnionClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmUnion createCwmUnion();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @return The created instance object.
   */
  public CwmUnion createCwmUnion( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract );
}
