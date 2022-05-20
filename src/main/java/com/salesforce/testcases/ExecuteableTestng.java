package com.salesforce.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ExecuteableTestng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlSuite suite = new XmlSuite();
		// Assign suite name
		suite.setName("Suite");

		XmlTest test = new XmlTest(suite);
		// Assign Test name
		test.setName("Test");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		// add all the testng classes
		classes.add(new XmlClass("com.salesforce.testcases.TC001_CreateOpportunity"));
		test.setXmlClasses(classes);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		// add suites to be executed
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();

	}

}
