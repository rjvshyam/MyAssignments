package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass_Hooks;

//without hooks
/*@CucumberOptions(features="src/test/java/features/createLead.feature",
glue="stepDefinition",
monochrome=true,
publish=true)

public class LeafCerateLead extends AbstractTestNGCucumberTests{

}*/

//with hooks

@CucumberOptions(features="src/test/java/features/createLead.feature",
glue="stepDefinition",
monochrome=true,
publish=true)

public class LeafCerateLead extends BaseClass_Hooks{

}

