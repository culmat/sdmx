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
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.AnnotationsType;


/**
 * Metadata attributes are those concepts - whether taking a coded or uncoded value, or made up of child concepts, or both - which are reported against a full or partial target identifier. If there are nested metadata attributes, these concepts are subordinate to the parent metadata attribute - that is, for the purposes of presentation, the parent concept is made up of the child concepts. This hierarchy is strictly presentational, for the purposes of structuring reports. If the metadata attribute can have a coded or uncoded value, then the charateristics of the value are indicated with the TextFormat child element. If the value is coded, then the representationScheme and representationSchemeAgency attributes must hold values: the representationScheme attribute takes the ID of a representation scheme, and the representationSchemeAgency takes the ID of the agency which maintains that scheme. The conceptRef attribute holds the ID of the metadata attribute's concept. The conceptAgency attribute takes the agency ID of the concept referenced in conceptRef. The conceptSchemeRef attribute holds the ID value of the concept scheme from which the concept is taken, and the conceptSchemeAgency holds the ID of the agency that maintains the concept scheme referenced in the conceptSchemeRef attribute. The useageStatus attribute indicates whether provision of the metadata attribute is conditional or mandatory.
 * 
 * <p>Java class for MetadataAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetadataAttribute" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}MetadataAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextFormat" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}TextFormatType" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="conceptRef" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conceptAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptSchemeAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="representationScheme" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="representationSchemeAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="usageStatus" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}UsageStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataAttributeType", propOrder = {
    "metadataAttribute",
    "textFormat",
    "annotations"
})
public class MetadataAttributeType {

    @XmlElement(name = "MetadataAttribute")
    protected List<MetadataAttributeType> metadataAttribute;
    @XmlElement(name = "TextFormat")
    protected TextFormatType textFormat;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "conceptRef", required = true)
    protected String conceptRef;
    @XmlAttribute(name = "conceptVersion")
    protected String conceptVersion;
    @XmlAttribute(name = "conceptAgency")
    protected String conceptAgency;
    @XmlAttribute(name = "conceptSchemeRef")
    protected String conceptSchemeRef;
    @XmlAttribute(name = "conceptSchemeAgency")
    protected String conceptSchemeAgency;
    @XmlAttribute(name = "representationScheme")
    protected String representationScheme;
    @XmlAttribute(name = "representationSchemeAgency")
    protected String representationSchemeAgency;
    @XmlAttribute(name = "usageStatus", required = true)
    protected UsageStatusType usageStatus;

    /**
     * Gets the value of the metadataAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataAttributeType }
     * 
     * 
     */
    public List<MetadataAttributeType> getMetadataAttribute() {
        if (metadataAttribute == null) {
            metadataAttribute = new ArrayList<MetadataAttributeType>();
        }
        return this.metadataAttribute;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatType }
     *     
     */
    public TextFormatType getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatType }
     *     
     */
    public void setTextFormat(TextFormatType value) {
        this.textFormat = value;
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
     * Gets the value of the conceptRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptRef() {
        return conceptRef;
    }

    /**
     * Sets the value of the conceptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptRef(String value) {
        this.conceptRef = value;
    }

    /**
     * Gets the value of the conceptVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptVersion() {
        return conceptVersion;
    }

    /**
     * Sets the value of the conceptVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptVersion(String value) {
        this.conceptVersion = value;
    }

    /**
     * Gets the value of the conceptAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptAgency() {
        return conceptAgency;
    }

    /**
     * Sets the value of the conceptAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptAgency(String value) {
        this.conceptAgency = value;
    }

    /**
     * Gets the value of the conceptSchemeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptSchemeRef() {
        return conceptSchemeRef;
    }

    /**
     * Sets the value of the conceptSchemeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptSchemeRef(String value) {
        this.conceptSchemeRef = value;
    }

    /**
     * Gets the value of the conceptSchemeAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptSchemeAgency() {
        return conceptSchemeAgency;
    }

    /**
     * Sets the value of the conceptSchemeAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptSchemeAgency(String value) {
        this.conceptSchemeAgency = value;
    }

    /**
     * Gets the value of the representationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationScheme() {
        return representationScheme;
    }

    /**
     * Sets the value of the representationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationScheme(String value) {
        this.representationScheme = value;
    }

    /**
     * Gets the value of the representationSchemeAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationSchemeAgency() {
        return representationSchemeAgency;
    }

    /**
     * Sets the value of the representationSchemeAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationSchemeAgency(String value) {
        this.representationSchemeAgency = value;
    }

    /**
     * Gets the value of the usageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UsageStatusType }
     *     
     */
    public UsageStatusType getUsageStatus() {
        return usageStatus;
    }

    /**
     * Sets the value of the usageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageStatusType }
     *     
     */
    public void setUsageStatus(UsageStatusType value) {
        this.usageStatus = value;
    }

}