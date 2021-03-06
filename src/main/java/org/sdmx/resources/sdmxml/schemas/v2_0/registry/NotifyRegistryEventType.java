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
import javax.xml.datatype.XMLGregorianCalendar;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.ActionType;


/**
 * The NotifyRegistryEvent element is sent by the registry services to subscribers, to notify them of specific registration and change events. EventTime specifies the time of the triggering event. ObjectURN provides the URN of the object on which the event occurred. SubscriptionURN provides the registry/repository URN of the subscription. EventAction indicates the nature of the event - whether the action was an addition, a modification, or a deletion.
 * 
 * <p>Java class for NotifyRegistryEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyRegistryEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ObjectURN" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="SubscriptionURN" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="EventAction" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}ActionType"/>
 *         &lt;choice>
 *           &lt;element name="StructuralEvent" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}StructuralEventType"/>
 *           &lt;element name="ProvisioningEvent" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}ProvisioningEventType"/>
 *           &lt;element name="RegistrationEvent" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry}RegistrationEventType"/>
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
@XmlType(name = "NotifyRegistryEventType", propOrder = {
    "eventTime",
    "objectURN",
    "subscriptionURN",
    "eventAction",
    "structuralEvent",
    "provisioningEvent",
    "registrationEvent"
})
public class NotifyRegistryEventType {

    @XmlElement(name = "EventTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(name = "ObjectURN", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String objectURN;
    @XmlElement(name = "SubscriptionURN", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionURN;
    @XmlElement(name = "EventAction", required = true)
    protected ActionType eventAction;
    @XmlElement(name = "StructuralEvent")
    protected StructuralEventType structuralEvent;
    @XmlElement(name = "ProvisioningEvent")
    protected ProvisioningEventType provisioningEvent;
    @XmlElement(name = "RegistrationEvent")
    protected RegistrationEventType registrationEvent;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the objectURN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectURN() {
        return objectURN;
    }

    /**
     * Sets the value of the objectURN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectURN(String value) {
        this.objectURN = value;
    }

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
     * Gets the value of the eventAction property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getEventAction() {
        return eventAction;
    }

    /**
     * Sets the value of the eventAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setEventAction(ActionType value) {
        this.eventAction = value;
    }

    /**
     * Gets the value of the structuralEvent property.
     * 
     * @return
     *     possible object is
     *     {@link StructuralEventType }
     *     
     */
    public StructuralEventType getStructuralEvent() {
        return structuralEvent;
    }

    /**
     * Sets the value of the structuralEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuralEventType }
     *     
     */
    public void setStructuralEvent(StructuralEventType value) {
        this.structuralEvent = value;
    }

    /**
     * Gets the value of the provisioningEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisioningEventType }
     *     
     */
    public ProvisioningEventType getProvisioningEvent() {
        return provisioningEvent;
    }

    /**
     * Sets the value of the provisioningEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisioningEventType }
     *     
     */
    public void setProvisioningEvent(ProvisioningEventType value) {
        this.provisioningEvent = value;
    }

    /**
     * Gets the value of the registrationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationEventType }
     *     
     */
    public RegistrationEventType getRegistrationEvent() {
        return registrationEvent;
    }

    /**
     * Sets the value of the registrationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationEventType }
     *     
     */
    public void setRegistrationEvent(RegistrationEventType value) {
        this.registrationEvent = value;
    }

}
