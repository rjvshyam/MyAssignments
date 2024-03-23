package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/Login.feature",
glue="stepDefinition",
monochrome=true,//will remove junk values
publish=true)//will publish report

//setx /M CUCUMBER_PUBLISH_TOKEN "some-secret-token"

public class Login extends AbstractTestNGCucumberTests{
	
	

}
