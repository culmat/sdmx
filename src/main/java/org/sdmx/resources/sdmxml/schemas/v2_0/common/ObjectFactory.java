//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sdmx.resources.sdmxml.schemas.v2_0.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyTypeValue_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "Value");
    private final static QName _KeyTypeComponentRef_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "ComponentRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sdmx.resources.sdmxml.schemas.v2_0.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnotationType }
     * 
     */
    public AnnotationType createAnnotationType() {
        return new AnnotationType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link CubeRegionType }
     * 
     */
    public CubeRegionType createCubeRegionType() {
        return new CubeRegionType();
    }

    /**
     * Create an instance of {@link AnnotationsType }
     * 
     */
    public AnnotationsType createAnnotationsType() {
        return new AnnotationsType();
    }

    /**
     * Create an instance of {@link KeySetType }
     * 
     */
    public KeySetType createKeySetType() {
        return new KeySetType();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link ReferencePeriodType }
     * 
     */
    public ReferencePeriodType createReferencePeriodType() {
        return new ReferencePeriodType();
    }

    /**
     * Create an instance of {@link MetadataConceptSetType }
     * 
     */
    public MetadataConceptSetType createMetadataConceptSetType() {
        return new MetadataConceptSetType();
    }

    /**
     * Create an instance of {@link MemberValueType }
     * 
     */
    public MemberValueType createMemberValueType() {
        return new MemberValueType();
    }

    /**
     * Create an instance of {@link ConstraintType }
     * 
     */
    public ConstraintType createConstraintType() {
        return new ConstraintType();
    }

    /**
     * Create an instance of {@link MemberType }
     * 
     */
    public MemberType createMemberType() {
        return new MemberType();
    }

    /**
     * Create an instance of {@link ReleaseCalendarType }
     * 
     */
    public ReleaseCalendarType createReleaseCalendarType() {
        return new ReleaseCalendarType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", name = "Value", scope = KeyType.class)
    public JAXBElement<String> createKeyTypeValue(String value) {
        return new JAXBElement<String>(_KeyTypeValue_QNAME, String.class, KeyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", name = "ComponentRef", scope = KeyType.class)
    public JAXBElement<String> createKeyTypeComponentRef(String value) {
        return new JAXBElement<String>(_KeyTypeComponentRef_QNAME, String.class, KeyType.class, value);
    }

}
