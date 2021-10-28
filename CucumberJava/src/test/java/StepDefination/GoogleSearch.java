package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		
	    
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://google.com");
	    
	}

	@When("user enter text in searchbox")
	public void user_enter_text_in_searchbox() {
	
	  
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step by step");
	}

	@And("click on search button")
	public void click_on_search_button() 
	{
		driver.findElement(By.xpath("//div/center/input[@value='Google Search']")).click();
	    
	}

	@Then("result should be displayed")
	public void result_should_be_displayed() {
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
	    
	}

}
