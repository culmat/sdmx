//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * KeySet describes a set of keys. The isIncluded attribute, if true, indicates that the specified keys are valid keys within the constraint. If false, the set of keys described are not valid - all other possible keys are the valid ones.
 * 
 * <p>Java class for KeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeySetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}KeyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isIncluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySetType", propOrder = {
    "key"
})
public class KeySetType {

    @XmlElement(name = "Key", required = true)
    protected KeyType key;
    @XmlAttribute(name = "isIncluded", required = true)
    protected boolean isIncluded;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setKey(KeyType value) {
        this.key = value;
    }

    /**
     * Gets the value of the isIncluded property.
     * 
     */
    public boolean isIsIncluded() {
        return isIncluded;
    }

    /**
     * Sets the value of the isIncluded property.
     * 
     */
    public void setIsIncluded(boolean value) {
        this.isIncluded = value;
    }

}
