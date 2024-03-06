package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailTable {

public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("mas");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
	driver.findElement(By.id("chkSelectDateOnly")).click();
	//1st row&col
	String text1 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td")).getText();
	System.out.println(text1);
	//specific row
	String text2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[4]/td[4]")).getText();
	System.out.println(text2);
	//all rows
	List<WebElement>rowCount=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
	int rowSize = rowCount.size();
	System.out.println(rowSize);
	List<WebElement>colCount=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
	int colSize = colCount.size();
	System.out.println(colSize);
	List<String> trainNames =new ArrayList<String>();
	for (WebElement element : colCount) {
		trainNames.add(element.getText());
			}
	System.out.println("Train names :"+trainNames);
	int numberOfTrains = trainNames.size();
	Set<String> removeDup = new HashSet<String>(trainNames);
	System.out.println("No. of trains :"+numberOfTrains);
	System.out.println("After dup removal :"+removeDup.size());
	
	
	
	//print all rows
	/*for (int i=2; i<=rowSize; i++) {
	for (int j=2; j<=colSize; j++) {
	String allData = driver.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.println(allData);
	}
	
	}*/
}
}
//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]