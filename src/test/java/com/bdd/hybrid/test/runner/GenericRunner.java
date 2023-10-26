package com.bdd.hybrid.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(features = { "classpath:featurefile/getOrder_API.feature" }, glue = { "classpath:com.cucumber.test.stepdefinition"}, plugin = { "pretty", "json:target/output.json", monochrome = true, tags = {
						"@Api" })


public class GenericRunner extends AbstractTestNGCucumberTests {

	@AfterClass(alwaysRun = true)
	public static void writeExtentReport() throws InterruptedException {
		Object ReporterUtil = null;
		ReporterUtil.notify();
	}

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	
}
