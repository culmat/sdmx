//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ReleaseCalendar holds information about the timing of releases of the constrained data. Periodicity is the period between releases of the data set. Offset is the interval between January first and the first release of data within the year. Tolerance is the period after which the release of data may be deemed late. All of these values use the standard "P7D"-style format.
 * 
 * <p>Java class for ReleaseCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseCalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Periodicity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tolerance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseCalendarType", propOrder = {
    "periodicity",
    "offset",
    "tolerance"
})
public class ReleaseCalendarType {

    @XmlElement(name = "Periodicity", required = true)
    protected String periodicity;
    @XmlElement(name = "Offset", required = true)
    protected String offset;
    @XmlElement(name = "Tolerance", required = true)
    protected String tolerance;

    /**
     * Gets the value of the periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicity() {
        return periodicity;
    }

    /**
     * Sets the value of the periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicity(String value) {
        this.periodicity = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(String value) {
        this.tolerance = value;
    }

}