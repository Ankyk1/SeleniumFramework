package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;
import pageFactory.homePage_PF;

public class LoginStepsDemo_PF {
	
	WebDriver driver = null;
	
	LoginPage_PF login;
	homePage_PF home;
	
	@SuppressWarnings("deprecation")
	
	@Given("user is on login test page")
	public void user_is_on_login_test_page() {
		
		System.out.println("in page factory session comment for git");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web");		
		
	    
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username, String password) {
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	    
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		
		login.clickLogin();
		
		
	    
	}

	@Then("user should be nevigated to nextpage")
	public void user_should_be_nevigated_to_nextpage() throws InterruptedException {
		home = new homePage_PF(driver);
		home.chkLogout();
		Thread.sleep(2500);
		driver.close();
		driver.quit();
	    
	}

}
