package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepsDemo {
	
	WebDriver driver = null;
	
	//@SuppressWarnings("deprecation")
	
//	@Given("user is on login test page")
//	public void user_is_on_login_test_page() {
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
//		
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//	    
//	}
//
//	@And("clicks on the login button")
//	public void clicks_on_the_login_button() {
//		
//		driver.findElement(By.id("login")).click();
//	    
//	}
//
//	@Then("user should be nevigated to nextpage")
//	public void user_should_be_nevigated_to_nextpage() throws InterruptedException {
//		
//		driver.findElement(By.id("logout")).isEnabled();
//		Thread.sleep(2500);
//		driver.close();
//		driver.quit();
//	    
//	}

}
