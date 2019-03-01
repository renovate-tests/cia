//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.party.impl;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
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
 * <p>Java class for ViewRiksdagenPartyBallotSupportAnnualSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenPartyBallotSupportAnnualSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://party.data.application.internal.model.cia.hack23.com/impl}ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId"/&gt;
 *         &lt;element name="disagre_count" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="agree_count" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="disagree_percentage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="total_ballots" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPartyBallotSupportAnnualSummary", propOrder = {
    "embeddedId",
    "disagreCount",
    "agreeCount",
    "disagreePercentage",
    "totalBallots"
})
@Entity(name = "ViewRiksdagenPartyBallotSupportAnnualSummary")
@Table(name = "view_riksdagen_party_ballot_support_annual_summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPartyBallotSupportAnnualSummary
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId embeddedId;
    @XmlElement(name = "disagre_count")
    protected long disagreCount;
    @XmlElement(name = "agree_count")
    protected long agreeCount;
    @XmlElement(name = "disagree_percentage")
    protected long disagreePercentage;
    @XmlElement(name = "total_ballots")
    protected long totalBallots;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "date", column = @Column(name = "EMBEDDED_ID_DATE")),
        @AttributeOverride(name = "party", column = @Column(name = "EMBEDDED_ID_PARTY")),
        @AttributeOverride(name = "otherParty", column = @Column(name = "EMBEDDED_ID_OTHER_PARTY"))
    })
    public ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(final ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the disagreCount property.
     * 
     */
    @Basic
    @Column(name = "DISAGRE_COUNT", precision = 20)
    public long getDisagreCount() {
        return disagreCount;
    }

    /**
     * Sets the value of the disagreCount property.
     * 
     */
    public void setDisagreCount(final long value) {
        this.disagreCount = value;
    }

    /**
     * Gets the value of the agreeCount property.
     * 
     */
    @Basic
    @Column(name = "AGREE_COUNT", precision = 20)
    public long getAgreeCount() {
        return agreeCount;
    }

    /**
     * Sets the value of the agreeCount property.
     * 
     */
    public void setAgreeCount(final long value) {
        this.agreeCount = value;
    }

    /**
     * Gets the value of the disagreePercentage property.
     * 
     */
    @Basic
    @Column(name = "DISAGREE_PERCENTAGE", precision = 20)
    public long getDisagreePercentage() {
        return disagreePercentage;
    }

    /**
     * Sets the value of the disagreePercentage property.
     * 
     */
    public void setDisagreePercentage(final long value) {
        this.disagreePercentage = value;
    }

    /**
     * Gets the value of the totalBallots property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_BALLOTS", precision = 20)
    public long getTotalBallots() {
        return totalBallots;
    }

    /**
     * Sets the value of the totalBallots property.
     * 
     */
    public void setTotalBallots(final long value) {
        this.totalBallots = value;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withEmbeddedId(final ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withDisagreCount(final long value) {
        setDisagreCount(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withAgreeCount(final long value) {
        setAgreeCount(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withDisagreePercentage(final long value) {
        setDisagreePercentage(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withTotalBallots(final long value) {
        setTotalBallots(value);
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
