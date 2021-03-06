//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectIDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="ConceptScheme"/>
 *     &lt;enumeration value="Concept"/>
 *     &lt;enumeration value="Codelist"/>
 *     &lt;enumeration value="Code"/>
 *     &lt;enumeration value="KeyFamily"/>
 *     &lt;enumeration value="Component"/>
 *     &lt;enumeration value="KeyDescriptor"/>
 *     &lt;enumeration value="MeasureDescriptor"/>
 *     &lt;enumeration value="AttributeDescriptor"/>
 *     &lt;enumeration value="GroupKeyDescriptor"/>
 *     &lt;enumeration value="Dimension"/>
 *     &lt;enumeration value="Measure"/>
 *     &lt;enumeration value="Attribute"/>
 *     &lt;enumeration value="CategoryScheme"/>
 *     &lt;enumeration value="ReportingTaxonomy"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="OrganisationScheme"/>
 *     &lt;enumeration value="DataProvider"/>
 *     &lt;enumeration value="MetadataStructure"/>
 *     &lt;enumeration value="FullTargetIdentifier"/>
 *     &lt;enumeration value="PartialTargetIdentifier"/>
 *     &lt;enumeration value="MetadataAttribute"/>
 *     &lt;enumeration value="DataFlow"/>
 *     &lt;enumeration value="ProvisionAgreement"/>
 *     &lt;enumeration value="MetadataFlow"/>
 *     &lt;enumeration value="ContentConstraint"/>
 *     &lt;enumeration value="AttachmentConstraint"/>
 *     &lt;enumeration value="DataSet"/>
 *     &lt;enumeration value="XSDataSet"/>
 *     &lt;enumeration value="MetadataSet"/>
 *     &lt;enumeration value="HierarchicalCodelist"/>
 *     &lt;enumeration value="Hierarchy"/>
 *     &lt;enumeration value="StructureSet"/>
 *     &lt;enumeration value="StructureMap"/>
 *     &lt;enumeration value="ComponentMap"/>
 *     &lt;enumeration value="CodelistMap"/>
 *     &lt;enumeration value="CodeMap"/>
 *     &lt;enumeration value="CategorySchemeMap"/>
 *     &lt;enumeration value="CategoryMap"/>
 *     &lt;enumeration value="OrganisationSchemeMap"/>
 *     &lt;enumeration value="OrganisationRoleMap"/>
 *     &lt;enumeration value="ConceptSchemeMap"/>
 *     &lt;enumeration value="ConceptMap"/>
 *     &lt;enumeration value="Process"/>
 *     &lt;enumeration value="ProcessStep"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectIDType")
@XmlEnum
public enum ObjectIDType {


    /**
     * Agency
     * 
     */
    @XmlEnumValue("Agency")
    AGENCY("Agency"),

    /**
     * Concept scheme
     * 
     */
    @XmlEnumValue("ConceptScheme")
    CONCEPT_SCHEME("ConceptScheme"),

    /**
     * Concept
     * 
     */
    @XmlEnumValue("Concept")
    CONCEPT("Concept"),

    /**
     * Codelist
     * 
     */
    @XmlEnumValue("Codelist")
    CODELIST("Codelist"),

    /**
     * Code
     * 
     */
    @XmlEnumValue("Code")
    CODE("Code"),

    /**
     * Key family
     * 
     */
    @XmlEnumValue("KeyFamily")
    KEY_FAMILY("KeyFamily"),

    /**
     * Component
     * 
     */
    @XmlEnumValue("Component")
    COMPONENT("Component"),

    /**
     * Key descriptor
     * 
     */
    @XmlEnumValue("KeyDescriptor")
    KEY_DESCRIPTOR("KeyDescriptor"),

    /**
     * Measure descriptor
     * 
     */
    @XmlEnumValue("MeasureDescriptor")
    MEASURE_DESCRIPTOR("MeasureDescriptor"),

    /**
     * Attribute descriptor
     * 
     */
    @XmlEnumValue("AttributeDescriptor")
    ATTRIBUTE_DESCRIPTOR("AttributeDescriptor"),

    /**
     * Group key descriptor
     * 
     */
    @XmlEnumValue("GroupKeyDescriptor")
    GROUP_KEY_DESCRIPTOR("GroupKeyDescriptor"),

    /**
     * Dimension
     * 
     */
    @XmlEnumValue("Dimension")
    DIMENSION("Dimension"),

    /**
     * Measure
     * 
     */
    @XmlEnumValue("Measure")
    MEASURE("Measure"),

