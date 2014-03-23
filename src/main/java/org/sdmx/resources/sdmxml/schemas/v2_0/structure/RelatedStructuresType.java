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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * RelatedStructuresType includes references to key families (in the KeyFamilyRef element) and/or metadata structure definitions (In the MetadataStructureRef element). Any mapped CategorySchemes, ConceptSchemes, or Organisation Schemes should also be referenced. HierarchicalCodelistRef allows for HierarchicalCodelists which describe relationships between pertinent codelists to be referenced and included in the structure set - this must be used if the CodelistMap in the StructureSet refers to any hierarchical codelists.
 * 
 * <p>Java class for RelatedStructuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedStructuresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyFamilyRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}KeyFamilyRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataStructureRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}MetadataStructureRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConceptSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ConceptSchemeRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategorySchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}CategorySchemeRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganisationSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}OrganisationSchemeRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchicalCodelistRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}HierarchicalCodelistRefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedStructuresType", propOrder = {
    "keyFamilyRef",
    "metadataStructureRef",
    "conceptSchemeRef",
    "categorySchemeRef",
    "organisationSchemeRef",
    "hierarchicalCodelistRef"
})
public class RelatedStructuresType {

    @XmlElement(name = "KeyFamilyRef")
    protected List<KeyFamilyRefType> keyFamilyRef;
    @XmlElement(name = "MetadataStructureRef")
    protected List<MetadataStructureRefType> metadataStructureRef;
    @XmlElement(name = "ConceptSchemeRef")
    protected List<ConceptSchemeRefType> conceptSchemeRef;
    @XmlElement(name = "CategorySchemeRef")
    protected List<CategorySchemeRefType> categorySchemeRef;
    @XmlElement(name = "OrganisationSchemeRef")
    protected List<OrganisationSchemeRefType> organisationSchemeRef;
    @XmlElement(name = "HierarchicalCodelistRef")
    protected List<HierarchicalCodelistRefType> hierarchicalCodelistRef;

    /**
     * Gets the value of the keyFamilyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFamilyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFamilyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyFamilyRefType }
     * 
     * 
     */
    public List<KeyFamilyRefType> getKeyFamilyRef() {
        if (keyFamilyRef == null) {
            keyFamilyRef = new ArrayList<KeyFamilyRefType>();
        }
        return this.keyFamilyRef;
    }

    /**
     * Gets the value of the metadataStructureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataStructureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataStructureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataStructureRefType }
     * 
     * 
     */
    public List<MetadataStructureRefType> getMetadataStructureRef() {
        if (metadataStructureRef == null) {
            metadataStructureRef = new ArrayList<MetadataStructureRefType>();
        }
        return this.metadataStructureRef;
    }

    /**
     * Gets the value of the conceptSchemeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptSchemeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptSchemeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptSchemeRefType }
     * 
     * 
     */
    public List<ConceptSchemeRefType> getConceptSchemeRef() {
        if (conceptSchemeRef == null) {
            conceptSchemeRef = new ArrayList<ConceptSchemeRefType>();
        }
        return this.conceptSchemeRef;
    }

    /**
     * Gets the value of the categorySchemeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySchemeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySchemeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySchemeRefType }
     * 
     * 
     */
    public List<CategorySchemeRefType> getCategorySchemeRef() {
        if (categorySchemeRef == null) {
            categorySchemeRef = new ArrayList<CategorySchemeRefType>();
        }
        return this.categorySchemeRef;
    }

    /**
     * Gets the value of the organisationSchemeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationSchemeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationSchemeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationSchemeRefType }
     * 
     * 
     */
    public List<OrganisationSchemeRefType> getOrganisationSchemeRef() {
        if (organisationSchemeRef == null) {
            organisationSchemeRef = new ArrayList<OrganisationSchemeRefType>();
        }
        return this.organisationSchemeRef;
    }

    /**
     * Gets the value of the hierarchicalCodelistRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchicalCodelistRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchicalCodelistRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HierarchicalCodelistRefType }
     * 
     * 
     */
    public List<HierarchicalCodelistRefType> getHierarchicalCodelistRef() {
        if (hierarchicalCodelistRef == null) {
            hierarchicalCodelistRef = new ArrayList<HierarchicalCodelistRefType>();
        }
        return this.hierarchicalCodelistRef;
    }

}
