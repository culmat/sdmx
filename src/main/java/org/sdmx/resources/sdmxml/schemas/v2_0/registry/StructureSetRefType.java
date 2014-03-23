//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.registry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * StructureSetRef allows for references to specific structure sets. At a minimum, either the URN - which contains a valid Registry/Repository URN - or the rest of the child elements must be supplied. When used in a response document of any type, the URN must always be provided.
 * 
 * <p>Java class for StructureSetRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructureSetRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AgencyID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="StructureSetID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureSetRefType", propOrder = {
    "urn",
    "agencyID",
    "structureSetID",
    "version"
})
public class StructureSetRefType {

    @XmlElement(name = "URN")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlElement(name = "AgencyID")
    protected String agencyID;
    @XmlElement(name = "StructureSetID")
    protected String structureSetID;
    @XmlElement(name = "Version")
    protected String version;

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURN() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURN(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the structureSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureSetID() {
        return structureSetID;
    }

    /**
     * Sets the value of the structureSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureSetID(String value) {
        this.structureSetID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
