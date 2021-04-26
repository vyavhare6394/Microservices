package com.ashokit.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@XmlElement(name = "student-id")
	private Integer id;

	@XmlAttribute
	private String standard;

	@XmlElement(name = "student-name")
	private String name;

	@XmlElement(name = "student-rank")
	private Integer rank;

}
