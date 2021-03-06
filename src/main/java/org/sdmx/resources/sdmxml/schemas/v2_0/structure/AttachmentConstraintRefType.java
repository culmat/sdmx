//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AttachmentConstraintRefType describes a reference to an attachment constraint. This includes a reference to a dataflow, metadataflow, data provider, or provision agreement plus the ID of the attachment constraint, as assigned within the constraints associated with the referenced object, in the ConstraintRef element.
 * 
 * <p>Java class for AttachmentConstraintRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentConstraintRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DataflowRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}DataflowRefType"/>
 *           &lt;element name="MetadataflowRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}MetadataflowRefType"/>
 *           &lt;element name="DataProviderRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}DataProviderRefType"/>
 *           &lt;element name="ProvisionAgreementRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}ProvisionAgreementRefType"/>
 *         &lt;/choice>
 *         &lt;element name="ConstraintRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentConstraintRefType", propOrder = {
    "dataflowRef",
    "metadataflowRef",
    "dataProviderRef",
    "provisionAgreementRef",
    "constraintRef"
})
public class AttachmentConstraintRefType {

    @XmlElement(name = "DataflowRef")
    protected DataflowRefType dataflowRef;
    @XmlElement(name = "MetadataflowRef")
    protected MetadataflowRefType metadataflowRef;
    @XmlElement(name = "DataProviderRef")
    protected DataProviderRefType dataProviderRef;
    @XmlElement(name = "ProvisionAgreementRef")
    protected ProvisionAgreementRefType provisionAgreementRef;
    @XmlElement(name = "ConstraintRef", required = true)
    protected String constraintRef;

    /**
     * Gets the value of the dataflowRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataflowRefType }
     *     
     */
    public DataflowRefType getDataflowRef() {
        return dataflowRef;
    }

    /**
     * Sets the value of the dataflowRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataflowRefType }
     *     
     */
    public void setDataflowRef(DataflowRefType value) {
        this.dataflowRef = value;
    }

    /**
     * Gets the value of the metadataflowRef property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataflowRefType }
     *     
     */
    public MetadataflowRefType getMetadataflowRef() {
        return metadataflowRef;
    }

    /**
     * Sets the value of the metadataflowRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataflowRefType }
     *     
     */
    public void setMetadataflowRef(MetadataflowRefType value) {
        this.metadataflowRef = value;
    }

    /**
     * Gets the value of the dataProviderRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviderRefType }
     *     
     */
    public DataProviderRefType getDataProviderRef() {
        return dataProviderRef;
    }

    /**
     * Sets the value of the dataProviderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviderRefType }
     *     
     */
    public void setDataProviderRef(DataProviderRefType value) {
        this.dataProviderRef = value;
    }

    /**
     * Gets the value of the provisionAgreementRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionAgreementRefType }
     *     
     */
    public ProvisionAgreementRefType getProvisionAgreementRef() {
        return provisionAgreementRef;
    }

    /**
     * Sets the value of the provisionAgreementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionAgreementRefType }
     *     
     */
    public void setProvisionAgreementRef(ProvisionAgreementRefType value) {
        this.provisionAgreementRef = value;
    }

    /**
     * Gets the value of the constraintRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintRef() {
        return constraintRef;
    }

    /**
     * Sets the value of the constraintRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintRef(String value) {
        this.constraintRef = value;
    }

}
