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
 * OrganisationType provides a structure for describing agencies, data providers, and data consumers and their contact information. The id attribute carries a code identifying the agency. The version attribute indicates the version of the agency description. The uri attribute provides a uri for an alternate way of identifying the agency information (typically a URL resolving to an agency described in SDMX-ML). Name is an element which provides for a human-readable name for the organization. Description provides for a longer human-readable description of the organisation, which may be provided in multiple, parallel language-equivalent forms. MaintenanceContact provides contact information for the agency when acting as a MaintenanceAgency; CollectorContact does the same when the agency is acting as a statistics collector; DisseminatorContact for when the agency functions as a statistics disseminator; and ReporterContact for when the Agency is functioning as a statistics reporter. OtherContact is used to describe any other role. Note that the Role field in the contact information structure should only be specified for OtherContact. It is allowable to reference full Agency information by using (at a minimum) only the id, name, and uri fields, with the uri pointing to an external description in a valid SDMX-ML Structure message which provides more complete information. (This is termed an "external reference".) If an external reference is being made, the isExternalReference attribute must be set to "true". The urn attribute holds a valid SDMX Registry URN (see SDMX Registry Specification). The parentOrganisation attribute holds the id of a parent organisation of the same type from the same scheme, indicating that the organisation in question is a department or other sub-division of the parent organisation. Annotations may be provided using the Annotations element, in multiple, parallel-language form.
 * 
 * <p>Java class for OrganisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaintenanceContact" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ContactType" minOccurs="0"/>
 *         &lt;element name="CollectorContact" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ContactType" minOccurs="0"/>
 *         &lt;element name="DisseminatorContact" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ContactType" minOccurs="0"/>
 *         &lt;element name="ReporterContact" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ContactType" minOccurs="0"/>
 *         &lt;element name="OtherContact" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="urn" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="isExternalReference" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="parentOrganisation" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
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
@XmlType(name = "OrganisationType", propOrder = {
    "name",
    "description",
    "maintenanceContact",
    "collectorContact",
    "disseminatorContact",
    "reporterContact",
    "otherContact",
    "annotations"
})
public class OrganisationType {

    @XmlElement(name = "Name", required = true)
    protected List<TextType> name;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "MaintenanceContact")
    protected ContactType maintenanceContact;
    @XmlElement(name = "CollectorContact")
    protected ContactType collectorContact;
    @XmlElement(name = "DisseminatorContact")
    protected ContactType disseminatorContact;
    @XmlElement(name = "ReporterContact")
    protected ContactType reporterContact;
    @XmlElement(name = "OtherContact")
    protected List<ContactType> otherContact;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "urn")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "isExternalReference")
    protected Boolean isExternalReference;
    @XmlAttribute(name = "parentOrganisation")
    protected String parentOrganisation;
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
     * Gets the value of the maintenanceContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getMaintenanceContact() {
        return maintenanceContact;
    }

    /**
     * Sets the value of the maintenanceContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setMaintenanceContact(ContactType value) {
        this.maintenanceContact = value;
    }

    /**
     * Gets the value of the collectorContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCollectorContact() {
        return collectorContact;
    }

    /**
     * Sets the value of the collectorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCollectorContact(ContactType value) {
        this.collectorContact = value;
    }

    /**
     * Gets the value of the disseminatorContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getDisseminatorContact() {
        return disseminatorContact;
    }

    /**
     * Sets the value of the disseminatorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setDisseminatorContact(ContactType value) {
        this.disseminatorContact = value;
    }

    /**
     * Gets the value of the reporterContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getReporterContact() {
        return reporterContact;
    }

    /**
     * Sets the value of the reporterContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setReporterContact(ContactType value) {
        this.reporterContact = value;
    }

    /**
     * Gets the value of the otherContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getOtherContact() {
        if (otherContact == null) {
            otherContact = new ArrayList<ContactType>();
        }
        return this.otherContact;
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
     * Gets the value of the parentOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrganisation() {
        return parentOrganisation;
    }

    /**
     * Sets the value of the parentOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrganisation(String value) {
        this.parentOrganisation = value;
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