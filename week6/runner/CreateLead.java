package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature",//if we mention upto package then all classes under it will run
glue="stepDefinition",
monochrome=true,
publish=true
)


public class CreateLead extends AbstractTestNGCucumberTests{

}
