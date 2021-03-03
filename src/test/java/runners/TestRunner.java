package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/functionaltests",
		glue= {"stepdefinitions","hooks"},
		monochrome=true,
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)

public class TestRunner extends AbstractTestNGCucumberTests{

	@Test
	public void test() {

	}

}
