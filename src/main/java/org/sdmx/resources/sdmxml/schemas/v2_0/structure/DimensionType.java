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
 * DimensionType describes the structure of non-Time dimensions. The order of their declaration is significant: it is used to describe the order in which they will appear in data formats for which key values are supplied in an ordered fashion (exclusive of the Time dimension, which is not represented as a member of the ordered key). Some types of non-Time  dimensions have un-coded values: the TextFormat element must be provided, to indicate what type of values are permissible. The attributes isFrequencyDimension and isEntityDimension may have a "true" value for any instance of the Dimension element, indicating that it is a dimension of the stated type. The attributes isCountDimension, isNonObservationalTimeDimension, isMeasureDimension, and is IdentityDimension may occur multiple times, and take a true value to indicate that the diemsnion in question is of that type. Note that only one dimension in the key family may be of the following types: Frequency dimension and Entity dimension, and only if there is not also an attribute in the key family of the same type. Any given dimension may only have a true value for one of the set of attributes isFrequencyDimension, isCountDimension, is measureDimension,  isEntityDimension, isNonObservationalTimeDimension, and is IdentityDimension. The definitions and limits on representation of each dimension type are as follows: Frequency dimension describes the period between observations, and is coded; Count dimensions are represented by values which are sequential, incrementing numbers - representations are always of the Increment or Count type; measureType dimensions are always coded, and they enumerate the set of possible measures declared for the key family; Entity dimensions describe the subject of the data set (ie, a country) - they can be coded or represented in any other form; Non-Observational Time dimensions must have a representation which contains a time; Identity dimensions may be coded or uncoded, but must be represented by a scheme which refers to the identifiers of external entites. (Conventionally, it is the first dimension in the ordered set of dimensions - the key.) If a key family describes cross-sectional data, then for each dimension, the crossSectionalAttachDataSet, crossSectionalAttachGroup, crossSectionalAttachSection, and crossSectionalAttachObservation attributes must be given values. A value of "true" for any of these attributes indicates that the dimension may be provided a value at the indicated level within the cross-sectional structure. Note that these attributes do not need to be provided for any dimension with the isFrequencyDimension set to "true", as these dimensions are always attached only at the group level, as is time. A key family designed for cross-sectional use must be structured such that any observation's complete key can be unambiguously described by taking each dimension value from its observation level, section level, group level, and data set level, and ordered according to the sequence given in the key family.  For any dimension, the id of the referenced concept
 * 			must be unique acrss the entire key family, including all dimensions, attributes and measures.
 * 
 * <p>Java class for DimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
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
 *       &lt;attribute name="isMeasureDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isFrequencyDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isEntityDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isCountDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isNonObservationTimeDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isIdentityDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlType(name = "DimensionType", propOrder = {
    "textFormat",
    "annotations"
})
public class DimensionType {

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
    @XmlAttribute(name = "isMeasureDimension")
    protected Boolean isMeasureDimension;
    @XmlAttribute(name = "isFrequencyDimension")
    protected Boolean isFrequencyDimension;
    @XmlAttribute(name = "isEntityDimension")
    protected Boolean isEntityDimension;
    @XmlAttribute(name = "isCountDimension")
    protected Boolean isCountDimension;
    @XmlAttribute(name = "isNonObservationTimeDimension")
    protected Boolean isNonObservationTimeDimension;
    @XmlAttribute(name = "isIdentityDimension")
    protected Boolean isIdentityDimension;
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
     * Gets the value of the isMeasureDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMeasureDimension() {
        if (isMeasureDimension == null) {
            return false;
        } else {
            return isMeasureDimension;
        }
    }

    /**
     * Sets the value of the isMeasureDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMeasureDimension(Boolean value) {
        this.isMeasureDimension = value;
    }

    /**
     * Gets the value of the isFrequencyDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsFrequencyDimension() {
        if (isFrequencyDimension == null) {
            return false;
        } else {
            return isFrequencyDimension;
        }
    }

    /**
     * Sets the value of the isFrequencyDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFrequencyDimension(Boolean value) {
        this.isFrequencyDimension = value;
    }

    /**
     * Gets the value of the isEntityDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEntityDimension() {
        if (isEntityDimension == null) {
            return false;
        } else {
            return isEntityDimension;
        }
    }

    /**
     * Sets the value of the isEntityDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEntityDimension(Boolean value) {
        this.isEntityDimension = value;
    }

    /**
     * Gets the value of the isCountDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCountDimension() {
        if (isCountDimension == null) {
            return false;
        } else {
            return isCountDimension;
        }
    }

    /**
     * Sets the value of the isCountDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCountDimension(Boolean value) {
        this.isCountDimension = value;
    }

    /**
     * Gets the value of the isNonObservationTimeDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonObservationTimeDimension() {
        if (isNonObservationTimeDimension == null) {
            return false;
        } else {
            return isNonObservationTimeDimension;
        }
    }

    /**
     * Sets the value of the isNonObservationTimeDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonObservationTimeDimension(Boolean value) {
        this.isNonObservationTimeDimension = value;
    }

    /**
     * Gets the value of the isIdentityDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIdentityDimension() {
        if (isIdentityDimension == null) {
            return false;
        } else {
            return isIdentityDimension;
        }
    }

    /**
     * Sets the value of the isIdentityDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentityDimension(Boolean value) {
        this.isIdentityDimension = value;
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