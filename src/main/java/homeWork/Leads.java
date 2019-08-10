package homeWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
		driver.findElementByXPath("(//a/img[@src='/images/fieldlookup.gif'])[1]").click();
		//first id
		driver.findElementByName("id").sendKeys("10128");
		driver.findElementByXPath("(//button[@type='button'])[1]").click();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		//second id
		driver.findElementByName("id").sendKeys("10129");
		driver.findElementByXPath("(//button[@type='button'])[1]").click();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElementByLinkText("Find Leads").click();
		
		
		
		
		
		
		


	}

}
