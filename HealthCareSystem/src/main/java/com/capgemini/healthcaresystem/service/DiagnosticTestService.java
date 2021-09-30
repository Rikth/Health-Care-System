package com.capgemini.healthcaresystem.service;

import java.util.List;

public interface DiagnosticTestService {
	List<DiagnosticTest> getAllTest();
	DiagnosticTest addNewTest(DiagnosticTest test);
	List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);
	DiagnosticTest updateTestDetail(DiagnosticTest test);
	DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test);
}
