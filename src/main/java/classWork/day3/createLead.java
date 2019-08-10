package classWork.day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dd = new Select(source);
		List<WebElement> alloptions = dd.getOptions();
		int size = alloptions.size();
		dd.selectByIndex(size-1);
	WebElement source1 = driver.findElementById("createLeadForm_industryEnumId");
		
		Select dd1 = new Select(source1);
		dd1.getOptions().get(3).click();
		
		
		
		

	}

}
