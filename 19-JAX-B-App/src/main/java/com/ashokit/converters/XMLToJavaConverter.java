package com.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ashokit.bindings.Student;

public class XMLToJavaConverter {

	public static void main(String[] args) throws Exception {
		File xmlFile = new File("student.xml");

		JAXBContext jaxBContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxBContext.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(xmlFile);
		System.out.println(student);

	}
}
