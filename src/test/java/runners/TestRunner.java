package runners;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import constants.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features",// path to feeture files
glue={"stepDefinitions"}, // path to step definition
tags = {"@TekSchoolTest"},  // tags to run on feature level or scenario lever
dryRun = false,  // check  if all feature files has step definiton in step definition 
monochrome = true,  // display the console output in readable way
strict = false, // if set to false will fail if there are pending or undefined steps
format  = {"html: target", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
	     Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));

	 }
}
