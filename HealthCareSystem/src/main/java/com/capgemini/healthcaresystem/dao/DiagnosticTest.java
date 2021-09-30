package com.capgemini.healthcaresystem.dao;

import java.util.Set;

public class DiagnosticTest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@NotBlank(message = "Please Include a Test Name")
	String testName;
	@NotBlank(message = "Please Include price of the test")
	Double testPrice;
	String normalValue;
	String units;

	//Many to many with diagnostic center
	
	Set<DiagnosticCenter> diagnosticCenters;
}

