//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.compact.DataSetType;


/**
 * CompactDataType defines the contents of a CompactData message.
 * 
 * <p>Java class for CompactDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompactDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message}MessageType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact}DataSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompactDataType", propOrder = {
    "dataSet"
})
public class CompactDataType
    extends MessageType
{

    @XmlElement(name = "DataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", required = true)
    protected DataSetType dataSet;

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetType }
     *     
     */
    public DataSetType getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetType }
     *     
     */
    public void setDataSet(DataSetType value) {
        this.dataSet = value;
    }

}
