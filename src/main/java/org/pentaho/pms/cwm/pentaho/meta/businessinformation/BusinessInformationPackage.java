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

package org.pentaho.pms.cwm.pentaho.meta.businessinformation;

/**
 * BusinessInformation package interface. The Business Information package depends on the following package:
 * org.omg::CWM::ObjectModel::Core The Business Information Metamodel provides general purpose services ava ilable to
 * all CWM packages for defining business-oriented information about m odel elements. The business-oriented services
 * described here are designed to support t he needs of data warehousing and business intelligence systems; they are no
 * t intended as a complete representation of general purpose business inte lligence metamodel. Business Information
 * Metamodel services support the notions of responsib le parties and information about how to contact them,
 * identification of off-l ine documentation and support for general-purpose descriptive information. Three CWM c lasses
 * "anchor" these services: ResponsibleParty, Document and Description, respectively. To aid in representing the
 * diversity of organizational structures and do cumentation relationships that may be encountered in a business
 * intelligence system, the metamodel provides robust relationships between the anchor classes and eve ry model element
 * in the CWM metamodel. The necessary robustness is achieved in several ways. First, every CWM model element may have
 * zero or more instances of each a nchor class associated with it. This means, for example, that a single Descri ption
 * instance can be used to describe many different model elements. Conversely, a si ngle model element may be described
 * by many different Description instances . Likewise, Document and ResponsibleParty instances can be associated in
 * completely ad hoc ways with any model element. Extending this idea means , for example, that Description instances
 * could be used to further describ e ResponsibleParty and Document instance, if needed. Second, because they are
 * Namespaces, the anchor classes can be organized into hierarchies using the ElementOwnership association. For
 * instance, an or ganizational structure can be represented by a hierarchy of ResponsibleParty instances . Also, the
 * internal structure of a document (i.e., its chapters, sections, subsections, etc.) might be represented by a
 * hierarchy of Document inst ances. Finally, instances of the three anchor classes can be associated with an y model
 * element (via their individual associations to ModelElement) and refer enced by multiple instances of any of the three
 * anchor classes. Because of the strong containment of the ElementOwnership association in the ObjectModel, anchor
 * class instances can only participate in one hierarchy, but there are no restrictions preventing anchor class
 * instances embedded in a hierarchy fr om referencing, or being referenced by, other model elements (even other m
 * embers of the same hierarchy). To illustrate some of the ways that the metamodel can be used, the follo wing figure
 * shows a simple document hierarchy with responsibility assignments and descriptive comments (boxes represent instances
 * of metamodel classes and labelled lines represent metamodel associations connecting instances). In the examp le, the
 * product plan document for the Widget product is composed of thre e subplans: a marketing plan, an engineering plan,
 * and a resource plan. T he relationships between the subplans documents is shown as a hierarchy wi th the product plan
 * owning the three subordinate plans via the ElementOwnershi p association. Each part of the plan is assigned to a
 * reponsible party u sing the ModelElementResponsibility association. Finally, Description i nstances are used to
 * record roles for the responsible parties. OCL Representation of BusinessInformation Constraints [C-3-1] A Description
 * may not describe itself. context Description inv: self.modelElement->forAll(p | p <> self) [C-3-2] A Document may not
 * describe itself. context Document inv: self.modelElement->forAll(p | p <> self) [C-3-3] A ResponsibleParty may not
 * describe itself. context ResponsibleParty inv: self.modelElement->forAll(p | p <> self)
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface BusinessInformationPackage extends javax.jmi.reflect.RefPackage {
  /**
   * Returns CwmResponsibleParty class proxy object.
   * 
   * @return CwmResponsibleParty class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResponsiblePartyClass getCwmResponsibleParty();

  /**
   * Returns CwmTelephone class proxy object.
   * 
   * @return CwmTelephone class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmTelephoneClass getCwmTelephone();

  /**
   * Returns CwmEmail class proxy object.
   * 
   * @return CwmEmail class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmEmailClass getCwmEmail();

  /**
   * Returns CwmLocation class proxy object.
   * 
   * @return CwmLocation class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmLocationClass getCwmLocation();

  /**
   * Returns CwmContact class proxy object.
   * 
   * @return CwmContact class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContactClass getCwmContact();

  /**
   * Returns CwmDescription class proxy object.
   * 
   * @return CwmDescription class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmDescriptionClass getCwmDescription();

  /**
   * Returns CwmDocument class proxy object.
   * 
   * @return CwmDocument class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmDocumentClass getCwmDocument();

  /**
   * Returns CwmResourceLocator class proxy object.
   * 
   * @return CwmResourceLocator class proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmResourceLocatorClass getCwmResourceLocator();

  /**
   * Returns ContactEmail association proxy object.
   * 
   * @return ContactEmail association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ContactEmail getContactEmail();

  /**
   * Returns ContactLocation association proxy object.
   * 
   * @return ContactLocation association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ContactLocation getContactLocation();

  /**
   * Returns ContactResourceLocator association proxy object.
   * 
   * @return ContactResourceLocator association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ContactResourceLocator getContactResourceLocator();

  /**
   * Returns ContactTelephone association proxy object.
   * 
   * @return ContactTelephone association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ContactTelephone getContactTelephone();

  /**
   * Returns DocumentDescribes association proxy object.
   * 
   * @return DocumentDescribes association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.DocumentDescribes getDocumentDescribes();

  /**
   * Returns ModelElementDescription association proxy object.
   * 
   * @return ModelElementDescription association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ModelElementDescription getModelElementDescription();

  /**
   * Returns ModelElementResponsibility association proxy object.
   * 
   * @return ModelElementResponsibility association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ModelElementResponsibility
    getModelElementResponsibility();

  /**
   * Returns ResponsiblePartyContact association proxy object.
   * 
   * @return ResponsiblePartyContact association proxy object.
   */
  public org.pentaho.pms.cwm.pentaho.meta.businessinformation.ResponsiblePartyContact getResponsiblePartyContact();
}
