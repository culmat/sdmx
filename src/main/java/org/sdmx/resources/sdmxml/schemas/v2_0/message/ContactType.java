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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.sdmx.resources.sdmxml.schemas.v2_0.common.TextType;


/**
 * ContactType provides defines the contact information about a party. The Name provides a human-readable name.
 * 
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="X400" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ContactType", propOrder = {
    "name",
    "department",
    "role",
    "telephoneOrFaxOrX400"
})
public class ContactType {

    @XmlElement(name = "Name")
    protected List<TextType> name;
    @XmlElement(name = "Department")
    protected List<TextType> department;
    @XmlElement(name = "Role")
    protected List<TextType> role;
    @XmlElementRefs({
        @XmlElementRef(name = "Email", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Fax", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Telephone", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X400", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URI", namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> telephoneOrFaxOrX400;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getName() {
        if (name == null) {
            name = new ArrayList<TextType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDepartment() {
        if (department == null) {
            department = new ArrayList<TextType>();
        }
        return this.department;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getRole() {
        if (role == null) {
            role = new ArrayList<TextType>();
        }
        return this.role;
    }

    /**
     * Gets the value of the telephoneOrFaxOrX400 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneOrFaxOrX400 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneOrFaxOrX400().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getTelephoneOrFaxOrX400() {
        if (telephoneOrFaxOrX400 == null) {
            telephoneOrFaxOrX400 = new ArrayList<JAXBElement<String>>();
        }
        return this.telephoneOrFaxOrX400;
    }

}
