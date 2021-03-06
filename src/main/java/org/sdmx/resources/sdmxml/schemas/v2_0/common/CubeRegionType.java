//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CubeRegion describes the portion(s) of the possible combinations of all components within a key family or metadata structure definition by providing valid values on a per-component basis. This does not guarantee that data will be available for all possible combinations, but describes the portion of the cube in which it is useful to query for data. The isIncluded attribute, if true, indicates that the described area is the one in which it is useful to search/expect to find data. If false, this means that the portions of the cube outside the described region are useful to search/where you may expect to find data.
 * 
 * <p>Java class for CubeRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CubeRegionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common}MemberType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isIncluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubeRegionType", propOrder = {
    "member"
})
public class CubeRegionType {

    @XmlElement(name = "Member", required = true)
    protected List<MemberType> member;
    @XmlAttribute(name = "isIncluded", required = true)
    protected boolean isIncluded;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberType }
     * 
     * 
     */
    public List<MemberType> getMember() {
        if (member == null) {
            member = new ArrayList<MemberType>();
        }
        return this.member;
    }

    /**
     * Gets the value of the isIncluded property.
     * 
     */
    public boolean isIsIncluded() {
        return isIncluded;
    }

    /**
     * Sets the value of the isIncluded property.
     * 
     */
    public void setIsIncluded(boolean value) {
        this.isIncluded = value;
    }

}
