/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:10 PM CET 
//


package com.hack23.cia.model.external.riksdagen.utskottsforslag.impl;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;


/**
 * The Class CommitteeDocumentData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeDocumentData", propOrder = {
    "rm",
    "hangarId",
    "id",
    "label",
    "subType",
    "tempLabel",
    "org",
    "endNumber",
    "createdDate",
    "publicDate",
    "title",
    "subTitle",
    "status",
    "documentUrlText",
    "documentUrlHtml",
    "documentStatusUrlXml",
    "documentStatusUrlWww",
    "committeeProposalUrlXml"
})
@Entity(name = "CommitteeDocumentData")
@Table(name = "COMMITTEE_DOCUMENT_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class CommitteeDocumentData
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The rm. */
    @XmlElement(required = true)
    protected String rm;
    
    /** The hangar id. */
    @XmlElement(name = "hangar_id", required = true)
    protected BigInteger hangarId;
    
    /** The id. */
    @XmlElement(name = "dok_id", required = true)
    protected String id;
    
    /** The label. */
    @XmlElement(name = "beteckning", required = true)
    protected String label;
    
    /** The sub type. */
    @XmlElement(name = "subtyp", required = true)
    protected String subType;
    
    /** The temp label. */
    @XmlElement(name = "tempbeteckning", required = true)
    protected String tempLabel;
    
    /** The org. */
    @XmlElement(name = "organ", required = true)
    protected String org;
    
    /** The end number. */
    @XmlElement(name = "slutnummer", required = true)
    protected BigInteger endNumber;
    
    /** The created date. */
    @XmlElement(name = "datum", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date createdDate;
    
    /** The public date. */
    @XmlElement(name = "publicerad", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date publicDate;
    
    /** The title. */
    @XmlElement(name = "titel", required = true)
    protected String title;
    
    /** The sub title. */
    @XmlElement(name = "subtitel", required = true)
    protected String subTitle;
    
    /** The status. */
    @XmlElement(required = true)
    protected String status;
    
    /** The document url text. */
    @XmlElement(name = "dokument_url_text", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlText;
    
    /** The document url html. */
    @XmlElement(name = "dokument_url_html", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlHtml;
    
    /** The document status url xml. */
    @XmlElement(name = "dokumentstatus_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlXml;
    
    /** The document status url www. */
    @XmlElement(name = "dokumentstatus_url_www", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlWww;
    
    /** The committee proposal url xml. */
    @XmlElement(name = "utskottsforslag_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String committeeProposalUrlXml;

    /**
	 * Gets the rm.
	 *
	 * @return the rm
	 */
    @Basic
    @Column(name = "RM")
    public String getRm() {
        return rm;
    }

    /**
	 * Sets the rm.
	 *
	 * @param value the new rm
	 */
    public void setRm(final String value) {
        this.rm = value;
    }

    /**
	 * Gets the hangar id.
	 *
	 * @return the hangar id
	 */
    @Basic
    @Column(name = "HANGAR_ID", precision = 20)
    public BigInteger getHangarId() {
        return hangarId;
    }

    /**
	 * Sets the hangar id.
	 *
	 * @param value the new hangar id
	 */
    public void setHangarId(final BigInteger value) {
        this.hangarId = value;
    }

    /**
	 * Gets the id.
	 *
	 * @return the id
	 */
    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
	 * Sets the id.
	 *
	 * @param value the new id
	 */
    public void setId(final String value) {
        this.id = value;
    }

    /**
	 * Gets the label.
	 *
	 * @return the label
	 */
    @Basic
    @Column(name = "LABEL")
    public String getLabel() {
        return label;
    }

    /**
	 * Sets the label.
	 *
	 * @param value the new label
	 */
    public void setLabel(final String value) {
        this.label = value;
    }

    /**
	 * Gets the sub type.
	 *
	 * @return the sub type
	 */
    @Basic
    @Column(name = "SUB_TYPE")
    public String getSubType() {
        return subType;
    }

    /**
	 * Sets the sub type.
	 *
	 * @param value the new sub type
	 */
    public void setSubType(final String value) {
        this.subType = value;
    }

    /**
	 * Gets the temp label.
	 *
	 * @return the temp label
	 */
    @Basic
    @Column(name = "TEMP_LABEL")
    public String getTempLabel() {
        return tempLabel;
    }

    /**
	 * Sets the temp label.
	 *
	 * @param value the new temp label
	 */
    public void setTempLabel(final String value) {
        this.tempLabel = value;
    }

    /**
	 * Gets the org.
	 *
	 * @return the org
	 */
    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    /**
	 * Sets the org.
	 *
	 * @param value the new org
	 */
    public void setOrg(final String value) {
        this.org = value;
    }

    /**
	 * Gets the end number.
	 *
	 * @return the end number
	 */
    @Basic
    @Column(name = "END_NUMBER", precision = 20)
    public BigInteger getEndNumber() {
        return endNumber;
    }

    /**
	 * Sets the end number.
	 *
	 * @param value the new end number
	 */
    public void setEndNumber(final BigInteger value) {
        this.endNumber = value;
    }

    /**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
    @Basic
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.DATE)
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
	 * Sets the created date.
	 *
	 * @param value the new created date
	 */
    public void setCreatedDate(final Date value) {
        this.createdDate = value;
    }

    /**
	 * Gets the public date.
	 *
	 * @return the public date
	 */
    @Basic
    @Column(name = "PUBLIC_DATE")
    @Temporal(TemporalType.DATE)
    public Date getPublicDate() {
        return publicDate;
    }

    /**
	 * Sets the public date.
	 *
	 * @param value the new public date
	 */
    public void setPublicDate(final Date value) {
        this.publicDate = value;
    }

    /**
	 * Gets the title.
	 *
	 * @return the title
	 */
    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    /**
	 * Sets the title.
	 *
	 * @param value the new title
	 */
    public void setTitle(final String value) {
        this.title = value;
    }

    /**
	 * Gets the sub title.
	 *
	 * @return the sub title
	 */
    @Basic
    @Column(name = "SUB_TITLE")
    public String getSubTitle() {
        return subTitle;
    }

    /**
	 * Sets the sub title.
	 *
	 * @param value the new sub title
	 */
    public void setSubTitle(final String value) {
        this.subTitle = value;
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param value the new status
	 */
    public void setStatus(final String value) {
        this.status = value;
    }

    /**
	 * Gets the document url text.
	 *
	 * @return the document url text
	 */
    @Basic
    @Column(name = "DOCUMENT_URL_TEXT")
    public String getDocumentUrlText() {
        return documentUrlText;
    }

    /**
	 * Sets the document url text.
	 *
	 * @param value the new document url text
	 */
    public void setDocumentUrlText(final String value) {
        this.documentUrlText = value;
    }

    /**
	 * Gets the document url html.
	 *
	 * @return the document url html
	 */
    @Basic
    @Column(name = "DOCUMENT_URL_HTML")
    public String getDocumentUrlHtml() {
        return documentUrlHtml;
    }

    /**
	 * Sets the document url html.
	 *
	 * @param value the new document url html
	 */
    public void setDocumentUrlHtml(final String value) {
        this.documentUrlHtml = value;
    }

    /**
	 * Gets the document status url xml.
	 *
	 * @return the document status url xml
	 */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_XML")
    public String getDocumentStatusUrlXml() {
        return documentStatusUrlXml;
    }

    /**
	 * Sets the document status url xml.
	 *
	 * @param value the new document status url xml
	 */
    public void setDocumentStatusUrlXml(final String value) {
        this.documentStatusUrlXml = value;
    }

    /**
	 * Gets the document status url www.
	 *
	 * @return the document status url www
	 */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_WWW")
    public String getDocumentStatusUrlWww() {
        return documentStatusUrlWww;
    }

    /**
	 * Sets the document status url www.
	 *
	 * @param value the new document status url www
	 */
    public void setDocumentStatusUrlWww(final String value) {
        this.documentStatusUrlWww = value;
    }

    /**
	 * Gets the committee proposal url xml.
	 *
	 * @return the committee proposal url xml
	 */
    @Basic
    @Column(name = "COMMITTEE_PROPOSAL_URL_XML")
    public String getCommitteeProposalUrlXml() {
        return committeeProposalUrlXml;
    }

    /**
	 * Sets the committee proposal url xml.
	 *
	 * @param value the new committee proposal url xml
	 */
    public void setCommitteeProposalUrlXml(final String value) {
        this.committeeProposalUrlXml = value;
    }

    /**
	 * With rm.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withRm(final String value) {
        setRm(value);
        return this;
    }

    /**
	 * With hangar id.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withHangarId(final BigInteger value) {
        setHangarId(value);
        return this;
    }

    /**
	 * With id.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withId(final String value) {
        setId(value);
        return this;
    }

    /**
	 * With label.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withLabel(final String value) {
        setLabel(value);
        return this;
    }

    /**
	 * With sub type.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withSubType(final String value) {
        setSubType(value);
        return this;
    }

    /**
	 * With temp label.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withTempLabel(final String value) {
        setTempLabel(value);
        return this;
    }

    /**
	 * With org.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withOrg(final String value) {
        setOrg(value);
        return this;
    }

    /**
	 * With end number.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withEndNumber(final BigInteger value) {
        setEndNumber(value);
        return this;
    }

    /**
	 * With created date.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withCreatedDate(final Date value) {
        setCreatedDate(value);
        return this;
    }

    /**
	 * With public date.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withPublicDate(final Date value) {
        setPublicDate(value);
        return this;
    }

    /**
	 * With title.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withTitle(final String value) {
        setTitle(value);
        return this;
    }

    /**
	 * With sub title.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withSubTitle(final String value) {
        setSubTitle(value);
        return this;
    }

    /**
	 * With status.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withStatus(final String value) {
        setStatus(value);
        return this;
    }

    /**
	 * With document url text.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withDocumentUrlText(final String value) {
        setDocumentUrlText(value);
        return this;
    }

    /**
	 * With document url html.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withDocumentUrlHtml(final String value) {
        setDocumentUrlHtml(value);
        return this;
    }

    /**
	 * With document status url xml.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withDocumentStatusUrlXml(final String value) {
        setDocumentStatusUrlXml(value);
        return this;
    }

    /**
	 * With document status url www.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withDocumentStatusUrlWww(final String value) {
        setDocumentStatusUrlWww(value);
        return this;
    }

    /**
	 * With committee proposal url xml.
	 *
	 * @param value the value
	 * @return the committee document data
	 */
    public CommitteeDocumentData withCommitteeProposalUrlXml(final String value) {
        setCommitteeProposalUrlXml(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}



    /* (non-Javadoc)
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
