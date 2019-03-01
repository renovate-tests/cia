//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.politician.impl;


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
 * <p>Java class for ViewRiksdagenPolitician complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenPolitician"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bornYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="firstAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lastAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="totalDaysServed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedParliament" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedCommittee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedGovernment" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedEu" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeEu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeCommittee" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeParliament" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeParty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeSpeaker" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalDaysServedSpeaker" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedParty" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalPartyAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalMinistryAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalCommitteeAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalSpeakerAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentPartyAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentMinistryAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentCommitteeAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentSpeakerAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPolitician", propOrder = {
    "personId",
    "firstName",
    "lastName",
    "party",
    "gender",
    "bornYear",
    "totalAssignments",
    "currentAssignments",
    "firstAssignmentDate",
    "lastAssignmentDate",
    "totalDaysServed",
    "totalDaysServedParliament",
    "totalDaysServedCommittee",
    "totalDaysServedGovernment",
    "totalDaysServedEu",
    "active",
    "activeEu",
    "activeGovernment",
    "activeCommittee",
    "activeParliament",
    "activeParty",
    "activeSpeaker",
    "totalDaysServedSpeaker",
    "totalDaysServedParty",
    "totalPartyAssignments",
    "totalMinistryAssignments",
    "totalCommitteeAssignments",
    "totalSpeakerAssignments",
    "currentPartyAssignments",
    "currentMinistryAssignments",
    "currentCommitteeAssignments",
    "currentSpeakerAssignments"
})
@Entity(name = "ViewRiksdagenPolitician")
@Table(name = "VIEW_RIKSDAGEN_POLITICIAN")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPolitician
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String personId;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String party;
    @XmlElement(required = true)
    protected String gender;
    protected int bornYear;
    protected long totalAssignments;
    protected long currentAssignments;
    @XmlElement(required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date firstAssignmentDate;
    @XmlElement(required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date lastAssignmentDate;
    protected long totalDaysServed;
    protected long totalDaysServedParliament;
    protected long totalDaysServedCommittee;
    protected long totalDaysServedGovernment;
    protected long totalDaysServedEu;
    protected boolean active;
    protected boolean activeEu;
    protected boolean activeGovernment;
    protected boolean activeCommittee;
    protected boolean activeParliament;
    protected boolean activeParty;
    protected boolean activeSpeaker;
    protected long totalDaysServedSpeaker;
    protected long totalDaysServedParty;
    protected long totalPartyAssignments;
    protected long totalMinistryAssignments;
    protected long totalCommitteeAssignments;
    protected long totalSpeakerAssignments;
    protected long currentPartyAssignments;
    protected long currentMinistryAssignments;
    protected long currentCommitteeAssignments;
    protected long currentSpeakerAssignments;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "PERSON_ID")
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(final String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(final String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(final String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY")
    public String getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParty(final String value) {
        this.party = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(final String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the bornYear property.
     * 
     */
    @Basic
    @Column(name = "BORN_YEAR", precision = 10, scale = 0)
    public int getBornYear() {
        return bornYear;
    }

    /**
     * Sets the value of the bornYear property.
     * 
     */
    public void setBornYear(final int value) {
        this.bornYear = value;
    }

    /**
     * Gets the value of the totalAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_ASSIGNMENTS", precision = 20)
    public long getTotalAssignments() {
        return totalAssignments;
    }

    /**
     * Sets the value of the totalAssignments property.
     * 
     */
    public void setTotalAssignments(final long value) {
        this.totalAssignments = value;
    }

    /**
     * Gets the value of the currentAssignments property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_ASSIGNMENTS", precision = 20)
    public long getCurrentAssignments() {
        return currentAssignments;
    }

    /**
     * Sets the value of the currentAssignments property.
     * 
     */
    public void setCurrentAssignments(final long value) {
        this.currentAssignments = value;
    }

    /**
     * Gets the value of the firstAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_ASSIGNMENT_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFirstAssignmentDate() {
        return firstAssignmentDate;
    }

    /**
     * Sets the value of the firstAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAssignmentDate(final Date value) {
        this.firstAssignmentDate = value;
    }

    /**
     * Gets the value of the lastAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_ASSIGNMENT_DATE")
    @Temporal(TemporalType.DATE)
    public Date getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    /**
     * Sets the value of the lastAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAssignmentDate(final Date value) {
        this.lastAssignmentDate = value;
    }

    /**
     * Gets the value of the totalDaysServed property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED", precision = 20)
    public long getTotalDaysServed() {
        return totalDaysServed;
    }

    /**
     * Sets the value of the totalDaysServed property.
     * 
     */
    public void setTotalDaysServed(final long value) {
        this.totalDaysServed = value;
    }

    /**
     * Gets the value of the totalDaysServedParliament property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_PARLIAMENT", precision = 20)
    public long getTotalDaysServedParliament() {
        return totalDaysServedParliament;
    }

    /**
     * Sets the value of the totalDaysServedParliament property.
     * 
     */
    public void setTotalDaysServedParliament(final long value) {
        this.totalDaysServedParliament = value;
    }

    /**
     * Gets the value of the totalDaysServedCommittee property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_COMMITTEE", precision = 20)
    public long getTotalDaysServedCommittee() {
        return totalDaysServedCommittee;
    }

    /**
     * Sets the value of the totalDaysServedCommittee property.
     * 
     */
    public void setTotalDaysServedCommittee(final long value) {
        this.totalDaysServedCommittee = value;
    }

    /**
     * Gets the value of the totalDaysServedGovernment property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_GOVERNMENT", precision = 20)
    public long getTotalDaysServedGovernment() {
        return totalDaysServedGovernment;
    }

    /**
     * Sets the value of the totalDaysServedGovernment property.
     * 
     */
    public void setTotalDaysServedGovernment(final long value) {
        this.totalDaysServedGovernment = value;
    }

    /**
     * Gets the value of the totalDaysServedEu property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_EU", precision = 20)
    public long getTotalDaysServedEu() {
        return totalDaysServedEu;
    }

    /**
     * Sets the value of the totalDaysServedEu property.
     * 
     */
    public void setTotalDaysServedEu(final long value) {
        this.totalDaysServedEu = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE")
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(final boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the activeEu property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_EU")
    public boolean isActiveEu() {
        return activeEu;
    }

    /**
     * Sets the value of the activeEu property.
     * 
     */
    public void setActiveEu(final boolean value) {
        this.activeEu = value;
    }

    /**
     * Gets the value of the activeGovernment property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_GOVERNMENT")
    public boolean isActiveGovernment() {
        return activeGovernment;
    }

    /**
     * Sets the value of the activeGovernment property.
     * 
     */
    public void setActiveGovernment(final boolean value) {
        this.activeGovernment = value;
    }

    /**
     * Gets the value of the activeCommittee property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_COMMITTEE")
    public boolean isActiveCommittee() {
        return activeCommittee;
    }

    /**
     * Sets the value of the activeCommittee property.
     * 
     */
    public void setActiveCommittee(final boolean value) {
        this.activeCommittee = value;
    }

    /**
     * Gets the value of the activeParliament property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_PARLIAMENT")
    public boolean isActiveParliament() {
        return activeParliament;
    }

    /**
     * Sets the value of the activeParliament property.
     * 
     */
    public void setActiveParliament(final boolean value) {
        this.activeParliament = value;
    }

    /**
     * Gets the value of the activeParty property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_PARTY")
    public boolean isActiveParty() {
        return activeParty;
    }

    /**
     * Sets the value of the activeParty property.
     * 
     */
    public void setActiveParty(final boolean value) {
        this.activeParty = value;
    }

    /**
     * Gets the value of the activeSpeaker property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE_SPEAKER")
    public boolean isActiveSpeaker() {
        return activeSpeaker;
    }

    /**
     * Sets the value of the activeSpeaker property.
     * 
     */
    public void setActiveSpeaker(final boolean value) {
        this.activeSpeaker = value;
    }

    /**
     * Gets the value of the totalDaysServedSpeaker property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_SPEAKER", precision = 20)
    public long getTotalDaysServedSpeaker() {
        return totalDaysServedSpeaker;
    }

    /**
     * Sets the value of the totalDaysServedSpeaker property.
     * 
     */
    public void setTotalDaysServedSpeaker(final long value) {
        this.totalDaysServedSpeaker = value;
    }

    /**
     * Gets the value of the totalDaysServedParty property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED_PARTY", precision = 20)
    public long getTotalDaysServedParty() {
        return totalDaysServedParty;
    }

    /**
     * Sets the value of the totalDaysServedParty property.
     * 
     */
    public void setTotalDaysServedParty(final long value) {
        this.totalDaysServedParty = value;
    }

    /**
     * Gets the value of the totalPartyAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_PARTY_ASSIGNMENTS", precision = 20)
    public long getTotalPartyAssignments() {
        return totalPartyAssignments;
    }

    /**
     * Sets the value of the totalPartyAssignments property.
     * 
     */
    public void setTotalPartyAssignments(final long value) {
        this.totalPartyAssignments = value;
    }

    /**
     * Gets the value of the totalMinistryAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_MINISTRY_ASSIGNMENTS", precision = 20)
    public long getTotalMinistryAssignments() {
        return totalMinistryAssignments;
    }

    /**
     * Sets the value of the totalMinistryAssignments property.
     * 
     */
    public void setTotalMinistryAssignments(final long value) {
        this.totalMinistryAssignments = value;
    }

    /**
     * Gets the value of the totalCommitteeAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_COMMITTEE_ASSIGNMENTS", precision = 20)
    public long getTotalCommitteeAssignments() {
        return totalCommitteeAssignments;
    }

    /**
     * Sets the value of the totalCommitteeAssignments property.
     * 
     */
    public void setTotalCommitteeAssignments(final long value) {
        this.totalCommitteeAssignments = value;
    }

    /**
     * Gets the value of the totalSpeakerAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_SPEAKER_ASSIGNMENTS", precision = 20)
    public long getTotalSpeakerAssignments() {
        return totalSpeakerAssignments;
    }

    /**
     * Sets the value of the totalSpeakerAssignments property.
     * 
     */
    public void setTotalSpeakerAssignments(final long value) {
        this.totalSpeakerAssignments = value;
    }

    /**
     * Gets the value of the currentPartyAssignments property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_PARTY_ASSIGNMENTS", precision = 20)
    public long getCurrentPartyAssignments() {
        return currentPartyAssignments;
    }

    /**
     * Sets the value of the currentPartyAssignments property.
     * 
     */
    public void setCurrentPartyAssignments(final long value) {
        this.currentPartyAssignments = value;
    }

    /**
     * Gets the value of the currentMinistryAssignments property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_MINISTRY_ASSIGNMENTS", precision = 20)
    public long getCurrentMinistryAssignments() {
        return currentMinistryAssignments;
    }

    /**
     * Sets the value of the currentMinistryAssignments property.
     * 
     */
    public void setCurrentMinistryAssignments(final long value) {
        this.currentMinistryAssignments = value;
    }

    /**
     * Gets the value of the currentCommitteeAssignments property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_COMMITTEE_ASSIGNMENTS", precision = 20)
    public long getCurrentCommitteeAssignments() {
        return currentCommitteeAssignments;
    }

    /**
     * Sets the value of the currentCommitteeAssignments property.
     * 
     */
    public void setCurrentCommitteeAssignments(final long value) {
        this.currentCommitteeAssignments = value;
    }

    /**
     * Gets the value of the currentSpeakerAssignments property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_SPEAKER_ASSIGNMENTS", precision = 20)
    public long getCurrentSpeakerAssignments() {
        return currentSpeakerAssignments;
    }

    /**
     * Sets the value of the currentSpeakerAssignments property.
     * 
     */
    public void setCurrentSpeakerAssignments(final long value) {
        this.currentSpeakerAssignments = value;
    }

    public ViewRiksdagenPolitician withPersonId(final String value) {
        setPersonId(value);
        return this;
    }

    public ViewRiksdagenPolitician withFirstName(final String value) {
        setFirstName(value);
        return this;
    }

    public ViewRiksdagenPolitician withLastName(final String value) {
        setLastName(value);
        return this;
    }

    public ViewRiksdagenPolitician withParty(final String value) {
        setParty(value);
        return this;
    }

    public ViewRiksdagenPolitician withGender(final String value) {
        setGender(value);
        return this;
    }

    public ViewRiksdagenPolitician withBornYear(final int value) {
        setBornYear(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalAssignments(final long value) {
        setTotalAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withCurrentAssignments(final long value) {
        setCurrentAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withFirstAssignmentDate(final Date value) {
        setFirstAssignmentDate(value);
        return this;
    }

    public ViewRiksdagenPolitician withLastAssignmentDate(final Date value) {
        setLastAssignmentDate(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServed(final long value) {
        setTotalDaysServed(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedParliament(final long value) {
        setTotalDaysServedParliament(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedCommittee(final long value) {
        setTotalDaysServedCommittee(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedGovernment(final long value) {
        setTotalDaysServedGovernment(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedEu(final long value) {
        setTotalDaysServedEu(value);
        return this;
    }

    public ViewRiksdagenPolitician withActive(final boolean value) {
        setActive(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveEu(final boolean value) {
        setActiveEu(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveGovernment(final boolean value) {
        setActiveGovernment(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveCommittee(final boolean value) {
        setActiveCommittee(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveParliament(final boolean value) {
        setActiveParliament(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveParty(final boolean value) {
        setActiveParty(value);
        return this;
    }

    public ViewRiksdagenPolitician withActiveSpeaker(final boolean value) {
        setActiveSpeaker(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedSpeaker(final long value) {
        setTotalDaysServedSpeaker(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalDaysServedParty(final long value) {
        setTotalDaysServedParty(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalPartyAssignments(final long value) {
        setTotalPartyAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalMinistryAssignments(final long value) {
        setTotalMinistryAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalCommitteeAssignments(final long value) {
        setTotalCommitteeAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withTotalSpeakerAssignments(final long value) {
        setTotalSpeakerAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withCurrentPartyAssignments(final long value) {
        setCurrentPartyAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withCurrentMinistryAssignments(final long value) {
        setCurrentMinistryAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withCurrentCommitteeAssignments(final long value) {
        setCurrentCommitteeAssignments(value);
        return this;
    }

    public ViewRiksdagenPolitician withCurrentSpeakerAssignments(final long value) {
        setCurrentSpeakerAssignments(value);
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
