//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * <p>Java class for RiksdagenVoteDataBallotPoliticianEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiksdagenVoteDataBallotPoliticianEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ballotId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="concern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="issue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intressentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiksdagenVoteDataBallotPoliticianEmbeddedId", propOrder = {
    "ballotId",
    "concern",
    "issue",
    "intressentId"
})
@Embeddable
public class RiksdagenVoteDataBallotPoliticianEmbeddedId
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String ballotId;
    @XmlElement(required = true)
    protected String concern;
    @XmlElement(required = true)
    protected String issue;
    @XmlElement(required = true)
    protected String intressentId;

    /**
     * Gets the value of the ballotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BALLOT_ID")
    public String getBallotId() {
        return ballotId;
    }

    /**
     * Sets the value of the ballotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBallotId(final String value) {
        this.ballotId = value;
    }

    /**
     * Gets the value of the concern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONCERN")
    public String getConcern() {
        return concern;
    }

    /**
     * Sets the value of the concern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcern(final String value) {
        this.concern = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ISSUE")
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(final String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the intressentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
     * Sets the value of the intressentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    public RiksdagenVoteDataBallotPoliticianEmbeddedId withBallotId(final String value) {
        setBallotId(value);
        return this;
    }

    public RiksdagenVoteDataBallotPoliticianEmbeddedId withConcern(final String value) {
        setConcern(value);
        return this;
    }

    public RiksdagenVoteDataBallotPoliticianEmbeddedId withIssue(final String value) {
        setIssue(value);
        return this;
    }

    public RiksdagenVoteDataBallotPoliticianEmbeddedId withIntressentId(final String value) {
        setIntressentId(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
