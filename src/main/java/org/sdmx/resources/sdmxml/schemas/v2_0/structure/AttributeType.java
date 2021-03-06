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
 * AttributeType describes the structure of attributes declared in the key family. If the codelist attribute is not used, then the attribute is uncoded. You may use the TextFormat element to specify constraints on the value of the uncoded attribute. The concept attribute contains the name of a concept. The codelist attribute supplies the id value of a codelist. The attachmentLevel attribute indicates the level to which the attribute is attached in time-series formats (GenericData, CompactData, and UtilityData formats). The assignmentStatus attribute indicates whether a value must be provided for the attribute when sending documentation along with the data. The AttachmentGroup element is included only when the attribute is attached at the Group level, to indicate which declared group or groups the attribute may be attached to. For each such group, an AttachmentGroup element should appear, with the content of the element being the name of the group. The AttachmentMeasure element is similar, indicating for cross-sectional formats which declared measure or measures the attribute attached at the observation level may be attached to. The isTimeFormat attribute indicates that the attribute represents the concept of time format (typically a mandatory series-level attribute with a codelist representation taken from ISO 8601). For key families not used to structure cross-sectional formats, this element may be ommitted. Each such element contains the name of the declared measure. The attributes crossSectionalAttachDataSet, crossSectionalAttachGroup, crossSectionalAttachSection, and crossSectionalAttachObservation indicate what the attachment level or levels are for cross-sectional data formats, and may be ommitted if the key family will not be used to structure them. A value of "true" indicates that it is permissible to provide a value for the attribute at the specified level within the structure. Note that all groups in cross-sectional formats are replaced by a generic group which has any values for time and frequency, and allows any group-level attributes to be attached to it. An attribute which is an Entity attribute has a true value for the isEntityAttribute attribute - you may have either one Entity dimension or one Entity Attribute in a key family; a non-observational time  has a true value for isNonObservationalTimeAttribute; and a Count attribute has a true value for the isCountAttribute attribute. The attributes  isFrequencyAttribute and isEntityAttribute are mutually exclusive - that is, only one of them may have a "true" value for any instance of the Attribute element. The definitions and limits on representation of each attribute type are as follows: Frequency attribute describes the period between observations, and is coded; Count attributes are represented by values which are sequential, incrementing numbers - representations are always of the Increment or Count type; Entity attributes describe the subject of the data set - they can be coded or represented in any other form; Non-Observational Time attributes must have a representation which contains a time; Identity attributes may be coded or uncoded, but must be represented by a scheme which refers to the identifiers of external entities. Any given instance of an attribute may only have a true value for this set of attributes, and if so may not have a true value for the isTimeFormat attribute.
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextFormat" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}TextFormatType" minOccurs="0"/>
 *         &lt;element name="AttachmentGroup" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachmentMeasure" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" maxOccurs="unbounded" minOccurs="0"/>
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
 *       &lt;attribute name="attachmentLevel" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}AttachmentLevelType" />
 *       &lt;attribute name="assignmentStatus" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}AssignmentStatusType" />
 *       &lt;attribute name="isTimeFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="crossSectionalAttachDataSet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachSection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="crossSectionalAttachObservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isEntityAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isNonObservationalTimeAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isCountAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isFrequencyAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isIdentityAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "textFormat",
    "attachmentGroup",
    "attachmentMeasure",
    "annotations"
})
public class AttributeType {

