package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {
	
	WebDriver driver;
	@FindBy(id = "logout")
	WebElement btn_Logout;
	
	public homePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chkLogout() {
		btn_Logout.isDisplayed();
	}

}
