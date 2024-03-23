package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead_Leaftaps extends BaseClass_Hooks{

/*@Given("Launch the browser and load the leaftaps url")
public void precond() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--disable-notifications");
	//op.addArguments("--headless");
	op.addArguments("--start-maximized");
	driver = new ChromeDriver(op);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}*/
@When("Enter the Username as {string}")
public void leafUsername(String leafUser) {
	driver.findElement(By.id("username")).sendKeys(leafUser);	
}
@And("Enter the Password as {string}")
public void leafPassword(String leafPswd) {
	driver.findElement(By.id("password")).sendKeys(leafPswd);	
}
@And("Click on Login button")
public void loginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();	
}
@Then("Homepage should be displayed")
public void leafHomepage() {
	String title = driver.getTitle();
	if (title.contains("Automation ")) {
		System.out.println("Login successfully");
	} else
	{System.out.println("Login unsuccessful");
	}	
}
@And("Click on CRM-SFA link")
public void crmsfaLink() {
	driver.findElement(By.linkText("CRM/SFA")).click();	
}
@And("Click on Leads link")
public void leadsLink() {
	driver.findElement(By.linkText("Leads")).click();	
}
@When("Click on CreateLead link")
public void createLeadlink() {
	driver.findElement(By.linkText("Create Lead")).click();	
}
@And("Enter the Company name as {string}")
public void leafCompanyName(String leafCo) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(leafCo);	
}
@And("Enter the Firstname as {string}")
public void leafFirstname(String leafFname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(leafFname);	
}
@And("Enter the Lastname as {string}")
public void leafLastname(String leafLname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(leafLname);	
}
@And("Enter the Phonenumber as (.*)$")
public void leafPhone(String leafPh) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(leafPh);	
}
@And("Click on Submit button")
public void leafSubmit() {
	driver.findElement(By.name("submitButton")).click();	
}
@Then("Verify Lead created successfully or not")
public void verifyLeadCreation() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("testleaf")) {
	System.out.println("Lead created successfully");
	}
	else {
	System.out.println("Lead is not created");
	}	
}
}
