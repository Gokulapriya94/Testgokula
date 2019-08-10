package classWork8.day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver =  new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("gokulak84@gmail.com");
		driver.findElementById("pass").sendKeys("gokula@1994");
		driver.findElementByXPath("//input[@type=\"submit\"]").click();
		
		
		// search testleaf
		driver.findElementByXPath("(//input[@placeholder=\"Search\"])[1]").sendKeys("Testleaf");
		driver.findElementByXPath("(//button[@type=\"submit\"])[1]").click();
		
		Thread.sleep(7000);
		// link text
		boolean displayed = driver.findElementByLinkText("TestLeaf").isDisplayed();
		System.out.println("displayed :  "+displayed);
		Thread.sleep(7000);
//		String text = driver.findElementByXPath("(//a[text()='TestLeaf']/following::button[1]").getText();
//		//String text1 = driver.findElementByXPath("(//button[text()='Liked'])[1]").getText();
//		if(text.equalsIgnoreCase("Like"))
//		{
//			System.out.println(text);
//			driver.findElementByXPath("(//a[text()='TestLeaf']/following::button[1]").click();
//			
//		}
//		else if (text.equalsIgnoreCase("Liked"))
//		{
//			System.out.println(text);
//			System.out.println("already liked");
//			
//		}
//		
		driver.findElementByXPath("(//a[text()='TestLeaf']/following::button[1]").click();
		String Likecount = driver.findElementByXPath("(//div[@class='clearfix _ikh'])[2]//div[2]/div").getText();
		System.out.println("Number of Like is: "+Likecount);
		
		driver.close();
		
		
		
		
	// capture Like
		//driver.findElementByXPath("//div[2][text()='Places']").click();

	}

}
