package class9.day9.TestNG;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class createLead extends ProjectSpecificMethods{

@DataProvider(name="fetchData")
public Object[][] setUpData()
		{
	Object[][] data= new Object[2][3];
	//1st row
	data[0][0]="testleaf";
	data[0][1]="Gokulapriya";
	data[0][2]="K";
	//2nd row
	data[1][0]="testleaf";
	data[2][1]="Sarankumar";
	data[3][2]="O";
	return data;
		}

	@Test(dataProvider="fetchData")
	public void runcreateLead(String Cname, String fN, String lN) throws InterruptedException {
		//click Lead
		driver.findElementByLinkText("Leads").click();
		//Click CreateLead
		driver.findElementByLinkText("Create Lead").click();
		//Enter fields
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fN);
		driver.findElementById("createLeadForm_lastName").sendKeys(lN);
		
		
//Click 
		driver.findElementByClassName("smallSubmit").click();
		/*WebElement drop = driver.findElementById("createLeadForm_marketingCampaignId");
		Select down = new Select(drop);
		List<WebElement> listOfDrop = down.getOptions();
		int size = listOfDrop.size();
		down.selectByIndex(size-1);
		WebElement dropTwo = driver.findElementById("createLeadForm_industryEnumId");
		Select downTwo = new Select(dropTwo);
		downTwo.selectByVisibleText("Aerospace");
		*/
		}

	}
