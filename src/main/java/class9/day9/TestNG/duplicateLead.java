package class9.day9.TestNG;

import org.testng.annotations.Test;

	public class duplicateLead extends ProjectSpecificMethods{

		@Test
		public void runduplicateLead() throws InterruptedException {
			
//			login();
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
			
			//Capture name of First resulting lead and Click on first resulting lead
			String name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a[1]").getText();
			
			System.out.println(name);
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
			Thread.sleep(2000);
			
			//Click Duplicate lead
			driver.findElementByLinkText("Duplicate Lead").click();
			Thread.sleep(3000);
			
			//Verify title as duplicate lead
			String title = driver.getTitle();
			if (title.contains("Duplicate Lead")) {
			System.out.println("Title page is verified");
			}
			else {
			System.out.println("Title page mismatch");
			}

			//Click create lead
			driver.findElementByXPath("//input[@value='Create Lead']").click();
			Thread.sleep(3000);
			//Confirm duplicate lead name is same as captured name
			String duplicate_name = driver.findElementById("viewLead_firstName_sp").getText();
			
			if (duplicate_name.contains(name)) {
			System.out.println("Duplicate lead name is same as captured name");
			}
			else {
			System.out.println("Duplicate lead name does not match with the captured name");
			}
			
			//Close browser
//			driver.close();		
			
}
	}
