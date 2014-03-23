//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.compact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.ActionType;


/**
 * DataSetType acts as a structural base, which is extended through the addition of attributes to reflect the particular needs of a specific key family using the xs:extends element. Attributes are provided for describing the contents of a data or metadata set, which are particularly important for interactions with the SDMX Registry: datasetID, dataProviderSchemeAgencyID, dataProviderSchemeID, dataflowAgencyID, and dataflowID all take the IDs specified by the attribute names. The action attribute indicates whether the file is appending, replacing, or deleting. Attributes reportingBeginDate, reportingEndDate, validFromDate, and validToDate are inclusive. publicationYear holds the ISO 8601 four-digit year, and publicationPeriod specifies the period of publication of the data in terms of whatever provisioning agreements might be in force (ie, "Q1 2005" if that is the time of publication for a data set published on a quarterly basis).
 * 
 * <p>Java class for DataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="keyFamilyURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="datasetID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="dataProviderSchemeAgencyId" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="dataProviderSchemeId" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="dataProviderID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="dataflowAgencyID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="dataflowID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="action" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ActionType" />
 *       &lt;attribute name="reportingBeginDate" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *       &lt;attribute name="reportingEndDate" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *       &lt;attribute name="validFromDate" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *       &lt;attribute name="validToDate" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *       &lt;attribute name="publicationYear" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *       &lt;attribute name="publicationPeriod" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetType")
public abstract class DataSetType {

    @XmlAttribute(name = "keyFamilyURI")
    @XmlSchemaType(name = "anyURI")
    protected String keyFamilyURI;
    @XmlAttribute(name = "datasetID")
    protected String datasetID;
    @XmlAttribute(name = "dataProviderSchemeAgencyId")
    protected String dataProviderSchemeAgencyId;
    @XmlAttribute(name = "dataProviderSchemeId")
    protected String dataProviderSchemeId;
    @XmlAttribute(name = "dataProviderID")
    protected String dataProviderID;
    @XmlAttribute(name = "dataflowAgencyID")
    protected String dataflowAgencyID;
    @XmlAttribute(name = "dataflowID")
    protected String dataflowID;
    @XmlAttribute(name = "action")
    protected ActionType action;
    @XmlAttribute(name = "reportingBeginDate")
    protected String reportingBeginDate;
    @XmlAttribute(name = "reportingEndDate")
    protected String reportingEndDate;
    @XmlAttribute(name = "validFromDate")
    protected String validFromDate;
    @XmlAttribute(name = "validToDate")
    protected String validToDate;
    @XmlAttribute(name = "publicationYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar publicationYear;
    @XmlAttribute(name = "publicationPeriod")
    protected String publicationPeriod;

    /**
     * Gets the value of the keyFamilyURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFamilyURI() {
        return keyFamilyURI;
    }

    /**
     * Sets the value of the keyFamilyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFamilyURI(String value) {
        this.keyFamilyURI = value;
    }

    /**
     * Gets the value of the datasetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetID() {
        return datasetID;
    }

    /**
     * Sets the value of the datasetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetID(String value) {
        this.datasetID = value;
    }

    /**
     * Gets the value of the dataProviderSchemeAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderSchemeAgencyId() {
        return dataProviderSchemeAgencyId;
    }

    /**
     * Sets the value of the dataProviderSchemeAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderSchemeAgencyId(String value) {
        this.dataProviderSchemeAgencyId = value;
    }

    /**
     * Gets the value of the dataProviderSchemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderSchemeId() {
        return dataProviderSchemeId;
    }

    /**
     * Sets the value of the dataProviderSchemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderSchemeId(String value) {
        this.dataProviderSchemeId = value;
    }

    /**
     * Gets the value of the dataProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderID() {
        return dataProviderID;
    }

    /**
     * Sets the value of the dataProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderID(String value) {
        this.dataProviderID = value;
    }

    /**
     * Gets the value of the dataflowAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataflowAgencyID() {
        return dataflowAgencyID;
    }

    /**
     * Sets the value of the dataflowAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataflowAgencyID(String value) {
        this.dataflowAgencyID = value;
    }

    /**
     * Gets the value of the dataflowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataflowID() {
        return dataflowID;
    }

    /**
     * Sets the value of the dataflowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataflowID(String value) {
        this.dataflowID = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the reportingBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingBeginDate() {
        return reportingBeginDate;
    }

    /**
     * Sets the value of the reportingBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingBeginDate(String value) {
        this.reportingBeginDate = value;
    }

    /**
     * Gets the value of the reportingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingEndDate() {
        return reportingEndDate;
    }

    /**
     * Sets the value of the reportingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingEndDate(String value) {
        this.reportingEndDate = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFromDate(String value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidToDate(String value) {
        this.validToDate = value;
    }

    /**
     * Gets the value of the publicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the value of the publicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationYear(XMLGregorianCalendar value) {
        this.publicationYear = value;
    }

    /**
     * Gets the value of the publicationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationPeriod() {
        return publicationPeriod;
    }

    /**
     * Sets the value of the publicationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationPeriod(String value) {
        this.publicationPeriod = value;
    }

}
