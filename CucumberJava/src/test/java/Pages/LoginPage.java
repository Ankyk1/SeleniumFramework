package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	
	private By txt_username = By.id("name");
	private By txt_password = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;	
	if(!driver.getTitle().equals("TestProject Demo")) {
		throw new IllegalStateException("Not correct page"+driver.getCurrentUrl());
	}
	}
	
	public void enterUser(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickBtn() {
		
		driver.findElement(btn_login).click();
	}

	public void chkLogout() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
}
