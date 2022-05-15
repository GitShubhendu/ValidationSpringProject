package com.mvc.student;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Student {
	
	private String studentFirstName;

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String studentLastName;
	private String country;
	private String degree;
	private LinkedHashMap<String, String> degreeOption;
	private String sex;
	private String operatingSystem;
	public Student()
	{
		degreeOption =new LinkedHashMap<String, String>();
		degreeOption.put("B.Tech", "Bechlor in technology");
		degreeOption.put("M.Tech", "Master in technology");
		degreeOption.put("BCA", "Bechlor in computer application");
		degreeOption.put("MCA", "Master in computer application");
		
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public LinkedHashMap<String, String> getDegreeOption() {
		return degreeOption;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}	
	
}
