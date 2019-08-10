package classWork.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.TableWidthType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		//Thread.sleep(5000);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB,Keys.TAB);
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		
		//wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Find no.of.column
		 WebElement table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		 List<WebElement> column = table.findElements(By.tagName("td"));
		 System.out.println(column.size());
	//find no of rows
		 Thread.sleep(5000);
		 WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		 List<WebElement> rows = table1.findElements(By.tagName("tr"));
		 int i = rows.size();
		 System.out.println(i);
		 
		 //last train number
		 
		 WebElement lastnum = table1.findElements(By.tagName("tr")).get(i-1);
		 String show = lastnum.findElements(By.tagName("td")).get(0).getText();
		 System.out.println(show);
		 
		 
		 
		//driver.close();
		
		
		
	}

}
