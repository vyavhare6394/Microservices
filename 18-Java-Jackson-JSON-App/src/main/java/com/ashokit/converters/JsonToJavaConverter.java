package com.ashokit.converters;

import java.io.File;

import com.ashokit.pojo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {
	
	public static void main(String[] args) throws Exception{
		//convertJsonToObj();
		convertJsonToObjs();
	}
	
	public static void convertJsonToObjs() throws Exception {
		File file = new File("students.json");
		ObjectMapper mapper = new ObjectMapper();
		Student[] students = mapper.readValue(file,Student[].class);
		for(Student s : students) {
			System.out.println(s);
		}
	}
	
	public static void convertJsonToObj() throws Exception{
		File f = new File("student.json");
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(f, Student.class);
		System.out.println(student);
	}

}
