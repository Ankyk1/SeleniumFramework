package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepsDemo2_POM {
	
//	WebDriver driver = null;
//	LoginPage login;
//	
//	@SuppressWarnings("deprecation")
//	
//	
//	
//	@Given("user is on login test page")
//	public void user_is_on_login_test_page() {
//		
//		System.out.println("DEMO2_POM");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
//		driver.manage().window().maximize();
//		driver.navigate().to("https://example.testproject.io/web");		
//		
//	    
//	}
//
//	@When("^user enters the (.*) and (.*)$")
//	public void user_enters_the_username_and_password(String username, String password) {
//		login = new LoginPage(driver);
//		
//		login.enterUser(username);
//		login.enterPassword(password);
//		
//	    
//	}
//
//	@And("clicks on the login button")
//	public void clicks_on_the_login_button() {
//		
//		login.clickBtn();
//	    
//	}
//
//	@Then("user should be nevigated to nextpage")
//	public void user_should_be_nevigated_to_nextpage() throws InterruptedException {
//		
//		login.chkLogout();
//		Thread.sleep(2500);
//		driver.close();
//		driver.quit();
//	    
//	}

}
