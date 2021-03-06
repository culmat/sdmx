//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AgenciesType contains one or more Agencies. Agencies are those organisations which act as the maintainers of structural definitions of various types. Agencies are often supplied as part of an organisation scheme, but may also be supplied independently using this element.
 * 
 * <p>Java class for AgenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgenciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agency" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure}OrganisationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgenciesType", propOrder = {
    "agency"
})
public class AgenciesType {

    @XmlElement(name = "Agency", required = true)
    protected List<OrganisationType> agency;

    /**
     * Gets the value of the agency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationType }
     * 
     * 
     */
    public List<OrganisationType> getAgency() {
        if (agency == null) {
            agency = new ArrayList<OrganisationType>();
        }
        return this.agency;
    }

}
