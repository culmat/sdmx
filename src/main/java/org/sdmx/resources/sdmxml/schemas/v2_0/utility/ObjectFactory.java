//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.utility;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sdmx.resources.sdmxml.schemas.v2_0.utility package. 
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

    private final static QName _Obs_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Obs");
    private final static QName _Key_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Key");
    private final static QName _Group_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Group");
    private final static QName _Series_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Series");
    private final static QName _DataSet_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "DataSet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sdmx.resources.sdmxml.schemas.v2_0.utility
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", name = "Obs")
    public JAXBElement<ObsType> createObs(ObsType value) {
        return new JAXBElement<ObsType>(_Obs_QNAME, ObsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", name = "Key")
    public JAXBElement<KeyType> createKey(KeyType value) {
        return new JAXBElement<KeyType>(_Key_QNAME, KeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", name = "Group")
    public JAXBElement<GroupType> createGroup(GroupType value) {
        return new JAXBElement<GroupType>(_Group_QNAME, GroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", name = "Series")
    public JAXBElement<SeriesType> createSeries(SeriesType value) {
        return new JAXBElement<SeriesType>(_Series_QNAME, SeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", name = "DataSet")
    public JAXBElement<DataSetType> createDataSet(DataSetType value) {
        return new JAXBElement<DataSetType>(_DataSet_QNAME, DataSetType.class, null, value);
    }

}
