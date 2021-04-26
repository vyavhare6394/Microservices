package com.ashokit.converters;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.ashokit.bindings.Student;

public class JavaToXmlConverter {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setId(201);
		s.setName("Peter");
		s.setRank(80);
		s.setStandard("5th");

		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(s, System.out);
		marshaller.marshal(s, new FileOutputStream("student.xml"));
	}
}
