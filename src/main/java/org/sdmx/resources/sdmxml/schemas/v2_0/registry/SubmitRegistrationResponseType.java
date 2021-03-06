//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.registry;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This document is sent to the agency or data/metadata provider in response to a registration request. It indicates the success or failure of the registration request, and contains any error messages generated by the registration service.
 * 
 * <p>Java class for SubmitRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitRegistrationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationStatus" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}RegistrationStatusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitRegistrationResponseType", propOrder = {
    "registrationStatus"
})
public class SubmitRegistrationResponseType {

    @XmlElement(name = "RegistrationStatus", required = true)
    protected List<RegistrationStatusType> registrationStatus;

    /**
     * Gets the value of the registrationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationStatusType }
     * 
     * 
     */
    public List<RegistrationStatusType> getRegistrationStatus() {
        if (registrationStatus == null) {
            registrationStatus = new ArrayList<RegistrationStatusType>();
        }
        return this.registrationStatus;
    }

}
