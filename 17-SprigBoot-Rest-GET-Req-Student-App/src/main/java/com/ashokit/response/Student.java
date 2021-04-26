package com.ashokit.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class Student {

	@JsonProperty("student-id")
	private Integer studentId;

	@JsonProperty("student-name")
	private String studentName;

	@JsonProperty("student-skill")
	private String studentSkill;

}
