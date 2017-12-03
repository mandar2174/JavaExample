package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee {
	private String employee_name;
	private String employee_country;
	private int employee_age;

	public Employee(String ename, String ecountry, int eage) {
		employee_name = ename;
		employee_country = ecountry;
		employee_age = eage;

	}

	public String getEmployee_name() {
		return employee_name;
	}

	public String getEmployee_country() {
		return employee_country;
	}

	public int getEmployee_age() {
		return employee_age;
	}

}

public class ClassToJsonExample {

	public static void main(String[] args) throws JsonGenerationException,
			JsonMappingException, IOException {

		// initialize java class and print value
		Employee emp = new Employee("Mandar", "India", 26);
		System.out.println("Employee name : " + emp.getEmployee_name());
		System.out.println("Employee Country : " + emp.getEmployee_country());
		System.out.println("Employee Age : " + emp.getEmployee_age());

		// convert java class to json object
		ObjectMapper mapper = new ObjectMapper();

		String jsonOutputFileName = "/home/mandar/ProjectWorkspace/JavaExample/src/main/resources/employee.json";
		// Object to JSON in file
		mapper.writeValue(new File(jsonOutputFileName), emp);
		System.out.println("Created json file in following location : " +jsonOutputFileName );
	}
}
