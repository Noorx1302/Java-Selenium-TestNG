package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactory {
	
	WebDriver driver;
	
	LoginPageUsingPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement loginButton;
	
	public void setUserName(String name) {
		username.sendKeys(name);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	
}
