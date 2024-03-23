package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass{
	
@When("Click on CRMSFA link")
public void clickCRMSFAlink() {
	driver.findElement(By.linkText("CRM/SFA")).click();	
}
@And("Click on Leads link")
public void clickLeadslink() {
	driver.findElement(By.linkText("Leads")).click();	
}
@And("Click on CreateLead link")
public void clickCreateLeadlink() {
	driver.findElement(By.linkText("Create Lead")).click();	
}
@And("Enter CompanyName as {string}")
public void enterCompanyName(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
}
@And("Enter FirstName as {string}")
public void enterFirstName(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
}
//to accept both stirng and integer then we have to use (.*)$
@And("Enter LastName as (.*)$")
public void enterLastName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
}
@And("Click on Submit button")
public void clickSubmit() {
	driver.findElement(By.name("submitButton")).click();
}
@Then("ViewLeads page should be displayed")
public void viewLeads() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
	System.out.println("Lead created successfully");
	}
	else {
	System.out.println("Lead is not created");
	}
}


}
