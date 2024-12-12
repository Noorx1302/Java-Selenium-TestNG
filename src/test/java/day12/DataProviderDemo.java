package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String userName, String password) {
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/v1/inventory.html");
		
		
		
	}
	
	@AfterClass
	void tearDow() {
		driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
		driver.close();
		
		
	}
	
	@DataProvider(name = "dp", indices = {0, 2, 3})
	Object[][] loginData() {
		Object data[][] = {
				{" ", " "}, 
				{"standard_user", "secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"aaa", "vvv"},
				{"problem_user", "secret_sauce"}
		};
			
		return data;
	

	}
}

