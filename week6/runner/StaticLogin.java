package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/StaticLogin.feature",
glue="stepDefinition",
monochrome=true,
publish=true,
//tags="@smoke")
//tags="@smoke or @sanity")
//tags="@sanity and @smoke")
//tags="not @sanity")
tags="@smoke and @regression or @sanity")

public class StaticLogin extends AbstractTestNGCucumberTests{

}
