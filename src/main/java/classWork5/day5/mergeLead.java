package classWork5.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt=\"Lookup\"])[1]").click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
       Set<String> windowHandle2 = driver.getWindowHandles();
		System.out.println(windowHandle2);
		//it will show first window tile not the second window title
		System.out.println(driver.getTitle());
		// inorder to get the second window title we are using list. 
		//set will implement list to access it
		
		List<String> list = new ArrayList<String>(windowHandle2);
		String secondWin=list.get(1);
		String firstWin=list.get(0);
		System.out.println(secondWin);

		//How to know i got 2nd window
		System.out.println(windowHandle2.size());
		System.out.println("Title "+driver.getTitle());
		
		driver.switchTo().window(secondWin);
		System.out.println("second window title:"+driver.getTitle());
		driver.findElementByXPath("(//input[contains(@class,'x-form-text x-form-field')])[2]").sendKeys("a");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("working");
		Thread.sleep(1000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
        driver.switchTo().window(firstWin);
		System.out.println("current title:"+driver.getTitle());
		
		
	}

}
