//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.AnnotationsType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.TextType;


/**
 * OrganisationSchemeType contains the details of an OrganisationScheme. In OrganisationSchemes, the organisation roles of agency, data provider, and data consumer may be specified. A single organisation may play more than one role. Name is an element which provides for a human-readable name for the organization. Description may be used to provide a longer, human-readable description. the is attribute provides a formal ID for the organisation scheme; the version attribute specifies a particular version. If blank, it is assumed that the version is "1.0". The uri attributre specifies the location of a valid SDMC Structure Message containing the full details of the organisation sc`heme, and is required if the isExternalReference attribute has a value of true. If isExternalReference has a value of false, full details must be provided in the current instance of the OrganisationScheme element. The urn attribute provides a formal SDMX Registry URL - see the Logical Registry Specification for specific requirements. An agencyID must be provided, identifying the maintenance agency of the organisation scheme. Also, if the organisation scheme is final, the isFinal attribute must have a value of true - otherwise, it will be assumed to be non-final. (All production schemes must be made final - that is, unchangeable without versioning.) The validFrom and validTo attributes provide inclusive dates for providing supplemental validity information about the version.
 * 
 * <p>Java class for OrganisationSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationSchemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Agencies" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}AgenciesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataProviders" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}DataProvidersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataConsumers" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}DataConsumersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="urn" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="isExternalReference" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="agencyID" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="isFinal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="validFrom" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *       &lt;attribute name="validTo" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationSchemeType", propOrder = {
    "name",
    "description",
    "agencies",
    "dataProviders",
    "dataConsumers",
    "annotations"
})
public class OrganisationSchemeType {

    @XmlElement(name = "Name", required = true)
    protected List<TextType> name;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "Agencies")
    protected List<AgenciesType> agencies;
    @XmlElement(name = "DataProviders")
    protected List<DataProvidersType> dataProviders;
    @XmlElement(name = "DataConsumers")
    protected List<DataConsumersType> dataConsumers;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "urn")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlAttribute(name = "isExternalReference")
    protected Boolean isExternalReference;
    @XmlAttribute(name = "agencyID", required = true)
    protected String agencyID;
    @XmlAttribute(name = "isFinal")
    protected Boolean isFinal;
    @XmlAttribute(name = "validFrom")
    protected String validFrom;
    @XmlAttribute(name = "validTo")
    protected String validTo;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getName() {
        if (name == null) {
            name = new ArrayList<TextType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the agencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgenciesType }
     * 
     * 
     */
    public List<AgenciesType> getAgencies() {
        if (agencies == null) {
            agencies = new ArrayList<AgenciesType>();
        }
        return this.agencies;
    }

    /**
     * Gets the value of the dataProviders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataProviders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataProvidersType }
     * 
     * 
     */
    public List<DataProvidersType> getDataProviders() {
        if (dataProviders == null) {
            dataProviders = new ArrayList<DataProvidersType>();
        }
        return this.dataProviders;
    }

    /**
     * Gets the value of the dataConsumers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataConsumers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataConsumers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataConsumersType }
     * 
     * 
     */
    public List<DataConsumersType> getDataConsumers() {
        if (dataConsumers == null) {
            dataConsumers = new ArrayList<DataConsumersType>();
        }
        return this.dataConsumers;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationsType }
     *     
     */
    public AnnotationsType getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationsType }
     *     
     */
    public void setAnnotations(AnnotationsType value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrn() {
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
    public void setUrn(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the isExternalReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternalReference() {
        return isExternalReference;
    }

    /**
     * Sets the value of the isExternalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternalReference(Boolean value) {
        this.isExternalReference = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the isFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinal() {
        return isFinal;
    }

    /**
     * Sets the value of the isFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinal(Boolean value) {
        this.isFinal = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

}