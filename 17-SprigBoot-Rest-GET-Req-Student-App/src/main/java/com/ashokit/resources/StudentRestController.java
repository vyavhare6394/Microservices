package com.ashokit.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.response.Student;
import com.ashokit.response.Students;

@RestController
public class StudentRestController {

	@GetMapping(
			value = "/student/{sid}",
			produces= {
					"application/json",
					"application/xml"
			}
	)
	public Student getStudentDetails(@PathVariable("sid") Integer studentId) {
		Student s = new Student();
		if (studentId == 101) {
			s.setStudentId(101);
			s.setStudentName("Raju");
			s.setStudentSkill("Java");
		} else if (studentId == 102) {
			s.setStudentId(102);
			s.setStudentName("Rani");
			s.setStudentSkill("Testing");
		}
		return s;
	}

	@GetMapping(
			value = "/students",
			produces = {
					"application/json",
					"application/xml"
			}
	)
	public Students getStudentsDetails() {
		List<Student> slist = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Raju");
		s1.setStudentSkill("Java");
		
		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Rani");
		//s2.setStudentSkill("Testing");
		
		slist.add(s1);
		slist.add(s2);
		
		Students students = new Students();
		students.setStudents(slist);

		return students;
	}
}
