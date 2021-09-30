package com.capgemini.healthcaresystem.repository;

import java.util.List;

import com.capgemini.healthcaresystem.dao.DiagnosticTest;

public class DiagnosticTestRepository {
	List<DiagnosticTest> getAllTest();
	DiagnosticTest addNewTest(DiagnosticTest test);
	List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);
	DiagnosticTest updateTestDetail(DiagnosticTest test);
	DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test);
}
