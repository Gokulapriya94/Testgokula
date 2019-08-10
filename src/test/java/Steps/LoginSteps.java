package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void open_the_Chrome_Browser() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();   
	 
	}

	@Given("Maximise the Browser")
	public void maximise_the_Browser() {
	    
		driver.manage().window().maximize();
		
	}

	@Given("Set the Timeouts")
	public void set_the_Timeouts() {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Given("Load the URL")
	public void load_the_URL() {
	    
		driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the Username as DemoSalesManager")
	public void enter_the_Username_as_DemoSalesManager() {
	    driver.findElementById("username").sendKeys("Demosalesmanager");
	    
	}

	@Given("Enter the Password as crmsfa")
	public void enter_the_Password_as_crmsfa() {
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	}

	@When("User Click on the Login Button")
	public void user_Click_on_the_Login_Button() {
		driver.findElementByClassName("smallSubmit").click();
	    
	}

	@Then("Verify Login is success")
	public void verify_Login_is_success() {
		System.out.println("Logged in successfully");
	    
	}

	@But("Verify Login is Failed")
	public void Verify_Login_is_Failed() {
		System.out.println("Login Failed");
	}


}
