package class9.day9.TestNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class deleteLead extends ProjectSpecificMethods{

	@Test
	public void rundeleteLead() throws InterruptedException {
//		login();
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		
		//Click email and enter email id
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(" ");
		
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Add sleep 5000 ms
		Thread.sleep(5000);
		
		//Capture lead ID of First resulting lead and Click on first resulting lead
		String Lead_ID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println(Lead_ID);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(2000);
		//Click Delete
		driver.findElementByLinkText("Delete").click();
		
		//Click on Find Leads and enter captured lead id and click find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").clear();
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(Lead_ID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//Verify No record appears
		boolean displayed = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		
		if (displayed=true){
		System.out.println("No Records to display");
		
		}
		else {
		System.out.println("Records loaded");
		}
		//Close browser
//		driver.close();

		}

	}

