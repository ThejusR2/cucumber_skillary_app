package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Skillrary/login.feature"},glue = {"cucumber2"})
public class test_runner_skillrary extends AbstractTestNGCucumberTests {
	

}
