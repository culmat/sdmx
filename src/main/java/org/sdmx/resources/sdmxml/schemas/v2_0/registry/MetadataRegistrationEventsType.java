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
 * Contains details of the subscribed metadadata registry events. Note that the ID fields may hold a complete ID or Registry URN, but may also insert the "%" wildcard character, which represents 0 or more characters, in the ID string. If left empty, all objects will be matched within the other constraints (agency, object type) provided.
 * 
 * <p>Java class for MetadataRegistrationEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataRegistrationEventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllEventsID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataProviderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProvisionAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataflowID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadatastructureID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataRegistrationEventsType", propOrder = {
    "allEventsID",
    "dataProviderID",
    "provisionAgreementID",
    "metadataflowID",
    "metadatastructureID",
    "categoryID"
})
public class MetadataRegistrationEventsType {

    @XmlElement(name = "AllEventsID")
    protected List<String> allEventsID;
    @XmlElement(name = "DataProviderID")
    protected List<String> dataProviderID;
    @XmlElement(name = "ProvisionAgreementID")
    protected List<String> provisionAgreementID;
    @XmlElement(name = "MetadataflowID")
    protected List<String> metadataflowID;
    @XmlElement(name = "MetadatastructureID")
    protected List<String> metadatastructureID;
    @XmlElement(name = "CategoryID")
    protected List<String> categoryID;

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
     * Gets the value of the dataProviderID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataProviderID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataProviderID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataProviderID() {
        if (dataProviderID == null) {
            dataProviderID = new ArrayList<String>();
        }
        return this.dataProviderID;
    }

    /**
     * Gets the value of the provisionAgreementID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisionAgreementID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisionAgreementID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProvisionAgreementID() {
        if (provisionAgreementID == null) {
            provisionAgreementID = new ArrayList<String>();
        }
        return this.provisionAgreementID;
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
     * Gets the value of the metadatastructureID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadatastructureID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadatastructureID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadatastructureID() {
        if (metadatastructureID == null) {
            metadatastructureID = new ArrayList<String>();
        }
        return this.metadatastructureID;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryID() {
        if (categoryID == null) {
            categoryID = new ArrayList<String>();
        }
        return this.categoryID;
    }

}