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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The CodeRefType provides the structure for a codelist reference. At a minimum, either a URN value (a valid SDMX Registry URN as specified in teh SDMX Registry Specification) must be supplied, or a ColdelistAliasRef and a CodeID must be specified. CodelistAliasRef references an alias assigned in a CodelistRef element in the containing hierarchical codelist.CodeRef references a code from the codelist identified at the level of the parent hierarchical codelist. Codes are arranged in a hierarchy by reference. Note that it is possible to reference a single code such that it has multiple parents within the hierarchy. Further, the hierarchy may or may not be a levelled one. CodeID holds the ID of the code in the codelist referenced by the hierarchical codelist. CodeRef references a code. LevelRef holds the id of a Level described in the same parent Hierarchical Codelist. NodeAliasID allows for an ID to be assigned to the use of the particular code at that specific point in the hierarchy. This value is unique within the hierarchy being created, and is used to map the hierarchy against external structures. Version holds the version number of the referenced code, to support management of complex hierarchies. Along with this field are the ValidFrom and ValidTo dates, which are inclusive dates during which the code is valid within the parent hierarchy.
 * 
 * <p>Java class for CodeRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="CodelistAliasRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="CodeID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="CodeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}CodeRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LevelRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="NodeAliasID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TimePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeRefType", propOrder = {
    "urn",
    "codelistAliasRef",
    "codeID",
    "codeRef",
    "levelRef",
    "nodeAliasID",
    "version",
    "validFrom",
    "validTo"
})
public class CodeRefType {

    @XmlElement(name = "URN")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlElement(name = "CodelistAliasRef")
    protected String codelistAliasRef;
    @XmlElement(name = "CodeID")
    protected String codeID;
    @XmlElement(name = "CodeRef")
    protected List<CodeRefType> codeRef;
    @XmlElement(name = "LevelRef")
    protected String levelRef;
    @XmlElement(name = "NodeAliasID")
    protected String nodeAliasID;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "ValidFrom")
    protected String validFrom;
    @XmlElement(name = "ValidTo")
    protected String validTo;

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
     * Gets the value of the codelistAliasRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodelistAliasRef() {
        return codelistAliasRef;
    }

    /**
     * Sets the value of the codelistAliasRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodelistAliasRef(String value) {
        this.codelistAliasRef = value;
    }

    /**
     * Gets the value of the codeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeID() {
        return codeID;
    }

    /**
     * Sets the value of the codeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeID(String value) {
        this.codeID = value;
    }

    /**
     * Gets the value of the codeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeRefType }
     * 
     * 
     */
    public List<CodeRefType> getCodeRef() {
        if (codeRef == null) {
            codeRef = new ArrayList<CodeRefType>();
        }
        return this.codeRef;
    }

    /**
     * Gets the value of the levelRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelRef() {
        return levelRef;
    }

    /**
     * Sets the value of the levelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelRef(String value) {
        this.levelRef = value;
    }

    /**
     * Gets the value of the nodeAliasID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeAliasID() {
        return nodeAliasID;
    }

    /**
     * Sets the value of the nodeAliasID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeAliasID(String value) {
        this.nodeAliasID = value;
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

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

}
