package com.ashokit.converters;

import java.util.ArrayList;
import java.util.List;

import com.ashokit.pojo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		//convertStudentObjToJson();
		convertStudentObjsToJson();
	}

	public static void convertStudentObjsToJson() throws Exception {
		Student s1 = new Student();
		s1.setStudentId(201);
		s1.setStudentName("John");
		s1.setStudentSkill("Java");
		s1.setStudentAge(20);

		Student s2 = new Student();
		s2.setStudentId(202);
		s2.setStudentName("Nick");
		s2.setStudentSkill("Python");
		s2.setStudentAge(22);

		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);

		ObjectMapper mapper = new ObjectMapper();
		String studentsJson = mapper.writerWithDefaultPrettyPrinter()
									.writeValueAsString(slist);
		System.out.println(studentsJson);
	}

	public static void convertStudentObjToJson() throws JsonProcessingException {
		Student s = new Student();
		s.setStudentId(201);
		s.setStudentName("John");
		s.setStudentSkill("Java");
		s.setStudentAge(20);

		ObjectMapper mapper = new ObjectMapper();
		// String jsonString = mapper.writeValueAsString(s);
		String jsonString = mapper.writerWithDefaultPrettyPrinter()
								  .writeValueAsString(s);

		System.out.println(jsonString);
	}
}
