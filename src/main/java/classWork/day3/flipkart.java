package classWork.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.TableWidthType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/"); 
		driver.manage().window().maximize();
		//close the popup
		
		driver.findElementByXPath("//button[text()='✕']").click();
	//Mouse over home and furniture
		WebElement homeAndFurniture = driver.findElementByXPath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]");
		///Mouse Action
		Actions builder = new Actions(driver);
		builder.moveToElement(homeAndFurniture).perform();
	     WebElement painting = driver.findElementByLinkText("Paintings");
	     builder.click(painting).perform();
		//driver.close();
		
		
		
	}

}
