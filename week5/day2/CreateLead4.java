package week5.day2;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead4 extends BaseClass4{
@DataProvider(name="getData")
public String [][] sendData() throws IOException{
/*public String [][] sendData(){
String [][] data=new String[3][4];
data[0][0]="Company1"; data[0][1]="femp1"; data[0][2]="lemp1"; data[0][3]="97";
data[1][0]="Company2"; data[1][1]="femp2"; data[1][2]="lemp2"; data[1][3]="98";
data[2][0]="Company3"; data[2][1]="femp3"; data[2][2]="lemp3"; data[2][3]="99";
return data;*/
//static method - w/out obj we can call that method
//classname.method()
return ReadFromExcel.excelData();
}
		
	@Test(dataProvider="getData")
	public void leadCreate2(String cName, String fName, String lName, String ph) {
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