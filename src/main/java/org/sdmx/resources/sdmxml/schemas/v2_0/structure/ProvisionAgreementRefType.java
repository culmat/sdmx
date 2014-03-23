//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.ConstraintType;


/**
 * ProvisionAgreementRef allows for the identification of a provision agreement. At a minimum, either the URN element - holding a valid registry URN - or the set of OragnisationSchemeAgencyID, OrganisationSchemeID, DataProviderID, DataflowAgencyID, and DataflowID must be specified. Constraint can be used to express constraints associated with the provision agreement. This type differs from the similar type in the Registry namespace package by not providing information about the datasource or constraints.
 * 
 * <p>Java class for ProvisionAgreementRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvisionAgreementRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="OrganisationSchemeAgencyID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="OrganisationSchemeID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="DataProviderID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="DataProviderVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataflowAgencyID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="DataflowID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="DataflowVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Constraint" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ConstraintType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvisionAgreementRefType", propOrder = {
    "urn",
    "organisationSchemeAgencyID",
    "organisationSchemeID",
    "dataProviderID",
    "dataProviderVersion",
    "dataflowAgencyID",
    "dataflowID",
    "dataflowVersion",
    "constraint"
})
public class ProvisionAgreementRefType {

    @XmlElement(name = "URN")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlElement(name = "OrganisationSchemeAgencyID")
    protected String organisationSchemeAgencyID;
    @XmlElement(name = "OrganisationSchemeID")
    protected String organisationSchemeID;
    @XmlElement(name = "DataProviderID")
    protected String dataProviderID;
    @XmlElement(name = "DataProviderVersion")
    protected String dataProviderVersion;
    @XmlElement(name = "DataflowAgencyID")
    protected String dataflowAgencyID;
    @XmlElement(name = "DataflowID")
    protected String dataflowID;
    @XmlElement(name = "DataflowVersion")
    protected String dataflowVersion;
    @XmlElement(name = "Constraint")
    protected ConstraintType constraint;

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURN() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURN(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the organisationSchemeAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationSchemeAgencyID() {
        return organisationSchemeAgencyID;
    }

    /**
     * Sets the value of the organisationSchemeAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationSchemeAgencyID(String value) {
        this.organisationSchemeAgencyID = value;
    }

    /**
     * Gets the value of the organisationSchemeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationSchemeID() {
        return organisationSchemeID;
    }

    /**
     * Sets the value of the organisationSchemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationSchemeID(String value) {
        this.organisationSchemeID = value;
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
     * Gets the value of the dataProviderVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderVersion() {
        return dataProviderVersion;
    }

    /**
     * Sets the value of the dataProviderVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderVersion(String value) {
        this.dataProviderVersion = value;
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
     * Gets the value of the dataflowVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataflowVersion() {
        return dataflowVersion;
    }

    /**
     * Sets the value of the dataflowVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataflowVersion(String value) {
        this.dataflowVersion = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintType }
     *     
     */
    public ConstraintType getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintType }
     *     
     */
    public void setConstraint(ConstraintType value) {
        this.constraint = value;
    }

}
