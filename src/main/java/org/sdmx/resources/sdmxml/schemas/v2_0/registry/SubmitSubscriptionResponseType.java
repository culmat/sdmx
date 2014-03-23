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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The SubmitSubscriptionResponse element contains information which describes the success or failure of a Subscription, providing any error messages in the event of failure. It also returns the registry URN of the subscription, and the subscriber-assigned ID.
 * 
 * <p>Java class for SubmitSubscriptionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitSubscriptionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionURN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="SubscriberAssignedID" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}IDType" minOccurs="0"/>
 *         &lt;element name="SubscriptionStatus" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}StatusMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitSubscriptionResponseType", propOrder = {
    "subscriptionURN",
    "subscriberAssignedID",
    "subscriptionStatus"
})
public class SubmitSubscriptionResponseType {

    @XmlElement(name = "SubscriptionURN")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionURN;
    @XmlElement(name = "SubscriberAssignedID")
    protected String subscriberAssignedID;
    @XmlElement(name = "SubscriptionStatus", required = true)
    protected StatusMessageType subscriptionStatus;

    /**
     * Gets the value of the subscriptionURN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionURN() {
        return subscriptionURN;
    }

    /**
     * Sets the value of the subscriptionURN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionURN(String value) {
        this.subscriptionURN = value;
    }

    /**
     * Gets the value of the subscriberAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAssignedID() {
        return subscriberAssignedID;
    }

    /**
     * Sets the value of the subscriberAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAssignedID(String value) {
        this.subscriberAssignedID = value;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusMessageType }
     *     
     */
    public StatusMessageType getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Sets the value of the subscriptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusMessageType }
     *     
     */
    public void setSubscriptionStatus(StatusMessageType value) {
        this.subscriptionStatus = value;
    }

}