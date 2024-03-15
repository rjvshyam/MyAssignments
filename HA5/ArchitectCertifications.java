package week5.HA5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ArchitectCertifications extends BaseSalesforceHA{
@Test
public void archCert() {

driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
String archText = driver.findElement(By.xpath("(//div[@class='cert-whatIs-card-body']/div)[2]")).getText();
System.out.println("(Summary) of Salesforce Architect :"+archText);
String archCert1 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[1]")).getText();
System.out.println("Salesforce Architect Certification one :"+archCert1);
String archCert2 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[2]")).getText();
System.out.println("Salesforce Architect Certification two :"+archCert2);
String archCert3 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[3]")).getText();
System.out.println("Salesforce Architect Certification three :"+archCert3);
String archCert4 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[4]")).getText();
System.out.println("Salesforce Architect Certification four :"+archCert4);
String archCert5 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[5]")).getText();
System.out.println("Salesforce Architect Certification five :"+archCert5);
String archCert6 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[6]")).getText();
System.out.println("Salesforce Architect Certification six :"+archCert6);
String archCert7 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[7]")).getText();
System.out.println("Salesforce Architect Certification seven :"+archCert7);
String archCert8 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[8]")).getText();
System.out.println("Salesforce Architect Certification eight :"+archCert8);
String archCert9 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[9]")).getText();
System.out.println("Salesforce Architect Certification nine :"+archCert9);
String archCert10 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[10]")).getText();
System.out.println("Salesforce Architect Certification ten :"+archCert10);
String archCert11 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[11]")).getText();
System.out.println("Salesforce Architect Certification eleven :"+archCert11);
String archCert12 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[12]")).getText();
System.out.println("Salesforce Architect Certification twelve :"+archCert12);
driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[1]")).click();
String list1 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[1]")).getText();
System.out.println("List certificate one :"+list1);
String list2 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[2]")).getText();
System.out.println("List certificate two :"+list2);
String list3 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[3]")).getText();
System.out.println("List certificate three :"+list3);
String list4 = driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[4]")).getText();
System.out.println("List certificate four :"+list4);
}

}
