package week5.HA5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead2D_HA extends BaseClass2D{
@DataProvider(name="getData")	
public String [][] twoDarray() throws IOException {
/*public String [][] twoDarray()
String [][] array = new String[3][4];
array[0][0]="1Company"; array[0][1]="1firstName"; array[0][2]="1lastName"; array[0][3]="96";	
array[1][0]="2Company"; array[1][1]="2firstName"; array[1][2]="2lastName"; array[1][3]="97";
array[2][0]="3Company"; array[2][1]="3firstName"; array[2][2]="3lastName"; array[2][3]="98";
*/
return DataFromExcel_HA.xlData();
}
	@Test(dataProvider="getData")
	public void leadCreate2D(String cName, String fName, String lName, String ph) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
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
