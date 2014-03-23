//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DataProviderWhere element representes a query for details for a provider of data or metadata sets. It contains all of the clauses in that query, represented by its child elements. Values are the IDs of the referenced object.
 * 
 * <p>Java class for DataProviderWhereType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProviderWhereType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DataSet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataSet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeyFamily" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataStructure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StructureSet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Codelist" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}CodelistType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}CategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Concept" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgencyID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Or" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}OrType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="And" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}AndType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProviderWhereType", propOrder = {
    "dataSet",
    "metadataSet",
    "keyFamily",
    "metadataStructure",
    "structureSet",
    "codelist",
    "category",
    "concept",
    "agencyID",
    "or",
    "and"
})
public class DataProviderWhereType {

    @XmlElement(name = "DataSet")
    protected List<String> dataSet;
    @XmlElement(name = "MetadataSet")
    protected List<String> metadataSet;
    @XmlElement(name = "KeyFamily")
    protected List<String> keyFamily;
    @XmlElement(name = "MetadataStructure")
    protected List<String> metadataStructure;
    @XmlElement(name = "StructureSet")
    protected List<String> structureSet;
    @XmlElement(name = "Codelist")
    protected List<CodelistType> codelist;
    @XmlElement(name = "Category")
    protected List<CategoryType> category;
    @XmlElement(name = "Concept")
    protected List<String> concept;
    @XmlElement(name = "AgencyID")
    protected List<String> agencyID;
    @XmlElement(name = "Or")
    protected List<OrType> or;
    @XmlElement(name = "And")
    protected List<AndType> and;

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<String>();
        }
        return this.dataSet;
    }

    /**
     * Gets the value of the metadataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadataSet() {
        if (metadataSet == null) {
            metadataSet = new ArrayList<String>();
        }
        return this.metadataSet;
    }

    /**
     * Gets the value of the keyFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyFamily() {
        if (keyFamily == null) {
            keyFamily = new ArrayList<String>();
        }
        return this.keyFamily;
    }

    /**
     * Gets the value of the metadataStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadataStructure() {
        if (metadataStructure == null) {
            metadataStructure = new ArrayList<String>();
        }
        return this.metadataStructure;
    }

    /**
     * Gets the value of the structureSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStructureSet() {
        if (structureSet == null) {
            structureSet = new ArrayList<String>();
        }
        return this.structureSet;
    }

    /**
     * Gets the value of the codelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodelistType }
     * 
     * 
     */
    public List<CodelistType> getCodelist() {
        if (codelist == null) {
            codelist = new ArrayList<CodelistType>();
        }
        return this.codelist;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryType }
     * 
     * 
     */
    public List<CategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryType>();
        }
        return this.category;
    }

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConcept() {
        if (concept == null) {
            concept = new ArrayList<String>();
        }
        return this.concept;
    }

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
     * Gets the value of the or property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the or property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrType }
     * 
     * 
     */
    public List<OrType> getOr() {
        if (or == null) {
            or = new ArrayList<OrType>();
        }
        return this.or;
    }

    /**
     * Gets the value of the and property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the and property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndType }
     * 
     * 
     */
    public List<AndType> getAnd() {
        if (and == null) {
            and = new ArrayList<AndType>();
        }
        return this.and;
    }

}