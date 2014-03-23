//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.AnnotationsType;


/**
 * TimeDimensionType describes the special Time dimension. Any key family which will be used for time-series formats (GenericData, CompactData, and UtilityData) must include the time dimension. Any key family which uses the time dimension must also declare a frequency dimension, conventionally the first dimension in the key (the set of ordered non-time dimensions). A TextFormat element may be included for indicating the representation of time. The concept attribute must contain the concept name of the time concept. The codelist attribute may provide the value of the concept name of a codelist if needed. If a key family describes cross-sectional data, then for each dimension, the crossSectionalAttachDataSet, crossSectionalAttachGroup, crossSectionalAttachSection, and crossSectionalAttachObservation attributes must be given values. A value of "true" for any of these attributes indicates that the dimension may be provided a value at the indicated level within the cross-sectional structure. Note that these attributes do not need to be provided for any dimension with the isFrequencyDimension set to "true", as these dimensions are always attached only at the group level, as is time. A key family designed for cross-sectional use must be structured such that any observation's complete key can be unambiguously described by taking each dimension value from its observation level, section level, group level, and data set level, and ordered according to the sequence given in the key family. 
 * 
 * <p>Java class for TimeDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextFormat" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}TextFormatType" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="conceptRef" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conceptAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="conceptSchemeAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="codelist" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="codelistVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codelistAgency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="crossSectionalAttachDataSet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachSection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachObservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDimensionType", propOrder = {
    "textFormat",
    "annotations"
})
public class TimeDimensionType {

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
    @XmlAttribute(name = "codelist")
    protected String codelist;
    @XmlAttribute(name = "codelistVersion")
    protected String codelistVersion;
    @XmlAttribute(name = "codelistAgency")
    protected String codelistAgency;
    @XmlAttribute(name = "crossSectionalAttachDataSet")
    protected Boolean crossSectionalAttachDataSet;
    @XmlAttribute(name = "crossSectionalAttachGroup")
    protected Boolean crossSectionalAttachGroup;
    @XmlAttribute(name = "crossSectionalAttachSection")
    protected Boolean crossSectionalAttachSection;
    @XmlAttribute(name = "crossSectionalAttachObservation")
    protected Boolean crossSectionalAttachObservation;

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
     * Gets the value of the codelist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodelist() {
        return codelist;
    }

    /**
     * Sets the value of the codelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodelist(String value) {
        this.codelist = value;
    }

    /**
     * Gets the value of the codelistVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodelistVersion() {
        return codelistVersion;
    }

    /**
     * Sets the value of the codelistVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodelistVersion(String value) {
        this.codelistVersion = value;
    }

    /**
     * Gets the value of the codelistAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodelistAgency() {
        return codelistAgency;
    }

    /**
     * Sets the value of the codelistAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodelistAgency(String value) {
        this.codelistAgency = value;
    }

    /**
     * Gets the value of the crossSectionalAttachDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossSectionalAttachDataSet() {
        return crossSectionalAttachDataSet;
    }

    /**
     * Sets the value of the crossSectionalAttachDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossSectionalAttachDataSet(Boolean value) {
        this.crossSectionalAttachDataSet = value;
    }

    /**
     * Gets the value of the crossSectionalAttachGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossSectionalAttachGroup() {
        return crossSectionalAttachGroup;
    }

    /**
     * Sets the value of the crossSectionalAttachGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossSectionalAttachGroup(Boolean value) {
        this.crossSectionalAttachGroup = value;
    }

    /**
     * Gets the value of the crossSectionalAttachSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossSectionalAttachSection() {
        return crossSectionalAttachSection;
    }

    /**
     * Sets the value of the crossSectionalAttachSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossSectionalAttachSection(Boolean value) {
        this.crossSectionalAttachSection = value;
    }

    /**
     * Gets the value of the crossSectionalAttachObservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossSectionalAttachObservation() {
        return crossSectionalAttachObservation;
    }

    /**
     * Sets the value of the crossSectionalAttachObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossSectionalAttachObservation(Boolean value) {
        this.crossSectionalAttachObservation = value;
    }

}
