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

package org.pentaho.pms.cwm.pentaho.meta.keysindexes;

/**
 * UniqueKeyRelationship association proxy interface. The UniqueKeyRelationship association links a KeyRelationship with
 * the UniqueKey with which it is paired. For example, in relational model terms, this association links a foreign key
 * -- the KeyRelationship instance -- with the primary key -- the UniqueKey instance -- with which it is paired.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface UniqueKeyRelationship extends javax.jmi.reflect.RefAssociation {
  /**
   * Queries whether a link currently exists between a given pair of instance objects in the associations link set.
   * 
   * @param keyRelationship
   *          Value of the first association end.
   * @param uniqueKey
   *          Value of the second association end.
   * @return Returns true if the queried link exists.
   */
  public boolean exists( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship keyRelationship,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey uniqueKey );

  /**
   * Queries the instance objects that are related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param uniqueKey
   *          Required value of the second association end.
   * @return Collection of related objects.
   */
  public java.util.Collection getKeyRelationship( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey uniqueKey );

  /**
   * Queries the instance object that is related to a particular instance object by a link in the current associations
   * link set.
   * 
   * @param keyRelationship
   *          Required value of the first association end.
   * @return Related object or <code>null</code> if none exists.
   */
  public org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey getUniqueKey(
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship keyRelationship );

  /**
   * Creates a link between the pair of instance objects in the associations link set.
   * 
   * @param keyRelationship
   *          Value of the first association end.
   * @param uniqueKey
   *          Value of the second association end.
   */
  public boolean add( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship keyRelationship,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey uniqueKey );

  /**
   * Removes a link between a pair of instance objects in the current associations link set.
   * 
   * @param keyRelationship
   *          Value of the first association end.
   * @param uniqueKey
   *          Value of the second association end.
   */
  public boolean remove( org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmKeyRelationship keyRelationship,
      org.pentaho.pms.cwm.pentaho.meta.keysindexes.CwmUniqueKey uniqueKey );
}
