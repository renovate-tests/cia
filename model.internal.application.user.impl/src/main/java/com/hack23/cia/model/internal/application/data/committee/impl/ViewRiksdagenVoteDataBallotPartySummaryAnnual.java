//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;


import java.math.BigDecimal;

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
 * <p>Java class for ViewRiksdagenVoteDataBallotPartySummaryAnnual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenVoteDataBallotPartySummaryAnnual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://committee.data.application.internal.model.cia.hack23.com/impl}RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId"/&gt;
 *         &lt;element name="total_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="yes_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="no_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="number_ballots" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="abstain_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="absent_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="approved_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="approved_percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_avg_born_year" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_total_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_yes_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_no_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_abstain_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_absent_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_avg_percentage_male" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_won_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="party_won_percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_male" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_born_year" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenVoteDataBallotPartySummaryAnnual", propOrder = {
    "embeddedId",
    "totalVotes",
    "yesVotes",
    "noVotes",
    "numberBallots",
    "abstainVotes",
    "absentVotes",
    "approvedTotal",
    "approvedPercentage",
    "percentageYes",
    "percentageNo",
    "percentageAbsent",
    "percentageAbstain",
    "partyAvgBornYear",
    "partyTotalVotes",
    "partyYesVotes",
    "partyNoVotes",
    "partyAbstainVotes",
    "partyAbsentVotes",
    "partyPercentageYes",
    "partyPercentageNo",
    "partyPercentageAbsent",
    "partyPercentageAbstain",
    "partyAvgPercentageMale",
    "partyWonTotal",
    "partyWonPercentage",
    "avgPercentageYes",
    "avgPercentageNo",
    "avgPercentageAbsent",
    "avgPercentageAbstain",
    "avgPercentageMale",
    "avgBornYear"
})
@Entity(name = "ViewRiksdagenVoteDataBallotPartySummaryAnnual")
@Table(name = "View_Riksdagen_Vote_Data_Ballot_Party_Summary_Annual")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenVoteDataBallotPartySummaryAnnual
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId embeddedId;
    @XmlElement(name = "total_votes", required = true)
    protected BigDecimal totalVotes;
    @XmlElement(name = "yes_votes", required = true)
    protected BigDecimal yesVotes;
    @XmlElement(name = "no_votes", required = true)
    protected BigDecimal noVotes;
    @XmlElement(name = "number_ballots", required = true)
    protected BigDecimal numberBallots;
    @XmlElement(name = "abstain_votes", required = true)
    protected BigDecimal abstainVotes;
    @XmlElement(name = "absent_votes", required = true)
    protected BigDecimal absentVotes;
    @XmlElement(name = "approved_total", required = true)
    protected BigDecimal approvedTotal;
    @XmlElement(name = "approved_percentage", required = true)
    protected BigDecimal approvedPercentage;
    @XmlElement(name = "percentage_yes", required = true)
    protected BigDecimal percentageYes;
    @XmlElement(name = "percentage_no", required = true)
    protected BigDecimal percentageNo;
    @XmlElement(name = "percentage_absent", required = true)
    protected BigDecimal percentageAbsent;
    @XmlElement(name = "percentage_abstain", required = true)
    protected BigDecimal percentageAbstain;
    @XmlElement(name = "party_avg_born_year", required = true)
    protected BigDecimal partyAvgBornYear;
    @XmlElement(name = "party_total_votes", required = true)
    protected BigDecimal partyTotalVotes;
    @XmlElement(name = "party_yes_votes", required = true)
    protected BigDecimal partyYesVotes;
    @XmlElement(name = "party_no_votes", required = true)
    protected BigDecimal partyNoVotes;
    @XmlElement(name = "party_abstain_votes", required = true)
    protected BigDecimal partyAbstainVotes;
    @XmlElement(name = "party_absent_votes", required = true)
    protected BigDecimal partyAbsentVotes;
    @XmlElement(name = "party_percentage_yes", required = true)
    protected BigDecimal partyPercentageYes;
    @XmlElement(name = "party_percentage_no", required = true)
    protected BigDecimal partyPercentageNo;
    @XmlElement(name = "party_percentage_absent", required = true)
    protected BigDecimal partyPercentageAbsent;
    @XmlElement(name = "party_percentage_abstain", required = true)
    protected BigDecimal partyPercentageAbstain;
    @XmlElement(name = "party_avg_percentage_male", required = true)
    protected BigDecimal partyAvgPercentageMale;
    @XmlElement(name = "party_won_total", required = true)
    protected BigDecimal partyWonTotal;
    @XmlElement(name = "party_won_percentage", required = true)
    protected BigDecimal partyWonPercentage;
    @XmlElement(name = "avg_percentage_yes", required = true)
    protected BigDecimal avgPercentageYes;
    @XmlElement(name = "avg_percentage_no", required = true)
    protected BigDecimal avgPercentageNo;
    @XmlElement(name = "avg_percentage_absent", required = true)
    protected BigDecimal avgPercentageAbsent;
    @XmlElement(name = "avg_percentage_abstain", required = true)
    protected BigDecimal avgPercentageAbstain;
    @XmlElement(name = "avg_percentage_male", required = true)
    protected BigDecimal avgPercentageMale;
    @XmlElement(name = "avg_born_year", required = true)
    protected BigDecimal avgBornYear;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "voteDate", column = @Column(name = "EMBEDDED_ID_VOTE_DATE")),
        @AttributeOverride(name = "party", column = @Column(name = "EMBEDDED_ID_PARTY"))
    })
    public RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(final RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the totalVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "TOTAL_VOTES", precision = 20, scale = 10)
    public BigDecimal getTotalVotes() {
        return totalVotes;
    }

    /**
     * Sets the value of the totalVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVotes(final BigDecimal value) {
        this.totalVotes = value;
    }

    /**
     * Gets the value of the yesVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "YES_VOTES", precision = 20, scale = 10)
    public BigDecimal getYesVotes() {
        return yesVotes;
    }

    /**
     * Sets the value of the yesVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYesVotes(final BigDecimal value) {
        this.yesVotes = value;
    }

    /**
     * Gets the value of the noVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "NO_VOTES", precision = 20, scale = 10)
    public BigDecimal getNoVotes() {
        return noVotes;
    }

    /**
     * Sets the value of the noVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoVotes(final BigDecimal value) {
        this.noVotes = value;
    }

    /**
     * Gets the value of the numberBallots property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "NUMBER_BALLOTS", precision = 20, scale = 10)
    public BigDecimal getNumberBallots() {
        return numberBallots;
    }

    /**
     * Sets the value of the numberBallots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberBallots(final BigDecimal value) {
        this.numberBallots = value;
    }

    /**
     * Gets the value of the abstainVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "ABSTAIN_VOTES", precision = 20, scale = 10)
    public BigDecimal getAbstainVotes() {
        return abstainVotes;
    }

    /**
     * Sets the value of the abstainVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbstainVotes(final BigDecimal value) {
        this.abstainVotes = value;
    }

    /**
     * Gets the value of the absentVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "ABSENT_VOTES", precision = 20, scale = 10)
    public BigDecimal getAbsentVotes() {
        return absentVotes;
    }

    /**
     * Sets the value of the absentVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbsentVotes(final BigDecimal value) {
        this.absentVotes = value;
    }

    /**
     * Gets the value of the approvedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "APPROVED_TOTAL", precision = 20, scale = 10)
    public BigDecimal getApprovedTotal() {
        return approvedTotal;
    }

    /**
     * Sets the value of the approvedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedTotal(final BigDecimal value) {
        this.approvedTotal = value;
    }

    /**
     * Gets the value of the approvedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "APPROVED_PERCENTAGE", precision = 20, scale = 10)
    public BigDecimal getApprovedPercentage() {
        return approvedPercentage;
    }

    /**
     * Sets the value of the approvedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedPercentage(final BigDecimal value) {
        this.approvedPercentage = value;
    }

    /**
     * Gets the value of the percentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getPercentageYes() {
        return percentageYes;
    }

    /**
     * Sets the value of the percentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageYes(final BigDecimal value) {
        this.percentageYes = value;
    }

    /**
     * Gets the value of the percentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getPercentageNo() {
        return percentageNo;
    }

    /**
     * Sets the value of the percentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageNo(final BigDecimal value) {
        this.percentageNo = value;
    }

    /**
     * Gets the value of the percentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getPercentageAbsent() {
        return percentageAbsent;
    }

    /**
     * Sets the value of the percentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbsent(final BigDecimal value) {
        this.percentageAbsent = value;
    }

    /**
     * Gets the value of the percentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getPercentageAbstain() {
        return percentageAbstain;
    }

    /**
     * Sets the value of the percentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbstain(final BigDecimal value) {
        this.percentageAbstain = value;
    }

    /**
     * Gets the value of the partyAvgBornYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_AVG_BORN_YEAR", precision = 20, scale = 10)
    public BigDecimal getPartyAvgBornYear() {
        return partyAvgBornYear;
    }

    /**
     * Sets the value of the partyAvgBornYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyAvgBornYear(final BigDecimal value) {
        this.partyAvgBornYear = value;
    }

    /**
     * Gets the value of the partyTotalVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_TOTAL_VOTES", precision = 20, scale = 10)
    public BigDecimal getPartyTotalVotes() {
        return partyTotalVotes;
    }

    /**
     * Sets the value of the partyTotalVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyTotalVotes(final BigDecimal value) {
        this.partyTotalVotes = value;
    }

    /**
     * Gets the value of the partyYesVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_YES_VOTES", precision = 20, scale = 10)
    public BigDecimal getPartyYesVotes() {
        return partyYesVotes;
    }

    /**
     * Sets the value of the partyYesVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyYesVotes(final BigDecimal value) {
        this.partyYesVotes = value;
    }

    /**
     * Gets the value of the partyNoVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_NO_VOTES", precision = 20, scale = 10)
    public BigDecimal getPartyNoVotes() {
        return partyNoVotes;
    }

    /**
     * Sets the value of the partyNoVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyNoVotes(final BigDecimal value) {
        this.partyNoVotes = value;
    }

    /**
     * Gets the value of the partyAbstainVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_ABSTAIN_VOTES", precision = 20, scale = 10)
    public BigDecimal getPartyAbstainVotes() {
        return partyAbstainVotes;
    }

    /**
     * Sets the value of the partyAbstainVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyAbstainVotes(final BigDecimal value) {
        this.partyAbstainVotes = value;
    }

    /**
     * Gets the value of the partyAbsentVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_ABSENT_VOTES", precision = 20, scale = 10)
    public BigDecimal getPartyAbsentVotes() {
        return partyAbsentVotes;
    }

    /**
     * Sets the value of the partyAbsentVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyAbsentVotes(final BigDecimal value) {
        this.partyAbsentVotes = value;
    }

    /**
     * Gets the value of the partyPercentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getPartyPercentageYes() {
        return partyPercentageYes;
    }

    /**
     * Sets the value of the partyPercentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyPercentageYes(final BigDecimal value) {
        this.partyPercentageYes = value;
    }

    /**
     * Gets the value of the partyPercentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getPartyPercentageNo() {
        return partyPercentageNo;
    }

    /**
     * Sets the value of the partyPercentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyPercentageNo(final BigDecimal value) {
        this.partyPercentageNo = value;
    }

    /**
     * Gets the value of the partyPercentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getPartyPercentageAbsent() {
        return partyPercentageAbsent;
    }

    /**
     * Sets the value of the partyPercentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyPercentageAbsent(final BigDecimal value) {
        this.partyPercentageAbsent = value;
    }

    /**
     * Gets the value of the partyPercentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getPartyPercentageAbstain() {
        return partyPercentageAbstain;
    }

    /**
     * Sets the value of the partyPercentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyPercentageAbstain(final BigDecimal value) {
        this.partyPercentageAbstain = value;
    }

    /**
     * Gets the value of the partyAvgPercentageMale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_AVG_PERCENTAGE_MALE", precision = 20, scale = 10)
    public BigDecimal getPartyAvgPercentageMale() {
        return partyAvgPercentageMale;
    }

    /**
     * Sets the value of the partyAvgPercentageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyAvgPercentageMale(final BigDecimal value) {
        this.partyAvgPercentageMale = value;
    }

    /**
     * Gets the value of the partyWonTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_WON_TOTAL", precision = 20, scale = 10)
    public BigDecimal getPartyWonTotal() {
        return partyWonTotal;
    }

    /**
     * Sets the value of the partyWonTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyWonTotal(final BigDecimal value) {
        this.partyWonTotal = value;
    }

    /**
     * Gets the value of the partyWonPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PARTY_WON_PERCENTAGE", precision = 20, scale = 10)
    public BigDecimal getPartyWonPercentage() {
        return partyWonPercentage;
    }

    /**
     * Sets the value of the partyWonPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartyWonPercentage(final BigDecimal value) {
        this.partyWonPercentage = value;
    }

    /**
     * Gets the value of the avgPercentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageYes() {
        return avgPercentageYes;
    }

    /**
     * Sets the value of the avgPercentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageYes(final BigDecimal value) {
        this.avgPercentageYes = value;
    }

    /**
     * Gets the value of the avgPercentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageNo() {
        return avgPercentageNo;
    }

    /**
     * Sets the value of the avgPercentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageNo(final BigDecimal value) {
        this.avgPercentageNo = value;
    }

    /**
     * Gets the value of the avgPercentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageAbsent() {
        return avgPercentageAbsent;
    }

    /**
     * Sets the value of the avgPercentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageAbsent(final BigDecimal value) {
        this.avgPercentageAbsent = value;
    }

    /**
     * Gets the value of the avgPercentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageAbstain() {
        return avgPercentageAbstain;
    }

    /**
     * Sets the value of the avgPercentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageAbstain(final BigDecimal value) {
        this.avgPercentageAbstain = value;
    }

    /**
     * Gets the value of the avgPercentageMale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_MALE", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageMale() {
        return avgPercentageMale;
    }

    /**
     * Sets the value of the avgPercentageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageMale(final BigDecimal value) {
        this.avgPercentageMale = value;
    }

    /**
     * Gets the value of the avgBornYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_BORN_YEAR", precision = 20, scale = 10)
    public BigDecimal getAvgBornYear() {
        return avgBornYear;
    }

    /**
     * Sets the value of the avgBornYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgBornYear(final BigDecimal value) {
        this.avgBornYear = value;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withEmbeddedId(final RiksdagenVoteDataBallotPartyPeriodSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withTotalVotes(final BigDecimal value) {
        setTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withYesVotes(final BigDecimal value) {
        setYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withNoVotes(final BigDecimal value) {
        setNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withNumberBallots(final BigDecimal value) {
        setNumberBallots(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAbstainVotes(final BigDecimal value) {
        setAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAbsentVotes(final BigDecimal value) {
        setAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withApprovedTotal(final BigDecimal value) {
        setApprovedTotal(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withApprovedPercentage(final BigDecimal value) {
        setApprovedPercentage(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPercentageYes(final BigDecimal value) {
        setPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPercentageNo(final BigDecimal value) {
        setPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPercentageAbsent(final BigDecimal value) {
        setPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPercentageAbstain(final BigDecimal value) {
        setPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyAvgBornYear(final BigDecimal value) {
        setPartyAvgBornYear(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyTotalVotes(final BigDecimal value) {
        setPartyTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyYesVotes(final BigDecimal value) {
        setPartyYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyNoVotes(final BigDecimal value) {
        setPartyNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyAbstainVotes(final BigDecimal value) {
        setPartyAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyAbsentVotes(final BigDecimal value) {
        setPartyAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyPercentageYes(final BigDecimal value) {
        setPartyPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyPercentageNo(final BigDecimal value) {
        setPartyPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyPercentageAbsent(final BigDecimal value) {
        setPartyPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyPercentageAbstain(final BigDecimal value) {
        setPartyPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyAvgPercentageMale(final BigDecimal value) {
        setPartyAvgPercentageMale(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyWonTotal(final BigDecimal value) {
        setPartyWonTotal(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withPartyWonPercentage(final BigDecimal value) {
        setPartyWonPercentage(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgPercentageYes(final BigDecimal value) {
        setAvgPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgPercentageNo(final BigDecimal value) {
        setAvgPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgPercentageAbsent(final BigDecimal value) {
        setAvgPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgPercentageAbstain(final BigDecimal value) {
        setAvgPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgPercentageMale(final BigDecimal value) {
        setAvgPercentageMale(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotPartySummaryAnnual withAvgBornYear(final BigDecimal value) {
        setAvgBornYear(value);
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
