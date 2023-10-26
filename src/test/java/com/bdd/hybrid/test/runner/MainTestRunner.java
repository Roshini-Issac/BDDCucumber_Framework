package com.bdd.hybrid.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;



//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


                                                                             

@CucumberOptions(features = { "classpath:featurefile" }, glue = { "classpath:com.test.stepdefinition",
		"classpath:com.inspire.brands.helper" }, plugin = { "pretty", "json:target/Output.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, tags = {
						"@UI","@Api"})

//tags = {	"@Api","@UI8876"})

public class MainTestRunner extends AbstractTestNGCucumberTests {

	@AfterClass(alwaysRun = true)
	public static void writeExtentReport() {
		Object ReporterUtil = new Object();
		ReporterUtil.notify();
	
	}

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}
