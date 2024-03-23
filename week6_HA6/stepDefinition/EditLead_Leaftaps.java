package stepDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead_Leaftaps extends BaseClass_Hooks{

	@When("Click on FindLeads link")
	public void click_on_find_leads_link_for_edit() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Enter the phone number as {string}")
	public void enter_the_phone_number_as(String phNo) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
	}
	@And("Click on FindLeads button")
	public void click_on_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@And("Click on Founded Lead")
	public void click_on_founded_lead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@And("Click on Edit button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Change the Company Name as HCL")
	public void change_the_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HCL");
	}
	@Then("Click on Edit Submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}


}
