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
import javax.xml.bind.annotation.XmlType;


/**
 * The QueryRegistrationRequest is used to query the contents of a registry for data sets and metadata sets. The QueryRegistrationRequest specifies whether the result set should include metadata sets, data sets, or both with the QueryType element. The constraints which characterize the search - including reference period, are contained in teh Constraints within the child object references.
 * 
 * <p>Java class for QueryRegistrationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRegistrationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryType" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}QueryTypeType"/>
 *         &lt;choice>
 *           &lt;element name="ProvisionAgreementRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}ProvisionAgreementRefType"/>
 *           &lt;element name="DataflowRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}DataflowRefType"/>
 *           &lt;element name="MetadataflowRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}MetadataflowRefType"/>
 *           &lt;element name="DataProviderRef" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}DataProviderRefType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRegistrationRequestType", propOrder = {
    "queryType",
    "provisionAgreementRef",
    "dataflowRef",
    "metadataflowRef",
    "dataProviderRef"
})
public class QueryRegistrationRequestType {

    @XmlElement(name = "QueryType", required = true)
    protected QueryTypeType queryType;
    @XmlElement(name = "ProvisionAgreementRef")
    protected ProvisionAgreementRefType provisionAgreementRef;
    @XmlElement(name = "DataflowRef")
    protected DataflowRefType dataflowRef;
    @XmlElement(name = "MetadataflowRef")
    protected MetadataflowRefType metadataflowRef;
    @XmlElement(name = "DataProviderRef")
    protected DataProviderRefType dataProviderRef;

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTypeType }
     *     
     */
    public QueryTypeType getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTypeType }
     *     
     */
    public void setQueryType(QueryTypeType value) {
        this.queryType = value;
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

}
