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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.AnnotationsType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.TextType;


/**
 * CodeType defines the structure of a code. This allows for plain-text descriptions as element content, and the coded value as the value attribute. (Short descriptions or other presentational information may be added using Annotations with an indicative type field [eg, "ShortDescription"]). The urn attribute supplies a valid SDMX Registry URN (see the SDMX Registry Specification).The parentCode attribute provides the ability to describe simple hierarchies within a single codelist, by referenceing the id value of another code in the same codelist.
 * 
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *       &lt;attribute name="urn" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="parentCode" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "description",
    "annotations"
})
public class CodeType {

    @XmlElement(name = "Description", required = true)
    protected List<TextType> description;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "urn")
    @XmlSchemaType(name = "anyURI")
    protected String urn;
    @XmlAttribute(name = "parentCode")
    protected String parentCode;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrn() {
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
    public void setUrn(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCode(String value) {
        this.parentCode = value;
    }

}