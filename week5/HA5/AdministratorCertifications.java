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