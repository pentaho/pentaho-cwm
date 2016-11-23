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
 * SoftwareSystem class proxy interface. A SoftwareSystem represents a specific release of a software product. It
 * consists of a set of software Components.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmSoftwareSystemClass extends javax.jmi.reflect.RefClass {
  /**
   * The default factory operation used to create an instance object.
   * 
   * @return The created instance object.
   */
  public CwmSoftwareSystem createCwmSoftwareSystem();

  /**
   * Creates an instance object having attributes initialized by the passed values.
   * 
   * @param name
   *          An identifier for the ModelElement within its containing Namespace.
   * @param visibility
   *          Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * @param isAbstract
   *          An abstract Classifier is not instantiable.
   * @param type
   *          Identifies the type of the software product. One of the following predefined values should be used if
   *          appropriate: OS, DBMS, MDDB, FileSystem, ODBC, JDBC or Application.
   * @param subtype
   *          This is used in conjunction with the type attribute to provide additional information about the type of
   *          the software product. For some of the predefined types, suggested subtype values are listed below: For an
   *          Operating System product (type OS): AIX, Linux, MVS, NT, Solaris, SunOS, VMS or Windows. For a Database
   *          Management System product (type DBMS): DB2, DMS II, IMS, Informix, Oracle, SQLServer or Sybase. For a
   *          Multidimensional Database product (type MDDB): Essbase or Express.
   * @param supplier
   *          The supplier of the software product.
   * @param version
   *          The version identification for the software product.
   * @return The created instance object.
   */
  public CwmSoftwareSystem createCwmSoftwareSystem( java.lang.String name,
      org.pentaho.pms.cwm.pentaho.meta.core.VisibilityKind visibility, boolean isAbstract, java.lang.String type,
      java.lang.String subtype, java.lang.String supplier, java.lang.String version );
}
