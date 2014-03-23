package com.github.culmat.noga;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Marshal {
	public static Unmarshaller createUnmarshaller() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext
				.newInstance(
						org.sdmx.resources.sdmxml.schemas.v2_0.message.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.compact.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.cross.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.generic.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.genericmetadata.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.message.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.metadatareport.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.query.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.registry.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.structure.ObjectFactory.class,
						org.sdmx.resources.sdmxml.schemas.v2_0.utility.ObjectFactory.class);

		return jaxbContext.createUnmarshaller();
	}
}