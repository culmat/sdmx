//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.structure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToValueTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToValueTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Value"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Description"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToValueTypeType")
@XmlEnum
public enum ToValueTypeType {


    /**
     * Code or other tokenized value, as provided in the representation scheme.
     * 
     */
    @XmlEnumValue("Value")
    VALUE("Value"),

    /**
     * The human-readable name of the Value, as provided in the representation scheme.
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),

    /**
     * The human-readable description of the Value, as provided in the representation scheme.
     * 
     */
    @XmlEnumValue("Description")
    DESCRIPTION("Description");
    private final String value;

    ToValueTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToValueTypeType fromValue(String v) {
        for (ToValueTypeType c: ToValueTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}