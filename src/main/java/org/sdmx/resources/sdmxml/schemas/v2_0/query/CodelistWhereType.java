//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The CodelistWhere element representes a query for a codelist or codelists. It contains all of the clauses in that query, represented by its child elements. Values are the IDs of the referenced object.
 * 
 * <p>Java class for CodelistWhereType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodelistWhereType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Codelist" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}CodelistType"/>
 *         &lt;element name="AgencyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Or" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}OrType"/>
 *         &lt;element name="And" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query}AndType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodelistWhereType", propOrder = {
    "codelist",
    "agencyID",
    "version",
    "or",
    "and"
})
public class CodelistWhereType {

    @XmlElement(name = "Codelist")
    protected CodelistType codelist;
    @XmlElement(name = "AgencyID")
    protected String agencyID;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Or")
    protected OrType or;
    @XmlElement(name = "And")
    protected AndType and;

    /**
     * Gets the value of the codelist property.
     * 
     * @return
     *     possible object is
     *     {@link CodelistType }
     *     
     */
    public CodelistType getCodelist() {
        return codelist;
    }

    /**
     * Sets the value of the codelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodelistType }
     *     
     */
    public void setCodelist(CodelistType value) {
        this.codelist = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link OrType }
     *     
     */
    public OrType getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrType }
     *     
     */
    public void setOr(OrType value) {
        this.or = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link AndType }
     *     
     */
    public AndType getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndType }
     *     
     */
    public void setAnd(AndType value) {
        this.and = value;
    }

}
