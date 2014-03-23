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
import org.sdmx.resources.sdmxml.schemas.v2_0.common.TextType;


/**
 * OrganisationSchemeMap provides for the mapping of Organisations in one scheme against those in another. It requires a human-readable Name, and can have a longer human-readable Description, both of which can be supplied in multiple, parallel-language form. It may be annotated using Annotations. The id attribute carries a unique ID for OrganisationSchemeMaps within the StructureSet. OrganisationSchemeRef identifies the source OrganisationScheme; TargetOrganisationSchemeRef identifies the target OrganisationScheme.
 * 
 * <p>Java class for OrganisationSchemeMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationSchemeMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganisationSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}OrganisationSchemeRefType"/>
 *         &lt;element name="TargetOrganisationSchemeRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}OrganisationSchemeRefType"/>
 *         &lt;element name="OrganisationMap" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}OrganisationMapType" maxOccurs="unbounded"/>
 *         &lt;element name="Annotations" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}AnnotationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationSchemeMapType", propOrder = {
    "name",
    "description",
    "organisationSchemeRef",
    "targetOrganisationSchemeRef",
    "organisationMap",
    "annotations"
})
public class OrganisationSchemeMapType {

    @XmlElement(name = "Name", required = true)
    protected List<TextType> name;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "OrganisationSchemeRef", required = true)
    protected OrganisationSchemeRefType organisationSchemeRef;
    @XmlElement(name = "TargetOrganisationSchemeRef", required = true)
    protected OrganisationSchemeRefType targetOrganisationSchemeRef;
    @XmlElement(name = "OrganisationMap", required = true)
    protected List<OrganisationMapType> organisationMap;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getName() {
        if (name == null) {
            name = new ArrayList<TextType>();
        }
        return this.name;
    }

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
     * Gets the value of the organisationSchemeRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationSchemeRefType }
     *     
     */
    public OrganisationSchemeRefType getOrganisationSchemeRef() {
        return organisationSchemeRef;
    }

    /**
     * Sets the value of the organisationSchemeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationSchemeRefType }
     *     
     */
    public void setOrganisationSchemeRef(OrganisationSchemeRefType value) {
        this.organisationSchemeRef = value;
    }

    /**
     * Gets the value of the targetOrganisationSchemeRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationSchemeRefType }
     *     
     */
    public OrganisationSchemeRefType getTargetOrganisationSchemeRef() {
        return targetOrganisationSchemeRef;
    }

    /**
     * Sets the value of the targetOrganisationSchemeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationSchemeRefType }
     *     
     */
    public void setTargetOrganisationSchemeRef(OrganisationSchemeRefType value) {
        this.targetOrganisationSchemeRef = value;
    }

    /**
     * Gets the value of the organisationMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationMapType }
     * 
     * 
     */
    public List<OrganisationMapType> getOrganisationMap() {
        if (organisationMap == null) {
            organisationMap = new ArrayList<OrganisationMapType>();
        }
        return this.organisationMap;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}