package class9.day9.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mergeLead extends ProjectSpecificMethods{

		@Test
		public void runMergeLead() throws InterruptedException {
		//	login();
		//Click MergeLeads
		driver.findElementByLinkText("Merge Leads").click();
		Thread.sleep(3000);
		//Click on first icon on merge leads page
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		//switch to second window
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		String secwin = list.get(1);
		String firwin = list.get(0);
		
		driver.switchTo().window(secwin);
		Thread.sleep(2000);
		
		
		//Enter first name and click find leads button
		driver.findElementByXPath("(//input[@name='firstName'])").sendKeys("A");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		//Click on the resulting below
		String from = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
	driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		//Switch to parenting window
		driver.switchTo().window(firwin);
		Thread.sleep(1000);
		//Click on To icon
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Thread.sleep(1000);
		//switch to second window
		Set<String> handles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(handles1);
		String secwin1 = list1.get(1);
		String firwin1 = list1.get(0);
		
		driver.switchTo().window(secwin1);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='firstName'])").sendKeys("A");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
		String to = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		
		
		
		//Switch to parenting window
		driver.switchTo().window(firwin1);
		Thread.sleep(1000);
		//Click merge button
		driver.findElementByLinkText("Merge").click();
		
		//Click on alert box
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Click on Find Leads and enter captured lead id and click find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").clear();
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(from);
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//Verify No record appears
		boolean displayed = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		
		if (displayed=true){
		System.out.println("No Records to display");
		
		}
		else {
		System.out.println("Records loaded");
		}

			
	}

}
