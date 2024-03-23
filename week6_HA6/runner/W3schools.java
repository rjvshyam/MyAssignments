package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/w3schools.feature",
glue="stepDefinition",
monochrome=true,
publish=true)

public class W3schools extends AbstractTestNGCucumberTests{

}
