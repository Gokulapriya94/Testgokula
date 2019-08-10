package class9.day9.TestNG;

import org.testng.annotations.Test;

public class editLead extends ProjectSpecificMethods{

	@Test
	public void runeditLead() throws InterruptedException {
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
		
		//Click on first resulting lead and verify title of the page
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		/*String val= driver.findElementByXPath("//div[text()='View Lead']").getText();
		System.out.println(val);
		String val1= "View Lead";*/

		if (title.contains("View Lead")) {
		System.out.println("Title of the page is verified");
		}
		else {
		System.out.println("Title of the page does not match");
		}
		
		
		
	//Click on Edit button,change the company name and click update
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		String comp = "Accenture";
		driver.findElementById("updateLeadForm_companyName").sendKeys(comp);
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		
		//Verify the changed company name appears
		String comp_name = driver.findElementByXPath("//span[text()='Company Name']/following::span").getText();
		if (comp_name.contains(comp)) {
		System.out.println("Company name is updated to "+comp);
		}
		else {
		System.out.println("Company name is not updated");
		}
		
		
		//Close browser
//		driver.close();
		
		}
		
		
		}

