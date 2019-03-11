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
// Generated on: 2019.02.24 at 11:39:59 PM CET 
//


package com.hack23.cia.model.external.riksdagen.personlista.impl;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * The Class AssignmentElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentElement", propOrder = {
    "orgCode",
    "roleCode",
    "orderNumber",
    "status",
    "assignmentType",
    "fromDate",
    "toDate",
    "detail",
    "intressentId"
})
@Entity(name = "AssignmentElement")
@Table(name = "ASSIGNMENT_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class AssignmentElement
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The org code. */
    @XmlElement(name = "organ_kod", required = true)
    @XmlSchemaType(name = "string")
    protected OrgCode orgCode;
    
    /** The role code. */
    @XmlElement(name = "roll_kod", required = true)
    @XmlSchemaType(name = "string")
    protected RoleStatus roleCode;
    
    /** The order number. */
    @XmlElement(name = "ordningsnummer", required = true)
    protected String orderNumber;
    
    /** The status. */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoleStatus status;
    
    /** The assignment type. */
    @XmlElement(name = "typ", required = true)
    protected String assignmentType;
    
    /** The from date. */
    @XmlElement(name = "from", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    
    /** The to date. */
    @XmlElement(name = "tom", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    
    /** The detail. */
    @XmlElement(name = "uppgift", required = true)
    protected String detail;
    
    /** The intressent id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the org code.
	 *
	 * @return the org code
	 */
    @Basic
    @Column(name = "ORG_CODE")
    @Enumerated(EnumType.STRING)
    public OrgCode getOrgCode() {
        return orgCode;
    }

    /**
	 * Sets the org code.
	 *
	 * @param value the new org code
	 */
    public void setOrgCode(final OrgCode value) {
        this.orgCode = value;
    }

    /**
	 * Gets the role code.
	 *
	 * @return the role code
	 */
    @Basic
    @Column(name = "ROLE_CODE")
    @Enumerated(EnumType.STRING)
    public RoleStatus getRoleCode() {
        return roleCode;
    }

    /**
	 * Sets the role code.
	 *
	 * @param value the new role code
	 */
    public void setRoleCode(final RoleStatus value) {
        this.roleCode = value;
    }

    /**
	 * Gets the order number.
	 *
	 * @return the order number
	 */
    @Basic
    @Column(name = "ORDER_NUMBER")
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
	 * Sets the order number.
	 *
	 * @param value the new order number
	 */
    public void setOrderNumber(final String value) {
        this.orderNumber = value;
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    @Basic
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    public RoleStatus getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param value the new status
	 */
    public void setStatus(final RoleStatus value) {
        this.status = value;
    }

    /**
	 * Gets the assignment type.
	 *
	 * @return the assignment type
	 */
    @Basic
    @Column(name = "ASSIGNMENT_TYPE")
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
	 * Sets the assignment type.
	 *
	 * @param value the new assignment type
	 */
    public void setAssignmentType(final String value) {
        this.assignmentType = value;
    }

    /**
	 * Gets the from date.
	 *
	 * @return the from date
	 */
    @Basic
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    /**
	 * Sets the from date.
	 *
	 * @param value the new from date
	 */
    public void setFromDate(final Date value) {
        this.fromDate = value;
    }

    /**
	 * Gets the to date.
	 *
	 * @return the to date
	 */
    @Basic
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    /**
	 * Sets the to date.
	 *
	 * @param value the new to date
	 */
    public void setToDate(final Date value) {
        this.toDate = value;
    }

    /**
	 * Gets the detail.
	 *
	 * @return the detail
	 */
    @Basic
    @Column(name = "DETAIL", length = 65536)
    public String getDetail() {
        return detail;
    }

    /**
	 * Sets the detail.
	 *
	 * @param value the new detail
	 */
    public void setDetail(final String value) {
        this.detail = value;
    }

    /**
	 * Gets the intressent id.
	 *
	 * @return the intressent id
	 */
    @Basic
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
	 * Sets the intressent id.
	 *
	 * @param value the new intressent id
	 */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    /**
	 * With org code.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withOrgCode(final OrgCode value) {
        setOrgCode(value);
        return this;
    }

    /**
	 * With role code.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withRoleCode(final RoleStatus value) {
        setRoleCode(value);
        return this;
    }

    /**
	 * With order number.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withOrderNumber(final String value) {
        setOrderNumber(value);
        return this;
    }

    /**
	 * With status.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withStatus(final RoleStatus value) {
        setStatus(value);
        return this;
    }

    /**
	 * With assignment type.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withAssignmentType(final String value) {
        setAssignmentType(value);
        return this;
    }

    /**
	 * With from date.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withFromDate(final Date value) {
        setFromDate(value);
        return this;
    }

    /**
	 * With to date.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withToDate(final Date value) {
        setToDate(value);
        return this;
    }

    /**
	 * With detail.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withDetail(final String value) {
        setDetail(value);
        return this;
    }

    /**
	 * With intressent id.
	 *
	 * @param value the value
	 * @return the assignment element
	 */
    public AssignmentElement withIntressentId(final String value) {
        setIntressentId(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}



    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object,"hjid");
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
