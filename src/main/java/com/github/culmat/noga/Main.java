package com.github.culmat.noga;

import static java.util.Locale.ENGLISH;
import static java.util.Locale.GERMAN;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.sdmx.resources.sdmxml.schemas.v2_0.common.TextType;
import org.sdmx.resources.sdmxml.schemas.v2_0.message.StructureType;
import org.sdmx.resources.sdmxml.schemas.v2_0.structure.CodeListType;
import org.sdmx.resources.sdmxml.schemas.v2_0.structure.CodeType;

public class Main {

	public static void main(String[] args) throws JAXBException {
		File XMLfile = new File("CH1_NOGA+HCL_NOGA+3.0.xml");

		@SuppressWarnings("unchecked")
		JAXBElement<StructureType> elem = (JAXBElement<StructureType>) Marshal
				.createUnmarshaller().unmarshal(XMLfile);
		StructureType struct = elem.getValue();
		Map<String, Map<Locale, String>> trans = createTranslations(struct);
		System.out.println(trans.get("3523").get(ENGLISH));
		System.out.println(trans.get("3523").get(GERMAN));
	}

	public static Map<String, Map<Locale, String>> createTranslations(
			StructureType struct) {
		Map<String, Map<Locale, String>> ret = new HashMap<>();

		for (CodeListType list : struct.getCodeLists().getCodeList()) {
			for (CodeType code : list.getCode()) {
				Map<Locale, String> trans = new HashMap<>();
				for (TextType desc : code.getDescription()) {
					trans.put(new Locale(desc.getLang()), desc.getValue());
				}
				ret.put(code.getValue(), trans);
			}
		}

		return ret;
	}

}
