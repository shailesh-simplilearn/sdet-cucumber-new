package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\shailesh.gohel\\eclipse-workspace\\cucumber-project\\src\\test\\resources\\Features",
		glue = {"stepDefination"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)
public class TestRunner {
	
	@AfterClass
	public static void writeReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	}
	
}
