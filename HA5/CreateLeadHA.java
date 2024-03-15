package week5.HA5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadHA extends ProjectSpecificMethod{
	@Test
	public void leadCreate() throws InterruptedException{
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
********************************************************************************************
	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" thread-count="5" parallel="tests" verbose="5">
<parameter name="url" value="http://leaftaps.com/opentaps/control/main"></parameter>
<parameter name="username" value="Demosalesmanager"></parameter>
<parameter name="password" value="crmsfa"></parameter>
  <test name="Test1">
    <classes>
      <class name="week5.HA5.CreateLeadHA"/>
    </classes>
  </test> <!-- Test -->
  <test name="Test2">
    <classes>
      <class name="week5.HA5.EditLeadHA"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

