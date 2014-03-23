//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Constraint specifies the object to which constraints are attached. Note that if the constraint is that for a Data Provider, then only ReleaseCalendar information is relevant, as there is no reliable way of determining which key family is being used to frame constraints in terms of cube regions or key sets. ReferencePeriod is used to report start date and end date constraints. MetadataConceptSet allows for conten t constraints to be described for metadata sets.
 * 
 * <p>Java class for ConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstraintID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType"/>
 *         &lt;element name="CubeRegion" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}CubeRegionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataConceptSet" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}MetadataConceptSetType" minOccurs="0"/>
 *         &lt;element name="KeySet" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}KeySetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReleaseCalendar" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ReleaseCalendarType" minOccurs="0"/>
 *         &lt;element name="ReferencePeriod" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ReferencePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConstraintType" use="required" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ConstraintTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintType", propOrder = {
    "constraintID",
    "cubeRegion",
    "metadataConceptSet",
    "keySet",
    "releaseCalendar",
    "referencePeriod"
})
public class ConstraintType {

    @XmlElement(name = "ConstraintID", required = true)
    protected String constraintID;
    @XmlElement(name = "CubeRegion")
    protected List<CubeRegionType> cubeRegion;
    @XmlElement(name = "MetadataConceptSet")
    protected MetadataConceptSetType metadataConceptSet;
    @XmlElement(name = "KeySet")
    protected List<KeySetType> keySet;
    @XmlElement(name = "ReleaseCalendar")
    protected ReleaseCalendarType releaseCalendar;
    @XmlElement(name = "ReferencePeriod")
    protected ReferencePeriodType referencePeriod;
    @XmlAttribute(name = "ConstraintType", required = true)
    protected ConstraintTypeType constraintType;

    /**
     * Gets the value of the constraintID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintID() {
        return constraintID;
    }

    /**
     * Sets the value of the constraintID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintID(String value) {
        this.constraintID = value;
    }

    /**
     * Gets the value of the cubeRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cubeRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCubeRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CubeRegionType }
     * 
     * 
     */
    public List<CubeRegionType> getCubeRegion() {
        if (cubeRegion == null) {
            cubeRegion = new ArrayList<CubeRegionType>();
        }
        return this.cubeRegion;
    }

    /**
     * Gets the value of the metadataConceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConceptSetType }
     *     
     */
    public MetadataConceptSetType getMetadataConceptSet() {
        return metadataConceptSet;
    }

    /**
     * Sets the value of the metadataConceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConceptSetType }
     *     
     */
    public void setMetadataConceptSet(MetadataConceptSetType value) {
        this.metadataConceptSet = value;
    }

    /**
     * Gets the value of the keySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeySetType }
     * 
     * 
     */
    public List<KeySetType> getKeySet() {
        if (keySet == null) {
            keySet = new ArrayList<KeySetType>();
        }
        return this.keySet;
    }

    /**
     * Gets the value of the releaseCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseCalendarType }
     *     
     */
    public ReleaseCalendarType getReleaseCalendar() {
        return releaseCalendar;
    }

    /**
     * Sets the value of the releaseCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseCalendarType }
     *     
     */
    public void setReleaseCalendar(ReleaseCalendarType value) {
        this.releaseCalendar = value;
    }

    /**
     * Gets the value of the referencePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePeriodType }
     *     
     */
    public ReferencePeriodType getReferencePeriod() {
        return referencePeriod;
    }

    /**
     * Sets the value of the referencePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePeriodType }
     *     
     */
    public void setReferencePeriod(ReferencePeriodType value) {
        this.referencePeriod = value;
    }

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintTypeType }
     *     
     */
    public ConstraintTypeType getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintTypeType }
     *     
     */
    public void setConstraintType(ConstraintTypeType value) {
        this.constraintType = value;
    }

}