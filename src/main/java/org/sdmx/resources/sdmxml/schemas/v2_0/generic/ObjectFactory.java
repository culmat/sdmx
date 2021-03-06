//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 01:49:06 PM CET 
//


package org.sdmx.resources.sdmxml.schemas.v2_0.generic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sdmx.resources.sdmxml.schemas.v2_0.generic package. 
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

    private final static QName _DataSet_QNAME = new QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "DataSet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sdmx.resources.sdmxml.schemas.v2_0.generic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataSetType }
     * 
     */
    public DataSetType createDataSetType() {
        return new DataSetType();
    }

    /**
     * Create an instance of {@link ObsType }
     * 
     */
    public ObsType createObsType() {
        return new ObsType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link ObsValueType }
     * 
     */
    public ObsValueType createObsValueType() {
        return new ObsValueType();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link SeriesType }
     * 
     */
    public SeriesType createSeriesType() {
        return new SeriesType();
    }

    /**
     * Create an instance of {@link SeriesKeyType }
     * 
     */
    public SeriesKeyType createSeriesKeyType() {
        return new SeriesKeyType();
    }

    /**
     * Create an instance of {@link ValuesType }
     * 
     */
    public ValuesType createValuesType() {
        return new ValuesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", name = "DataSet")
    public JAXBElement<DataSetType> createDataSet(DataSetType value) {
        return new JAXBElement<DataSetType>(_DataSet_QNAME, DataSetType.class, null, value);
    }

}
