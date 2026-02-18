package com.omrbranch.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonFile) {
		Configuration configuration = new Configuration(new File("F:\\SelfCucumber\\CucumberGrocery\\target"),
				"FaceBook Login Validation");
		configuration.addClassifications("Author", "Kishore");
		configuration.addClassifications("OS", "Windows OS");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "12.3");

		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}
}
