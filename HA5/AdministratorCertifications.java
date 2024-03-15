package week5.HA5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdministratorCertifications extends BaseSalesforceHA{
@Test
public void adminCert() {
driver.findElement(By.xpath("//div[@class='credentials-card_title']/a[text()='Administrator']")).click();
String text = driver.findElement(By.xpath("//div[@class='certification-banner-text']//div[text()='Administrator']")).getText();
if (text.equalsIgnoreCase("Administrator")); {
System.out.println("Administrator page successfully loaded :"+text);}
String cert1Name = driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']/a)[1]")).getText();
System.out.println("Administrator Certificate one :"+cert1Name);
String cert2Name = driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']/a)[2]")).getText();
System.out.println("Administrator Certificate two :"+cert2Name);
String cert3Name = driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']/a)[3]")).getText();
System.out.println("Administrator Certificate three :"+cert3Name);
}

}

********************************************************************************************************************************************************************
  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" verbose="5">
<parameter name="url" value="https://login.salesforce.com/"></parameter>
<parameter name="username" value="gokul.sekar@testleaf.com"></parameter>
<parameter name="password" value="Leaf@123"></parameter>
  <test name="Test1">
<parameter name="browser" value="chrome"></parameter>
    <classes>
      <class name="week5.HA5.AdministratorCertifications"/>

    </classes>
  </test> <!-- Test -->
  <test name="Test2">
<parameter name="browser" value="edge"></parameter>
    <classes>
      <class name="week5.HA5.ArchitectCertifications"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
