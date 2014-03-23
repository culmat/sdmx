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
 * GroupType declares any useful groupings of data, based on a selection of the declared (non-Time) dimensions (indicated with the DimensionRef element) which form partial keys to which attributes may be attached. The value of the DimensionRef element is the concept of the dimension - that is, the value of the dimension's concept attribute. Thus, if data is to be presented as a set of time series which vary only according to their differing frequencies, a "sibling group" would be declared, with all dimensions except the frequency dimension in it. If data is commonly grouped as a set of all countries, then a "Country Group" could be declared, with all dimensions except the country dimension forming part of the partial key. Any dimension which is not part of a group has a value which varies at the series level (for time series formats). There is no requirement to have only a single dimension ommitted from a partial key - it can be any subset of the set of ordered dimensions (that is, all dimensions except the time dimension, which may never be declared as belonging to a group partial key). All groups declared in the key family must be unique - that is, you may not have duplicate partial keys. All groups must also be given unique names (id attributes). Although it is conventional to declare dimensions in the same order as they are declared in the ordered key, there is no requirement to do so - the ordering of the values of the key are taken from the order in which the dimensions are declared. The Description element provides a human-readable description (potentially in multiple, parallel languages) of the group. Note that for cross-sectional formats, the named group mechanism is not used, but is instead replaced by a generic group which carries time and frequency values with it, and allows for any available group-level attributes to be specified if desired. 
 * 
 * <p>Java class for GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DimensionRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" maxOccurs="unbounded"/>
 *           &lt;element name="AttachmentConstraintRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GroupType", propOrder = {
    "dimensionRef",
    "attachmentConstraintRef",
    "description",
    "annotations"
})
public class GroupType {

    @XmlElement(name = "DimensionRef")
    protected List<String> dimensionRef;
    @XmlElement(name = "AttachmentConstraintRef")
    protected String attachmentConstraintRef;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "Annotations")
    protected AnnotationsType annotations;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the dimensionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDimensionRef() {
        if (dimensionRef == null) {
            dimensionRef = new ArrayList<String>();
        }
        return this.dimensionRef;
    }

    /**
     * Gets the value of the attachmentConstraintRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentConstraintRef() {
        return attachmentConstraintRef;
    }

    /**
     * Sets the value of the attachmentConstraintRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentConstraintRef(String value) {
        this.attachmentConstraintRef = value;
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