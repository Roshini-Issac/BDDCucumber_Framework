package com.bdd.hybrid.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(features = { "classpath:featurefile/Fetch_Book_Details_Get_Api.feature" }, glue = { "classpath:com.cucumber.uvs.ecom.test.stepdefinition",
		"classpath:com.cucumber.uvs.ecom.helper" }, plugin = { "pretty", "json:target/UVSEComm.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, tags = {
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