    /**
     * Attribute
     * 
     */
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),

    /**
     * Category scheme
     * 
     */
    @XmlEnumValue("CategoryScheme")
    CATEGORY_SCHEME("CategoryScheme"),

    /**
     * Reporting taxonomy
     * 
     */
    @XmlEnumValue("ReportingTaxonomy")
    REPORTING_TAXONOMY("ReportingTaxonomy"),

    /**
     * Category
     * 
     */
    @XmlEnumValue("Category")
    CATEGORY("Category"),

    /**
     * Organisation scheme
     * 
     */
    @XmlEnumValue("OrganisationScheme")
    ORGANISATION_SCHEME("OrganisationScheme"),

    /**
     * Data or metadata provioder
     * 
     */
    @XmlEnumValue("DataProvider")
    DATA_PROVIDER("DataProvider"),

    /**
     * Metadata structure definition
     * 
     */
    @XmlEnumValue("MetadataStructure")
    METADATA_STRUCTURE("MetadataStructure"),

    /**
     * Full target identifier
     * 
     */
    @XmlEnumValue("FullTargetIdentifier")
    FULL_TARGET_IDENTIFIER("FullTargetIdentifier"),

    /**
     * Partial target identifier
     * 
     */
    @XmlEnumValue("PartialTargetIdentifier")
    PARTIAL_TARGET_IDENTIFIER("PartialTargetIdentifier"),

    /**
     * Metadata attribute
     * 
     */
    @XmlEnumValue("MetadataAttribute")
    METADATA_ATTRIBUTE("MetadataAttribute"),

    /**
     * Data flow
     * 
     */
    @XmlEnumValue("DataFlow")
    DATA_FLOW("DataFlow"),

    /**
     * Data or metadata provision agreement
     * 
     */
    @XmlEnumValue("ProvisionAgreement")
    PROVISION_AGREEMENT("ProvisionAgreement"),

    /**
     * Metadata flow
     * 
     */
    @XmlEnumValue("MetadataFlow")
    METADATA_FLOW("MetadataFlow"),

    /**
     * Content constraint
     * 
     */
    @XmlEnumValue("ContentConstraint")
    CONTENT_CONSTRAINT("ContentConstraint"),

    /**
     * Attachment constraint
     * 
     */
    @XmlEnumValue("AttachmentConstraint")
    ATTACHMENT_CONSTRAINT("AttachmentConstraint"),

    /**
     * Data set
     * 
     */
    @XmlEnumValue("DataSet")
    DATA_SET("DataSet"),

    /**
     * Cross-sectional data set
     * 
     */
    @XmlEnumValue("XSDataSet")
    XS_DATA_SET("XSDataSet"),

    /**
     * Metadata set
     * 
     */
    @XmlEnumValue("MetadataSet")
    METADATA_SET("MetadataSet"),

    /**
     * Hierarchical codelist
     * 
     */
    @XmlEnumValue("HierarchicalCodelist")
    HIERARCHICAL_CODELIST("HierarchicalCodelist"),

    /**
     * Hierarchy
     * 
     */
    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy"),

    /**
     * Structure set
     * 
     */
    @XmlEnumValue("StructureSet")
    STRUCTURE_SET("StructureSet"),

    /**
     * Structure map
     * 
     */
    @XmlEnumValue("StructureMap")
    STRUCTURE_MAP("StructureMap"),

    /**
     * Component map
     * 
     */
    @XmlEnumValue("ComponentMap")
    COMPONENT_MAP("ComponentMap"),

    /**
     * Codelist map
     * 
     */
    @XmlEnumValue("CodelistMap")
    CODELIST_MAP("CodelistMap"),

    /**
     * Code map
     * 
     */
    @XmlEnumValue("CodeMap")
    CODE_MAP("CodeMap"),

    /**
     * Category scheme map
     * 
     */
    @XmlEnumValue("CategorySchemeMap")
    CATEGORY_SCHEME_MAP("CategorySchemeMap"),

    /**
     * Category map
     * 
     */
    @XmlEnumValue("CategoryMap")
    CATEGORY_MAP("CategoryMap"),

    /**
     * Organisation scheme map
     * 
     */
    @XmlEnumValue("OrganisationSchemeMap")
    ORGANISATION_SCHEME_MAP("OrganisationSchemeMap"),

    /**
     * Organisation role map
     * 
     */
    @XmlEnumValue("OrganisationRoleMap")
    ORGANISATION_ROLE_MAP("OrganisationRoleMap"),

    /**
     * Concept scheme map
     * 
     */
    @XmlEnumValue("ConceptSchemeMap")
    CONCEPT_SCHEME_MAP("ConceptSchemeMap"),

    /**
     * Concept map
     * 
     */
    @XmlEnumValue("ConceptMap")
    CONCEPT_MAP("ConceptMap"),

    /**
     * Process
     * 
     */
    @XmlEnumValue("Process")
    PROCESS("Process"),

    /**
     * Process step
     * 
     */
    @XmlEnumValue("ProcessStep")
    PROCESS_STEP("ProcessStep");
    private final String value;

    ObjectIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectIDType fromValue(String v) {
        for (ObjectIDType c: ObjectIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
