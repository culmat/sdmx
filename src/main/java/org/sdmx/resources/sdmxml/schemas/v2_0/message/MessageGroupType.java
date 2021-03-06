//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * MessageGroupType defines the contents of a MessageGroup message.
 * 
 * <p>Java class for MessageGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message}MessageType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic}DataSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility}DataSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact}DataSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross}DataSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata}MetadataSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport}MetadataSet" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageGroupType", propOrder = {
    "rest"
})
public class MessageGroupType
    extends MessageType
{

    @XmlElementRefs({
        @XmlElementRef(name = "DataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MetadataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MetadataSet", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "DataSet" is used by two different parts of a schema. See: 
     * line 234 of file:/Users/matthi/Documents/workspace/vert.x/noga/src/main/resources/xsd/SDMXMessage.xsd
     * line 233 of file:/Users/matthi/Documents/workspace/vert.x/noga/src/main/resources/xsd/SDMXMessage.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.compact.DataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.generic.DataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.cross.DataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.metadatareport.MetadataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.genericmetadata.MetadataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.sdmx.resources.sdmxml.schemas.v2_0.utility.DataSetType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
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
