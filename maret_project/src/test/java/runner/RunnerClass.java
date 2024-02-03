package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Vasanthakumar\\eclipse-workspace\\maret_project\\src\\test\\resources\\featureFiles\\maret_login.feature",
                 glue="stepDefinitions",
                 dryRun =false,
                 plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:report/WebReport.html" ,"json:report/jsonreport.json"} )

public class RunnerClass {
	

}