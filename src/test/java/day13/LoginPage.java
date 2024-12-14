package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	// Every page object class contains constructor, locators and actions
	
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	
	public void setUserName(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	
	
}
