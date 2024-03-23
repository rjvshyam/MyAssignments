package stepDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead_Leaftaps extends BaseClass_Hooks{

	@And("Copy the LeadID")
	public String getLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		return leadID;
	}
	@And("Click on Delete button")
	public void click_on_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@And("Click on FindLeads link again")
	public void click_on_find_leads_link_again() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Enter the deleted Lead ID")
	public void enter_the_deleted_lead_id() {
		DeleteLead_Leaftaps obj = new DeleteLead_Leaftaps();
		String leadID = obj.getLeadID();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@And("Click on FindLeads button again")
	public void click_on_find_leads_button_again() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Verify Lead is deleted or not")
	public void verify_lead_is_deleted_or_not() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
