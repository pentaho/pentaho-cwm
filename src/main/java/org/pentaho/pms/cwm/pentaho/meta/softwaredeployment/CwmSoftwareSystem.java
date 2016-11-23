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

package org.pentaho.pms.cwm.pentaho.meta.softwaredeployment;

/**
 * SoftwareSystem object instance interface. A SoftwareSystem represents a specific release of a software product. It
 * consists of a set of software Components.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSoftwareSystem extends org.pentaho.pms.cwm.pentaho.meta.core.CwmSubsystem {
  /**
   * Returns the value of attribute type. Identifies the type of the software product. One of the following predefined
   * values should be used if appropriate: OS, DBMS, MDDB, FileSystem, ODBC, JDBC or Application.
   * 
   * @return Value of attribute type.
   */
  public java.lang.String getType();

  /**
   * Sets the value of type attribute. See {@link #getType} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setType( java.lang.String newValue );

  /**
   * Returns the value of attribute subtype. This is used in conjunction with the type attribute to provide additional
   * information about the type of the software product. For some of the predefined types, suggested subtype values are
   * listed belo w: For an Operating System product (type OS): AIX, Linux, MVS, NT, Solaris, SunOS, VMS or Windows. For
   * a Database Management System product (type DBMS): DB2, DMS II, IMS, Informix, Oracle, SQLServer or Sybase. For a
   * Multidimensional Database product (type MDDB): Essbase or Express.
   * 
   * @return Value of attribute subtype.
   */
  public java.lang.String getSubtype();

  /**
   * Sets the value of subtype attribute. See {@link #getSubtype} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSubtype( java.lang.String newValue );

  /**
   * Returns the value of attribute supplier. The supplier of the software product.
   * 
   * @return Value of attribute supplier.
   */
  public java.lang.String getSupplier();

  /**
   * Sets the value of supplier attribute. See {@link #getSupplier} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setSupplier( java.lang.String newValue );

  /**
   * Returns the value of attribute version. The version identification for the software product.
   * 
   * @return Value of attribute version.
   */
  public java.lang.String getVersion();

  /**
   * Sets the value of version attribute. See {@link #getVersion} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setVersion( java.lang.String newValue );

  /**
   * Returns the value of reference typespace.
   * 
   * @return Value of reference typespace. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeSystem}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.typemapping.CwmTypeSystem> */getTypespace();
}
