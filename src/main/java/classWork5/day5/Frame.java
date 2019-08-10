package classWork5.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
//		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Gokulapriya");
		alert.accept();
		String check = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(check);
		if (check.contains("Gokulapriya"))
		{
			System.out.println("name is present");
		}
		else
		{
			System.out.println("not matcing");
		}
		
		
		

	}

}
