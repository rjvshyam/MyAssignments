package week4.HA4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSnapdeal {

public static void main(String []args) throws InterruptedException, IOException {

WebDriverManager.chromedriver().setup();
ChromeDriver drv = new ChromeDriver();
drv.get("https://www.snapdeal.com/");
drv.manage().window().maximize();
drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement mensTab = drv.findElement(By.className("catText"));
Actions act = new Actions(drv);
act.moveToElement(mensTab).perform();
/**for disappearing element follow: Sources-> Event Listener Breakpoints-> Mouse-> mousedown in Chrome
(or) Type command + shift + P (OSX) or control + shift + P (Windows) in Elements tab
Type the word focused->Select Emulate a focused page from the the menu
Now clicking around in the console will not close the element.*/
WebElement sportsShoes = drv.findElement(By.xpath("(//div[@class='colDataInnerBlk']//span[text()='Sports Shoes'])[1]"));
act.moveToElement(sportsShoes).click().perform();
String totalCount = drv.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
System.out.println("Sports Shoes for Men count :"+totalCount);
drv.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
Thread.sleep(3000);
drv.findElement(By.className("sort-selected")).click();
drv.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
//check if displayed items are sorted correctly
WebElement startPrice = drv.findElement(By.name("fromVal"));
startPrice.clear();
startPrice.sendKeys("599");
WebElement toPrice = drv.findElement(By.name("toVal"));
toPrice.clear();
toPrice.sendKeys("700");
drv.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
Thread.sleep(5000);
WebElement color = drv.findElement(By.xpath("//a[contains(text(),'White & Blue')]"));
Actions act1 = new Actions(drv);
act1.moveToElement(color).click().perform();
String filterPrice = drv.findElement(By.xpath("//div[@class='navFiltersPill']//a[contains(text(),'Rs')]")).getText();
if (filterPrice.contains("Rs. 599 - Rs. 700")) {
	System.out.println("Selected price range was Rs. 599 - Rs. 700");
}
String filterColor = drv.findElement(By.xpath("//div[@class='navFiltersPill']//a[contains(text(),'White')]")).getText();
if (filterColor.contains("White & Blue")) {
	System.out.println("Selected color was White & Blue");
}
WebElement firstImage = drv.findElement(By.xpath("//picture[@class='picture-elem']//img"));
Actions act2 = new Actions(drv);
act2.moveToElement(firstImage).perform();
drv.findElement(By.xpath("//div[@class='clearfix row-disc']/div[contains(text(),'Quick View')]")).click();
/*Set<String> windowHandles = drv.getWindowHandles();
List<String> window = new ArrayList<String>(windowHandles);
drv.switchTo().window(window.get(1));*/
//script works without window handling
String leastPrice = drv.findElement(By.className("payBlkBig")).getText();
System.out.println("Least priced shoe was :"+leastPrice);
String discount = drv.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
System.out.println("With discount percentage :"+discount);
WebElement imageShot = drv.findElement(By.xpath("//div[@class='bx-viewport']//img[@class='cloudzoom']"));
File src = imageShot.getScreenshotAs(OutputType.FILE);
File dst = new File("./Snapshot/img.png");
FileUtils.copyFile(src, dst);
drv.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
//drv.switchTo().window(window.get(0));
drv.quit();

}
}
