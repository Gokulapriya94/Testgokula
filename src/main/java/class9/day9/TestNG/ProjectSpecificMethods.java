package class9.day9.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
/*	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");

	}
	@BeforeTest
	 public void beforeTest() {
		System.out.println("Before Test");

	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}*/
	
	
	@BeforeMethod

	public void login(String url,String username,String password) {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("http://leaftaps.com/opentaps");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		
	}
	/*@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");

	}
*/
	}
