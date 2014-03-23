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


/**
 * ConceptMap allows for the mapping of a concept in one scheme against a concept in another, target scheme. The conceptAlias attribute allows for an alias to be assigned to the mapping for searching across the set of mapped concepts.
 * 
 * <p>Java class for ConceptMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConceptID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType"/>
 *         &lt;element name="TargetConceptID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="conceptAlias" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMapType", propOrder = {
    "conceptID",
    "targetConceptID"
})
public class ConceptMapType {

    @XmlElement(name = "ConceptID", required = true)
    protected String conceptID;
    @XmlElement(name = "TargetConceptID", required = true)
    protected String targetConceptID;
    @XmlAttribute(name = "conceptAlias")
    protected String conceptAlias;

    /**
     * Gets the value of the conceptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptID() {
        return conceptID;
    }

    /**
     * Sets the value of the conceptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptID(String value) {
        this.conceptID = value;
    }

    /**
     * Gets the value of the targetConceptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConceptID() {
        return targetConceptID;
    }

    /**
     * Sets the value of the targetConceptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConceptID(String value) {
        this.targetConceptID = value;
    }

    /**
     * Gets the value of the conceptAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptAlias() {
        return conceptAlias;
    }

    /**
     * Sets the value of the conceptAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptAlias(String value) {
        this.conceptAlias = value;
    }

}
