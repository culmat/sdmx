//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.registry;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of the subscribed structural repository events. AgencyID specifies an agency for the object or objects indicated in the other ID fields. Note that the ID fields (including AgencyID) may hold a complete ID or Repository URN, but may also insert the "%" wildcard character, which represents 0 or more characters, in the ID string. If left empty, all objects will be matched within the other constraints (agency, object type) provided.
 * 
 * <p>Java class for StructuralRepositoryEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuralRepositoryEventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllEventsID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeyFamilyID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConceptSchemeID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodeListID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataStructureID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategorySchemeID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataflowID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataflowID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganisationSchemeID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchicalCodelistID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StructureSetID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReportingTaxonomyID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuralRepositoryEventsType", propOrder = {
    "agencyID",
    "allEventsID",
    "keyFamilyID",
    "conceptSchemeID",
    "codeListID",
    "metadataStructureID",
    "categorySchemeID",
    "dataflowID",
    "metadataflowID",
    "organisationSchemeID",
    "hierarchicalCodelistID",
    "structureSetID",
    "reportingTaxonomyID",
    "processID"
})
public class StructuralRepositoryEventsType {

    @XmlElement(name = "AgencyID")
    protected List<String> agencyID;
    @XmlElement(name = "AllEventsID")
    protected List<String> allEventsID;
    @XmlElement(name = "KeyFamilyID")
    protected List<String> keyFamilyID;
    @XmlElement(name = "ConceptSchemeID")
    protected List<String> conceptSchemeID;
    @XmlElement(name = "CodeListID")
    protected List<String> codeListID;
    @XmlElement(name = "MetadataStructureID")
    protected List<String> metadataStructureID;
    @XmlElement(name = "CategorySchemeID")
    protected List<String> categorySchemeID;
    @XmlElement(name = "DataflowID")
    protected List<String> dataflowID;
    @XmlElement(name = "MetadataflowID")
    protected List<String> metadataflowID;
    @XmlElement(name = "OrganisationSchemeID")
    protected List<String> organisationSchemeID;
    @XmlElement(name = "HierarchicalCodelistID")
    protected List<String> hierarchicalCodelistID;
    @XmlElement(name = "StructureSetID")
    protected List<String> structureSetID;
    @XmlElement(name = "ReportingTaxonomyID")
    protected List<String> reportingTaxonomyID;
    @XmlElement(name = "ProcessID")
    protected List<String> processID;

    /**
     * Gets the value of the agencyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgencyID() {
        if (agencyID == null) {
            agencyID = new ArrayList<String>();
        }
        return this.agencyID;
    }

    /**
     * Gets the value of the allEventsID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allEventsID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllEventsID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllEventsID() {
        if (allEventsID == null) {
            allEventsID = new ArrayList<String>();
        }
        return this.allEventsID;
    }

    /**
     * Gets the value of the keyFamilyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFamilyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFamilyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyFamilyID() {
        if (keyFamilyID == null) {
            keyFamilyID = new ArrayList<String>();
        }
        return this.keyFamilyID;
    }

    /**
     * Gets the value of the conceptSchemeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptSchemeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptSchemeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConceptSchemeID() {
        if (conceptSchemeID == null) {
            conceptSchemeID = new ArrayList<String>();
        }
        return this.conceptSchemeID;
    }

    /**
     * Gets the value of the codeListID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeListID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeListID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodeListID() {
        if (codeListID == null) {
            codeListID = new ArrayList<String>();
        }
        return this.codeListID;
    }

    /**
     * Gets the value of the metadataStructureID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataStructureID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataStructureID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadataStructureID() {
        if (metadataStructureID == null) {
            metadataStructureID = new ArrayList<String>();
        }
        return this.metadataStructureID;
    }

    /**
     * Gets the value of the categorySchemeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySchemeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySchemeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategorySchemeID() {
        if (categorySchemeID == null) {
            categorySchemeID = new ArrayList<String>();
        }
        return this.categorySchemeID;
    }

    /**
     * Gets the value of the dataflowID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataflowID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataflowID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataflowID() {
        if (dataflowID == null) {
            dataflowID = new ArrayList<String>();
        }
        return this.dataflowID;
    }

    /**
     * Gets the value of the metadataflowID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataflowID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataflowID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadataflowID() {
        if (metadataflowID == null) {
            metadataflowID = new ArrayList<String>();
        }
        return this.metadataflowID;
    }

    /**
     * Gets the value of the organisationSchemeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationSchemeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationSchemeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganisationSchemeID() {
        if (organisationSchemeID == null) {
            organisationSchemeID = new ArrayList<String>();
        }
        return this.organisationSchemeID;
    }

    /**
     * Gets the value of the hierarchicalCodelistID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchicalCodelistID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchicalCodelistID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHierarchicalCodelistID() {
        if (hierarchicalCodelistID == null) {
            hierarchicalCodelistID = new ArrayList<String>();
        }
        return this.hierarchicalCodelistID;
    }

    /**
     * Gets the value of the structureSetID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureSetID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureSetID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStructureSetID() {
        if (structureSetID == null) {
            structureSetID = new ArrayList<String>();
        }
        return this.structureSetID;
    }

    /**
     * Gets the value of the reportingTaxonomyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingTaxonomyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingTaxonomyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReportingTaxonomyID() {
        if (reportingTaxonomyID == null) {
            reportingTaxonomyID = new ArrayList<String>();
        }
        return this.reportingTaxonomyID;
    }

    /**
     * Gets the value of the processID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProcessID() {
        if (processID == null) {
            processID = new ArrayList<String>();
        }
        return this.processID;
    }

}