    @XmlElement(name = "TextFormat")
    protected TextFormatType textFormat;
    @XmlElement(name = "AttachmentGroup")
    protected List<String> attachmentGroup;
    @XmlElement(name = "AttachmentMeasure")
    protected List<String> attachmentMeasure;
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
    @XmlAttribute(name = "attachmentLevel", required = true)
    protected AttachmentLevelType attachmentLevel;
    @XmlAttribute(name = "assignmentStatus", required = true)
    protected AssignmentStatusType assignmentStatus;
    @XmlAttribute(name = "isTimeFormat")
    protected Boolean isTimeFormat;
    @XmlAttribute(name = "crossSectionalAttachDataSet")
    protected Boolean crossSectionalAttachDataSet;
    @XmlAttribute(name = "crossSectionalAttachGroup")
    protected Boolean crossSectionalAttachGroup;
    @XmlAttribute(name = "crossSectionalAttachSection")
    protected Boolean crossSectionalAttachSection;
    @XmlAttribute(name = "crossSectionalAttachObservation")
    protected Boolean crossSectionalAttachObservation;
    @XmlAttribute(name = "isEntityAttribute")
    protected Boolean isEntityAttribute;
    @XmlAttribute(name = "isNonObservationalTimeAttribute")
    protected Boolean isNonObservationalTimeAttribute;
    @XmlAttribute(name = "isCountAttribute")
    protected Boolean isCountAttribute;
    @XmlAttribute(name = "isFrequencyAttribute")
    protected Boolean isFrequencyAttribute;
    @XmlAttribute(name = "isIdentityAttribute")
    protected Boolean isIdentityAttribute;

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
     * Gets the value of the attachmentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentGroup() {
        if (attachmentGroup == null) {
            attachmentGroup = new ArrayList<String>();
        }
        return this.attachmentGroup;
    }

    /**
     * Gets the value of the attachmentMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentMeasure() {
        if (attachmentMeasure == null) {
            attachmentMeasure = new ArrayList<String>();
        }
        return this.attachmentMeasure;
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
     * Gets the value of the attachmentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentLevelType }
     *     
     */
    public AttachmentLevelType getAttachmentLevel() {
        return attachmentLevel;
    }

    /**
     * Sets the value of the attachmentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentLevelType }
     *     
     */
    public void setAttachmentLevel(AttachmentLevelType value) {
        this.attachmentLevel = value;
    }

    /**
     * Gets the value of the assignmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentStatusType }
     *     
     */
    public AssignmentStatusType getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * Sets the value of the assignmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentStatusType }
     *     
     */
    public void setAssignmentStatus(AssignmentStatusType value) {
        this.assignmentStatus = value;
    }

    /**
     * Gets the value of the isTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsTimeFormat() {
        if (isTimeFormat == null) {
            return false;
        } else {
            return isTimeFormat;
        }
    }

    /**
     * Sets the value of the isTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTimeFormat(Boolean value) {
        this.isTimeFormat = value;
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

    /**
     * Gets the value of the isEntityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEntityAttribute() {
        if (isEntityAttribute == null) {
            return false;
        } else {
            return isEntityAttribute;
        }
    }

    /**
     * Sets the value of the isEntityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEntityAttribute(Boolean value) {
        this.isEntityAttribute = value;
    }

    /**
     * Gets the value of the isNonObservationalTimeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonObservationalTimeAttribute() {
        if (isNonObservationalTimeAttribute == null) {
            return false;
        } else {
            return isNonObservationalTimeAttribute;
        }
    }

    /**
     * Sets the value of the isNonObservationalTimeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonObservationalTimeAttribute(Boolean value) {
        this.isNonObservationalTimeAttribute = value;
    }

    /**
     * Gets the value of the isCountAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCountAttribute() {
        if (isCountAttribute == null) {
            return false;
        } else {
            return isCountAttribute;
        }
    }

    /**
     * Sets the value of the isCountAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCountAttribute(Boolean value) {
        this.isCountAttribute = value;
    }

    /**
     * Gets the value of the isFrequencyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsFrequencyAttribute() {
        if (isFrequencyAttribute == null) {
            return false;
        } else {
            return isFrequencyAttribute;
        }
    }

    /**
     * Sets the value of the isFrequencyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFrequencyAttribute(Boolean value) {
        this.isFrequencyAttribute = value;
    }

    /**
     * Gets the value of the isIdentityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIdentityAttribute() {
        if (isIdentityAttribute == null) {
            return false;
        } else {
            return isIdentityAttribute;
        }
    }

    /**
     * Sets the value of the isIdentityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentityAttribute(Boolean value) {
        this.isIdentityAttribute = value;
    }

}
